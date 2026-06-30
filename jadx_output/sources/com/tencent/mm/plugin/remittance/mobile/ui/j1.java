package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class j1 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rp6 f156681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156682b;

    public j1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, r45.rp6 rp6Var) {
        this.f156682b = mobileRemittanceUI;
        this.f156681a = rp6Var;
    }

    @Override // tw3.a, com.tencent.mm.wallet_core.model.e0
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
        java.lang.String str = this.f156681a.f385089p;
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.f156612y0;
        this.f156682b.Y6(9, str);
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.f156612y0;
        this.f156682b.b7((java.lang.String) obj);
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:exit");
        this.f156682b.U6();
    }
}
