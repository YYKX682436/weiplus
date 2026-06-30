package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class i1 extends tw3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156679a;

    public i1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156679a = mobileRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder jump_win dialog click action:continue");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder jump_win dialog click action:exit");
        this.f156679a.U6();
    }
}
