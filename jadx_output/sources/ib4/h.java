package ib4;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.g f290228a = new cl0.g();

    /* renamed from: b, reason: collision with root package name */
    public final cl0.g f290229b = new cl0.g();

    public cl0.g a(java.lang.String str, long j17) {
        cl0.g gVar = this.f290229b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        try {
            gVar.p(str, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "appendExtInfo exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        return gVar;
    }

    public cl0.g b(java.lang.String str, java.lang.String str2) {
        cl0.g gVar = this.f290229b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            gVar.h(str, str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "appendExtInfo exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        return gVar;
    }

    public final java.lang.String c() {
        cl0.g gVar = this.f290228a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        try {
            gVar.h("extInfo", this.f290229b);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "build exp=" + e17.toString());
        }
        java.lang.String gVar2 = gVar.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        return gVar2;
    }

    public void d(java.lang.String str, int i17, int i18, long j17, int i19, int i27, int i28, java.lang.String str2, java.lang.String str3) {
        cl0.g gVar = this.f290228a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        try {
            gVar.h("uxinfo", str);
            gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            gVar.o("originScene", i18);
            gVar.p("canvasId", j17);
            gVar.o("type", i19);
            gVar.o("subType", i27);
            gVar.o("action", i28);
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str2, str3)) {
                gVar.h("viewid", str2);
                gVar.h("commInfo", str3);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "initContentInfo exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
    }

    public void e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        try {
            java.lang.String c17 = c();
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().onAdLandingPageClick(str, c17);
            com.tencent.mars.xlog.Log.i("NetSceneAdLadingPageClick", "report, channel=" + str + ", content=" + c17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "report exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
    }
}
