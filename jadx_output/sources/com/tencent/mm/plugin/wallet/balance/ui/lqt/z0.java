package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178463d;

    public z0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178463d = walletLqtDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.R1;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178463d;
        if (walletLqtDetailUI.c7()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "1", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        boolean z17 = x51.o1.f452042a;
        r45.zg5 zg5Var = walletLqtDetailUI.f177952f;
        r45.e54 e54Var = zg5Var.M;
        if (e54Var != null && e54Var.f373024g && zg5Var.T != null) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.e3.b(walletLqtDetailUI.getContext(), walletLqtDetailUI.f177952f.T);
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        walletLqtDetailUI.f177951e.f177758e.b(zg5Var.C, 1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletLqtDetailUI.f177952f.f392028w)) {
            r45.e54 e54Var2 = walletLqtDetailUI.f177952f.M;
            if (e54Var2 == null) {
                walletLqtDetailUI.b7("", new android.content.Intent(walletLqtDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class));
            } else if (e54Var2.f373021d != 1 || com.tencent.mm.sdk.platformtools.t8.K0(e54Var2.f373022e)) {
                int i18 = e54Var2.f373021d;
                if (i18 == 2) {
                    com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI.getContext(), e54Var2.f373022e, true);
                } else if (i18 == 3) {
                    com.tencent.mm.wallet_core.ui.r1.b0(e54Var2.f373023f, e54Var2.f373022e, 0, 1061);
                } else {
                    walletLqtDetailUI.b7("", new android.content.Intent(walletLqtDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class));
                }
            } else {
                walletLqtDetailUI.b7(com.tencent.mm.plugin.wallet.balance.model.lqt.c3.a(e54Var2.f373022e), new android.content.Intent(walletLqtDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "click save button, go to block url: %s", walletLqtDetailUI.f177952f.f392028w);
            com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI, walletLqtDetailUI.f177952f.f392028w, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
