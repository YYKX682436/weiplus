package com.tencent.wcdb;

/* loaded from: classes12.dex */
public final class BulkCursorToCursorAdaptor extends com.tencent.wcdb.AbstractWindowedCursor {
    private static final java.lang.String TAG = "BulkCursor";
    private com.tencent.wcdb.IBulkCursor mBulkCursor;
    private java.lang.String[] mColumns;
    private int mCount;
    private com.tencent.wcdb.AbstractCursor.SelfContentObserver mObserverBridge = new com.tencent.wcdb.AbstractCursor.SelfContentObserver(this);
    private boolean mWantsAllOnMoveCalls;

    private void throwIfCursorIsClosed() {
        if (this.mBulkCursor == null) {
            throw new com.tencent.wcdb.StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        com.tencent.wcdb.IBulkCursor iBulkCursor = this.mBulkCursor;
        if (iBulkCursor != null) {
            try {
                try {
                    iBulkCursor.close();
                } catch (android.os.RemoteException unused) {
                    com.tencent.wcdb.support.Log.w(TAG, "Remote process exception when closing");
                }
            } finally {
                this.mBulkCursor = null;
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractWindowedCursor, com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        com.tencent.wcdb.IBulkCursor iBulkCursor = this.mBulkCursor;
        if (iBulkCursor != null) {
            try {
                iBulkCursor.deactivate();
            } catch (android.os.RemoteException unused) {
                com.tencent.wcdb.support.Log.w(TAG, "Remote process exception when deactivating");
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        throwIfCursorIsClosed();
        return this.mColumns;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        throwIfCursorIsClosed();
        return this.mCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public android.os.Bundle getExtras() {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.getExtras();
        } catch (android.os.RemoteException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public com.tencent.wcdb.IContentObserver getObserver() {
        try {
            return (com.tencent.wcdb.IContentObserver) this.mObserverBridge.getClass().getMethod("getContentObserver", new java.lang.Class[0]).invoke(this.mObserverBridge, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public void initialize(com.tencent.wcdb.BulkCursorDescriptor bulkCursorDescriptor) {
        this.mBulkCursor = bulkCursorDescriptor.cursor;
        java.lang.String[] strArr = bulkCursorDescriptor.columnNames;
        this.mColumns = strArr;
        this.mRowIdColumnIndex = com.tencent.wcdb.DatabaseUtils.findRowIdColumnIndex(strArr);
        this.mWantsAllOnMoveCalls = bulkCursorDescriptor.wantsAllOnMoveCalls;
        this.mCount = bulkCursorDescriptor.count;
        com.tencent.wcdb.CursorWindow cursorWindow = bulkCursorDescriptor.window;
        if (cursorWindow != null) {
            setWindow(cursorWindow);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMove(int r3, int r4) {
        /*
            r2 = this;
            r2.throwIfCursorIsClosed()
            r3 = 0
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch: android.os.RemoteException -> L38
            if (r0 == 0) goto L28
            int r0 = r0.getStartPosition()     // Catch: android.os.RemoteException -> L38
            if (r4 < r0) goto L28
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch: android.os.RemoteException -> L38
            int r0 = r0.getStartPosition()     // Catch: android.os.RemoteException -> L38
            com.tencent.wcdb.CursorWindow r1 = r2.mWindow     // Catch: android.os.RemoteException -> L38
            int r1 = r1.getNumRows()     // Catch: android.os.RemoteException -> L38
            int r0 = r0 + r1
            if (r4 < r0) goto L1e
            goto L28
        L1e:
            boolean r0 = r2.mWantsAllOnMoveCalls     // Catch: android.os.RemoteException -> L38
            if (r0 == 0) goto L31
            com.tencent.wcdb.IBulkCursor r0 = r2.mBulkCursor     // Catch: android.os.RemoteException -> L38
            r0.onMove(r4)     // Catch: android.os.RemoteException -> L38
            goto L31
        L28:
            com.tencent.wcdb.IBulkCursor r0 = r2.mBulkCursor     // Catch: android.os.RemoteException -> L38
            com.tencent.wcdb.CursorWindow r4 = r0.getWindow(r4)     // Catch: android.os.RemoteException -> L38
            r2.setWindow(r4)     // Catch: android.os.RemoteException -> L38
        L31:
            com.tencent.wcdb.CursorWindow r4 = r2.mWindow
            if (r4 != 0) goto L36
            return r3
        L36:
            r3 = 1
            return r3
        L38:
            java.lang.String r4 = "BulkCursor"
            java.lang.String r0 = "Unable to get window because the remote process is dead"
            com.tencent.wcdb.support.Log.e(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.BulkCursorToCursorAdaptor.onMove(int, int):boolean");
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        throwIfCursorIsClosed();
        try {
            int requery = this.mBulkCursor.requery(getObserver());
            this.mCount = requery;
            if (requery == -1) {
                deactivate();
                return false;
            }
            this.mPos = -1;
            closeWindow();
            super.requery();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Unable to requery because the remote process exception " + e17.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (android.os.RemoteException e17) {
            com.tencent.wcdb.support.Log.w(TAG, "respond() threw RemoteException, returning an empty bundle.", e17);
            return android.os.Bundle.EMPTY;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }
}
