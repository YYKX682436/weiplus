package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class c1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI f178981d;

    public c1(com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI walletLockCheckPwdUI) {
        this.f178981d = walletLockCheckPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockCheckPwdUI", "cancel by BackBtn");
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI.f178904n;
        this.f178981d.U6(-1, 4);
        return true;
    }
}
