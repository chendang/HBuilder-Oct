package com.cnnet.otc.health.bean.data;

import android.content.Context;
import android.util.Log;

import com.HBuilder.integrate.R;
import com.cnnet.otc.health.bean.RecordItem;
import com.cnnet.otc.health.comm.CommConst;
import com.cnnet.otc.health.comm.SysApp;
import com.cnnet.otc.health.db.DBHelper;
import com.cnnet.otc.health.db.MyDBManager;
import com.cnnet.otc.health.events.BleEvent;
import com.cnnet.otc.health.interfaces.MyCommData;
import com.cnnet.otc.health.util.ToastUtil;
import com.cnnet.otc.health.views.MyLineChartView;

import java.util.List;

import de.greenrobot.event.EventBus;

/**
 * 血氧饱和度
 * Created by SZ512 on 2016/1/21.
 */
public class OximetryData implements MyCommData {

    private final String TAG = "OximetryData";

    private Context ctx;
    /**
     * 绘图对象
     */
    private MyLineChartView myLineView;
    /**
     * 本地检查记录ID
     */
    private long nativeRecordId;
    private String mUniqueKey = null;
    /**
     * 血氧数据字段: 血氧饱和度
     */
    public static final String DATA_SPO2 = "SpO2";
    /**
     * 血氧数据字段： 脉率
     */
    public static final String DATA_PR = "PR";
    /**
     * 血氧数据字段: 灌注指数
     */
    public static final String DATA_PI = "PI";

    private final int OXIM_DATA_LENGTH = 10;

    private byte spo2,pi ,pr;
    private byte d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11;
    private byte [] Data = new byte[10];
    private int todoDisconnected_failed, todoDisconnected ;
    private boolean cloudSample = false;

    public OximetryData(Context ctx, MyLineChartView myLineView, long nativeRecordId,String mUniqueKey) {
        this.myLineView = myLineView;
        this.ctx = ctx;
        this.nativeRecordId = nativeRecordId;
        this.mUniqueKey=mUniqueKey;
    }

    @Override
    public void todo(byte[] data) {
        if (data.length == OXIM_DATA_LENGTH)
        {
			/*pr, pi, spo2*/
            pr =data[6];
            spo2 = data[7];
            pi = data[8];
            Log.d(TAG, "onCharacteristicChanged_characteristic : " + data[7] + "_" + data[8] + "_" + data[6]);

            Log.d(TAG, "OximetryData spo2 pi, pr ---- " + data[7] + "_" + data[8] + "_" + data[6]);
        }
        else
        {
            d1 =data[5]; d2 =data[6]; d3 =data[7]; d4 =data[8]; d5 =data[9]; d6 =data[10]; d7 =data[11];
            d8 =data[12];d9 =data[13];d10 =data[14];d11=data[15];
			/*D0 ... D10*/
            int j =15;
            for(int i = 0 ; i<10;i++){
                Data [i]=data[j--];
            }
            Log.d(TAG, "OximetryData D0 ... D10 ---- " + data[5] + "_" + data[6] + "_" + data[7]+ "_" + data[8]+ "_" + data[9]+ "_" + data[10]+ "_" + data[11]+ "_" + data[12]+ "_" + data[13]+ "_" + data[14]+ "_" + data[15]);

            Log.d(TAG, "onCharacteristicChanged_characteristic : " + data[5] + "_" + data[6] + "_" + data[7]+ "_" + data[8]+ "_" + data[9]+ "_" + data[10]+ "_" + data[11]+ "_" + data[12]+ "_" + data[13]+ "_" + data[14]+ "_" + data[15]);
        }
    }

    @Override
    public void todoConnected() {
//		todoConnected=2;
        Log.d(TAG, "todoConnected");
    }

    @Override
    public void todoDisconnected() {
        todoDisconnected=0;
        Log.d(TAG, "todoDisconnected");
    }

    @Override
    public void todoConnecting() {
//		todoConnected=1;
        Log.d(TAG, "todoConnecting");
    }

    @Override
    public void todoDisconnected_failed() {
        todoDisconnected_failed=3;
        Log.d(TAG, "todoDisconnected_failed");
    }

    @Override
    public List<RecordItem>[] getRecordList(String mUniqueKey) {
        List<RecordItem>[] lists = new List[3];
        lists[0] = SysApp.getMyDBManager().getListByReorcdId(mUniqueKey, DATA_SPO2);
        lists[1] = SysApp.getMyDBManager().getListByReorcdId(mUniqueKey, DATA_PI);
        lists[2] = SysApp.getMyDBManager().getListByReorcdId(mUniqueKey, DATA_PR);
        return lists;
    }

    @Override
    public List<RecordItem> getRecordAllList(String mUniqueKey) {
        return SysApp.getMyDBManager().getRecordAllInfoByType(mUniqueKey,DATA_SPO2, DATA_PI, DATA_PR);
    }

