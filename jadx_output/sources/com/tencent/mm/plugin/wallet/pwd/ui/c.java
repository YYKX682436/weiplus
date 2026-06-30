package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference f178979a;

    public c(com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference) {
        this.f178979a = walletBalancePrivacyCheckBoxPreference;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference = this.f178979a;
        com.tencent.mm.ui.base.preference.q0 q0Var = walletBalancePrivacyCheckBoxPreference.f197771e;
        if (q0Var == null) {
            return;
        }
        q0Var.a(walletBalancePrivacyCheckBoxPreference, valueOf);
    }
}
