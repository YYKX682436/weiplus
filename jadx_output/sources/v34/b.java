package v34;

/* loaded from: classes4.dex */
public abstract class b {
    public static synchronized java.lang.String a() {
        java.lang.String b17;
        synchronized (v34.b.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            v34.a aVar = new v34.a();
            v34.a.a(aVar, false, false);
            b17 = v34.a.b(aVar);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (b17 == null) {
                b17 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        return b17;
    }

    public static synchronized java.lang.String b() {
        java.lang.String b17;
        synchronized (v34.b.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            v34.a aVar = new v34.a();
            v34.a.a(aVar, true, false);
            b17 = v34.a.b(aVar);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (b17 == null) {
                b17 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        return b17;
    }

    public static java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImeiWx", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImeiWx", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        return "";
    }

    public static java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        java.lang.String c17 = w34.a.b() ? w34.c.c() : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        return c17;
    }

    public static java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSysUserAgent", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        if (!w34.a.c()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSysUserAgent", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            return "";
        }
        java.lang.String b17 = w34.c.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSysUserAgent", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        return b17;
    }
}
