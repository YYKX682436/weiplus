package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI f179025d;

    public l(com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI) {
        this.f179025d = walletDelayTransferSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI = this.f179025d;
        com.tencent.mm.wallet_core.ui.r1.V(walletDelayTransferSettingUI.getContext(), walletDelayTransferSettingUI.f178851r, false);
        return false;
    }
}
