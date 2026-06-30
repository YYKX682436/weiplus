package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteDirectCursorDriver implements com.tencent.wcdb.database.SQLiteCursorDriver {
    private static com.tencent.wcdb.database.SQLiteDatabase.CursorFactory DEFAULT_FACTORY = com.tencent.wcdb.database.SQLiteCursor.FACTORY;
    private final com.tencent.wcdb.support.CancellationSignal mCancellationSignal;
    private final com.tencent.wcdb.database.SQLiteDatabase mDatabase;
    private final java.lang.String mEditTable;
    private com.tencent.wcdb.database.SQLiteProgram mQuery;
    private final java.lang.String mSql;

    public SQLiteDirectCursorDriver(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = cancellationSignal;
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void cursorRequeried(com.tencent.wcdb.Cursor cursor) {
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public com.tencent.wcdb.Cursor query(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.Object[] objArr) {
        if (cursorFactory == null) {
            cursorFactory = DEFAULT_FACTORY;
        }
        com.tencent.wcdb.database.SQLiteProgram sQLiteProgram = null;
        try {
            sQLiteProgram = cursorFactory.newQuery(this.mDatabase, this.mSql, objArr, this.mCancellationSignal);
            com.tencent.wcdb.Cursor newCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteProgram);
            this.mQuery = sQLiteProgram;
            return newCursor;
        } catch (java.lang.RuntimeException e17) {
            if (sQLiteProgram != null) {
                sQLiteProgram.close();
            }
            throw e17;
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteCursorDriver
    public void setBindArguments(java.lang.String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public java.lang.String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }
}
