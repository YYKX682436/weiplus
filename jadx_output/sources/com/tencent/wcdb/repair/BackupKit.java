package com.tencent.wcdb.repair;

/* loaded from: classes12.dex */
public class BackupKit implements com.tencent.wcdb.support.CancellationSignal.OnCancelListener {
    public static final int FLAG_FIX_CORRUPTION = 4;
    public static final int FLAG_INCREMENTAL = 16;
    public static final int FLAG_NO_CIPHER = 1;
    public static final int FLAG_NO_COMPRESS = 2;
    public static final int FLAG_NO_CREATE_TABLE = 8;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    static final java.lang.String TAG = "WCDB.DBBackup";
    private com.tencent.wcdb.database.SQLiteDatabase mDB;
    private java.lang.String mLastError = null;
    private long mNativePtr;
    private int mStatementCount;
    private java.lang.String[] mTableDesc;

    public BackupKit(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, byte[] bArr, int i17, java.lang.String[] strArr) {
        this.mDB = sQLiteDatabase;
        this.mTableDesc = strArr != null ? (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length) : null;
        if (str == null) {
            throw new java.lang.IllegalArgumentException();
        }
        long nativeInit = nativeInit(str, bArr, i17);
        this.mNativePtr = nativeInit;
        if (nativeInit == 0) {
            throw new com.tencent.wcdb.database.SQLiteException("Failed initialize backup context.");
        }
    }

    private static native void nativeCancel(long j17);

    private static native void nativeFinish(long j17);

    private static native long nativeInit(java.lang.String str, byte[] bArr, int i17);

    private static native java.lang.String nativeLastError(long j17);

    private static native int nativeRun(long j17, long j18, java.lang.String[] strArr);

    private static native int nativeStatementCount(long j17);

    public void finalize() {
        release();
        super.finalize();
    }

    public java.lang.String lastError() {
        return this.mLastError;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeCancel(j17);
        }
    }

    public void release() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeFinish(j17);
            this.mNativePtr = 0L;
        }
    }

    public int run() {
        if (this.mNativePtr != 0) {
            long acquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("backup", false, false);
            int nativeRun = nativeRun(this.mNativePtr, acquireNativeConnectionHandle, this.mTableDesc);
            this.mDB.releaseNativeConnection(acquireNativeConnectionHandle, null);
            this.mStatementCount = nativeStatementCount(this.mNativePtr);
            this.mLastError = nativeLastError(this.mNativePtr);
            nativeFinish(this.mNativePtr);
            this.mNativePtr = 0L;
            return nativeRun;
        }
        throw new java.lang.IllegalStateException("BackupKit not initialized.");
    }

    public int statementCount() {
        return this.mStatementCount;
    }

    public int run(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int run = run();
        cancellationSignal.setOnCancelListener(null);
        return run;
    }
}
