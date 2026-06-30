package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class p1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178493e;

    public p1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, java.util.List list) {
        this.f178493e = walletBalanceSaveUI;
        this.f178492d = list;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178493e;
        hs4.d dVar = walletBalanceSaveUI.f177844t;
        if (dVar != null) {
            dVar.c();
            if (i17 < this.f178492d.size()) {
                walletBalanceSaveUI.f177833f = (com.tencent.mm.plugin.wallet_core.model.Bankcard) walletBalanceSaveUI.f177832e.get(i17);
                walletBalanceSaveUI.Z6();
            } else {
                walletBalanceSaveUI.f177833f = null;
                walletBalanceSaveUI.Z6();
            }
        }
    }
}
