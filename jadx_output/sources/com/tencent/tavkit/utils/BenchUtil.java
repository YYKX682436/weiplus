package com.tencent.tavkit.utils;

/* loaded from: classes.dex */
public class BenchUtil {
    private static final java.lang.String TAG = "BenchUtil";
    private static java.util.Map<java.lang.String, java.lang.Long> startTimeMap = new java.util.HashMap();
    private static java.util.Map<java.lang.String, java.lang.Long> endTimeMap = new java.util.HashMap();
    public static boolean ENABLE_DEBUG = false;

    public static long benchEnd(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Long> map;
        java.lang.Long l17;
        if (!ENABLE_DEBUG || android.text.TextUtils.isEmpty(str) || (map = startTimeMap) == null || (l17 = map.get(str)) == null) {
            return 0L;
        }
        return java.lang.System.currentTimeMillis() - l17.longValue();
    }

    public static void benchStart(java.lang.String str) {
        if (!ENABLE_DEBUG || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        startTimeMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static void clear() {
        startTimeMap.clear();
        endTimeMap.clear();
    }

    public static void setEnableDebugLog(boolean z17) {
        ENABLE_DEBUG = z17;
    }
}
