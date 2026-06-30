package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI f180570d;

    public p3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI) {
        this.f180570d = walletCheckPwdNewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.f179974h;
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI = this.f180570d;
        walletCheckPwdNewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCheckPwdNewUI", "close btn");
        if (walletCheckPwdNewUI.f179975d.onClickClose()) {
            return false;
        }
        walletCheckPwdNewUI.finish();
        return false;
    }
}
