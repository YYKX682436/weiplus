package w34;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f442718a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f442719b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.lang.String f442720c;

    static {
        new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentHashMap();
        f442720c = "";
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static java.lang.String a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long currentTimeMillis;
        boolean e17;
        org.json.JSONObject a17;
        long currentTimeMillis2;
        long j17;
        long j18;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        java.lang.String str5 = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetWebViewUAInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            currentTimeMillis = java.lang.System.currentTimeMillis();
            e17 = w34.a.e();
            java.lang.String b17 = x34.a.b(context, e17);
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            a17 = x34.b.a(context);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (b17 == null) {
                b17 = "";
            }
            a17.put("chrome_version", b17);
            currentTimeMillis2 = java.lang.System.currentTimeMillis();
            j17 = currentTimeMillis3 - currentTimeMillis;
            j18 = currentTimeMillis2 - currentTimeMillis3;
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "access$100";
            str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
            str3 = "doGetWebViewUAInfo";
        }
        if (j17 >= 2000 || j18 >= 1000) {
            try {
            } catch (java.lang.Throwable th7) {
                th = th7;
                str3 = "doGetWebViewUAInfo";
                str = "access$100";
                str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
                com.tencent.mars.xlog.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 5);
                ca4.e0.a("webview_ua_info", "webViewUAInfoErr", 0, 0, th.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return str5;
            }
            if (java.lang.System.currentTimeMillis() % 10 == 0) {
                str = "access$100";
                str4 = "doGetWebViewUAInfo";
                try {
                    ca4.e0.a("webview_ua_info", "ua_time_cost", (int) j17, (int) j18, "");
                    java.lang.String jSONObject = a17.toString();
                    com.tencent.mars.xlog.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, visitDexOrODex=" + e17 + ", chromeVerCost=" + j17 + ", total=" + (currentTimeMillis2 - currentTimeMillis) + ", info=" + jSONObject);
                    str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str2);
                    str5 = jSONObject;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
                    str3 = str4;
                    com.tencent.mars.xlog.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 5);
                    ca4.e0.a("webview_ua_info", "webViewUAInfoErr", 0, 0, th.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                    return str5;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return str5;
            }
        }
        str4 = "doGetWebViewUAInfo";
        str = "access$100";
        java.lang.String jSONObject2 = a17.toString();
        com.tencent.mars.xlog.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, visitDexOrODex=" + e17 + ", chromeVerCost=" + j17 + ", total=" + (currentTimeMillis2 - currentTimeMillis) + ", info=" + jSONObject2);
        str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str2);
        str5 = jSONObject2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return str5;
    }

    public static java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f442719b)) {
                java.lang.String str = f442719b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                return str;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String property = java.lang.System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            f442719b = property;
            com.tencent.mars.xlog.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", sysUa" + f442719b);
            java.lang.String str2 = f442719b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str2;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent: " + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return "";
        }
    }

    public static java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f442718a)) {
            java.lang.String str = f442718a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        try {
            java.lang.String n17 = wo.w0.n();
            f442718a = n17;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                com.tencent.mars.xlog.Log.w("AdDeviceInfo.DeviceInfoUtils", "oaid is empty");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getOAID: " + th6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1896, 12);
            ca4.e0.a("oaid_empty2", "exp", 0, 0, "");
        }
        java.lang.String str2 = f442718a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return str2;
    }

    public static java.lang.String d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 8);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 9);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f442720c)) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 10);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1893, 11);
            }
            java.lang.String str = f442720c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new w34.b());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String c17 = p34.o.c("wv_ua_info");
        com.tencent.mars.xlog.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, useLocal, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", value=" + c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return c17;
    }
}
