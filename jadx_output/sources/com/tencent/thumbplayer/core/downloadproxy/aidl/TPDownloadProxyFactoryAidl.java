package com.tencent.thumbplayer.core.downloadproxy.aidl;

/* loaded from: classes16.dex */
public interface TPDownloadProxyFactoryAidl extends android.os.IInterface {

    /* loaded from: classes16.dex */
    public static class Default implements com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public java.lang.String getNativeVersion() {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl getTPDownloadProxy(int i17) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForDownload() {
            return false;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForPlay() {
            return false;
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl {
        private static final java.lang.String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl";
        static final int TRANSACTION_getNativeVersion = 4;
        static final int TRANSACTION_getTPDownloadProxy = 1;
        static final int TRANSACTION_isReadyForDownload = 3;
        static final int TRANSACTION_isReadyForPlay = 2;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl {
            public static com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public java.lang.String getNativeVersion() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl().getNativeVersion();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl getTPDownloadProxy(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl().getTPDownloadProxy(i17);
                    }
                    obtain2.readException();
                    return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public boolean isReadyForDownload() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl().isReadyForDownload();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public boolean isReadyForPlay() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.getDefaultImpl().isReadyForPlay();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl)) ? new com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.Proxy(iBinder) : (com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl) queryLocalInterface;
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl getDefaultImpl() {
            return com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl) {
            if (com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (tPDownloadProxyFactoryAidl == null) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.Proxy.sDefaultImpl = tPDownloadProxyFactoryAidl;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl tPDownloadProxy = getTPDownloadProxy(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(tPDownloadProxy != null ? tPDownloadProxy.asBinder() : null);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isReadyForPlay = isReadyForPlay();
                parcel2.writeNoException();
                parcel2.writeInt(isReadyForPlay ? 1 : 0);
                return true;
            }
            if (i17 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isReadyForDownload = isReadyForDownload();
                parcel2.writeNoException();
                parcel2.writeInt(isReadyForDownload ? 1 : 0);
                return true;
            }
            if (i17 != 4) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            java.lang.String nativeVersion = getNativeVersion();
            parcel2.writeNoException();
            parcel2.writeString(nativeVersion);
            return true;
        }
    }

    java.lang.String getNativeVersion();

    com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl getTPDownloadProxy(int i17);

    boolean isReadyForDownload();

    boolean isReadyForPlay();
}
