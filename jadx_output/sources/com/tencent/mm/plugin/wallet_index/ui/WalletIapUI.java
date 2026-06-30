package com.tencent.mm.plugin.wallet_index.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletIapUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f181100s = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f181104g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.d f181106i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.e f181107m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Dialog f181108n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181109o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_index.ui.f f181110p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_index.ui.f f181111q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181112r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f181101d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f181102e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f181103f = 1003;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181105h = "0";

    public WalletIapUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f181109o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.1
            {
                this.__eventId = -1513748107;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent walletPayResultForAppbrandGameEvent) {
                com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent walletPayResultForAppbrandGameEvent2 = walletPayResultForAppbrandGameEvent;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(walletPayResultForAppbrandGameEvent2.f54966g.f7962b);
                am.t10 t10Var = walletPayResultForAppbrandGameEvent2.f54966g;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "walletPayResultListener onPayEnd payResult:%s, reqKey:%s,  comeFrom:%s,requestCode:%d", valueOf, t10Var.f7963c, java.lang.Integer.valueOf(t10Var.f7964d), java.lang.Integer.valueOf(t10Var.f7965e));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t10Var.f7963c) && t10Var.f7963c.equalsIgnoreCase("key_from_scene_appbrandgame") && t10Var.f7964d == 1) {
                    android.content.Intent intent = t10Var.f7961a;
                    com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI = com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.this;
                    if (intent == null || intent.getExtras() == null || t10Var.f7961a.getExtras().get("key_total_fee") == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "no payAmount");
                    } else {
                        java.lang.String obj = t10Var.f7961a.getExtras().get("key_total_fee").toString();
                        walletIapUI.f181105h = obj;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "has payAmount:%s", obj);
                    }
                    com.tencent.mm.plugin.wallet_index.ui.d dVar = walletIapUI.f181106i;
                    if (dVar == null || !dVar.c(walletIapUI, t10Var.f7965e, t10Var.f7962b, t10Var.f7961a)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletIapUI", "havn't handle user action");
                        android.content.Intent intent2 = new android.content.Intent();
                        nt4.f a17 = nt4.f.a(6);
                        intent2.putExtra("key_err_code", a17.f339823a);
                        intent2.putExtra("key_err_msg", a17.f339824b);
                        intent2.putExtra("key_launch_ts", com.tencent.mm.plugin.wallet_index.ui.c.f181139m);
                        walletIapUI.setResult(-1, intent2);
                        walletIapUI.finish();
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "FuncId %s,is not current request key || comeFrom:%s is not FINISH", "key_from_scene_appbrandgame", java.lang.Integer.valueOf(t10Var.f7964d));
                }
                return true;
            }
        };
        this.f181110p = new com.tencent.mm.plugin.wallet_index.ui.y(this);
        this.f181111q = new com.tencent.mm.plugin.wallet_index.ui.z(this);
        this.f181112r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletCloseProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.4
            {
                this.__eventId = -917791906;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletCloseProgressEvent walletCloseProgressEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "payListener callback to close progress");
                if (!(walletCloseProgressEvent instanceof com.tencent.mm.autogen.events.WalletCloseProgressEvent)) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.WalletIapUI", "mismatched event");
                    return false;
                }
                int i17 = com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.f181100s;
                com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.this.T6();
                return true;
            }
        };
    }

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "hideLoadingDialog!");
        android.app.Dialog dialog = this.f181108n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f181108n.dismiss();
        this.f181108n = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "finish");
        T6();
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onActivityResult resultCode : " + i18);
        if (intent == null || intent.getExtras() == null || intent.getExtras().get("key_total_fee") == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "no payAmount");
        } else {
            java.lang.String obj = intent.getExtras().get("key_total_fee").toString();
            this.f181105h = obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "has payAmount:%s", obj);
        }
        com.tencent.mm.plugin.wallet_index.ui.d dVar = this.f181106i;
        if (dVar == null || !dVar.c(this, i17, i18, intent)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletIapUI", "havn't handle user action");
            android.content.Intent intent2 = new android.content.Intent();
            nt4.f a17 = nt4.f.a(6);
            intent2.putExtra("key_err_code", a17.f339823a);
            intent2.putExtra("key_err_msg", a17.f339824b);
            intent2.putExtra("key_launch_ts", com.tencent.mm.plugin.wallet_index.ui.c.f181139m);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onCreate");
        com.tencent.mm.ui.bk.j0(this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(414, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.z.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, this);
        if (getIntent().getIntExtra("key_action_type", 200001) == 200001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "showLoadingDialog!");
            this.f181108n = com.tencent.mm.wallet_core.ui.b2.c(this, getString(com.tencent.mm.R.string.f490604zq), true, new com.tencent.mm.plugin.wallet_index.ui.a0(this));
        }
        this.f181104g = getIntent().getBooleanExtra("key_is_mini_program", false);
        if (getIntent().getBooleanExtra("key_request_fullscreen", false)) {
            getWindow().addFlags(1024);
        }
        com.tencent.mm.plugin.wallet_index.ui.e eVar = new com.tencent.mm.plugin.wallet_index.ui.e();
        this.f181107m = eVar;
        eVar.f181165n = this.f181104g;
        if (getIntent().getBooleanExtra("key_force_google", false) || c01.z1.y()) {
            this.f181106i = new com.tencent.mm.plugin.wallet_index.ui.c(this, this.f181107m, this.f181111q);
        } else {
            this.f181106i = new com.tencent.mm.plugin.wallet_index.ui.x0(this.f181107m, this.f181112r);
        }
        this.f181107m.f181164m = this.f181106i.a();
        this.f181109o.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onDestroy");
        T6();
        if (this.f181103f == 1003) {
            this.f181103f = 1001;
        }
        java.lang.String stringExtra = getIntent() != null ? getIntent().getStringExtra("key_appid") : "";
        int i17 = !(this.f181106i instanceof com.tencent.mm.plugin.wallet_index.ui.x0) ? 1 : 0;
        long F = (long) (com.tencent.mm.sdk.platformtools.t8.F(this.f181105h, 0.0d) * 100.0d);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "reportPaymentState report(%s), isMiniProgram : %b, appid %s, walletType %s, currentScene %s, currentState %s, payAmount %s, payamount %s", 15751, java.lang.Boolean.valueOf(this.f181104g), stringExtra, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f181102e), java.lang.Integer.valueOf(this.f181103f), this.f181105h, java.lang.Long.valueOf(F));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(15751, java.lang.Integer.valueOf(!this.f181104g ? 1 : 0), stringExtra, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f181102e), java.lang.Integer.valueOf(this.f181103f), this.f181105h, java.lang.Long.valueOf(F));
        g0Var.idkeyStat(1044L, this.f181103f - 1000, 1L, false);
        int i18 = this.f181103f;
        if (i18 == 1001) {
            g0Var.idkeyStat(1044L, this.f181102e + 4, 1L, false);
        } else if (i18 == 1002) {
            g0Var.idkeyStat(1044L, this.f181102e + 8, 1L, false);
        }
        com.tencent.mm.plugin.wallet_index.ui.d dVar = this.f181106i;
        if (dVar != null) {
            dVar.b(this);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(414, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.z.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, this);
        this.f181109o.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.modelbase.m1 m1Var;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onResume");
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "Handler jump");
        if (this.f181101d) {
            return;
        }
        this.f181101d = true;
        android.content.Intent intent = getIntent();
        if (intent.getIntExtra("key_action_type", 200001) == 200002) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
            this.f181102e = 3;
            this.f181106i.e(this, true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "start to doScene!");
        com.tencent.mm.plugin.wallet_index.ui.e eVar = this.f181107m;
        java.lang.String stringExtra = intent.getStringExtra("key_product_id");
        eVar.f181163l = stringExtra;
        ((java.util.ArrayList) eVar.f181162k).add(stringExtra);
        this.f181107m.f181159h = intent.getStringExtra("key_price");
        this.f181107m.f181160i = intent.getStringExtra("key_currency_type");
        java.lang.String stringExtra2 = intent.getStringExtra("key_ext_info");
        this.f181107m.f181156e = intent.getIntExtra("key_count", 1);
        java.lang.String stringExtra3 = intent.getStringExtra("key_appid");
        java.lang.String stringExtra4 = intent.getStringExtra("key_desc");
        java.lang.String stringExtra5 = intent.getStringExtra("key_busiid");
        this.f181107m.f181166o = intent.getStringExtra("key_virtual_pay_sign");
        this.f181107m.f181167p = intent.getStringExtra("key_attach");
        this.f181107m.f181168q = intent.getStringExtra("key_extInfo");
        this.f181107m.f181169r = intent.getIntExtra("key_wxAppScene", -1);
        this.f181107m.f181170s = intent.getIntExtra("key_wxAppRawScene", -1);
        com.tencent.mm.plugin.wallet_index.ui.e eVar2 = this.f181107m;
        int a17 = this.f181106i.a();
        if (eVar2.f181165n) {
            try {
                m1Var = new nt4.m(a17, stringExtra3, eVar2.f181159h, stringExtra4, eVar2.f181156e, eVar2.f181160i, 13, stringExtra5, eVar2.f181166o, eVar2.f181167p, eVar2.f181168q);
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IapData", e17, "NetSceneGetAndroidIapPackage Error priceLevel:" + eVar2.f181159h, new java.lang.Object[0]);
                m1Var = null;
            }
            i17 = -1;
        } else {
            java.lang.String str = eVar2.f181163l;
            java.lang.String str2 = eVar2.f181159h;
            java.lang.String str3 = eVar2.f181160i;
            int i18 = eVar2.f181156e;
            i17 = -1;
            m1Var = new com.tencent.mm.wallet_core.model.b1(str, str2, str3, i18, a17, stringExtra2);
        }
        if (m1Var != null) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(m1Var);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletIapUI", "getPrepareNetScene error netScene is null");
        this.f181103f = 1002;
        nt4.f a18 = nt4.f.a(8);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_err_code", a18.f339823a);
        intent2.putExtra("key_err_msg", a18.f339824b);
        setResult(i17, intent2);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        if (r1.f213878i == 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, com.tencent.mm.modelbase.m1 r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
