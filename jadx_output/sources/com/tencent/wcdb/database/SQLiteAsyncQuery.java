package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteAsyncQuery extends com.tencent.wcdb.database.SQLiteProgram {
    private static final java.lang.String TAG = "WCDB.SQLiteAsyncQuery";
    private final int mResultColumns;

    public SQLiteAsyncQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mResultColumns = getColumnNames().length;
    }

    private static native int nativeCount(long j17);

    private static native int nativeFillRows(long j17, long j18, int i17, int i18);

    public void acquire() {
        if (this.mPreparedStatement == null) {
            acquirePreparedStatement(true);
            this.mPreparedStatement.bindArguments(getBindArgs());
        }
    }

    public int fillRows(com.tencent.wcdb.database.ChunkedCursorWindow chunkedCursorWindow, int i17, int i18) {
        acquire();
        int numColumns = chunkedCursorWindow.getNumColumns();
        int i19 = this.mResultColumns;
        if (numColumns != i19) {
            chunkedCursorWindow.setNumColumns(i19);
        }
        try {
            return nativeFillRows(this.mPreparedStatement.getPtr(), chunkedCursorWindow.mWindowPtr, i17, i18);
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Got exception on fillRows: " + e17.getMessage() + ", SQL: " + getSql());
            checkCorruption(e17);
            throw e17;
        }
    }

    public int getCount() {
        acquire();
        try {
            return nativeCount(this.mPreparedStatement.getPtr());
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Got exception on getCount: " + e17.getMessage() + ", SQL: " + getSql());
            checkCorruption(e17);
            throw e17;
        }
    }

    public void release() {
        releasePreparedStatement();
    }

    public void reset() {
        com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatement;
        if (preparedStatement != null) {
            preparedStatement.reset(false);
        }
    }
}
