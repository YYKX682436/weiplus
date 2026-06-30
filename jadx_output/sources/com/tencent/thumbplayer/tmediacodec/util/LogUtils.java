package com.tencent.thumbplayer.tmediacodec.util;

/* loaded from: classes14.dex */
public final class LogUtils {
    private static final java.lang.String GLOBAL_TAG = "TMediaCodec";
    private static final java.lang.String TAG = "LogUtils";
    private static com.tencent.thumbplayer.tmediacodec.util.ILogProxy mLogProxy = new com.tencent.thumbplayer.tmediacodec.util.ILogProxy() { // from class: com.tencent.thumbplayer.tmediacodec.util.LogUtils.1
        @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
        public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }

        @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
        public void i(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
        public void v(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
        public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }
    };
    private static boolean sLogEnable = true;
    private static int sLogLevel = 2;

    public static void d(java.lang.String str, java.lang.String str2) {
        if (isEnableLog(3)) {
            mLogProxy.d("TMediaCodec." + str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (isEnableLog(6)) {
            mLogProxy.e("TMediaCodec." + str, str2, null);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (isEnableLog(4)) {
            mLogProxy.i("TMediaCodec." + str, str2);
        }
    }

    public static boolean isEnableLog(int i17) {
        return sLogEnable && i17 >= sLogLevel;
    }

    public static boolean isLogEnable() {
        return sLogEnable;
    }

    public static void setLogEnable(boolean z17) {
        sLogEnable = z17;
    }

    public static void setLogLevel(int i17) {
        sLogLevel = i17;
    }

    public static void setLogProxy(com.tencent.thumbplayer.tmediacodec.util.ILogProxy iLogProxy) {
        mLogProxy = iLogProxy;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        if (isEnableLog(2)) {
            mLogProxy.v("TMediaCodec." + str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (isEnableLog(5)) {
            mLogProxy.w("TMediaCodec." + str, str2, null);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (isEnableLog(6)) {
            mLogProxy.e("TMediaCodec." + str, str2, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (isEnableLog(5)) {
            mLogProxy.w("TMediaCodec." + str, str2, th6);
        }
    }
}
