package com.tencent.tmassistantsdk.storage.table;

/* loaded from: classes13.dex */
public class DownloadInfoTable implements com.tencent.tmassistantsdk.storage.table.ITableBase {
    public static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";
    public static final java.lang.String QUERY_ALL = "select * from downloadInfo";
    public static final java.lang.String QUERY_DOWNLOADINFO_URL = "select * from downloadInfo where taskUrl = ?";
    public static final java.lang.String QUERY_UNFINISHED_TASK = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)";
    public static final java.lang.String TABLE_NAME = "downloadInfo";
    private static final java.lang.String TAG = "DownloadInfoTable";

    public static void add(com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase();
                if (update(downloadInfo, writableDatabase) <= 0) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    com.tencent.tmassistantsdk.downloadservice.DownloadInfo.writeToContentValues(contentValues, downloadInfo);
                    writableDatabase.insert(TABLE_NAME, null, contentValues);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void del(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete(TABLE_NAME, "taskUrl = ?", new java.lang.String[]{str});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r0.add(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromCursor(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2.moveToNext() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> load() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2 = 0
            java.lang.String r3 = "select * from downloadInfo"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 == 0) goto L29
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r1 == 0) goto L29
        L1c:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r1 = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromCursor(r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r0.add(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r1 != 0) goto L1c
        L29:
            if (r2 == 0) goto L2e
            r2.close()
        L2e:
            return r0
        L2f:
            r0 = move-exception
            goto L42
        L31:
            r1 = move-exception
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2f
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L41
            r2.close()
        L41:
            return r0
        L42:
            if (r2 == 0) goto L47
            r2.close()
        L47:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.load():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r6 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r6.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.tmassistantsdk.downloadservice.DownloadInfo query(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L4e
            int r1 = r6.length()
            if (r1 <= 0) goto L4e
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r2 = "select * from downloadInfo where taskUrl = ?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            android.database.Cursor r6 = r1.rawQuery(r2, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            if (r6 == 0) goto L2d
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L47
            if (r1 == 0) goto L2d
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r0 = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromCursor(r6)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L47
            r6.close()
            return r0
        L2b:
            r1 = move-exception
            goto L37
        L2d:
            if (r6 == 0) goto L4e
            goto L43
        L30:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L48
        L35:
            r1 = move-exception
            r6 = r0
        L37:
            java.lang.String r2 = "DownloadInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L47
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L4e
        L43:
            r6.close()
            goto L4e
        L47:
            r0 = move-exception
        L48:
            if (r6 == 0) goto L4d
            r6.close()
        L4d:
            throw r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.query(java.lang.String):com.tencent.tmassistantsdk.downloadservice.DownloadInfo");
    }

    public static void save(java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> arrayList) {
        if (arrayList != null) {
            android.database.sqlite.SQLiteDatabase writableDatabase = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance().getWritableDatabase();
            try {
                try {
                    writableDatabase.beginTransaction();
                    java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.tmassistantsdk.downloadservice.DownloadInfo next = it.next();
                        if (update(next, writableDatabase) <= 0) {
                            android.content.ContentValues contentValues = new android.content.ContentValues();
                            com.tencent.tmassistantsdk.downloadservice.DownloadInfo.writeToContentValues(contentValues, next);
                            writableDatabase.insert(TABLE_NAME, null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    private static int update(com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (downloadInfo == null) {
            return -1;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo.writeToContentValues(contentValues, downloadInfo);
            int update = sQLiteDatabase.update(TABLE_NAME, contentValues, "taskUrl = ?", new java.lang.String[]{downloadInfo.mURL});
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        r8.setTransactionSuccessful();
        r8.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r7 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r7.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dataMovement(android.database.sqlite.SQLiteDatabase r7, android.database.sqlite.SQLiteDatabase r8) {
        /*
            r6 = this;
            java.lang.String r0 = "downloadInfo"
            if (r8 == 0) goto L62
            if (r7 == 0) goto L62
            r8.beginTransaction()
            r1 = 0
            java.lang.String r2 = "select * from downloadInfo"
            android.database.Cursor r7 = r7.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r7 == 0) goto L35
            boolean r2 = r7.moveToFirst()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            if (r2 == 0) goto L35
            java.lang.String r2 = "start move data!"
            com.tencent.tmassistantsdk.util.TMLog.i(r0, r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
        L1d:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromSimpleCursor(r7)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo.writeToContentValues(r2, r3)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            r8.insert(r0, r1, r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            boolean r2 = r7.moveToNext()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            if (r2 != 0) goto L1d
            goto L35
        L33:
            r1 = move-exception
            goto L41
        L35:
            if (r7 == 0) goto L53
        L37:
            r7.close()
            goto L53
        L3b:
            r8 = move-exception
            goto L5c
        L3d:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L41:
            java.lang.String r2 = "DownloadInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5a
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "move data exception!"
            com.tencent.tmassistantsdk.util.TMLog.i(r0, r1)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L53
            goto L37
        L53:
            r8.setTransactionSuccessful()
            r8.endTransaction()
            goto L62
        L5a:
            r8 = move-exception
            r1 = r7
        L5c:
            if (r1 == 0) goto L61
            r1.close()
        L61:
            throw r8
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.dataMovement(android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public java.lang.String[] getAlterSQL(int i17, int i18) {
        return (i17 == 1 && i18 == 2) ? new java.lang.String[]{"alter table downloadInfo add column headerParams TEXT;"} : new java.lang.String[]{"alter table downloadInfo add column netType TEXT;", "alter table downloadInfo add column downloadFailedErrCode INTEGER;", "alter table downloadInfo add column downloadFailedTime INTEGER;"};
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public com.tencent.tmassistantsdk.storage.helper.SqliteHelper getHelper() {
        return com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance();
    }

    @Override // com.tencent.tmassistantsdk.storage.table.ITableBase
    public java.lang.String tableName() {
        return TABLE_NAME;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r1 = r2.getString(r2.getColumnIndex(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID));
        r3 = r2.getString(r2.getColumnIndex("taskUrl"));
        r4 = r2.getInt(r2.getColumnIndex("status"));
        r5 = new com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask(r1, r3);
        r5.mState = r4;
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r2.moveToNext() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> query() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2 = 0
            java.lang.String r3 = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            if (r2 == 0) goto L4a
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            if (r1 == 0) goto L4a
        L1c:
            java.lang.String r1 = "clientId"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r3 = "taskUrl"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r4 = "status"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            int r4 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask r5 = new com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r5.mState = r4     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r0.add(r5)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            if (r1 != 0) goto L1c
        L4a:
            if (r2 == 0) goto L4f
            r2.close()
        L4f:
            return r0
        L50:
            r0 = move-exception
            goto L63
        L52:
            r1 = move-exception
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L50
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L62
            r2.close()
        L62:
            return r0
        L63:
            if (r2 == 0) goto L68
            r2.close()
        L68:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.query():java.util.ArrayList");
    }
}
