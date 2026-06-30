package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class c1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI f179346a;

    public c1(com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI) {
        this.f179346a = walletRealNameVerifyUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI = this.f179346a;
        if (z17) {
            walletRealNameVerifyUI.f179233h.setEnabled(true);
            walletRealNameVerifyUI.f179233h.setClickable(true);
        } else {
            walletRealNameVerifyUI.f179233h.setEnabled(false);
            walletRealNameVerifyUI.f179233h.setClickable(false);
        }
    }
}
