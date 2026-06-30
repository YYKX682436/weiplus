package com.tencent.mm.plugin.mall.ui;

@gm0.a2
/* loaded from: classes9.dex */
public class MallIndexUI extends com.tencent.mm.plugin.mall.ui.MallIndexBaseUI implements l75.z0 {
    public android.app.Dialog C;
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView F;
    public android.widget.ProgressBar G;
    public final com.tencent.mm.sdk.event.IListener H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f148283J;
    public final com.tencent.mm.sdk.event.IListener K;
    public boolean L;

    /* renamed from: w, reason: collision with root package name */
    public am.m10 f148285w;

    /* renamed from: v, reason: collision with root package name */
    public boolean f148284v = false;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.ui.ca f148286x = new com.tencent.mm.plugin.wallet_core.ui.ca();

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f148287y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f148288z = false;
    public android.widget.TextView A = null;
    public boolean B = false;
    public com.tencent.mm.plugin.mall.ui.k1 D = null;
    public com.tencent.mm.plugin.mall.ui.m1 E = null;

    public MallIndexUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.H = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenECardFinishEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUI.1
            {
                this.__eventId = 1883130380;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OpenECardFinishEvent openECardFinishEvent) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "open ecard finish");
                com.tencent.mm.plugin.wallet_core.model.ECardInfo.b(null);
                return false;
            }
        };
        this.I = false;
        this.f148283J = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUI.2
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent2 = walletRealNameResultNotifyEvent;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(walletRealNameResultNotifyEvent2.f54973g.f6120a);
                com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI = com.tencent.mm.plugin.mall.ui.MallIndexUI.this;
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "real name verify callback, result: %s, isDoRealNameForBalance: %s", valueOf, java.lang.Boolean.valueOf(mallIndexUI.I));
                if (walletRealNameResultNotifyEvent2.f54973g.f6120a == -1 && mallIndexUI.I) {
                    mallIndexUI.I = false;
                    com.tencent.mm.plugin.mall.ui.MallIndexUI.l7(mallIndexUI);
                }
                return false;
            }
        };
        this.K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxPayGdprResultEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUI.3
            {
                this.__eventId = -553207673;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WxPayGdprResultEvent wxPayGdprResultEvent) {
                java.lang.String str = wxPayGdprResultEvent.f54995g.f8257a;
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "get result %s", str);
                if (!"agree_privacy".equals(str)) {
                    return false;
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                return false;
            }
        };
        this.L = false;
    }

    public static void l7(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        mallIndexUI.getClass();
        if (c01.z1.I()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scene_balance_manager", 2);
            j45.l.j(mallIndexUI, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, null);
        } else {
            android.widget.ImageView imageView = (android.widget.ImageView) mallIndexUI.findViewById(com.tencent.mm.R.id.jkl);
            android.content.Intent intent2 = new android.content.Intent(mallIndexUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.mall.ui.MallWalletUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mallIndexUI, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mallIndexUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mallIndexUI, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageView.setVisibility(8);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, 0L);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16500, 2);
        }
        com.tencent.mm.wallet_core.ui.r1.q0(11, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, mallIndexUI.f148243h, 2);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void U6() {
        removeAllOptionMenu();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "addIconOptionMenuByMode");
        addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, false, (android.view.MenuItem.OnMenuItemClickListener) new com.tencent.mm.plugin.mall.ui.x0(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14872, 0, 0, "", "", 1);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void V6() {
        int color = getResources().getColor(com.tencent.mm.R.color.f479375xr);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(com.tencent.mm.R.id.m7o).setBackgroundColor(color);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void Z6() {
        this.f148249q = ef3.r.wi().Bi(this.f148248p).field_isShowSetting;
        if (this.f148251s == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bw6, (android.view.ViewGroup) null);
            this.f148251s = inflate;
            this.f148239d.addFooterView(inflate, null, false);
            android.widget.TextView textView = (android.widget.TextView) this.f148251s.findViewById(com.tencent.mm.R.id.jky);
            com.tencent.mm.wallet_core.ui.r1.k(textView, 100);
            textView.setOnClickListener(new com.tencent.mm.plugin.mall.ui.c1(this));
        }
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "is show setting: %s", java.lang.Integer.valueOf(this.f148249q));
        if (this.f148249q == 0) {
            android.view.View view = this.f148251s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f148251s.setPadding(0, 0, 0, 0);
            return;
        }
        android.view.View view2 = this.f148251s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getWindow().getDecorView().post(new com.tencent.mm.plugin.mall.ui.d1(this));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public boolean a7() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "init BankcardList");
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        l10Var.f7215a = 1;
        l10Var.f7216b = true;
        l10Var.f7218d = 0;
        l10Var.f7217c = true;
        walletGetUserInfoEvent.f54959h.f7292a = new com.tencent.mm.plugin.mall.ui.h1(this, walletGetUserInfoEvent);
        walletGetUserInfoEvent.b(android.os.Looper.myLooper());
        return false;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void b7(android.view.View view) {
        this.D = new com.tencent.mm.plugin.mall.ui.k1(this, this, view);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.D);
        com.tencent.mm.plugin.mall.ui.m1 m1Var = new com.tencent.mm.plugin.mall.ui.m1(this, this, view);
        this.E = m1Var;
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
        gm0.j1.i();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC;
        long longValue = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue();
        if (booleanValue && longValue > 0 && java.lang.System.currentTimeMillis() >= longValue) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "hasRedDot expire, ignore reddot");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, bool);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, 0L);
            booleanValue = false;
        }
        if (booleanValue) {
            m1Var.f148405e.setVisibility(0);
        } else {
            m1Var.f148405e.setVisibility(8);
        }
        m1Var.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, booleanValue);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.E);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void c7() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f489258bw4, (android.view.ViewGroup) null);
        this.f148250r = inflate;
        this.f148239d.addHeaderView(inflate, null, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f148250r.findViewById(com.tencent.mm.R.id.gyc);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.height = com.tencent.mm.plugin.mall.ui.b.f148337f;
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void e7() {
        com.tencent.mm.autogen.events.SyncOfflineTokenEvent syncOfflineTokenEvent = new com.tencent.mm.autogen.events.SyncOfflineTokenEvent();
        syncOfflineTokenEvent.f54875g.f6798a = false;
        syncOfflineTokenEvent.e();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void f7() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
        setMMTitle(com.tencent.mm.R.string.gr6);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f148284v = true;
        super.finish();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                j7();
            }
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void g7() {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        if (!(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_is_reg == -1)) {
            if (!(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_is_reg == 0)) {
                return;
            }
        }
        if (c01.z1.I()) {
            com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexUI", "hy: user not open wallet or status unknown. try query");
            doSceneForceProgress(new us4.a("", false));
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
    public void h7() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "1";
        walletGetBulletinEvent.f192364d = new com.tencent.mm.plugin.mall.ui.e1(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
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
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "updateBalanceNum");
        at4.u1 u1Var = new at4.u1();
        if (u1Var.a()) {
            this.f148241f.setText((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, getString(com.tencent.mm.R.string.f492764hs5)));
            this.f148241f.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            return;
        }
        if (u1Var.d()) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "show balance amount");
            long longValue = ((java.lang.Long) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
            if (this.F == null) {
                com.tencent.mars.xlog.Log.w("MicorMsg.MallIndexUI", "moneyLoadingView is null");
                return;
            }
            if (u1Var.c()) {
                this.f148241f.setText(getString(com.tencent.mm.R.string.kmm));
                this.f148241f.setVisibility(0);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.F.f180755g = null;
            } else {
                this.f148241f.setVisibility(8);
                this.F.setVisibility(0);
                this.G.setVisibility(0);
            }
            if (this.F.getVisibility() == 0) {
                this.F.setMoney(com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.i("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue()));
            }
        }
    }

    public final void m7(ef3.d dVar) {
        if (dVar == null || com.tencent.mm.sdk.platformtools.t8.K0(dVar.f252405a)) {
            return;
        }
        if (this.f148288z) {
            android.widget.TextView textView = this.A;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.f492468gr1);
                this.A.setOnClickListener(new com.tencent.mm.plugin.mall.ui.z0(this, dVar));
                return;
            }
            return;
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f489255bw1, null);
        this.f148287y = inflate;
        inflate.setClickable(false);
        this.f148287y.setEnabled(false);
        android.widget.TextView textView2 = (android.widget.TextView) this.f148287y.findViewById(com.tencent.mm.R.id.pew);
        this.A = textView2;
        textView2.setVisibility(0);
        this.A.setText(com.tencent.mm.R.string.f492468gr1);
        this.A.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479308vo));
        this.A.setOnClickListener(new com.tencent.mm.plugin.mall.ui.a1(this, dVar));
        android.widget.ListView listView = this.f148239d;
        if (listView != null) {
            listView.addFooterView(this.f148287y);
            this.f148288z = true;
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "onActivityResult %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        super.onActivityResult(i17, i18, intent);
        if (i17 == 3) {
            com.tencent.mm.plugin.wallet_core.ui.ca caVar = this.f148286x;
            if (i18 == -1) {
                caVar.a(intent);
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.aa aaVar = caVar.f180182g;
            if (aaVar != null) {
                aaVar.cancel();
                return;
            }
            return;
        }
        if (i17 == 5) {
            gm0.j1.i();
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            finish();
            return;
        }
        if (i17 == 6 && intent != null && intent.getIntExtra("is_switch_wallet", 0) == 1) {
            finish();
            com.tencent.mm.autogen.events.RequestEnterWalletEvent requestEnterWalletEvent = new com.tencent.mm.autogen.events.RequestEnterWalletEvent();
            requestEnterWalletEvent.f54693g.f6968a = getContext();
            requestEnterWalletEvent.e();
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        at4.g0.e(2);
        am.m10 m10Var = new am.m10();
        this.f148285w = m10Var;
        m10Var.f7293b = false;
        m10Var.f7294c = true;
        this.H.alive();
        this.K.alive();
        this.f148286x.f180181f = new com.tencent.mm.plugin.mall.ui.b1(this);
        com.tencent.mm.plugin.mall.ui.n2.f148448a = true;
        com.tencent.mm.plugin.mall.ui.b.b(this, false, true);
        super.onCreate(bundle);
        this.f148283J.alive();
        addSceneEndListener(2713);
        addSceneEndListener(385);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            gm0.j1.i();
            m7(new ef3.d((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, "")));
            gm0.j1.i();
            ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
            doSceneProgress(new ef3.i(), false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16500, 1);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MallIndexUI)).Rj(this, iy1.a.WxPay);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f148286x.getClass();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
        this.H.dead();
        this.K.dead();
        removeSceneEndListener(2713);
        removeSceneEndListener(385);
        this.f148283J.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f148286x.b();
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = this.F;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.f180755g = null;
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f148286x.c();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
        super.onResume();
        j7();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var instanceof ef3.i) {
            m7(((ef3.i) m1Var).f252409d);
        } else if (m1Var instanceof ss4.e0) {
            ss4.e0 e0Var = (ss4.e0) m1Var;
            if (e0Var.isJumpRemind()) {
                e0Var.getJumpRemind().g(this, new com.tencent.mm.plugin.mall.ui.y0(this));
            }
        }
        return true;
    }
}
