package x44;

/* loaded from: classes4.dex */
public final class a0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        jz5.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("canvasKey");
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.DynamicCanvas", "the dynamic canvas key is empty!!!");
            b(g("the key is empty!!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
            return;
        }
        m54.l b17 = env.b();
        java.lang.String h17 = b17.h();
        java.lang.String a17 = h17 == null || h17.length() == 0 ? "" : l64.a.a(b17.h());
        m54.j jVar = m54.j.f324282a;
        kotlin.jvm.internal.o.d(optString);
        m54.y c17 = jVar.c(optString);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
        android.graphics.Point h18 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        try {
            lVar = new jz5.l(java.lang.Integer.valueOf(h18.x), java.lang.Integer.valueOf(h18.y));
        } catch (java.lang.Throwable unused) {
            lVar = new jz5.l(0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
        if (m54.j.h(c17)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("dynamicCanvas", c17.a());
            jSONObject.put("dynamicInfo", b17.D());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicCanvasExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            java.lang.String str = b17.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicCanvasExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jSONObject.put("dynamicExtInfo", str != null ? str : "");
            jSONObject.put("adType", b17.C());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutIndex", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            int i17 = b17.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutIndex", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("outIndex", i17);
            jSONObject.put("canvasKey", b17.F());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecSrc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            int i18 = b17.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecSrc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("isRecSrc", i18 == 2);
            jSONObject.put("openAudio", b17.t());
            jSONObject.put("aid", b17.c());
            jSONObject.put("traceId", b17.m());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOriginSource", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            int g17 = b17.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOriginSource", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("originSource", g17);
            jSONObject.put(ya.b.SOURCE, b17.l());
            jSONObject.put("uxInfo", a54.h.a(b17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            java.lang.String str2 = b17.f2863f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            jSONObject.put("uin", str2);
            jSONObject.put("pId", ca4.m0.L(a54.h.a(b17)));
            jSONObject.put("commonDeviceInfo", v34.b.b());
            jSONObject.put("screenWidth", ((java.lang.Number) lVar.f302833d).intValue());
            jSONObject.put("screenHeight", ((java.lang.Number) lVar.f302834e).intValue());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            long j17 = b17.f2875r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            jSONObject.put("outPlaybackTime", j17);
            jSONObject.put("bizAppId", a17);
            if (b17.E() == 1) {
                jSONObject.put("halfScreenMode", false);
                jSONObject.put("halfScreenPageHeight", 0);
            } else {
                jSONObject.put("halfScreenMode", b17.s());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                int i19 = b17.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                jSONObject.put("halfScreenPageHeight", i19);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForbidBackToBizApp", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            boolean z18 = b17.O;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForbidBackToBizApp", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("forbidBackToBizApp", z18);
            m(jSONObject);
            b(jSONObject);
        } else {
            b(w44.d.k(this, -1, "there is no page data", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
    }
}
