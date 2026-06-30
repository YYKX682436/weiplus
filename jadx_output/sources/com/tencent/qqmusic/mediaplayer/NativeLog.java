package com.tencent.qqmusic.mediaplayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class NativeLog {
    private static final java.lang.String TAG = "NativeLog";

    static {
        if (com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon.load()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[static initializer] NativeLog load succeed.");
        }
    }

    public static native int init(java.lang.String str);
}
