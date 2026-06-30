package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k64 f178220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l64 f178221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178222g;

    public j2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, r45.du4 du4Var, r45.k64 k64Var, r45.l64 l64Var) {
        this.f178222g = walletLqtDetailUI;
        this.f178219d = du4Var;
        this.f178220e = k64Var;
        this.f178221f = l64Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.j64 j64Var;
        r45.j64 j64Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(29559, "14", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_LCT_SHOW_FIRST_TIPS_BOOLEAN_SYNC;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue();
        r45.du4 du4Var = this.f178219d;
        int i17 = du4Var.f372752h;
        r45.l64 l64Var = this.f178221f;
        r45.k64 k64Var = this.f178220e;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178222g;
        if (i17 == 2) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", du4Var.f372750f);
                intent.putExtra("showShare", true);
                intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
                if (!booleanValue && (j64Var2 = k64Var.f378436f.f380162f) != null) {
                    intent.putExtra("key_first_tips", j64Var2.f377607e);
                    intent.putExtra("key_first_tips_title", k64Var.f378436f.f380162f.f377606d);
                }
                com.tencent.mm.wallet_core.ui.r1.T(walletLqtDetailUI.getContext(), intent);
                if (!booleanValue) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                }
                g0Var.d(21309, 2, 2, l64Var.f379175i, l64Var.f379176m, l64Var.f379177n, l64Var.f379178o, 1);
            }
        } else if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i) && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317012a = du4Var.f372753i;
            b1Var.f317022f = du4Var.f372750f;
            b1Var.f317032k = 1061;
            if (!booleanValue && (j64Var = k64Var.f378436f.f380162f) != null) {
                java.lang.String str = j64Var.f377606d;
                java.lang.String str2 = j64Var.f377607e;
                java.lang.String string = walletLqtDetailUI.getString(com.tencent.mm.R.string.f490455vj);
                com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = new com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle();
                weAppOpenDeclarePromptBundle.f74988f = str;
                weAppOpenDeclarePromptBundle.f74989g = str2;
                weAppOpenDeclarePromptBundle.f74990h = string;
                weAppOpenDeclarePromptBundle.f74991i = false;
                b1Var.B = weAppOpenDeclarePromptBundle;
            }
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(walletLqtDetailUI.getContext(), b1Var);
            if (!booleanValue) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            }
            g0Var.d(21309, 2, 2, l64Var.f379175i, l64Var.f379176m, l64Var.f379177n, l64Var.f379178o, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
