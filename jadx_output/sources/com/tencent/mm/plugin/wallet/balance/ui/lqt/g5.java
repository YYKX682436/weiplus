package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI f178185d;

    public g5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI) {
        this.f178185d = walletLqtSaveFetchFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI = this.f178185d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchFinishUI", "url type is %s", java.lang.Integer.valueOf(walletLqtSaveFetchFinishUI.f178043h.f372752h));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchFinishUI", "url is %s", walletLqtSaveFetchFinishUI.f178043h.f372750f);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(29559, "8", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        r45.du4 du4Var = walletLqtSaveFetchFinishUI.f178043h;
        int i17 = du4Var.f372752h;
        if (i17 == 1) {
            if ("wxpay://lqt/planindex".equals(du4Var.f372750f)) {
                android.content.Intent intent = new android.content.Intent(walletLqtSaveFetchFinishUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI.class);
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI2 = this.f178185d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(walletLqtSaveFetchFinishUI2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletLqtSaveFetchFinishUI2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(walletLqtSaveFetchFinishUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("wxpay://lqt/preaddplan".equals(walletLqtSaveFetchFinishUI.f178043h.f372750f)) {
                android.content.Intent intent2 = new android.content.Intent(walletLqtSaveFetchFinishUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.class);
                intent2.putExtra("key_mode", 3);
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI3 = this.f178185d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(walletLqtSaveFetchFinishUI3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletLqtSaveFetchFinishUI3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(walletLqtSaveFetchFinishUI3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("wxpay://lqt/fixeddeposit/makeplan".equals(walletLqtSaveFetchFinishUI.f178043h.f372750f)) {
                g0Var.d(22449, 2);
                ((h45.q) i95.n0.c(h45.q.class)).startLqtFixedDepositMakePlanUseCase(walletLqtSaveFetchFinishUI.getContext(), new android.os.Bundle());
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            } else if ("wxpay://lqt/fixeddeposit/planlist".equals(walletLqtSaveFetchFinishUI.f178043h.f372750f)) {
                g0Var.d(22449, 2);
                ((h45.q) i95.n0.c(h45.q.class)).startLqtFixedDepositPlanListUseCase(walletLqtSaveFetchFinishUI.getContext(), new android.os.Bundle());
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
        } else if (i17 == 2) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("rawUrl", walletLqtSaveFetchFinishUI.f178043h.f372750f);
                intent3.putExtra("showShare", true);
                intent3.putExtra(com.tencent.mm.ui.w2.f211205r, true);
                com.tencent.mm.wallet_core.ui.r1.T(walletLqtSaveFetchFinishUI.getContext(), intent3);
            }
        } else if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i) && !com.tencent.mm.sdk.platformtools.t8.K0(walletLqtSaveFetchFinishUI.f178043h.f372750f)) {
            l81.b1 b1Var = new l81.b1();
            r45.du4 du4Var2 = walletLqtSaveFetchFinishUI.f178043h;
            b1Var.f317012a = du4Var2.f372753i;
            b1Var.f317022f = du4Var2.f372750f;
            b1Var.f317032k = 1061;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(walletLqtSaveFetchFinishUI.getContext(), b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
