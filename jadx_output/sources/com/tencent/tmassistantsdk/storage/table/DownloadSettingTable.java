package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public class DownloadSettingTable implements com.tencent.tmassistantsdk.storage.table.ITableBase {
    public static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists settingInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, settingField TEXT , value TEXT,type TEXT);";
    public static final java.lang.String QUERY_SQL = "select * from settingInfo";
    public static final java.lang.String TABLE_NAME = "settingInfo";
    private static final java.lang.String TAG = "DownloadSettingTable";

    /* loaded from: classes6.dex */
    public class Columns {
        public static final java.lang.String SETTINGFIELD = "settingField";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String VALUE = "value";

        public Columns() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> query() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r3 = "select * from settingInfo"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r1 == 0) goto L3d
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r2 == 0) goto L3d
        L1c:
            java.lang.String r2 = "settingField"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r3 = "value"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r2 != 0) goto L1c
            r1.close()
            return r0
        L3d:
            if (r1 == 0) goto L53
        L3f:
            r1.close()
            goto L53
        L43:
            r0 = move-exception
            goto L54
        L45:
            r2 = move-exception
            java.lang.String r3 = "DownloadSettingTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L43
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L53
            goto L3f
        L53:
            return r0
        L54:
            if (r1 == 0) goto L59
            r1.close()
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.query():java.util.HashMap");
    }

    public static void save(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase();
            if (update(str, str2, str3, writableDatabase) <= 0) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put(com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.Columns.SETTINGFIELD, str);
                contentValues.put("value", str2);
                contentValues.put("type", str3);
                writableDatabase.insert(TABLE_NAME, null, contentValues);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    private static int update(java.lang.String str, java.lang.String str2, java.lang.String str3, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (str == null || str2 == null) {
            return -1;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.Columns.SETTINGFIELD, str);
            contentValues.put("value", str2);
            contentValues.put("type", str3);
            int update = sQLiteDatabase.update(TABLE_NAME, contentValues, "settingField = ?", new java.lang.String[]{str});
            if (update > 0) {
                return update;
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return -2;
        }
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public java.lang.String createTableSQL() {
        return CREATE_TABLE_SQL;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public void dataMovement(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteDatabase sQLiteDatabase2) {
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public java.lang.String[] getAlterSQL(int i17, int i18) {
        return null;
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public com.tencent.tmassistantsdk.storage.helper.SqliteHelper getHelper() {
        return com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance();
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public java.lang.String tableName() {
        return TABLE_NAME;
    }
}
