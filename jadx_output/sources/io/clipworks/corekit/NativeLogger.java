package io.clipworks.corekit;

/* loaded from: classes5.dex */
public final class NativeLogger {
    private static final int DEBUG = 5;
    private static final int ERROR = 2;
    private static final int FATAL = 1;
    private static final int INFO = 4;
    private static final int ISSUE = 0;
    private static final int WARN = 3;

    private NativeLogger() {
    }

    public static void debug(java.lang.String str, java.lang.String str2) {
        printLog(5, str, str2);
    }

    public static void error(java.lang.String str, java.lang.String str2) {
        printLog(2, str, str2);
    }

    public static void fatal(java.lang.String str, java.lang.String str2) {
        printLog(1, str, str2);
    }

    public static void info(java.lang.String str, java.lang.String str2) {
        printLog(4, str, str2);
    }

    public static void issue(java.lang.String str, java.lang.String str2) {
        printLog(0, str, str2);
    }

    private static native void nativeTracingWithLevel(int i17, java.lang.String str);

    private static void printLog(int i17, java.lang.String str, java.lang.String str2) {
        nativeTracingWithLevel(i17, java.lang.String.format("%1$s: %2$s", str, str2));
    }

    public static void warning(java.lang.String str, java.lang.String str2) {
        printLog(3, str, str2);
    }
}
