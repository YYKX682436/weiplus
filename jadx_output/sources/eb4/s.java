package eb4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final eb4.s f250916a = new eb4.s();

    public static final void a(java.lang.String str, yz5.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        boolean z17 = M.getBoolean("canAutoFillData", false);
        com.tencent.mars.xlog.Log.i("RequestGeoLocationHelper", "getCanAutoFillData() called " + z17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", "0");
        hashMap.put("status", z17 ? "true" : "false");
        if (qVar != null) {
            qVar.invoke(str, "ok", hashMap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    public static final void c(java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, boolean z18, yz5.a aVar, yz5.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        if (M.getBoolean("canRequestLBS", false)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            eb4.s sVar = f250916a;
            ab4.n0 b17 = sVar.b(context);
            java.lang.String k17 = b17 != null ? b17.k() : null;
            if (k17 == null) {
                k17 = "";
            }
            jSONObject.put("snsid", k17);
            java.lang.String o17 = b17 != null ? b17.o() : null;
            jSONObject.put("uxinfo", o17 != null ? o17 : "");
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, b17 != null ? b17.l() : 0);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "ad");
            jSONObject2.put("status", "ok");
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("location_ad_auth_report", jSONObject3);
            if (aVar != null) {
                aVar.invoke();
            }
            sVar.d(str, str2, context, z18, qVar);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLBSAuthDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0);
            z2Var.m(context.getString(com.tencent.mm.R.string.f490347sg), context.getString(com.tencent.mm.R.string.f490507x1));
            z2Var.o(0);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            eb4.q qVar2 = new eb4.q(qVar, str, z2Var);
            eb4.r rVar = new eb4.r(aVar, str, str2, context, z18, qVar, z2Var);
            eb4.n nVar = new eb4.n(z17, qVar2, c0Var, z2Var);
            eb4.o oVar = new eb4.o(z17, rVar, c0Var, z2Var);
            z2Var.D = nVar;
            z2Var.E = oVar;
            if (z17) {
                z2Var.l(new eb4.p(c0Var, rVar, qVar2));
            }
            z2Var.j(com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489489cp5, (android.view.ViewGroup) null));
            z2Var.C();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLBSAuthDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    public static final void e(java.lang.String str, java.lang.String str2, yz5.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, "true");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        M.putBoolean("canAutoFillData", b17);
        com.tencent.mars.xlog.Log.i("RequestGeoLocationHelper", "setCanAutoFillData() called " + b17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", "0");
        if (qVar != null) {
            qVar.invoke(str2, "ok", hashMap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    public final ab4.n0 b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        kotlin.jvm.internal.o.g(context, "<this>");
        ab4.n0 A7 = context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context).A7() : context instanceof com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity ? ((com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity) context).T6() : new ab4.n0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        return A7;
    }

    public final void d(java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, yz5.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestSystemLbs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        eb4.m mVar = new eb4.m(str, qVar, context, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        r54.d dVar = null;
        if (context != null) {
            try {
                dVar = new r54.d(context, mVar);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        }
        if (dVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            com.tencent.mm.sdk.platformtools.n3 n3Var = dVar.f392733c;
            java.lang.Runnable runnable = dVar.f392736f;
            try {
                n3Var.removeCallbacks(runnable);
                n3Var.postDelayed(runnable, 20000L);
                dVar.f392735e = str2;
                if (dVar.e()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().geoLocation(str2, dVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                }
            } catch (java.lang.Throwable unused2) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestSystemLbs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }
}
