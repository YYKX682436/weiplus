package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPLogUtil {
    public static final int DEBUG = 50;
    public static final int ERROR = 10;
    public static final int INFO = 40;
    public static final int VERBOSE = 60;
    public static final int WARNING = 20;
    private static boolean isDebug = true;
    private static int logPrintLevel = 50;
    private static com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener onLogListener;

    public static void d(java.lang.String str, java.lang.String str2) {
        printTag(50, str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        printTag(10, str, str2, new java.lang.Object[0]);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        printTag(40, str, str2, new java.lang.Object[0]);
    }

    private static void logToLogListener(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 10) {
            onLogListener.e(str, str2);
            return;
        }
        if (i17 == 20) {
            onLogListener.w(str, str2);
            return;
        }
        if (i17 == 40) {
            onLogListener.i(str, str2);
        } else if (i17 == 50) {
            onLogListener.d(str, str2);
        } else {
            if (i17 != 60) {
                return;
            }
            onLogListener.v(str, str2);
        }
    }

    private static void printTag(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (i17 == 20) {
            i17 = 10;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str2 = java.lang.String.format(str2, objArr);
                }
            } catch (java.util.MissingFormatArgumentException | java.lang.Exception | java.lang.OutOfMemoryError unused) {
                return;
            }
        }
        if (onLogListener != null) {
            if (i17 <= logPrintLevel) {
                logToLogListener(i17, str, str2);
            }
        } else {
            if (!isDebug || i17 > logPrintLevel) {
                return;
            }
            android.util.Log.println(toSysLevel(i17), str, str2);
        }
    }

    public static void setDebugEnable(boolean z17) {
        isDebug = z17;
    }

    public static void setLogPrintLevel(int i17) {
        logPrintLevel = i17;
    }

    public static void setOnLogListener(com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener onLogListener2) {
        onLogListener = onLogListener2;
    }

    private static int toSysLevel(int i17) {
        if (i17 == 10) {
            return 6;
        }
        if (i17 == 20) {
            return 5;
        }
        if (i17 == 40) {
            return 4;
        }
        if (i17 != 50) {
            return i17 != 60 ? 0 : 2;
        }
        return 3;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        printTag(60, str, str2, new java.lang.Object[0]);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        printTag(20, str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.Throwable th6) {
        e(str, th6, "");
    }

    public static void e(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = str2 + "\n";
        }
        if (th6 != null) {
            str3 = str3 + android.util.Log.getStackTraceString(th6);
        }
        printTag(10, str, str3, new java.lang.Object[0]);
    }
}
