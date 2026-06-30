package com.tencent.youtu.ytcommon.tools;

/* loaded from: classes14.dex */
public class YTException {
    public static void report(java.lang.Exception exc) {
        exc.getClass();
        com.tencent.youtu.ytcommon.tools.YTLogger.e("YTException", "[YTException.report] ");
    }

    public static void report(java.lang.Exception exc, java.lang.String str, java.lang.String str2) {
        exc.getClass();
        com.tencent.youtu.ytcommon.tools.YTLogger.w("YTException" + str, str2);
    }
}
