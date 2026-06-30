package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletOrderInfoOldUI extends com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI {
    public com.tencent.mm.plugin.wallet_core.ui.z6 A;
    public final com.tencent.mm.sdk.event.IListener D;
    public final c01.o8 E;
    public final android.view.View.OnLongClickListener F;
    public final com.tencent.mm.sdk.event.IListener G;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f180057n;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f180064u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f180065v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.y6 f180066w;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f180068y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f180069z;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f180053g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180054h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f180055i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f180056m = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.v6 f180058o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f180059p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Set f180060q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f180061r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f180062s = false;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f180063t = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Map f180067x = new java.util.HashMap();
    public final java.util.HashMap B = new java.util.HashMap();
    public boolean C = false;

    public WalletOrderInfoOldUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.3
            {
                this.__eventId = 201806318;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent) {
                com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent2 = walletOfflineRealNameNotifyEvent;
                if (!(walletOfflineRealNameNotifyEvent2 instanceof com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent)) {
                    return false;
                }
                wo3.a0 a0Var2 = walletOfflineRealNameNotifyEvent2.f54962g.f7595a;
                if (!a0Var2.f448140f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "block pass");
                    return true;
                }
                boolean equals = "1".equals(a0Var2.f448135a);
                am.p10 p10Var = walletOfflineRealNameNotifyEvent2.f54962g;
                if (!equals && !"2".equals(p10Var.f7595a.f448135a)) {
                    return false;
                }
                com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
                wo3.a0 a0Var3 = p10Var.f7595a;
                java.lang.String str = a0Var3.f448135a;
                java.lang.String str2 = a0Var3.f448136b;
                java.lang.String str3 = a0Var3.f448137c;
                java.lang.String str4 = a0Var3.f448138d;
                java.lang.String str5 = a0Var3.f448139e;
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.this;
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletOrderInfoOldUI.f180068y;
                realnameGuideHelper.d(str, str2, str3, str4, str5, payInfo == null ? 0 : payInfo.f192109e);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "receive guide");
                walletOrderInfoOldUI.getInput().putParcelable("key_realname_guide_helper", realnameGuideHelper);
                return false;
            }
        };
        this.E = new com.tencent.mm.plugin.wallet_core.ui.m6(this);
        this.F = new com.tencent.mm.plugin.wallet_core.ui.r6(this);
        this.G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangePayActivityViewEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.11
            {
                this.__eventId = -1936299298;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangePayActivityViewEvent changePayActivityViewEvent) {
                android.widget.TextView textView;
                com.tencent.mm.autogen.events.ChangePayActivityViewEvent changePayActivityViewEvent2 = changePayActivityViewEvent;
                if (changePayActivityViewEvent2 instanceof com.tencent.mm.autogen.events.ChangePayActivityViewEvent) {
                    java.lang.String str = changePayActivityViewEvent2.f54032g.f8249a;
                    com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.this;
                    walletOrderInfoOldUI.getClass();
                    am.w1 w1Var = changePayActivityViewEvent2.f54032g;
                    walletOrderInfoOldUI.f180061r = w1Var.f8250b;
                    walletOrderInfoOldUI.f180062s = w1Var.f8251c;
                    if (w1Var.f8252d && !com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoOldUI.f180064u)) {
                        for (int i17 = 0; i17 < walletOrderInfoOldUI.f180056m.size(); i17++) {
                            com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) walletOrderInfoOldUI.f180056m.get(i17);
                            int i18 = -1;
                            for (int i19 = 0; i19 < ((java.util.ArrayList) commodity.H).size(); i19++) {
                                com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = (com.tencent.mm.plugin.wallet_core.model.Orders.Promotions) ((java.util.ArrayList) commodity.H).get(i19);
                                if (promotions.f179771d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179775h) && promotions.f179775h.equals(walletOrderInfoOldUI.f180064u)) {
                                    i18 = i19;
                                }
                            }
                            if (i18 >= 0) {
                                ((java.util.ArrayList) commodity.H).remove(i18);
                            }
                        }
                    }
                    walletOrderInfoOldUI.f180058o.notifyDataSetChanged();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoOldUI.f180064u) && (textView = (android.widget.TextView) walletOrderInfoOldUI.f180063t.get(walletOrderInfoOldUI.f180064u)) != null) {
                        textView.setClickable(walletOrderInfoOldUI.f180061r);
                        textView.setEnabled(walletOrderInfoOldUI.f180061r);
                        textView.setOnClickListener(null);
                        if (walletOrderInfoOldUI.f180062s) {
                            textView.setVisibility(8);
                        }
                    }
                    changePayActivityViewEvent2.f54033h.f8334a = true;
                }
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public void V6(java.lang.String str) {
        doSceneProgress(new ss4.f0(str));
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public void W6(java.lang.String str, int i17) {
        doSceneProgress(new ss4.f0(str, i17));
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public com.tencent.mm.plugin.wallet_core.model.Orders X6() {
        return (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public boolean Z6() {
        return false;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public void a7(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            return;
        }
        java.lang.String f27 = z3Var.f2();
        java.util.List list = this.f180056m;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = this.f180056m.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) it.next()).f179717u = f27;
        }
        this.f180058o.notifyDataSetChanged();
    }

    public void b7() {
        g7();
        this.C = false;
        com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent = new com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent();
        cardOfflinePayFinishButtonEvent.f54029g.f7960a = true;
        cardOfflinePayFinishButtonEvent.e();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("intent_pay_end_errcode", getInput().getInt("intent_pay_end_errcode"));
        bundle.putString("intent_pay_app_url", getInput().getString("intent_pay_app_url"));
        bundle.putBoolean("intent_pay_end", getInput().getBoolean("intent_pay_end"));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "pay done...feedbackData errCode:" + getInput().getInt("intent_pay_end_errcode"));
        java.util.Iterator it = ((java.util.HashSet) this.f180060q).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "hy: doing netscene subscribe...appName: %s", str);
                if (this.f180057n == null || this.f180068y == null) {
                    gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(str));
                } else {
                    com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                    com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180057n;
                    java.lang.String str2 = orders.f179675e;
                    java.lang.String str3 = ((java.util.ArrayList) orders.M).size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180057n.M).get(0)).f179714r : "";
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180068y;
                    r1Var.g(new com.tencent.mm.wallet_core.model.a1(str, str2, str3, payInfo.f192109e, payInfo.f192111g, this.f180057n.A));
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13033, 2, str, "", "", "");
        }
        com.tencent.mm.wallet_core.a.d(this, bundle);
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f180057n;
        if (orders2 == null || com.tencent.mm.sdk.platformtools.t8.K0(orders2.D)) {
            return;
        }
        java.lang.String str4 = ((java.util.ArrayList) this.f180057n.M).size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180057n.M).get(0)).f179714r : "";
        com.tencent.mm.plugin.wallet_core.model.Orders orders3 = this.f180057n;
        java.lang.String str5 = orders3.D;
        java.lang.String str6 = orders3.f179675e;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f180068y;
        java.lang.String U6 = U6(str5, str6, str4, payInfo2.f192123v, payInfo2.f192124w);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", U6);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("stastic_scene", 8);
        j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public void c7() {
        if (!getInput().containsKey("key_realname_guide_helper")) {
            b7();
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoOldUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
            boolean a17 = realnameGuideHelper.a(this, bundle, new com.tencent.mm.plugin.wallet_core.ui.o6(this), null);
            getInput().remove("key_realname_guide_helper");
            if (a17) {
                return;
            }
            b7();
        }
    }

    public java.lang.String d7(long j17) {
        java.util.Map map = this.f180067x;
        if (!((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            return "-1";
        }
        return (java.lang.String) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17));
    }

    public void e7(com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders.Commodity> list;
        this.f180060q.clear();
        if (orders == null || (list = orders.M) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOrderInfoOldUI", "hy: orders is null");
            return;
        }
        for (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity : list) {
            if (commodity.f179722z == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(commodity.f179718v)) {
                this.f180060q.add(commodity.f179718v);
            }
        }
    }

    public final void f7() {
        java.util.List list;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180057n;
        if (orders == null || (list = orders.M) == null || list.size() <= 0 || ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) this.f180057n.M.get(0)).f179702J == null || com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) this.f180057n.M.get(0)).f179702J.f13983a) || com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) this.f180057n.M.get(0)).f179702J.f13984b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "hy: no commodity or no link act or link act is illegal!");
            this.f180055i.setVisibility(8);
        } else {
            this.f180055i.setVisibility(0);
            this.f180055i.setText(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) this.f180057n.M.get(0)).f179702J.f13983a);
            this.f180055i.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.q6(this));
        }
    }

    public void g7() {
        if (this.f180059p) {
            return;
        }
        com.tencent.mm.autogen.events.JsapiResultEvent jsapiResultEvent = new com.tencent.mm.autogen.events.JsapiResultEvent();
        am.yh yhVar = jsapiResultEvent.f54449g;
        yhVar.f8461a = 4;
        yhVar.f8462b = getInput().getBoolean("intent_pay_end", false) ? -1 : 0;
        jsapiResultEvent.e();
        this.f180059p = true;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d7k;
    }

    public void h7() {
        boolean z17;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180057n;
        if (orders != null) {
            java.util.List list = orders.M;
            this.f180056m = list;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                } else if ("1".equals(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) it.next()).f179711o)) {
                    z17 = false;
                    break;
                }
            }
            this.f180053g.setVisibility(0);
            this.f180054h.setVisibility(0);
            if (!z17) {
                this.f180054h.setText(com.tencent.mm.R.string.ksv);
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180057n.C) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180057n.C.trim())) {
                this.f180054h.setText(this.f180057n.C);
            } else if (this.f180057n.f179679i != 1) {
                this.f180054h.setText(com.tencent.mm.R.string.ksu);
            } else {
                this.f180054h.setText(com.tencent.mm.R.string.kst);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.kt8);
        showHomeBtn(false);
        enableBackMenu(false);
        java.lang.String string = getString(com.tencent.mm.R.string.f490441v5);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180068y;
        if (payInfo == null || payInfo.f192109e != 2) {
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180057n;
            if (orders != null && !com.tencent.mm.sdk.platformtools.t8.K0(orders.W)) {
                string = this.f180057n.W;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(payInfo.f192117p)) {
            string = getString(com.tencent.mm.R.string.f490012ig) + this.f180068y.f192117p;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180068y.f192116o)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(this, this.f180068y.f192116o))) {
                string = getString(com.tencent.mm.R.string.f490012ig) + ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(this, this.f180068y.f192116o);
            }
        }
        addTextOptionMenu(0, string, new com.tencent.mm.plugin.wallet_core.ui.n6(this));
        this.f180053g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pdz);
        this.f180054h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pdy);
        this.f180055i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pdr);
        com.tencent.mm.ui.base.MaxListView maxListView = (com.tencent.mm.ui.base.MaxListView) findViewById(com.tencent.mm.R.id.pd_);
        com.tencent.mm.plugin.wallet_core.ui.v6 v6Var = new com.tencent.mm.plugin.wallet_core.ui.v6(this);
        this.f180058o = v6Var;
        maxListView.setAdapter((android.widget.ListAdapter) v6Var);
        h7();
        f7();
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.f487680pf3)).pageScroll(33);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "onActivityResult %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.ui.z6 z6Var = this.A;
            doSceneProgress(new ss4.g0(z6Var.f180827a, z6Var.f180828b, z6Var.f180829c, z6Var.f180830d, z6Var.f180831e, z6Var.f180832f, z6Var.f180833g));
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List list;
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f180060q = new java.util.HashSet();
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        this.f180068y = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        this.f180065v = getInput().getString("key_trans_id");
        getInput().getInt("key_pay_type", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "mTransId %s", this.f180065v);
        com.tencent.mm.plugin.wallet_core.model.Orders X6 = X6();
        this.f180057n = X6;
        if (X6 != null) {
            setContentViewVisibility(0);
            e7(this.f180057n);
            if (g17 != null && this.f180057n != null && this.f180068y != null) {
                boolean s17 = g17.s();
                com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 7);
                int i17 = getInput().getInt("key_support_bankcard", 1) == 2 ? 2 : 1;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = java.lang.Integer.valueOf(this.f180068y.f192109e);
                objArr[1] = java.lang.Boolean.valueOf(this.f180068y.f192109e == 3);
                objArr[2] = java.lang.Integer.valueOf(s17 ? 1 : 2);
                objArr[3] = java.lang.Integer.valueOf((int) ((java.lang.System.currentTimeMillis() - com.tencent.mm.wallet_core.model.n1.f213951a) / 1000));
                objArr[4] = java.lang.Integer.valueOf((int) (this.f180057n.f179678h * 100.0d));
                objArr[5] = this.f180057n.f179681m;
                objArr[6] = java.lang.Integer.valueOf(i17);
                g0Var.d(10691, objArr);
            }
            if ((!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() && g17 != null && g17.s()) || !c01.z1.G()) {
                c01.z1.M();
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180057n;
            if (orders == null || (list = orders.M) == null || ((java.util.ArrayList) list).size() <= 0) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new java.lang.Object[0]);
                db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet_core.ui.k6(this));
            } else {
                java.util.List list2 = this.f180057n.M;
                this.f180056m = list2;
                this.f180065v = ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) list2).get(0)).f179714r;
                if (this.f180068y != null && g17 != null) {
                    if ((g17.f213801c.getInt("key_pay_flag", 0) == 2) || g17.s()) {
                        doSceneProgress(new ss4.e0(getPayReqKey(), 21));
                    }
                }
            }
            if (this.f180065v == null && ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(this)) {
                this.C = false;
            }
        } else {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new java.lang.Object[0]);
            db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet_core.ui.l6(this));
        }
        initView();
        addSceneEndListener(1979);
        this.G.alive();
        this.D.alive();
        this.C = false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        db5.e1.e(getContext(), getString(com.tencent.mm.R.string.ksp), getResources().getStringArray(com.tencent.mm.R.array.f478038am), "", new com.tencent.mm.plugin.wallet_core.ui.p6(this));
        return null;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.G.dead();
        this.D.dead();
        removeSceneEndListener(1979);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        c7();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoOldUI", "onResume, isClickActivityTinyApp: %s", java.lang.Boolean.valueOf(this.C));
        if (this.C) {
            com.tencent.mm.plugin.wallet_core.ui.z6 z6Var = this.A;
            doSceneProgress(new ss4.g0(z6Var.f180827a, z6Var.f180828b, z6Var.f180829c, z6Var.f180830d, z6Var.f180831e, z6Var.f180832f, z6Var.f180833g));
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof ss4.g0) && i17 == 0 && i18 == 0) {
            ss4.g0 g0Var = (ss4.g0) m1Var;
            com.tencent.mm.plugin.wallet_core.ui.w6 w6Var = new com.tencent.mm.plugin.wallet_core.ui.w6(this, g0Var.f412060e);
            if ((com.tencent.mm.sdk.platformtools.t8.K0(w6Var.f180764a) || com.tencent.mm.sdk.platformtools.t8.K0(w6Var.f180765b)) ? false : true) {
                this.B.put(g0Var.f412059d, w6Var);
            }
            this.f180058o.notifyDataSetChanged();
        }
        if (!(m1Var instanceof ss4.f0)) {
            boolean z17 = m1Var instanceof ss4.t;
            if (z17) {
                if (i17 == 0 && i18 == 0) {
                    ss4.t tVar = (ss4.t) m1Var;
                    java.lang.String str2 = tVar.f412135e;
                    com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = tVar.f412134d;
                    ((java.util.HashMap) this.f180067x).put(java.lang.Long.valueOf(promotions.f179779o), str2);
                    promotions.f179774g = tVar.f412136f;
                    if (!"-1".equals(str2) && !"0".equals(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(tVar.f412137g)) {
                        db5.e1.F(this, tVar.f412137g, "", true);
                    } else if ("0".equals(str2)) {
                        dp.a.makeText(this, !com.tencent.mm.sdk.platformtools.t8.K0(tVar.f412137g) ? tVar.f412137g : getString(com.tencent.mm.R.string.kuz), 0).show();
                    }
                    this.f180058o.notifyDataSetChanged();
                    return true;
                }
                if (z17) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = getString(com.tencent.mm.R.string.l0g);
                    }
                    db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.wallet_core.ui.j6(this));
                    return true;
                }
            }
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            setContentViewVisibility(0);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = ((ss4.f0) m1Var).f412058d;
            this.f180057n = orders;
            if (orders != null) {
                this.f180056m = orders.M;
            }
            e7(orders);
            java.util.Objects.toString(this.f180056m);
            java.util.List list = this.f180056m;
            if (list != null && list.size() != 0) {
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) this.f180056m.get(0);
                this.f180065v = commodity.f179714r;
                commodity.toString();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(commodity.f179717u, true);
                if (n17 == null || ((int) n17.E2) == 0) {
                    ((c01.k7) c01.n8.a()).b(commodity.f179717u, 4, this.E);
                } else {
                    a7(n17);
                }
                this.f180058o.notifyDataSetChanged();
                h7();
            }
        }
        com.tencent.mm.plugin.wallet_core.ui.v6 v6Var = this.f180058o;
        if (v6Var != null) {
            v6Var.notifyDataSetChanged();
        }
        f7();
        return true;
    }
}
