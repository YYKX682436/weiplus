package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178348e;

    public r0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, r45.du4 du4Var) {
        this.f178348e = walletLqtDetailUI;
        this.f178347d = du4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.du4 du4Var = this.f178347d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "click lqt refactor fixed deposit view with urltype : %d", java.lang.Integer.valueOf(du4Var.f372752h));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(29559, "4", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int i17 = du4Var.f372752h;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178348e;
        if (i17 == 2) {
            java.lang.String str = du4Var.f372750f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "open fixed deposit h5 with url : %s", str);
                com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI, str, false);
            }
        } else if (i17 == 3) {
            java.lang.String str2 = du4Var.f372753i;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "open fixed deposit tinyapp with username : %s", str2);
                com.tencent.mm.wallet_core.ui.r1.b0(str2, du4Var.f372750f, 0, 1061);
            }
        } else if (i17 == 1) {
            java.lang.String str3 = du4Var.f372750f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "open native fixed deposit with url: %s", str3);
                if ("wxpay://lqt/fixeddeposit/makeplan".equals(du4Var.f372750f)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt make plan");
                    int i18 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.R1;
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(walletLqtDetailUI, walletLqtDetailUI.Z6(), du4Var, walletLqtDetailUI.f177968v);
                    g0Var.d(22449, 2);
                    ((h45.q) i95.n0.c(h45.q.class)).startLqtFixedDepositMakePlanUseCase(walletLqtDetailUI.getContext(), new android.os.Bundle());
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                } else if ("wxpay://lqt/fixeddeposit/planlist".equals(du4Var.f372750f)) {
                    g0Var.d(22449, 2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt plan list");
                    int i19 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.R1;
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(walletLqtDetailUI, walletLqtDetailUI.Z6(), du4Var, walletLqtDetailUI.f177968v);
                    ((h45.q) i95.n0.c(h45.q.class)).startLqtFixedDepositPlanListUseCase(walletLqtDetailUI.getContext(), new android.os.Bundle());
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
