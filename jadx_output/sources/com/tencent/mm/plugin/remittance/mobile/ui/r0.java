package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class r0 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.s0 f156711a;

    public r0(com.tencent.mm.plugin.remittance.mobile.ui.s0 s0Var) {
        this.f156711a = s0Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "notice click jumpItem.action:continue");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "notice click jumpItem.action:exit");
        this.f156711a.f156717e.U6();
    }
}
