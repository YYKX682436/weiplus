package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178088d;

    public a1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178088d = walletLqtDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178088d;
        r45.zg5 zg5Var = walletLqtDetailUI.f177952f;
        r45.e54 e54Var = zg5Var.N;
        if (e54Var != null && e54Var.f373024g && zg5Var.T != null) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.e3.b(walletLqtDetailUI.getContext(), walletLqtDetailUI.f177952f.T);
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (walletLqtDetailUI.c7()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "2", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        walletLqtDetailUI.getClass();
        com.tencent.mm.wallet_core.b.a().getClass();
        walletLqtDetailUI.a7("");
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
