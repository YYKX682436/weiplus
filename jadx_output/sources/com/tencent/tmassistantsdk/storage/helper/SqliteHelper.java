package com.tencent.tmassistantsdk.storage.helper;

/* loaded from: classes13.dex */
public abstract class SqliteHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String TAG = "MicroMsg.SqliteHelper";

    public SqliteHelper(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        super(context, str, cursorFactory, i17);
    }

    private void createTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.tencent.tmassistantsdk.util.TMLog.i("sqliteHelper", "tables count:" + getTables().length);
        for (java.lang.Class<?> cls : getTables()) {
            try {
                com.tencent.tmassistantsdk.storage.table.ITableBase iTableBase = (com.tencent.tmassistantsdk.storage.table.ITableBase) cls.newInstance();
                java.lang.String createTableSQL = iTableBase.createTableSQL();
                if (createTableSQL != null && createTableSQL.length() > 0) {
                    sQLiteDatabase.execSQL(createTableSQL);
                }
                com.tencent.tmassistantsdk.util.TMLog.i("sqliteHelper", "sql=" + createTableSQL);
                if (com.tencent.tmassistantsdk.util.GlobalUtil.isDBExist(com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper.DB_NAME)) {
                    com.tencent.tmassistantsdk.util.TMLog.i("sqliteHelper", "dataMovement");
                    iTableBase.dataMovement(com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper.getInstance().getReadableDatabase(), sQLiteDatabase);
                }
            } catch (java.lang.IllegalAccessException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            } catch (java.lang.InstantiationException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            }
        }
        com.tencent.tmassistantsdk.util.GlobalUtil.deleteOldDB(com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper.DB_NAME);
    }

    private void deleteTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        for (java.lang.Class<?> cls : getTables()) {
            try {
                sQLiteDatabase.delete(((com.tencent.tmassistantsdk.storage.table.ITableBase) cls.newInstance()).tableName(), null, null);
            } catch (java.lang.IllegalAccessException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            } catch (java.lang.InstantiationException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            }
        }
    }

    public abstract int getDBVersion();

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getReadableDatabase();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            sQLiteDatabase = null;
        }
        while (true) {
            if (sQLiteDatabase.isDbLockedByCurrentThread() || sQLiteDatabase.isDbLockedByOtherThreads()) {
                android.os.SystemClock.sleep(10L);
            }
        }
        return sQLiteDatabase;
    }

    public abstract java.lang.Class<?>[] getTables();

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            sQLiteDatabase = null;
        }
        while (true) {
            if (sQLiteDatabase.isDbLockedByCurrentThread() || sQLiteDatabase.isDbLockedByOtherThreads()) {
                android.os.SystemClock.sleep(10L);
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        deleteTable(sQLiteDatabase);
        createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        com.tencent.tmassistantsdk.util.TMLog.i("sqliteHelper", " dbversion:" + version + " newVersion:" + getDBVersion());
        if (version == 0) {
            return;
        }
        if (version < getDBVersion()) {
            onUpgrade(sQLiteDatabase, version, getDBVersion());
        } else if (version > getDBVersion()) {
            onDowngrade(sQLiteDatabase, version, getDBVersion());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        while (i17 < i18) {
            for (java.lang.Class<?> cls : getTables()) {
                try {
                    java.lang.String[] alterSQL = ((com.tencent.tmassistantsdk.storage.table.ITableBase) cls.newInstance()).getAlterSQL(i17, i17 + 1);
                    com.tencent.tmassistantsdk.util.TMLog.i("sqliteHelper", " upgrade:" + alterSQL);
                    if (alterSQL != null) {
                        for (java.lang.String str : alterSQL) {
                            sQLiteDatabase.execSQL(str);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                }
            }
            i17++;
        }
    }
}
