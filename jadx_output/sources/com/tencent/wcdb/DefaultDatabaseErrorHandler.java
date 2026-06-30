package com.tencent.wcdb;

/* loaded from: classes12.dex */
public final class DefaultDatabaseErrorHandler implements com.tencent.wcdb.DatabaseErrorHandler {
    private static final java.lang.String[] SUFFIX_TO_BACKUP = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};
    private static final java.lang.String TAG = "WCDB.DefaultDatabaseErrorHandler";
    private final boolean mNoCorruptionBackup;

    public DefaultDatabaseErrorHandler() {
        this.mNoCorruptionBackup = false;
    }

    private void deleteDatabaseFile(java.lang.String str) {
        if (str.equalsIgnoreCase(com.tencent.wcdb.database.SQLiteDatabaseConfiguration.MEMORY_DB_PATH) || str.trim().length() == 0) {
            return;
        }
        com.tencent.wcdb.support.Log.e(TAG, "Remove database file: ".concat(str));
        int i17 = 0;
        if (this.mNoCorruptionBackup) {
            java.lang.String[] strArr = SUFFIX_TO_BACKUP;
            int length = strArr.length;
            while (i17 < length) {
                deleteFile(str + strArr[i17]);
                i17++;
            }
            return;
        }
        java.io.File file = new java.io.File(str);
        java.io.File file2 = new java.io.File(file.getParentFile(), "corrupted");
        if (!file2.mkdirs()) {
            com.tencent.wcdb.support.Log.e(TAG, "Could not create directory for corrupted database. Corruption backup may be unavailable.");
        }
        java.lang.String str2 = file2.getPath() + "/" + file.getName();
        java.lang.String[] strArr2 = SUFFIX_TO_BACKUP;
        int length2 = strArr2.length;
        while (i17 < length2) {
            java.lang.String str3 = strArr2[i17];
            moveOrDeleteFile(str + str3, str2 + str3);
            i17++;
        }
    }

    private static boolean deleteFile(java.lang.String str) {
        return new java.io.File(str).delete();
    }

    private static boolean moveOrDeleteFile(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        boolean renameTo = file.renameTo(new java.io.File(str2));
        if (!renameTo) {
            file.delete();
        }
        return renameTo;
    }

    @Override // com.tencent.wcdb.DatabaseErrorHandler
    public void onCorruption(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list;
        com.tencent.wcdb.support.Log.e(TAG, "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (!sQLiteDatabase.isOpen()) {
            deleteDatabaseFile(sQLiteDatabase.getPath());
            return;
        }
        try {
            list = sQLiteDatabase.getAttachedDbs();
        } catch (com.tencent.wcdb.database.SQLiteException unused) {
            list = null;
        }
        com.tencent.wcdb.database.SQLiteTrace traceCallback = sQLiteDatabase.getTraceCallback();
        if (traceCallback != null) {
            traceCallback.onDatabaseCorrupted(sQLiteDatabase);
        }
        try {
            sQLiteDatabase.close();
            if (list != null) {
                java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = list.iterator();
                while (it.hasNext()) {
                    deleteDatabaseFile((java.lang.String) it.next().second);
                }
                return;
            }
        } catch (com.tencent.wcdb.database.SQLiteException unused2) {
            if (list != null) {
                java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it6 = list.iterator();
                while (it6.hasNext()) {
                    deleteDatabaseFile((java.lang.String) it6.next().second);
                }
                return;
            }
        } catch (java.lang.Throwable th6) {
            if (list != null) {
                java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it7 = list.iterator();
                while (it7.hasNext()) {
                    deleteDatabaseFile((java.lang.String) it7.next().second);
                }
            } else {
                deleteDatabaseFile(sQLiteDatabase.getPath());
            }
            throw th6;
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }

    public DefaultDatabaseErrorHandler(boolean z17) {
        this.mNoCorruptionBackup = z17;
    }
}
