package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes13.dex */
public class HonorLogUtils {
    public static final int DEBUG = 4;
    public static final int ERROR = 1;
    private static final java.lang.String ERROR_MESSAGE = "log message error : ";
    public static final int INFO = 3;
    public static final int LOG_LEVEL = 6;
    public static final int VERBOSE = 5;
    public static final int WARN = 2;

    private HonorLogUtils() {
    }

    public static void debug(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.util.LiteavLog.d(str, str2);
    }

    public static void error(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.util.LiteavLog.e(str, str2);
    }

    private static <T> java.lang.String getMessageString(java.lang.String str, T[] tArr) {
        try {
            return java.lang.String.format(java.util.Locale.ENGLISH, str.replaceAll("\\{\\}", "%s"), tArr);
        } catch (java.util.IllegalFormatException | java.util.regex.PatternSyntaxException e17) {
            return ERROR_MESSAGE + e17.getMessage();
        }
    }

    public static void info(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.util.LiteavLog.i(str, str2);
    }

    public static void verbose(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.util.LiteavLog.v(str, str2);
    }

    public static void warn(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.util.LiteavLog.w(str, str2);
    }

    public static <T> void debug(java.lang.String str, java.lang.String str2, T... tArr) {
        if (str2 != null) {
            com.tencent.liteav.base.util.LiteavLog.d(str, getMessageString(str2, tArr));
        }
    }

    public static <T> void error(java.lang.String str, java.lang.String str2, T... tArr) {
        if (str2 != null) {
            com.tencent.liteav.base.util.LiteavLog.e(str, getMessageString(str2, tArr));
        }
    }

    public static <T> void info(java.lang.String str, java.lang.String str2, T... tArr) {
        if (str2 != null) {
            com.tencent.liteav.base.util.LiteavLog.i(str, getMessageString(str2, tArr));
        }
    }
}
