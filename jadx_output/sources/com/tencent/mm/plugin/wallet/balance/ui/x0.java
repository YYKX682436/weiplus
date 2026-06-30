package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class x0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        super(false);
        this.f178528d = walletBalanceManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.util.ArrayList j17 = vr4.f1.wi().Ai().j();
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178528d;
        if (j17 == null || j17.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is empty, do bind card to fetch");
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.A;
            db5.e1.K(walletBalanceManagerUI, false, walletBalanceManagerUI.getString(com.tencent.mm.R.string.f493485kf0), "", walletBalanceManagerUI.getString(com.tencent.mm.R.string.kez), walletBalanceManagerUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.balance.ui.q0(walletBalanceManagerUI), new com.tencent.mm.plugin.wallet.balance.ui.r0(walletBalanceManagerUI));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is valid, to do fetch");
            com.tencent.mm.wallet_core.a.j(walletBalanceManagerUI, qr4.h.class, null, null);
            com.tencent.mm.wallet_core.ui.r1.q0(15, 1);
        }
    }
}
