package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f177883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177884e;

    public e0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, java.util.List list) {
        this.f177884e = walletBalanceFetchUI;
        this.f177883d = list;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f177884e;
        java.util.List list = this.f177883d;
        if (list == null || i17 >= list.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "showRecommendBanks, select card in error index " + i17);
        } else {
            walletBalanceFetchUI.f177783e = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            walletBalanceFetchUI.h7();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "showRecommendBanks, bankcard: %s", walletBalanceFetchUI.f177783e.field_desc);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = walletBalanceFetchUI.L;
            objArr[1] = 2;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
            objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
            objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
            g0Var.d(16398, objArr);
        }
        int i18 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
        walletBalanceFetchUI.i7();
        walletBalanceFetchUI.getClass();
    }
}
