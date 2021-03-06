package io.realm;


import android.util.JsonReader;
import android.util.JsonToken;
import com.cnnet.otc.health.bean.RecordItem;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.ColumnType;
import io.realm.internal.ImplicitTransaction;
import io.realm.internal.LinkView;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Table;
import io.realm.internal.TableOrView;
import io.realm.internal.android.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecordItemRealmProxy extends RecordItem
    implements RealmObjectProxy {

    static final class RecordItemColumnInfo extends ColumnInfo {

        public final long iIdIndex;
        public final long iNativeRecordIdIndex;
        public final long iRecordIdIndex;
        public final long deviceTypeIndex;
        public final long iTypeIndex;
        public final long value1Index;
        public final long sourceIndex;
        public final long iConcluisonIndex;
        public final long desc1Index;
        public final long value2Index;
        public final long value3Index;
        public final long value4Index;
        public final long value5Index;
        public final long createTimeIndex;
        public final long insNameIndex;
        public final long insUnitIndex;
        public final long insValueRangeIndex;
        public final long stateIndex;

        RecordItemColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(18);
            this.iIdIndex = getValidColumnIndex(path, table, "RecordItem", "iId");
            indicesMap.put("iId", this.iIdIndex);

            this.iNativeRecordIdIndex = getValidColumnIndex(path, table, "RecordItem", "iNativeRecordId");
            indicesMap.put("iNativeRecordId", this.iNativeRecordIdIndex);

            this.iRecordIdIndex = getValidColumnIndex(path, table, "RecordItem", "iRecordId");
            indicesMap.put("iRecordId", this.iRecordIdIndex);

            this.deviceTypeIndex = getValidColumnIndex(path, table, "RecordItem", "deviceType");
            indicesMap.put("deviceType", this.deviceTypeIndex);

            this.iTypeIndex = getValidColumnIndex(path, table, "RecordItem", "iType");
            indicesMap.put("iType", this.iTypeIndex);

            this.value1Index = getValidColumnIndex(path, table, "RecordItem", "value1");
            indicesMap.put("value1", this.value1Index);

            this.sourceIndex = getValidColumnIndex(path, table, "RecordItem", "source");
            indicesMap.put("source", this.sourceIndex);

            this.iConcluisonIndex = getValidColumnIndex(path, table, "RecordItem", "iConcluison");
            indicesMap.put("iConcluison", this.iConcluisonIndex);

            this.desc1Index = getValidColumnIndex(path, table, "RecordItem", "desc1");
            indicesMap.put("desc1", this.desc1Index);

            this.value2Index = getValidColumnIndex(path, table, "RecordItem", "value2");
            indicesMap.put("value2", this.value2Index);

            this.value3Index = getValidColumnIndex(path, table, "RecordItem", "value3");
            indicesMap.put("value3", this.value3Index);

            this.value4Index = getValidColumnIndex(path, table, "RecordItem", "value4");
            indicesMap.put("value4", this.value4Index);

            this.value5Index = getValidColumnIndex(path, table, "RecordItem", "value5");
            indicesMap.put("value5", this.value5Index);

            this.createTimeIndex = getValidColumnIndex(path, table, "RecordItem", "createTime");
            indicesMap.put("createTime", this.createTimeIndex);

            this.insNameIndex = getValidColumnIndex(path, table, "RecordItem", "insName");
            indicesMap.put("insName", this.insNameIndex);

            this.insUnitIndex = getValidColumnIndex(path, table, "RecordItem", "insUnit");
            indicesMap.put("insUnit", this.insUnitIndex);

            this.insValueRangeIndex = getValidColumnIndex(path, table, "RecordItem", "insValueRange");
            indicesMap.put("insValueRange", this.insValueRangeIndex);

            this.stateIndex = getValidColumnIndex(path, table, "RecordItem", "state");
            indicesMap.put("state", this.stateIndex);

            setIndicesMap(indicesMap);
        }
    }

    private final RecordItemColumnInfo columnInfo;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("iId");
        fieldNames.add("iNativeRecordId");
        fieldNames.add("iRecordId");
        fieldNames.add("deviceType");
        fieldNames.add("iType");
        fieldNames.add("value1");
        fieldNames.add("source");
        fieldNames.add("iConcluison");
        fieldNames.add("desc1");
        fieldNames.add("value2");
        fieldNames.add("value3");
        fieldNames.add("value4");
        fieldNames.add("value5");
        fieldNames.add("createTime");
        fieldNames.add("insName");
        fieldNames.add("insUnit");
        fieldNames.add("insValueRange");
        fieldNames.add("state");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    RecordItemRealmProxy(ColumnInfo columnInfo) {
        this.columnInfo = (RecordItemColumnInfo) columnInfo;
    }

    @Override
    @SuppressWarnings("cast")
    public long getiId() {
        realm.checkIfValid();
        return (long) row.getLong(columnInfo.iIdIndex);
    }

    @Override
    public void setiId(long value) {
        realm.checkIfValid();
        row.setLong(columnInfo.iIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long getiNativeRecordId() {
        realm.checkIfValid();
        return (long) row.getLong(columnInfo.iNativeRecordIdIndex);
    }

    @Override
    public void setiNativeRecordId(long value) {
        realm.checkIfValid();
        row.setLong(columnInfo.iNativeRecordIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long getiRecordId() {
        realm.checkIfValid();
        return (long) row.getLong(columnInfo.iRecordIdIndex);
    }

    @Override
    public void setiRecordId(long value) {
        realm.checkIfValid();
        row.setLong(columnInfo.iRecordIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int getDeviceType() {
        realm.checkIfValid();
        return (int) row.getLong(columnInfo.deviceTypeIndex);
    }

    @Override
    public void setDeviceType(int value) {
        realm.checkIfValid();
        row.setLong(columnInfo.deviceTypeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String getiType() {
        realm.checkIfValid();
        return (java.lang.String) row.getString(columnInfo.iTypeIndex);
    }

    @Override
    public void setiType(String value) {
        realm.checkIfValid();
        if (value == null) {
            row.setNull(columnInfo.iTypeIndex);
            return;
        }
        row.setString(columnInfo.iTypeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float getValue1() {
        realm.checkIfValid();
        return (float) row.getFloat(columnInfo.value1Index);
    }

    @Override
    public void setValue1(float value) {
        realm.checkIfValid();
        row.setFloat(columnInfo.value1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public short getSource() {
        realm.checkIfValid();
        return (short) row.getLong(columnInfo.sourceIndex);
    }

    @Override
    public void setSource(short value) {
        realm.checkIfValid();
        row.setLong(columnInfo.sourceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String getiConcluison() {
        realm.checkIfValid();
        return (java.lang.String) row.getString(columnInfo.iConcluisonIndex);
    }

    @Override
    public void setiConcluison(String value) {
        realm.checkIfValid();
        if (value == null) {
            row.setNull(columnInfo.iConcluisonIndex);
            return;
        }
        row.setString(columnInfo.iConcluisonIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String getDesc1() {
        realm.checkIfValid();
        return (java.lang.String) row.getString(columnInfo.desc1Index);
    }

    @Override
    public void setDesc1(String value) {
        realm.checkIfValid();
        if (value == null) {
            row.setNull(columnInfo.desc1Index);
            return;
        }
        row.setString(columnInfo.desc1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float getValue2() {
        realm.checkIfValid();
        return (float) row.getFloat(columnInfo.value2Index);
    }

    @Override
    public void setValue2(float value) {
        realm.checkIfValid();
        row.setFloat(columnInfo.value2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float getValue3() {
        realm.checkIfValid();
        return (float) row.getFloat(columnInfo.value3Index);
    }

    @Override
    public void setValue3(float value) {
        realm.checkIfValid();
        row.setFloat(columnInfo.value3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float getValue4() {
        realm.checkIfValid();
        return (float) row.getFloat(columnInfo.value4Index);
    }

    @Override
    public void setValue4(float value) {
        realm.checkIfValid();
        row.setFloat(columnInfo.value4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float getValue5() {
        realm.checkIfValid();
        return (float) row.getFloat(columnInfo.value5Index);
    }

    @Override
    public void setValue5(float value) {
        realm.checkIfValid();
        row.setFloat(columnInfo.value5Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date getCreateTime() {
        realm.checkIfValid();
        if (row.isNull(columnInfo.createTimeIndex)) {
            return null;
        }
        return (java.util.Date) row.getDate(columnInfo.createTimeIndex);
    }

    @Override
    public void setCreateTime(Date value) {
        realm.checkIfValid();
        if (value == null) {
            row.setNull(columnInfo.createTimeIndex);
            return;
        }
        row.setDate(columnInfo.createTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String getInsName() {
        realm.checkIfValid();
        return (java.lang.String) row.getString(columnInfo.insNameIndex);
    }

    @Override
    public void setInsName(String value) {
        realm.checkIfValid();
        if (value == null) {
            row.setNull(columnInfo.insNameIndex);
            return;
        }
        row.setString(columnInfo.insNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String getInsUnit() {
        realm.checkIfValid();
        return (java.lang.String) row.getString(columnInfo.insUnitIndex);
    }

    @Override
    public void setInsUnit(String value) {
        realm.checkIfValid();
        if (value == null) {
            row.setNull(columnInfo.insUnitIndex);
            return;
        }
        row.setString(columnInfo.insUnitIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int getInsValueRange() {
        realm.checkIfValid();
        return (int) row.getLong(columnInfo.insValueRangeIndex);
    }

    @Override
    public void setInsValueRange(int value) {
        realm.checkIfValid();
        row.setLong(columnInfo.insValueRangeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int getState() {
        realm.checkIfValid();
        return (int) row.getLong(columnInfo.stateIndex);
    }

    @Override
    public void setState(int value) {
        realm.checkIfValid();
        row.setLong(columnInfo.stateIndex, value);
    }

    public static Table initTable(ImplicitTransaction transaction) {
        if (!transaction.hasTable("class_RecordItem")) {
            Table table = transaction.getTable("class_RecordItem");
            table.addColumn(ColumnType.INTEGER, "iId", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.INTEGER, "iNativeRecordId", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.INTEGER, "iRecordId", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.INTEGER, "deviceType", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.STRING, "iType", Table.NULLABLE);
            table.addColumn(ColumnType.FLOAT, "value1", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.INTEGER, "source", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.STRING, "iConcluison", Table.NULLABLE);
            table.addColumn(ColumnType.STRING, "desc1", Table.NULLABLE);
            table.addColumn(ColumnType.FLOAT, "value2", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.FLOAT, "value3", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.FLOAT, "value4", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.FLOAT, "value5", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.DATE, "createTime", Table.NULLABLE);
            table.addColumn(ColumnType.STRING, "insName", Table.NULLABLE);
            table.addColumn(ColumnType.STRING, "insUnit", Table.NULLABLE);
            table.addColumn(ColumnType.INTEGER, "insValueRange", Table.NOT_NULLABLE);
            table.addColumn(ColumnType.INTEGER, "state", Table.NOT_NULLABLE);
            table.setPrimaryKey("");
            return table;
        }
        return transaction.getTable("class_RecordItem");
    }

    public static RecordItemColumnInfo validateTable(ImplicitTransaction transaction) {
        if (transaction.hasTable("class_RecordItem")) {
            Table table = transaction.getTable("class_RecordItem");
            if (table.getColumnCount() != 18) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field count does not match - expected 18 but was " + table.getColumnCount());
            }
            Map<String, ColumnType> columnTypes = new HashMap<String, ColumnType>();
            for (long i = 0; i < 18; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final RecordItemColumnInfo columnInfo = new RecordItemColumnInfo(transaction.getPath(), table);

            if (!columnTypes.containsKey("iId")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'iId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("iId") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'long' for field 'iId' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.iIdIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'iId' does support null values in the existing Realm file. Use corresponding boxed type for field 'iId' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("iNativeRecordId")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'iNativeRecordId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("iNativeRecordId") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'long' for field 'iNativeRecordId' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.iNativeRecordIdIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'iNativeRecordId' does support null values in the existing Realm file. Use corresponding boxed type for field 'iNativeRecordId' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("iRecordId")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'iRecordId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("iRecordId") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'long' for field 'iRecordId' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.iRecordIdIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'iRecordId' does support null values in the existing Realm file. Use corresponding boxed type for field 'iRecordId' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("deviceType")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'deviceType' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("deviceType") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'deviceType' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.deviceTypeIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'deviceType' does support null values in the existing Realm file. Use corresponding boxed type for field 'deviceType' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("iType")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'iType' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("iType") != ColumnType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'iType' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.iTypeIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'iType' is required. Either set @Required to field 'iType' or migrate using io.realm.internal.Table.convertColumnToNullable().");
            }
            if (!columnTypes.containsKey("value1")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'value1' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("value1") != ColumnType.FLOAT) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'float' for field 'value1' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.value1Index)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'value1' does support null values in the existing Realm file. Use corresponding boxed type for field 'value1' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("source")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'source' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("source") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'short' for field 'source' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.sourceIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'source' does support null values in the existing Realm file. Use corresponding boxed type for field 'source' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("iConcluison")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'iConcluison' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("iConcluison") != ColumnType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'iConcluison' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.iConcluisonIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'iConcluison' is required. Either set @Required to field 'iConcluison' or migrate using io.realm.internal.Table.convertColumnToNullable().");
            }
            if (!columnTypes.containsKey("desc1")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'desc1' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("desc1") != ColumnType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'desc1' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.desc1Index)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'desc1' is required. Either set @Required to field 'desc1' or migrate using io.realm.internal.Table.convertColumnToNullable().");
            }
            if (!columnTypes.containsKey("value2")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'value2' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("value2") != ColumnType.FLOAT) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'float' for field 'value2' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.value2Index)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'value2' does support null values in the existing Realm file. Use corresponding boxed type for field 'value2' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("value3")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'value3' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("value3") != ColumnType.FLOAT) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'float' for field 'value3' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.value3Index)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'value3' does support null values in the existing Realm file. Use corresponding boxed type for field 'value3' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("value4")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'value4' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("value4") != ColumnType.FLOAT) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'float' for field 'value4' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.value4Index)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'value4' does support null values in the existing Realm file. Use corresponding boxed type for field 'value4' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("value5")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'value5' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("value5") != ColumnType.FLOAT) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'float' for field 'value5' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.value5Index)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'value5' does support null values in the existing Realm file. Use corresponding boxed type for field 'value5' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("createTime")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'createTime' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("createTime") != ColumnType.DATE) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'Date' for field 'createTime' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.createTimeIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'createTime' is required. Either set @Required to field 'createTime' or migrate using io.realm.internal.Table.convertColumnToNullable().");
            }
            if (!columnTypes.containsKey("insName")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'insName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("insName") != ColumnType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'insName' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.insNameIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'insName' is required. Either set @Required to field 'insName' or migrate using io.realm.internal.Table.convertColumnToNullable().");
            }
            if (!columnTypes.containsKey("insUnit")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'insUnit' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("insUnit") != ColumnType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'insUnit' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.insUnitIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'insUnit' is required. Either set @Required to field 'insUnit' or migrate using io.realm.internal.Table.convertColumnToNullable().");
            }
            if (!columnTypes.containsKey("insValueRange")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'insValueRange' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("insValueRange") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'insValueRange' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.insValueRangeIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'insValueRange' does support null values in the existing Realm file. Use corresponding boxed type for field 'insValueRange' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            if (!columnTypes.containsKey("state")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'state' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("state") != ColumnType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'state' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.stateIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'state' does support null values in the existing Realm file. Use corresponding boxed type for field 'state' or migrate using io.realm.internal.Table.convertColumnToNotNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(transaction.getPath(), "The RecordItem class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_RecordItem";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static RecordItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        RecordItem obj = realm.createObject(RecordItem.class);
        if (json.has("iId")) {
            if (json.isNull("iId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field iId to null.");
            } else {
                obj.setiId((long) json.getLong("iId"));
            }
        }
        if (json.has("iNativeRecordId")) {
            if (json.isNull("iNativeRecordId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field iNativeRecordId to null.");
            } else {
                obj.setiNativeRecordId((long) json.getLong("iNativeRecordId"));
            }
        }
        if (json.has("iRecordId")) {
            if (json.isNull("iRecordId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field iRecordId to null.");
            } else {
                obj.setiRecordId((long) json.getLong("iRecordId"));
            }
        }
        if (json.has("deviceType")) {
            if (json.isNull("deviceType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field deviceType to null.");
            } else {
                obj.setDeviceType((int) json.getInt("deviceType"));
            }
        }
        if (json.has("iType")) {
            if (json.isNull("iType")) {
                obj.setiType(null);
            } else {
                obj.setiType((String) json.getString("iType"));
            }
        }
        if (json.has("value1")) {
            if (json.isNull("value1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field value1 to null.");
            } else {
                obj.setValue1((float) json.getDouble("value1"));
            }
        }
        if (json.has("source")) {
            if (json.isNull("source")) {
                throw new IllegalArgumentException("Trying to set non-nullable field source to null.");
            } else {
                obj.setSource((short) json.getInt("source"));
            }
        }
        if (json.has("iConcluison")) {
            if (json.isNull("iConcluison")) {
                obj.setiConcluison(null);
            } else {
                obj.setiConcluison((String) json.getString("iConcluison"));
            }
        }
        if (json.has("desc1")) {
            if (json.isNull("desc1")) {
                obj.setDesc1(null);
            } else {
                obj.setDesc1((String) json.getString("desc1"));
            }
        }
        if (json.has("value2")) {
            if (json.isNull("value2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field value2 to null.");
            } else {
                obj.setValue2((float) json.getDouble("value2"));
            }
        }
        if (json.has("value3")) {
            if (json.isNull("value3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field value3 to null.");
            } else {
                obj.setValue3((float) json.getDouble("value3"));
            }
        }
        if (json.has("value4")) {
            if (json.isNull("value4")) {
                throw new IllegalArgumentException("Trying to set non-nullable field value4 to null.");
            } else {
                obj.setValue4((float) json.getDouble("value4"));
            }
        }
        if (json.has("value5")) {
            if (json.isNull("value5")) {
                throw new IllegalArgumentException("Trying to set non-nullable field value5 to null.");
            } else {
                obj.setValue5((float) json.getDouble("value5"));
            }
        }
        if (json.has("createTime")) {
            if (json.isNull("createTime")) {
                obj.setCreateTime(null);
            } else {
                Object timestamp = json.get("createTime");
                if (timestamp instanceof String) {
                    obj.setCreateTime(JsonUtils.stringToDate((String) timestamp));
                } else {
                    obj.setCreateTime(new Date(json.getLong("createTime")));
                }
            }
        }
        if (json.has("insName")) {
            if (json.isNull("insName")) {
                obj.setInsName(null);
            } else {
                obj.setInsName((String) json.getString("insName"));
            }
        }
        if (json.has("insUnit")) {
            if (json.isNull("insUnit")) {
                obj.setInsUnit(null);
            } else {
                obj.setInsUnit((String) json.getString("insUnit"));
            }
        }
        if (json.has("insValueRange")) {
            if (json.isNull("insValueRange")) {
                throw new IllegalArgumentException("Trying to set non-nullable field insValueRange to null.");
            } else {
                obj.setInsValueRange((int) json.getInt("insValueRange"));
            }
        }
        if (json.has("state")) {
            if (json.isNull("state")) {
                throw new IllegalArgumentException("Trying to set non-nullable field state to null.");
            } else {
                obj.setState((int) json.getInt("state"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    public static RecordItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        RecordItem obj = realm.createObject(RecordItem.class);
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("iId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field iId to null.");
                } else {
                    obj.setiId((long) reader.nextLong());
                }
            } else if (name.equals("iNativeRecordId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field iNativeRecordId to null.");
                } else {
                    obj.setiNativeRecordId((long) reader.nextLong());
                }
            } else if (name.equals("iRecordId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field iRecordId to null.");
                } else {
                    obj.setiRecordId((long) reader.nextLong());
                }
            } else if (name.equals("deviceType")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field deviceType to null.");
                } else {
                    obj.setDeviceType((int) reader.nextInt());
                }
            } else if (name.equals("iType")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    obj.setiType(null);
                } else {
                    obj.setiType((String) reader.nextString());
                }
            } else if (name.equals("value1")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field value1 to null.");
                } else {
                    obj.setValue1((float) reader.nextDouble());
                }
            } else if (name.equals("source")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field source to null.");
                } else {
                    obj.setSource((short) reader.nextInt());
                }
            } else if (name.equals("iConcluison")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    obj.setiConcluison(null);
                } else {
                    obj.setiConcluison((String) reader.nextString());
                }
            } else if (name.equals("desc1")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    obj.setDesc1(null);
                } else {
                    obj.setDesc1((String) reader.nextString());
                }
            } else if (name.equals("value2")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field value2 to null.");
                } else {
                    obj.setValue2((float) reader.nextDouble());
                }
            } else if (name.equals("value3")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field value3 to null.");
                } else {
                    obj.setValue3((float) reader.nextDouble());
                }
            } else if (name.equals("value4")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field value4 to null.");
                } else {
                    obj.setValue4((float) reader.nextDouble());
                }
            } else if (name.equals("value5")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field value5 to null.");
                } else {
                    obj.setValue5((float) reader.nextDouble());
                }
            } else if (name.equals("createTime")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    obj.setCreateTime(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        obj.setCreateTime(new Date(timestamp));
                    }
                } else {
                    obj.setCreateTime(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("insName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    obj.setInsName(null);
                } else {
                    obj.setInsName((String) reader.nextString());
                }
            } else if (name.equals("insUnit")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    obj.setInsUnit(null);
                } else {
                    obj.setInsUnit((String) reader.nextString());
                }
            } else if (name.equals("insValueRange")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field insValueRange to null.");
                } else {
                    obj.setInsValueRange((int) reader.nextInt());
                }
            } else if (name.equals("state")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field state to null.");
                } else {
                    obj.setState((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    public static RecordItem copyOrUpdate(Realm realm, RecordItem object, boolean update, Map<RealmObject,RealmObjectProxy> cache) {
        if (object.realm != null && object.realm.getPath().equals(realm.getPath())) {
            return object;
        }
        return copy(realm, object, update, cache);
    }

    public static RecordItem copy(Realm realm, RecordItem newObject, boolean update, Map<RealmObject,RealmObjectProxy> cache) {
        RecordItem realmObject = realm.createObject(RecordItem.class);
        cache.put(newObject, (RealmObjectProxy) realmObject);
        realmObject.setiId(newObject.getiId());
        realmObject.setiNativeRecordId(newObject.getiNativeRecordId());
        realmObject.setiRecordId(newObject.getiRecordId());
        realmObject.setDeviceType(newObject.getDeviceType());
        realmObject.setiType(newObject.getiType());
        realmObject.setValue1(newObject.getValue1());
        realmObject.setSource(newObject.getSource());
        realmObject.setiConcluison(newObject.getiConcluison());
        realmObject.setDesc1(newObject.getDesc1());
        realmObject.setValue2(newObject.getValue2());
        realmObject.setValue3(newObject.getValue3());
        realmObject.setValue4(newObject.getValue4());
        realmObject.setValue5(newObject.getValue5());
        realmObject.setCreateTime(newObject.getCreateTime());
        realmObject.setInsName(newObject.getInsName());
        realmObject.setInsUnit(newObject.getInsUnit());
        realmObject.setInsValueRange(newObject.getInsValueRange());
        realmObject.setState(newObject.getState());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!isValid()) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RecordItem = [");
        stringBuilder.append("{iId:");
        stringBuilder.append(getiId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{iNativeRecordId:");
        stringBuilder.append(getiNativeRecordId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{iRecordId:");
        stringBuilder.append(getiRecordId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deviceType:");
        stringBuilder.append(getDeviceType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{iType:");
        stringBuilder.append(getiType() != null ? getiType() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value1:");
        stringBuilder.append(getValue1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{source:");
        stringBuilder.append(getSource());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{iConcluison:");
        stringBuilder.append(getiConcluison() != null ? getiConcluison() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc1:");
        stringBuilder.append(getDesc1() != null ? getDesc1() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value2:");
        stringBuilder.append(getValue2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value3:");
        stringBuilder.append(getValue3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value4:");
        stringBuilder.append(getValue4());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value5:");
        stringBuilder.append(getValue5());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createTime:");
        stringBuilder.append(getCreateTime() != null ? getCreateTime() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insName:");
        stringBuilder.append(getInsName() != null ? getInsName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insUnit:");
        stringBuilder.append(getInsUnit() != null ? getInsUnit() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insValueRange:");
        stringBuilder.append(getInsValueRange());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{state:");
        stringBuilder.append(getState());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        String realmName = realm.getPath();
        String tableName = row.getTable().getName();
        long rowIndex = row.getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordItemRealmProxy aRecordItem = (RecordItemRealmProxy)o;

        String path = realm.getPath();
        String otherPath = aRecordItem.realm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;;

        String tableName = row.getTable().getName();
        String otherTableName = aRecordItem.row.getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (row.getIndex() != aRecordItem.row.getIndex()) return false;

        return true;
    }

}
