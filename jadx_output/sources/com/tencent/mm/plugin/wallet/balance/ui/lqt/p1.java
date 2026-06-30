package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes5.dex */
public class p1 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178315a;

    public p1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178315a = walletLqtDetailUI;
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int i28 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.R1;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178315a;
        if (!walletLqtDetailUI.c7()) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
            return;
        }
        int i29 = 0;
        while (true) {
            if (i29 >= walletLqtDetailUI.f177952f.C1.size()) {
                i29 = -1;
                break;
            } else if (((r45.k64) walletLqtDetailUI.f177952f.C1.get(i29)).f378437g == 2) {
                break;
            } else {
                i29++;
            }
        }
        if (i29 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "index is %d", java.lang.Integer.valueOf(i29));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) walletLqtDetailUI.f177976z.getChildAt(i29 + 1).findViewById(com.tencent.mm.R.id.iwx);
        if (viewGroup != null) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            if (iArr[1] + viewGroup.getHeight() <= com.tencent.mm.ui.bl.b(walletLqtDetailUI.getContext()).y && !walletLqtDetailUI.f177972x1) {
                walletLqtDetailUI.f177972x1 = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "5", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "view group is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
