package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteAsyncCheckpointer implements com.tencent.wcdb.database.SQLiteCheckpointListener, android.os.Handler.Callback {
    private static final int DEFAULT_BLOCKING_THRESHOLD = Integer.MAX_VALUE;
    private static final long DEFAULT_DELAY = 10000;
    private static final int DEFAULT_THRESHOLD = 0;
    private static android.os.HandlerThread gDefaultThread;
    private static final java.lang.Object gDefaultThreadLock = new java.lang.Object();
    private static int gDefaultThreadRefCount;
    private final int mBlockingThreshold;
    private final long mDelay;
    private android.os.Handler mHandler;
    private int mLastSyncMode;
    private android.os.Looper mLooper;
    private final java.util.HashSet<android.util.Pair<com.tencent.wcdb.database.SQLiteDatabase, java.lang.String>> mPendingCheckpoints;
    private final int mThreshold;
    private boolean mUseDefaultLooper;

    public SQLiteAsyncCheckpointer() {
        this(null, 0, Integer.MAX_VALUE, 10000L);
    }

    private static android.os.Looper acquireDefaultLooper() {
        android.os.Looper looper;
        synchronized (gDefaultThreadLock) {
            int i17 = gDefaultThreadRefCount;
            gDefaultThreadRefCount = i17 + 1;
            if (i17 == 0) {
                if (gDefaultThread != null) {
                    throw new java.lang.AssertionError("gDefaultThread == null");
                }
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("WCDB.AsyncCheckpointer", 4);
                gDefaultThread = handlerThread;
                handlerThread.start();
            }
            looper = gDefaultThread.getLooper();
        }
        return looper;
    }

    private static void releaseDefaultLooper() {
        synchronized (gDefaultThreadLock) {
            int i17 = gDefaultThreadRefCount - 1;
            gDefaultThreadRefCount = i17;
            if (i17 <= 0) {
                if (i17 < 0) {
                    throw new java.lang.AssertionError("gDefaultThreadRefCount == 0");
                }
                gDefaultThread.quit();
                gDefaultThread = null;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        android.util.Pair pair = (android.util.Pair) message.obj;
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = (com.tencent.wcdb.database.SQLiteDatabase) pair.first;
        java.lang.String str = (java.lang.String) pair.second;
        try {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.util.Pair<java.lang.Integer, java.lang.Integer> walCheckpoint = sQLiteDatabase.walCheckpoint(str, 0);
            onCheckpointResult(sQLiteDatabase, ((java.lang.Integer) walCheckpoint.first).intValue(), ((java.lang.Integer) walCheckpoint.second).intValue(), android.os.SystemClock.uptimeMillis() - uptimeMillis);
            sQLiteDatabase.releaseReference();
            synchronized (this.mPendingCheckpoints) {
                if (!this.mPendingCheckpoints.remove(pair)) {
                    throw new java.lang.AssertionError("mPendingCheckpoints.remove(p)");
                }
            }
            return true;
        } catch (java.lang.Throwable th6) {
            sQLiteDatabase.releaseReference();
            throw th6;
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onAttach(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        if (this.mLooper == null) {
            this.mLooper = acquireDefaultLooper();
            this.mUseDefaultLooper = true;
        }
        this.mHandler = new android.os.Handler(this.mLooper, this);
        this.mLastSyncMode = sQLiteDatabase.getSynchronousMode();
        sQLiteDatabase.setSynchronousMode(1);
    }

    public void onCheckpointResult(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17, int i18, long j17) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onDetach(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setSynchronousMode(this.mLastSyncMode);
        this.mHandler = null;
        if (this.mUseDefaultLooper) {
            this.mLooper = null;
            releaseDefaultLooper();
            this.mUseDefaultLooper = false;
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteCheckpointListener
    public void onWALCommit(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i17) {
        boolean add;
        if (i17 < this.mThreshold) {
            return;
        }
        int i18 = i17 >= this.mBlockingThreshold ? 1 : 0;
        android.util.Pair<com.tencent.wcdb.database.SQLiteDatabase, java.lang.String> pair = new android.util.Pair<>(sQLiteDatabase, str);
        synchronized (this.mPendingCheckpoints) {
            add = this.mPendingCheckpoints.add(pair);
        }
        if (add) {
            sQLiteDatabase.acquireReference();
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, i18, 0, pair), this.mDelay);
        }
    }

    public SQLiteAsyncCheckpointer(android.os.Looper looper) {
        this(looper, 0, Integer.MAX_VALUE, 10000L);
    }

    public SQLiteAsyncCheckpointer(android.os.Looper looper, int i17, int i18, long j17) {
        this.mLooper = looper;
        this.mThreshold = i17;
        this.mBlockingThreshold = i18;
        this.mDelay = j17;
        this.mPendingCheckpoints = new java.util.HashSet<>();
    }
}
