package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class l0 implements com.tencent.mm.pluginsdk.ui.span.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI f201916a;

    public l0(com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI) {
        this.f201916a = appBrandServiceChattingFmUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object a(r35.m3 m3Var) {
        java.lang.String str;
        if (m3Var.f369195d != 45) {
            return null;
        }
        java.lang.String str2 = new java.lang.String(android.util.Base64.decode(m3Var.e(), 0));
        try {
            java.lang.String optString = new cl0.g((java.lang.String) m3Var.b(java.lang.String.class)).optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (optString == null) {
                optString = "";
            }
            str = new java.lang.String(android.util.Base64.decode(optString, 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "json parse fail: e = %s", e17);
            str = "";
        }
        com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f201916a;
        if (appBrandServiceChattingFmUI.N == 2 && appBrandServiceChattingFmUI.P.f77478d.equals(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", str2, str);
            com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.n1(appBrandServiceChattingFmUI, str);
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1081;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(appBrandServiceChattingFmUI.getContext(), null, str2, 0, 0, str, appBrandStatObject);
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object b(r35.m3 m3Var) {
        int i17 = m3Var.f369195d;
        if (i17 == 1 || i17 == 25 || i17 == 30 || i17 == 31) {
            return this.f201916a.f198152f.x();
        }
        return null;
    }
}
