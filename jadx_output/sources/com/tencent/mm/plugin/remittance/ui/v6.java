package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class v6 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI f157994a;

    public v6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI) {
        this.f157994a = remittanceF2fLargeMoneyUI;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = this.f157994a;
        int i17 = remittanceF2fLargeMoneyUI.f157420p;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "mAmountRemindBit == 0");
            remittanceF2fLargeMoneyUI.f157418n.setVisibility(8);
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
        if (i18 < remittanceF2fLargeMoneyUI.f157420p) {
            remittanceF2fLargeMoneyUI.f157418n.setVisibility(8);
            return;
        }
        int k17 = remittanceF2fLargeMoneyUI.f157414g.k(charSequence, remittanceF2fLargeMoneyUI.f157421q, i19) + remittanceF2fLargeMoneyUI.f157414g.getLeft();
        if (k17 == 0) {
            remittanceF2fLargeMoneyUI.f157418n.setVisibility(8);
            return;
        }
        remittanceF2fLargeMoneyUI.f157418n.setVisibility(0);
        remittanceF2fLargeMoneyUI.f157417m.setText(com.tencent.mm.wallet_core.model.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) remittanceF2fLargeMoneyUI.f157416i.getLayoutParams();
        layoutParams.leftMargin = k17;
        remittanceF2fLargeMoneyUI.f157416i.setLayoutParams(layoutParams);
    }
}
