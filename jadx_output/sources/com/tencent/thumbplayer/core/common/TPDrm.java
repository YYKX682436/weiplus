package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public final class TPDrm {
    private static final java.lang.String TAG = "TPDrm";
    private static boolean mIsLibLoaded;

    static {
        try {
            com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(null);
            mIsLibLoaded = true;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
            mIsLibLoaded = false;
        }
    }

    public static int[] getDRMCapabilities() {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to load native library.");
        }
        try {
            int[] native_getDRMCapabilities = native_getDRMCapabilities();
            return native_getDRMCapabilities == null ? new int[0] : native_getDRMCapabilities;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.toString());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call native func.");
        }
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static native int[] native_getDRMCapabilities();
}
