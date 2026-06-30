package com.tencent.tmassistantsdk.aidl;

/* loaded from: classes13.dex */
public interface ITMAssistantDownloadSDKServiceInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface";

    /* loaded from: classes13.dex */
    public static class Default implements com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void cancelDownloadTask(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskInfo(java.lang.String str, java.lang.String str2) {
            return null;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public int getServiceVersion() {
            return 0;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public boolean isAllDownloadFinished() {
            return false;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void pauseDownloadTask(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void registerDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void setServiceSetingIsDownloadWifiOnly(boolean z17) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void setServiceSetingIsTaskAutoResume(boolean z17) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void setServiceSetingMaxTaskNum(int i17) {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public int startDownloadTask(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map) {
            return 0;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void unregisterDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface {
        static final int TRANSACTION_cancelDownloadTask = 9;
        static final int TRANSACTION_getDownloadTaskInfo = 6;
        static final int TRANSACTION_getServiceVersion = 1;
        static final int TRANSACTION_isAllDownloadFinished = 5;
        static final int TRANSACTION_pauseDownloadTask = 8;
        static final int TRANSACTION_registerDownloadTaskCallback = 10;
        static final int TRANSACTION_setServiceSetingIsDownloadWifiOnly = 3;
        static final int TRANSACTION_setServiceSetingIsTaskAutoResume = 2;
        static final int TRANSACTION_setServiceSetingMaxTaskNum = 4;
        static final int TRANSACTION_startDownloadTask = 7;
        static final int TRANSACTION_unregisterDownloadTaskCallback = 11;

        /* loaded from: classes13.dex */
        public static class Proxy implements com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void cancelDownloadTask(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskInfo(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo) com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface._Parcel.readTypedObject(obtain2, com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR;
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public int getServiceVersion() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public boolean isAllDownloadFinished() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void pauseDownloadTask(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void registerDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iTMAssistantDownloadSDKServiceCallback);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void setServiceSetingIsDownloadWifiOnly(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void setServiceSetingIsTaskAutoResume(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeInt(z17 ? 1 : 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void setServiceSetingMaxTaskNum(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeInt(i17);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public int startDownloadTask(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeLong(j17);
                    obtain.writeInt(i17);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeMap(map);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
            public void unregisterDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iTMAssistantDownloadSDKServiceCallback);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
        }

        public static com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface)) ? new com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.Stub.Proxy(iBinder) : (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.DESCRIPTOR);
                return true;
            }
            switch (i17) {
                case 1:
                    int serviceVersion = getServiceVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceVersion);
                    return true;
                case 2:
                    setServiceSetingIsTaskAutoResume(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    setServiceSetingIsDownloadWifiOnly(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    setServiceSetingMaxTaskNum(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean isAllDownloadFinished = isAllDownloadFinished();
                    parcel2.writeNoException();
                    parcel2.writeInt(isAllDownloadFinished ? 1 : 0);
                    return true;
                case 6:
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskInfo = getDownloadTaskInfo(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface._Parcel.writeTypedObject(parcel2, downloadTaskInfo, 1);
                    return true;
                case 7:
                    int startDownloadTask = startDownloadTask(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(startDownloadTask);
                    return true;
                case 8:
                    pauseDownloadTask(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    cancelDownloadTask(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    registerDownloadTaskCallback(parcel.readString(), com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    unregisterDownloadTaskCallback(parcel.readString(), com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    /* loaded from: classes13.dex */
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

    void cancelDownloadTask(java.lang.String str, java.lang.String str2);

    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskInfo(java.lang.String str, java.lang.String str2);

    int getServiceVersion();

    boolean isAllDownloadFinished();

    void pauseDownloadTask(java.lang.String str, java.lang.String str2);

    void registerDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback);

    void setServiceSetingIsDownloadWifiOnly(boolean z17);

    void setServiceSetingIsTaskAutoResume(boolean z17);

    void setServiceSetingMaxTaskNum(int i17);

    int startDownloadTask(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map);

    void unregisterDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback);
}
