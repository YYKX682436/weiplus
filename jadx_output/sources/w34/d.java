package w34;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f442721a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f442722b = "";

    public static java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            if (c()) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f442722b)) {
                    java.lang.String str2 = f442722b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                    return str2;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: this aPhone supports HarmonyOS but propertyName is null or nil");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                    return "0.0.0";
                }
                f442722b = "0.0.0";
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                java.lang.String str3 = (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: propertyName is " + str + ", this aPhone supports HarmonyOS but harmonyOSVersion is null or nil");
                } else {
                    f442722b = str3;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: propertyName is " + str + ", " + th6.toString());
        }
        java.lang.String str4 = f442722b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return str4;
    }

    public static int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            if (c()) {
                int i17 = android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "pure_mode_state", -1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return i17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getPureMode: " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return -1;
    }

    public static boolean c() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            i17 = f442721a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.isSupportHarmonyOS: " + th6.toString());
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return true;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return false;
        }
        f442721a = 2;
        java.lang.Object d17 = d("com.huawei.system.BuildEx", "getOsBrand");
        if (d17 instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) d17;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && "harmony".equals(str)) {
                f442721a = 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return true;
            }
            com.tencent.mars.xlog.Log.i("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.isSupportHarmonyOS: this aPhone not supports HarmonyOS and osNameStr is " + str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return false;
    }

    public static java.lang.Object d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            java.lang.Object invoke = java.lang.Class.forName(str).getMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return invoke;
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "reflectInvokeStatic, error", e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.HarmonyOSUtils", "reflectInvokeStatic, error", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return null;
        }
    }
}
