package com.tencent.wcdb;

/* loaded from: classes12.dex */
public abstract class AbstractCursor implements com.tencent.wcdb.CrossProcessCursor {
    private static final java.lang.String TAG = "Cursor";
    protected boolean mClosed;
    protected android.content.ContentResolver mContentResolver;
    private android.net.Uri mNotifyUri;
    private android.database.ContentObserver mSelfObserver;
    private boolean mSelfObserverRegistered;
    private final java.lang.Object mSelfObserverLock = new java.lang.Object();
    private final android.database.DataSetObservable mDataSetObservable = new android.database.DataSetObservable();
    private final android.database.ContentObservable mContentObservable = new android.database.ContentObservable();
    private android.os.Bundle mExtras = android.os.Bundle.EMPTY;
    protected int mPos = -1;

    @java.lang.Deprecated
    protected int mRowIdColumnIndex = -1;

    @java.lang.Deprecated
    protected java.lang.Long mCurrentRowID = null;

    @java.lang.Deprecated
    protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> mUpdatedRows = new java.util.HashMap<>();

    /* loaded from: classes12.dex */
    public static class SelfContentObserver extends android.database.ContentObserver {
        java.lang.ref.WeakReference<com.tencent.wcdb.AbstractCursor> mCursor;

        public SelfContentObserver(com.tencent.wcdb.AbstractCursor abstractCursor) {
            super(null);
            this.mCursor = new java.lang.ref.WeakReference<>(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z17) {
            com.tencent.wcdb.AbstractCursor abstractCursor = this.mCursor.get();
            if (abstractCursor != null) {
                abstractCursor.onChange(false);
            }
        }
    }

    public void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new com.tencent.wcdb.CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        onDeactivateOrClose();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        java.lang.String string = getString(i17);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        onDeactivateOrClose();
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public void fillWindow(int i17, com.tencent.wcdb.CursorWindow cursorWindow) {
        com.tencent.wcdb.DatabaseUtils.cursorFillWindow(this, i17, cursorWindow);
    }

    public void finalize() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && this.mSelfObserverRegistered) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
        }
        try {
            if (this.mClosed) {
                return;
            }
            close();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        throw new java.lang.UnsupportedOperationException("getBlob is not supported");
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.tencent.wcdb.support.Log.e(TAG, "requesting column name with table name -- ".concat(str), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (columnNames[i17].equalsIgnoreCase(str)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new java.lang.IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return getColumnNames()[i17];
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract java.lang.String[] getColumnNames();

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract int getCount();

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract double getDouble(int i17);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract float getFloat(int i17);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract int getInt(int i17);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract long getLong(int i17);

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return this.mNotifyUri;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final int getPosition() {
        return this.mPos;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract short getShort(int i17);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract java.lang.String getString(int i17);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        return 3;
    }

    @java.lang.Deprecated
    public java.lang.Object getUpdatedField(int i17) {
        return null;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public com.tencent.wcdb.CursorWindow getWindow() {
        return null;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.mPos == getCount();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.mPos == -1;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isClosed() {
        return this.mClosed;
    }

    @java.lang.Deprecated
    public boolean isFieldUpdated(int i17) {
        return false;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isFirst() {
        return this.mPos == 0 && getCount() != 0;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.mPos == count + (-1) && count != 0;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract boolean isNull(int i17);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean move(int i17) {
        return moveToPosition(this.mPos + i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i17) {
        int count = getCount();
        if (i17 >= count) {
            this.mPos = count;
            return false;
        }
        if (i17 < 0) {
            this.mPos = -1;
            return false;
        }
        int i18 = this.mPos;
        if (i17 == i18) {
            return true;
        }
        boolean onMove = onMove(i18, i17);
        if (onMove) {
            this.mPos = i17;
            int i19 = this.mRowIdColumnIndex;
            if (i19 != -1) {
                this.mCurrentRowID = java.lang.Long.valueOf(getLong(i19));
            }
        } else {
            this.mPos = -1;
        }
        return onMove;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    public void onChange(boolean z17) {
        synchronized (this.mSelfObserverLock) {
            this.mContentObservable.dispatchChange(z17);
            android.net.Uri uri = this.mNotifyUri;
            if (uri != null && z17) {
                this.mContentResolver.notifyChange(uri, this.mSelfObserver);
            }
        }
    }

    public void onDeactivateOrClose() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        return true;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.mContentObservable.registerObserver(contentObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return android.os.Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        this.mExtras = bundle;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        synchronized (this.mSelfObserverLock) {
            this.mNotifyUri = uri;
            this.mContentResolver = contentResolver;
            android.database.ContentObserver contentObserver = this.mSelfObserver;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            com.tencent.wcdb.AbstractCursor.SelfContentObserver selfContentObserver = new com.tencent.wcdb.AbstractCursor.SelfContentObserver(this);
            this.mSelfObserver = selfContentObserver;
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
            this.mSelfObserverRegistered = true;
        }
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        if (this.mClosed) {
            return;
        }
        this.mContentObservable.unregisterObserver(contentObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
    }
}
