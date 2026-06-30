package com.tencent.mm.plugin.wallet_index.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletBrandUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.o f181084f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.WalletJsapiData f181086h;

    /* renamed from: m, reason: collision with root package name */
    public int f181088m;

    /* renamed from: o, reason: collision with root package name */
    public int f181090o;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181096u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181097v;

    /* renamed from: d, reason: collision with root package name */
    public boolean f181082d = false;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f181083e = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f181085g = null;

    /* renamed from: i, reason: collision with root package name */
    public final int f181087i = hashCode() & 65535;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181089n = "";

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.kinda.gen.VoidBoolStringI32StringCallback f181091p = null;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.kinda.gen.VoidCallback f181092q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f181093r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f181094s = 0;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Intent f181095t = null;

    public WalletBrandUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f181096u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.2
            {
                this.__eventId = 520089918;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
                am.s10 s10Var = walletPayResultEvent2.f54965g;
                if (s10Var.f7865e) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WalletBrandUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    return false;
                }
                android.content.Intent intent = s10Var.f7861a;
                if (intent != null && intent.getIntExtra("payScene", 0) == 8) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WalletBrandUI", "WalletPayResultEvent is from kinda offline pay");
                    return false;
                }
                am.s10 s10Var2 = walletPayResultEvent2.f54965g;
                int i17 = s10Var2.f7866f;
                com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.this;
                if (i17 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "comeFrom walletmix, finish");
                    walletBrandUI.setResult(s10Var2.f7863c, s10Var2.f7861a);
                    walletBrandUI.finish();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onPayEnd payResult:%s, reqKey:%s,  comeFrom:%s", java.lang.Integer.valueOf(s10Var2.f7863c), s10Var2.f7864d, java.lang.Integer.valueOf(s10Var2.f7866f));
                com.tencent.mm.plugin.wallet_index.ui.o oVar = walletBrandUI.f181084f;
                if (oVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onPayEnd getGenPrepayFuncId:%d, getGenPrepayReqKey:%s,appbrandScene:%s", java.lang.Integer.valueOf(oVar.a()), walletBrandUI.f181084f.c(), walletBrandUI.f181089n);
                }
                if (walletBrandUI.f181084f.a() != 398) {
                    walletBrandUI.setResult(s10Var2.f7863c, s10Var2.f7861a);
                    if (s10Var2.f7866f != 2) {
                        walletBrandUI.V6(s10Var2.f7863c, s10Var2.f7861a);
                    }
                    walletBrandUI.finish();
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(s10Var2.f7864d) || !s10Var2.f7864d.equalsIgnoreCase(walletBrandUI.f181084f.c()) || s10Var2.f7866f != 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "FuncId %d,is not current request key || comeFrom:%s is not FINISH", java.lang.Integer.valueOf(walletBrandUI.f181084f.a()), java.lang.Integer.valueOf(s10Var2.f7866f));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(s10Var2.f7864d) && s10Var2.f7864d.equalsIgnoreCase(walletBrandUI.f181084f.c()) && s10Var2.f7863c == 0) {
                        walletBrandUI.finish();
                    }
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(walletBrandUI.f181089n) || !walletBrandUI.f181089n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                    walletBrandUI.setResult(s10Var2.f7863c, s10Var2.f7861a);
                    walletBrandUI.V6(s10Var2.f7863c, s10Var2.f7861a);
                    walletBrandUI.finish();
                } else {
                    walletBrandUI.U6(s10Var2.f7863c, s10Var2.f7861a);
                }
                return true;
            }
        };
        this.f181097v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletCloseProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.3
            {
                this.__eventId = -917791906;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletCloseProgressEvent walletCloseProgressEvent) {
                com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.this;
                android.app.Dialog dialog = walletBrandUI.f181083e;
                if (dialog == null) {
                    return true;
                }
                dialog.dismiss();
                walletBrandUI.f181083e = null;
                return true;
            }
        };
    }

    public final boolean T6() {
        java.lang.String substring;
        com.tencent.mm.wallet_core.b.a().getClass();
        java.lang.String str = this.f181086h.f192134i;
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("prepay_id=");
        java.lang.String str2 = null;
        if (indexOf != -1 && (substring = str.substring(indexOf + 10)) != null) {
            int indexOf2 = substring.indexOf("&");
            str2 = indexOf2 == -1 ? substring : substring.substring(0, indexOf2);
        }
        if (str2 == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "isPrefixDisableKinda: %s", str2);
        if (str2.startsWith("tax_")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "prepay_id starts With tax_");
            com.tencent.mm.wallet_core.b.a().getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "open KindaTaxPaySwitch");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "isPrefixDisableKinda :%s", java.lang.Boolean.FALSE);
        return true;
    }

    public final void U6(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "sendMiniAppPayResult result:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent walletPayResultForAppbrandGameEvent = new com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent();
        am.t10 t10Var = walletPayResultForAppbrandGameEvent.f54966g;
        t10Var.f7961a = intent;
        t10Var.f7964d = 1;
        t10Var.f7963c = "key_from_scene_appbrandgame";
        t10Var.f7962b = i17;
        t10Var.f7965e = this.f181090o;
        walletPayResultForAppbrandGameEvent.e();
    }

    public void V6(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "sendPaySuccessAheadCallbackResult result:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = this.f181086h;
        if (walletJsapiData == null || walletJsapiData.X == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (intent.getExtras() == null) {
            intent.putExtras(new android.os.Bundle());
        }
        this.f181086h.X.b(i17, intent.getExtras());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onFinish");
        super.finish();
        if (getIntent().getBooleanExtra("needResultEvent", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "publish jsapi pay end event");
            com.tencent.mm.autogen.events.JSAPIPayEndResultEvent jSAPIPayEndResultEvent = new com.tencent.mm.autogen.events.JSAPIPayEndResultEvent();
            int intExtra = getIntent().getIntExtra("requestCode", 0);
            am.rh rhVar = jSAPIPayEndResultEvent.f54442g;
            rhVar.f7816c = intExtra;
            rhVar.f7814a = this.f181095t;
            rhVar.f7815b = this.f181094s;
            jSAPIPayEndResultEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onActivityResultresultCode : " + i18 + " requestCode: " + i17);
        if (i18 == -1 && i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "get result to callback? " + intent.getStringExtra("test"));
        }
        if (!this.f181093r || i17 != 4 || intent == null) {
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onActivityResult For Face Action,resultCode : " + i18);
        boolean z17 = false;
        int intExtra = intent.getIntExtra("err_code", 0);
        int intExtra2 = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra3 = intent.getIntExtra("countFace", 0);
        long longExtra = intent.getLongExtra("totalTime", 0L);
        int intExtra4 = intent.getIntExtra("err_type", 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "errCode： " + intExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "scene： " + intExtra2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "countFace： " + intExtra3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "totalTime： " + longExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "errorType： " + intExtra4);
        if (i18 == -1) {
            if (this.f181091p == null || intent.getExtras() == null) {
                return;
            }
            this.f181091p.call(false, intent.getExtras().getString("token"), intExtra, "");
            this.f181091p = null;
            return;
        }
        if (this.f181091p != null && intent.getExtras() != null) {
            java.lang.String string = intent.getExtras().getString("click_other_verify_btn");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && string.equalsIgnoreCase("yes")) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "isClickOtherVerify: %s", string);
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "check face failed, click other verify");
                this.f181091p.call(true, "", intExtra, "");
                this.f181091p = null;
            }
        }
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "resultCode：RESULT_CANCELED");
            com.tencent.kinda.gen.VoidCallback voidCallback = this.f181092q;
            if (voidCallback != null) {
                voidCallback.call();
                this.f181092q = null;
            }
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181086h = (com.tencent.mm.pluginsdk.wallet.WalletJsapiData) getIntent().getParcelableExtra("WalletJsapiData");
        if (getWindow() != null) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
        }
        if (this.f181086h == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBrandUI", "no jsapi data");
            finish();
            return;
        }
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).Ai();
        cu5.b.b();
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = this.f181086h;
        java.lang.String str = walletJsapiData.F;
        if (str != null) {
            this.f181089n = str;
        }
        this.f181088m = walletJsapiData.f192142t;
        if (this.f181089n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
            com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData2 = this.f181086h;
            this.f181090o = walletJsapiData2.f192143u;
            walletJsapiData2.f192143u = 0;
        }
        com.tencent.mm.wallet_core.model.n1.f213951a = java.lang.System.currentTimeMillis();
        int i17 = this.f181086h.A;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onCreate appbrandScene:%s,payScene:%d,requestCode:%d", this.f181089n, java.lang.Integer.valueOf(this.f181088m), java.lang.Integer.valueOf(this.f181090o));
        if (c01.z1.I()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hy: do pay with payu");
            this.f181084f = new com.tencent.mm.plugin.wallet_index.ui.u(this);
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hy: do pay with h5");
            this.f181084f = new com.tencent.mm.plugin.wallet_index.ui.l(this);
        } else if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "do pay with mall");
            this.f181084f = new com.tencent.mm.plugin.wallet_index.ui.x(this);
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "do pay with component");
            this.f181084f = new com.tencent.mm.plugin.wallet_index.ui.t(this);
        } else if (T6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "do pay with kinda");
            this.f181084f = new com.tencent.mm.plugin.wallet_index.ui.r(this);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hy: do pay with tenpay");
            this.f181084f = new com.tencent.mm.plugin.wallet_index.ui.w(this);
        }
        this.f181096u.alive();
        this.f181097v.alive();
        if (this.f181084f instanceof com.tencent.mm.plugin.wallet_index.ui.r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onCreate: do pay with kinda");
        } else {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(this.f181084f.a(), this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onCreate " + hashCode());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onDestroy");
        super.onDestroy();
        if (this.f181084f instanceof com.tencent.mm.plugin.wallet_index.ui.r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onDestroy: do pay with kinda");
        } else {
            gm0.j1.i();
            gm0.j1.n().f273288b.q(this.f181084f.a(), this);
        }
        this.f181096u.dead();
        this.f181097v.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onRestoreInstanceState " + hashCode());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onResume");
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "Handler jump intercept = %b,taskid = %d,parentName = %s", java.lang.Boolean.valueOf(this.f181082d), java.lang.Integer.valueOf(getTaskId()), getCallingActivity());
        if (this.f181082d) {
            return;
        }
        this.f181082d = true;
        this.f181085g = this.f181084f.b();
        android.app.Dialog dialog = this.f181083e;
        if (dialog != null) {
            dialog.dismiss();
            this.f181083e = null;
        }
        if (T6() || this.f181086h.A == 4) {
            return;
        }
        this.f181083e = com.tencent.mm.wallet_core.ui.b2.i(this, true, false, new com.tencent.mm.plugin.wallet_index.ui.k(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "onSaveInstanceState " + hashCode());
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hy: brandui on scene end. errType: %d, errCode: %d, errMsg:%s scene %s _scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var, this.f181085g);
        if (m1Var.getType() == this.f181084f.a() && m1Var == this.f181085g) {
            this.f181084f.onSceneEnd(i17, i18, str, m1Var);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.f181083e;
        if (dialog != null) {
            dialog.dismiss();
            this.f181083e = null;
        }
    }
}
