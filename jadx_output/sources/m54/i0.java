package m54;

/* loaded from: classes4.dex */
public abstract class i0 {
    public static final void a(m54.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillWithAdInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
        if (lVar != null) {
            java.lang.String B = lVar.B();
            if (!(B == null || B.length() == 0)) {
                try {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(lVar.B(), "ADInfo", null);
                    if (d17 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillWithAdInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
                        return;
                    }
                    java.lang.String o17 = lVar.o();
                    if (o17 == null || o17.length() == 0) {
                        java.lang.String str = (java.lang.String) d17.get(".ADInfo.uxInfo");
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str == null) {
                            str = "";
                        }
                        lVar.z(str);
                    }
                    java.lang.String c17 = lVar.c();
                    if (c17 == null || c17.length() == 0) {
                        java.lang.String str2 = (java.lang.String) d17.get(".ADInfo.session_data.aid");
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        lVar.v(str2);
                    }
                    java.lang.String m17 = lVar.m();
                    if (m17 == null || m17.length() == 0) {
                        java.lang.String str3 = (java.lang.String) d17.get(".ADInfo.session_data.trace_id");
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        lVar.y(str3);
                    }
                    java.lang.String p17 = lVar.p();
                    if (p17 == null || p17.length() == 0) {
                        java.lang.String str4 = (java.lang.String) d17.get(".ADInfo.viewid");
                        if (str4 == null) {
                            str4 = "";
                        }
                        lVar.A(str4);
                    }
                    java.lang.String f17 = lVar.f();
                    if (f17 == null || f17.length() == 0) {
                        java.lang.String str5 = (java.lang.String) d17.get(".ADInfo.commInfo");
                        java.lang.String str6 = str5 != null ? str5 : "";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                        lVar.f2872o = str6;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillWithAdInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
                    return;
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the parse ad info xml failed!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillWithAdInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAd.PageParameter", "this object is null, or ad info is empty!!!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillWithAdInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
    }

    public static final java.lang.String b(m54.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
        java.lang.String str = "";
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the parameter object is null when get vangogh id");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
            return "";
        }
        java.lang.String D = lVar.D();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        if (D.length() == 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        } else {
            try {
                java.lang.String optString = new org.json.JSONObject(D).optString("vangogh_id");
                if (optString != null) {
                    str = optString;
                }
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
        return str;
    }

    public static final void c(m54.l lVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWithIntentExtra", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
        if (lVar == null || bundle == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.PageParameter", "this object is null, or extras is null!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithIntentExtra", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
            return;
        }
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_share_sns_id");
        if (k17 == null) {
            k17 = "";
        }
        lVar.x(k17);
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_page_dynamic_canvas_query_key");
        if (k18 == null) {
            k18 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.f324291J = k18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.w(java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.c2.h(bundle, "sns_landing_pages_pageid", 0L)));
        java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_page_canvas_dynamicinfo");
        if (k19 == null) {
            k19 = "";
        }
        lVar.J(k19);
        java.lang.String k27 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_page_canvas_ext_dynamicinfo");
        if (k27 == null) {
            k27 = "";
        }
        lVar.I(k27);
        java.lang.String k28 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_ux_info");
        if (k28 == null) {
            k28 = "";
        }
        lVar.z(k28);
        java.lang.String k29 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_aid");
        if (k29 == null) {
            k29 = "";
        }
        lVar.v(k29);
        java.lang.String k37 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_traceid");
        if (k37 == null) {
            k37 = "";
        }
        lVar.y(k37);
        com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_extra");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExtraData", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExtraData", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "sns_landing_pages_rec_src", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecSrc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.C = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecSrc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        int f18 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "sns_landing_pages_from_outer_index", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOutIndex", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.D = f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOutIndex", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        int f19 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "sns_landig_pages_origin_from_source", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginSource", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.f2858a = f19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginSource", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        int f27 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "sns_landig_pages_from_source", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.f2859b = f27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        boolean b17 = com.tencent.mm.sdk.platformtools.c2.b(bundle, "sns_landing_is_native_sight_ad", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNativeAd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.f2860c = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNativeAd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        java.lang.String k38 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_ad_info");
        if (k38 == null) {
            k38 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdInfoXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.I = k38;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdInfoXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        java.lang.String k39 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_extra_param");
        java.lang.String str = k39 != null ? k39 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOutExtraParam", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.f2876s = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOutExtraParam", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        long h17 = com.tencent.mm.sdk.platformtools.c2.h(bundle, "sns_landing_page_sight_video_seek_time", 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.f2875r = h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        long h18 = com.tencent.mm.sdk.platformtools.c2.h(bundle, "sns_landing_pages_local_cache_time", 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.N = h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        int f28 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "sns_landing_page_half_screen_presentation_style", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenPresentationStyle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        lVar.E = f28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenPresentationStyle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        boolean b18 = com.tencent.mm.sdk.platformtools.c2.b(bundle, "sns_landing_page_half_screen_forbid_slide_top", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsHalfScreenForbidSlideToTop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.A = b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsHalfScreenForbidSlideToTop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        boolean b19 = com.tencent.mm.sdk.platformtools.c2.b(bundle, "sns_landing_page_open_from_half_screen_mode", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        lVar.f2881x = b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithIntentExtra", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
    }

    public static final void d(m54.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supplySomeId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
        if (lVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supplySomeId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
            return;
        }
        if (android.text.TextUtils.isEmpty(lVar.c()) && !android.text.TextUtils.isEmpty(a54.h.a(lVar))) {
            lVar.v(ca4.m0.D(a54.h.a(lVar)));
        }
        if (android.text.TextUtils.isEmpty(lVar.m()) && !android.text.TextUtils.isEmpty(a54.h.a(lVar))) {
            lVar.y(ca4.m0.P(a54.h.a(lVar)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supplySomeId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageParamUtilKt");
    }
}
