package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes13.dex */
public class Util4Phone {
    private static final java.lang.String TAG = "Util4Phone";

    public static boolean isSupportARMv7() {
        try {
            return com.tencent.qqmusic.mediaplayer.util.Util4NativeCommon.isSupportARMv7();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "isSupportARMv7", th6);
            return true;
        }
    }

    public static boolean isSupportNeon() {
        try {
            return com.tencent.qqmusic.mediaplayer.util.Util4NativeCommon.isSupportNeon();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "isSupportNeon", th6);
            return false;
        }
    }
}
