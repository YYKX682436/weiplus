package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteGlobal {
    private static final java.lang.String TAG = "WCDB.SQLiteGlobal";
    public static final java.lang.String defaultJournalMode = "PERSIST";
    public static final int defaultPageSize = 4096;
    public static final java.lang.String defaultSyncMode = "FULL";
    public static final int journalSizeLimit = 524288;
    public static final int walAutoCheckpoint = 100;
    public static final int walConnectionPoolSize = 4;
    public static final java.lang.String walSyncMode = "FULL";
    private byte _hellAccFlag_;

    static {
        if (com.tencent.wcdb.database.WCDBInitializationProbe.libLoaded) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("WCDB");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wcdb/database/SQLiteGlobal", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wcdb/database/SQLiteGlobal", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private SQLiteGlobal() {
    }

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }
}
