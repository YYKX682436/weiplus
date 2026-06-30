package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI f180172d;

    public c4(com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI) {
        this.f180172d = walletConfirmCardIDUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI = this.f180172d;
        if (!walletConfirmCardIDUI.needConfirmFinish()) {
            walletConfirmCardIDUI.finish();
            return false;
        }
        walletConfirmCardIDUI.hideVKB();
        walletConfirmCardIDUI.showDialog(1000);
        return false;
    }
}
