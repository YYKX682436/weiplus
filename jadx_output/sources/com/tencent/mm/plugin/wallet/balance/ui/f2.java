package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes5.dex */
public class f2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI f177890d;

    public f2(com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI walletSelectBankcardModeUI) {
        this.f177890d = walletSelectBankcardModeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI walletSelectBankcardModeUI = this.f177890d;
        walletSelectBankcardModeUI.setResult(0);
        walletSelectBankcardModeUI.finish();
        return true;
    }
}
