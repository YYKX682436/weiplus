package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI f179032d;

    public m(com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI) {
        this.f179032d = walletDelayTransferSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f179032d.finish();
        return false;
    }
}
