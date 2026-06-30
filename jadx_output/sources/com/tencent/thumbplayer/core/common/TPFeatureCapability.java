package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPFeatureCapability {
    private static java.lang.String TAG = "TPFeatureCapability";
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

    private static native boolean _isFeatureSupport(int i17);

    public static boolean isFeatureSupport(int i17) {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("isFeatureSupport: Failed to load native library.");
        }
        try {
            return _isFeatureSupport(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _isFeatureSupport.");
        }
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }
}
