package com.tencent.mm.plugin.wallet.balance.ui;

@db5.a(2)
/* loaded from: classes9.dex */
public class WalletBalanceFetchUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0, mp5.v {
    public static final /* synthetic */ int W = 0;
    public android.widget.TextView A;
    public boolean B;
    public boolean C;
    public android.view.View D;
    public int E;
    public int F;
    public int G;
    public double H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final java.text.DecimalFormat f177781J;
    public boolean K;
    public java.lang.String L;
    public rr4.b M;
    public int N;
    public hs4.d P;
    public final java.lang.Runnable Q;
    public int R;
    public final java.lang.Runnable S;
    public final java.lang.Runnable T;
    public final java.util.HashMap U;
    public final com.tencent.mm.sdk.event.IListener V;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f177782d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177783e;

    /* renamed from: f, reason: collision with root package name */
    public double f177784f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177785g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177786h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f177787i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f177788m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f177789n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f177790o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f177791p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f177792q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f177793r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f177794s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f177795t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f177796u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f177797v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f177798w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f177799x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f177800y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f177801z;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2);
    }

    public WalletBalanceFetchUI() {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
        this.f177785g = null;
        this.B = true;
        this.C = true;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.0d;
        this.I = 0;
        this.f177781J = new java.text.DecimalFormat("0.00");
        this.K = false;
        this.N = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1);
        this.Q = new com.tencent.mm.plugin.wallet.balance.ui.o(this);
        this.R = 0;
        this.S = new com.tencent.mm.plugin.wallet.balance.ui.l0(this);
        this.T = new com.tencent.mm.plugin.wallet.balance.ui.f(this);
        this.U = new java.util.HashMap();
        this.V = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.34
            {
                this.__eventId = 572563856;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
                com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent callback");
                if (kindaBindCardEvent2 == null) {
                    return false;
                }
                com.tencent.mm.wallet_core.model.i1.a();
                com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.this;
                am.di diVar = kindaBindCardEvent2.f54454g;
                if (diVar != null) {
                    if (diVar.f6453a) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent bindCard Succ");
                        int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
                        walletBalanceFetchUI.b7();
                        walletBalanceFetchUI.K = true;
                        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) walletBalanceFetchUI.getInput().get("key_pay_info");
                        if (payInfo == null) {
                            payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                            payInfo.f192114m = walletBalanceFetchUI.f177785g;
                            payInfo.f192109e = 21;
                        }
                        walletBalanceFetchUI.doSceneForceProgress(new ss4.b0(payInfo.f192114m, 4));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent bindCard Cancel");
                    }
                }
                walletBalanceFetchUI.V.dead();
                return true;
            }
        };
    }

    public static void U6(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
        double d17 = (bankcard == null || (i17 = walletBalanceFetchUI.E) == 0 || (i17 == 1 && bankcard.field_fetch_charge_rate <= 0.0d) || ((i17 == 1 && bankcard.field_fetch_charge_rate > 0.0d && walletBalanceFetchUI.F == 0) || walletBalanceFetchUI.H >= vr4.f1.wi().Ai().f13999h.Q2)) ? vr4.f1.wi().Ai().f13999h.Q2 : walletBalanceFetchUI.f177783e != null ? vr4.f1.wi().Ai().f13999h.Q2 - walletBalanceFetchUI.f177783e.field_full_fetch_charge_fee : vr4.f1.wi().Ai().f13999h.Q2;
        if (walletBalanceFetchUI.G != 1) {
            walletBalanceFetchUI.f177787i.setText(walletBalanceFetchUI.f177781J.format(d17));
            walletBalanceFetchUI.g7();
            walletBalanceFetchUI.I = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "is_full_fetch_direct is 0!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "do fetch direct to pay!");
        walletBalanceFetchUI.I = 1;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = walletBalanceFetchUI.f177783e;
        if (bankcard2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard2.field_forbidWord)) {
            db5.t7.makeText(walletBalanceFetchUI.getContext(), walletBalanceFetchUI.f177783e.field_forbidWord, 0).show();
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = walletBalanceFetchUI.f177783e;
        if (bankcard3 != null) {
            java.lang.String str3 = bankcard3.field_bankcardType;
            str2 = bankcard3.field_bindSerial;
            str = str3;
        } else {
            str = "";
            str2 = str;
        }
        com.tencent.mm.wallet_core.b.a().getClass();
        com.tencent.mm.wallet_core.b.a().getClass();
        walletBalanceFetchUI.e7(21, walletBalanceFetchUI.f177784f, "1", str, str2, walletBalanceFetchUI.I);
    }

    public static void W6(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        walletBalanceFetchUI.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = walletBalanceFetchUI.L;
        objArr[1] = 15;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
        objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
        objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
        g0Var.d(16398, objArr);
        walletBalanceFetchUI.mWcKeyboard.v();
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletBalanceFetchUI.f177783e.f179580s3)) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(walletBalanceFetchUI.getContext(), 2, 3);
        z2Var.y(walletBalanceFetchUI.getString(com.tencent.mm.R.string.ke6));
        z2Var.F = new com.tencent.mm.plugin.wallet.balance.ui.d0(walletBalanceFetchUI, z2Var);
        android.view.View inflate = android.view.View.inflate(walletBalanceFetchUI.getContext(), com.tencent.mm.R.layout.bte, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gwd);
        textView.setText(walletBalanceFetchUI.f177783e.f179580s3);
        textView.setTextSize(1, i65.a.q(walletBalanceFetchUI) * 17.0f);
        inflate.setPadding(0, i65.a.b(walletBalanceFetchUI, 40), 0, i65.a.b(walletBalanceFetchUI, 16));
        z2Var.t(inflate);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(walletBalanceFetchUI);
        linearLayout.setOrientation(1);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) android.view.View.inflate(walletBalanceFetchUI, com.tencent.mm.R.layout.btc, null);
        ((android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.gw9)).setVisibility(8);
        ((android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.gw8)).setText(walletBalanceFetchUI.f177783e.f179581t3);
        linearLayout.addView(linearLayout2);
        java.util.ArrayList arrayList = walletBalanceFetchUI.f177783e.f179582u3;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i17 = 0; i17 < walletBalanceFetchUI.f177783e.f179582u3.size(); i17++) {
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) android.view.View.inflate(walletBalanceFetchUI, com.tencent.mm.R.layout.btc, null);
                ((android.widget.TextView) linearLayout3.findViewById(com.tencent.mm.R.id.gw8)).setText((java.lang.CharSequence) walletBalanceFetchUI.f177783e.f179582u3.get(i17));
                linearLayout.addView(linearLayout3);
            }
        }
        z2Var.j(linearLayout);
        z2Var.C();
    }

    public static void X6(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        java.lang.String str;
        java.lang.String str2;
        int i17 = walletBalanceFetchUI.f177783e.f179585x3;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = walletBalanceFetchUI.L;
        objArr[1] = 13;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
        objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
        objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
        g0Var.d(16398, objArr);
        walletBalanceFetchUI.mWcKeyboard.v();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = walletBalanceFetchUI.f177783e;
        int i18 = bankcard2.f179585x3;
        if (i18 == 1) {
            java.util.ArrayList arrayList = bankcard2.f179587z3;
            if (arrayList == null || arrayList.size() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "fetch_limit_recommend_bind_serial is null or 0");
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard e17 = vr4.f1.wi().Ai().e((java.lang.String) arrayList.get(0));
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletBalanceFetchUI", "find bankcard of %s is null", arrayList.get(0));
                return;
            }
            walletBalanceFetchUI.f177783e = e17;
            walletBalanceFetchUI.h7();
            walletBalanceFetchUI.i7();
            db5.t7.i(walletBalanceFetchUI, i65.a.r(walletBalanceFetchUI.getContext(), com.tencent.mm.R.string.kfq), com.tencent.mm.R.raw.icons_filled_done);
            return;
        }
        if (i18 == 2) {
            java.util.ArrayList j17 = vr4.f1.wi().Ai().j();
            at4.f fVar = vr4.f1.wi().Ai().f14002k;
            if (fVar != null) {
                java.lang.String str3 = fVar.f13841i;
                str = fVar.f13840h;
                str2 = str3;
            } else {
                str = "";
                str2 = str;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (j17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "debit is null");
            } else {
                java.util.Iterator it = j17.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                    java.util.Iterator it6 = walletBalanceFetchUI.f177783e.f179587z3.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str4 = (java.lang.String) it6.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && str4.equals(bankcard3.field_bindSerial)) {
                            arrayList2.add(bankcard3);
                        }
                    }
                }
            }
            walletBalanceFetchUI.c7(walletBalanceFetchUI.getContext(), arrayList2, walletBalanceFetchUI.f177783e, str, str2, new com.tencent.mm.plugin.wallet.balance.ui.e0(walletBalanceFetchUI, arrayList2), false);
        }
    }

    public final double Y6(double d17) {
        return java.lang.Math.max(com.tencent.mm.wallet_core.ui.r1.h0("" + (d17 - vr4.f1.wi().Ai().f14002k.f13838f), this.f177783e.field_fetch_charge_rate + "", 2, java.math.RoundingMode.HALF_UP).doubleValue(), this.H);
    }

    public final void Z6(ss4.e0 e0Var) {
        fetchData();
        i7();
        if (this.E != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.E);
            return;
        }
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_FETCH_CHARGE_TIP_DIALOG_BOOLEAN_SYNC;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue();
        at4.f fVar = vr4.f1.wi().Ai().f14002k;
        if (fVar == null || booleanValue) {
            return;
        }
        db5.e1.B(this, getString(com.tencent.mm.R.string.kvl, com.tencent.mm.wallet_core.ui.r1.m(fVar.f13838f)), getString(com.tencent.mm.R.string.kvm), getString(com.tencent.mm.R.string.kmf), getString(com.tencent.mm.R.string.kvn), new com.tencent.mm.plugin.wallet.balance.ui.r(this), new com.tencent.mm.plugin.wallet.balance.ui.s(this), com.tencent.mm.R.color.aaq);
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
    }

    public final void a7(android.content.Intent intent) {
        boolean z17 = false;
        if (intent != null && intent.getBooleanExtra("intent_bind_end", false)) {
            z17 = true;
        }
        this.K = z17;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().get("key_pay_info");
            if (payInfo == null) {
                payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = this.f177785g;
                payInfo.f192109e = 21;
            }
            doSceneForceProgress(new ss4.b0(payInfo.f192114m, 4));
        }
    }

    public final void b7() {
    }

    public void c7(android.content.Context context, java.util.List list, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, java.lang.String str, java.lang.String str2, db5.t4 t4Var, boolean z17) {
        int i17;
        hs4.d dVar = this.P;
        if (dVar != null && dVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
            return;
        }
        this.U.clear();
        hs4.d dVar2 = new hs4.d(context);
        this.P = dVar2;
        dVar2.f284618c = new com.tencent.mm.plugin.wallet.balance.ui.w(this, list, context);
        db5.g4 g4Var = new db5.g4(this);
        if (z17) {
            g4Var.r(0, getString(com.tencent.mm.R.string.keu), null, getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_pay_cards), getResources().getColor(com.tencent.mm.R.color.FG_2), false);
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
        if (fj6) {
            g4Var.t(1, "", true);
        }
        hs4.d dVar3 = this.P;
        com.tencent.mm.plugin.wallet.balance.ui.x xVar = new com.tencent.mm.plugin.wallet.balance.ui.x(this);
        dVar3.f284622g = g4Var;
        dVar3.f284620e = xVar;
        if (fj6) {
            dVar3.f284619d = new com.tencent.mm.plugin.wallet.balance.ui.y(this, t4Var);
        } else {
            dVar3.f284616a.F = new com.tencent.mm.plugin.wallet.balance.ui.z(this, list);
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.btw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixu);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setText(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixt)).setText(str2);
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cx_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(com.tencent.mm.R.id.iwt).setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.a0(this));
        inflate.findViewById(com.tencent.mm.R.id.iwt).setContentDescription(getString(com.tencent.mm.R.string.kdv));
        hs4.d dVar4 = this.P;
        dVar4.f284616a.t(inflate);
        dVar4.f284625j = inflate;
        if (list != null) {
            i17 = list.size();
            if (bankcard != null) {
                for (int i18 = 0; i18 < list.size(); i18++) {
                    if (((com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i18)).field_bindSerial.equals(bankcard.field_bindSerial)) {
                        i17 = i18;
                    }
                }
            }
        } else {
            i17 = 0;
        }
        hs4.d dVar5 = this.P;
        dVar5.f284627l = true;
        dVar5.f284628m = i17;
        if (fj6) {
            dVar5.f284626k = false;
        } else {
            dVar5.f284626k = true;
        }
        dVar5.f284616a.y(getResources().getString(com.tencent.mm.R.string.kl_));
        this.P.d();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.iuk);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription(str + str2);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.wallet.balance.ui.b0(this, linearLayout), 500L);
    }

    public final void d7() {
        at4.n a17 = at4.n.a();
        if (a17.b()) {
            db5.e1.s(this, a17.f13902b, getString(com.tencent.mm.R.string.f490573yv));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().get("key_pay_info");
        if (payInfo == null) {
            payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
            payInfo.f192114m = this.f177785g;
            payInfo.f192109e = 21;
        }
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putInt("key_scene", 21);
        boolean z17 = false;
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 0);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putInt("from_bind_ui", 2);
        bundle.putBoolean("key_bind_show_change_card", true);
        if (com.tencent.mm.wallet_core.b.a().b()) {
            this.V.alive();
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(this, bundle);
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.wallet_core.a.j(this, qr4.a.class, bundle, null);
    }

    public final void e7(int i17, double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("payScene", i17);
        bundle.putString("totalFee", com.tencent.mm.wallet_core.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString());
        bundle.putString("feeType", str);
        bundle.putString("bankType", str2);
        bundle.putString("bindSerial", str3);
        bundle.putString("operation", java.lang.String.valueOf(i18));
        bundle.putString("reportSessionId", this.L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "startWalletBalanceFetchUseCase totalFee：%s reportSessionId %s", com.tencent.mm.wallet_core.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString(), this.L);
        ((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceFetchUseCase(this, bundle);
    }

    public final void f7() {
        if (com.tencent.mm.sdk.platformtools.t8.F(this.f177787i.getText(), 0.0d) <= 0.0d || !this.f177787i.n()) {
            this.mWcKeyboard.e(false);
        } else {
            this.mWcKeyboard.e(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fetchData() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.fetchData():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.g7():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d58;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.view.View view = this.D;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.bottomMargin = (int) f17;
            this.D.setLayoutParams(layoutParams);
        }
    }

    public final void h7() {
        if (this.f177783e != null) {
            double j17 = com.tencent.mm.wallet_core.ui.r1.j(this.f177783e.f179573l3 + "", "100", 2, java.math.RoundingMode.HALF_UP);
            this.H = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "min charge fee: %s", java.lang.Double.valueOf(j17));
        }
    }

    public final void i7() {
        at4.c cVar;
        at4.e[] eVarArr;
        if (this.f177787i.getTitleTv() != null) {
            this.f177787i.getTitleTv().setText(java.lang.String.format(getString(com.tencent.mm.R.string.i09), com.tencent.mm.wallet_core.model.c2.b()));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f177788m.findViewById(com.tencent.mm.R.id.ael);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f177783e;
        if (bankcard != null) {
            at4.k c17 = dt4.b.c(this, bankcard.field_bankcardType, bankcard.F0());
            java.lang.String str = c17 != null ? c17.f13878a : "";
            imageView.setImageBitmap(null);
            if (this.f177783e.v0()) {
                imageView.setBackgroundResource(com.tencent.mm.R.drawable.ch9);
            } else {
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                gt4.c1 c1Var = new gt4.c1(str);
                ((x60.e) fVar).getClass();
                android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet.balance.ui.h(this, imageView));
                if (d17 != null) {
                    imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.S(d17, getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false));
                }
            }
            android.widget.TextView textView = (android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.acd);
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f177783e;
            textView.setText(getString(com.tencent.mm.R.string.kfi, bankcard2.field_bankName, bankcard2.field_bankcardTail));
            ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.acd)).setVisibility(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f177783e.field_fetchArriveTimeWording)) {
                ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.h0a)).setText(this.f177783e.field_fetchArriveTimeWording);
                ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.h0a)).setVisibility(0);
                if (this.f177783e.field_is_hightlight_pre_arrive_time_wording == 1) {
                    ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.h0a)).setTextColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
                } else {
                    ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.h0a)).setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
                }
            }
        } else {
            imageView.setImageBitmap(null);
            ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.acd)).setText(this.f177786h);
            ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.h0a)).setText("");
            ((android.widget.TextView) this.f177788m.findViewById(com.tencent.mm.R.id.h0a)).setVisibility(8);
            ((android.widget.ImageView) this.f177788m.findViewById(com.tencent.mm.R.id.ael)).setImageBitmap(null);
        }
        java.lang.String str2 = vr4.f1.wi().Ai().f13999h.U2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f177794s.setVisibility(0);
        this.f177795t.setVisibility(8);
        g7();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = vr4.f1.wi().Ai().f13999h;
        if (this.f177783e == null || com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_prompt_info_prompt_text)) {
            this.f177793r.setText("");
            this.f177793r.setVisibility(8);
            int color = getContext().getResources().getColor(com.tencent.mm.R.color.FG_1);
            this.N = color;
            this.f177791p.setTextColor(color);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(bankcard3.field_prompt_info_prompt_text);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard3.field_prompt_info_jump_text)) {
                spannableStringBuilder.append((java.lang.CharSequence) bankcard3.field_prompt_info_jump_text);
            }
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.wallet.balance.ui.m(this, bankcard3)), bankcard3.field_prompt_info_prompt_text.length(), spannableStringBuilder.length(), 18);
            this.f177793r.setText(spannableStringBuilder);
            this.f177793r.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
            this.f177793r.setVisibility(0);
            int color2 = getContext().getResources().getColor(com.tencent.mm.R.color.FG_0);
            this.N = color2;
            this.f177791p.setTextColor(color2);
        }
        at4.f fVar2 = vr4.f1.wi().Ai().f14002k;
        removeAllOptionMenu();
        if (fVar2 != null && (cVar = fVar2.f13842j) != null && (eVarArr = cVar.f13815a) != null && eVarArr.length > 0) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.wallet.balance.ui.k(this, fVar2));
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = this.f177783e;
        if (bankcard4 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBalanceFetchUI", "updateFetchLimitView mDefaultBankcard is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard4.f179579r3)) {
            this.f177797v.setVisibility(8);
        } else {
            this.f177797v.setVisibility(0);
            this.f177798w.setText(this.f177783e.f179579r3);
            if (this.B) {
                this.B = false;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = this.L;
                objArr[1] = 14;
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard5 = this.f177783e;
                objArr[2] = bankcard5 != null ? bankcard5.field_bankcardType : "";
                objArr[3] = bankcard5 != null ? bankcard5.field_bindSerial : "";
                g0Var.d(16398, objArr);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177783e.f179583v3)) {
            this.f177799x.setVisibility(8);
            return;
        }
        this.f177799x.setVisibility(0);
        this.f177801z.setText(this.f177783e.f179583v3);
        this.A.setText(this.f177783e.f179586y3);
        this.f177800y.setUrl(this.f177783e.f179584w3);
        if (this.C) {
            this.C = false;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = this.L;
            objArr2[1] = 12;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard6 = this.f177783e;
            objArr2[2] = bankcard6 != null ? bankcard6.field_bankcardType : "";
            objArr2[3] = bankcard6 != null ? bankcard6.field_bindSerial : "";
            g0Var2.d(16398, objArr2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ket);
        this.D = findViewById(com.tencent.mm.R.id.e17);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.acc);
        this.f177788m = linearLayout;
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.acd)).getPaint(), 0.8f);
        com.tencent.mm.plugin.wallet.balance.ui.c0 c0Var = new com.tencent.mm.plugin.wallet.balance.ui.c0(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.acc);
        this.f177789n = findViewById;
        findViewById.setOnClickListener(c0Var);
        this.f177788m.setOnClickListener(c0Var);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ach);
        this.f177787i = walletFormView;
        qp5.p.g(walletFormView);
        this.f177787i.setOnInputValidChangeListener(this);
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard(this);
        this.mWcKeyboard = wcPayKeyboard;
        wcPayKeyboard.d(this, -1);
        setWPKeyboard(this.f177787i.getContentEt(), true, false);
        this.mWcKeyboard.setActionText(getString(com.tencent.mm.R.string.f493490kf5));
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((or4.c) pf5.z.f353948a.a(activity).a(or4.c.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.f493490kf5));
        this.f177787i.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.wallet.balance.ui.f0(this));
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f177796u = wcPayBannerView;
        wcPayBannerView.a();
        this.f177797v = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485735iu2);
        this.f177798w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485736iu3);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f485734iu1)).setEnableHighlight(true);
        this.f177797v.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.g0(this));
        this.f177799x = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.itz);
        this.f177800y = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.f485733iu0);
        this.f177801z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ity);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.itx);
        this.A = textView;
        com.tencent.mm.wallet_core.ui.r1.d(textView);
        this.A.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.h0(this));
        this.f177790o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p_z);
        this.f177791p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484367e15);
        this.f177792q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484364e12);
        this.f177793r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484365e13);
        this.f177794s = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484366e14);
        this.f177795t = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484368e16);
        com.tencent.mm.ui.bk.r0(this.f177792q.getPaint(), 0.8f);
        this.f177792q.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.i0(this));
        this.f177787i.b(new com.tencent.mm.plugin.wallet.balance.ui.j0(this));
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "3";
        walletGetBulletinEvent.f192364d = new com.tencent.mm.plugin.wallet.balance.ui.k0(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        this.mWcKeyboard.o();
        return this.mWcKeyboard.o();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1 || intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
            return;
        }
        int intExtra = intent.getIntExtra("key_select_index", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is " + intExtra);
        java.util.ArrayList arrayList = this.f177782d;
        if (arrayList == null || intExtra < 0 || intExtra >= arrayList.size()) {
            java.util.ArrayList arrayList2 = this.f177782d;
            if (arrayList2 == null || intExtra < 0 || intExtra > arrayList2.size()) {
                this.f177783e = null;
            }
            d7();
        } else {
            this.f177783e = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f177782d.get(intExtra);
        }
        i7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.L = java.util.UUID.randomUUID().toString();
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        hideActionbarLine();
        a7(getIntent());
        fetchData();
        this.f177786h = getString(com.tencent.mm.R.string.kfj);
        initView();
        i7();
        com.tencent.mm.wallet_core.model.n1.d(4, 0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.sdk.platformtools.u3.l(this.Q);
        com.tencent.mm.sdk.platformtools.u3.l(this.S);
        com.tencent.mm.sdk.platformtools.u3.l(this.T);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.S, 300L);
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        this.f177787i.c(null);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        b7();
        a7(intent);
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.mWcKeyboard.p()) {
            return;
        }
        this.R = 3;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        b7();
        super.onResume();
        if (this.R == 3 && isHandleAutoShowNormalStWcKb()) {
            com.tencent.mm.sdk.platformtools.u3.i(this.T, 300L);
        }
        this.R = 2;
        f7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ss4.e0)) {
            return false;
        }
        ss4.e0 e0Var = (ss4.e0) m1Var;
        Z6(e0Var);
        if (!e0Var.isJumpRemind()) {
            return false;
        }
        com.tencent.mm.wallet_core.model.p0 jumpRemind = e0Var.getJumpRemind();
        jumpRemind.i(this, new com.tencent.mm.plugin.wallet.balance.ui.n(this, jumpRemind, e0Var));
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.c.class);
    }
}
