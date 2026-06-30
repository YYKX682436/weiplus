package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class z extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jp6 f156749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156750b;

    public z(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI, r45.jp6 jp6Var) {
        this.f156750b = mobileRemitNumberInputUI;
        this.f156749a = jp6Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "jump_win dialog click jumpItem.action:continue");
        tw3.b.a(this.f156750b.getContext(), this.f156749a);
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "jump_win dialog click jumpItem.action:exit");
        this.f156750b.U6();
    }
}
