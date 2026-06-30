package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class t0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178507d;

    public t0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f178507d = walletBalanceManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.A;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178507d;
        if (!walletBalanceManagerUI.needConfirmFinish()) {
            walletBalanceManagerUI.finish();
            return true;
        }
        walletBalanceManagerUI.hideVKB();
        walletBalanceManagerUI.showDialog(1000);
        return true;
    }
}
