package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180619d;

    public s9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI) {
        this.f180619d = walletVerifyCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180619d;
        walletVerifyCodeUI.hideVKB();
        if (walletVerifyCodeUI.needConfirmFinish()) {
            walletVerifyCodeUI.showDialog(1000);
            return false;
        }
        walletVerifyCodeUI.finish();
        return false;
    }
}
