package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class MallIndexOSUIv2 extends com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 {
    public int H;
    public final com.tencent.mm.sdk.event.IListener I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f148277J;

    /* renamed from: x, reason: collision with root package name */
    public int f148278x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.mall.ui.t0[] f148279y = new com.tencent.mm.plugin.mall.ui.t0[3];

    /* renamed from: z, reason: collision with root package name */
    public at4.s1 f148280z = new at4.s1();
    public android.widget.TextView A = null;
    public android.view.View B = null;
    public long C = 0;
    public boolean D = false;
    public long E = 0;
    public boolean F = false;
    public java.lang.String G = "";

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$2, reason: invalid class name */
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
            com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2 = com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.this;
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "WebViewUIDestroyEvent %s isCloseWindow %s", str, java.lang.Boolean.valueOf(mallIndexOSUIv2.F));
            java.lang.String str2 = mallIndexOSUIv2.G;
            if (str2 == null || !str2.equals(webViewUIDestroyEvent2.f54988g.f7597a)) {
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mall.ui.o0(this), 500L);
            return false;
        }
    }

    public MallIndexOSUIv2() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewCloseWindowEvent>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.1
            {
                this.__eventId = -704562821;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewCloseWindowEvent webViewCloseWindowEvent) {
                com.tencent.mm.autogen.events.WebViewCloseWindowEvent webViewCloseWindowEvent2 = webViewCloseWindowEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "WebViewCloseWindowEventListener %s", webViewCloseWindowEvent2.f54983g.f7125a);
                com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2 = com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.this;
                java.lang.String str = mallIndexOSUIv2.G;
                if (str == null || !str.equals(webViewCloseWindowEvent2.f54983g.f7125a)) {
                    return false;
                }
                mallIndexOSUIv2.F = true;
                return false;
            }
        };
        this.f148277J = new com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.AnonymousClass2(a0Var);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void W6() {
        removeAllOptionMenu();
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.mall.ui.s0(this));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void X6() {
        android.view.View view = this.f148265r;
        if (view == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "header = null");
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.gyc);
        if (linearLayout == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "headerContentLayout = null");
            return;
        }
        if (j65.e.b()) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.ann);
        }
        linearLayout.post(new com.tencent.mm.plugin.mall.ui.p0(this, linearLayout));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void Y6() {
        int color = getResources().getColor(com.tencent.mm.R.color.f479375xr);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(com.tencent.mm.R.id.m7o).setBackgroundColor(color);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public int Z6() {
        return this.H;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void c7(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction, int i17) {
        super.c7(mallFunction, i17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str = mallFunction.f179825m;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(mallFunction.f179819d));
        gm0.j1.i();
        g0Var.d(13720, str, valueOf, (java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void d7() {
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.bvy, null);
        this.B = inflate;
        inflate.setClickable(false);
        this.B.setEnabled(false);
        this.A = (android.widget.TextView) this.B.findViewById(com.tencent.mm.R.id.pew);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public boolean e7() {
        com.tencent.mm.plugin.mall.ui.t0[] t0VarArr;
        android.view.View view;
        char c17;
        r45.p67 p67Var = this.f148280z.f13954q;
        int i17 = 0;
        while (true) {
            t0VarArr = this.f148279y;
            if (i17 >= t0VarArr.length) {
                break;
            }
            android.view.View view2 = t0VarArr[i17].f148486a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t0VarArr[i17].f148487b.setImageBitmap(null);
            i17++;
        }
        for (int i18 = 0; i18 < p67Var.f382809d.size() && i18 < t0VarArr.length; i18++) {
            r45.q67 q67Var = (r45.q67) p67Var.f382809d.get(i18);
            android.view.View view3 = t0VarArr[i18].f148486a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t0VarArr[i18].f148487b.setUrl(x51.j1.b(q67Var.f383716e));
            t0VarArr[i18].f148487b.setVisibility(0);
            t0VarArr[i18].f148488c.setText(x51.j1.b(q67Var.f383715d));
            java.lang.String b17 = x51.j1.b(q67Var.f383718g);
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                c17 = '\b';
                t0VarArr[i18].f148489d.setVisibility(8);
            } else {
                t0VarArr[i18].f148489d.setText(b17);
                t0VarArr[i18].f148489d.setVisibility(0);
                c17 = '\b';
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "item %s name: %s,desc:%s,url %s,", java.lang.Integer.valueOf(i18), q67Var.f383715d, b17, x51.j1.b(q67Var.f383716e));
            t0VarArr[i18].f148486a.setOnClickListener(new com.tencent.mm.plugin.mall.ui.q0(this, q67Var));
        }
        android.widget.ListView listView = this.f148254d;
        if (listView != null && (view = this.B) != null && !this.D) {
            listView.addFooterView(view);
            this.D = true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f148280z.f13961x)) {
            this.A.setText(this.f148280z.f13961x);
            this.A.setVisibility(0);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void f7(android.view.View view) {
        com.tencent.mm.plugin.mall.ui.t0 t0Var = new com.tencent.mm.plugin.mall.ui.t0();
        com.tencent.mm.plugin.mall.ui.t0[] t0VarArr = this.f148279y;
        t0VarArr[0] = t0Var;
        t0Var.f148486a = view.findViewById(com.tencent.mm.R.id.j9l);
        o7(t0VarArr[0]);
        com.tencent.mm.plugin.mall.ui.t0 t0Var2 = new com.tencent.mm.plugin.mall.ui.t0();
        t0VarArr[1] = t0Var2;
        t0Var2.f148486a = view.findViewById(com.tencent.mm.R.id.j9m);
        o7(t0VarArr[1]);
        com.tencent.mm.plugin.mall.ui.t0 t0Var3 = new com.tencent.mm.plugin.mall.ui.t0();
        t0VarArr[2] = t0Var3;
        t0Var3.f148486a = view.findViewById(com.tencent.mm.R.id.j9n);
        o7(t0VarArr[2]);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void g7() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f489257bw3, (android.view.ViewGroup) null);
        this.f148265r = inflate;
        this.f148254d.addHeaderView(inflate);
        X6();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void i7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        android.widget.ListView listView = this.f148254d;
        int i17 = com.tencent.mm.plugin.mall.ui.b.f148332a;
        listView.setPadding(i17, 0, i17, 0);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void j7() {
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            setMMTitle(this.f148280z.f13957t);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "get wechat user wallet entry : %s", Ai);
            setMMTitle(Ai);
        }
        java.lang.String str = this.f148280z.f13958u;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        setMMSubTitle(str);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void k7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.kfo);
        android.widget.TextView textView = this.f148257g;
        at4.s1 s1Var = this.f148280z;
        com.tencent.mm.wallet_core.ui.r1.s0(viewGroup, textView, "1", s1Var.f13959v, s1Var.f13960w);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f148280z.f13959v)) {
            return;
        }
        com.tencent.mm.plugin.mall.ui.v0 v0Var = (com.tencent.mm.plugin.mall.ui.v0) component(com.tencent.mm.plugin.mall.ui.v0.class);
        v0Var.focusOrder().next(com.tencent.mm.R.id.kfo).next(com.tencent.mm.R.id.khd);
        v0Var.findViewById(com.tencent.mm.R.id.kfo).sendAccessibilityEvent(8);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void l7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void m7() {
    }

    public final void o7(com.tencent.mm.plugin.mall.ui.t0 t0Var) {
        t0Var.f148487b = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) t0Var.f148486a.findViewById(com.tencent.mm.R.id.hhz);
        t0Var.f148488c = (android.widget.TextView) t0Var.f148486a.findViewById(com.tencent.mm.R.id.hjn);
        t0Var.f148489d = (android.widget.TextView) t0Var.f148486a.findViewById(com.tencent.mm.R.id.hhg);
        if (j65.e.b()) {
            t0Var.f148489d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        } else {
            t0Var.f148489d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "onActivityResult requestCode %s resultCode %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.mall.ui.n2.f148448a = true;
        com.tencent.mm.plugin.mall.ui.b.c(this);
        customfixStatusbar(true);
        super.onCreate(bundle);
        this.f148280z = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f148264q);
        addSceneEndListener(fe1.i.CTRL_INDEX);
        at4.s1 s1Var = this.f148280z;
        if (s1Var != null) {
            r45.p67 p67Var = s1Var.f13954q;
            if (!(p67Var == null || (linkedList = p67Var.f382809d) == null || linkedList.size() == 0)) {
                doSceneProgress(new ef3.l(), false);
                return;
            }
        }
        doSceneProgress(new ef3.l(), true);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(fe1.i.CTRL_INDEX);
        this.I.dead();
        this.f148277J.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = this.f148278x;
        if (i17 == 1 || i17 == 2) {
            this.f148278x = 0;
        } else {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OverseaPayWalletInfoRefreshInternal", 15) * 1000;
            if (b17 > 15000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "svrTime is : %d, large than 15000, use default time 15000", java.lang.Integer.valueOf(b17));
                jx3.f.INSTANCE.kvStat(34167, "5");
                b17 = 15000;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "checkUpdate svrTime: %d lastUpdateTime : %d  curTime %d", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(currentTimeMillis));
            if (currentTimeMillis - this.C >= b17) {
                this.C = java.lang.System.currentTimeMillis();
                doSceneProgress(new ef3.l(), false);
            }
        }
        j7();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.la5 la5Var;
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var.getType() == 1577) {
            ef3.l lVar = (ef3.l) m1Var;
            r45.k65 k65Var = lVar.f252421g;
            r45.t67 t67Var = lVar.f252420f;
            if ((t67Var == null ? 0 : t67Var.f386172d) == 1) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t67Var == null ? "" : t67Var.f386173e)) {
                    if (isFinishing() || isDestroyed()) {
                        return true;
                    }
                    if (java.lang.System.currentTimeMillis() - this.E > 500) {
                        this.E = java.lang.System.currentTimeMillis();
                        this.I.alive();
                        this.f148277J.alive();
                        android.os.Bundle bundle = new android.os.Bundle();
                        r45.t67 t67Var2 = lVar.f252420f;
                        this.G = t67Var2 != null ? t67Var2.f386173e : "";
                        android.content.Intent intent = new android.content.Intent();
                        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "startWebViewUI %s", this.G);
                        bundle.putString("KoriginUrl", this.G);
                        bundle.putBoolean("KIsHKAgreeUrl", true);
                        intent.putExtra("rawUrl", this.G);
                        intent.putExtra("jsapiargs", bundle);
                        intent.putExtra("geta8key_username", c01.z1.r());
                        intent.putExtra("pay_channel", 1);
                        com.tencent.mm.wallet_core.ui.r1.U(getContext(), intent, 4);
                    }
                }
            }
            this.f148280z = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f148264q);
            k7();
            e7();
            j7();
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "showGetNewWalletTip call");
            boolean z17 = this.f148280z.f13956s;
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
            java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
            boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + z17);
            if (!booleanValue && z17) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                com.tencent.mm.plugin.wallet_core.ui.x4.b(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "[checkShowComplianceHalfPage]");
            if (isFinishing() || isDestroyed()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "isFinishing() || isDestroyed()");
            } else if (k65Var != null && (la5Var = k65Var.f378449r) != null && la5Var.f379277d) {
                try {
                    java.lang.String base64Data = android.util.Base64.encodeToString(la5Var.f379278e.toByteArray(), 2);
                    kotlin.jvm.internal.o.g(base64Data, "base64Data");
                    byte[] decode = android.util.Base64.decode(base64Data, 0);
                    kotlin.jvm.internal.o.f(decode, "decode(...)");
                    if (!(decode.length == 0)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                        create.putBinary("half_page_view_data", decode);
                        create.putLong("usecase_platform_session", currentTimeMillis);
                        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
                        if (qVar != null) {
                            qVar.startUseCase("complianceHalfPage", create, new com.tencent.mm.plugin.wallet_core.utils.z(null));
                        }
                    }
                    this.f148278x = 2;
                } catch (java.io.IOException unused) {
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.mall.ui.v0.class);
    }
}
