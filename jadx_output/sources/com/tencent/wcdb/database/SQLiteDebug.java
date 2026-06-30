package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteDebug {
    private static final java.lang.String TAG = "WCDB.SQLiteDebug";
    private static final java.lang.ThreadLocal<java.lang.Throwable> sLastCorruptionException;
    private static volatile int sLastErrorLine;
    private static volatile java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.IOTraceStats> sLastIOTraceStats;

    /* loaded from: classes12.dex */
    public static class DbStats {
        public java.lang.String cache;
        public java.lang.String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(java.lang.String str, long j17, long j18, int i17, int i18, int i19, int i27) {
            this.dbName = str;
            this.pageSize = j18 / 1024;
            this.dbSize = (j17 * j18) / 1024;
            this.lookaside = i17;
            this.cache = i18 + "/" + i19 + "/" + i27;
        }
    }

    /* loaded from: classes12.dex */
    public static class IOTraceStats {
        public java.lang.String dbName;
        public java.lang.String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public java.lang.String path;

        public java.lang.String toString() {
            return java.lang.String.format("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", this.dbName, this.path, java.lang.Long.valueOf(this.pageSize), java.lang.Long.valueOf(this.pageCount), this.journalMode, java.lang.Long.valueOf(this.lastReadOffset), java.lang.Long.valueOf(this.lastWriteOffset), java.lang.Long.valueOf(this.lastJournalReadOffset), java.lang.Long.valueOf(this.lastJournalWriteOffset));
        }
    }

    /* loaded from: classes12.dex */
    public static class PagerStats {
        public java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    static {
        com.tencent.wcdb.database.SQLiteGlobal.loadLib();
        sLastCorruptionException = new java.lang.ThreadLocal<>();
    }

    private SQLiteDebug() {
    }

    public static void collectLastIOTraceStats(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection) {
        try {
            sLastErrorLine = nativeGetLastErrorLine();
            java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.IOTraceStats> arrayList = new java.util.ArrayList<>();
            long nativeHandle = sQLiteConnection.getNativeHandle(null);
            if (nativeHandle != 0) {
                nativeGetIOTraceStats(nativeHandle, arrayList);
                sQLiteConnection.endNativeHandle(null);
            }
            sLastIOTraceStats = arrayList;
        } catch (java.lang.RuntimeException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Cannot collect I/O trace statistics: " + e17.getMessage());
        }
    }

    public static void dump(android.util.Printer printer, java.lang.String[] strArr) {
        boolean z17 = false;
        for (java.lang.String str : strArr) {
            if (str.equals("-v")) {
                z17 = true;
            }
        }
        com.tencent.wcdb.database.SQLiteDatabase.dumpAll(printer, z17);
    }

    public static com.tencent.wcdb.database.SQLiteDebug.PagerStats getDatabaseInfo() {
        com.tencent.wcdb.database.SQLiteDebug.PagerStats pagerStats = new com.tencent.wcdb.database.SQLiteDebug.PagerStats();
        nativeGetPagerStats(pagerStats);
        pagerStats.dbStats = com.tencent.wcdb.database.SQLiteDatabase.getDbStats();
        return pagerStats;
    }

    public static java.lang.Throwable getLastCorruptionException() {
        return sLastCorruptionException.get();
    }

    public static int getLastErrorLine() {
        return sLastErrorLine;
    }

    public static java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.IOTraceStats> getLastIOTraceStats() {
        return sLastIOTraceStats;
    }

    private static native void nativeGetIOTraceStats(long j17, java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.IOTraceStats> arrayList);

    private static native int nativeGetLastErrorLine();

    private static native void nativeGetPagerStats(com.tencent.wcdb.database.SQLiteDebug.PagerStats pagerStats);

    private static native void nativeSetIOTraceFlags(int i17);

    public static void setIOTraceFlags(int i17) {
        nativeSetIOTraceFlags(i17);
    }

    public static void setLastCorruptionException(java.lang.Throwable th6) {
        sLastCorruptionException.set(th6);
    }

    public static final boolean shouldLogSlowQuery(long j17) {
        return j17 > 300;
    }

    public static void collectLastIOTraceStats(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        try {
            sLastErrorLine = nativeGetLastErrorLine();
            java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.IOTraceStats> arrayList = new java.util.ArrayList<>();
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("collectIoStat", false, false);
            if (acquireNativeConnectionHandle != 0) {
                nativeGetIOTraceStats(acquireNativeConnectionHandle, arrayList);
            }
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
            sLastIOTraceStats = arrayList;
        } catch (java.lang.RuntimeException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Cannot collect I/O trace statistics: " + e17.getMessage());
        }
    }
}
