package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178089d;

    public a2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178089d = walletLqtDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178089d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "click security entry, url type is : %d", java.lang.Integer.valueOf(walletLqtDetailUI.f177952f.Z.f372752h));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(17084, 21);
        r45.du4 du4Var = walletLqtDetailUI.f177952f.Z;
        int i17 = du4Var.f372752h;
        if (i17 == 2) {
            java.lang.String str = du4Var.f372750f;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "jump to h5 with url : %s", str);
            com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI, str, false);
        } else if (i17 == 3) {
            java.lang.String str2 = du4Var.f372753i;
            java.lang.String str3 = du4Var.f372750f;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "jump to tinyapp with username : %s, path : %s", str2, str3);
            com.tencent.mm.wallet_core.ui.r1.b0(str2, str3, 0, 1061);
        }
        if (walletLqtDetailUI.D1.getVisibility() == 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_LQT_SECURITY_REDDOT_TIME_INT_SYNC, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "report click security reddot");
            g0Var.d(17084, 23);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
