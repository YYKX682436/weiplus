package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI f179002d;

    public g1(com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI walletLuckyMoneyRefundWayUI) {
        this.f179002d = walletLuckyMoneyRefundWayUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pwd/ui/WalletLuckyMoneyRefundWayUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "mOriginWay click!!");
        com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI walletLuckyMoneyRefundWayUI = this.f179002d;
        gs4.f fVar = walletLuckyMoneyRefundWayUI.f178917i;
        com.tencent.mm.plugin.wallet.pwd.ui.g2 g2Var = new com.tencent.mm.plugin.wallet.pwd.ui.g2(walletLuckyMoneyRefundWayUI, fVar);
        android.view.ViewGroup viewGroup = null;
        android.view.View inflate = android.view.View.inflate(walletLuckyMoneyRefundWayUI, com.tencent.mm.R.layout.f489634d83, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.m7j);
        int i17 = 0;
        if (fVar.f275090j.size() > 0) {
            java.util.Iterator it = fVar.f275090j.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                gs4.g gVar = (gs4.g) it.next();
                i18++;
                android.view.View inflate2 = android.view.View.inflate(walletLuckyMoneyRefundWayUI, com.tencent.mm.R.layout.f489635d84, viewGroup);
                linearLayout.addView(inflate2);
                if (i18 != 1) {
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) inflate2.getLayoutParams();
                    if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                        layoutParams = new android.view.ViewGroup.MarginLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
                    }
                    layoutParams.setMargins(i17, i65.a.b(walletLuckyMoneyRefundWayUI, 24), i17, i17);
                    inflate2.setLayoutParams(layoutParams);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.h5n);
                android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.obc);
                android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.nrk);
                if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.f275095d)) {
                    n11.a.b().h(gVar.f275094c, imageView, new o11.f().a());
                } else {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = gVar.f275094c;
                    o11.f fVar2 = new o11.f();
                    fVar2.f342084h = gVar.f275095d;
                    b17.h(str, imageView, fVar2.a());
                }
                textView.setText(gVar.f275092a);
                textView2.setText(gVar.f275093b);
                viewGroup = null;
                i17 = 0;
            }
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(walletLuckyMoneyRefundWayUI);
        u1Var.u(fVar.f275089i);
        u1Var.d(inflate);
        u1Var.n(walletLuckyMoneyRefundWayUI.getString(com.tencent.mm.R.string.f493569kr5));
        u1Var.k(walletLuckyMoneyRefundWayUI.getResources().getColor(com.tencent.mm.R.color.aa6));
        u1Var.l(new com.tencent.mm.plugin.wallet.pwd.ui.f2(g2Var));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletLuckyMoneyRefundWayUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
