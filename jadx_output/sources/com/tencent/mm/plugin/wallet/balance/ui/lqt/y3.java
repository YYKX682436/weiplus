package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178451d;

    public y3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178451d = walletLqtPlanAddUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178451d;
        if (walletLqtPlanAddUI.f177998w.isShown()) {
            walletLqtPlanAddUI.hideWcKb();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "click btn");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.Z6(walletLqtPlanAddUI);
        if (!walletLqtPlanAddUI.f177995t.isEnabled()) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.be5 be5Var = walletLqtPlanAddUI.H;
        if (be5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(be5Var.f370709d)) {
            if (walletLqtPlanAddUI.C == 1) {
                walletLqtPlanAddUI.d7(0);
            } else {
                walletLqtPlanAddUI.d7(4);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(walletLqtPlanAddUI.getContext(), 1, 3);
        z2Var.m(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.f490373t6), walletLqtPlanAddUI.getString(com.tencent.mm.R.string.f490007i9));
        com.tencent.mm.plugin.wallet.balance.ui.lqt.v3 v3Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.v3(walletLqtPlanAddUI, z2Var);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.w3 w3Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.w3(walletLqtPlanAddUI, z2Var);
        z2Var.D = v3Var;
        z2Var.E = w3Var;
        android.view.View inflate = android.view.View.inflate(walletLqtPlanAddUI.getContext(), com.tencent.mm.R.layout.bt7, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.iu7);
        textView.setText(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kpw));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        z2Var.s(inflate);
        android.view.View inflate2 = android.view.View.inflate(walletLqtPlanAddUI.getContext(), com.tencent.mm.R.layout.bt6, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.iu6);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        java.lang.String string = walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kpv, walletLqtPlanAddUI.H.f370709d);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.wallet_core.ui.r1.w0(textView2, string, 0, com.tencent.mm.pluginsdk.ui.span.c0.i(walletLqtPlanAddUI, string).length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.wallet.balance.ui.lqt.x3(walletLqtPlanAddUI), true), walletLqtPlanAddUI.getContext());
        z2Var.j(inflate2);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
