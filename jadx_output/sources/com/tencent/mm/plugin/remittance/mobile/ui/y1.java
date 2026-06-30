package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class y1 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156748a;

    public y1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156748a = mobileRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "click verify real name");
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.f156612y0;
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156748a;
        mobileRemittanceUI.a7(1);
        mobileRemittanceUI.W6(8);
    }
}
