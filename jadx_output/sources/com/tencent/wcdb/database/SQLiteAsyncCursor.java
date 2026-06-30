package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteAsyncCursor extends com.tencent.wcdb.AbstractCursor {
    public static final com.tencent.wcdb.database.SQLiteDatabase.CursorFactory FACTORY = new com.tencent.wcdb.database.SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteAsyncCursor.1
        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public com.tencent.wcdb.Cursor newCursor(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteProgram sQLiteProgram) {
            return new com.tencent.wcdb.database.SQLiteAsyncCursor(sQLiteCursorDriver, str, (com.tencent.wcdb.database.SQLiteAsyncQuery) sQLiteProgram);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
        public com.tencent.wcdb.database.SQLiteProgram newQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            return new com.tencent.wcdb.database.SQLiteAsyncQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private static final int MAX_KEEP_CHUNKS = 32;
    private static final int MAX_PREFETCH = 256;
    private static final int MIN_FETCH_ROWS = 32;
    private static final java.lang.String TAG = "WCDB.SQLiteAsyncCursor";
    private final java.lang.String[] mColumns;
    private volatile int mCount;
    private long mCurrentRow;
    private final com.tencent.wcdb.database.SQLiteCursorDriver mDriver;
    private final com.tencent.wcdb.database.SQLiteAsyncQuery mQuery;
    private com.tencent.wcdb.database.SQLiteAsyncCursor.QueryThread mQueryThread;
    private final java.lang.Object mWaitLock;
    private com.tencent.wcdb.database.ChunkedCursorWindow mWindow;

    /* loaded from: classes12.dex */
    public class QueryThread extends java.lang.Thread {
        private int mFetchPos;
        private int mMinPos;
        private volatile int mRequestPos;

        public QueryThread() {
            super("SQLiteAsyncCursor.QueryThread");
            this.mRequestPos = 0;
            this.mMinPos = 0;
            this.mFetchPos = 0;
        }

        public void quit() {
            interrupt();
        }

        public void requestPos(int i17) {
            synchronized (this) {
                this.mRequestPos = i17;
                notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i17;
            int i18;
            int fillRows;
            try {
                int count = com.tencent.wcdb.database.SQLiteAsyncCursor.this.mQuery.getCount();
                synchronized (com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWaitLock) {
                    com.tencent.wcdb.database.SQLiteAsyncCursor.this.mCount = count;
                    com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                }
                while (!java.lang.Thread.interrupted()) {
                    synchronized (this) {
                        while (this.mRequestPos + 256 <= this.mFetchPos && this.mRequestPos >= this.mMinPos) {
                            wait();
                        }
                        i17 = this.mRequestPos;
                        i18 = i17 + 256;
                    }
                    if (i17 < this.mMinPos) {
                        com.tencent.wcdb.database.SQLiteAsyncCursor.this.mQuery.reset();
                        this.mFetchPos = 0;
                        com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWindow.clear();
                        this.mMinPos = 0;
                    }
                    if (this.mFetchPos < i18) {
                        if (com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWindow.getNumChunks() > 32) {
                            long removeChunk = com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWindow.removeChunk(this.mMinPos);
                            if (removeChunk != -1) {
                                this.mMinPos = (int) removeChunk;
                            }
                        }
                        synchronized (com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWaitLock) {
                            fillRows = com.tencent.wcdb.database.SQLiteAsyncCursor.this.mQuery.fillRows(com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWindow, this.mFetchPos, 32);
                            int i19 = this.mFetchPos;
                            if (i19 <= i17 && i19 + fillRows > i17) {
                                com.tencent.wcdb.database.SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                            }
                        }
                        this.mFetchPos += fillRows;
                    }
                }
            } catch (java.lang.InterruptedException unused) {
            } catch (java.lang.Throwable th6) {
                com.tencent.wcdb.database.SQLiteAsyncCursor.this.mQuery.release();
                throw th6;
            }
            com.tencent.wcdb.database.SQLiteAsyncCursor.this.mQuery.release();
        }
    }

    public SQLiteAsyncCursor(com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteAsyncQuery sQLiteAsyncQuery) {
        if (sQLiteAsyncQuery == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.mQuery = sQLiteAsyncQuery;
        this.mDriver = sQLiteCursorDriver;
        this.mColumns = sQLiteAsyncQuery.getColumnNames();
        this.mCount = -1;
        this.mWaitLock = new java.lang.Object();
        this.mWindow = new com.tencent.wcdb.database.ChunkedCursorWindow(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        com.tencent.wcdb.database.SQLiteAsyncCursor.QueryThread queryThread = new com.tencent.wcdb.database.SQLiteAsyncCursor.QueryThread();
        this.mQueryThread = queryThread;
        queryThread.start();
    }

    private void checkValidRow() {
        if (this.mCurrentRow != 0) {
            return;
        }
        if (!isValidPosition(this.mPos)) {
            throw new com.tencent.wcdb.CursorIndexOutOfBoundsException(this.mPos, this.mCount);
        }
        throw new com.tencent.wcdb.StaleDataException("Cannot get valid Row object");
    }

    private boolean isValidPosition(int i17) {
        return i17 >= 0 && i17 < getCount();
    }

    private boolean requestRow() {
        if (this.mWindow == null || !isValidPosition(this.mPos)) {
            return false;
        }
        this.mQueryThread.requestPos(this.mPos);
        long rowUnsafe = this.mWindow.getRowUnsafe(this.mPos);
        this.mCurrentRow = rowUnsafe;
        if (rowUnsafe == 0) {
            this.mCurrentRow = waitForRow(this.mPos);
        }
        return this.mCurrentRow != 0;
    }

    private long waitForRow(int i17) {
        long rowUnsafe;
        try {
            synchronized (this.mWaitLock) {
                while (true) {
                    rowUnsafe = this.mWindow.getRowUnsafe(i17);
                    if (rowUnsafe == 0) {
                        if (!isValidPosition(i17)) {
                            throw new com.tencent.wcdb.CursorIndexOutOfBoundsException(this.mPos, this.mCount);
                        }
                        this.mWaitLock.wait();
                    }
                }
            }
            return rowUnsafe;
        } catch (java.lang.InterruptedException unused) {
            return 0L;
        }
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
        checkValidRow();
        return this.mWindow.getBlobUnsafe(this.mCurrentRow, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (this.mCount >= 0) {
            return this.mCount;
        }
        if (this.mWindow == null) {
            return -1;
        }
        try {
            synchronized (this.mWaitLock) {
                while (this.mCount < 0) {
                    this.mWaitLock.wait();
                }
            }
        } catch (java.lang.InterruptedException unused) {
        }
        return this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        checkValidRow();
        return this.mWindow.getDoubleUnsafe(this.mCurrentRow, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        return (float) getDouble(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        return (int) getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        checkValidRow();
        return this.mWindow.getLongUnsafe(this.mCurrentRow, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        return (short) getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        checkValidRow();
        return this.mWindow.getStringUnsafe(this.mCurrentRow, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        checkValidRow();
        return this.mWindow.getTypeUnsafe(this.mCurrentRow, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        return getType(i17) == 0;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i17) {
        if (i17 < -1) {
            i17 = -1;
        }
        if (i17 != this.mPos) {
            this.mWindow.endRowUnsafe(this.mCurrentRow);
            this.mCurrentRow = 0L;
        }
        int count = getCount();
        if (i17 >= count) {
            this.mPos = count;
            return false;
        }
        this.mPos = i17;
        return i17 >= 0 && requestRow();
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void onDeactivateOrClose() {
        long j17 = this.mCurrentRow;
        if (j17 != 0) {
            this.mWindow.endRowUnsafe(j17);
            this.mCurrentRow = 0L;
        }
        com.tencent.wcdb.database.SQLiteAsyncCursor.QueryThread queryThread = this.mQueryThread;
        if (queryThread != null) {
            queryThread.quit();
            try {
                this.mQueryThread.join();
            } catch (java.lang.InterruptedException unused) {
            }
            this.mQueryThread = null;
        }
        com.tencent.wcdb.database.ChunkedCursorWindow chunkedCursorWindow = this.mWindow;
        if (chunkedCursorWindow != null) {
            chunkedCursorWindow.close();
            this.mWindow = null;
        }
        this.mCount = -1;
        this.mPos = -1;
        super.onDeactivateOrClose();
    }
}
