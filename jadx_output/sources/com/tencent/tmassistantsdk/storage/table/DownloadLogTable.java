package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public class DownloadLogTable extends com.tencent.tmassistantsdk.storage.table.BaseLogTable {
    public static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
    protected static final java.lang.String SQL_INSERT = "INSERT INTO downloadLogData logData = ?";
    public static final java.lang.String TABLE_NAME = "downloadLogData";
    protected static com.tencent.tmassistantsdk.storage.table.DownloadLogTable mInstance;

    public static synchronized com.tencent.tmassistantsdk.storage.table.DownloadLogTable getInstance() {
        com.tencent.tmassistantsdk.storage.table.DownloadLogTable downloadLogTable;
        synchronized (com.tencent.tmassistantsdk.storage.table.DownloadLogTable.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.storage.table.DownloadLogTable();
            }
            downloadLogTable = mInstance;
        }
        return downloadLogTable;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String[] getAlterSQL(int i17) {
        return new java.lang.String[]{getCreateTableSQL()};
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getCreateTableSQL() {
        return CREATE_TABLE_SQL;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getInsertSQL() {
        return SQL_INSERT;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getTableName() {
        return TABLE_NAME;
    }
}
