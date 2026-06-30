package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes2.dex */
public class m implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jt4.k f181051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI f181052b;

    public m(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI walletECardLogoutUI, jt4.k kVar) {
        this.f181052b = walletECardLogoutUI;
        this.f181051a = kVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ng5 ng5Var = this.f181051a.f301666s;
        java.lang.String str2 = ng5Var.f381392n;
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI walletECardLogoutUI = this.f181052b;
        walletECardLogoutUI.f181034m = str2;
        walletECardLogoutUI.f181035n = ng5Var.f381393o;
        walletECardLogoutUI.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ng5Var.f381387f)) {
            walletECardLogoutUI.setMMTitle(ng5Var.f381387f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ng5Var.f381389h)) {
            walletECardLogoutUI.f181028d.setText(ng5Var.f381389h);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ng5Var.f381388g)) {
            walletECardLogoutUI.f181033i.setUrl(ng5Var.f381388g);
        }
        r45.zs zsVar = ng5Var.f381390i;
        if (zsVar != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(zsVar.f392345d)) {
                walletECardLogoutUI.f181029e.setText(zsVar.f392345d);
            }
            java.util.LinkedList linkedList = zsVar.f392346e;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(walletECardLogoutUI).inflate(com.tencent.mm.R.layout.f488717a50, (android.view.ViewGroup) walletECardLogoutUI.f181031g, false);
                    ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.d_9)).setText(str3);
                    walletECardLogoutUI.f181031g.addView(linearLayout);
                }
            }
        }
        if (ng5Var.f381395q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardLogoutUI", "show trade detail");
            r45.jo6 jo6Var = ng5Var.f381395q;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jo6Var.f377994d)) {
                com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.wallet_ecard.ui.n(walletECardLogoutUI, jo6Var));
                android.text.SpannableString spannableString = new android.text.SpannableString(jo6Var.f377994d);
                spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
                walletECardLogoutUI.f181030f.setClickable(true);
                walletECardLogoutUI.f181030f.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(walletECardLogoutUI));
                walletECardLogoutUI.f181030f.setText(spannableString);
                walletECardLogoutUI.f181030f.setOnClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.o(walletECardLogoutUI));
                walletECardLogoutUI.f181030f.setVisibility(0);
            }
        }
        android.view.View view = walletECardLogoutUI.f181032h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryCancelECardDescRes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryCancelECardDescRes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
