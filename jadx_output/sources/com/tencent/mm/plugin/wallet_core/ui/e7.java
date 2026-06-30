package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class e7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI f180254d;

    public e7(com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI) {
        this.f180254d = walletPwdConfirmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = this.f180254d;
        if (!walletPwdConfirmUI.needConfirmFinish()) {
            walletPwdConfirmUI.finish();
            return false;
        }
        walletPwdConfirmUI.hideVKB();
        walletPwdConfirmUI.showDialog(1000);
        return false;
    }
}
