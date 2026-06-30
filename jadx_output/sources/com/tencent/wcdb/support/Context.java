package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public final class Context {
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;

    static {
        com.tencent.wcdb.database.SQLiteGlobal.loadLib();
    }

    private static java.io.File getDataDirFile(android.content.Context context) {
        if (context == null) {
            throw new java.lang.RuntimeException("Not supported in system context");
        }
        java.lang.String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new java.io.File(str);
        }
        return null;
    }

    private static java.io.File getDatabasesDir(android.content.Context context) {
        java.io.File file = new java.io.File(getDataDirFile(context), "databases");
        return file.getPath().equals("databases") ? new java.io.File("/data/system") : file;
    }

    private static java.io.File makeFilename(java.io.File file, java.lang.String str) {
        if (str.indexOf(java.io.File.separatorChar) < 0) {
            return new java.io.File(file, str);
        }
        throw new java.lang.IllegalArgumentException("File " + str + " contains a path separator");
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(android.content.Context context, java.lang.String str, int i17, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(context, str, null, null, i17, cursorFactory, null, 0);
    }

    private static void setFilePermissionsFromMode(java.lang.String str, int i17, int i18) {
        int i19 = i18 | com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn;
        if ((i17 & 1) != 0) {
            i19 |= 4;
        }
        if ((i17 & 2) != 0) {
            i19 |= 2;
        }
        com.tencent.wcdb.FileUtils.setPermissions(str, i19, -1, -1);
    }

    private static java.io.File validateFilePath(android.content.Context context, java.lang.String str, boolean z17) {
        java.io.File databasesDir;
        java.io.File makeFilename;
        char charAt = str.charAt(0);
        char c17 = java.io.File.separatorChar;
        if (charAt == c17) {
            databasesDir = new java.io.File(str.substring(0, str.lastIndexOf(c17)));
            makeFilename = new java.io.File(databasesDir, str.substring(str.lastIndexOf(java.io.File.separatorChar)));
        } else {
            databasesDir = getDatabasesDir(context);
            makeFilename = makeFilename(databasesDir, str);
        }
        if (z17 && !databasesDir.isDirectory() && databasesDir.mkdir()) {
            com.tencent.wcdb.FileUtils.setPermissions(databasesDir.getPath(), 505, -1, -1);
        }
        return makeFilename;
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(android.content.Context context, java.lang.String str, int i17, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(context, str, null, null, i17, cursorFactory, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(android.content.Context context, java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, i17, cursorFactory, null, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(android.content.Context context, java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, i17, cursorFactory, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(android.content.Context context, java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i18) {
        java.io.File validateFilePath = validateFilePath(context, str, true);
        com.tencent.wcdb.database.SQLiteDatabase openDatabase = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(validateFilePath.getPath(), bArr, sQLiteCipherSpec, cursorFactory, (i17 & 8) != 0 ? 805306368 : 268435456, databaseErrorHandler, i18);
        setFilePermissionsFromMode(validateFilePath.getPath(), i17, 0);
        return openDatabase;
    }
}
