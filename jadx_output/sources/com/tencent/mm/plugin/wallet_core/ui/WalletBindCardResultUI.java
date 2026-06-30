package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletBindCardResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public static final /* synthetic */ int G = 0;
    public android.view.ViewGroup A;
    public com.tencent.mm.wallet_core.h E;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.BindCardOrder f179872d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f179874f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179875g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179876h;

    /* renamed from: i, reason: collision with root package name */
    public int f179877i;

    /* renamed from: m, reason: collision with root package name */
    public at4.t0 f179878m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.i6 f179879n;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f179883r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f179884s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f179885t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f179886u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f179887v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f179888w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f179889x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f179890y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f179891z;

    /* renamed from: e, reason: collision with root package name */
    public boolean f179873e = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f179880o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.BindCardOrder f179881p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f179882q = "-1";
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final com.tencent.mm.sdk.event.IListener F = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.1
        {
            this.__eventId = 201806318;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent) {
            com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent2 = walletOfflineRealNameNotifyEvent;
            if (!(walletOfflineRealNameNotifyEvent2 instanceof com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent)) {
                return false;
            }
            wo3.a0 a0Var = walletOfflineRealNameNotifyEvent2.f54962g.f7595a;
            if (!a0Var.f448140f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "block pass");
                return true;
            }
            boolean equals = "1".equals(a0Var.f448135a);
            am.p10 p10Var = walletOfflineRealNameNotifyEvent2.f54962g;
            if (!equals && !"2".equals(p10Var.f7595a.f448135a)) {
                return false;
            }
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
            wo3.a0 a0Var2 = p10Var.f7595a;
            java.lang.String str = a0Var2.f448135a;
            java.lang.String str2 = a0Var2.f448136b;
            java.lang.String str3 = a0Var2.f448137c;
            java.lang.String str4 = a0Var2.f448138d;
            java.lang.String str5 = a0Var2.f448139e;
            com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI = com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.this;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletBindCardResultUI.f179874f;
            realnameGuideHelper.d(str, str2, str3, str4, str5, payInfo == null ? 0 : payInfo.f192109e);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "receive guide");
            walletBindCardResultUI.getInput().putParcelable("key_realname_guide_helper", realnameGuideHelper);
            return false;
        }
    };

    public static void U6(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = walletBindCardResultUI.f179881p;
        objArr[0] = java.lang.Long.valueOf(bindCardOrder != null ? bindCardOrder.f179620q.f13975a : 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "onClickActivity, activityId: %s", objArr);
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder2 = walletBindCardResultUI.f179881p;
        if (bindCardOrder2 == null || bindCardOrder2.f179620q.f13975a <= 0) {
            return;
        }
        walletBindCardResultUI.V6(2);
        walletBindCardResultUI.C = true;
        if (walletBindCardResultUI.f179882q.equals("-1") || walletBindCardResultUI.f179882q.equals("3")) {
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder3 = walletBindCardResultUI.f179872d;
            int i17 = bindCardOrder3.f179613g;
            if (i17 == 6 && bindCardOrder3.f179621r != null) {
                com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder4 = walletBindCardResultUI.f179881p;
                java.lang.String str = bindCardOrder4.f179620q.f13975a + "";
                java.lang.String str2 = bindCardOrder4.f179620q.f13977c + "";
                java.lang.String str3 = bindCardOrder4.f179620q.f13978d + "";
                java.lang.String str4 = bindCardOrder4.f179620q.f13979e + "";
                at4.u0 u0Var = bindCardOrder4.f179620q;
                long j17 = u0Var.f13980f;
                long j18 = u0Var.f13976b;
                com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder5 = walletBindCardResultUI.f179872d;
                walletBindCardResultUI.doSceneForceProgress(new ss4.s(bindCardOrder4, str, str2, str3, str4, j17, j18, bindCardOrder5.f179614h, bindCardOrder5.f179617n, bindCardOrder5.f179618o, bindCardOrder5.f179619p));
                return;
            }
            if (!(i17 == 1 && bindCardOrder3.f179621r != null) || com.tencent.mm.sdk.platformtools.t8.K0(walletBindCardResultUI.f179881p.f179621r.f13947a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletBindCardResultUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                return;
            }
            java.util.HashMap hashMap = walletBindCardResultUI.f179880o;
            if (hashMap.containsKey(walletBindCardResultUI.f179881p.f179620q.f13975a + "")) {
                com.tencent.mm.plugin.wallet_core.ui.h6 h6Var = (com.tencent.mm.plugin.wallet_core.ui.h6) hashMap.get(walletBindCardResultUI.f179881p.f179620q.f13975a + "");
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "go to new url %s", h6Var.f180307a);
                java.lang.String str5 = h6Var.f180307a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    walletBindCardResultUI.W6();
                    com.tencent.mm.wallet_core.ui.r1.V(walletBindCardResultUI, str5, false);
                    return;
                } else {
                    java.lang.String str6 = walletBindCardResultUI.f179881p.f179621r.f13947a;
                    walletBindCardResultUI.W6();
                    com.tencent.mm.wallet_core.ui.r1.V(walletBindCardResultUI, str6, false);
                    return;
                }
            }
            java.lang.String str7 = walletBindCardResultUI.f179881p.f179621r.f13947a;
            java.lang.String str8 = walletBindCardResultUI.f179881p.f179620q.f13975a + "";
            java.lang.String str9 = walletBindCardResultUI.f179881p.f179620q.f13977c + "";
            java.lang.String str10 = walletBindCardResultUI.f179881p.f179620q.f13978d + "";
            java.lang.String str11 = walletBindCardResultUI.f179881p.f179620q.f13979e + "";
            java.lang.String payReqKey = walletBindCardResultUI.getPayReqKey();
            at4.u0 u0Var2 = walletBindCardResultUI.f179881p.f179620q;
            com.tencent.mm.plugin.wallet_core.ui.i6 i6Var = new com.tencent.mm.plugin.wallet_core.ui.i6(str8, str9, str10, str11, payReqKey, null, u0Var2.f13980f, u0Var2.f13976b, null);
            walletBindCardResultUI.W6();
            walletBindCardResultUI.f179879n = i6Var;
            com.tencent.mm.wallet_core.ui.r1.W(walletBindCardResultUI, str7, false, 1);
        }
    }

    public void V6(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.String str = "";
        if (this.f179872d.f179620q != null) {
            java.lang.String str2 = this.f179872d.f179620q.f13975a + "";
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 != null) {
                str = str2;
            }
        }
        objArr[0] = str;
        objArr[1] = this.f179872d.f179617n;
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = this.f179872d.f179614h;
        g0Var.d(14877, objArr);
    }

    public void W6() {
        if (this.f179873e) {
            return;
        }
        com.tencent.mm.autogen.events.JsapiResultEvent jsapiResultEvent = new com.tencent.mm.autogen.events.JsapiResultEvent();
        am.yh yhVar = jsapiResultEvent.f54449g;
        yhVar.f8461a = 4;
        yhVar.f8462b = getInput().getBoolean("intent_pay_end", false) ? -1 : 0;
        jsapiResultEvent.e();
        this.f179873e = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if ((r2 == 6 && r3.f179621r != null) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(boolean r26) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.X6(boolean):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5r;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f179885t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487769ps2);
        this.f179883r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kr9);
        this.f179884s = (android.widget.Button) findViewById(com.tencent.mm.R.id.kqp);
        showHomeBtn(false);
        enableBackMenu(false);
        java.lang.String string = getString(com.tencent.mm.R.string.f490441v5);
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = this.f179872d;
        if (bindCardOrder == null || com.tencent.mm.sdk.platformtools.t8.K0(bindCardOrder.f179611e)) {
            this.f179884s.setText(string);
        } else {
            this.f179884s.setText(this.f179872d.f179611e);
        }
        this.f179884s.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.n1(this));
        this.A = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.pdc);
        this.f179886u = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.o9w);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.o9y);
        this.f179887v = cdnImageView;
        cdnImageView.setUseSdcardCache(true);
        this.f179888w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o9v);
        this.f179889x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_0);
        this.f179891z = (android.widget.Button) findViewById(com.tencent.mm.R.id.o9t);
        this.f179890y = findViewById(com.tencent.mm.R.id.o9x);
        this.A.setVisibility(4);
        this.f179883r.setText(this.f179872d.f179612f);
        X6(true);
        this.A.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179872d.f179615i) || com.tencent.mm.sdk.platformtools.t8.K0(this.f179872d.f179616m)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kr_);
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder2 = this.f179872d;
        textView.setText(getString(com.tencent.mm.R.string.kgk, bindCardOrder2.f179615i, bindCardOrder2.f179616m));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "onActivityResult %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "do query pay arawrd");
            com.tencent.mm.plugin.wallet_core.ui.i6 i6Var = this.f179879n;
            java.lang.String str = i6Var.f180329a;
            java.lang.String str2 = i6Var.f180330b;
            java.lang.String str3 = i6Var.f180331c;
            java.lang.String str4 = i6Var.f180332d;
            long j17 = i6Var.f180335g;
            long j18 = i6Var.f180336h;
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = this.f179872d;
            java.lang.String str5 = bindCardOrder.f179614h;
            java.lang.String str6 = bindCardOrder.f179617n;
            int i19 = bindCardOrder.f179618o;
            doSceneProgress(new ss4.d0(str, str2, str3, str4, j17, j18, str5, str6, i19, i19));
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.BW_90));
            }
        }
        setContentViewVisibility(4);
        com.tencent.mm.wallet_core.a.g(this);
        this.f179874f = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        getInput().getInt("key_pay_type", -1);
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = (com.tencent.mm.plugin.wallet_core.model.BindCardOrder) getInput().getParcelable("key_bindcard_value_result");
        if (bindCardOrder == null) {
            bindCardOrder = new com.tencent.mm.plugin.wallet_core.model.BindCardOrder();
        }
        this.f179872d = bindCardOrder;
        setContentViewVisibility(0);
        initView();
        this.E = getProcess();
        this.f179883r.setText(this.f179872d.f179612f);
        V6(1);
        addSceneEndListener(1979);
        this.F.alive();
        this.D = true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        db5.e1.e(getContext(), getString(com.tencent.mm.R.string.ksp), getResources().getStringArray(com.tencent.mm.R.array.f478038am), "", new com.tencent.mm.plugin.wallet_core.ui.s1(this));
        return null;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.F.dead();
        removeSceneEndListener(1979);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.wallet_core.h hVar = this.E;
        if (hVar != null) {
            hVar.o(this, 0, bundle);
            return true;
        }
        finish();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", java.lang.Boolean.valueOf(this.D), this.f179881p, java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(this.C), this.f179878m);
        if (this.D) {
            this.D = false;
            return;
        }
        if (this.f179881p != null && this.C) {
            java.lang.String str = this.f179881p.f179620q.f13975a + "";
            java.lang.String str2 = this.f179881p.f179620q.f13977c + "";
            java.lang.String str3 = this.f179881p.f179620q.f13978d + "";
            java.lang.String str4 = this.f179881p.f179620q.f13979e + "";
            at4.u0 u0Var = this.f179881p.f179620q;
            long j17 = u0Var.f13976b;
            long j18 = u0Var.f13980f;
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = this.f179872d;
            java.lang.String str5 = bindCardOrder.f179614h;
            java.lang.String str6 = bindCardOrder.f179617n;
            int i17 = bindCardOrder.f179618o;
            doSceneProgress(new ss4.d0(str, str2, str3, str4, j17, j18, str5, str6, i17, i17));
            return;
        }
        if (!this.B || this.f179878m == null) {
            return;
        }
        java.lang.String str7 = this.f179872d.f179620q.f13975a + "";
        java.lang.String str8 = this.f179872d.f179620q.f13977c + "";
        java.lang.String str9 = this.f179872d.f179620q.f13978d + "";
        java.lang.String str10 = this.f179872d.f179620q.f13979e + "";
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder2 = this.f179872d;
        at4.u0 u0Var2 = bindCardOrder2.f179620q;
        long j19 = u0Var2.f13980f;
        long j27 = u0Var2.f13976b;
        java.lang.String str11 = bindCardOrder2.f179614h;
        java.lang.String str12 = bindCardOrder2.f179617n;
        int i18 = bindCardOrder2.f179618o;
        doSceneProgress(new ss4.d0(str7, str8, str9, str10, j19, j27, str11, str12, i18, i18));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ss4.d0) {
            if (i17 == 0 && i18 == 0) {
                ss4.d0 d0Var = (ss4.d0) m1Var;
                com.tencent.mm.plugin.wallet_core.ui.h6 h6Var = new com.tencent.mm.plugin.wallet_core.ui.h6(d0Var.f412032e);
                com.tencent.mm.plugin.wallet_core.ui.i6 i6Var = this.f179879n;
                java.util.HashMap hashMap = this.f179880o;
                java.lang.String str2 = d0Var.f412031d;
                if (i6Var != null) {
                    hashMap.put(str2, h6Var);
                    X6(false);
                    this.A.setVisibility(0);
                } else if (this.B) {
                    hashMap.put(str2, h6Var);
                    X6(false);
                    this.A.setVisibility(0);
                }
            }
        } else if (m1Var instanceof ss4.s) {
            if (i17 != 0 || i18 != 0) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = getString(com.tencent.mm.R.string.l0g);
                }
                db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.wallet_core.ui.t1(this));
                return true;
            }
            ss4.s sVar = (ss4.s) m1Var;
            java.lang.String str3 = sVar.f412130d;
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = this.f179881p;
            if (bindCardOrder != null && bindCardOrder.f179620q.f13975a == sVar.f412133g.f179620q.f13975a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "activityAwardState: %s", bindCardOrder);
                this.f179882q = str3;
                X6(false);
                this.A.setVisibility(0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(sVar.f412131e) && !"3".equals(str3)) {
                    this.f179891z.setText(sVar.f412131e);
                }
            }
            if (!"-1".equals(str3) && !"0".equals(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(sVar.f412132f)) {
                db5.e1.F(this, sVar.f412132f, "", true);
            } else if ("0".equals(str3)) {
                dp.a.makeText(this, !com.tencent.mm.sdk.platformtools.t8.K0(sVar.f412132f) ? sVar.f412132f : getString(com.tencent.mm.R.string.kuz), 0).show();
            }
            return true;
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
