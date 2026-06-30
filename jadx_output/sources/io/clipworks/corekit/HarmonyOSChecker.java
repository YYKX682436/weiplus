package io.clipworks.corekit;

/* loaded from: classes4.dex */
public final class HarmonyOSChecker {
    private static final java.lang.String HARMONY_OS = "harmony";
    private static final java.lang.String TAG = "HarmonyOSChecker";
    private static boolean isInitialized = false;
    private static java.lang.String osBrand = "";
    private static java.lang.String osVersion = "";

    public static synchronized int getMajorVer() {
        synchronized (io.clipworks.corekit.HarmonyOSChecker.class) {
            if (!isInitialized()) {
                throw new java.lang.IllegalStateException("Checker not inited");
            }
            if (android.text.TextUtils.isEmpty(osVersion)) {
                return -1;
            }
            java.lang.String[] split = osVersion.split("\\.");
            if (split.length <= 0) {
                return -1;
            }
            return java.lang.Integer.parseInt(split[0]);
        }
    }

    public static synchronized java.lang.String getOsVersion() {
        java.lang.String str;
        synchronized (io.clipworks.corekit.HarmonyOSChecker.class) {
            if (!isInitialized()) {
                throw new java.lang.IllegalStateException("Checker not inited");
            }
            str = osVersion;
        }
        return str;
    }

    public static synchronized void init() {
        synchronized (io.clipworks.corekit.HarmonyOSChecker.class) {
            if (!isInitialized) {
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.system.BuildEx");
                    osBrand = (java.lang.String) cls.getMethod("getOsBrand", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
                    java.lang.Class<?> cls2 = java.lang.Class.forName("ohos.system.version.SystemVersion");
                    osVersion = (java.lang.String) cls2.getMethod("getVersion", new java.lang.Class[0]).invoke(cls2, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
                isInitialized = true;
            }
        }
    }

    public static synchronized boolean isHarmonyOS() {
        boolean equals;
        synchronized (io.clipworks.corekit.HarmonyOSChecker.class) {
            if (!isInitialized()) {
                throw new java.lang.IllegalStateException("Checker not inited");
            }
            equals = HARMONY_OS.equals(osBrand);
        }
        return equals;
    }

    public static synchronized boolean isInitialized() {
        boolean z17;
        synchronized (io.clipworks.corekit.HarmonyOSChecker.class) {
            z17 = isInitialized;
        }
        return z17;
    }
}
