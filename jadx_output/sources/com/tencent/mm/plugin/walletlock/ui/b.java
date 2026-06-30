package com.tencent.mm.plugin.walletlock.ui;

/* loaded from: classes9.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI f181395d;

    public b(com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI walletLockSettingUI) {
        this.f181395d = walletLockSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI walletLockSettingUI = this.f181395d;
        if (walletLockSettingUI.f181389o) {
            walletLockSettingUI.V6(0, 4, "user cancel setting wallet lock");
        } else {
            walletLockSettingUI.finish();
        }
        return false;
    }
}
