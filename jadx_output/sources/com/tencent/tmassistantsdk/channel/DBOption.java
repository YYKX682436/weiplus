package com.tencent.tmassistantsdk.channel;

/* loaded from: classes13.dex */
public class DBOption {
    protected static final java.lang.String CREATE_TABLE_SQL = "CREATE TABLE if not exists channeldata( itemId INTEGER PRIMARY KEY AUTOINCREMENT, itemData BLOB);";
    protected static final int DATEBASE_VERSION = 1;
    protected static final java.lang.String DB_NAME = ".SystemConfig.db";
    protected static final java.lang.String QUERY_ALL_SQL = "select * from channeldata";
    protected static final java.lang.String TABLE_NAME = "channeldata";
    protected java.lang.String DB_PATH;

    public DBOption() {
        this.DB_PATH = "";
        java.lang.String str = lp0.b.D() + "/assistant/";
        this.DB_PATH = str;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            m17.f213266a.r(m17.f213267b);
        }
        this.DB_PATH += DB_NAME;
    }

    private void checkAndCreateTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        int version = sQLiteDatabase.getVersion();
        if (version != 1) {
            sQLiteDatabase.beginTransaction();
            if (version == 0) {
                try {
                    sQLiteDatabase.execSQL(CREATE_TABLE_SQL);
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            sQLiteDatabase.setVersion(1);
            sQLiteDatabase.setTransactionSuccessful();
        }
    }

    private void closeDB(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.close();
        } catch (java.lang.Exception unused) {
        }
    }

    private synchronized android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.DB_PATH);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            return null;
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        for (int i17 = 0; i17 < 20; i17++) {
            try {
                sQLiteDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(com.tencent.mm.vfs.w6.i(this.DB_PATH, true), null, 1);
            } catch (android.database.sqlite.SQLiteException unused) {
            }
            if (sQLiteDatabase != null) {
                break;
            }
            android.os.SystemClock.sleep(50L);
        }
        return sQLiteDatabase;
    }

    private android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        int i17 = 0;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        while (true) {
            if (i17 >= 20) {
                break;
            }
            try {
                sQLiteDatabase = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(com.tencent.mm.vfs.w6.i(this.DB_PATH, true), (android.database.sqlite.SQLiteDatabase.CursorFactory) null);
            } catch (android.database.sqlite.SQLiteException unused) {
            }
            if (sQLiteDatabase != null) {
                checkAndCreateTable(sQLiteDatabase);
                break;
            }
            android.os.SystemClock.sleep(50L);
            i17++;
        }
        return sQLiteDatabase;
    }

    public boolean delete(long j17) {
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase == null) {
            return false;
        }
        writableDatabase.delete(TABLE_NAME, "itemId=?", new java.lang.String[]{j17 + ""});
        closeDB(writableDatabase);
        return true;
    }

    public long insert(com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem tMAssistantSDKChannelDataItem) {
        byte[] buffer;
        android.database.sqlite.SQLiteDatabase writableDatabase;
        if (tMAssistantSDKChannelDataItem == null || (buffer = tMAssistantSDKChannelDataItem.getBuffer()) == null || (writableDatabase = getWritableDatabase()) == null) {
            return -1L;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("itemData", buffer);
        long insert = writableDatabase.insert(TABLE_NAME, "", contentValues);
        closeDB(writableDatabase);
        return insert;
    }

    public java.util.ArrayList<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> queryAll() {
        android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
        java.util.ArrayList<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> arrayList = null;
        if (readableDatabase != null) {
            android.database.Cursor rawQuery = readableDatabase.rawQuery(QUERY_ALL_SQL, null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                int columnIndex = rawQuery.getColumnIndex("itemId");
                int columnIndex2 = rawQuery.getColumnIndex("itemData");
                java.util.ArrayList<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> arrayList2 = new java.util.ArrayList<>();
                do {
                    int i17 = rawQuery.getInt(columnIndex);
                    com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem dataItemFromByte = com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem.getDataItemFromByte(rawQuery.getBlob(columnIndex2));
                    if (dataItemFromByte != null) {
                        dataItemFromByte.mDBIdentity = i17;
                        arrayList2.add(dataItemFromByte);
                    }
                } while (rawQuery.moveToNext());
                closeDB(readableDatabase);
                arrayList = arrayList2;
            }
            rawQuery.close();
            closeDB(readableDatabase);
        }
        return arrayList;
    }
}
