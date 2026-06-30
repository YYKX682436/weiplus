package com.tencent.xweb.pinus.sdk.library_loader;

/* loaded from: classes13.dex */
public class LegacyLinker extends com.tencent.xweb.pinus.sdk.library_loader.Linker {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "LegacyLinker";

    private static native boolean nativeAddZipArchivePath(java.lang.String str);

    private static native int nativeCreateMemoryFile(java.lang.String str);

    private static native boolean nativeCreateSharedRelro(java.lang.String str, long j17, com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo);

    private static native boolean nativeLoadLibrary(java.lang.String str, long j17, com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo);

    private static native boolean nativeLoadLibraryByFd(java.lang.String str, long j17, int i17, boolean z17);

    private static native boolean nativeUseSharedRelro(java.lang.String str, com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo);

    private static void useSharedRelrosLocked(com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo) {
        java.lang.String str = libInfo.f220454d;
        if (nativeUseSharedRelro(str, libInfo)) {
            by5.c4.f(TAG, java.lang.String.format("Using shared RELRO section for %s", str));
        } else {
            by5.c4.g(TAG, java.lang.String.format("Could not use shared RELRO section for %s", str));
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public int createMemroyFile(java.lang.String str) {
        ensureInitializedLocked();
        return nativeCreateMemoryFile(str);
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public void loadLibraryByFdImplLocked(java.lang.String str, boolean z17, int i17, boolean z18) {
        ensureInitializedLocked();
        if (nativeLoadLibraryByFd(str, z17 ? this.mBaseLoadAddress : 0L, i17, z18)) {
            this.mState = 3;
            return;
        }
        java.lang.String str2 = "Unable to load library: " + str;
        by5.c4.c(TAG, str2);
        throw new java.lang.UnsatisfiedLinkError(str2);
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public void loadLibraryImplLocked(java.lang.String str, boolean z17) {
        ensureInitializedLocked();
        boolean z18 = this.mInBrowserProcess;
        long j17 = z17 ? this.mBaseLoadAddress : 0L;
        com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo = new com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo();
        if (!nativeLoadLibrary(str, j17, libInfo)) {
            java.lang.String str2 = "Unable to load library: " + str;
            by5.c4.c(TAG, str2);
            throw new java.lang.UnsatisfiedLinkError(str2);
        }
        libInfo.f220454d = str;
        if (z18) {
            if (nativeCreateSharedRelro(str, this.mBaseLoadAddress, libInfo)) {
                by5.c4.f(TAG, java.lang.String.format("Created shared RELRO for %s at %x: %s", str, java.lang.Long.valueOf(this.mBaseLoadAddress), libInfo));
            } else {
                by5.c4.g(TAG, java.lang.String.format("Could not create shared RELRO for %s at %x", str, java.lang.Long.valueOf(this.mBaseLoadAddress)));
                libInfo.f220459i = -1;
            }
            this.mLibInfo = libInfo;
            useSharedRelrosLocked(libInfo);
            this.mState = 2;
            return;
        }
        if (!this.mWaitForSharedRelros) {
            this.mState = 3;
            return;
        }
        waitForSharedRelrosLocked();
        useSharedRelrosLocked(this.mLibInfo);
        com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo libInfo2 = this.mLibInfo;
        int i17 = libInfo2.f220459i;
        if (i17 >= 0) {
            android.os.ParcelFileDescriptor adoptFd = android.os.ParcelFileDescriptor.adoptFd(i17);
            if (adoptFd != null) {
                try {
                    adoptFd.close();
                } catch (java.io.IOException unused) {
                }
            }
            libInfo2.f220459i = -1;
        }
        this.mLibInfo = null;
        this.mState = 3;
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public void setApkFilePath(java.lang.String str) {
        synchronized (com.tencent.xweb.pinus.sdk.library_loader.Linker.sLock) {
            ensureInitializedLocked();
            nativeAddZipArchivePath(str);
        }
    }
}
