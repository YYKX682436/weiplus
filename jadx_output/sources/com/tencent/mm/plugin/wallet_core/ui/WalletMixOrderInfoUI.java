package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletMixOrderInfoUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f180004v = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f180005d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180006e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ws f180007f;

    /* renamed from: g, reason: collision with root package name */
    public int f180008g;

    /* renamed from: q, reason: collision with root package name */
    public int f180015q;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f180018t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f180019u;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f180009h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f180010i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180011m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f180012n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f180013o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f180014p = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f180016r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f180017s = null;

    public WalletMixOrderInfoUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f180018t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewCloseWindowEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.3
            {
                this.__eventId = -704562821;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewCloseWindowEvent webViewCloseWindowEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "WebViewCloseWindowEvent mean canceled by user");
                com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI = com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.this;
                if (walletMixOrderInfoUI.f180006e) {
                    com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                    java.lang.String str = walletMixOrderInfoUI.f180009h;
                    am.s10 s10Var = walletPayResultEvent.f54965g;
                    s10Var.f7864d = str;
                    s10Var.f7863c = 0;
                    walletPayResultEvent.e();
                    walletMixOrderInfoUI.finish();
                }
                return false;
            }
        };
        this.f180019u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.4
            {
                this.__eventId = -1345618028;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent walletGetPaidOrderDetailEvent) {
                boolean z17;
                com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent walletGetPaidOrderDetailEvent2 = walletGetPaidOrderDetailEvent;
                if (!(walletGetPaidOrderDetailEvent2 instanceof com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent)) {
                    return false;
                }
                dead();
                am.k10 k10Var = walletGetPaidOrderDetailEvent2.f54957g;
                java.lang.String str = k10Var.f7116a;
                com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI = com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.this;
                walletMixOrderInfoUI.f180010i = str;
                walletMixOrderInfoUI.f180011m = k10Var.f7117b;
                walletMixOrderInfoUI.f180012n = k10Var.f7118c;
                walletMixOrderInfoUI.f180013o = k10Var.f7119d;
                walletMixOrderInfoUI.f180014p = k10Var.f7120e;
                int i17 = k10Var.f7121f;
                walletMixOrderInfoUI.f180015q = i17;
                walletMixOrderInfoUI.f180016r = k10Var.f7122g;
                walletMixOrderInfoUI.f180017s = k10Var.f7123h;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "WalletGetPaidOrderDetailEvent callback：prepayId:%s, payScene：%s, reqKey:%s", walletMixOrderInfoUI.f180009h, java.lang.Integer.valueOf(i17), walletMixOrderInfoUI.f180014p);
                if (walletMixOrderInfoUI.W6(1)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "startOverseaWalletSuccPageUseCase is true, go kinda");
                } else {
                    if (walletMixOrderInfoUI.f180015q == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(walletMixOrderInfoUI.f180009h) && (com.tencent.mm.sdk.platformtools.t8.K0(walletMixOrderInfoUI.f180014p) || walletMixOrderInfoUI.f180014p.equals(walletMixOrderInfoUI.f180009h))) {
                        walletMixOrderInfoUI.doSceneForceProgress(new ws4.a(walletMixOrderInfoUI.f180010i, walletMixOrderInfoUI.f180011m, walletMixOrderInfoUI.f180012n, walletMixOrderInfoUI.f180013o, walletMixOrderInfoUI.f180014p, walletMixOrderInfoUI.f180015q, walletMixOrderInfoUI.f180016r, walletMixOrderInfoUI.f180017s));
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        walletMixOrderInfoUI.f180006e = false;
                        walletMixOrderInfoUI.U6(walletMixOrderInfoUI, walletMixOrderInfoUI.getString(com.tencent.mm.R.string.ktc), 0);
                    }
                }
                return true;
            }
        };
    }

    public final void U6(android.content.Context context, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "showErrorAlert");
        if (!this.f180005d) {
            com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent();
            webViewWillCloseWindowEvent.f54989g.f7689a = i17;
            webViewWillCloseWindowEvent.e();
        }
        com.tencent.mm.ui.widget.dialog.j0 G = db5.e1.G(context, str, "", false, new com.tencent.mm.plugin.wallet_core.ui.c5(this, i17));
        if (G != null) {
            G.setCancelable(false);
        }
    }

    public final void V6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        com.tencent.mm.wallet_core.ui.r1.U(getContext(), intent, 1);
        this.f180018t.alive();
    }

    public final boolean W6(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appid", this.f180010i);
        bundle.putString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, this.f180011m);
        bundle.putString("nonce_str", this.f180012n);
        bundle.putString("package", this.f180013o);
        bundle.putInt("input_pay_scene", this.f180015q);
        bundle.putString("sign_type", this.f180016r);
        bundle.putString("pay_sign", this.f180017s);
        bundle.putString("req_key", this.f180014p);
        bundle.putInt("origin_pay_scene", i17);
        bundle.putString("order_id", this.f180009h);
        bundle.putInt("retry_max_count", this.f180007f.f389408e);
        bundle.putInt("retry_interval_seconds", this.f180007f.f389407d);
        bundle.putString("retry_default_wording", this.f180007f.f389409f);
        return ((h45.q) i95.n0.c(h45.q.class)).startOverseaWalletSuccPageUseCase(this, bundle);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "finish");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d2d;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 0 && this.f180006e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "onActivityResult, mIsPending is true");
            this.f180019u.dead();
            com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
            java.lang.String str = this.f180009h;
            am.s10 s10Var = walletPayResultEvent.f54965g;
            s10Var.f7864d = str;
            s10Var.f7863c = 0;
            walletPayResultEvent.e();
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        r45.ws wsVar = new r45.ws();
        this.f180007f = wsVar;
        wsVar.f389408e = intent.getIntExtra("max_count", 3);
        this.f180007f.f389407d = intent.getIntExtra("inteval_time", 4);
        this.f180007f.f389409f = intent.getStringExtra("default_wording");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180007f.f389409f)) {
            this.f180007f.f389409f = getString(com.tencent.mm.R.string.kkk);
        }
        this.f180008g = this.f180007f.f389408e;
        boolean booleanExtra = intent.getBooleanExtra("is_jsapi_offline_pay", false);
        this.f180005d = booleanExtra;
        this.f180006e = true;
        if (!booleanExtra) {
            java.lang.String stringExtra = intent.getStringExtra("pay_gate_url");
            boolean booleanExtra2 = intent.getBooleanExtra("need_dialog", false);
            java.lang.String stringExtra2 = intent.getStringExtra("dialog_text");
            java.lang.String stringExtra3 = intent.getStringExtra("prepayId");
            this.f180009h = stringExtra3;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", " prepayId:%s ，need_dialog:%s", stringExtra3, java.lang.Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                db5.e1.u(this, stringExtra2, "", new com.tencent.mm.plugin.wallet_core.ui.a5(this, stringExtra), new com.tencent.mm.plugin.wallet_core.ui.b5(this)).setCancelable(false);
            } else {
                V6(stringExtra);
            }
            this.f180019u.alive();
            return;
        }
        this.f180010i = getIntent().getStringExtra("appId");
        this.f180011m = getIntent().getStringExtra("timeStamp");
        this.f180012n = getIntent().getStringExtra("nonceStr");
        this.f180013o = getIntent().getStringExtra("packageExt");
        this.f180014p = getIntent().getStringExtra("reqKey");
        this.f180015q = getIntent().getIntExtra("payScene", -1);
        this.f180016r = getIntent().getStringExtra("signtype");
        this.f180017s = getIntent().getStringExtra("paySignature");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "start query offline walletmix succ page, prepayId:%s, payScene：%s, reqKey:%s", this.f180009h, java.lang.Integer.valueOf(this.f180015q), this.f180014p);
        if (W6(2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "startOverseaWalletSuccPageUseCase is true, go kinda");
        } else if (this.f180015q == 2 && com.tencent.mm.sdk.platformtools.t8.K0(this.f180009h)) {
            doSceneForceProgress(new ws4.a(this.f180010i, this.f180011m, this.f180012n, this.f180013o, this.f180014p, this.f180015q, this.f180016r, this.f180017s));
        } else {
            U6(this, getString(com.tencent.mm.R.string.ktc), 0);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f180019u.dead();
        this.f180018t.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ws4.a)) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            this.f180006e = false;
            com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent();
            webViewWillCloseWindowEvent.f54989g.f7689a = -1;
            webViewWillCloseWindowEvent.e();
            com.tencent.mm.plugin.wallet_core.model.Orders orders = ((ws4.a) m1Var).f449208e;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", " go to WalletMixOrderInfoProxyUI");
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoProxyUI.class);
            intent.putExtra("key_orders", orders);
            intent.putExtra("prepayId", this.f180009h);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletMixOrderInfoUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/wallet_core/ui/WalletMixOrderInfoUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            setResult(-1);
            finish();
        } else {
            int i19 = this.f180008g;
            if (i19 != 0) {
                this.f180008g = i19 - 1;
                doSceneForceProgress(new ws4.a(this.f180010i, this.f180011m, this.f180012n, this.f180013o, this.f180009h, this.f180015q, this.f180016r, this.f180017s), this.f180007f.f389407d);
            } else {
                this.f180006e = false;
                if (str.isEmpty()) {
                    str = this.f180007f.f389409f;
                }
                U6(this, str, 0);
            }
        }
        return true;
    }
}
