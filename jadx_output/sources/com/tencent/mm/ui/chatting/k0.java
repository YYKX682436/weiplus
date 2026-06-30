package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class k0 implements com.tencent.mm.pluginsdk.ui.chat.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI f201877a;

    public k0(com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI) {
        this.f201877a = appBrandServiceChattingFmUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.e5
    public boolean a(boolean z17) {
        com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f201877a;
        k91.l5 l5Var = appBrandServiceChattingFmUI.f198146y0;
        if (l5Var != null) {
            k91.k5 k5Var = (k91.k5) l5Var.f305670a.get(0);
            if (appBrandServiceChattingFmUI.N == 2 && appBrandServiceChattingFmUI.P.f77481g.equals(k5Var.f305664a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", k5Var.f305664a, k5Var.f305665b);
                com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.n1(appBrandServiceChattingFmUI, k5Var.f305665b);
                return true;
            }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject.f87790f = 1080;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(appBrandServiceChattingFmUI.getContext(), k5Var.f305664a, "", 0, k5Var.f305666c, k5Var.f305665b, appBrandStatObject, appBrandServiceChattingFmUI.p1());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
        }
        return true;
    }
}
