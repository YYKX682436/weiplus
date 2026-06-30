package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178464d;

    public z1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178464d = walletLqtDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178464d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "click middle banner with urltype : %d", java.lang.Integer.valueOf(walletLqtDetailUI.f177952f.f392020p0.f372752h));
        r45.du4 du4Var = walletLqtDetailUI.f177952f.f392020p0;
        int i17 = du4Var.f372752h;
        if (i17 == 2) {
            java.lang.String str = du4Var.f372750f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "open middle banner h5 with url : %s", str);
                com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI, str, false);
            }
        } else if (i17 == 3) {
            java.lang.String str2 = du4Var.f372753i;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "open middle banner tinyapp with username : %s", str2);
                com.tencent.mm.wallet_core.ui.r1.b0(str2, walletLqtDetailUI.f177952f.f392020p0.f372750f, 0, 1061);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
