package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public class UpdateInfoLogTable extends com.tencent.tmassistantsdk.storage.table.BaseLogTable {
    private static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists SelfUpdateInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
    private static final java.lang.String INSERT_SQL = "INSERT INTO SelfUpdateInfoLogData logData = ?";
    private static final java.lang.String TABLE_NAME = "SelfUpdateInfoLogData";
    private static com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable mInstance;

    public static synchronized com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable getInstance() {
        com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable updateInfoLogTable;
        synchronized (com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable();
            }
            updateInfoLogTable = mInstance;
        }
        return updateInfoLogTable;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String[] getAlterSQL(int i17) {
        if (i17 > 1) {
            return new java.lang.String[]{getCreateTableSQL()};
        }
        return null;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getCreateTableSQL() {
        return CREATE_TABLE_SQL;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getInsertSQL() {
        return INSERT_SQL;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getTableName() {
        return TABLE_NAME;
    }
}
