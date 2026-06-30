package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class y3 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.e0 B;
    public kotlinx.coroutines.y0 C;
    public boolean D;
    public com.tencent.mm.ui.widget.dialog.u3 E;

    public y3(android.content.Context context, f54.e0 e0Var, android.view.ViewGroup viewGroup) {
        super(context, e0Var, viewGroup);
        this.B = e0Var;
    }

    public static final void h0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y3 y3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        y3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = y3Var.E;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        super.K();
        if (!this.D) {
            this.D = true;
            com.tencent.mars.xlog.Log.i("SnsAd.RedPkgUriBtn", "it is going to fetch red pkg url when appear");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchRedPkgUrl$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            i0(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchRedPkgUrl$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        super.L();
        com.tencent.mars.xlog.Log.i("SnsAd.RedPkgUriBtn", "the component is going to destroy");
        kotlinx.coroutines.y0 y0Var = this.C;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.o.CTRL_INDEX, 16);
        i0(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }

    public final void i0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
        f54.e0 e0Var = this.B;
        if (e0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            return;
        }
        ab4.n0 u17 = u();
        if (u17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.RedPkgUriBtn", "the page data is empty, Please check!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            return;
        }
        e0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReceiveUri", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReceiveUri", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        java.lang.String str = e0Var.f259718z1;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAd.RedPkgUriBtn", "the receive uri is empty!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
            return;
        }
        e0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        java.lang.String str2 = e0Var.B1;
        if (str2 == null) {
            str2 = "cny";
        }
        e0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        java.lang.String str3 = e0Var.A1;
        java.lang.String str4 = str3 != null ? str3 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromLandingPageData", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam$Companion");
        e54.g gVar = new e54.g(str, str2, a54.h.a(u17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        java.lang.String str5 = u17.f2882y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f249658d = E1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        long E12 = com.tencent.mm.sdk.platformtools.t8.E1(u17.i());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f249659e = E12;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        long E13 = com.tencent.mm.sdk.platformtools.t8.E1(u17.e());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanvasId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f249660f = E13;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanvasId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        gVar.f249661g = str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromLandingPageData", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam$Companion");
        kotlinx.coroutines.y0 y0Var = this.C;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        this.C = b17;
        int i17 = kotlinx.coroutines.r0.N0;
        ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(b17, new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v3(kotlinx.coroutines.q0.f310567d), null, new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w3(gVar, z17, this, null), 2, null)).p(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.x3(z17, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchRedPkgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp");
    }
}
