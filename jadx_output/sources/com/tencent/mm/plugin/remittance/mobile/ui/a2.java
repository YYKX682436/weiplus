package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class a2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        super(false);
        this.f156641d = mobileRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156641d;
        mobileRemittanceUI.P = com.tencent.mm.sdk.platformtools.t8.F(mobileRemittanceUI.E.getText(), 0.0d);
        if (!mobileRemittanceUI.E.n()) {
            db5.t7.makeText(mobileRemittanceUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
        } else {
            if (mobileRemittanceUI.P < 0.01d) {
                db5.t7.makeText(mobileRemittanceUI.getContext(), com.tencent.mm.R.string.hye, 0).show();
                return;
            }
            mobileRemittanceUI.hideWcKb();
            mobileRemittanceUI.X6(false, false);
            mobileRemittanceUI.W6(10);
        }
    }
}
