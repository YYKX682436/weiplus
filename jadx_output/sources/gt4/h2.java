package gt4;

/* loaded from: classes9.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275446d;

    public h2(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275446d = walletSuccPageAwardWidget;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        a36.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f275446d;
        a36.c cVar = walletSuccPageAwardWidget.f180741p;
        if (cVar != null && (aVar = cVar.f1108h) != null) {
            walletSuccPageAwardWidget.f180750y = aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, type: %s", java.lang.Integer.valueOf(aVar.f1093f));
            a36.a aVar2 = walletSuccPageAwardWidget.f180750y;
            int i17 = aVar2.f1093f;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", java.lang.Integer.valueOf(i17), walletSuccPageAwardWidget.f180750y.f1094g);
                com.tencent.mm.wallet_core.ui.r1.V(walletSuccPageAwardWidget.f180744s, walletSuccPageAwardWidget.f180750y.f1094g, false);
                walletSuccPageAwardWidget.f180746u = true;
                walletSuccPageAwardWidget.f180749x = true;
                walletSuccPageAwardWidget.A = false;
                walletSuccPageAwardWidget.f180751z.postDelayed(new gt4.f2(this), 3000L);
            } else if (i17 == 2) {
                a36.g gVar = aVar2.f1095h;
                if (gVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, jump tiny app, userName: %s, path: %s, version: %s", gVar.f1142d, gVar.f1143e, java.lang.Integer.valueOf(gVar.f1144f));
                    com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                    java.lang.String str = gVar.f1142d;
                    am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                    nxVar.f7466a = str;
                    java.lang.String str2 = gVar.f1143e;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    nxVar.f7467b = str2;
                    nxVar.f7469d = ad1.d.CTRL_INDEX;
                    nxVar.f7470e = walletSuccPageAwardWidget.f180743r;
                    nxVar.f7468c = 0;
                    int i18 = gVar.f1144f;
                    if (i18 > 0) {
                        nxVar.f7474i = i18;
                    }
                    nxVar.f7471f = walletSuccPageAwardWidget.f180744s;
                    startAppBrandUIFromOuterEvent.e();
                    walletSuccPageAwardWidget.f180746u = true;
                    walletSuccPageAwardWidget.A = false;
                    walletSuccPageAwardWidget.f180751z.postDelayed(new gt4.g2(this), 3000L);
                }
                walletSuccPageAwardWidget.f180749x = true;
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do get lottery");
                com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.a(walletSuccPageAwardWidget);
                walletSuccPageAwardWidget.f180749x = true;
            } else if (i17 == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do nothing");
            } else if (i17 == 6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, show layer");
                walletSuccPageAwardWidget.f180749x = true;
            } else if (i17 == 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, draw lottery");
                com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.b(walletSuccPageAwardWidget, 3, true);
                walletSuccPageAwardWidget.f180749x = true;
            } else if (i17 == 8) {
                com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.a(walletSuccPageAwardWidget);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180750y.f1093f), walletSuccPageAwardWidget.f180750y.f1094g);
                walletSuccPageAwardWidget.f180749x = true;
            } else if (i17 == 9) {
                com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.a(walletSuccPageAwardWidget);
                walletSuccPageAwardWidget.f180749x = true;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 2;
            objArr[1] = java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180746u ? 2 : 1);
            g0Var.d(15225, objArr);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
