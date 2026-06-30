package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public class TipsInfoLogTable extends com.tencent.tmassistantsdk.storage.table.BaseLogTable {
    public static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists TipsInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
    protected static final java.lang.String SQL_INSERT = "INSERT INTO TipsInfoLogData logData = ?";
    public static final java.lang.String TABLE_NAME = "TipsInfoLogData";
    protected static com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable mInstance;

    public static synchronized com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable getInstance() {
        com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable tipsInfoLogTable;
        synchronized (com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable();
            }
            tipsInfoLogTable = mInstance;
        }
        return tipsInfoLogTable;
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
        return SQL_INSERT;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.BaseLogTable
    public java.lang.String getTableName() {
        return TABLE_NAME;
    }
}
