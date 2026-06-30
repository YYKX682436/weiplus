package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public interface IHonorAdvancedRecordService extends android.os.IInterface {

    /* loaded from: classes16.dex */
    public static class Default implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public void destroy() {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public boolean disableAdvancedRecord() {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public boolean enableAdvancedRecord() {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public int enableRecordDenoise(boolean z17, int i17, int i18, int i19, android.os.IBinder iBinder) {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public void init(java.lang.String str) {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public boolean isSupported(int i17) {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public void unbind(int i17) {
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService {
        private static final java.lang.String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnAdvancedRecordService";
        static final int TRANSACTION_destroy = 2;
        static final int TRANSACTION_disableAdvancedRecord = 4;
        static final int TRANSACTION_enableAdvancedRecord = 3;
        static final int TRANSACTION_enableRecordDenoise = 6;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_isSupported = 5;
        static final int TRANSACTION_unbind = 7;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService {
            public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public void destroy() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public boolean disableAdvancedRecord() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean disableAdvancedRecord = com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().disableAdvancedRecord();
                    obtain2.recycle();
                    obtain.recycle();
                    return disableAdvancedRecord;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public boolean enableAdvancedRecord() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean enableAdvancedRecord = com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().enableAdvancedRecord();
                    obtain2.recycle();
                    obtain.recycle();
                    return enableAdvancedRecord;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public int enableRecordDenoise(boolean z17, int i17, int i18, int i19, android.os.IBinder iBinder) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeInt(i19);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() != null) {
                        return com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().enableRecordDenoise(z17, i17, i18, i19, iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public void init(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().init(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public boolean isSupported(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean isSupported = com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().isSupported(i17);
                    obtain2.recycle();
                    obtain.recycle();
                    return isSupported;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public void unbind(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.getDefaultImpl().unbind(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService)) ? new com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.Proxy(iBinder) : (com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService) queryLocalInterface;
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService getDefaultImpl() {
            return com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService iHonorAdvancedRecordService) {
            if (com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorAdvancedRecordService == null) {
                return false;
            }
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.Proxy.sDefaultImpl = iHonorAdvancedRecordService;
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
                    init(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean enableAdvancedRecord = enableAdvancedRecord();
                    parcel2.writeNoException();
                    parcel2.writeInt(enableAdvancedRecord ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean disableAdvancedRecord = disableAdvancedRecord();
                    parcel2.writeNoException();
                    parcel2.writeInt(disableAdvancedRecord ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isSupported = isSupported(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isSupported ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int enableRecordDenoise = enableRecordDenoise(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(enableRecordDenoise);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    unbind(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    void destroy();

    boolean disableAdvancedRecord();

    boolean enableAdvancedRecord();

    int enableRecordDenoise(boolean z17, int i17, int i18, int i19, android.os.IBinder iBinder);

    void init(java.lang.String str);

    boolean isSupported(int i17);

    void unbind(int i17);
}
