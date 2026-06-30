package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public interface IHonorEarReturnService extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static class Default implements com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public void destroy() {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int enableEarReturn(boolean z17) {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int getEarReturnLatency() {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public void init(java.lang.String str) {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public boolean isSupported(int i17) {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int setParameter(java.lang.String str, int i17) {
            return 0;
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService {
        private static final java.lang.String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnEarReturnService";
        static final int TRANSACTION_destroy = 6;
        static final int TRANSACTION_enableEarReturn = 2;
        static final int TRANSACTION_getEarReturnLatency = 3;
        static final int TRANSACTION_init = 5;
        static final int TRANSACTION_isSupported = 1;
        static final int TRANSACTION_setParameter = 4;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService {
            public static com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public void destroy() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int enableEarReturn(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl() != null) {
                        return com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl().enableEarReturn(z17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int getEarReturnLatency() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl() != null) {
                        return com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl().getEarReturnLatency();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public void init(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl().init(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public boolean isSupported(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean isSupported = com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl().isSupported(i17);
                    obtain2.recycle();
                    obtain.recycle();
                    return isSupported;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int setParameter(java.lang.String str, int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl() != null) {
                        return com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.getDefaultImpl().setParameter(str, i17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService)) ? new com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.Proxy(iBinder) : (com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService) queryLocalInterface;
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService getDefaultImpl() {
            return com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService iHonorEarReturnService) {
            if (com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorEarReturnService == null) {
                return false;
            }
            com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.Proxy.sDefaultImpl = iHonorEarReturnService;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i17) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isSupported = isSupported(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isSupported ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int enableEarReturn = enableEarReturn(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(enableEarReturn);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int earReturnLatency = getEarReturnLatency();
                    parcel2.writeNoException();
                    parcel2.writeInt(earReturnLatency);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int parameter = setParameter(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(parameter);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    init(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    void destroy();

    int enableEarReturn(boolean z17);

    int getEarReturnLatency();

    void init(java.lang.String str);

    boolean isSupported(int i17);

    int setParameter(java.lang.String str, int i17);
}
