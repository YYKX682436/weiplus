package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class WalletLqtDetailUI extends com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI {
    public static final int R1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
    public android.widget.LinearLayout A;
    public android.widget.LinearLayout A1;
    public android.widget.TextView B;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView B1;
    public android.widget.TextView C;
    public android.widget.TextView C1;
    public android.widget.LinearLayout D;
    public android.widget.ImageView D1;
    public android.widget.TextView E;
    public com.tencent.mm.ui.widget.imageview.WeImageView E1;
    public android.view.View F;
    public boolean F1;
    public android.widget.TextView G;
    public boolean G1;
    public android.view.View H;
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.d H1;
    public android.widget.TextView I;
    public android.widget.LinearLayout I1;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f177950J;
    public android.widget.LinearLayout J1;
    public android.view.View K;
    public boolean K1;
    public android.view.View L;
    public com.tencent.mm.ui.widget.dialog.z2 L1;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView M;
    public com.tencent.mm.ui.widget.dialog.z2 M1;
    public android.widget.TextView N;
    public com.tencent.mm.ui.widget.dialog.z2 N1;
    public boolean O1;
    public android.widget.TextView P;
    public final com.tencent.mm.sdk.event.IListener P1;
    public android.widget.LinearLayout Q;
    public final com.tencent.mm.sdk.event.IListener Q1;
    public android.widget.TextView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.widget.LinearLayout U;
    public android.widget.TextView V;
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView W;
    public android.widget.ProgressBar X;
    public android.app.Dialog Y;
    public boolean Z;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177951e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zg5 f177952f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ScrollView f177953g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f177954h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177955i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f177956l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f177957m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177958n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f177959o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f177960p;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f177961p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f177962p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f177963q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f177964r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f177965s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f177966t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f177967u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f177968v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f177969w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f177970x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f177971x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f177972x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f177973y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f177974y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f177975y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f177976z;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.LinearLayout f177977z1;

    public WalletLqtDetailUI() {
        this.f177951e = (com.tencent.mm.plugin.wallet.balance.model.lqt.z0) this.f177946d.a(this, com.tencent.mm.plugin.wallet.balance.model.lqt.z0.class);
        this.Z = true;
        this.f177961p0 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f177971x0 = false;
        this.f177974y0 = false;
        this.f177956l1 = false;
        this.f177962p1 = false;
        this.f177972x1 = false;
        this.f177975y1 = false;
        this.F1 = false;
        this.G1 = false;
        this.K1 = false;
        this.O1 = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.P1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.25
            {
                this.__eventId = 2351806;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent wCPayUpdateSaveFetchUIEvent) {
                int i17 = wCPayUpdateSaveFetchUIEvent.f54950g.f6427a;
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.this;
                if (i17 == 1) {
                    walletLqtDetailUI.f177951e.f177758e.b(walletLqtDetailUI.f177952f.C, 1);
                    return false;
                }
                if (i17 != 2) {
                    return false;
                }
                com.tencent.mm.plugin.wallet.balance.model.lqt.y0 y0Var = walletLqtDetailUI.f177951e.f177757d;
                int i18 = walletLqtDetailUI.f177952f.C;
                y0Var.getClass();
                ((km5.q) km5.u.f(java.lang.Integer.valueOf(i18), 1)).n(y0Var);
                return false;
            }
        };
        this.Q1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.26
            {
                this.__eventId = -391684019;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent wCPayLqtDetailUIShowDialogEvent) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.this.H1.a(wCPayLqtDetailUIShowDialogEvent.f54947g.f6116a, null);
                return false;
            }
        };
    }

    public static void U6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        r45.bm5 bm5Var;
        android.widget.TextView textView;
        walletLqtDetailUI.X6(viewGroup);
        if (jSONObject == null || (bm5Var = du4Var.f372755n) == null || com.tencent.mm.sdk.platformtools.t8.K0(bm5Var.f370873e)) {
            return;
        }
        if (du4Var.f372755n.f370872d == 4 && (textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.iux)) != null) {
            textView.setText("");
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.x0 x0Var = walletLqtDetailUI.f177951e.f177760g;
        java.lang.String str = du4Var.f372755n.f370873e;
        x0Var.getClass();
        ((km5.q) km5.u.e(str)).n(x0Var);
        jSONObject.remove(du4Var.f372755n.f370873e);
        jSONObject.remove(java.lang.String.format("%s_expiretime", du4Var.f372755n.f370873e));
        jSONObject.remove(java.lang.String.format("%s_wording", du4Var.f372755n.f370873e));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, jSONObject.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, du4Var.f372755n.f370873e, 3, "");
        du4Var.f372755n = null;
    }

    public static void V6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, r45.bq bqVar) {
        java.lang.String str;
        walletLqtDetailUI.getClass();
        if (z2Var != null) {
            z2Var.B();
        }
        if (bqVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "performDialogButtonAction action:%s url:%s", java.lang.Integer.valueOf(bqVar.f370957d), bqVar.f370958e);
        int i17 = bqVar.f370957d;
        if (i17 == 1) {
            walletLqtDetailUI.finish();
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(walletLqtDetailUI.getContext(), bqVar.f370958e, true);
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(bqVar.f370959f, bqVar.f370958e, 0, 1000);
            return;
        }
        if (i17 == 4 && (str = bqVar.f370958e) != null && str.startsWith("weixin://wcpay/lqt/save")) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.b(bqVar.f370958e);
            java.lang.String a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.a(bqVar.f370958e);
            android.content.Intent intent = new android.content.Intent(walletLqtDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
            try {
                android.net.Uri parse = android.net.Uri.parse(bqVar.f370958e);
                java.lang.String queryParameter = parse.getQueryParameter("default_amount");
                java.lang.String queryParameter2 = parse.getQueryParameter("default_card_bind_serial");
                java.lang.String queryParameter3 = parse.getQueryParameter("pull_keyboard");
                intent.putExtra("fill_money", com.tencent.mm.wallet_core.ui.r1.o(java.lang.Double.parseDouble(queryParameter) / 100.0d));
                intent.putExtra("card_serial", queryParameter2);
                intent.putExtra("need_pull_keyboard", "1".equals(queryParameter3));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e17, "", new java.lang.Object[0]);
            }
            walletLqtDetailUI.b7(a17, intent);
        }
    }

    public static void W6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        if (walletLqtDetailUI.f177952f.R != null) {
            y9.i iVar = new y9.i(walletLqtDetailUI.getContext(), 0);
            int i17 = walletLqtDetailUI.f177952f.R.f386753h;
            if (i17 == 0) {
                android.view.View inflate = android.view.View.inflate(walletLqtDetailUI.getContext(), com.tencent.mm.R.layout.btf, null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.iws);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.iwj);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.iwr);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.iwq);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.i07);
                textView.setText(walletLqtDetailUI.f177952f.R.f386749d);
                if (com.tencent.mm.sdk.platformtools.t8.K0(walletLqtDetailUI.f177952f.R.f386752g)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(walletLqtDetailUI.f177952f.R.f386752g);
                    textView2.setVisibility(0);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(walletLqtDetailUI.f177952f.R.f386756n)) {
                    textView3.setText(walletLqtDetailUI.getString(com.tencent.mm.R.string.kpo));
                } else {
                    textView3.setText(walletLqtDetailUI.f177952f.R.f386756n);
                }
                if (walletLqtDetailUI.f177952f.R.f386751f != null) {
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = R1;
                    java.util.Iterator it = walletLqtDetailUI.f177952f.R.f386751f.iterator();
                    while (it.hasNext()) {
                        r45.us0 us0Var = (r45.us0) it.next();
                        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) android.view.View.inflate(walletLqtDetailUI.getContext(), com.tencent.mm.R.layout.btg, null);
                        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup3.findViewById(com.tencent.mm.R.id.iwo);
                        android.widget.TextView textView4 = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.iwp);
                        android.widget.TextView textView5 = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.iwn);
                        cdnImageView.setUrl(us0Var.f387608d);
                        textView4.setText(us0Var.f387609e);
                        textView5.setText(us0Var.f387610f);
                        viewGroup.addView(viewGroup3, layoutParams);
                    }
                }
                viewGroup2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.j1(walletLqtDetailUI, iVar));
                iVar.setContentView(inflate);
                com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) inflate.getParent());
                if (A != null) {
                    A.C(i65.a.b(walletLqtDetailUI.getContext(), com.tencent.mm.plugin.appbrand.jsapi.advertise.r.CTRL_INDEX));
                    A.f44443p = false;
                }
            } else if (i17 == 1) {
                android.view.View inflate2 = android.view.View.inflate(walletLqtDetailUI.getContext(), com.tencent.mm.R.layout.btf, null);
                android.widget.TextView textView6 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.iws);
                android.widget.TextView textView7 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.iwj);
                android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) inflate2.findViewById(com.tencent.mm.R.id.iwr);
                android.widget.TextView textView8 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.iwq);
                android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) inflate2.findViewById(com.tencent.mm.R.id.i07);
                android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.iwk);
                textView6.setText(walletLqtDetailUI.f177952f.R.f386749d);
                textView7.setVisibility(8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(walletLqtDetailUI.f177952f.R.f386756n)) {
                    textView8.setText(walletLqtDetailUI.getString(com.tencent.mm.R.string.kpo));
                } else {
                    textView8.setText(walletLqtDetailUI.f177952f.R.f386756n);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configStaticVideoFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configStaticVideoFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (walletLqtDetailUI.f177952f.R.f386754i != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) android.view.View.inflate(walletLqtDetailUI.getContext(), com.tencent.mm.R.layout.bth, null);
                    java.lang.String str = walletLqtDetailUI.f177952f.R.f386754i.f382175d;
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) constraintLayout.findViewById(com.tencent.mm.R.id.iwl);
                    cdnImageView2.setUrl(str);
                    viewGroup4.setPadding(0, viewGroup4.getPaddingTop(), 0, viewGroup4.getPaddingBottom());
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) cdnImageView2.getLayoutParams();
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = (int) ((((com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin) / 366.0d) * 196.0d);
                    cdnImageView2.setLayoutParams(layoutParams2);
                    viewGroup4.addView(constraintLayout);
                    constraintLayout.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.k1(walletLqtDetailUI));
                }
                viewGroup5.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.l1(walletLqtDetailUI, iVar));
                iVar.setContentView(inflate2);
                com.google.android.material.bottomsheet.BottomSheetBehavior A2 = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) inflate2.getParent());
                if (A2 != null) {
                    A2.C(i65.a.b(walletLqtDetailUI.getContext(), com.tencent.mm.plugin.appbrand.jsapi.advertise.r.CTRL_INDEX));
                    A2.f44443p = false;
                }
            } else if (i17 == 2) {
                android.view.View inflate3 = android.view.View.inflate(walletLqtDetailUI.getContext(), com.tencent.mm.R.layout.btf, null);
                android.widget.TextView textView9 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.iws);
                android.widget.TextView textView10 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.iwj);
                android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) inflate3.findViewById(com.tencent.mm.R.id.iwr);
                android.widget.TextView textView11 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.iwq);
                android.view.ViewGroup viewGroup7 = (android.view.ViewGroup) inflate3.findViewById(com.tencent.mm.R.id.i07);
                android.view.View findViewById2 = inflate3.findViewById(com.tencent.mm.R.id.iwk);
                textView9.setText(walletLqtDetailUI.f177952f.R.f386749d);
                textView10.setVisibility(8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(walletLqtDetailUI.f177952f.R.f386756n)) {
                    textView11.setText(walletLqtDetailUI.getString(com.tencent.mm.R.string.kpo));
                } else {
                    textView11.setText(walletLqtDetailUI.f177952f.R.f386756n);
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configVideoFeedFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configVideoFeedFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (walletLqtDetailUI.f177952f.R.f386755m != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) android.view.View.inflate(walletLqtDetailUI.getContext(), com.tencent.mm.R.layout.bth, null);
                    java.lang.String str2 = walletLqtDetailUI.f177952f.R.f386755m.f380013d;
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView3 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) constraintLayout2.findViewById(com.tencent.mm.R.id.iwl);
                    cdnImageView3.setUrl(str2);
                    viewGroup6.setPadding(0, viewGroup6.getPaddingTop(), 0, viewGroup6.getPaddingBottom());
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) cdnImageView3.getLayoutParams();
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).width = (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).height = (int) ((((com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).rightMargin) / 366.0d) * 196.0d);
                    cdnImageView3.setLayoutParams(layoutParams3);
                    viewGroup6.addView(constraintLayout2);
                    constraintLayout2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.m1(walletLqtDetailUI));
                }
                viewGroup7.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n1(walletLqtDetailUI, iVar));
                iVar.setContentView(inflate3);
                com.google.android.material.bottomsheet.BottomSheetBehavior A3 = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) inflate3.getParent());
                if (A3 != null) {
                    A3.C(i65.a.b(walletLqtDetailUI.getContext(), com.tencent.mm.plugin.appbrand.jsapi.advertise.r.CTRL_INDEX));
                    A3.f44443p = false;
                }
            }
            iVar.show();
        }
    }

    public final void X6(android.view.ViewGroup viewGroup) {
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.k2n);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.k2o);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.k2k);
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.k2l);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    public void Y6(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail: %s", java.lang.Integer.valueOf(i17));
        if (this.f177951e == null) {
            return;
        }
        if (z17) {
            android.app.Dialog dialog = this.Y;
            if (dialog == null) {
                this.Y = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, null);
            } else {
                dialog.show();
            }
        }
        ((km5.q) this.f177951e.f177755b.b().h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.e1(this))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v0(this, i17));
    }

    public final org.json.JSONObject Z6() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public final void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to fetch ui");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fetch_mode", 2);
        intent.putExtra("lqt_balance", this.f177952f.f392011f);
        intent.putExtra("lqt_max_redeem_amount", this.f177952f.f392029x);
        intent.putExtra("lqt_redeem_invalid_amount_hint", this.f177952f.f392032y);
        intent.putExtra("lqt_account_type", this.f177952f.C);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 1);
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtFetchUseCase(getContext(), intent, new com.tencent.mm.plugin.wallet.balance.ui.lqt.c1(this))) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoFetchUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoFetchUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b7(java.lang.String str, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to save ui");
        r45.zg5 zg5Var = this.f177952f;
        intent.putExtra("lqt_save_fund_code", zg5Var != null ? zg5Var.f392023r : null);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", this.f177952f.f392018o == 1);
        intent.putExtra("lqt_is_agree_protocol", this.f177952f.f392019p == 1);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.LinkedList linkedList = this.f177952f.f392022q;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = this.f177952f.f392022q.iterator();
            while (it.hasNext()) {
                r45.if0 if0Var = (r45.if0) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376981d) && !com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376983f)) {
                    arrayList.add(java.lang.String.format("%s||%s", if0Var.f376981d, if0Var.f376983f));
                }
            }
        }
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", this.f177952f.f392035z);
        intent.putExtra("lqt_account_type", this.f177952f.C);
        intent.putExtra("lqt_fund_spid", this.f177952f.D);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 1);
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(getContext(), intent, new com.tencent.mm.plugin.wallet.balance.ui.lqt.b1(this))) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoSaveUI", "(Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoSaveUI", "(Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final boolean c7() {
        return this.f177952f.D1 == 2;
    }

    public final void d7(r45.du4 du4Var) {
        if (du4Var == null) {
            return;
        }
        if ("wxpay://lqt/fixeddeposit/makeplan".equals(du4Var.f372750f) || "wxpay://lqt/fixeddeposit/planlist".equals(du4Var.f372750f)) {
            if (!this.G1) {
                this.G1 = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22449, 1);
            }
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue() || !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372749e)) {
                return;
            }
            du4Var.f372749e = getContext().getResources().getText(com.tencent.mm.R.string.kpp).toString();
        }
    }

    public final void e7(boolean z17) {
        r45.m64 m64Var;
        r45.oa5 oa5Var;
        android.view.View findViewById;
        char c17;
        r45.na5 na5Var;
        if (this.f177952f != null) {
            this.f177953g.setOnScrollChangeListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.p1(this));
            if (this.f177952f.Z == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "svr not return data, hide security entry");
                this.A1.setVisibility(8);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show lqt security entry with svr data");
                this.A1.setVisibility(0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.Z.f372754m)) {
                    this.B1.setVisibility(8);
                } else {
                    this.B1.setVisibility(0);
                    this.B1.setUrl(this.f177952f.Z.f372754m);
                }
                this.C1.setText(this.f177952f.Z.f372748d);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f177977z1.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.topMargin = i65.a.b(getContext(), 16);
                    this.f177977z1.setLayoutParams(layoutParams);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "has click reddot");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.E1.getLayoutParams();
                this.D1.setVisibility(8);
                if (layoutParams2 != null) {
                    layoutParams2.leftMargin = i65.a.b(getContext(), 4);
                    this.E1.setLayoutParams(layoutParams2);
                }
                if (!this.F1) {
                    this.F1 = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 20);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "report show security entry");
                }
                this.A1.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.a2(this));
            }
            if (!z17 && (na5Var = this.f177952f.A1) != null) {
                if (this.K1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "has showed dialog, ignore");
                } else {
                    this.K1 = true;
                    this.L1 = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 0, false);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(na5Var.f381203h.f370960g)) {
                        this.L1.y(getResources().getString(com.tencent.mm.R.string.f492294fz1));
                    } else {
                        this.L1.y(na5Var.f381203h.f370960g);
                    }
                    this.L1.x(0);
                    this.L1.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.b2(this);
                    android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489626d71, (android.view.ViewGroup) null);
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.ivh);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ivi);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ivg);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(na5Var.f381205m)) {
                        cdnImageView.setVisibility(8);
                    } else {
                        cdnImageView.setVisibility(0);
                        if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(na5Var.f381206n)) {
                            cdnImageView.setUrl(na5Var.f381205m);
                        } else {
                            cdnImageView.setUrl(na5Var.f381206n);
                        }
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(na5Var.f381207o)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(na5Var.f381207o);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(na5Var.f381202g.f371343d)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(na5Var.f381202g.f371343d);
                    }
                    this.L1.j(inflate);
                    this.L1.C();
                }
            }
            this.f177954h.setVisibility(0);
            long longValue = ((java.lang.Long) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_NEW_LQT_LONG_SYNC, 0L)).longValue();
            this.W.e(com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.j("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP)), !z17);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iun);
            if (imageView != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.E)) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ivd);
            if (imageView2 != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.E)) {
                    imageView2.setVisibility(8);
                } else {
                    imageView2.setVisibility(0);
                }
            }
            this.J1.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.f2(this));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.f392021p1)) {
                this.f177955i.setText(this.f177952f.f392021p1);
            }
            this.f177957m.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.m2(this));
            this.f177958n.setText(this.f177952f.f392012g);
            this.f177959o.setText(this.f177952f.f392013h);
            this.f177963q.setText(this.f177952f.f392014i);
            this.f177964r.setText(com.tencent.mm.wallet_core.ui.r1.m(com.tencent.mm.wallet_core.ui.r1.j("" + this.f177952f.f392016m, "100", 2, java.math.RoundingMode.HALF_UP)));
            this.f177960p.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n2(this));
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.H)) {
                this.S.setVisibility(4);
            } else {
                this.S.setText(this.f177952f.H);
                this.S.setVisibility(0);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.P)) {
                this.T.setVisibility(4);
            } else {
                this.T.setText(this.f177952f.P);
                this.T.setVisibility(0);
            }
            this.f177973y.removeAllViews();
            this.f177976z.removeAllViews();
            if (this.f177952f.C1.size() <= 0 || !c7()) {
                r45.k64 k64Var = this.f177952f.Y;
                if (k64Var != null && k64Var.f378434d == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "showLctOperationView");
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.d(29559, "11", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    if (!this.f177974y0) {
                        g0Var.d(17084, 10);
                        this.f177974y0 = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "ReportShowLctOperationView");
                    }
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f177976z.getLayoutParams();
                    layoutParams3.setMargins(0, i65.a.b(getContext(), 24), 0, 0);
                    this.f177976z.setLayoutParams(layoutParams3);
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.bti, (android.view.ViewGroup) this.f177976z, false);
                    android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ix7);
                    android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ix6);
                    textView3.setText(this.f177952f.Y.f378435e.f372748d);
                    textView4.setText(this.f177952f.Y.f378435e.f372749e);
                    r45.du4 du4Var = this.f177952f.Y.f378435e;
                    int i17 = du4Var.f372752h;
                    if (i17 != 1) {
                        if (i17 == 2) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                                viewGroup.setTag(this.f177952f.Y.f378435e.f372750f);
                                viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.c2(this, viewGroup));
                            }
                        } else if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.Y.f378435e.f372750f)) {
                            viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.d2(this));
                        }
                    }
                    this.f177976z.addView(viewGroup);
                } else if (k64Var != null && k64Var.f378434d == 2 && (m64Var = k64Var.f378436f) != null) {
                    java.util.LinkedList linkedList = m64Var.f380161e;
                    if (linkedList == null || linkedList.isEmpty()) {
                        f7(this.f177952f.Y);
                    } else {
                        g7();
                    }
                }
            } else {
                h7(this.f177952f.C1);
            }
            if (!c7()) {
                java.util.LinkedList linkedList2 = this.f177952f.G;
                int i18 = com.tencent.mm.R.id.hzj;
                int i19 = com.tencent.mm.R.id.iux;
                int i27 = com.tencent.mm.R.id.iuz;
                int i28 = com.tencent.mm.R.layout.bt_;
                if (linkedList2 == null || linkedList2.isEmpty()) {
                    java.util.LinkedList linkedList3 = this.f177952f.f392017n;
                    if (linkedList3 != null && linkedList3.size() > 0) {
                        java.util.Iterator it = this.f177952f.f392017n.iterator();
                        int i29 = 0;
                        while (it.hasNext()) {
                            r45.if0 if0Var = (r45.if0) it.next();
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.bt_, (android.view.ViewGroup) this.f177973y, false);
                            android.widget.TextView textView5 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.iuz);
                            android.widget.TextView textView6 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.iux);
                            android.view.View findViewById2 = viewGroup2.findViewById(com.tencent.mm.R.id.hzj);
                            if (i29 == this.f177952f.f392017n.size() - 1) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(8);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                viewGroup2.setBackgroundResource(com.tencent.mm.R.drawable.f481024j1);
                            }
                            textView5.setText(if0Var.f376981d);
                            textView6.setText(if0Var.f376982e);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376983f)) {
                                viewGroup2.setTag(if0Var.f376983f);
                                viewGroup2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.q0(this, viewGroup2));
                            }
                            this.f177973y.addView(viewGroup2, new android.widget.LinearLayout.LayoutParams(-1, -2, -1.0f));
                            i29++;
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show old info node list");
                    java.util.Iterator it6 = this.f177952f.G.iterator();
                    int i37 = 0;
                    while (it6.hasNext()) {
                        r45.du4 du4Var2 = (r45.du4) it6.next();
                        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) getLayoutInflater().inflate(i28, (android.view.ViewGroup) this.f177973y, false);
                        android.widget.TextView textView7 = (android.widget.TextView) viewGroup3.findViewById(i27);
                        android.widget.TextView textView8 = (android.widget.TextView) viewGroup3.findViewById(i19);
                        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup3.findViewById(com.tencent.mm.R.id.hzh);
                        android.view.View findViewById3 = viewGroup3.findViewById(i18);
                        if (i37 == this.f177952f.G.size() - 1) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            viewGroup3.setBackgroundResource(com.tencent.mm.R.drawable.f481024j1);
                        }
                        d7(du4Var2);
                        textView7.setText(du4Var2.f372748d);
                        org.json.JSONObject Z6 = Z6();
                        r45.bm5 bm5Var = du4Var2.f372755n;
                        if (bm5Var == null || Z6 == null) {
                            X6(viewGroup3);
                            textView8.setText(du4Var2.f372749e);
                        } else {
                            j7(Z6, bm5Var, du4Var2, viewGroup3);
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var2.f372754m)) {
                            cdnImageView2.setVisibility(8);
                        } else {
                            cdnImageView2.setUseSdcardCache(true);
                            cdnImageView2.setUrl(du4Var2.f372754m);
                            cdnImageView2.setVisibility(0);
                        }
                        int i38 = du4Var2.f372752h;
                        if (i38 == 1) {
                            if ("wxpay://lqt/planindex".equals(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.o2(this, Z6, du4Var2, viewGroup3));
                            } else if ("wxpay://lqt/autochargesetting".equals(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.p2(this, Z6, du4Var2, viewGroup3));
                            } else if ("wxpay://lqt/fixeddeposit/makeplan".equals(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.q2(this, Z6, du4Var2, viewGroup3));
                            } else if ("wxpay://lqt/fixeddeposit/planlist".equals(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.j0(this, Z6, du4Var2, viewGroup3));
                            } else if ("wxpay://lqt/spenddeposit/makeplan".equals(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.l0(this, Z6, du4Var2, viewGroup3));
                            } else if ("wxpay://lqt/spenddeposit/plandetail".equals(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n0(this, Z6, du4Var2, viewGroup3));
                            }
                        } else if (i38 != 2) {
                            c17 = 3;
                            if (i38 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var2.f372753i) && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var2.f372750f)) {
                                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.p0(this, Z6, du4Var2, viewGroup3));
                            }
                            this.f177973y.addView(viewGroup3, new android.widget.LinearLayout.LayoutParams(-1, -2, -1.0f));
                            i37++;
                            i28 = com.tencent.mm.R.layout.bt_;
                            i27 = com.tencent.mm.R.id.iuz;
                            i18 = com.tencent.mm.R.id.hzj;
                            i19 = com.tencent.mm.R.id.iux;
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var2.f372750f)) {
                            viewGroup3.setTag(du4Var2.f372750f);
                            viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.o0(this, Z6, du4Var2, viewGroup3));
                        }
                        c17 = 3;
                        this.f177973y.addView(viewGroup3, new android.widget.LinearLayout.LayoutParams(-1, -2, -1.0f));
                        i37++;
                        i28 = com.tencent.mm.R.layout.bt_;
                        i27 = com.tencent.mm.R.id.iuz;
                        i18 = com.tencent.mm.R.id.hzj;
                        i19 = com.tencent.mm.R.id.iux;
                    }
                }
            }
            if (this.f177973y.getChildCount() == 0 && (findViewById = findViewById(com.tencent.mm.R.id.iw7)) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f177952f.f392033y0) {
                this.f177967u.setEnabled(false);
            } else {
                this.f177967u.setEnabled(true);
            }
            if (this.f177952f.f392030x0) {
                this.f177966t.setEnabled(false);
            } else {
                this.f177966t.setEnabled(true);
            }
            if (this.f177952f.f392011f <= 0) {
                this.f177967u.setEnabled(false);
            }
            if (c7()) {
                this.f177965s.removeAllViews();
                android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                if (this.f177952f.F1 == 2) {
                    layoutParams5.setMargins(i65.a.b(getContext(), 16), 0, 0, 0);
                    this.f177965s.addView(this.f177966t);
                    this.f177965s.addView(this.f177967u);
                } else {
                    layoutParams4.setMargins(i65.a.b(getContext(), 16), 0, 0, 0);
                    this.f177965s.addView(this.f177967u);
                    this.f177965s.addView(this.f177966t);
                }
                android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams6.setMargins(0, i65.a.b(getContext(), 32), 0, 0);
                layoutParams6.gravity = 1;
                this.f177965s.setOrientation(0);
                this.f177965s.setLayoutParams(layoutParams6);
                layoutParams4.width = i65.a.b(getContext(), 120);
                this.f177966t.setLayoutParams(layoutParams4);
                layoutParams5.width = i65.a.b(getContext(), 120);
                this.f177967u.setLayoutParams(layoutParams5);
                if (this.f177952f.G.size() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show refactor new info node list");
                    r45.du4 du4Var3 = (r45.du4) this.f177952f.G.get(0);
                    this.f177968v.setBackgroundResource(com.tencent.mm.R.drawable.b_r);
                    this.f177968v.setVisibility(0);
                    this.f177968v.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.r0(this, du4Var3));
                    this.f177969w.setUrl(du4Var3.f372754m);
                    this.f177970x.setText(du4Var3.f372748d);
                    org.json.JSONObject Z62 = Z6();
                    r45.bm5 bm5Var2 = du4Var3.f372755n;
                    if (bm5Var2 == null || Z62 == null) {
                        X6(this.f177968v);
                    } else {
                        j7(Z62, bm5Var2, du4Var3, this.f177968v);
                    }
                    if (!this.f177975y1) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "3", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        this.f177975y1 = true;
                    }
                }
            } else {
                this.f177965s.removeAllViews();
                this.f177965s.addView(this.f177966t);
                this.f177965s.addView(this.f177967u);
                android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams7.setMargins(0, i65.a.b(getContext(), 40), 0, 0);
                layoutParams7.gravity = 1;
                this.f177965s.setOrientation(1);
                this.f177965s.setLayoutParams(layoutParams7);
                android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams8.width = i65.a.b(getContext(), 184);
                this.f177966t.setLayoutParams(layoutParams8);
                android.widget.LinearLayout.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams9.setMargins(0, i65.a.b(getContext(), 16), 0, 0);
                layoutParams9.width = i65.a.b(getContext(), 184);
                this.f177967u.setLayoutParams(layoutParams9);
                this.f177968v.setVisibility(8);
            }
            boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.Q);
            r45.if0 if0Var2 = this.f177952f.f392024s;
            boolean z19 = (if0Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(if0Var2.f376981d)) ? false : true;
            r45.c70 c70Var = this.f177952f.f392015l1;
            boolean z27 = (c70Var == null || com.tencent.mm.sdk.platformtools.t8.K0(c70Var.f371344e)) ? false : true;
            if (z18) {
                this.V.setText(this.f177952f.Q);
                com.tencent.mm.ui.bk.r0(this.V.getPaint(), 0.8f);
                com.tencent.mm.wallet_core.ui.r1.k(this.V, 50);
                this.U.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.s0(this));
                this.U.setVisibility(0);
            } else {
                this.U.setVisibility(8);
            }
            if (z19) {
                this.B.setText(this.f177952f.f392024s.f376981d);
                com.tencent.mm.ui.bk.r0(this.B.getPaint(), 0.8f);
                this.A.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t0(this));
                this.A.setVisibility(0);
            } else {
                this.A.setVisibility(8);
            }
            if (z27) {
                this.E.setText(this.f177952f.f392015l1.f371344e);
                com.tencent.mm.ui.bk.r0(this.E.getPaint(), 0.8f);
                this.D.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.u0(this));
                this.D.setVisibility(0);
            } else {
                this.D.setVisibility(8);
            }
            android.view.View view = this.F;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.if0 if0Var3 = this.f177952f.f392026u;
            if (if0Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(if0Var3.f376981d)) {
                this.I1.sendAccessibilityEvent(128);
            } else {
                android.view.View view2 = this.F;
                zj0.a aVar = new zj0.a();
                zj0.c.c(0, aVar);
                yj0.a.d(view2, aVar.b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) aVar.a(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.G.setText(this.f177952f.f392026u.f376981d);
                this.F.sendAccessibilityEvent(128);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.f392026u.f376983f)) {
                    this.F.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.w0(this));
                }
            }
            i7();
            android.view.View view3 = this.L;
            zj0.a aVar2 = new zj0.a();
            zj0.c.c(8, aVar2);
            yj0.a.d(view3, aVar2.b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) aVar2.a(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.K;
            zj0.a aVar3 = new zj0.a();
            zj0.c.c(8, aVar3);
            yj0.a.d(view4, aVar3.b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) aVar3.a(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.pm4 pm4Var = this.f177952f.f392027v;
            if (pm4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(pm4Var.f383182g)) {
                this.M.setUrl(this.f177952f.f392027v.f383179d);
                this.N.setText(this.f177952f.f392027v.f383180e);
                this.P.setText(this.f177952f.f392027v.f383181f);
                this.L.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.x0(this));
                android.view.View view5 = this.K;
                zj0.a aVar4 = new zj0.a();
                zj0.c.c(0, aVar4);
                yj0.a.d(view5, aVar4.b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) aVar4.a(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.L;
                zj0.a aVar5 = new zj0.a();
                zj0.c.c(0, aVar5);
                yj0.a.d(view6, aVar5.b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) aVar5.a(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "setViewData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177952f.K)) {
                int i39 = this.f177952f.C;
                if (i39 == 1) {
                    this.C.setText(com.tencent.mm.R.string.f493553kp1);
                } else if (i39 == 2) {
                    this.C.setText(com.tencent.mm.R.string.f493554kp2);
                }
            } else {
                this.C.setText(this.f177952f.K);
            }
            r45.du4 du4Var4 = this.f177952f.L;
            if (du4Var4 == null || com.tencent.mm.sdk.platformtools.t8.K0(du4Var4.f372748d)) {
                this.Q.setVisibility(8);
            } else {
                this.Q.setVisibility(0);
                this.R.setText(this.f177952f.L.f372748d);
                com.tencent.mm.ui.bk.r0(this.R.getPaint(), 0.8f);
                this.Q.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.y0(this));
            }
            this.f177966t.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z0(this));
            this.f177967u.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.a1(this));
            r45.zg5 zg5Var = this.f177952f;
            if (zg5Var.S && (oa5Var = zg5Var.T) != null) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.e3.b(this, oa5Var);
            }
        }
        removeAllOptionMenu();
        r45.zg5 zg5Var2 = this.f177952f;
        if (zg5Var2 != null) {
            java.util.LinkedList linkedList4 = zg5Var2.U;
            if (linkedList4 != null && linkedList4.size() == 1 && this.f177952f.B) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show text menu");
                r45.du4 du4Var5 = (r45.du4) this.f177952f.U.get(0);
                addTextOptionMenu(0, du4Var5.f372748d, new com.tencent.mm.plugin.wallet.balance.ui.lqt.o1(this, du4Var5));
            } else {
                addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.wallet.balance.ui.lqt.t1(this));
            }
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.r2 r2Var = (com.tencent.mm.plugin.wallet.balance.ui.lqt.r2) component(com.tencent.mm.plugin.wallet.balance.ui.lqt.r2.class);
        if (this.f177952f == null) {
            r2Var.getClass();
            return;
        }
        android.widget.Button button = (android.widget.Button) r2Var.findViewById(com.tencent.mm.R.id.ivs);
        android.widget.Button button2 = (android.widget.Button) r2Var.findViewById(com.tencent.mm.R.id.iv8);
        if (button2 != null && button2.isEnabled()) {
            r2Var.R6(m05.n.f322580g, "lqt_fetch_btn");
        }
        if (button == null || !button.isEnabled()) {
            return;
        }
        r2Var.R6(m05.n.f322580g, "lqt_save_btn");
    }

    public final void f7(r45.k64 k64Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "showLctOperationView2");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(29559, "11", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f177976z.getLayoutParams();
        layoutParams.setMargins(0, i65.a.b(getContext(), 24), 0, 0);
        this.f177976z.setLayoutParams(layoutParams);
        if (k64Var.f378436f.f380160d != null) {
            if (!this.f177956l1) {
                g0Var.d(21309, 1, 1);
                this.f177956l1 = true;
            }
            r45.du4 du4Var = k64Var.f378436f.f380160d;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.btj, (android.view.ViewGroup) this.f177976z, false);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup.findViewById(com.tencent.mm.R.id.iwy);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ix8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372754m)) {
                cdnImageView.setVisibility(8);
            } else {
                cdnImageView.setUrl(du4Var.f372754m);
                cdnImageView.setVisibility(0);
            }
            textView.setText(du4Var.f372748d);
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.e2(this, du4Var, k64Var));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
            int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            marginLayoutParams.leftMargin = b17;
            marginLayoutParams.rightMargin = b17;
            this.f177976z.addView(viewGroup, marginLayoutParams);
        }
    }

    public final void g7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "showLctOperationView3");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(29559, "11", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f177976z.getLayoutParams();
        layoutParams.setMargins(0, i65.a.b(getContext(), 24), 0, 0);
        this.f177976z.setLayoutParams(layoutParams);
        if (this.f177952f.Y.f378436f.f380160d != null) {
            if (!this.f177962p1) {
                g0Var.d(21309, 2, 1);
                this.f177962p1 = true;
            }
            r45.m64 m64Var = this.f177952f.Y.f378436f;
            r45.du4 du4Var = m64Var.f380160d;
            r45.l64 l64Var = (r45.l64) m64Var.f380161e.get(0);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.btk, (android.view.ViewGroup) this.f177976z, false);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup.findViewById(com.tencent.mm.R.id.iwy);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ix8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372754m)) {
                cdnImageView.setVisibility(8);
            } else {
                cdnImageView.setUrl(du4Var.f372754m);
                cdnImageView.setVisibility(0);
            }
            textView.setText(du4Var.f372748d);
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.g2(this, du4Var, l64Var));
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485749ix2);
            android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485747ix0);
            android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485751ix4);
            android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485750ix3);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f485748ix1);
            textView2.setText(l64Var.f379170d);
            textView3.setText(l64Var.f379171e);
            textView4.setText(l64Var.f379172f);
            textView5.setText(l64Var.f379173g);
            viewGroup2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.h2(this, l64Var));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
            int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            marginLayoutParams.leftMargin = b17;
            marginLayoutParams.rightMargin = b17;
            this.f177976z.addView(viewGroup, marginLayoutParams);
        }
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489627d72;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public java.lang.Class getReportUIC() {
        return com.tencent.mm.plugin.wallet.balance.ui.lqt.r2.class;
    }

    public final void h7(java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show lct refactor operation view");
        int i17 = 29559;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "12", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (linkedList.size() == 0) {
            return;
        }
        this.f177976z.removeAllViews();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f177976z.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.f177976z.setLayoutParams(layoutParams);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(getString(com.tencent.mm.R.string.f493555kp3));
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(i65.a.b(getContext(), 8), i65.a.b(getContext(), 16), 0, 0);
        this.f177976z.addView(textView, marginLayoutParams);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.k64 k64Var = (r45.k64) it.next();
            r45.m64 m64Var = k64Var.f378436f;
            r45.du4 du4Var = m64Var.f380160d;
            if (m64Var.f380161e.size() > 0) {
                if (k64Var.f378437g == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, "9", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
                r45.l64 l64Var = (r45.l64) k64Var.f378436f.f380161e.get(0);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.btt, (android.view.ViewGroup) this.f177976z, false);
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup.findViewById(com.tencent.mm.R.id.iwy);
                android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ix8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372754m)) {
                    cdnImageView.setVisibility(8);
                } else {
                    cdnImageView.setUrl(du4Var.f372754m);
                    cdnImageView.setVisibility(0);
                }
                textView2.setText(du4Var.f372748d);
                android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485749ix2);
                android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485747ix0);
                android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485751ix4);
                android.widget.TextView textView6 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485750ix3);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f485748ix1);
                textView3.setText(l64Var.f379170d);
                textView4.setText(l64Var.f379171e);
                textView5.setText(l64Var.f379172f);
                textView6.setText(l64Var.f379173g);
                if (k64Var.f378437g == 2) {
                    viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.i2(this, du4Var, k64Var, l64Var));
                } else {
                    viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.j2(this, du4Var, k64Var, l64Var));
                    viewGroup2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.k2(this, l64Var, k64Var));
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
                int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
                marginLayoutParams2.leftMargin = b17;
                marginLayoutParams2.rightMargin = b17;
                marginLayoutParams2.topMargin = b17;
                this.f177976z.addView(viewGroup, marginLayoutParams2);
            } else if (k64Var.f378436f.f380161e.size() == 0 && k64Var.f378436f.f380160d != null) {
                if (!this.f177956l1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21309, 1, 1);
                    this.f177956l1 = true;
                }
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.btu, (android.view.ViewGroup) this.f177976z, false);
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup3.findViewById(com.tencent.mm.R.id.iwy);
                android.widget.TextView textView7 = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.ix8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372754m)) {
                    cdnImageView2.setVisibility(8);
                } else {
                    cdnImageView2.setUrl(du4Var.f372754m);
                    cdnImageView2.setVisibility(0);
                }
                textView7.setText(du4Var.f372748d);
                viewGroup3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.l2(this, du4Var, k64Var));
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
                int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
                marginLayoutParams3.leftMargin = b18;
                marginLayoutParams3.rightMargin = b18;
                marginLayoutParams3.topMargin = b18;
                this.f177976z.addView(viewGroup3, marginLayoutParams3);
            }
            i17 = 29559;
        }
    }

    public final void i7() {
        r45.du4 du4Var = this.f177952f.f392020p0;
        if (du4Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "svr not return middle banner, hide middle banner");
            android.view.View view = this.H;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372748d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "middle banner title is nil, hide middle banner");
            android.view.View view2 = this.H;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.H;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.H.setImportantForAccessibility(1);
        this.I.setText(du4Var.f372748d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f) && com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i)) {
            this.I.setVisibility(0);
            this.f177950J.setVisibility(8);
        } else {
            this.f177950J.setVisibility(0);
            this.I.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.y1(this));
            this.H.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z1(this));
            this.I.setContentDescription(((java.lang.Object) this.I.getText()) + getString(com.tencent.mm.R.string.f490929ba5));
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.H.getLayoutParams();
        if (this.f177952f.Z != null) {
            if (layoutParams != null) {
                layoutParams.topMargin = i65.a.b(getContext(), 16);
                this.H.setLayoutParams(layoutParams);
            }
        } else if (layoutParams != null) {
            layoutParams.topMargin = i65.a.b(getContext(), 24);
            this.H.setLayoutParams(layoutParams);
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f177977z1.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i65.a.b(getContext(), 8);
            this.f177977z1.setLayoutParams(layoutParams2);
        }
    }

    public final void j7(org.json.JSONObject jSONObject, r45.bm5 bm5Var, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        boolean z17 = jSONObject.optInt(bm5Var.f370873e, 0) == 1;
        long optLong = jSONObject.optLong(java.lang.String.format("%s_expiretime", bm5Var.f370873e), 0L);
        boolean z18 = (optLong <= 0 || java.lang.System.currentTimeMillis() <= optLong) ? z17 : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "show red dot: %s, red dot id: %s, red dot expired: %s, red dot type: %s", java.lang.Boolean.valueOf(z18), bm5Var.f370873e, java.lang.Long.valueOf(optLong), java.lang.Integer.valueOf(bm5Var.f370872d));
        if (z17 && !z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, bm5Var.f370873e, 2, "");
        }
        X6(viewGroup);
        if (z18) {
            android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.k2n);
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.k2o);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.k2k);
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.k2l);
            android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.iux);
            int i17 = bm5Var.f370872d;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 != 4) {
                            z18 = false;
                        } else {
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                            }
                            if (textView3 != null) {
                                com.tencent.mm.plugin.wallet_core.utils.z1.j(textView3, bm5Var.f370874f);
                            }
                        }
                    } else {
                        if (textView2 == null) {
                            return;
                        }
                        textView2.setText(com.tencent.mm.plugin.wallet_core.utils.z1.e(getContext(), bm5Var.f370874f, null).toString());
                        textView2.setVisibility(0);
                    }
                } else if (textView == null) {
                    return;
                } else {
                    textView.setVisibility(0);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372749e)) {
                if (textView3 != null) {
                    textView3.setText(du4Var.f372749e);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            } else if (imageView == null) {
                return;
            } else {
                imageView.setVisibility(0);
            }
            if (z18) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, bm5Var.f370873e, 1, "");
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, bm5Var.f370873e, 0, "Red Dot Type returned by server is invalid.");
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 123 && i18 == -1) {
            this.Z = false;
            java.lang.String stringExtra = intent.getStringExtra("lqt_enc_pwd");
            android.app.Dialog dialog = this.Y;
            if (dialog == null) {
                this.Y = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, null);
            } else {
                dialog.show();
            }
            com.tencent.mm.plugin.wallet.balance.model.lqt.t0 t0Var = this.f177951e.f177756c;
            int i19 = this.f177952f.C;
            t0Var.getClass();
            ((km5.q) ((km5.q) km5.u.f(stringExtra, java.lang.Integer.valueOf(i19))).n(t0Var).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.x1(this))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v1(this));
        }
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479543aa0));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479543aa0));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        hideActionbarLine();
        setMMTitle("");
        this.H1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "inputAccountType: %s", java.lang.Integer.valueOf(getIntent().getIntExtra("key_account_type", 1)));
        if (getIntent().getIntExtra("key_auto_jump_transfer", 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "auto jump to balance transfer");
            android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.class);
            intent.putExtra("show_open_toast", getIntent().getIntExtra("show_open_toast", 0));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        this.f177953g = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.ivu);
        this.f177954h = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484065cw0);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f485744iw3)).getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iwv);
        this.f177955i = textView;
        com.tencent.mm.ui.bk.q0(textView.getPaint());
        this.f177957m = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.cvx);
        this.f177958n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iuo);
        this.f177959o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iup);
        this.f177960p = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484069cw3);
        this.f177963q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ive);
        this.f177964r = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.ivf);
        this.f177965s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ivt);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.ivs);
        this.f177966t = button;
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.iv8);
        this.f177967u = button2;
        com.tencent.mm.ui.bk.r0(button2.getPaint(), 0.8f);
        this.f177968v = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ivo);
        this.f177969w = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.ivp);
        this.f177970x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ivq);
        this.f177973y = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iuy);
        this.f177976z = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iwz);
        this.A = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iv6);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iv7);
        this.D = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iva);
        this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ivb);
        this.F = findViewById(com.tencent.mm.R.id.iuu);
        this.G = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iuv);
        this.H = findViewById(com.tencent.mm.R.id.ivl);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ivm);
        this.f177950J = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.ivk);
        this.L = findViewById(com.tencent.mm.R.id.f485742iw1);
        this.M = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.o9r);
        this.N = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o9s);
        this.P = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o9q);
        this.K = findViewById(com.tencent.mm.R.id.f485741iw0);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485739iv0);
        this.Q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485745iw4);
        this.R = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485746iw5);
        this.S = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ivc);
        this.T = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iw6);
        this.U = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iv9);
        this.V = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iv_);
        this.W = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) findViewById(com.tencent.mm.R.id.ius);
        this.X = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.pcr);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ivw);
        this.A1 = linearLayout;
        linearLayout.setImportantForAccessibility(1);
        this.B1 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.ivx);
        this.C1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ivz);
        this.D1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ivy);
        this.E1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.ivv);
        this.f177977z1 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ivj);
        this.I1 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485743iw2);
        this.J1 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ium);
        this.I1.setImportantForAccessibility(1);
        this.J1.setImportantForAccessibility(1);
        this.W.setLoadingPb(this.X);
        mo133getLifecycle().a(this.W);
        this.W.setPrefixSymbol(getString(com.tencent.mm.R.string.kyi));
        this.A.setVisibility(4);
        this.D.setVisibility(4);
        this.P1.alive();
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f177951e = null;
        this.P1.dead();
        com.tencent.kinda.gen.ITransmitKvData.create().putString("notifyType", "walletusecaserefresh");
        ((h45.q) i95.n0.c(h45.q.class)).notifyWalletPageRefresh();
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.Q1.dead();
        this.W.f180755g = null;
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.Q1.alive();
        if (this.Z) {
            try {
                java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_LQT_DETAIL_STRING_SYNC, "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    this.f177952f = (r45.zg5) new r45.zg5().parseFrom(str.getBytes(s46.a.f403001a));
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e17, "", new java.lang.Object[0]);
            }
            e7(true);
            Y6(0, false);
        } else {
            gm0.j1.i();
            if (((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAY_LQT_SECURITY_REDDOT_TIME_INT_SYNC, 0)).intValue() == -1 && this.D1.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "remove lqt security reddot");
                this.D1.setVisibility(8);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.E1.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.leftMargin = i65.a.b(getContext(), 4);
                    this.E1.setLayoutParams(layoutParams);
                }
            }
        }
        this.Z = true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.e.class);
    }
}
