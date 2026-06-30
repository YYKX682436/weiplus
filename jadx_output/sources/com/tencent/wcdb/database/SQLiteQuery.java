package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteQuery extends com.tencent.wcdb.database.SQLiteProgram {
    private static final java.lang.String TAG = "WCDB.SQLiteQuery";
    private final com.tencent.wcdb.support.CancellationSignal mCancellationSignal;

    public SQLiteQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    public int fillWindow(com.tencent.wcdb.CursorWindow cursorWindow, int i17, int i18, boolean z17) {
        acquireReference();
        try {
            cursorWindow.acquireReference();
            try {
                try {
                    return getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i17, i18, z17, getConnectionFlags(), this.mCancellationSignal);
                } catch (com.tencent.wcdb.database.SQLiteException e17) {
                    com.tencent.wcdb.support.Log.e(TAG, "exception: " + e17.getMessage() + "; query: " + getSql());
                    checkCorruption(e17);
                    throw e17;
                }
            } finally {
                cursorWindow.releaseReference();
            }
        } finally {
            releaseReference();
        }
    }

    public java.lang.String toString() {
        return "SQLiteQuery: " + getSql();
    }
}
