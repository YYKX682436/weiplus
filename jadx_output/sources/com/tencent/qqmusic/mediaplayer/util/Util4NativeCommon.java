package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes13.dex */
public class Util4NativeCommon {
    private static final java.lang.String TAG = "Util4NativeCommon";

    static {
        try {
            com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.getSoLibraryLoader().load(com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon.getName());
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
    }

    public static native boolean isSupportARMv7();

    public static native boolean isSupportNeon();
}
