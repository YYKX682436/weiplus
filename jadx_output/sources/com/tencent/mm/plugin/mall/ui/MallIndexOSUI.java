package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class MallIndexOSUI extends com.tencent.mm.plugin.mall.ui.MallIndexBaseUI {
    public final com.tencent.mm.sdk.event.IListener G;
    public final com.tencent.mm.sdk.event.IListener H;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.mall.ui.l0[] f148270v = new com.tencent.mm.plugin.mall.ui.l0[4];

    /* renamed from: w, reason: collision with root package name */
    public at4.s1 f148271w = new at4.s1();

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f148272x = null;

    /* renamed from: y, reason: collision with root package name */
    public long f148273y = 0;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f148274z = null;
    public boolean A = false;
    public boolean B = false;
    public long C = 0;
    public boolean D = false;
    public java.lang.String E = "";
    public boolean F = true;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewUIDestroyEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1681666147;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebViewUIDestroyEvent webViewUIDestroyEvent) {
            com.tencent.mm.autogen.events.WebViewUIDestroyEvent webViewUIDestroyEvent2 = webViewUIDestroyEvent;
            java.lang.String str = webViewUIDestroyEvent2.f54988g.f7597a;
            com.tencent.mm.plugin.mall.ui.MallIndexOSUI mallIndexOSUI = com.tencent.mm.plugin.mall.ui.MallIndexOSUI.this;
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "WebViewUIDestroyEvent %s isCloseWindow %s", str, java.lang.Boolean.valueOf(mallIndexOSUI.D));
            java.lang.String str2 = mallIndexOSUI.E;
            if (str2 == null || !str2.equals(webViewUIDestroyEvent2.f54988g.f7597a)) {
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mall.ui.h0(this), 500L);
            return false;
        }
    }

    public MallIndexOSUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewCloseWindowEvent>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexOSUI.1
            {
                this.__eventId = -704562821;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewCloseWindowEvent webViewCloseWindowEvent) {
                com.tencent.mm.autogen.events.WebViewCloseWindowEvent webViewCloseWindowEvent2 = webViewCloseWindowEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "WebViewCloseWindowEventListener %s", webViewCloseWindowEvent2.f54983g.f7125a);
                com.tencent.mm.plugin.mall.ui.MallIndexOSUI mallIndexOSUI = com.tencent.mm.plugin.mall.ui.MallIndexOSUI.this;
                java.lang.String str = mallIndexOSUI.E;
                if (str == null || !str.equals(webViewCloseWindowEvent2.f54983g.f7125a)) {
                    return false;
                }
                mallIndexOSUI.D = true;
                return false;
            }
        };
        this.H = new com.tencent.mm.plugin.mall.ui.MallIndexOSUI.AnonymousClass2(a0Var);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void U6() {
        removeAllOptionMenu();
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.mall.ui.k0(this));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void V6() {
        int color = getResources().getColor(com.tencent.mm.R.color.f479375xr);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(com.tencent.mm.R.id.m7o).setBackgroundColor(color);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void Y6(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction, int i17) {
        super.Y6(mallFunction, i17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str = mallFunction.f179825m;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(mallFunction.f179819d));
        gm0.j1.i();
        g0Var.d(13720, str, valueOf, (java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void Z6() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public boolean a7() {
        com.tencent.mm.plugin.mall.ui.l0[] l0VarArr;
        android.view.View view;
        r45.p67 p67Var = this.f148271w.f13954q;
        int i17 = 0;
        while (true) {
            l0VarArr = this.f148270v;
            if (i17 >= l0VarArr.length) {
                break;
            }
            android.view.View view2 = l0VarArr[i17].f148435a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0VarArr[i17].f148436b.setImageBitmap(null);
            i17++;
        }
        for (int i18 = 0; i18 < p67Var.f382809d.size() && i18 < l0VarArr.length; i18++) {
            r45.q67 q67Var = (r45.q67) p67Var.f382809d.get(i18);
            android.view.View view3 = l0VarArr[i18].f148435a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0VarArr[i18].f148436b.setUrl(x51.j1.b(q67Var.f383716e));
            l0VarArr[i18].f148436b.setVisibility(0);
            l0VarArr[i18].f148437c.setText(x51.j1.b(q67Var.f383715d));
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "item %d url %s", java.lang.Integer.valueOf(i18), x51.j1.b(q67Var.f383716e));
            l0VarArr[i18].f148438d.setVisibility(8);
            java.lang.String b17 = x51.j1.b(q67Var.f383718g);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                l0VarArr[i18].f148438d.setText(b17);
                l0VarArr[i18].f148438d.setVisibility(0);
            }
            l0VarArr[i18].f148435a.setOnClickListener(new com.tencent.mm.plugin.mall.ui.i0(this, q67Var));
        }
        android.widget.ListView listView = this.f148239d;
        if (listView != null && (view = this.f148274z) != null && !this.A) {
            listView.addFooterView(view);
            this.A = true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f148271w.f13961x)) {
            this.f148272x.setText(this.f148271w.f13961x);
            this.f148272x.setVisibility(0);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void b7(android.view.View view) {
        com.tencent.mm.plugin.mall.ui.l0 l0Var = new com.tencent.mm.plugin.mall.ui.l0(this);
        com.tencent.mm.plugin.mall.ui.l0[] l0VarArr = this.f148270v;
        l0VarArr[0] = l0Var;
        l0Var.f148435a = view.findViewById(com.tencent.mm.R.id.khd);
        l0VarArr[0].f148436b = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.khg);
        l0VarArr[0].f148436b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        l0VarArr[0].f148437c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kho);
        l0VarArr[0].f148438d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dlp);
        l0VarArr[0].f148436b.setVisibility(4);
        com.tencent.mm.plugin.mall.ui.l0 l0Var2 = new com.tencent.mm.plugin.mall.ui.l0(this);
        l0VarArr[1] = l0Var2;
        l0Var2.f148435a = view.findViewById(com.tencent.mm.R.id.acb);
        l0VarArr[1].f148436b = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.acp);
        l0VarArr[1].f148436b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        l0VarArr[1].f148437c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.acw);
        l0VarArr[1].f148438d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aco);
        l0VarArr[1].f148436b.setVisibility(4);
        com.tencent.mm.plugin.mall.ui.l0 l0Var3 = new com.tencent.mm.plugin.mall.ui.l0(this);
        l0VarArr[2] = l0Var3;
        l0Var3.f148435a = view.findViewById(com.tencent.mm.R.id.adv);
        l0VarArr[2].f148436b = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.aeq);
        l0VarArr[2].f148436b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        l0VarArr[2].f148437c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aew);
        l0VarArr[2].f148438d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dlq);
        l0VarArr[2].f148436b.setVisibility(4);
        com.tencent.mm.plugin.mall.ui.l0 l0Var4 = new com.tencent.mm.plugin.mall.ui.l0(this);
        l0VarArr[3] = l0Var4;
        l0Var4.f148435a = view.findViewById(com.tencent.mm.R.id.iu8);
        l0VarArr[3].f148436b = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.ixc);
        l0VarArr[3].f148437c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ixv);
        l0VarArr[3].f148436b.setVisibility(4);
        android.view.View view2 = l0VarArr[3].f148435a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyAreaView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyAreaView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void c7() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bw7, (android.view.ViewGroup) null);
        this.f148250r = inflate;
        this.f148239d.addHeaderView(inflate);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void e7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void f7() {
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            setMMTitle(this.f148271w.f13957t);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "get wechat user wallet entry : %s", Ai);
            setMMTitle(Ai);
        }
        java.lang.String str = this.f148271w.f13958u;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        setMMSubTitle(str);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.B = true;
        super.finish();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void g7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void h7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.kfo);
        android.widget.TextView textView = this.f148242g;
        at4.s1 s1Var = this.f148271w;
        com.tencent.mm.wallet_core.ui.r1.s0(viewGroup, textView, "1", s1Var.f13959v, s1Var.f13960w);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f148271w.f13959v)) {
            return;
        }
        com.tencent.mm.plugin.mall.ui.n0 n0Var = (com.tencent.mm.plugin.mall.ui.n0) component(com.tencent.mm.plugin.mall.ui.n0.class);
        n0Var.focusOrder().next(com.tencent.mm.R.id.kfo).next(com.tencent.mm.R.id.khd);
        n0Var.findViewById(com.tencent.mm.R.id.kfo).sendAccessibilityEvent(8);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void i7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        android.widget.ListView listView = this.f148239d;
        int i17 = com.tencent.mm.plugin.mall.ui.b.f148332a;
        listView.setPadding(i17, 0, i17, 0);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void j7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "onActivityResult requestCode %s resultCode %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        boolean z17 = true;
        com.tencent.mm.plugin.mall.ui.n2.f148448a = true;
        com.tencent.mm.plugin.mall.ui.b.b(this, false, false);
        customfixStatusbar(true);
        super.onCreate(bundle);
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.bvy, null);
        this.f148274z = inflate;
        inflate.setClickable(false);
        this.f148274z.setEnabled(false);
        this.f148272x = (android.widget.TextView) this.f148274z.findViewById(com.tencent.mm.R.id.pew);
        this.f148271w = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f148248p);
        addSceneEndListener(fe1.i.CTRL_INDEX);
        ef3.l lVar = new ef3.l();
        at4.s1 s1Var = this.f148271w;
        if (s1Var != null) {
            r45.p67 p67Var = s1Var.f13954q;
            if (p67Var != null && (linkedList = p67Var.f382809d) != null && linkedList.size() != 0) {
                z17 = false;
            }
            if (!z17) {
                doSceneProgress(lVar, false);
                return;
            }
        }
        doSceneForceProgress(lVar);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(fe1.i.CTRL_INDEX);
        this.G.dead();
        this.H.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.F) {
            this.F = false;
        } else {
            if (java.lang.System.currentTimeMillis() - this.f148273y >= ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OverseaPayWalletInfoRefreshInternal", 15) * 1000) {
                this.f148273y = java.lang.System.currentTimeMillis();
                doSceneProgress(new ef3.l(), false);
            }
        }
        f7();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var.getType() == 1577) {
            ef3.l lVar = (ef3.l) m1Var;
            r45.t67 t67Var = lVar.f252420f;
            if ((t67Var == null ? 0 : t67Var.f386172d) == 1) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t67Var == null ? "" : t67Var.f386173e)) {
                    if (this.B) {
                        return true;
                    }
                    if (java.lang.System.currentTimeMillis() - this.C > 500) {
                        this.C = java.lang.System.currentTimeMillis();
                        this.G.alive();
                        this.H.alive();
                        android.os.Bundle bundle = new android.os.Bundle();
                        r45.t67 t67Var2 = lVar.f252420f;
                        this.E = t67Var2 != null ? t67Var2.f386173e : "";
                        android.content.Intent intent = new android.content.Intent();
                        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "startWebViewUI %s", this.E);
                        bundle.putString("KoriginUrl", this.E);
                        bundle.putBoolean("KIsHKAgreeUrl", true);
                        intent.putExtra("rawUrl", this.E);
                        intent.putExtra("jsapiargs", bundle);
                        intent.putExtra("geta8key_username", c01.z1.r());
                        intent.putExtra("pay_channel", 1);
                        com.tencent.mm.wallet_core.ui.r1.U(getContext(), intent, 4);
                    }
                }
            }
            this.f148271w = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f148248p);
            h7();
            a7();
            f7();
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "showGetNewWalletTip call");
            boolean z17 = this.f148271w.f13956s;
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
            java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
            boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUI", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + z17);
            if (!booleanValue && z17) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                db5.e1.G(this, getString(com.tencent.mm.R.string.gr8), null, true, null);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.mall.ui.n0.class);
    }
}
