package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI f180338d;

    public i7(com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI) {
        this.f180338d = walletPwdConfirmUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = this.f180338d;
        if (walletPwdConfirmUI.f180083o) {
            walletPwdConfirmUI.f180083o = false;
            walletPwdConfirmUI.U6();
        }
        return false;
    }
}
