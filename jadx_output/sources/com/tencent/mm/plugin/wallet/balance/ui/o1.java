package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178488d;

    public o1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f178488d = walletBalanceSaveUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178488d;
        hs4.d dVar = walletBalanceSaveUI.f177844t;
        if (dVar == null) {
            return;
        }
        dVar.c();
        walletBalanceSaveUI.f177833f = null;
        walletBalanceSaveUI.Z6();
    }
}
