package com.tencent.youtu.ytcommon.tools;

/* loaded from: classes14.dex */
public class YTLogger {
    private static com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger;
    private static boolean sEnableLog;
    private static boolean sEnableNativeLog;

    /* loaded from: classes14.dex */
    public interface IFaceLiveLogger {
        void d(java.lang.String str, java.lang.String str2);

        void e(java.lang.String str, java.lang.String str2);

        void i(java.lang.String str, java.lang.String str2);

        void v(java.lang.String str, java.lang.String str2);

        void w(java.lang.String str, java.lang.String str2);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.d(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger2 = iFaceLiveLogger;
        if (iFaceLiveLogger2 != null) {
            iFaceLiveLogger2.e(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.i(str, str2);
        }
    }

    public static boolean isEnableLog() {
        return sEnableLog;
    }

    public static boolean isEnableNativeLog() {
        return sEnableNativeLog;
    }

    public static void setIsEnabledLog(boolean z17) {
        sEnableLog = z17;
    }

    public static void setIsEnabledNativeLog(boolean z17) {
        sEnableNativeLog = z17;
    }

    public static void setLog(com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger2) {
        iFaceLiveLogger = iFaceLiveLogger2;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.v(str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.w(str, str2);
        }
    }
}
