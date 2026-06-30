package l44;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f316428a;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f316428a = arrayList;
        java.util.Collections.addAll(arrayList, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 24);
    }

    public static ca4.c a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", str + ": adReportParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (jSONObject.has("bizInfo") && jSONObject.has("sourceInfo")) {
                java.lang.String optString = jSONObject.optString("bizInfo");
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", str + ": uxInfo is isNullOrNil");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                java.lang.String optString2 = jSONObject.optString("sourceInfo");
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                    com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", str + ": sourceInfo is isNullOrNil");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                if (!jSONObject2.has("wxad") && !jSONObject2.has("xjad")) {
                    com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", str + ": sourceParams not has wxad or xjad");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                org.json.JSONObject optJSONObject = jSONObject2.has("wxad") ? jSONObject2.optJSONObject("wxad") : jSONObject2.has("xjad") ? jSONObject2.optJSONObject("xjad") : null;
                if (optJSONObject == null) {
                    com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", str + ": sourceJsonObj is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                ca4.c x17 = ca4.m0.x(optString);
                x17.f39844a = optString;
                x17.f39845b = jSONObject2;
                x17.f39846c = optJSONObject;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                return x17;
            }
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", str + ": adReportJsonParams not has bizInfo or sourceInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", str + ": exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return null;
        }
    }

    public static void b(int i17, java.lang.String str) {
        ca4.c a17;
        da4.i a18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportAdDownload: adReportParams is " + str);
            a17 = a("reportAdDownload", str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportAdDownload: exp is " + th6);
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportAdDownload: adCommonData is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        org.json.JSONObject jSONObject = a17.f39845b;
        org.json.JSONObject jSONObject2 = a17.f39846c;
        if (jSONObject != null && jSONObject2 != null) {
            if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.SOURCE) != null) {
                ca4.f fVar = new ca4.f();
                fVar.m(i17);
                fVar.o(a17.f39844a);
                fVar.p(a17.f39847d);
                fVar.n(a17.f39848e);
                fVar.q(a17.f39849f);
                fVar.k(4);
                fVar.d(str);
                a84.t0.a(fVar.a());
                if (i17 == 4001010 && (a18 = da4.i.a(jSONObject2.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME), 1, 1, "", a17.f39844a, "", null, false, str)) != null) {
                    da4.h.i(a18);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportAdDownload: sourceParams or sourceJsonObj is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void c(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAppMarketDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001002);
            fVar.o(dVar.f39851a);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(1);
            fVar.j(dVar.f39863m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportAppMarketDialogConfirm, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAppMarketDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void d(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAppMarketDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001018);
            fVar.o(dVar.f39851a);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(1);
            fVar.j(dVar.f39863m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportAppMarketDialogShow, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAppMarketDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void e(ca4.d dVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAppMarketInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001017);
            fVar.k(i17);
            fVar.o(dVar.f39851a);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.g(dVar.f39859i);
            fVar.j(dVar.f39863m);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(dVar.f39855e)) {
                fVar.d(dVar.f39855e);
            }
            if (i17 == 3) {
                fVar.f(dVar.f39852b);
                fVar.l(dVar.f39853c);
            }
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportAppMarketInstallComplete, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAppMarketInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void f(ca4.d dVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAppMarketOpen", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001016);
            fVar.k(i17);
            fVar.o(dVar.f39851a);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.j(dVar.f39863m);
            if (i17 == 3) {
                fVar.f(dVar.f39852b);
                fVar.l(dVar.f39853c);
            }
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportAppMarketOpen, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAppMarketOpen", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void g(ca4.d dVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAppMarketStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001014);
            fVar.k(i17);
            fVar.o(dVar.f39851a);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.j(dVar.f39863m);
            if (i17 == 3) {
                fVar.f(dVar.f39852b);
                fVar.l(dVar.f39853c);
            }
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportAppMarketStart, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAppMarketStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void h(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCancelDownloadTaskStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportCancelDownloadTaskStart but params is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCancelDownloadTaskStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        ca4.f fVar = new ca4.f();
        fVar.m(4001074);
        fVar.o(dVar.f39851a);
        fVar.f(dVar.f39852b);
        fVar.l(dVar.f39853c);
        fVar.c(dVar.f39854d);
        fVar.p(dVar.f39856f);
        fVar.n(dVar.f39857g);
        fVar.q(dVar.f39858h);
        fVar.k(dVar.f39860j);
        a84.t0.a(fVar.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCancelDownloadTaskStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void i(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDeepLinkDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4002009);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.h(dVar.f39861k);
            fVar.j(dVar.f39863m);
            fVar.i(1);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkDialogConfirm, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDeepLinkDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void j(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDeepLinkDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4002007);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.h(dVar.f39861k);
            fVar.j(dVar.f39863m);
            fVar.i(1);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkDialogShow, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDeepLinkDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void k(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDeepLinkStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4002001);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.h(dVar.f39861k);
            fVar.j(dVar.f39863m);
            fVar.i(1);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkStart, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDeepLinkStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void l(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001002);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(4);
            fVar.e(dVar.f39862l);
            fVar.j(dVar.f39863m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDialogConfirm, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void m(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001018);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(4);
            fVar.e(dVar.f39862l);
            fVar.j(dVar.f39863m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDialogShow, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void n(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportHalfScreenClose", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001071);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(5);
            fVar.g(dVar.f39859i);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenClose, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportHalfScreenClose", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void o(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportHalfScreenOpenStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001065);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(5);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenOpenStart, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportHalfScreenOpenStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void p(ca4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportHalfScreenOpenStartFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001066);
            fVar.o(dVar.f39851a);
            fVar.f(dVar.f39852b);
            fVar.l(dVar.f39853c);
            fVar.c(dVar.f39854d);
            fVar.p(dVar.f39856f);
            fVar.n(dVar.f39857g);
            fVar.q(dVar.f39858h);
            fVar.k(5);
            fVar.g(dVar.f39859i);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenOpenStartFinish, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportHalfScreenOpenStartFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void q(boolean z17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        ca4.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        if (adXml == null) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, adXml is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        try {
            com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i17);
            if (z17) {
                fVar = new ca4.f();
                fVar.m(4001019);
            } else {
                fVar = new ca4.f();
                fVar.m(4001020);
            }
            fVar.o(adInfo.uxInfo);
            fVar.c(adXml.adExtInfo);
            fVar.p(adInfo.aid);
            fVar.n(adInfo.traceid);
            fVar.q(adInfo.pId);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void r(boolean z17, k94.a aVar) {
        ca4.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, exp is " + th6.toString());
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, deeplinkReportInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        if (z17) {
            fVar = new ca4.f();
            fVar.m(4001019);
        } else {
            fVar = new ca4.f();
            fVar.m(4001020);
        }
        fVar.o(aVar.f305932a);
        fVar.c("");
        fVar.p(aVar.f305933b);
        fVar.n(aVar.f305934c);
        fVar.q(aVar.f305935d);
        a84.t0.a(fVar.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void s(boolean z17, java.lang.String str) {
        ca4.c a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: adReportParams is " + str);
            a17 = a("reportLaunchApplicationAppInstallStatus", str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: exp is " + th6);
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: adCommonData is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        org.json.JSONObject jSONObject = a17.f39845b;
        org.json.JSONObject jSONObject2 = a17.f39846c;
        if (jSONObject != null && jSONObject2 != null) {
            ca4.f fVar = new ca4.f();
            fVar.o(a17.f39844a);
            fVar.p(a17.f39847d);
            fVar.n(a17.f39848e);
            fVar.q(a17.f39849f);
            fVar.d(str);
            if (z17) {
                fVar.m(4001019);
            } else {
                fVar.m(4001020);
            }
            if (jSONObject.has("wxad")) {
                if (jSONObject2.optInt(ya.b.SOURCE) == 4) {
                    com.tencent.mars.xlog.Log.w("AdConversionOnlineReportHelper", "source is wxad market download");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return;
                } else if (jSONObject2.opt(ya.b.SOURCE) != null) {
                    fVar.h(1);
                    fVar.i(1);
                    a84.t0.a(fVar.a());
                }
            } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.SOURCE) != null) {
                fVar.h(3);
                fVar.i(1);
                a84.t0.a(fVar.a());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: sourceParams or sourceJsonObj is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void t(i64.a aVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClick, params is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = aVar.f289052j;
        if (snsAdClick == null) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClick, snsAdClick is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClick, eventId is " + i17 + ", exp is " + th6.toString());
        }
        if (f316428a.contains(java.lang.Integer.valueOf(snsAdClick.f71469g))) {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportTimelineAdClick, except current click pos, the pos is " + snsAdClick.f71469g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        ca4.f fVar = new ca4.f();
        fVar.m(i17);
        fVar.o(aVar.f289053k);
        fVar.c(aVar.f289054l);
        fVar.p(aVar.f289055m);
        fVar.n(aVar.f289056n);
        fVar.q(aVar.f289057o);
        a84.t0.a(fVar.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }
}
