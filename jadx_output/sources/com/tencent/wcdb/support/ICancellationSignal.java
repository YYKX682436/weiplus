package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public interface ICancellationSignal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.tencent.wcdb.support.ICancellationSignal";

    /* loaded from: classes12.dex */
    public static class Default implements com.tencent.wcdb.support.ICancellationSignal {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.wcdb.support.ICancellationSignal
        public void cancel() {
        }
    }

    /* loaded from: classes12.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.wcdb.support.ICancellationSignal {
        static final int TRANSACTION_cancel = 1;

        /* loaded from: classes12.dex */
        public static class Proxy implements com.tencent.wcdb.support.ICancellationSignal {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.wcdb.support.ICancellationSignal
            public void cancel() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.wcdb.support.ICancellationSignal.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.wcdb.support.ICancellationSignal.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, com.tencent.wcdb.support.ICancellationSignal.DESCRIPTOR);
        }

        public static com.tencent.wcdb.support.ICancellationSignal asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.tencent.wcdb.support.ICancellationSignal.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.wcdb.support.ICancellationSignal)) ? new com.tencent.wcdb.support.ICancellationSignal.Stub.Proxy(iBinder) : (com.tencent.wcdb.support.ICancellationSignal) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.tencent.wcdb.support.ICancellationSignal.DESCRIPTOR);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.tencent.wcdb.support.ICancellationSignal.DESCRIPTOR);
                return true;
            }
            if (i17 != 1) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            cancel();
            return true;
        }
    }

    void cancel();
}
