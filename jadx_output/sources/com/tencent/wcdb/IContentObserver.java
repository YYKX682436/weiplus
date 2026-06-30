package com.tencent.wcdb;

/* loaded from: classes12.dex */
public interface IContentObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.tencent.wcdb.IContentObserver";

    /* loaded from: classes12.dex */
    public static class Default implements com.tencent.wcdb.IContentObserver {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.wcdb.IContentObserver
        public void onChange(boolean z17, android.net.Uri uri) {
        }
    }

    /* loaded from: classes12.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.wcdb.IContentObserver {
        static final int TRANSACTION_onChange = 1;

        /* loaded from: classes12.dex */
        public static class Proxy implements com.tencent.wcdb.IContentObserver {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.wcdb.IContentObserver.DESCRIPTOR;
            }

            @Override // com.tencent.wcdb.IContentObserver
            public void onChange(boolean z17, android.net.Uri uri) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.wcdb.IContentObserver.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    com.tencent.wcdb.IContentObserver._Parcel.writeTypedObject(obtain, uri, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, com.tencent.wcdb.IContentObserver.DESCRIPTOR);
        }

        public static com.tencent.wcdb.IContentObserver asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.tencent.wcdb.IContentObserver.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.wcdb.IContentObserver)) ? new com.tencent.wcdb.IContentObserver.Stub.Proxy(iBinder) : (com.tencent.wcdb.IContentObserver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.tencent.wcdb.IContentObserver.DESCRIPTOR);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.tencent.wcdb.IContentObserver.DESCRIPTOR);
                return true;
            }
            if (i17 != 1) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            onChange(parcel.readInt() != 0, (android.net.Uri) com.tencent.wcdb.IContentObserver._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR));
            return true;
        }
    }

    /* loaded from: classes12.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel parcel, T t17, int i17) {
            if (t17 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t17.writeToParcel(parcel, i17);
            }
        }
    }

    void onChange(boolean z17, android.net.Uri uri);
}
