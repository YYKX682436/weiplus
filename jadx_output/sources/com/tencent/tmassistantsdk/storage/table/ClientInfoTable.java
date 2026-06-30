package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public class ClientInfoTable implements com.tencent.tmassistantsdk.storage.table.ITableBase {
    public static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists clientinfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, clientId TEXT , taskId INTEGER, taskUrl TEXT);";
    public static final java.lang.String QUERY_CLIENTINFO = "select * from clientinfo where clientId = ?";
    public static final java.lang.String QUERY_CLIENTINFO_ALL = "select * from clientinfo";
    public static final java.lang.String TABLE_NAME = "clientinfo";
    private static final java.lang.String TAG = "ClientInfoTable";

    /* loaded from: classes6.dex */
    public class Columns {
        public static final java.lang.String CLIENTID = "clientId";
        public static final java.lang.String TASKID = "taskId";
        public static final java.lang.String TASKURL = "taskUrl";

        public Columns() {
        }
    }

    private static com.tencent.tmassistantsdk.storage.model.ClientInfo cursor2object(android.database.Cursor cursor) {
        com.tencent.tmassistantsdk.storage.model.ClientInfo clientInfo = new com.tencent.tmassistantsdk.storage.model.ClientInfo();
        clientInfo.clientId = cursor.getString(cursor.getColumnIndex(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID));
        clientInfo.taskId = cursor.getInt(cursor.getColumnIndex("taskId"));
        clientInfo.taskUrl = cursor.getString(cursor.getColumnIndex("taskUrl"));
        return clientInfo;
    }

    public static void delete(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete(TABLE_NAME, "clientId = ? and taskUrl = ?", new java.lang.String[]{str, str2});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public static void deleteItemsByURL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete(TABLE_NAME, "taskUrl = ?", new java.lang.String[]{str});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    private static void fillValues(android.content.ContentValues contentValues, com.tencent.tmassistantsdk.storage.model.ClientInfo clientInfo) {
        if (clientInfo != null) {
            contentValues.put(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID, clientInfo.clientId);
            contentValues.put("taskId", java.lang.Integer.valueOf(clientInfo.taskId));
            contentValues.put("taskUrl", clientInfo.taskUrl);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r6.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r1.add(cursor2object(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r6.moveToNext() != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.tencent.tmassistantsdk.storage.model.ClientInfo> query(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L56
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            java.lang.String r3 = "select * from clientinfo where clientId = ?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            android.database.Cursor r6 = r2.rawQuery(r3, r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            if (r6 == 0) goto L32
            boolean r2 = r6.moveToFirst()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            if (r2 == 0) goto L32
        L22:
            com.tencent.tmassistantsdk.storage.model.ClientInfo r2 = cursor2object(r6)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            r1.add(r2)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            boolean r2 = r6.moveToNext()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            if (r2 != 0) goto L22
            goto L32
        L30:
            r1 = move-exception
            goto L3f
        L32:
            if (r6 == 0) goto L37
            r6.close()
        L37:
            return r1
        L38:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L50
        L3d:
            r1 = move-exception
            r6 = r0
        L3f:
            java.lang.String r2 = "ClientInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4f
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L56
            r6.close()
            goto L56
        L4f:
            r0 = move-exception
        L50:
            if (r6 == 0) goto L55
            r6.close()
        L55:
            throw r0
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.ClientInfoTable.query(java.lang.String):java.util.ArrayList");
    }

    public static void save(com.tencent.tmassistantsdk.storage.model.ClientInfo clientInfo) {
        if (clientInfo != null) {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase();
                if (update(clientInfo, writableDatabase) <= 0) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    fillValues(contentValues, clientInfo);
                    writableDatabase.insert(TABLE_NAME, null, contentValues);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }

    private static int update(com.tencent.tmassistantsdk.storage.model.ClientInfo clientInfo, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (clientInfo == null) {
            return -1;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            fillValues(contentValues, clientInfo);
            int update = sQLiteDatabase.update(TABLE_NAME, contentValues, "clientId = ? and taskUrl = ?", new java.lang.String[]{clientInfo.clientId, clientInfo.taskUrl});
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

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r6.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        r1 = new android.content.ContentValues();
        fillValues(r1, cursor2object(r6));
        r7.insert(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.TABLE_NAME, null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6.moveToNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        r7.setTransactionSuccessful();
        r7.endTransaction();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dataMovement(android.database.sqlite.SQLiteDatabase r6, android.database.sqlite.SQLiteDatabase r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L58
            if (r6 == 0) goto L58
            r7.beginTransaction()
            r0 = 0
            java.lang.String r1 = "select * from clientinfo"
            android.database.Cursor r6 = r6.rawQuery(r1, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r6 == 0) goto L30
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            if (r1 == 0) goto L30
        L16:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            com.tencent.tmassistantsdk.storage.model.ClientInfo r2 = cursor2object(r6)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            fillValues(r1, r2)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            java.lang.String r2 = "clientinfo"
            r7.insert(r2, r0, r1)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            boolean r1 = r6.moveToNext()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            if (r1 != 0) goto L16
            goto L30
        L2e:
            r0 = move-exception
            goto L3c
        L30:
            if (r6 == 0) goto L49
        L32:
            r6.close()
            goto L49
        L36:
            r7 = move-exception
            goto L52
        L38:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L3c:
            java.lang.String r1 = "ClientInfoTable"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L50
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L49
            goto L32
        L49:
            r7.setTransactionSuccessful()
            r7.endTransaction()
            goto L58
        L50:
            r7 = move-exception
            r0 = r6
        L52:
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r7
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.ClientInfoTable.dataMovement(android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteDatabase):void");
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

    public static void save(java.lang.String str, java.lang.String str2) {
        com.tencent.tmassistantsdk.storage.model.ClientInfo clientInfo = new com.tencent.tmassistantsdk.storage.model.ClientInfo();
        clientInfo.clientId = str;
        clientInfo.taskUrl = str2;
        save(clientInfo);
    }
}
