package com.cnnet.otc.health.bluetooth;

import android.content.Context;
import android.widget.TextView;

import com.HBuilder.integrate.R;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;

/**
 * Custom implementation of the MarkerView.
 *
 */
public class MyMarkerView extends MarkerView {

    private TextView tvContent;

    public MyMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);

        tvContent = (TextView) findViewById(R.id.tvContent);
    }

    // callbacks everytime the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    @Override
    public void refreshContent(Entry e, Highlight highlight) {

        System.out.println(" val() ----------- " + e.getVal());
        if (e instanceof CandleEntry) {

            CandleEntry ce = (CandleEntry) e;
            System.out.println(" ce.getHigh()----------- " + e.getVal());
            tvContent.setText("" + Utils.formatNumber(ce.getHigh(), 0, true));
        } else {
            tvContent.setText("" + e.getVal());
            System.out.println("getVal");
            //tvContent.setText("" + Utils.formatNumber(e.getVal(), 0, true));
        }
    }

    @Override
    public int getXOffset(float xpos) {
        // this will center the marker-view horizontally
        return -(getWidth() / 2);
    }

    @Override
    public int getYOffset(float ypos) {
        // this will cause the marker-view to be above the selected value
        return -getHeight();
    }
}