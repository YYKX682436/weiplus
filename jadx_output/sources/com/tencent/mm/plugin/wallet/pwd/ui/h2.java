package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class h2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI f179008d;

    public h2(com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI) {
        this.f179008d = walletSecuritySettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f179008d.finish();
        return false;
    }
}
