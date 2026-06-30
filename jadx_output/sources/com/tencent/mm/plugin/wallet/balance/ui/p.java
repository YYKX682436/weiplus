package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.c0 f178490e;

    public p(com.tencent.mm.plugin.wallet.balance.ui.c0 c0Var, java.util.List list) {
        this.f178490e = c0Var;
        this.f178489d = list;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.c0 c0Var = this.f178490e;
        java.util.List list = this.f178489d;
        if (list == null || i17 >= list.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "add new card");
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = c0Var.f177871d;
            int i18 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
            walletBalanceFetchUI.d7();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = c0Var.f177871d.L;
            objArr[1] = 9;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = c0Var.f177871d.f177783e;
            objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
            objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
            g0Var.d(16398, objArr);
        } else {
            c0Var.f177871d.f177783e = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            c0Var.f177871d.h7();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", c0Var.f177871d.f177783e.field_desc);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = c0Var.f177871d.L;
            objArr2[1] = 2;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = c0Var.f177871d.f177783e;
            objArr2[2] = bankcard2 != null ? bankcard2.field_bankcardType : "";
            objArr2[3] = bankcard2 != null ? bankcard2.field_bindSerial : "";
            g0Var2.d(16398, objArr2);
        }
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI2 = c0Var.f177871d;
        int i19 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
        walletBalanceFetchUI2.i7();
        c0Var.f177871d.getClass();
    }
}
