package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI f180693d;

    public v8(com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI walletSetPasswordUI) {
        this.f180693d = walletSetPasswordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI walletSetPasswordUI = this.f180693d;
        if (!walletSetPasswordUI.needConfirmFinish()) {
            walletSetPasswordUI.finish();
            return false;
        }
        walletSetPasswordUI.hideVKB();
        walletSetPasswordUI.showDialog(1000);
        return false;
    }
}
