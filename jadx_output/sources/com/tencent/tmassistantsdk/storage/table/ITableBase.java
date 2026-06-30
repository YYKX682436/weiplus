package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public interface ITableBase {
    java.lang.String createTableSQL();

    void dataMovement(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteDatabase sQLiteDatabase2);

    java.lang.String[] getAlterSQL(int i17, int i18);

    com.tencent.tmassistantsdk.storage.helper.SqliteHelper getHelper();

    java.lang.String tableName();
}
