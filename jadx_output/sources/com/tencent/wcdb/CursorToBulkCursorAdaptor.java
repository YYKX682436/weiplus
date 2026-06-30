package com.tencent.wcdb;

/* loaded from: classes12.dex */
public final class CursorToBulkCursorAdaptor extends com.tencent.wcdb.BulkCursorNative implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String TAG = "Cursor";
    private com.tencent.wcdb.CrossProcessCursor mCursor;
    private com.tencent.wcdb.CursorWindow mFilledWindow;
    private final java.lang.Object mLock;
    private com.tencent.wcdb.CursorToBulkCursorAdaptor.ContentObserverProxy mObserver;
    private final java.lang.String mProviderName;

    /* loaded from: classes12.dex */
    public static final class ContentObserverProxy extends android.database.ContentObserver {
        protected com.tencent.wcdb.IContentObserver mRemote;

        public ContentObserverProxy(com.tencent.wcdb.IContentObserver iContentObserver, android.os.IBinder.DeathRecipient deathRecipient) {
            super(null);
            this.mRemote = iContentObserver;
            try {
                iContentObserver.asBinder().linkToDeath(deathRecipient, 0);
            } catch (android.os.RemoteException unused) {
            }
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z17, android.net.Uri uri) {
            try {
                this.mRemote.onChange(z17, uri);
            } catch (android.os.RemoteException unused) {
            }
        }

        public boolean unlinkToDeath(android.os.IBinder.DeathRecipient deathRecipient) {
            return this.mRemote.asBinder().unlinkToDeath(deathRecipient, 0);
        }
    }

    public CursorToBulkCursorAdaptor(com.tencent.wcdb.Cursor cursor, com.tencent.wcdb.IContentObserver iContentObserver, java.lang.String str) {
        java.lang.Object obj = new java.lang.Object();
        this.mLock = obj;
        if (cursor instanceof com.tencent.wcdb.CrossProcessCursor) {
            this.mCursor = (com.tencent.wcdb.CrossProcessCursor) cursor;
        } else {
            this.mCursor = new com.tencent.wcdb.CrossProcessCursorWrapper(cursor);
        }
        this.mProviderName = str;
        synchronized (obj) {
            createAndRegisterObserverProxyLocked(iContentObserver);
        }
    }

    private void closeFilledWindowLocked() {
        com.tencent.wcdb.CursorWindow cursorWindow = this.mFilledWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mFilledWindow = null;
        }
    }

    private void createAndRegisterObserverProxyLocked(com.tencent.wcdb.IContentObserver iContentObserver) {
        if (this.mObserver != null) {
            throw new java.lang.IllegalStateException("an observer is already registered");
        }
        com.tencent.wcdb.CursorToBulkCursorAdaptor.ContentObserverProxy contentObserverProxy = new com.tencent.wcdb.CursorToBulkCursorAdaptor.ContentObserverProxy(iContentObserver, this);
        this.mObserver = contentObserverProxy;
        this.mCursor.registerContentObserver(contentObserverProxy);
    }

    private void disposeLocked() {
        if (this.mCursor != null) {
            unregisterObserverProxyLocked();
            this.mCursor.close();
            this.mCursor = null;
        }
        closeFilledWindowLocked();
    }

    private void throwIfCursorIsClosed() {
        if (this.mCursor == null) {
            throw new com.tencent.wcdb.StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }

    private void unregisterObserverProxyLocked() {
        com.tencent.wcdb.CursorToBulkCursorAdaptor.ContentObserverProxy contentObserverProxy = this.mObserver;
        if (contentObserverProxy != null) {
            this.mCursor.unregisterContentObserver(contentObserverProxy);
            this.mObserver.unlinkToDeath(this);
            this.mObserver = null;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        synchronized (this.mLock) {
            disposeLocked();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void close() {
        synchronized (this.mLock) {
            disposeLocked();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void deactivate() {
        synchronized (this.mLock) {
            if (this.mCursor != null) {
                unregisterObserverProxyLocked();
                this.mCursor.deactivate();
            }
            closeFilledWindowLocked();
        }
    }

    public com.tencent.wcdb.BulkCursorDescriptor getBulkCursorDescriptor() {
        com.tencent.wcdb.BulkCursorDescriptor bulkCursorDescriptor;
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            bulkCursorDescriptor = new com.tencent.wcdb.BulkCursorDescriptor();
            bulkCursorDescriptor.cursor = this;
            bulkCursorDescriptor.columnNames = this.mCursor.getColumnNames();
            bulkCursorDescriptor.wantsAllOnMoveCalls = this.mCursor.getWantsAllOnMoveCalls();
            bulkCursorDescriptor.count = this.mCursor.getCount();
            com.tencent.wcdb.CursorWindow window = this.mCursor.getWindow();
            bulkCursorDescriptor.window = window;
            if (window != null) {
                window.acquireReference();
            }
        }
        return bulkCursorDescriptor;
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public android.os.Bundle getExtras() {
        android.os.Bundle extras;
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            extras = this.mCursor.getExtras();
        }
        return extras;
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public com.tencent.wcdb.CursorWindow getWindow(int i17) {
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            if (!this.mCursor.moveToPosition(i17)) {
                closeFilledWindowLocked();
                return null;
            }
            com.tencent.wcdb.CursorWindow window = this.mCursor.getWindow();
            if (window != null) {
                closeFilledWindowLocked();
            } else {
                window = this.mFilledWindow;
                if (window == null) {
                    window = new com.tencent.wcdb.CursorWindow(this.mProviderName);
                    this.mFilledWindow = window;
                } else if (i17 < window.getStartPosition() || i17 >= window.getStartPosition() + window.getNumRows()) {
                    window.clear();
                }
                this.mCursor.fillWindow(i17, window);
            }
            window.acquireReference();
            return window;
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void onMove(int i17) {
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            com.tencent.wcdb.CrossProcessCursor crossProcessCursor = this.mCursor;
            crossProcessCursor.onMove(crossProcessCursor.getPosition(), i17);
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public int requery(com.tencent.wcdb.IContentObserver iContentObserver) {
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            closeFilledWindowLocked();
            try {
                if (!this.mCursor.requery()) {
                    return -1;
                }
                unregisterObserverProxyLocked();
                createAndRegisterObserverProxyLocked(iContentObserver);
                return this.mCursor.getCount();
            } catch (java.lang.IllegalStateException e17) {
                throw new java.lang.IllegalStateException(this.mProviderName + " Requery misuse db, mCursor isClosed:" + this.mCursor.isClosed(), e17);
            }
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        android.os.Bundle respond;
        synchronized (this.mLock) {
            throwIfCursorIsClosed();
            respond = this.mCursor.respond(bundle);
        }
        return respond;
    }
}
