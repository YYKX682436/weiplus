package com.tencent.thumbplayer.core.config;

/* loaded from: classes16.dex */
public class TPPlayerCoreConfig {
    private static boolean mCoreEventProcessEnable = false;
    private static boolean mMediaDrmReuseEnable = false;
    private static int mVideoMediaCodecCoexistMaxCnt = 0;
    private static boolean mVideoMediaCodecStuckCheckEnable = true;
    private static java.lang.String mWidevineProvisioningServerUrl = "";

    private static native void _setMediaDrmReuseEnable(boolean z17);

    private static native void _setWidevineProvisioningServerUrl(java.lang.String str);

    public static boolean getCoreEventProcessEnable() {
        return mCoreEventProcessEnable;
    }

    public static boolean getMediaDrmReuseEnable() {
        return mMediaDrmReuseEnable;
    }

    public static int getVideoMediaCodecCoexistMaxCnt() {
        return mVideoMediaCodecCoexistMaxCnt;
    }

    public static java.lang.String getWidevineProvisioningServerUrl() {
        return mWidevineProvisioningServerUrl;
    }

    public static void setCoreEventProcessEnable(boolean z17) {
        mCoreEventProcessEnable = z17;
    }

    public static void setMediaDrmReuseEnable(boolean z17) {
        if (!com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.isLibLoaded()) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, "setMediaDrmReuseEnable, PlayerCore library has not been loaded");
            return;
        }
        mMediaDrmReuseEnable = z17;
        try {
            _setMediaDrmReuseEnable(z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.toString());
        }
    }

    public static void setVideoMediaCodecCoexistMaxCnt(int i17) {
        mVideoMediaCodecCoexistMaxCnt = i17;
    }

    public static void setVideoMediaCodecStuckCheckEnable(java.lang.Boolean bool) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "setVideoMediaCodecStuckCheckEnable, enable:" + bool);
        mVideoMediaCodecStuckCheckEnable = bool.booleanValue();
    }

    public static void setWidevineProvisioningServerUrl(java.lang.String str) {
        if (!com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.isLibLoaded()) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, "setWidevineProvisioningServerUrl,PlayerCore library has not been loaded");
            return;
        }
        mWidevineProvisioningServerUrl = str;
        try {
            _setWidevineProvisioningServerUrl(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.toString());
        }
    }
}
