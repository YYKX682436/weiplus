package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class WalletBalanceManagerUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements at4.i0, l75.z0 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f177803d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f177804e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177805f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f177806g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177807h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f177808i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f177809m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView f177810n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ProgressBar f177811o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f177812p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177813q;

    /* renamed from: r, reason: collision with root package name */
    public at4.s f177814r;

    /* renamed from: s, reason: collision with root package name */
    public rr4.a f177815s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f177816t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f177817u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f177818v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f177819w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f177820x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f177821y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f177822z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.14
        {
            this.__eventId = 572563856;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
            com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent2 == null) {
                return false;
            }
            com.tencent.mm.wallet_core.model.i1.a();
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.this;
            am.di diVar = kindaBindCardEvent2.f54454g;
            if (diVar != null) {
                if (diVar.f6453a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent bindCard Succ");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from WalletBalanceManagerUI");
                    com.tencent.mm.wallet_core.a.j(walletBalanceManagerUI, qr4.h.class, null, null);
                    com.tencent.mm.wallet_core.ui.r1.q0(15, 1);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            walletBalanceManagerUI.f177822z.dead();
            return true;
        }
    };

    public void U6() {
        doSceneProgress(new ss4.e0(null, 10), vr4.f1.wi().Ai().f13999h == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V6() {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.V6():void");
    }

    public void W6() {
        startActivity(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.class);
    }

    public final void X6(at4.a1 a1Var) {
        if (a1Var == null) {
            this.f177816t.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(a1Var.f13804f)) {
            this.f177817u.setVisibility(8);
        } else {
            this.f177817u.setUrl(a1Var.f13804f);
            this.f177817u.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(a1Var.f13805g)) {
            this.f177819w.setVisibility(8);
        } else {
            this.f177819w.setUrl(a1Var.f13805g);
            this.f177819w.setVisibility(0);
        }
        this.f177818v.setText(a1Var.f13799a);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a1Var.f13800b)) {
            if (com.tencent.mm.ui.bk.C()) {
                this.f177818v.setTextColor(com.tencent.mm.ui.bk.d(com.tencent.mm.sdk.platformtools.t8.M(a1Var.f13800b, -16777216)));
            } else {
                this.f177818v.setTextColor(com.tencent.mm.sdk.platformtools.t8.M(a1Var.f13800b, -16777216));
            }
        }
        this.f177818v.setTextSize(1, a1Var.f13801c);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a1Var.f13802d)) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            if (com.tencent.mm.ui.bk.C()) {
                gradientDrawable.setColor(com.tencent.mm.ui.bk.d(com.tencent.mm.sdk.platformtools.t8.M(a1Var.f13802d, -1)));
            } else {
                gradientDrawable.setColor(com.tencent.mm.sdk.platformtools.t8.M(a1Var.f13802d, -1));
            }
            gradientDrawable.setCornerRadius(i65.a.b(getContext(), 4));
            this.f177816t.setBackground(gradientDrawable);
        }
        this.f177816t.setVisibility(0);
        this.f177816t.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.u0(this, a1Var));
        this.f177808i.setVisibility(8);
    }

    public final void Y6(boolean z17) {
        long longValue = ((java.lang.Long) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
        this.f177810n.e(com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.i("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue()), !z17);
    }

    public void Z6(boolean z17) {
        Y6(z17);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = vr4.f1.wi().Ai().f13999h;
        this.f177813q = bankcard;
        if (bankcard != null) {
            at4.u1 p17 = vr4.f1.wi().Ai().p();
            boolean z18 = (p17.f13981a & 4) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isBalanceFetchOn, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(p17.f13981a));
            if (z18) {
                this.f177803d.setVisibility(0);
                if (((java.lang.Long) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue() <= 0) {
                    this.f177803d.setEnabled(false);
                }
            } else {
                this.f177803d.setVisibility(8);
            }
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ixd);
        gm0.j1.i();
        if (((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_LINK_RED_DOT_INT, -1)).intValue() == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
        gm0.j1.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
        boolean z19 = (32768 & intValue) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(intValue));
        if (z19) {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, getString(com.tencent.mm.R.string.hs6));
            android.view.View view = this.f177806g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f177807h.setTextColor(getResources().getColor(com.tencent.mm.R.color.a_p));
            this.f177807h.setText(str);
            this.f177806g.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.z0(this));
            return;
        }
        at4.v1 v1Var = vr4.f1.wi().Ai().f13997f;
        boolean z27 = (v1Var != null ? v1Var.field_lqt_cell_is_show : 0) == 1;
        at4.v1 v1Var2 = vr4.f1.wi().Ai().f13997f;
        java.lang.String str2 = v1Var2 != null ? v1Var2.field_lqt_cell_lqt_title : null;
        at4.v1 v1Var3 = vr4.f1.wi().Ai().f13997f;
        java.lang.String str3 = v1Var3 != null ? v1Var3.field_lqt_cell_lqt_wording : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "isShowLqtCell:%s lqtCellTitle:%s lqtCellWording:%s", java.lang.Boolean.valueOf(z27), str2, str3);
        if (z27 && (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || !com.tencent.mm.sdk.platformtools.t8.K0(str3))) {
            android.view.View view2 = this.f177806g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (vr4.f1.wi().Ai().u() && !com.tencent.mm.sdk.platformtools.t8.K0(vr4.f1.wi().Ai().m())) {
            android.view.View view3 = this.f177806g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f177806g.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.a1(this));
            this.f177807h.setText(vr4.f1.wi().Ai().m());
            return;
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        if (Ai != null) {
            at4.u1 p18 = Ai.p();
            boolean z28 = (p18.f13981a & 1024) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isSupportLCT, ret = %s switchBit %s", java.lang.Boolean.valueOf(z28), java.lang.Integer.valueOf(p18.f13981a));
            if (z28 && !android.text.TextUtils.isEmpty(Ai.m())) {
                at4.v1 v1Var4 = Ai.f13997f;
                if (!android.text.TextUtils.isEmpty(v1Var4 != null ? v1Var4.field_lct_url : null)) {
                    android.view.View view4 = this.f177806g;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f177807h.setText(Ai.m());
                    this.f177806g.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.b1(this, Ai));
                    return;
                }
            }
        }
        android.view.View view5 = this.f177806g;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // at4.i0
    public void c6(int i17, java.util.Map map, java.lang.Object[] objArr) {
        if (i17 != 12 && i17 == 43 && objArr != null && objArr.length > 0) {
            X6((at4.a1) objArr[0]);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                Y6(false);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d59;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        this.f177810n = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) findViewById(com.tencent.mm.R.id.f487641pa4);
        this.f177811o = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.pcr);
        this.f177805f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p_z);
        this.f177810n.setLoadingPb(this.f177811o);
        this.f177810n.setPrefixSymbol(getString(com.tencent.mm.R.string.kyi));
        mo133getLifecycle().a(this.f177810n);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f177804e = button;
        button.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.w0(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487638pa1);
        this.f177803d = button2;
        button2.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.x0(this));
        this.f177820x = findViewById(com.tencent.mm.R.id.f487639pa2);
        this.f177821y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p_y);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487640pa3);
        if (!com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") ? true : com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            textView.setVisibility(8);
        } else {
            textView.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.y0(this));
            textView.setVisibility(0);
            com.tencent.mm.wallet_core.ui.r1.d(textView);
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f487679pf2)).setText(c01.z1.I() ? com.tencent.mm.R.string.kwm : com.tencent.mm.R.string.kwn);
        this.f177808i = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.ac_);
        this.f177809m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aca);
        this.f177806g = findViewById(com.tencent.mm.R.id.i0y);
        this.f177807h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i0z);
        this.f177816t = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.acl);
        this.f177818v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.acj);
        this.f177817u = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.ack);
        this.f177819w = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.aci);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f177812p = wcPayBannerView;
        wcPayBannerView.a();
        final com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "2";
        walletGetBulletinEvent.f192364d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.A;
                com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.this;
                walletBalanceManagerUI.getClass();
                com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent2 = walletGetBulletinEvent;
                am.j10 j10Var = walletGetBulletinEvent2.f54956h;
                if (j10Var.f6997d == 2) {
                    walletBalanceManagerUI.f177812p.setBannerData(j10Var.f6998e);
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(j10Var.f6994a)) {
                        return;
                    }
                    android.widget.TextView textView2 = walletBalanceManagerUI.f177805f;
                    am.j10 j10Var2 = walletGetBulletinEvent2.f54956h;
                    com.tencent.mm.wallet_core.ui.r1.s0(null, textView2, j10Var2.f6994a, j10Var2.f6995b, j10Var2.f6996c);
                }
            }
        };
        walletGetBulletinEvent.e();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet_core.model.ECardInfo a17;
        fixStatusbar(true);
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        r45.lj5 lj5Var = null;
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        setBackBtn(new com.tencent.mm.plugin.wallet.balance.ui.t0(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        getIntent().getIntExtra("key_scene_balance_manager", 0);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                r45.lj5 lj5Var2 = new r45.lj5();
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                lj5Var2.f379523d = jSONObject.optInt("guide_flag");
                lj5Var2.f379524e = jSONObject.optString("guide_wording");
                lj5Var2.f379525f = jSONObject.optString("left_button_wording");
                lj5Var2.f379526g = jSONObject.optString("right_button_wording");
                lj5Var2.f379527h = jSONObject.optString("upload_credit_url");
                lj5Var = lj5Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ECardInfo", e17, "", new java.lang.Object[0]);
            }
        }
        if (lj5Var != null) {
            int i17 = lj5Var.f379523d;
            if (i17 == 1) {
                zs4.q.g(this, lj5Var.f379524e, 0, lj5Var.f379525f, lj5Var.f379526g, new android.os.Bundle(), isTransparent(), null, null, 0, 2);
            } else if (i17 == 3 && (a17 = com.tencent.mm.plugin.wallet_core.model.ECardInfo.a()) != null) {
                com.tencent.mm.plugin.wallet_core.ui.x4.a(this, a17, 1);
            }
        }
        addSceneEndListener(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().a(this);
        initView();
        com.tencent.mm.wallet_core.model.n1.d(2, 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11850, 6, 0);
        com.tencent.mm.wallet_core.ui.r1.q0(10, 1);
        X6(at4.a1.a());
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().b(this);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
        rr4.a aVar = this.f177815s;
        if (aVar != null) {
            aVar.j();
        }
        this.f177815s = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from bind ui flag:" + intent.getIntExtra("from_bind_ui", 0));
        if (intent.getIntExtra("from_bind_ui", 0) == 1) {
            com.tencent.mm.wallet_core.a.j(this, qr4.h.class, null, null);
            com.tencent.mm.wallet_core.ui.r1.q0(15, 1);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f177810n.f180755g = null;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        n05.a aVar = new n05.a(true, true, 300L, this.f177803d, 0, n05.d.f333932g.toString(), this, false, 0, 0);
        n05.a aVar2 = new n05.a(true, true, 300L, this.f177804e, 0, n05.d.f333931f.toString(), this, false, 0, 0);
        com.tencent.mm.wallet_core.ui.c0 c0Var = (com.tencent.mm.wallet_core.ui.c0) component(com.tencent.mm.wallet_core.ui.c0.class);
        m05.n nVar = m05.n.f322579f;
        c0Var.P6(nVar, aVar);
        ((com.tencent.mm.wallet_core.ui.c0) component(com.tencent.mm.wallet_core.ui.c0.class)).P6(nVar, aVar2);
        Z6(true);
        U6();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceManagerUI", "do query balance menu");
        rr4.a aVar3 = this.f177815s;
        if (aVar3 != null) {
            aVar3.j();
        }
        rr4.a aVar4 = new rr4.a();
        this.f177815s = aVar4;
        aVar4.l().h(new com.tencent.mm.plugin.wallet.balance.ui.v0(this));
        super.onResume();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && !(m1Var instanceof tr4.b) && (m1Var instanceof ss4.e0)) {
            at4.s sVar = ((ss4.e0) m1Var).f412050u;
            this.f177814r = sVar;
            if (sVar == null || this.f177816t.isShown()) {
                this.f177808i.setVisibility(8);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177814r.f13941a)) {
                this.f177808i.setVisibility(8);
            } else {
                this.f177809m.setText(this.f177814r.f13941a);
                this.f177808i.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.p0(this));
                this.f177808i.setVisibility(0);
            }
            Z6(false);
            V6();
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.c.class);
    }
}
