package com.tencent.wcdb.repair;

/* loaded from: classes12.dex */
public class RecoverKit implements com.tencent.wcdb.support.CancellationSignal.OnCancelListener {
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    static final java.lang.String TAG = "WCDB.DBBackup";
    private com.tencent.wcdb.database.SQLiteDatabase mDB;
    private int mFailedCount;
    private java.lang.String mLastError = null;
    private long mNativePtr;
    private int mSuccessCount;

    public RecoverKit(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, byte[] bArr) {
        this.mDB = sQLiteDatabase;
        long nativeInit = nativeInit(str, bArr);
        this.mNativePtr = nativeInit;
        if (nativeInit == 0) {
            throw new com.tencent.wcdb.database.SQLiteException("Failed initialize recover context.");
        }
    }

    private static native void nativeCancel(long j17);

    private static native int nativeFailureCount(long j17);

    private static native void nativeFinish(long j17);

    private static native long nativeInit(java.lang.String str, byte[] bArr);

    private static native java.lang.String nativeLastError(long j17);

    private static native int nativeRun(long j17, long j18, boolean z17);

    private static native int nativeSuccessCount(long j17);

    public int failureCount() {
        return this.mFailedCount;
    }

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

    public int run(boolean z17) {
        if (this.mNativePtr != 0) {
            long acquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("recover", false, false);
            int nativeRun = nativeRun(this.mNativePtr, acquireNativeConnectionHandle, z17);
            this.mDB.releaseNativeConnection(acquireNativeConnectionHandle, null);
            this.mSuccessCount = nativeSuccessCount(this.mNativePtr);
            this.mFailedCount = nativeFailureCount(this.mNativePtr);
            this.mLastError = nativeLastError(this.mNativePtr);
            nativeFinish(this.mNativePtr);
            this.mNativePtr = 0L;
            return nativeRun;
        }
        throw new java.lang.IllegalStateException("RecoverKit not initialized.");
    }

    public int successCount() {
        return this.mSuccessCount;
    }

    public int run(boolean z17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int run = run(z17);
        cancellationSignal.setOnCancelListener(null);
        return run;
    }
}
