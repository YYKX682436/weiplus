package x44;

/* loaded from: classes4.dex */
public final class i extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        data.optInt("reasonCode");
        data.optString("reasonMsg");
        java.lang.String F = env.b().F();
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.Downgrade", "the activity is null in downgrade method!!");
            b(g("the activity is null!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 10);
        env.b().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDowngradeCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDowngradeCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        env.b().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDowngradeMsg", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDowngradeMsg", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        if (m54.c0.f324250a.a(a17, F, env.b())) {
            com.tencent.mars.xlog.Log.i("SnsAd.Downgrade", "the downgrade has been handled");
            b(l());
            a17.finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        m54.y c17 = m54.j.f324282a.c(F);
        java.lang.String b17 = c17.b();
        boolean z17 = false;
        if (b17 == null || b17.length() == 0) {
            com.tencent.mars.xlog.Log.i("SnsAd.Downgrade", "the old canvas data is empty, don't jump!!!");
            b(w44.d.k(this, -1, "the old canvas xml is empty", null, 4, null));
            a17.finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        if (!za4.z0.u(c17.b())) {
            com.tencent.mars.xlog.Log.i("SnsAd.Downgrade", "the old canvas xml is invalid, don't jump!!!");
            b(w44.d.k(this, -1, "the canvas xml is invalid!", null, 4, null));
            a17.finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        m54.l b18 = env.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeIntent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landig_pages_from_source", b18.l());
        intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18.k())) {
            intent.putExtra("sns_landing_pages_share_sns_id", b18.k());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18.i())) {
            intent.putExtra("sns_landing_pages_pageid", b18.i());
        }
        intent.putExtra("sns_landing_is_native_sight_ad", b18.t());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18.B())) {
            intent.putExtra("sns_landing_pages_ad_info", b18.B());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a54.h.a(b18))) {
            intent.putExtra("sns_landing_pages_ux_info", a54.h.a(b18));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18.j())) {
            intent.putExtra("sns_landing_pages_rawSnsId", b18.j());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18.c())) {
            intent.putExtra("sns_landing_pages_aid", b18.c());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18.m())) {
            intent.putExtra("sns_landing_pages_traceid", b18.m());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeIntent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        android.app.Activity a18 = env.a();
        java.lang.String b19 = c17.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        a54.g.b(a18, intent, b19);
        intent.putExtra("sns_landing_pages_xml", b19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preCheckIsXmlOverSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (b19 != null && b19.length() >= 102400) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preCheckIsXmlOverSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (z17) {
            java.lang.String h17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.h(b19);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                intent.putExtra("sns_landing_pages_xml", "");
                intent.putExtra("sns_landing_pages_too_large_xml_path", h17);
            }
        }
        a84.d0.e(a18, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        b(l());
        a17.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
    }
}
