package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class d1 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156661a;

    public d1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156661a = mobileRemittanceUI;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156661a;
        int i17 = mobileRemittanceUI.f156620m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mAmountRemindBit == 0");
            mobileRemittanceUI.H.setVisibility(8);
            return;
        }
        long longValue = new java.lang.Double(com.tencent.mm.sdk.platformtools.t8.F(charSequence.toString(), 0.0d)).longValue();
        int i18 = 0;
        int i19 = 0;
        while (longValue != 0) {
            int i27 = (int) (longValue % 10);
            longValue /= 10;
            i18++;
            i19 = i27;
        }
        if (i18 < mobileRemittanceUI.f156620m) {
            mobileRemittanceUI.H.setVisibility(8);
            return;
        }
        int k17 = mobileRemittanceUI.E.k(charSequence, mobileRemittanceUI.f156628t, i19);
        if (k17 == 0) {
            mobileRemittanceUI.H.setVisibility(8);
            return;
        }
        mobileRemittanceUI.H.setVisibility(0);
        mobileRemittanceUI.G.setText(com.tencent.mm.wallet_core.model.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) mobileRemittanceUI.F.getLayoutParams();
        layoutParams.leftMargin = k17;
        mobileRemittanceUI.F.setLayoutParams(layoutParams);
    }
}
