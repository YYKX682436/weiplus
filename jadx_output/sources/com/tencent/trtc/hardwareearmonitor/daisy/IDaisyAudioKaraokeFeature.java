package com.tencent.trtc.hardwareearmonitor.daisy;

/* loaded from: classes13.dex */
public interface IDaisyAudioKaraokeFeature extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature {
        private static final java.lang.String DESCRIPTOR = "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature";
        static final int TRANSACTION_enableKaraokeFeature = 2;
        static final int TRANSACTION_getKaraokeLatency = 3;
        static final int TRANSACTION_init = 5;
        static final int TRANSACTION_isKaraokeFeatureSupport = 1;
        static final int TRANSACTION_setParameter = 4;

        /* loaded from: classes13.dex */
        public static class a implements com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature {

            /* renamed from: a, reason: collision with root package name */
            private android.os.IBinder f215711a;

            public a(android.os.IBinder iBinder) {
                this.f215711a = iBinder;
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                return this.f215711a;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final int enableKaraokeFeature(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    this.f215711a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final int getKaraokeLatency() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.DESCRIPTOR);
                    this.f215711a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final void init(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f215711a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final boolean isKaraokeFeatureSupport() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.DESCRIPTOR);
                    this.f215711a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final int setParameter(java.lang.String str, int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    this.f215711a.transact(4, obtain, obtain2, 0);
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

        public static com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature)) ? new com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.a(iBinder) : (com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isKaraokeFeatureSupport = isKaraokeFeatureSupport();
                parcel2.writeNoException();
                parcel2.writeInt(isKaraokeFeatureSupport ? 1 : 0);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                int enableKaraokeFeature = enableKaraokeFeature(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(enableKaraokeFeature);
                return true;
            }
            if (i17 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                int karaokeLatency = getKaraokeLatency();
                parcel2.writeNoException();
                parcel2.writeInt(karaokeLatency);
                return true;
            }
            if (i17 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                int parameter = setParameter(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(parameter);
                return true;
            }
            if (i17 != 5) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            init(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    int enableKaraokeFeature(boolean z17);

    int getKaraokeLatency();

    void init(java.lang.String str);

    boolean isKaraokeFeatureSupport();

    int setParameter(java.lang.String str, int i17);
}
