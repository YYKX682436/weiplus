package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178527d;

    public x(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f178527d = walletBalanceFetchUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f178527d;
        hs4.d dVar = walletBalanceFetchUI.P;
        if (dVar == null) {
            return;
        }
        dVar.c();
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletBalanceFetchUI", "add new card");
        walletBalanceFetchUI.d7();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = walletBalanceFetchUI.L;
        objArr[1] = 9;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
        objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
        objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
        g0Var.d(16398, objArr);
    }
}
