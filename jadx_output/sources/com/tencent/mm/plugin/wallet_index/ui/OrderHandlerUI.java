package com.tencent.mm.plugin.wallet_index.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class OrderHandlerUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181062d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181063e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelpay.PayReq f181064f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelpay.PayResp f181065g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelpay.PayReq.Options f181066h;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f181072q;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181078w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181079x;

    /* renamed from: i, reason: collision with root package name */
    public boolean f181067i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f181068m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181069n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f181070o = false;

    /* renamed from: p, reason: collision with root package name */
    public long f181071p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f181073r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f181074s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f181075t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f181076u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f181077v = false;

    public OrderHandlerUI() {
        this.f181062d = "MicroMsg.OrderHandlerUI";
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f181078w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.1
            {
                this.__eventId = 520089918;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
                com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI orderHandlerUI = com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.this;
                if (walletPayResultEvent2 == null) {
                    com.tencent.mars.xlog.Log.f(orderHandlerUI.f181062d, "event == null!!!");
                } else {
                    am.s10 s10Var = walletPayResultEvent2.f54965g;
                    if (s10Var.f7865e) {
                        com.tencent.mars.xlog.Log.f(orderHandlerUI.f181062d, "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    } else {
                        orderHandlerUI.f181067i = true;
                        java.lang.String str = orderHandlerUI.f181062d;
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(s10Var.f7863c);
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(orderHandlerUI.f181070o);
                        java.lang.String str2 = orderHandlerUI.f181072q;
                        java.lang.String str3 = s10Var.f7864d;
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(s10Var.f7862b);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e(str, "onPayEnd, isOk = %s notifyPay %s reqKey %s %s, manualresult %s, from %s", valueOf, valueOf2, str2, str3, valueOf3, com.tencent.mm.sdk.platformtools.z3.b(true));
                        if (!orderHandlerUI.f181070o) {
                            int i17 = s10Var.f7862b;
                            if (i17 == 1000) {
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(s10Var.f7864d) && s10Var.f7864d.equals(orderHandlerUI.f181072q)) {
                                    orderHandlerUI.finish();
                                }
                            } else if (i17 != 1001) {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(s10Var.f7864d) || s10Var.f7864d.equals(orderHandlerUI.f181072q)) {
                                    if (s10Var.f7863c == -1) {
                                        com.tencent.mm.opensdk.modelpay.PayResp payResp = orderHandlerUI.f181065g;
                                        payResp.errCode = 0;
                                        if (orderHandlerUI.f181077v) {
                                            payResp.returnKey = orderHandlerUI.f181069n;
                                        } else {
                                            android.content.Intent intent = s10Var.f7861a;
                                            if (intent != null) {
                                                android.os.Bundle extras = intent.getExtras();
                                                java.lang.String string = extras.getString("intent_pay_app_url");
                                                orderHandlerUI.f181069n = extras.getString("intent_wap_pay_jump_url");
                                                orderHandlerUI.f181065g.returnKey = string;
                                            }
                                        }
                                    } else {
                                        orderHandlerUI.f181065g.errCode = -2;
                                    }
                                    if (orderHandlerUI.f181068m == 1) {
                                        orderHandlerUI.X6(orderHandlerUI, orderHandlerUI.f181069n);
                                    } else {
                                        com.tencent.mm.plugin.wallet_index.ui.j.a(orderHandlerUI, orderHandlerUI.f181063e, orderHandlerUI.f181065g, orderHandlerUI.f181066h);
                                    }
                                    orderHandlerUI.f181070o = true;
                                    orderHandlerUI.finish();
                                } else {
                                    com.tencent.mars.xlog.Log.e(orderHandlerUI.f181062d, "pass notify this req1 %s req2 %s", s10Var.f7864d, orderHandlerUI.f181072q);
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f181079x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaGotoExternAppEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.2
            {
                this.__eventId = -1268509959;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KindaGotoExternAppEvent kindaGotoExternAppEvent) {
                com.tencent.mm.autogen.events.KindaGotoExternAppEvent kindaGotoExternAppEvent2 = kindaGotoExternAppEvent;
                com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI orderHandlerUI = com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.this;
                java.lang.String str = orderHandlerUI.f181062d;
                am.fi fiVar = kindaGotoExternAppEvent2.f54456g;
                com.tencent.mars.xlog.Log.i(str, "KindaGotoExternAppEventCallback event.data.returnKey:%s, event.data.errcode：%d", fiVar.f6679b, java.lang.Integer.valueOf(fiVar.f6678a));
                com.tencent.mm.opensdk.modelpay.PayResp payResp = orderHandlerUI.f181065g;
                am.fi fiVar2 = kindaGotoExternAppEvent2.f54456g;
                payResp.returnKey = fiVar2.f6679b;
                payResp.errCode = fiVar2.f6678a;
                com.tencent.mm.plugin.wallet_index.ui.j.a(orderHandlerUI, orderHandlerUI.f181063e, payResp, orderHandlerUI.f181066h);
                orderHandlerUI.finish();
                return true;
            }
        };
        java.lang.String str = "MicroMsg.OrderHandlerUI@" + hashCode();
        this.f181062d = str;
        com.tencent.mars.xlog.Log.i(str, "OrderHandlerUI constructor");
    }

    public final void T6(int i17, java.lang.String str, boolean z17) {
        if (this.f181068m != 1) {
            com.tencent.mm.plugin.wallet_index.ui.j.a(this, this.f181063e, this.f181065g, this.f181066h);
            finish();
        } else if (!android.text.TextUtils.isEmpty(this.f181069n) || !z17) {
            X6(this, this.f181069n);
            finish();
        } else {
            setContentViewVisibility(0);
            if (android.text.TextUtils.isEmpty(str)) {
                str = getString(com.tencent.mm.R.string.l0g);
            }
            db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.wallet_index.ui.i(this));
        }
    }

    public final java.lang.String U6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_app_packagename_safe");
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        java.lang.String str = !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? stringExtra : stringExtra2;
        com.tencent.mars.xlog.Log.i(this.f181062d, "getAppPayPackageName new：%s，old：%s,final：%s", stringExtra, stringExtra2, str);
        return str;
    }

    public final void V6() {
        h45.f0 f0Var;
        if (!((h45.q) i95.n0.c(h45.q.class)).canOpenKindaCashier(this)) {
            db5.e1.y(this, getString(com.tencent.mm.R.string.knf), "", getString(com.tencent.mm.R.string.apu), new com.tencent.mm.plugin.wallet_index.ui.g(this));
            return;
        }
        synchronized (h45.f0.class) {
            f0Var = h45.e0.f278942a;
        }
        java.lang.Object obj = java.lang.Boolean.FALSE;
        java.util.HashMap hashMap = f0Var.f278944a;
        if (hashMap.containsKey("key_pay_offline_is_auth_doing")) {
            obj = hashMap.get("key_pay_offline_is_auth_doing");
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            db5.e1.y(this, getString(com.tencent.mm.R.string.knf), "", getString(com.tencent.mm.R.string.apu), new com.tencent.mm.plugin.wallet_index.ui.h(this));
            return;
        }
        com.tencent.mm.autogen.events.PayLoopInterruptEvent payLoopInterruptEvent = new com.tencent.mm.autogen.events.PayLoopInterruptEvent();
        payLoopInterruptEvent.f54610g.f6481a = 1;
        payLoopInterruptEvent.e();
    }

    public final com.tencent.mm.opensdk.modelpay.PayReq W6() {
        com.tencent.mm.opensdk.modelpay.PayReq jointPayReq = com.tencent.mm.sdk.platformtools.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new com.tencent.mm.opensdk.modelpay.WXJointPay.JointPayReq() : new com.tencent.mm.opensdk.modelpay.PayReq();
        jointPayReq.fromBundle(com.tencent.mm.sdk.platformtools.c2.e(getIntent()));
        return jointPayReq;
    }

    public final void X6(android.content.Context context, java.lang.String str) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e(this.f181062d, "startOuterApp context == null");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e(this.f181062d, "startOuterApp callbackUrl is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f181062d, "startOuterApp callbackUrl is " + str);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.addFlags(268435456);
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI", "startOuterApp", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI", "startOuterApp", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f181062d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str = this.f181062d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f181076u);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "finish hasFinish %s %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        if (this.f181076u) {
            return;
        }
        this.f181076u = true;
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c8t;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f181062d, "onActivityResult resp %s, onPayEndCalled %s", this.f181065g, java.lang.Boolean.valueOf(this.f181067i));
        if (intent != null) {
            int intExtra = intent.getIntExtra("key_pay_reslut_type", 0);
            if (intExtra == 1000) {
                com.tencent.mars.xlog.Log.i(this.f181062d, "onActivityResult resp %s, onPayEndCalled %s payResultType %s", this.f181065g, java.lang.Boolean.valueOf(this.f181067i), java.lang.Integer.valueOf(intExtra));
                finish();
                return;
            } else if (intExtra == 1001) {
                return;
            }
        }
        if (this.f181065g == null || this.f181067i) {
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f181062d, "onActivityResult, onPayEnd not called");
        this.f181065g.errCode = -2;
        T6(0, "", false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i(this.f181062d, "onConfigurationChanged");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = "MicroMsg.OrderHandlerUI@" + hashCode();
        this.f181062d = str;
        com.tencent.mars.xlog.Log.i(str, "onCreate");
        this.f181071p = getIntent().getLongExtra("wallet_pay_key_check_time", -1L);
        setContentViewVisibility(8);
        com.tencent.mm.wallet_core.model.n1.f213951a = java.lang.System.currentTimeMillis();
        getController().G0(0);
        this.f181078w.alive();
        this.f181079x.alive();
        com.tencent.mm.wallet_core.b.a().getClass();
        this.f181073r = true;
        this.f181074s = true;
        com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
        a17.getClass();
        this.f181075t = a17.d(e42.d0.clicfg_kinda_sns_app_pay_open_android, false);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).Ai();
        cu5.b.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f181062d, "onDestroy");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(397, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2655, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX, this);
        this.f181078w.dead();
        this.f181079x.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i(this.f181062d, "onNewIntent");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f181062d, "onPause");
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        com.tencent.mars.xlog.Log.i(this.f181062d, "onRestart");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:64|(2:66|(6:70|(1:72)(1:81)|(1:74)(1:80)|(1:76)(1:79)|77|78))|82|(1:84)(1:165)|85|(2:87|(6:89|(1:91)(1:100)|(1:93)(1:99)|(1:95)(1:98)|96|97)(2:101|(6:103|(1:105)(1:114)|(1:107)(1:113)|(1:109)(1:112)|110|111)(1:115)))(2:162|(11:164|117|118|119|121|122|123|124|(1:126)|127|(6:133|(3:135|(1:146)|(2:140|141))|147|(2:149|(1:151)(2:152|(1:154)))|155|156)(2:131|132)))|116|117|118|119|121|122|123|124|(0)|127|(1:129)|133|(0)|147|(0)|155|156) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cb, code lost:
    
        r3 = 0;
        com.tencent.mars.xlog.Log.printErrStackTrace(r28.f181062d, r0, "", new java.lang.Object[0]);
        r0 = r15;
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ca, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.onResume():void");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 397 || m1Var.getType() == 2655 || m1Var.getType() == 283) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
            if (this.f181068m == 1) {
                payInfo.f192109e = 36;
            } else {
                payInfo.f192109e = 2;
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.q(m1Var.getType(), this);
            com.tencent.mars.xlog.Log.i(this.f181062d, "onSceneEnd, errType = " + i17 + ", errCode = " + i18);
            com.tencent.mm.protobuf.f fVar = ((nt4.n) m1Var).f339847e.f70711b.f70700a;
            r45.s55 s55Var = (r45.s55) fVar;
            this.f181069n = s55Var == null ? null : s55Var.f385524h;
            if (i17 == 4 && i18 == -5) {
                com.tencent.mars.xlog.Log.e(this.f181062d, "onSceneEnd, auth access denied");
                this.f181065g.errCode = -1;
                T6(i18, str, true);
                int i19 = payInfo.f192109e;
                com.tencent.mm.opensdk.modelpay.PayReq payReq = this.f181064f;
                com.tencent.mm.wallet_core.model.a2.b(i19, payReq != null ? payReq.prepayId : "", i18);
                return;
            }
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e(this.f181062d, "onSceneEnd,  PayAuthApp is failed!");
                this.f181065g.errCode = -1;
                T6(i18, str, true);
                int i27 = payInfo.f192109e;
                com.tencent.mm.opensdk.modelpay.PayReq payReq2 = this.f181064f;
                com.tencent.mm.wallet_core.model.a2.b(i27, payReq2 != null ? payReq2.prepayId : "", i18);
                return;
            }
            r45.s55 s55Var2 = (r45.s55) fVar;
            int i28 = s55Var2 == null ? -1 : s55Var2.f385521e;
            r45.s55 s55Var3 = (r45.s55) fVar;
            java.lang.String str2 = s55Var3 == null ? null : s55Var3.f385522f;
            r45.s55 s55Var4 = (r45.s55) fVar;
            java.lang.String str3 = s55Var4 == null ? null : s55Var4.f385523g;
            r45.s55 s55Var5 = (r45.s55) fVar;
            java.lang.String str4 = s55Var5 == null ? null : s55Var5.f385520d;
            r45.s55 s55Var6 = (r45.s55) fVar;
            r45.v67 v67Var = s55Var6 != null ? s55Var6.f385525i : null;
            com.tencent.mars.xlog.Log.i(this.f181062d, "onSceneEnd, respErrCode = %d, respErrMsg = %s, respPrepayId = %s, respAppSource = %s", java.lang.Integer.valueOf(i28), str2, str3, str4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.e(this.f181062d, "onSceneEnd, respPrepayId is null");
                this.f181065g.errCode = -1;
                T6(i18, str, true);
                return;
            }
            com.tencent.mm.wallet_core.model.a2.b(payInfo.f192109e, str3, i18);
            if (v67Var == null || com.tencent.mm.sdk.platformtools.t8.K0(v67Var.f387953d)) {
                com.tencent.mm.opensdk.modelpay.PayReq payReq3 = this.f181064f;
                payInfo.f192116o = payReq3.appId;
                payInfo.f192114m = str3;
                payInfo.f192118q = payReq3.partnerId;
                payInfo.f192117p = str4;
                payInfo.f192121t = str2;
                if (this.f181071p > 0) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.idkeyStat(641L, 1L, 1L, true);
                    g0Var.idkeyStat(641L, 2L, java.lang.System.currentTimeMillis() - this.f181071p, true);
                    if (payInfo.f192122u == null) {
                        payInfo.f192122u = new android.os.Bundle();
                    }
                    payInfo.f192122u.putLong("wallet_pay_key_check_time", this.f181071p);
                }
                h45.a0.f(this, payInfo, 123);
            } else {
                this.f181077v = true;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("prepayId", str3);
                intent.putExtra("is_jsapi_offline_pay", false);
                intent.putExtra("pay_gate_url", v67Var.f387953d);
                intent.putExtra("need_dialog", v67Var.f387955f);
                intent.putExtra("dialog_text", v67Var.f387956g);
                intent.putExtra("max_count", v67Var.f387954e.f389408e);
                intent.putExtra("inteval_time", v67Var.f387954e.f389407d);
                intent.putExtra("default_wording", v67Var.f387954e.f389409f);
                j45.l.k(this, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
            }
            this.f181072q = str3;
            this.f181067i = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(this.f181062d, "onStart");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f181062d, "onStop");
    }
}
