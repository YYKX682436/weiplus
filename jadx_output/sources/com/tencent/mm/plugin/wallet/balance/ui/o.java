package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178484d;

    public o(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f178484d = walletBalanceFetchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f178484d;
        walletBalanceFetchUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "do get free fee");
        if (walletBalanceFetchUI.f177783e == null) {
            return;
        }
        if (walletBalanceFetchUI.M != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "cancel prev cgi");
            walletBalanceFetchUI.M.j();
        }
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0("" + walletBalanceFetchUI.f177784f, "100");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
        rr4.b bVar = new rr4.b(j07, bankcard.field_bankcardType, bankcard.field_bindSerial);
        walletBalanceFetchUI.M = bVar;
        bVar.l().h(new com.tencent.mm.plugin.wallet.balance.ui.q(walletBalanceFetchUI));
    }
}
