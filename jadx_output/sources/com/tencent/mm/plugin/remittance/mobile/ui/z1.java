package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class z1 implements com.tencent.mm.plugin.remittance.ui.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156754b;

    public z1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, int i17) {
        this.f156754b = mobileRemittanceUI;
        this.f156753a = i17;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.a0
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mVerifyNameTv onCancel()");
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156754b;
        mobileRemittanceUI.hideVKB();
        mobileRemittanceUI.showNormalStWcKb();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.a0
    public void onINputName(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mVerifyNameTv onINputName() name:%s", str);
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156754b;
        mobileRemittanceUI.hideVKB();
        int i17 = this.f156753a;
        int i18 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.f156612y0;
        mobileRemittanceUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "do check name: %s", java.lang.Integer.valueOf(i17));
        mobileRemittanceUI.doSceneProgress(new sw3.b(i17, mobileRemittanceUI.f156614d, mobileRemittanceUI.f156615e, str, mobileRemittanceUI.f156625q, i17 == 2 ? mobileRemittanceUI.U : ""), true);
    }
}
