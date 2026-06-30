package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI f180282d;

    public g1(com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI) {
        this.f180282d = walletBankcardIdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = this.f180282d;
        if (!walletBankcardIdUI.f179860e.n() || walletBankcardIdUI.f179865m) {
            return;
        }
        walletBankcardIdUI.f179865m = true;
        walletBankcardIdUI.f179860e.d();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
