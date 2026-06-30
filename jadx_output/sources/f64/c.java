package f64;

/* loaded from: classes4.dex */
public final class c extends g64.e {
    @Override // lc3.c0
    public java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        return "getAdPageDataSync";
    }

    @Override // g64.e
    public lc3.a0 s(lc3.a0 data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        kotlin.jvm.internal.o.g(data, "data");
        lc3.e eVar = this.f317890a;
        android.app.Activity B0 = eVar != null ? eVar.B0() : null;
        ab4.n0 A7 = B0 instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) B0).A7() : B0 instanceof com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity ? ((com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity) B0).T6() : new m54.l();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.SOURCE, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(A7.l()), 0)));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(A7.l()), 0)));
        hashMap.put("originScene", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(A7.g()))));
        hashMap.put("uxinfo", a54.h.a(A7));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        java.lang.String str = A7.f2863f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        if (str == null) {
            str = "";
        }
        hashMap.put("uin", str);
        hashMap.put("bizId", java.lang.Integer.valueOf(A7.d()));
        java.lang.String c17 = A7.c();
        if (c17 == null) {
            c17 = "";
        }
        hashMap.put("aid", c17);
        java.lang.String m17 = A7.m();
        if (m17 == null) {
            m17 = "";
        }
        hashMap.put("traceId", m17);
        hashMap.put("canvasId", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(A7.e())));
        java.lang.String p17 = A7.p();
        if (p17 == null) {
            p17 = "";
        }
        hashMap.put("viewId", p17);
        java.lang.String j17 = A7.j();
        if (j17 == null) {
            j17 = "";
        }
        hashMap.put("snsId", j17);
        java.lang.String j18 = A7.j();
        if (j18 == null) {
            j18 = "";
        }
        hashMap.put("rawSnsId", j18);
        java.lang.String f17 = A7.f();
        if (f17 == null) {
            f17 = "";
        }
        hashMap.put("commInfo", f17);
        java.lang.String a17 = A7.a();
        if (a17 == null) {
            a17 = "";
        }
        hashMap.put("adExtInfo", a17);
        java.lang.String i17 = A7.i();
        hashMap.put("pageId", i17 != null ? i17 : "");
        hashMap.put("isHalfScreenMode", java.lang.Boolean.valueOf(A7.s()));
        hashMap.put("isNativeAd", java.lang.Boolean.valueOf(A7.t()));
        lc3.a0 l17 = l(hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        return l17;
    }
}
