package com.tencent.shadow.dynamic.host;

/* loaded from: classes12.dex */
public final class FdCrashHandlerHost {
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("WVA.FdCrashHandlerHost");
    private static java.lang.String mJavaDumpPath;
    private static java.lang.String mNativeDumpPath;

    public static android.os.ParcelFileDescriptor getJavaDumpFd() {
        try {
            return android.os.ParcelFileDescriptor.open(new java.io.File(mJavaDumpPath), 939524096);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static android.os.ParcelFileDescriptor getNativeDumpFd() {
        try {
            return android.os.ParcelFileDescriptor.open(new java.io.File(mNativeDumpPath), 939524096);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static void init(java.lang.String str, java.lang.String str2) {
        logger.info("initCrashHandlerByFd path init: javaPath=" + str + ", nativePath=" + str2);
        mJavaDumpPath = str;
        mNativeDumpPath = str2;
    }

    public static boolean isInitialized() {
        return (mJavaDumpPath == null || mNativeDumpPath == null) ? false : true;
    }
}
