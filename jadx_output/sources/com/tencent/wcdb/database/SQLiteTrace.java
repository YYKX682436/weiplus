package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public interface SQLiteTrace {

    /* loaded from: classes12.dex */
    public static class TraceInfo<T> {
        public final T info;
        public final int tid;
        public final long time;

        public TraceInfo(T t17, long j17, int i17) {
            this.info = t17;
            this.time = j17;
            this.tid = i17;
        }
    }

    void onConnectionObtained(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17);

    void onConnectionPoolBusy(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17, java.util.List<com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.String>> list, java.util.List<com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.StackTraceElement[]>> list2);

    void onDatabaseCorrupted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase);

    void onSQLExecuted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i17, long j17);
}
