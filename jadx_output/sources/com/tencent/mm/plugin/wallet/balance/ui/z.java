package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class z implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178536b;

    public z(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, java.util.List list) {
        this.f178536b = walletBalanceFetchUI;
        this.f178535a = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        int i17;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f178536b;
        java.util.List list = this.f178535a;
        if (list == null || (i17 = walletBalanceFetchUI.P.f284628m) < 0 || i17 >= list.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "add new card");
            int i18 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
            walletBalanceFetchUI.d7();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = walletBalanceFetchUI.L;
            objArr[1] = 9;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
            objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
            objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
            g0Var.d(16398, objArr);
        } else {
            walletBalanceFetchUI.f177783e = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(walletBalanceFetchUI.P.f284628m);
            walletBalanceFetchUI.h7();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", walletBalanceFetchUI.f177783e.field_desc);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = walletBalanceFetchUI.L;
            objArr2[1] = 2;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = walletBalanceFetchUI.f177783e;
            objArr2[2] = bankcard2 != null ? bankcard2.field_bankcardType : "";
            objArr2[3] = bankcard2 != null ? bankcard2.field_bindSerial : "";
            g0Var2.d(16398, objArr2);
        }
        int i19 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
        walletBalanceFetchUI.i7();
        walletBalanceFetchUI.getClass();
        walletBalanceFetchUI.P.c();
    }
}
