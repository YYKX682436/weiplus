package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes15.dex */
public interface IHonorAudioService extends android.os.IInterface {

    /* loaded from: classes15.dex */
    public static class Default implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public java.util.List getSupportedServices() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public void init(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public boolean isServiceSupported(int i17) {
            return false;
        }
    }

    /* loaded from: classes15.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService {
        private static final java.lang.String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnAudioService";
        static final int TRANSACTION_getSupportedServices = 1;
        static final int TRANSACTION_init = 3;
        static final int TRANSACTION_isServiceSupported = 2;

        /* loaded from: classes15.dex */
        public static class Proxy implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService {
            public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public java.util.List getSupportedServices() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.getDefaultImpl() != null) {
                        return com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.getDefaultImpl().getSupportedServices();
                    }
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public void init(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.getDefaultImpl().init(str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public boolean isServiceSupported(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean isServiceSupported = com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.getDefaultImpl().isServiceSupported(i17);
                    obtain2.recycle();
                    obtain.recycle();
                    return isServiceSupported;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService)) ? new com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.Proxy(iBinder) : (com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService) queryLocalInterface;
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService getDefaultImpl() {
            return com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService iHonorAudioService) {
            if (com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorAudioService == null) {
                return false;
            }
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.Proxy.sDefaultImpl = iHonorAudioService;
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
                java.util.List supportedServices = getSupportedServices();
                parcel2.writeNoException();
                parcel2.writeList(supportedServices);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isServiceSupported = isServiceSupported(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(isServiceSupported ? 1 : 0);
                return true;
            }
            if (i17 != 3) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            init(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    java.util.List getSupportedServices();

    void init(java.lang.String str, java.lang.String str2);

    boolean isServiceSupported(int i17);
}
