package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178105d;

    public b4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178105d = walletLqtPlanAddUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.f177980y0;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178105d;
        walletLqtPlanAddUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "show date picker");
        if (walletLqtPlanAddUI.f177998w.isShown()) {
            walletLqtPlanAddUI.hideWcKb();
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(walletLqtPlanAddUI, walletLqtPlanAddUI.P);
        int i18 = walletLqtPlanAddUI.I.f381163d - 1;
        if (i18 >= 0) {
            c0Var.i(i18);
        }
        c0Var.f212259t = new com.tencent.mm.plugin.wallet.balance.ui.lqt.i3(walletLqtPlanAddUI, c0Var);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
