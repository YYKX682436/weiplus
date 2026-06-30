package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteDirectQuery extends com.tencent.wcdb.database.SQLiteProgram {
    private static final int[] SQLITE_TYPE_MAPPING = {3, 1, 2, 3, 4, 0};
    private static final java.lang.String TAG = "WCDB.SQLiteDirectQuery";
    private final com.tencent.wcdb.support.CancellationSignal mCancellationSignal;

    public SQLiteDirectQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    private static native byte[] nativeGetBlob(long j17, int i17);

    private static native double nativeGetDouble(long j17, int i17);

    private static native long nativeGetLong(long j17, int i17);

    private static native java.lang.String nativeGetString(long j17, int i17);

    private static native int nativeGetType(long j17, int i17);

    private static native int nativeStep(long j17, int i17);

    public byte[] getBlob(int i17) {
        return nativeGetBlob(this.mPreparedStatement.getPtr(), i17);
    }

    public double getDouble(int i17) {
        return nativeGetDouble(this.mPreparedStatement.getPtr(), i17);
    }

    public long getLong(int i17) {
        return nativeGetLong(this.mPreparedStatement.getPtr(), i17);
    }

    public java.lang.String getString(int i17) {
        return nativeGetString(this.mPreparedStatement.getPtr(), i17);
    }

    public int getType(int i17) {
        return SQLITE_TYPE_MAPPING[nativeGetType(this.mPreparedStatement.getPtr(), i17)];
    }

    @Override // com.tencent.wcdb.database.SQLiteProgram, com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        synchronized (this) {
            com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
            if (preparedStatement != null) {
                preparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.endOperation(null);
            }
        }
        super.onAllReferencesReleased();
    }

    public synchronized void reset(boolean z17) {
        com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
        if (preparedStatement != null) {
            preparedStatement.reset(false);
            if (z17) {
                this.mPreparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.endOperation(null);
                releasePreparedStatement();
            }
        }
    }

    public int step(int i17) {
        try {
            if (acquirePreparedStatement(false)) {
                this.mPreparedStatement.beginOperation("directQuery", getBindArgs());
                this.mPreparedStatement.attachCancellationSignal(this.mCancellationSignal);
            }
            return nativeStep(this.mPreparedStatement.getPtr(), i17);
        } catch (java.lang.RuntimeException e17) {
            if (e17 instanceof com.tencent.wcdb.database.SQLiteException) {
                com.tencent.wcdb.support.Log.e(TAG, "Got exception on stepping: " + e17.getMessage() + ", SQL: " + getSql());
                checkCorruption((com.tencent.wcdb.database.SQLiteException) e17);
            }
            com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
            if (preparedStatement != null) {
                preparedStatement.detachCancellationSignal(this.mCancellationSignal);
                this.mPreparedStatement.failOperation(e17);
            }
            releasePreparedStatement();
            throw e17;
        }
    }
}
