package com.tencent.mm.plugin.mall.ui;

@gm0.a2
/* loaded from: classes9.dex */
public class MallIndexUIv2 extends com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 implements l75.z0 {
    public android.app.Dialog F;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView f148290J;
    public android.widget.ProgressBar K;
    public int L;
    public java.util.ArrayList M;
    public final com.tencent.mm.sdk.event.IListener P;
    public boolean Q;
    public final com.tencent.mm.sdk.event.IListener R;
    public final com.tencent.mm.sdk.event.IListener S;
    public final com.tencent.mm.sdk.event.IListener T;
    public final com.tencent.mm.sdk.event.IListener U;
    public boolean V;
    public boolean W;

    /* renamed from: y, reason: collision with root package name */
    public am.m10 f148292y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f148293z;

    /* renamed from: x, reason: collision with root package name */
    public boolean f148291x = false;
    public final com.tencent.mm.plugin.wallet_core.ui.ca A = new com.tencent.mm.plugin.wallet_core.ui.ca();
    public android.view.View B = null;
    public boolean C = false;
    public android.widget.TextView D = null;
    public boolean E = false;
    public boolean G = false;
    public com.tencent.mm.plugin.mall.ui.k2 H = null;
    public com.tencent.mm.plugin.mall.ui.m2 I = null;
    public boolean N = false;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$4, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewUIDestroyEvent> {
        public AnonymousClass4(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1681666147;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebViewUIDestroyEvent webViewUIDestroyEvent) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "WebViewUIDestroyEvent close");
            com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.T.dead();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mall.ui.c2(this), 200L);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$5, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass5 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OfflineUseCaseFinishEvent> {
        public AnonymousClass5(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 286464771;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OfflineUseCaseFinishEvent offlineUseCaseFinishEvent) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "offlineUseCaseEvent callback");
            com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.U.dead();
            am.em emVar = offlineUseCaseFinishEvent.f54559g;
            if (emVar == null || emVar.f6563a != 1) {
                return false;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.mall.ui.d2(this));
            return false;
        }
    }

    public MallIndexUIv2() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.P = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenECardFinishEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUIv2.1
            {
                this.__eventId = 1883130380;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OpenECardFinishEvent openECardFinishEvent) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "open ecard finish");
                com.tencent.mm.plugin.wallet_core.model.ECardInfo.b(null);
                return false;
            }
        };
        this.Q = false;
        this.R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUIv2.2
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent2 = walletRealNameResultNotifyEvent;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(walletRealNameResultNotifyEvent2.f54973g.f6120a);
                com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this;
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "real name verify callback, result: %s, isDoRealNameForBalance: %s", valueOf, java.lang.Boolean.valueOf(mallIndexUIv2.Q));
                if (walletRealNameResultNotifyEvent2.f54973g.f6120a == -1 && mallIndexUIv2.Q) {
                    mallIndexUIv2.Q = false;
                    com.tencent.mm.plugin.mall.ui.MallIndexUIv2.o7(mallIndexUIv2);
                }
                return false;
            }
        };
        this.S = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxPayGdprResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUIv2.3
            {
                this.__eventId = -553207673;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WxPayGdprResultEvent wxPayGdprResultEvent) {
                com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.G = true;
                java.lang.String str = wxPayGdprResultEvent.f54995g.f8257a;
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "get result %s", str);
                if (!"agree_privacy".equals(str)) {
                    return false;
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                return false;
            }
        };
        this.T = new com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass4(a0Var);
        this.U = new com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass5(a0Var);
        this.V = false;
        this.W = false;
    }

    public static void o7(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        mallIndexUIv2.getClass();
        if (c01.z1.I()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scene_balance_manager", 2);
            j45.l.j(mallIndexUIv2, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, null);
        } else {
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("walletUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.mall.ui.o1(mallIndexUIv2));
            ((android.widget.ImageView) mallIndexUIv2.findViewById(com.tencent.mm.R.id.jkl)).setVisibility(8);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, 0L);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16500, 2);
        }
        com.tencent.mm.wallet_core.ui.r1.q0(11, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, mallIndexUIv2.f148259i, 2);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void W6() {
        removeAllOptionMenu();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "addIconOptionMenuByMode");
        addIconOptionMenu(0, com.tencent.mm.R.string.kuu, com.tencent.mm.R.raw.icons_outlined_more, false, (android.view.MenuItem.OnMenuItemClickListener) new com.tencent.mm.plugin.mall.ui.v1(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14872, 0, 0, "", "", 1);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void X6() {
        android.view.View view = this.f148265r;
        if (view == null) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "header = null");
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.gyc);
        if (linearLayout == null) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "headerContentLayout = null");
            return;
        }
        if (j65.e.b()) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.ann);
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) this.f148265r.findViewById(com.tencent.mm.R.id.jkk);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) this.f148265r.findViewById(com.tencent.mm.R.id.jkg);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
        int intValue = ((java.lang.Integer) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.WALLET_MALL_HEADER_INTERVAL_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "init lastInterval:%s", java.lang.Integer.valueOf(intValue));
        if (intValue != 0) {
            layoutParams2.leftMargin = intValue;
            layoutParams.rightMargin = intValue;
        }
        int intValue2 = ((java.lang.Integer) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.WALLET_MALL_HEADER_ITEM_WIDTH_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "init lastWidth:%s", java.lang.Integer.valueOf(intValue2));
        if (intValue2 != 0) {
            layoutParams2.width = intValue2;
        }
        int intValue3 = ((java.lang.Integer) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.WALLET_MALL_HEADER_ITEM_HEIGHT_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "init lastHeight:%s", java.lang.Integer.valueOf(intValue3));
        if (intValue3 != 0) {
            layoutParams2.height = intValue3;
        }
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout.post(new com.tencent.mm.plugin.mall.ui.b2(this, linearLayout));
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
        return this.L;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void d7() {
        java.lang.String str = bt4.d.d(1).f382049e;
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "emptyHint: %s", str);
        if (this.f148266s == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bw6, (android.view.ViewGroup) null);
            this.f148266s = inflate;
            this.f148254d.addFooterView(inflate, null, false);
            android.widget.TextView textView = (android.widget.TextView) this.f148266s.findViewById(com.tencent.mm.R.id.jky);
            com.tencent.mm.wallet_core.ui.r1.k(textView, 100);
            textView.setOnClickListener(new com.tencent.mm.plugin.mall.ui.g2(this));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.view.View view = this.f148266s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f148266s.setPadding(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn), 0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn), 0);
            return;
        }
        android.view.View view2 = this.f148266s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) this.f148266s.findViewById(com.tencent.mm.R.id.jky)).setText(str);
        getWindow().getDecorView().post(new com.tencent.mm.plugin.mall.ui.h2(this));
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public boolean e7() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "init BankcardList");
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        l10Var.f7215a = 1;
        l10Var.f7216b = true;
        l10Var.f7218d = 0;
        l10Var.f7217c = true;
        walletGetUserInfoEvent.f54959h.f7292a = new com.tencent.mm.plugin.mall.ui.t1(this, walletGetUserInfoEvent);
        walletGetUserInfoEvent.b(android.os.Looper.myLooper());
        return false;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void f7(android.view.View view) {
        this.H = new com.tencent.mm.plugin.mall.ui.k2(this, this, view);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.H);
        com.tencent.mm.plugin.mall.ui.m2 m2Var = new com.tencent.mm.plugin.mall.ui.m2(this, this, view);
        this.I = m2Var;
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
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "hasRedDot expire, ignore reddot");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, bool);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, 0L);
            booleanValue = false;
        }
        if (booleanValue) {
            m2Var.f148408e.setVisibility(0);
            if (!m2Var.f148446h) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25075, 2, 0);
                m2Var.f148446h = true;
            }
        } else {
            m2Var.f148408e.setVisibility(8);
        }
        m2Var.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, booleanValue);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.I);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f148291x = true;
        super.finish();
        com.tencent.mm.sdk.platformtools.Log.c("MicorMsg.MallIndexUIv2", "[finish] %s, stack: ", this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                m7();
            }
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void g7() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f489259bw5, (android.view.ViewGroup) null);
        this.f148265r = inflate;
        this.f148254d.addHeaderView(inflate, null, false);
        X6();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void h7() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "mark has show complain half page");
        this.N = true;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void i7() {
        com.tencent.mm.autogen.events.SyncOfflineTokenEvent syncOfflineTokenEvent = new com.tencent.mm.autogen.events.SyncOfflineTokenEvent();
        syncOfflineTokenEvent.f54875g.f6798a = false;
        syncOfflineTokenEvent.e();
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
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
            setMMTitle(com.tencent.mm.R.string.gr6);
        } else {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "get wechat user wallet entry : %s", Ai);
            setMMTitle(Ai);
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void k7() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "1";
        walletGetBulletinEvent.f192364d = new com.tencent.mm.plugin.mall.ui.p1(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void l7() {
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2
    public void m7() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "updateBalanceNum");
        at4.u1 u1Var = new at4.u1();
        if (u1Var.a()) {
            this.f148256f.setText((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, getString(com.tencent.mm.R.string.f492764hs5)));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f148256f.getLayoutParams();
            layoutParams.bottomMargin = i65.a.b(getContext(), 16);
            this.f148256f.setLayoutParams(layoutParams);
            this.f148256f.setVisibility(0);
            this.f148290J.setVisibility(8);
            this.K.setVisibility(8);
            this.f148293z.setVisibility(8);
            return;
        }
        if (u1Var.d()) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "show balance amount");
            long longValue = ((java.lang.Long) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
            if (this.f148290J == null) {
                com.tencent.mars.xlog.Log.w("MicorMsg.MallIndexUIv2", "moneyLoadingView is null");
                return;
            }
            if (u1Var.c()) {
                this.f148256f.setText(getString(com.tencent.mm.R.string.kmm));
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f148256f.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.b(getContext(), 16);
                this.f148256f.setLayoutParams(layoutParams2);
                this.f148256f.setVisibility(0);
                this.f148290J.setVisibility(8);
                this.K.setVisibility(8);
                this.f148293z.setVisibility(8);
                this.f148290J.f180755g = null;
            } else {
                this.f148256f.setVisibility(8);
                this.f148290J.setVisibility(0);
                this.K.setVisibility(0);
                this.f148293z.setVisibility(0);
            }
            if (this.f148290J.getVisibility() == 0) {
                this.f148290J.setMoney(com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.i("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue()));
            }
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "onActivityResult %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        super.onActivityResult(i17, i18, intent);
        if (i17 == 3) {
            com.tencent.mm.plugin.wallet_core.ui.ca caVar = this.A;
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
        if (i17 == 6) {
            if (intent == null || intent.getIntExtra("is_switch_wallet", 0) != 1) {
                return;
            }
            finish();
            com.tencent.mm.autogen.events.RequestEnterWalletEvent requestEnterWalletEvent = new com.tencent.mm.autogen.events.RequestEnterWalletEvent();
            requestEnterWalletEvent.f54693g.f6968a = getContext();
            requestEnterWalletEvent.e();
            return;
        }
        if (i17 == 65281 && i18 == -1) {
            if (c01.z1.z()) {
                finish();
                return;
            }
            setResult(-1, intent);
            finish();
            com.tencent.mm.autogen.events.RequestEnterWalletEvent requestEnterWalletEvent2 = new com.tencent.mm.autogen.events.RequestEnterWalletEvent();
            requestEnterWalletEvent2.f54693g.f6968a = getContext();
            requestEnterWalletEvent2.e();
        }
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "[onCreate] %s", this);
        fixStatusbar(true);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        ((ku5.t0) ku5.t0.f312615d).j(new com.tencent.mm.plugin.mall.ui.e2(this), "wxpay_mallindex_refresh_location");
        am.m10 m10Var = new am.m10();
        this.f148292y = m10Var;
        m10Var.f7293b = false;
        m10Var.f7294c = true;
        this.P.alive();
        this.S.alive();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_PAY_MANAGE_LABEL_LIST_STRING_SYNC, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        arrayList.add(at4.x0.a(optJSONObject));
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("PayManageLabel", e17, "", new java.lang.Object[0]);
            }
        }
        this.M = arrayList;
        this.A.f180181f = new com.tencent.mm.plugin.mall.ui.f2(this);
        com.tencent.mm.plugin.mall.ui.n2.f148448a = true;
        com.tencent.mm.plugin.mall.ui.b.c(this);
        super.onCreate(bundle);
        this.R.alive();
        addSceneEndListener(2713);
        addSceneEndListener(385);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            gm0.j1.i();
            p7(new ef3.d((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, "")));
            doSceneProgress(new ef3.i(), false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16500, 1);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MallIndexUI)).Rj(this, iy1.a.WxPay);
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "[onDestroy] %s", this);
        this.A.getClass();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
        this.P.dead();
        this.S.dead();
        this.T.dead();
        this.U.dead();
        removeSceneEndListener(2713);
        removeSceneEndListener(385);
        this.R.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A.b();
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f148290J;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.f180755g = null;
        }
        this.V = false;
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.A.c();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
        super.onResume();
        m7();
        this.V = true;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        if (intValue == 0 || intValue == 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        j45.l.j(getContext(), "mall", ".ui.MallIndexOSUIv2", intent, null);
        finishWithNoAnim();
    }

    @Override // com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var instanceof ef3.i) {
            p7(((ef3.i) m1Var).f252409d);
        } else if (m1Var instanceof ss4.e0) {
            ss4.e0 e0Var = (ss4.e0) m1Var;
            if (e0Var.isJumpRemind()) {
                e0Var.getJumpRemind().g(this, new com.tencent.mm.plugin.mall.ui.y1(this));
                return true;
            }
            q7(e0Var.f412054y);
        }
        return true;
    }

    public final void p7(ef3.d dVar) {
        if (dVar == null || com.tencent.mm.sdk.platformtools.t8.K0(dVar.f252405a)) {
            return;
        }
        if (this.C) {
            android.widget.TextView textView = this.D;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.f492468gr1);
                this.D.setOnClickListener(new com.tencent.mm.plugin.mall.ui.z1(this, dVar));
                return;
            }
            return;
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f489255bw1, null);
        this.B = inflate;
        inflate.setClickable(false);
        this.B.setEnabled(false);
        android.widget.TextView textView2 = (android.widget.TextView) this.B.findViewById(com.tencent.mm.R.id.pew);
        this.D = textView2;
        textView2.setVisibility(0);
        this.D.setText(com.tencent.mm.R.string.f492468gr1);
        this.D.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479308vo));
        this.D.setOnClickListener(new com.tencent.mm.plugin.mall.ui.a2(this, dVar));
        android.widget.ListView listView = this.f148254d;
        if (listView != null) {
            listView.addFooterView(this.B);
            this.C = true;
        }
    }

    public final boolean q7(java.lang.String str) {
        if (!this.V) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "tryShowComplianceHalfPage, but is not onResume");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || this.N) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "will show compliance half page");
        if (com.tencent.mm.plugin.wallet_core.utils.a0.f180849a.a(str, null) != null) {
            this.N = true;
        }
        return true;
    }
}
