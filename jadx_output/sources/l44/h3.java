package l44;

/* loaded from: classes4.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f316165a;

    public static void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkRespHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdResp", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1724, 5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdResp", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            if (w34.a.a() && w34.d.c()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportRespIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1724, 3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportRespIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                if (w34.d.b() == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportRespIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    g0Var.A(1724, 4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportRespIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRespHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
    }

    public static byte[] b(java.lang.String str, int i17, boolean z17, long j17, boolean z18) {
        boolean z19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1724, 6);
            jSONObject.put("ua", v34.b.e());
            boolean c17 = w34.d.c();
            if (w34.a.a() && c17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportReqIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1724, 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportReqIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("is_harmony_os", c17);
                jSONObject2.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_OS_VERSION, w34.d.a("hw_sc.build.platform.version"));
                int b17 = w34.d.b();
                if (b17 == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportReqIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    g0Var.A(1724, 2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportReqIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                }
                jSONObject2.put("harmony_pure_mode", b17);
                jSONObject.put("HarmonyInfo", jSONObject2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                jSONObject.put("sessionKeyAd", str);
            }
            java.lang.String c18 = c();
            if (com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
                g0Var.A(1724, 9);
            } else {
                jSONObject.put("oaid", c18);
                g0Var.A(1724, 7);
            }
            org.json.JSONObject d17 = d();
            if (d17 != null) {
                jSONObject.put("webview_ua_info", d17);
                g0Var.A(1724, 8);
            }
            jSONObject.put("adPullRecords", com.tencent.mm.plugin.sns.storage.w0.y0());
            if (e()) {
                jSONObject.put("supportCapability", l44.e.a());
            }
            java.lang.String e17 = m54.j.e();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                jSONObject.put("vangoghLibVersion", e17);
            }
            org.json.JSONObject a17 = l44.f3.a();
            if (a17 != null) {
                jSONObject.putOpt("localAdRecords", a17);
            }
            synchronized (l44.h3.class) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                z19 = f316165a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            }
            jSONObject.putOpt("oldSnsTimeline", java.lang.Boolean.valueOf(z19));
            r34.h.a(jSONObject, i17, j17, z17, z18);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.lang.String jSONObject3 = jSONObject.toString();
            com.tencent.mars.xlog.Log.i("AdPassThroughInfoHelper", "getAdPassThroughInfo, timeCost = " + (currentTimeMillis2 - currentTimeMillis) + ", ret = " + jSONObject3);
            byte[] bytes = jSONObject3.getBytes();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return bytes;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", th6.toString());
            byte[] bArr = new byte[0];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return bArr;
        }
    }

    public static java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        java.lang.String d17 = v34.b.d();
        com.tencent.mars.xlog.Log.i("AdPassThroughInfoHelper", "getOAID, value=" + d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        return d17;
    }

    public static org.json.JSONObject d() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            if (w34.a.d()) {
                str = w34.c.d(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                str = "";
            }
            com.tencent.mars.xlog.Log.i("AdPassThroughInfoHelper", "getWebViewBuildInfoJson, value=" + str);
            if (!android.text.TextUtils.isEmpty(str)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                return jSONObject;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", "getWebViewBuildInfoJson, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        return null;
    }

    public static boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_req_support_hevc_and_webp, 1);
            com.tencent.mars.xlog.Log.i("AdPassThroughInfoHelper", "isReqSupportHevcAndWebP, value is " + Ni);
            boolean z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", "isReqSupportHevcAndWebP, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return true;
        }
    }

    public static void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        ((ku5.t0) ku5.t0.f312615d).g(new l44.g3(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
    }
}
