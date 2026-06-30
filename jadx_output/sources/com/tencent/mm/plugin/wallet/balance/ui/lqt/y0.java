package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178446d;

    public y0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178446d = walletLqtDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "click top biz");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178446d;
        r45.du4 du4Var = walletLqtDetailUI.f177952f.L;
        int i17 = du4Var.f372752h;
        if (i17 == 2) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI, walletLqtDetailUI.f177952f.L.f372750f, false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 1, 2, walletLqtDetailUI.f177952f.L.f372750f);
            }
        } else if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i) && !com.tencent.mm.sdk.platformtools.t8.K0(walletLqtDetailUI.f177952f.L.f372750f)) {
            r45.du4 du4Var2 = walletLqtDetailUI.f177952f.L;
            com.tencent.mm.wallet_core.ui.r1.b0(du4Var2.f372753i, du4Var2.f372750f, 0, 1061);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            r45.du4 du4Var3 = walletLqtDetailUI.f177952f.L;
            g0Var.d(16807, 1, 3, du4Var3.f372750f, du4Var3.f372753i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
