package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI f157955d;

    public t6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI) {
        this.f157955d = remittanceF2fLargeMoneyUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = this.f157955d;
        double F = com.tencent.mm.sdk.platformtools.t8.F(remittanceF2fLargeMoneyUI.f157414g.getText(), 0.0d);
        remittanceF2fLargeMoneyUI.f157424t = F;
        if (F <= 0.0d) {
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = remittanceF2fLargeMoneyUI.f157415h;
            if (wcPayKeyboard != null) {
                wcPayKeyboard.e(false);
                return;
            }
            return;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = remittanceF2fLargeMoneyUI.f157415h;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
