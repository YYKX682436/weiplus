package com.tencent.tmassistantsdk.aidl;

/* loaded from: classes13.dex */
public interface ITMAssistantDownloadSDKServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";

    /* loaded from: classes13.dex */
    public static class Default implements com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback {
        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
        public void OnDownloadSDKServiceTaskProgressChanged(java.lang.String str, java.lang.String str2, long j17, long j18) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
        public void OnDownloadSDKServiceTaskStateChanged(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18) {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback {
        static final int TRANSACTION_OnDownloadSDKServiceTaskProgressChanged = 2;
        static final int TRANSACTION_OnDownloadSDKServiceTaskStateChanged = 1;

        /* loaded from: classes13.dex */
        public static class Proxy implements com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
            public void OnDownloadSDKServiceTaskProgressChanged(java.lang.String str, java.lang.String str2, long j17, long j18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
            public void OnDownloadSDKServiceTaskStateChanged(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeString(str3);
                    obtain.writeInt(z17 ? 1 : 0);
                    obtain.writeInt(z18 ? 1 : 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR);
        }

        public static com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback)) ? new com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.Stub.Proxy(iBinder) : (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.DESCRIPTOR);
                return true;
            }
            if (i17 == 1) {
                OnDownloadSDKServiceTaskStateChanged(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i17 != 2) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                OnDownloadSDKServiceTaskProgressChanged(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void OnDownloadSDKServiceTaskProgressChanged(java.lang.String str, java.lang.String str2, long j17, long j18);

    void OnDownloadSDKServiceTaskStateChanged(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18);
}
