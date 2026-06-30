package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180354d;

    public j2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180354d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180354d;
        java.util.List a17 = walletCardElementUI.W.a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.b(walletCardElementUI.getContext(), ((java.lang.Integer) it.next()).intValue()));
        }
        com.tencent.mm.plugin.wallet_core.ui.c2 c2Var = new com.tencent.mm.plugin.wallet_core.ui.c2(walletCardElementUI);
        walletCardElementUI.f179915m2 = -1;
        walletCardElementUI.f179917n2 = a17.indexOf(java.lang.Integer.valueOf(walletCardElementUI.B1));
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(walletCardElementUI.getContext());
        u1Var.u(walletCardElementUI.getString(com.tencent.mm.R.string.khn));
        u1Var.t(arrayList2, c2Var, walletCardElementUI.f179917n2);
        u1Var.b(new com.tencent.mm.plugin.wallet_core.ui.d2(walletCardElementUI));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
