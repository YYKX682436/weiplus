package v34;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f433164a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f433165b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f433166c;

    /* renamed from: d, reason: collision with root package name */
    public int f433167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f433170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f433171h;

    public static v34.a a(v34.a aVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        aVar.f433170g = z17;
        aVar.f433171h = z18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (w34.a.b()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genOAID", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar.f433164a = w34.c.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genOAID", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1896, 11);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        if (w34.a.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar.f433165b = w34.d.c();
            aVar.f433166c = w34.d.a("hw_sc.build.platform.version");
            aVar.f433167d = w34.d.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        }
        if (w34.a.d()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar.f433168e = w34.c.d(aVar.f433171h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 6);
        }
        if (w34.a.c()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genSysUa", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar.f433169f = w34.c.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSysUa", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        }
        com.tencent.mars.xlog.Log.i("AdDeviceInfo", "genAllDeviceInfo, timeCost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", isForJsapi=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        return aVar;
    }

    public static java.lang.String b(v34.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        aVar.getClass();
        java.lang.String str = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildPartDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        try {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1896, 1);
            java.lang.System.currentTimeMillis();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f433164a)) {
                jSONObject.put("oaid", aVar.f433164a);
                g0Var.A(1896, 4);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("imeiWx", (java.lang.Object) null);
                g0Var.A(1896, 3);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("deviceId", (java.lang.Object) null);
                g0Var.A(1896, 5);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("deviceId0", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("deviceId1", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("imei", (java.lang.Object) null);
                g0Var.A(1896, 2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("imei0", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("imei1", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("meid", (java.lang.Object) null);
                g0Var.A(1896, 7);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("meid0", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("meid1", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("subscriberId", (java.lang.Object) null);
                g0Var.A(1896, 6);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("uuid", (java.lang.Object) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                jSONObject.put("androidId", (java.lang.Object) null);
                g0Var.A(1896, 8);
            }
            if (w34.a.a() && aVar.f433165b) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("is_harmony_os", aVar.f433165b);
                jSONObject2.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_OS_VERSION, aVar.f433166c);
                jSONObject2.put("harmony_pure_mode", aVar.f433167d);
                jSONObject.put("HarmonyInfo", jSONObject2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f433168e)) {
                try {
                    jSONObject.put("uaBuildInfo", new org.json.JSONObject(aVar.f433168e));
                    g0Var.A(1896, 10);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 7);
                    ca4.e0.a("webview_ua_info", "webViewUAInfoErr", 1, 0, "");
                    com.tencent.mars.xlog.Log.e("AdDeviceInfo", "webViewUAInfo, info=" + aVar.f433168e + ", exp=" + e17.toString());
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f433169f)) {
                if (aVar.f433170g) {
                    jSONObject.put("sysUa", aVar.f433169f);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1896, 9);
            }
            java.lang.String jSONObject3 = jSONObject.toString();
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildPartDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            str = jSONObject3;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo", "buildPartDeviceInfo, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildPartDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
        return str;
    }
}
