package com.tencent.mm.wallet_core.ui;

/* loaded from: classes8.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214210d;

    public n0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214210d = walletBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f214210d;
        walletBaseUI.mPayResultType = 4;
        if (!walletBaseUI.needConfirmFinish()) {
            walletBaseUI.finish();
            return true;
        }
        walletBaseUI.hideVKB();
        walletBaseUI.showDialog(1000);
        return true;
    }
}
