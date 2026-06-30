package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class n0 implements ab5.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI f201992a;

    public n0(com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI) {
        this.f201992a = appBrandServiceChattingFmUI;
    }

    @Override // ab5.h0
    public void a() {
        com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f201992a;
        appBrandServiceChattingFmUI.hideVKB();
        ot0.q qVar = new ot0.q();
        qVar.f348654f = appBrandServiceChattingFmUI.S;
        qVar.f348666i = 33;
        qVar.f348673j2 = appBrandServiceChattingFmUI.P.f77481g;
        qVar.f348669i2 = com.tencent.mm.sdk.platformtools.t8.K0(appBrandServiceChattingFmUI.T) ? appBrandServiceChattingFmUI.P.f77488q : appBrandServiceChattingFmUI.T;
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams = appBrandServiceChattingFmUI.P;
        qVar.f348677k2 = wxaExposedParams.f77478d;
        qVar.f348737z2 = wxaExposedParams.f77484m;
        qVar.A2 = wxaExposedParams.f77485n;
        qVar.f348685m2 = wxaExposedParams.f77486o;
        qVar.f348681l2 = 2;
        qVar.f348674k = wxaExposedParams.f77489r;
        qVar.B2 = wxaExposedParams.f77483i;
        qVar.L1 = "wxapp_" + appBrandServiceChattingFmUI.P.f77478d + appBrandServiceChattingFmUI.P.f77488q;
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams2 = appBrandServiceChattingFmUI.P;
        qVar.f348722w = wxaExposedParams2.f77481g;
        qVar.f348726x = wxaExposedParams2.f77482h;
        com.tencent.mm.ui.chatting.o0 o0Var = new com.tencent.mm.ui.chatting.o0(null);
        o0Var.f202045e = appBrandServiceChattingFmUI.p1();
        o0Var.f202044d = qVar;
        o0Var.f202047g = appBrandServiceChattingFmUI.U;
        o0Var.f202046f = appBrandServiceChattingFmUI.W;
        o0Var.f202048h = appBrandServiceChattingFmUI.f198152f.x();
        o0Var.f202049i = appBrandServiceChattingFmUI.S;
        o0Var.f202050m = appBrandServiceChattingFmUI.Y;
        o0Var.f202051n = appBrandServiceChattingFmUI.V;
        gm0.j1.e().j(o0Var);
    }
}
