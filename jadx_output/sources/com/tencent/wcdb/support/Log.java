package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public class Log {
    public static final int LOGGER_DEFAULT = 1;
    public static final int LOGGER_NONE = 0;
    private static com.tencent.wcdb.support.Log.LogCallback mCallback;

    /* loaded from: classes12.dex */
    public interface LogCallback {
        void println(int i17, java.lang.String str, java.lang.String str2);
    }

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        println(3, str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        println(6, str, str2);
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        println(7, str, str2);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        println(4, str, str2);
    }

    private static native void nativePrintLn(int i17, java.lang.String str, java.lang.String str2);

    private static native void nativeSetLogger(int i17, com.tencent.wcdb.support.Log.LogCallback logCallback);

    public static void println(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.wcdb.support.Log.LogCallback logCallback = mCallback;
        if (logCallback != null) {
            logCallback.println(i17, str, str2);
        } else {
            nativePrintLn(i17, str, str2);
        }
    }

    public static void setLogger(int i17) {
        mCallback = null;
        nativeSetLogger(i17, null);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        println(2, str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        println(5, str, str2);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        println(3, str, java.lang.String.format(str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        println(6, str, java.lang.String.format(str2, objArr));
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        println(7, str, java.lang.String.format(str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        println(4, str, java.lang.String.format(str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        println(2, str, java.lang.String.format(str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        println(5, str, java.lang.String.format(str2, objArr));
    }

    public static void setLogger(com.tencent.wcdb.support.Log.LogCallback logCallback) {
        mCallback = logCallback;
        nativeSetLogger(-1, logCallback);
    }
}
