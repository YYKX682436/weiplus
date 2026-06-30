package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class n0 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jp6 f156695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156696b;

    public n0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI, r45.jp6 jp6Var) {
        this.f156696b = mobileRemitNumberInputUI;
        this.f156695a = jp6Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "wxname_chg_win dialog click jumpItem.action:continue");
        tw3.b.a(this.f156696b.getContext(), this.f156695a);
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "wxname_chg_win dialog click jumpItem.action:exit");
        this.f156696b.U6();
    }
}
