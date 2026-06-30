package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class k0 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.l0 f156685a;

    public k0(com.tencent.mm.plugin.remittance.mobile.ui.l0 l0Var) {
        this.f156685a = l0Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "bottomSheet click jumpItem.action:continue");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "bottomSheet click jumpItem.action:exit");
        this.f156685a.f156689d.f156692d.U6();
    }
}
