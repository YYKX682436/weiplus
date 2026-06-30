package com.tencent.wcdb;

/* loaded from: classes12.dex */
public abstract class BulkCursorNative extends android.os.Binder implements com.tencent.wcdb.IBulkCursor {
    public BulkCursorNative() {
        attachInterface(this, com.tencent.wcdb.IBulkCursor.descriptor);
    }

    public static com.tencent.wcdb.IBulkCursor asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        com.tencent.wcdb.IBulkCursor iBulkCursor = (com.tencent.wcdb.IBulkCursor) iBinder.queryLocalInterface(com.tencent.wcdb.IBulkCursor.descriptor);
        return iBulkCursor != null ? iBulkCursor : new com.tencent.wcdb.BulkCursorProxy(iBinder);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        try {
            switch (i17) {
                case 1:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    com.tencent.wcdb.CursorWindow window = getWindow(parcel.readInt());
                    parcel2.writeNoException();
                    if (window == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        window.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    deactivate();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    int requery = requery(com.tencent.wcdb.IContentObserver.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(requery);
                    parcel2.writeBundle(getExtras());
                    return true;
                case 4:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    onMove(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    android.os.Bundle extras = getExtras();
                    parcel2.writeNoException();
                    parcel2.writeBundle(extras);
                    return true;
                case 6:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    android.os.Bundle respond = respond(parcel.readBundle(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeBundle(respond);
                    return true;
                case 7:
                    parcel.enforceInterface(com.tencent.wcdb.IBulkCursor.descriptor);
                    close();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.wcdb.DatabaseUtils.writeExceptionToParcel(parcel2, e17);
            return true;
        }
    }
}
