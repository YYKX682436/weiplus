package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class t1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        super(false);
        this.f156721d = mobileRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156721d;
        mobileRemittanceUI.showCircleStWcKb();
        java.lang.String string = mobileRemittanceUI.getString(com.tencent.mm.R.string.hyc);
        java.lang.String string2 = mobileRemittanceUI.getString(com.tencent.mm.R.string.hyh);
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI2 = this.f156721d;
        gt4.l.b(mobileRemittanceUI2, string, mobileRemittanceUI2.Q, string2, true, 20, new com.tencent.mm.plugin.remittance.mobile.ui.q1(this), new com.tencent.mm.plugin.remittance.mobile.ui.s1(this));
        mobileRemittanceUI.W6(6);
    }
}
