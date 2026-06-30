package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteDirectCursor extends com.tencent.wcdb.AbstractCursor {
    public static final com.tencent.wcdb.database.SQLiteDatabase.CursorFactory FACTORY = new com.tencent.wcdb.database.SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteDirectCursor.1
        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public com.tencent.wcdb.Cursor newCursor(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteProgram sQLiteProgram) {
            return new com.tencent.wcdb.database.SQLiteDirectCursor(sQLiteCursorDriver, str, (com.tencent.wcdb.database.SQLiteDirectQuery) sQLiteProgram);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public com.tencent.wcdb.database.SQLiteProgram newQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            return new com.tencent.wcdb.database.SQLiteDirectQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private static final java.lang.String TAG = "WCDB.SQLiteDirectCursor";
    private final java.lang.String[] mColumns;
    private int mCount;
    private boolean mCountFinished;
    private final com.tencent.wcdb.database.SQLiteCursorDriver mDriver;
    private final com.tencent.wcdb.database.SQLiteDirectQuery mQuery;

    public SQLiteDirectCursor(com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteDirectQuery sQLiteDirectQuery) {
        if (sQLiteDirectQuery == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.mQuery = sQLiteDirectQuery;
        this.mDriver = sQLiteCursorDriver;
        this.mColumns = sQLiteDirectQuery.getColumnNames();
        this.mCount = -1;
        this.mCountFinished = false;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.mQuery.getBlob(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (!this.mCountFinished) {
            com.tencent.wcdb.support.Log.w(TAG, "Count query on SQLiteDirectCursor is slow. Iterate through the end to get count or use other implementations.");
            this.mCount = this.mPos + this.mQuery.step(Integer.MAX_VALUE) + 1;
            this.mCountFinished = true;
            this.mQuery.reset(false);
            this.mPos = this.mQuery.step(this.mPos + 1) - 1;
        }
        return this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        return this.mQuery.getDouble(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        return (float) this.mQuery.getDouble(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        return (int) this.mQuery.getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        return this.mQuery.getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        return (short) this.mQuery.getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.mQuery.getString(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        return this.mQuery.getType(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        return getType(i17) == 0;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i17) {
        int step;
        int i18;
        if (i17 < 0) {
            this.mQuery.reset(false);
            this.mPos = -1;
            return false;
        }
        if (this.mCountFinished && i17 >= (i18 = this.mCount)) {
            this.mPos = i18;
            return false;
        }
        int i19 = this.mPos;
        if (i17 < i19) {
            com.tencent.wcdb.support.Log.w(TAG, "Moving backward on SQLiteDirectCursor is slow. Get rid of backward movement or use other implementations.");
            this.mQuery.reset(false);
            step = this.mQuery.step(i17 + 1) - 1;
        } else {
            if (i17 == i19) {
                return true;
            }
            step = i19 + this.mQuery.step(i17 - i19);
        }
        if (step < i17) {
            int i27 = step + 1;
            this.mCount = i27;
            this.mCountFinished = true;
            this.mPos = i27;
        } else {
            this.mPos = step;
            if (step >= this.mCount) {
                this.mCount = step + 1;
                this.mCountFinished = false;
            }
        }
        return this.mPos < this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.mQuery.getDatabase().isOpen()) {
                return false;
            }
            this.mPos = -1;
            this.mCountFinished = false;
            this.mCount = -1;
            this.mDriver.cursorRequeried(this);
            this.mQuery.reset(false);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.wcdb.support.Log.w(TAG, "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }
}
