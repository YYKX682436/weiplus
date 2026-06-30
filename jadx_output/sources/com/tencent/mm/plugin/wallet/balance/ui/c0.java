package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        super(false);
        this.f177871d = walletBalanceFetchUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f177871d;
        walletBalanceFetchUI.showCircleStWcKb();
        java.util.ArrayList j17 = vr4.f1.wi().Ai().j();
        at4.f fVar = vr4.f1.wi().Ai().f14002k;
        if (fVar != null) {
            java.lang.String str3 = fVar.f13841i;
            str = fVar.f13840h;
            str2 = str3;
        } else {
            str = "";
            str2 = str;
        }
        if (j17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "debit is null");
        }
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI2 = this.f177871d;
        walletBalanceFetchUI2.c7(walletBalanceFetchUI2.getContext(), j17, walletBalanceFetchUI.f177783e, str, str2, new com.tencent.mm.plugin.wallet.balance.ui.p(this, j17), true);
    }
}
