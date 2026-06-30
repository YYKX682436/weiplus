package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class w0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI f180758d;

    public w0(com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI walletBankCardTypeSelectUI) {
        this.f180758d = walletBankCardTypeSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI walletBankCardTypeSelectUI = this.f180758d;
        walletBankCardTypeSelectUI.hideVKB();
        walletBankCardTypeSelectUI.finish();
        return true;
    }
}
