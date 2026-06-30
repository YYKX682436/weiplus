package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f178529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178530e;

    public y(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, db5.t4 t4Var) {
        this.f178530e = walletBalanceFetchUI;
        this.f178529d = t4Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        this.f178529d.onMMMenuItemSelected(menuItem, i17);
        this.f178530e.P.c();
    }
}
