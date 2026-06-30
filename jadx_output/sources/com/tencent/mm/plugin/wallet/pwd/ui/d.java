package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI f178984d;

    public d(com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI walletBalancePrivacyUI) {
        this.f178984d = walletBalancePrivacyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f178984d.finish();
        return true;
    }
}
