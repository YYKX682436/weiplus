package com.tencent.thumbplayer.core.downloadproxy.aidl;

/* loaded from: classes16.dex */
public interface ITPPreLoadListenerAidl extends android.os.IInterface {

    /* loaded from: classes15.dex */
    public static class Default implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareError(int i17, int i18, java.lang.String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareOK() {
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl {
        private static final java.lang.String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl";
        static final int TRANSACTION_onPrepareDownloadProgressUpdate = 3;
        static final int TRANSACTION_onPrepareError = 2;
        static final int TRANSACTION_onPrepareOK = 1;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl {
            public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    obtain.writeString(str);
                    try {
                        if (this.mRemote.transact(3, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                        } else {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.getDefaultImpl().onPrepareDownloadProgressUpdate(i17, i18, j17, j18, str);
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareError(int i17, int i18, java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.getDefaultImpl().onPrepareError(i17, i18, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareOK() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.getDefaultImpl().onPrepareOK();
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

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl)) ? new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.Proxy(iBinder) : (com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl) queryLocalInterface;
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl getDefaultImpl() {
            return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            if (com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTPPreLoadListenerAidl == null) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.Proxy.sDefaultImpl = iTPPreLoadListenerAidl;
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
                onPrepareOK();
                parcel2.writeNoException();
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onPrepareError(parcel.readInt(), parcel.readInt(), parcel.readString());
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
            onPrepareDownloadProgressUpdate(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str);

    void onPrepareError(int i17, int i18, java.lang.String str);

    void onPrepareOK();
}
