package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public interface ISystemServiceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.tencent.shadow.dynamic.host.ISystemServiceManager";
    public static final int TRANSACTION_CODE_FAILED_EXCEPTION = 1;
    public static final int TRANSACTION_CODE_NOT_FOUND_EXCEPTION = 2;
    public static final int TRANSACTION_CODE_NO_EXCEPTION = 0;
    public static final int TRANSACTION_addService = 2;
    public static final int TRANSACTION_getService = 1;

    /* loaded from: classes13.dex */
    public static class Proxy implements com.tencent.shadow.dynamic.host.ISystemServiceManager {
        private android.os.IBinder mRemote;

        public Proxy(android.os.IBinder iBinder) {
            this.mRemote = iBinder;
        }

        @Override // com.tencent.shadow.dynamic.host.ISystemServiceManager
        public boolean addService(java.lang.String str, android.os.IBinder iBinder) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.ISystemServiceManager.DESCRIPTOR);
                obtain.writeString(str);
                obtain.writeStrongBinder(iBinder);
                this.mRemote.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() == 1;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.mRemote;
        }

        @Override // com.tencent.shadow.dynamic.host.ISystemServiceManager
        public android.os.IBinder getService(java.lang.String str) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.tencent.shadow.dynamic.host.ISystemServiceManager.DESCRIPTOR);
                obtain.writeString(str);
                this.mRemote.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readStrongBinder();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.shadow.dynamic.host.ISystemServiceManager {
        public Stub() {
            attachInterface(this, com.tencent.shadow.dynamic.host.ISystemServiceManager.DESCRIPTOR);
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            java.lang.String str = com.tencent.shadow.dynamic.host.ISystemServiceManager.DESCRIPTOR;
            if (i17 == 1) {
                parcel.enforceInterface(str);
                android.os.IBinder service = getService(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(service);
                return true;
            }
            if (i17 != 2) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            boolean addService = addService(parcel.readString(), parcel.readStrongBinder());
            parcel2.writeNoException();
            parcel2.writeInt(addService ? 1 : 0);
            return true;
        }
    }

    boolean addService(java.lang.String str, android.os.IBinder iBinder);

    android.os.IBinder getService(java.lang.String str);
}
