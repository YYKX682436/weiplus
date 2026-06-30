package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI f179000d;

    public g(com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI walletBiometricPaySettingsUI) {
        this.f179000d = walletBiometricPaySettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f179000d.finish();
        return false;
    }
}
