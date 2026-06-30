package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class l1 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156690a;

    public l1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156690a = mobileRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.f156612y0;
        this.f156690a.b7((java.lang.String) obj);
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:exit");
        this.f156690a.U6();
    }
}
