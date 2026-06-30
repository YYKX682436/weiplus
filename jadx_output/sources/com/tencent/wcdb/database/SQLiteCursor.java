package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteCursor extends com.tencent.wcdb.AbstractWindowedCursor {
    public static final com.tencent.wcdb.database.SQLiteDatabase.CursorFactory FACTORY = new com.tencent.wcdb.database.SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteCursor.1
        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public com.tencent.wcdb.Cursor newCursor(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteProgram sQLiteProgram) {
            return new com.tencent.wcdb.database.SQLiteCursor(sQLiteCursorDriver, str, (com.tencent.wcdb.database.SQLiteQuery) sQLiteProgram);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public com.tencent.wcdb.database.SQLiteProgram newQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            return new com.tencent.wcdb.database.SQLiteQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    static final int NO_COUNT = -1;
    static final java.lang.String TAG = "WCDB.SQLiteCursor";
    private java.util.Map<java.lang.String, java.lang.Integer> mColumnNameMap;
    private final java.lang.String[] mColumns;
    private int mCount;
    private int mCursorWindowCapacity;
    private final com.tencent.wcdb.database.SQLiteCursorDriver mDriver;
    private final com.tencent.wcdb.database.SQLiteQuery mQuery;

    @java.lang.Deprecated
    public SQLiteCursor(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    private void fillWindow(int i17) {
        clearOrCreateWindow(getDatabase().getPath());
        try {
            if (this.mCount != -1) {
                this.mQuery.fillWindow(this.mWindow, com.tencent.wcdb.DatabaseUtils.cursorPickFillWindowStartPosition(i17, this.mCursorWindowCapacity), i17, false);
            } else {
                this.mCount = this.mQuery.fillWindow(this.mWindow, com.tencent.wcdb.DatabaseUtils.cursorPickFillWindowStartPosition(i17, 0), i17, true);
                this.mCursorWindowCapacity = this.mWindow.getNumRows();
            }
        } catch (java.lang.RuntimeException e17) {
            closeWindow();
            throw e17;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.mQuery.close();
            this.mDriver.cursorClosed();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.mColumnNameMap == null) {
            java.lang.String[] strArr = this.mColumns;
            int length = strArr.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(strArr[i17], java.lang.Integer.valueOf(i17));
            }
            this.mColumnNameMap = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.tencent.wcdb.support.Log.e(TAG, "requesting column name with table name -- ".concat(str), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public com.tencent.wcdb.database.SQLiteDatabase getDatabase() {
        return this.mQuery.getDatabase();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i17) {
        if (!super.moveToPosition(i17)) {
            return false;
        }
        int count = getCount();
        if (i17 < count) {
            return true;
        }
        this.mPos = count;
        return false;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        com.tencent.wcdb.CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i18 >= cursorWindow.getStartPosition() && i18 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i18);
        int startPosition = this.mWindow.getStartPosition() + this.mWindow.getNumRows();
        if (i18 < startPosition) {
            return true;
        }
        this.mCount = startPosition;
        return true;
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
            com.tencent.wcdb.CursorWindow cursorWindow = this.mWindow;
            if (cursorWindow != null) {
                cursorWindow.clear();
            }
            this.mPos = -1;
            this.mCount = -1;
            this.mDriver.cursorRequeried(this);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.wcdb.support.Log.w(TAG, "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }

    public void setSelectionArguments(java.lang.String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // com.tencent.wcdb.AbstractWindowedCursor
    public void setWindow(com.tencent.wcdb.CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.mCount = -1;
    }

    public SQLiteCursor(com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteQuery sQLiteQuery) {
        this.mCount = -1;
        if (sQLiteQuery != null) {
            this.mDriver = sQLiteCursorDriver;
            this.mColumnNameMap = null;
            this.mQuery = sQLiteQuery;
            java.lang.String[] columnNames = sQLiteQuery.getColumnNames();
            this.mColumns = columnNames;
            this.mRowIdColumnIndex = com.tencent.wcdb.DatabaseUtils.findRowIdColumnIndex(columnNames);
            return;
        }
        throw new java.lang.IllegalArgumentException("query object cannot be null");
    }
}
