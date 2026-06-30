package m54;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.j0 f324287a = new m54.j0();

    public final void a(int i17, int i18, m54.l pageParam) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
        kotlin.jvm.internal.o.g(pageParam, "pageParam");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(i17);
            fVar.o(a54.h.a(pageParam));
            fVar.q(ca4.m0.L(a54.h.a(pageParam)));
            java.lang.String c17 = pageParam.c();
            java.lang.String str = "";
            if (c17 == null) {
                c17 = "";
            }
            fVar.p(c17);
            java.lang.String m17 = pageParam.m();
            if (m17 != null) {
                str = m17;
            }
            fVar.n(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39890s = 10;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39873b = 14;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            java.lang.String b17 = m54.i0.b(pageParam);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39893v = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.l(pageParam.l());
            java.lang.String e17 = m54.j.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39894w = e17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            if (i18 > 0) {
                fVar.g(i18);
            }
            if (i17 == 4003056) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontPageStateInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
                java.lang.String str2 = pageParam.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontPageStateInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageExitAction", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                fVar.f39891t = str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageExitAction", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 3);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 2);
                if (!pageParam.s()) {
                    g0Var.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 4);
                } else if (pageParam.E() == 1) {
                    g0Var.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 5);
                } else {
                    g0Var.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 6);
                }
            }
            a84.t0.b("sns_ad_vangogh_page", fVar.a().j());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghPageReporter", "VangoghPageReporter::reportPageEvent error : " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
    }

    public final void b(android.os.Bundle data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageFailed", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(data, "sns_landing_pages_traceid");
            java.lang.String str = "";
            if (k17 == null) {
                k17 = "";
            }
            java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(data, "sns_landing_pages_aid");
            if (k18 == null) {
                k18 = "";
            }
            java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(data, "sns_landing_pages_ux_info");
            if (k19 == null) {
                k19 = "";
            }
            java.lang.String k27 = com.tencent.mm.sdk.platformtools.c2.k(data, "sns_landing_page_canvas_dynamicinfo");
            if (k27 == null) {
                k27 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            if (k27.length() == 0) {
                com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            } else {
                try {
                    java.lang.String optString = new org.json.JSONObject(k27).optString("vangogh_id");
                    if (optString != null) {
                        str = optString;
                    }
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            }
            java.lang.String e17 = m54.j.e();
            ca4.f fVar = new ca4.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39890s = 10;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39873b = 14;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39893v = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.m(4003009);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginErrorCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39892u = 50100;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginErrorCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.p(k18);
            fVar.n(k17);
            fVar.q(ca4.m0.L(k19));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f39894w = e17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            a84.t0.b("sns_ad_vangogh_page", fVar.a().j());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghPageReporter", "VangoghPageReporter::reportPageFailed error : " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageFailed", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
    }

    public final void c(int i17, com.tencent.mm.plugin.sns.storage.ADInfo adInfo, java.lang.String dynamicCanvasInfo, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVangoghPreload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        kotlin.jvm.internal.o.g(dynamicCanvasInfo, "dynamicCanvasInfo");
        java.lang.String str = adInfo.uxInfo;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        ca4.f fVar = new ca4.f();
        fVar.m(i17);
        fVar.o(str);
        java.lang.String str3 = adInfo.pId;
        if (str3 == null) {
            str3 = "";
        }
        fVar.q(str3);
        java.lang.String str4 = adInfo.aid;
        if (str4 == null) {
            str4 = "";
        }
        fVar.p(str4);
        java.lang.String str5 = adInfo.traceid;
        if (str5 == null) {
            str5 = "";
        }
        fVar.n(str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f39890s = 10;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f39873b = 14;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        if (dynamicCanvasInfo.length() == 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        } else {
            try {
                java.lang.String optString = new org.json.JSONObject(dynamicCanvasInfo).optString("vangogh_id");
                if (optString != null) {
                    str2 = optString;
                }
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f39893v = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.l(0);
        java.lang.String e17 = m54.j.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f39894w = e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.g(i18);
        a84.t0.b("sns_ad_vangogh_page", fVar.a().j());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVangoghPreload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
    }
}
