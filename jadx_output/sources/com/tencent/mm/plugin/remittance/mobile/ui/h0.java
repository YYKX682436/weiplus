package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class h0 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.i0 f156674a;

    public h0(com.tencent.mm.plugin.remittance.mobile.ui.i0 i0Var) {
        this.f156674a = i0Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "notice click jumpItem.action:continue");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "notice click jumpItem.action:exit");
        this.f156674a.f156678d.U6();
    }
}
