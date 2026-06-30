package com.tencent.wcdb;

/* loaded from: classes12.dex */
final class BulkCursorProxy implements com.tencent.wcdb.IBulkCursor {
    private android.os.Bundle mExtras = null;
    private android.os.IBinder mRemote;

    public BulkCursorProxy(android.os.IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void close() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
            this.mRemote.transact(7, obtain, obtain2, 0);
            com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void deactivate() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
            this.mRemote.transact(2, obtain, obtain2, 0);
            com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public android.os.Bundle getExtras() {
        if (this.mExtras == null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
                this.mRemote.transact(5, obtain, obtain2, 0);
                com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
                this.mExtras = obtain2.readBundle(com.tencent.wcdb.BulkCursorProxy.class.getClassLoader());
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return this.mExtras;
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public com.tencent.wcdb.CursorWindow getWindow(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
            obtain.writeInt(i17);
            this.mRemote.transact(1, obtain, obtain2, 0);
            com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
            return obtain2.readInt() == 1 ? com.tencent.wcdb.CursorWindow.newFromParcel(obtain2) : null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void onMove(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
            obtain.writeInt(i17);
            this.mRemote.transact(4, obtain, obtain2, 0);
            com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public int requery(com.tencent.wcdb.IContentObserver iContentObserver) {
        int readInt;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
            obtain.writeStrongInterface(iContentObserver);
            boolean transact = this.mRemote.transact(3, obtain, obtain2, 0);
            com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
            if (transact) {
                readInt = obtain2.readInt();
                this.mExtras = obtain2.readBundle(com.tencent.wcdb.BulkCursorProxy.class.getClassLoader());
            } else {
                readInt = -1;
            }
            return readInt;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.tencent.wcdb.IBulkCursor.descriptor);
            obtain.writeBundle(bundle);
            this.mRemote.transact(6, obtain, obtain2, 0);
            com.tencent.wcdb.DatabaseUtils.readExceptionFromParcel(obtain2);
            return obtain2.readBundle(com.tencent.wcdb.BulkCursorProxy.class.getClassLoader());
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
