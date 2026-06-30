package com.tencent.xweb.pinus.sdk.library_loader;

/* loaded from: classes13.dex */
public abstract class Linker {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final boolean DEBUG = true;
    public static final java.lang.String EXTRA_LINKER_SHARED_RELROS = "org.chromium.base.android.linker.shared_relros";
    protected static final java.lang.String LINKER_JNI_LIBRARY = "xweb_linker";
    private static final java.lang.String TAG = "Linker";
    protected static final java.lang.Object sLock = new java.lang.Object();
    private static com.tencent.xweb.pinus.sdk.library_loader.Linker sSingleton;
    private byte _hellAccFlag_;
    protected com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo mLibInfo;
    protected boolean mWaitForSharedRelros;
    protected boolean mInBrowserProcess = true;
    protected long mBaseLoadAddress = -1;
    protected int mState = 0;

    public static com.tencent.xweb.pinus.sdk.library_loader.Linker getInstance() {
        com.tencent.xweb.pinus.sdk.library_loader.Linker linker;
        synchronized (sLock) {
            if (sSingleton == null) {
                sSingleton = new com.tencent.xweb.pinus.sdk.library_loader.LegacyLinker();
            }
            linker = sSingleton;
        }
        return linker;
    }

    public static long getRandomBaseLoadAddress() {
        long nativeGetRandomBaseLoadAddress = nativeGetRandomBaseLoadAddress();
        by5.c4.f(TAG, java.lang.String.format("Random native base load address: 0x%x", java.lang.Long.valueOf(nativeGetRandomBaseLoadAddress)));
        return nativeGetRandomBaseLoadAddress;
    }

    private void loadLinkerJniLibraryLocked() {
        by5.c4.f(TAG, java.lang.String.format("Loading lib%s.so", LINKER_JNI_LIBRARY));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(LINKER_JNI_LIBRARY);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/pinus/sdk/library_loader/Linker", "loadLinkerJniLibraryLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/xweb/pinus/sdk/library_loader/Linker", "loadLinkerJniLibraryLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.UnsatisfiedLinkError unused) {
        }
    }

    private static native long nativeGetRandomBaseLoadAddress();

    private void setupBaseLoadAddressLocked() {
        if (this.mBaseLoadAddress == -1) {
            long randomBaseLoadAddress = getRandomBaseLoadAddress();
            this.mBaseLoadAddress = randomBaseLoadAddress;
            if (randomBaseLoadAddress == 0) {
                by5.c4.g(TAG, "Disabling shared RELROs due address space pressure");
                this.mWaitForSharedRelros = false;
            }
        }
    }

    public abstract int createMemroyFile(java.lang.String str);

    public final void disableSharedRelros() {
        by5.c4.f(TAG, "disableSharedRelros() called");
        synchronized (sLock) {
            this.mInBrowserProcess = false;
            ensureInitializedLocked();
            this.mWaitForSharedRelros = false;
        }
    }

    public final void ensureInitializedLocked() {
        if (this.mState != 0) {
            return;
        }
        loadLinkerJniLibraryLocked();
        if (this.mInBrowserProcess) {
            setupBaseLoadAddressLocked();
        }
        this.mState = 1;
    }

    public final long getBaseLoadAddress() {
        long j17;
        synchronized (sLock) {
            ensureInitializedLocked();
            setupBaseLoadAddressLocked();
            by5.c4.f(TAG, java.lang.String.format("getBaseLoadAddress() returns 0x%x", java.lang.Long.valueOf(this.mBaseLoadAddress)));
            j17 = this.mBaseLoadAddress;
        }
        return j17;
    }

    public final android.os.Bundle getSharedRelros() {
        synchronized (sLock) {
            if (this.mState != 2) {
                by5.c4.f(TAG, "getSharedRelros() = null");
                return null;
            }
            com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo = this.mLibInfo;
            libInfo.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("libinfo", libInfo);
            by5.c4.f(TAG, java.lang.String.format("getSharedRelros() = %s", bundle.toString()));
            return bundle;
        }
    }

    public final void initServiceProcess(long j17) {
        by5.c4.f(TAG, java.lang.String.format("initServiceProcess(0x%x) called", java.lang.Long.valueOf(j17)));
        synchronized (sLock) {
            ensureInitializedLocked();
            this.mInBrowserProcess = false;
            this.mWaitForSharedRelros = true;
            this.mBaseLoadAddress = j17;
        }
    }

    public final void loadLibrary(java.lang.String str, boolean z17) {
        by5.c4.f(TAG, java.lang.String.format("loadLibrary: %s", str));
        synchronized (sLock) {
            loadLibraryImplLocked(str, z17);
        }
    }

    public final void loadLibraryByFd(java.lang.String str, boolean z17, int i17, boolean z18) {
        by5.c4.f(TAG, java.lang.String.format("loadLibrary: %s, fd: %d", str, java.lang.Integer.valueOf(i17)));
        synchronized (sLock) {
            loadLibraryByFdImplLocked(str, z17, i17, z18);
        }
    }

    public abstract void loadLibraryByFdImplLocked(java.lang.String str, boolean z17, int i17, boolean z18);

    public abstract void loadLibraryImplLocked(java.lang.String str, boolean z17);

    public final void provideSharedRelros(android.os.Bundle bundle) {
        by5.c4.f(TAG, java.lang.String.format("provideSharedRelros() called with %s", bundle));
        java.lang.Object obj = sLock;
        synchronized (obj) {
            this.mLibInfo = (com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo) bundle.getParcelable("libinfo");
            obj.notifyAll();
        }
    }

    public void setApkFilePath(java.lang.String str) {
    }

    public final void waitForSharedRelrosLocked() {
        by5.c4.f(TAG, "waitForSharedRelros() called");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        while (this.mLibInfo == null) {
            try {
                sLock.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        by5.c4.f(TAG, java.lang.String.format("Time to wait for shared RELRO: %d ms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - uptimeMillis)));
    }

    /* loaded from: classes12.dex */
    public static class LibInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo> CREATOR = new com.tencent.xweb.pinus.sdk.library_loader.a();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f220454d;

        /* renamed from: e, reason: collision with root package name */
        public final long f220455e;

        /* renamed from: f, reason: collision with root package name */
        public final long f220456f;

        /* renamed from: g, reason: collision with root package name */
        public final long f220457g;

        /* renamed from: h, reason: collision with root package name */
        public final long f220458h;

        /* renamed from: i, reason: collision with root package name */
        public int f220459i;

        public LibInfo() {
            this.f220459i = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f220454d);
            parcel.writeLong(this.f220455e);
            parcel.writeLong(this.f220456f);
            parcel.writeLong(this.f220457g);
            parcel.writeLong(this.f220458h);
            parcel.writeInt(this.f220459i >= 0 ? 1 : 0);
            int i18 = this.f220459i;
            if (i18 >= 0) {
                try {
                    android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(i18);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (java.io.IOException e17) {
                    by5.c4.d(com.tencent.xweb.pinus.sdk.library_loader.Linker.TAG, "Can't write LibInfo file descriptor to parcel", e17);
                }
            }
        }

        public LibInfo(android.os.Parcel parcel) {
            this.f220459i = -1;
            this.f220454d = parcel.readString();
            this.f220455e = parcel.readLong();
            this.f220456f = parcel.readLong();
            this.f220457g = parcel.readLong();
            this.f220458h = parcel.readLong();
            if (parcel.readInt() != 0) {
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                if (parcelFileDescriptor != null) {
                    this.f220459i = parcelFileDescriptor.detachFd();
                    return;
                }
                return;
            }
            this.f220459i = -1;
        }
    }
}
