package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class u8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI f180657d;

    public u8(com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI walletSelectProfessionUI) {
        this.f180657d = walletSelectProfessionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI walletSelectProfessionUI = this.f180657d;
        walletSelectProfessionUI.setResult(0);
        walletSelectProfessionUI.finish();
        return true;
    }
}
