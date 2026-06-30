package com.vivo.libra;

/* loaded from: classes13.dex */
public interface ILibraSdk extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static final class Proxy implements com.vivo.libra.ILibraSdk {
        private static final java.lang.String DESCRIPTOR = "metric_sdk_server";
        private static final java.lang.String TAG = "libra_sdk";
        private static com.vivo.libra.ILibraSdk.Proxy sProxy;
        private android.os.IBinder mRemote;
        private java.lang.String mHashCode = null;
        private final java.util.Map<java.lang.String, java.lang.String> mSupports = new java.util.HashMap();
        private final com.vivo.libra.ILibraSdk.Proxy.LibraDeathRecipient mLibraDeathRecipient = new com.vivo.libra.ILibraSdk.Proxy.LibraDeathRecipient();
        private final java.lang.Runnable mTryRun = new java.lang.Runnable() { // from class: com.vivo.libra.ILibraSdk$Proxy$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.vivo.libra.ILibraSdk.Proxy.this.tryReconnect();
            }
        };

        /* loaded from: classes13.dex */
        public final class LibraDeathRecipient implements android.os.IBinder.DeathRecipient {
            private LibraDeathRecipient() {
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.vivo.libra.ILibraSdk.Proxy.this.mRemote.unlinkToDeath(this, 0);
                new android.os.Handler().postDelayed(com.vivo.libra.ILibraSdk.Proxy.this.mTryRun, 1000L);
            }
        }

        public Proxy(android.os.IBinder iBinder) {
            this.mRemote = iBinder;
        }

        public static com.vivo.libra.ILibraSdk asInterfaces() {
            com.vivo.libra.ILibraSdk.Proxy proxy;
            android.os.IBinder checkService;
            synchronized (DESCRIPTOR) {
                if (sProxy == null && (checkService = checkService(DESCRIPTOR)) != null) {
                    sProxy = new com.vivo.libra.ILibraSdk.Proxy(checkService);
                }
                proxy = sProxy;
            }
            return proxy;
        }

        private static android.os.IBinder checkService(java.lang.String str) {
            try {
                return (android.os.IBinder) java.lang.Class.forName("android.os.ServiceManager").getMethod("checkService", java.lang.String.class).invoke(null, str);
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean tryReconnect() {
            android.os.IBinder checkService = checkService(DESCRIPTOR);
            if (checkService == null) {
                return false;
            }
            this.mRemote = checkService;
            return checkPermission(this.mHashCode);
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.mRemote;
        }

        @Override // com.vivo.libra.ILibraSdk
        public boolean checkPermission(java.lang.String str) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeString(str);
                this.mRemote.transact(4, obtain, obtain2, 0);
                obtain2.readException();
                boolean readBoolean = obtain2.readBoolean();
                if (readBoolean) {
                    this.mHashCode = str;
                    this.mRemote.linkToDeath(this.mLibraDeathRecipient, 0);
                    java.lang.String[] createStringArray = obtain2.createStringArray();
                    if (createStringArray != null && createStringArray.length > 0) {
                        for (java.lang.String str2 : createStringArray) {
                            this.mSupports.put(str2, str2);
                        }
                        java.util.Objects.toString(this.mSupports.keySet());
                    }
                }
                return readBoolean;
            } catch (android.os.RemoteException unused) {
                tryReconnect();
                return false;
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }

        @Override // com.vivo.libra.ILibraSdk
        public int getIntResult(java.lang.String str) {
            int intResult;
            if (!this.mSupports.containsKey(str)) {
                return -2740;
            }
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                try {
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    intResult = obtain2.readInt();
                } catch (android.os.RemoteException unused) {
                    if (tryReconnect()) {
                        intResult = getIntResult(str);
                    }
                    return -2740;
                } catch (java.lang.Exception unused2) {
                    return -2740;
                }
                return intResult;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // com.vivo.libra.ILibraSdk
        public boolean hasFun(java.lang.String str) {
            if (str == null) {
                return false;
            }
            return this.mSupports.containsKey(str);
        }
    }

    boolean checkPermission(java.lang.String str);

    int getIntResult(java.lang.String str);

    boolean hasFun(java.lang.String str);
}
