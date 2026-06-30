package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes3.dex */
public class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178640d;

    public q(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI) {
        this.f178640d = walletBankcardManageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f178640d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.wallet.bind.ui.o(this);
        k0Var.f211881s = new com.tencent.mm.plugin.wallet.bind.ui.p(this);
        k0Var.v();
        return false;
    }
}
