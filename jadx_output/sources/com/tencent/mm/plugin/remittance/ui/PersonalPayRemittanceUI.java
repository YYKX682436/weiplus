package com.tencent.mm.plugin.remittance.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class PersonalPayRemittanceUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f157101t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f157102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f157103e;

    /* renamed from: f, reason: collision with root package name */
    public long f157104f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157105g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f157106h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f157107i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f157108m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f157109n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f157110o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f157111p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f157112q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f157113r = true;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157114s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BusiF2fPaySuccEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.1
        {
            this.__eventId = -1359897903;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.BusiF2fPaySuccEvent busiF2fPaySuccEvent) {
            com.tencent.mm.autogen.events.BusiF2fPaySuccEvent busiF2fPaySuccEvent2 = busiF2fPaySuccEvent;
            if (busiF2fPaySuccEvent2 == null) {
                return false;
            }
            am.e1 e1Var = busiF2fPaySuccEvent2.f54014g;
            if (!e1Var.f6518c) {
                return false;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(e1Var.f6521f);
            final com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI = com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.this;
            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "kinda callback data.pay_fail_reason :%s,local req_key:%s, pay key :%s", valueOf, personalPayRemittanceUI.f157107i, e1Var.f6516a);
            if (!personalPayRemittanceUI.f157107i.equals(e1Var.f6516a)) {
                return false;
            }
            personalPayRemittanceUI.hideProgress();
            personalPayRemittanceUI.hideLoading();
            int i17 = e1Var.f6521f;
            com.tencent.mm.ui.s2 s2Var = com.tencent.mm.ui.s2.FAIL;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            personalPayRemittanceUI.addSceneEndListener(5047);
                            personalPayRemittanceUI.doSceneProgress(new com.tencent.mm.plugin.remittance.model.f0(personalPayRemittanceUI.f157105g, personalPayRemittanceUI.f157106h, personalPayRemittanceUI.f157104f, personalPayRemittanceUI.f157108m), false);
                            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "goto busi result");
                            android.content.Intent intent = new android.content.Intent(personalPayRemittanceUI, (java.lang.Class<?>) com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.class);
                            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, personalPayRemittanceUI.f157102d);
                            intent.putExtra("key_trans_id", personalPayRemittanceUI.f157106h);
                            intent.putExtra("pay_scene", 65);
                            intent.putExtra("key_money", com.tencent.mm.wallet_core.ui.r1.j("" + personalPayRemittanceUI.f157104f, "100", 2, java.math.RoundingMode.HALF_UP));
                            intent.putExtra("key_succ_show_avatar_url", personalPayRemittanceUI.f157110o);
                            intent.putExtra("key_rcver_name", personalPayRemittanceUI.f157109n);
                            intent.putExtra("key_open_result_receiver", new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.6
                                @Override // android.os.ResultReceiver
                                public void onReceiveResult(int i18, android.os.Bundle bundle) {
                                    if (i18 == -1) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "pay success");
                                        com.tencent.mm.ui.s2 s2Var2 = com.tencent.mm.ui.s2.SUCCESS;
                                        int i19 = com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.f157101t;
                                        com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.this.V6(s2Var2, "");
                                    }
                                }
                            });
                            r45.yr yrVar = new r45.yr();
                            yrVar.f391310d = personalPayRemittanceUI.f157105g;
                            yrVar.f391311e = personalPayRemittanceUI.f157106h;
                            yrVar.f391312f = personalPayRemittanceUI.f157104f;
                            yrVar.f391313g = personalPayRemittanceUI.f157108m;
                            try {
                                intent.putExtra("AfterPlaceOrderCommReqC2C", yrVar.toByteArray());
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PersonalPayRemittanceUI", e17, "", new java.lang.Object[0]);
                            }
                            personalPayRemittanceUI.startActivityForResult(intent, 1);
                        } else if (i17 != 4) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "unknown pay failreason");
                            com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.U6(personalPayRemittanceUI);
                            personalPayRemittanceUI.V6(s2Var, "pay fail");
                        }
                        return true;
                    }
                }
                com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.U6(personalPayRemittanceUI);
                personalPayRemittanceUI.V6(com.tencent.mm.ui.s2.CANCEL, "");
                return true;
            }
            com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.U6(personalPayRemittanceUI);
            personalPayRemittanceUI.V6(s2Var, "pay fail");
            return true;
        }
    };

    public static void U6(com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI) {
        personalPayRemittanceUI.addSceneEndListener(5003);
        personalPayRemittanceUI.doSceneProgress(new com.tencent.mm.plugin.remittance.model.e0(personalPayRemittanceUI.f157105g, personalPayRemittanceUI.f157106h, personalPayRemittanceUI.f157104f, personalPayRemittanceUI.f157108m), false);
    }

    public final void V6(java.lang.Enum r47, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "setActivityResultData result :%s , errmsg : %s", r47, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_pay_result", r47);
        intent.putExtra("key_result_error_msg", str);
        setResult(-1, intent);
        finish();
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "showErrorDialog,errMsg:%s", str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(false);
        u1Var.m(com.tencent.mm.R.string.ke6);
        u1Var.l(new com.tencent.mm.plugin.remittance.ui.o(this, str2));
        u1Var.q(false);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
        if (j0Var != null) {
            this.f157112q = j0Var;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157111p;
        if (z2Var != null) {
            z2Var.B();
            this.f157111p = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        V6(com.tencent.mm.ui.s2.CANCEL, "");
        super.onBackPressed();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onCreate（）");
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f157102d = getIntent().getStringExtra("key_app_id");
        java.lang.String stringExtra = getIntent().getStringExtra("out_prepay_id");
        this.f157103e = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "app_id:%s，out_prepay_id：%s", this.f157102d, stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157103e)) {
            V6(com.tencent.mm.ui.s2.FAIL, "out_prepay_id is empty");
        }
        addSceneEndListener(4912);
        doSceneProgress(new com.tencent.mm.plugin.remittance.model.h0(this.f157102d, this.f157103e), true);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onDestroy()");
        super.onDestroy();
        this.f157114s.dead();
        removeSceneEndListener(4912);
        removeSceneEndListener(4304);
        removeSceneEndListener(5003);
        removeSceneEndListener(5047);
        removeSceneEndListener(4587);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onPause()");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onResume()");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.h0) {
            hideProgress();
            hideLoading();
            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetSceneC2CRequestPayment");
            if (i17 == 0 && i18 == 0) {
                r45.lr5 lr5Var = ((com.tencent.mm.plugin.remittance.model.h0) m1Var).f156851f;
                if (lr5Var == null) {
                    lr5Var = new r45.lr5();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CRequestPayment on SceneEnd ok，retcode:%s, retMsg：%s", java.lang.Integer.valueOf(lr5Var.f379783d), lr5Var.f379784e);
                if (lr5Var.f379783d == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "showHalfDialog：res.title：%s,res.head_img：%s，res.rcvr_info：%s，res.total_amount：%s，res.ok_button_wording：%s", lr5Var.f379785f, lr5Var.f379786g, lr5Var.f379787h, java.lang.Long.valueOf(lr5Var.f379788i), lr5Var.f379789m);
                    this.f157111p = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 3);
                    android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c9i, null);
                    ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.aa_)).setOnClickListener(new com.tencent.mm.plugin.remittance.ui.m(this));
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b4q);
                    textView.setText(lr5Var.f379785f);
                    android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c9h, null);
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    this.f157111p.s(inflate);
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate2.findViewById(com.tencent.mm.R.id.b4n);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(lr5Var.f379786g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "res.head_img == null");
                    } else {
                        cdnImageView.setRoundCorner(true);
                        cdnImageView.setRoundCornerRate(0.1f);
                        cdnImageView.setUrl(lr5Var.f379786g);
                        this.f157110o = lr5Var.f379786g;
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.b4p)).setText(lr5Var.f379787h);
                    this.f157109n = lr5Var.f379787h;
                    android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.b4o);
                    this.f157104f = lr5Var.f379788i;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(getString(com.tencent.mm.R.string.i0r));
                    sb6.append(com.tencent.mm.wallet_core.ui.r1.j("" + lr5Var.f379788i, "100", 2, java.math.RoundingMode.HALF_UP));
                    textView2.setText(sb6.toString());
                    this.f157111p.j(inflate2);
                    this.f157111p.y(lr5Var.f379789m);
                    this.f157111p.x(0);
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157111p;
                    z2Var.F = new com.tencent.mm.plugin.remittance.ui.n(this);
                    z2Var.C();
                } else {
                    W6(lr5Var.f379784e, "request payment fail.");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd faile show error dialog ");
                W6(str, "request payment fail.");
            }
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.g0)) {
            if (m1Var instanceof com.tencent.mm.plugin.remittance.model.e0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetScenePersonalPayCancelPay");
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetSceneC2CPlaceOrder");
        if (i17 == 0 && i18 == 0) {
            r45.fs fsVar = ((com.tencent.mm.plugin.remittance.model.g0) m1Var).f156826f;
            if (fsVar == null) {
                fsVar = new r45.fs();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CPlaceOrder on SceneEnd ok，retcode:%s, retMsg：%s", java.lang.Integer.valueOf(fsVar.f374577d), fsVar.f374578e);
            if (fsVar.f374577d != 0) {
                hideProgress();
                hideLoading();
                W6(fsVar.f374578e, "place order fail.");
            } else {
                if (fsVar.f374579f != null) {
                    hideProgress();
                    hideLoading();
                    com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "response.jump_remind != null");
                    com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f157111p;
                    if (z2Var2 != null) {
                        z2Var2.B();
                        this.f157111p = null;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_result_pay_result", com.tencent.mm.ui.s2.FAIL);
                    intent.putExtra("key_result_error_msg", "intercept by jump remind");
                    setResult(-1, intent);
                    com.tencent.mm.wallet_core.model.p0 d17 = com.tencent.mm.wallet_core.model.p0.d(fsVar.f374579f);
                    d17.f213971j = false;
                    d17.g(this, new com.tencent.mm.plugin.remittance.ui.l(this));
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "startPay");
                this.f157105g = fsVar.f374580g;
                this.f157106h = fsVar.f374582i;
                this.f157108m = fsVar.f374584n;
                java.lang.String str2 = fsVar.f374581h;
                this.f157107i = str2;
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = str2;
                payInfo.L = 1;
                payInfo.f192109e = 65;
                payInfo.f192111g = getIntent().getIntExtra("payChannel", 0);
                android.os.Bundle bundle = new android.os.Bundle();
                payInfo.f192122u = bundle;
                bundle.putString("cashier_desc", fsVar.f374583m);
                payInfo.f192122u.putString("personalpay_order_id", fsVar.f374580g);
                payInfo.f192122u.putString("trans_id", fsVar.f374582i);
                payInfo.f192122u.putString("placeorder_ext", fsVar.f374584n);
                ((h45.q) i95.n0.c(h45.q.class)).startSNSPay(this, payInfo);
            }
        } else {
            hideProgress();
            hideLoading();
            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CPlaceOrder on SceneEnd faile show error dialog ");
            W6(str, "place order fail.");
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged");
        if (this.f157113r && (z2Var = this.f157111p) != null && !z2Var.h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged：mHalfBottomDialog isShowHalfDialog %s, finish Activity", java.lang.Boolean.valueOf(this.f157111p.h()));
            this.f157111p = null;
            V6(com.tencent.mm.ui.s2.CANCEL, "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 3, this.f157102d, 0);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f157112q;
        if (j0Var != null && !j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged isShowing:%s,finish Activity", java.lang.Boolean.valueOf(this.f157112q.isShowing()));
            this.f157112q = null;
            V6(com.tencent.mm.ui.s2.FAIL, "dialog fail");
        }
        super.onWindowFocusChanged(z17);
    }
}