    @Override
    public String[] getInsName() {
        return new String[]{"血氧饱和度(%)", "灌注指数(%)", "脉率(bpm)"};
    }

    @Override
    public String[] getInsUnit() {
        return new String[]{"", "", ""};
    }

    @Override
    public int[] getInsRange() {
        return new int[]{1, 2, 1};
    }


    @Override
    public void refreshRealTime() {
        if(getdata() != null) {
            /*for (int i = getdata().length - 1; i >= 0; i--) {
//                EventBus.getDefault().post(new BleEvent(CommConst.FLAG_REFRESH_REAL_TIME_DATA, getdata()[i]));
                myLineView.refreshRealTimeView(getdata()[i]);
            }*/
            myLineView.refreshRealTimeByMP(getdata());
        }

    }

    @Override
    public boolean refreshData() {
        String display = null;
        String spo2 = String.valueOf(getSpo2());
        if(getSpo2() == 127 && getPr() == 127 && getPi() == 127) {
            cloudSample = false;
            display = "SpO2:---%  PR:---bpm  PI:---%";
        } else {
            if (getSpo2() <= 0 | getSpo2() > 100) {  //血氧有效值
                spo2 = "---";
                cloudSample = false;
            } else {
                cloudSample = true;
            }
            spo2 += "%";
            Log.d(TAG, "SPO2 : {} " + spo2);
            String pr = String.valueOf(getPr());  //脉率
            if (getPr() <= 0 | getPr() > 254) {
                pr = "---";
                cloudSample = false;
            } else {
                cloudSample = true;
            }
            pr += "bpm";
            Log.d(TAG, "PR : {} " + pr);
            float a = (float) getPi() / 10;
            String pi = String.valueOf(a);           //灌注指数
            if (a <= 0 | a > 100) {
//            PI.setText("PI:---%");
                pi = "---";
                cloudSample = false;
            } else {
                cloudSample = true;
            }
            pi += "%";
            Log.d(TAG, "PI : {} " + pi);
            display = "SpO2:" + spo2 + "  PR:" + pr + "  PI:" + pi ;
        }

        EventBus.getDefault().post(new BleEvent(CommConst.FLAG_BLE_CONNECT_UPDATE_STATE, display));
        Log.i(TAG, "display --- " + display);

        //SPO2.invalidate();
        //PR.invalidate();
        //PI.invalidate();
        return cloudSample;
    }

    /**
     * 保存采集的结果
     * @return
     */
    public boolean saveSampleInfo() {
        refreshData();
        if(cloudSample) {
            int checkType = SysApp.check_type.ordinal();
            MyDBManager dbManager = SysApp.getMyDBManager();
            dbManager.addWaitForInspector(nativeRecordId,mUniqueKey,mUniqueKey,mUniqueKey);
            dbManager.addRecordItem(nativeRecordId, DATA_SPO2, getSpo2(), DBHelper.RI_SOURCE_DEVICE, SysApp.btDevice.getAddress(), checkType);
            dbManager.addRecordItem(nativeRecordId, DATA_PI, (getPi() / 10), DBHelper.RI_SOURCE_DEVICE, SysApp.btDevice.getAddress(), checkType);
            dbManager.addRecordItem(nativeRecordId, DATA_PR, getPr(), DBHelper.RI_SOURCE_DEVICE, SysApp.btDevice.getAddress(), checkType);
            return true;
        } else {
            ToastUtil.TextToast(ctx, R.string.sample_error, 2000);
        }
        return false;
    }


    public int getdisconnected_failed(){
        return todoDisconnected_failed;
    }

    public int getdisconnect(){
        return todoDisconnected;

    }
    public int getSpo2(){
        int i = spo2&0xff;
        return i;
    }

    public int getPr(){
        int i = pr&0xff;
        return i;
    }

    public int getPi(){
        int i = pi&0xff;
        return i;
    }

    public byte[] getdata(){

        return Data;
    }

    public int getdata1(){
        int i = d1&0xff;
        return i;
    }
    public int getdata2(){
        int i = d2&0xff;
        return i;
    }
    public int getdata3(){
        int i = d3&0xff;
        return i;
    }
    public int getdata4(){
        int i = d4&0xff;
        return i;
    }
    public int getdata5(){
        int i = d5&0xff;
        return i;
    }
    public int getdata6(){
        int i = d6&0xff;
        return i;
    }
    public int getdata7(){
        int i = d7&0xff;
        return i;
    }
    public int getdata8(){
        int i = d8&0xff;
        return i;
    }
    public int getdata9(){
        int i = d9&0xff;
        return i;
    }
    public int getdata10(){
        int i = d10&0xff;
        return i;
    }
    public int getdata11(){
        int i = d11&0xff;
        return i;
    }
}
