package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.f f177908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177909e;

    public k(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, at4.f fVar) {
        this.f177909e = walletBalanceFetchUI;
        this.f177908d = fVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f177909e.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.wallet.balance.ui.i(this);
        k0Var.f211881s = new com.tencent.mm.plugin.wallet.balance.ui.j(this);
        k0Var.v();
        return true;
    }
}
