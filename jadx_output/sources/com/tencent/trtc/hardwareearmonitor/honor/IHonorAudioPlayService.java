package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public interface IHonorAudioPlayService extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static class Default implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void destroy() {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void enableHighSampleRatePlay(boolean z17) {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void init(java.lang.String str) {
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService {
        private static final java.lang.String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnAudioPlayService";
        static final int TRANSACTION_destroy = 3;
        static final int TRANSACTION_enableHighSampleRatePlay = 2;
        static final int TRANSACTION_init = 1;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService {
            public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void destroy() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void enableHighSampleRatePlay(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.getDefaultImpl().enableHighSampleRatePlay(z17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void init(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.getDefaultImpl().init(str);
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

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService)) ? new com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.Proxy(iBinder) : (com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService) queryLocalInterface;
        }

        public static com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService getDefaultImpl() {
            return com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService iHonorAudioPlayService) {
            if (com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorAudioPlayService == null) {
                return false;
            }
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.Proxy.sDefaultImpl = iHonorAudioPlayService;
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
                init(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                enableHighSampleRatePlay(parcel.readInt() != 0);
                parcel2.writeNoException();
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
            destroy();
            parcel2.writeNoException();
            return true;
        }
    }

    void destroy();

    void enableHighSampleRatePlay(boolean z17);

    void init(java.lang.String str);
}
