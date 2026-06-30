package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPNativeLog {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARN = 3;
    private static final java.lang.String TAG = "PlayerCore";
    private static com.tencent.thumbplayer.core.common.ITPNativeLogCallback mLogCallback;

    private static void onPrintLog(int i17, byte[] bArr, int i18, byte[] bArr2, int i19) {
        try {
            int i27 = 0;
            java.lang.String str = new java.lang.String(bArr, 0, i18, com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String str2 = new java.lang.String(bArr2, 0, i19, com.tencent.mapsdk.internal.rv.f51270c);
            if (i17 == 0) {
                i27 = 4;
            } else if (i17 == 1) {
                i27 = 3;
            } else if (i17 == 2) {
                i27 = 2;
            } else if (i17 == 3) {
                i27 = 1;
            }
            printLog(i27, str, str2);
        } catch (java.lang.Exception e17) {
            printLog(4, e17.getMessage());
        }
    }

    public static void printLog(int i17, java.lang.String str) {
        printLog(i17, TAG, str);
    }

    public static void printLogDefault(int i17, java.lang.String str, java.lang.String str2) {
    }

    public static void setLogCallback(com.tencent.thumbplayer.core.common.ITPNativeLogCallback iTPNativeLogCallback) {
        mLogCallback = iTPNativeLogCallback;
    }

    public static void printLog(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.core.common.ITPNativeLogCallback iTPNativeLogCallback = mLogCallback;
        if (iTPNativeLogCallback != null) {
            iTPNativeLogCallback.onPrintLog(i17, str, str2);
        } else {
            printLogDefault(i17, str, str2);
        }
    }
}
