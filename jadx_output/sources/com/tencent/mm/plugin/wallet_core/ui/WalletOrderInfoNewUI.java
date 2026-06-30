package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletOrderInfoNewUI extends com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI {

    /* renamed from: b2, reason: collision with root package name */
    public static final /* synthetic */ int f180022b2 = 0;
    public android.widget.TextView A;
    public android.view.ViewGroup A1;
    public android.widget.TextView B;
    public android.widget.TextView B1;
    public android.widget.TextView C;
    public android.widget.CheckBox C1;
    public com.tencent.mm.wallet_core.ui.WalletTextView D;
    public android.view.ViewGroup D1;
    public android.widget.TextView E;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView E1;
    public android.widget.Button F;
    public android.widget.TextView F1;
    public android.widget.LinearLayout G;
    public android.widget.ProgressBar G1;
    public android.view.ViewGroup H;
    public android.view.ViewGroup H1;
    public android.view.ViewGroup I;
    public android.widget.Button I1;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f180023J;
    public android.view.ViewGroup J1;
    public android.view.ViewGroup K;
    public android.view.ViewGroup L;
    public android.view.ViewGroup M;
    public a36.c M1;
    public android.view.ViewGroup N;
    public com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget N1;
    public android.view.ViewGroup P;
    public android.view.ViewGroup Q;
    public android.view.ViewGroup R;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView S;
    public com.tencent.mm.wallet_core.h S1;
    public android.widget.TextView T;
    public final com.tencent.mm.sdk.event.IListener T1;
    public android.widget.TextView U;
    public final com.tencent.mm.sdk.event.IListener U1;
    public android.view.View V;
    public boolean V1;
    public android.widget.Button W;
    public final com.tencent.mm.sdk.event.IListener W1;
    public android.widget.RelativeLayout X;
    public ss4.a X1;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView Y;
    public ss4.c Y1;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView Z;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public int f180024a2;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f180025g;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.RelativeLayout f180028l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180029m;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f180031o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f180032p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f180033p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.LinearLayout f180034p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f180035q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f180036r;

    /* renamed from: s, reason: collision with root package name */
    public int f180037s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo f180038t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f180039u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.i6 f180040v;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f180042x;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f180043x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180044x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f180046y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f180047y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.ImageView f180049z1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f180026h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Set f180027i = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f180030n = null;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f180041w = new java.util.HashMap();

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders.Promotions f180045y = null;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f180048z = "-1";
    public boolean K1 = false;
    public boolean L1 = false;
    public int O1 = 0;
    public boolean P1 = false;
    public boolean Q1 = false;
    public boolean R1 = false;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$3, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 520089918;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
            com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "receive pay result event, do finish");
            int i17 = walletPayResultEvent.f54965g.f7862b;
            if ((i17 != 1000 && i17 != 1001) || (payInfo = (walletOrderInfoNewUI = com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.this).f180031o) == null || payInfo.f192109e != 46) {
                return false;
            }
            com.tencent.mm.wallet_core.h hVar = walletOrderInfoNewUI.S1;
            if (hVar != null) {
                hVar.z(walletOrderInfoNewUI.getContext());
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.wallet_core.ui.w5(this), 100L);
            return false;
        }
    }

    public WalletOrderInfoNewUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.T1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.1
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
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "block pass");
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
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.this;
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletOrderInfoNewUI.f180031o;
                realnameGuideHelper.d(str, str2, str3, str4, str5, payInfo == null ? 0 : payInfo.f192109e);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "receive guide");
                walletOrderInfoNewUI.getInput().putParcelable("key_realname_guide_helper", realnameGuideHelper);
                return false;
            }
        };
        this.U1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangePayActivityViewEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.2
            {
                this.__eventId = -1936299298;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangePayActivityViewEvent changePayActivityViewEvent) {
                com.tencent.mm.autogen.events.ChangePayActivityViewEvent changePayActivityViewEvent2 = changePayActivityViewEvent;
                am.w1 w1Var = changePayActivityViewEvent2.f54032g;
                java.lang.String str = w1Var.f8249a;
                boolean z17 = w1Var.f8250b;
                boolean z18 = w1Var.f8251c;
                boolean z19 = w1Var.f8252d;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "ChangePayActivityViewEvent callback, mActivityBtnTitle: %s, isButtonEnable: %s, isButtonHidden: %s, isActivityViewHidden: %s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.this;
                if (z19 && !com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoNewUI.f180042x)) {
                    walletOrderInfoNewUI.H1.setVisibility(8);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoNewUI.f180042x)) {
                    walletOrderInfoNewUI.I1.setClickable(z17);
                    walletOrderInfoNewUI.I1.setEnabled(z17);
                    walletOrderInfoNewUI.I1.setOnClickListener(null);
                    if (z18) {
                        walletOrderInfoNewUI.I1.setVisibility(8);
                    }
                }
                changePayActivityViewEvent2.f54033h.f8334a = true;
                return false;
            }
        };
        this.V1 = false;
        this.W1 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.AnonymousClass3(a0Var);
        this.Z1 = false;
        this.f180024a2 = 2;
    }

    public static void c7(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = walletOrderInfoNewUI.f180045y;
        objArr[0] = java.lang.Long.valueOf(promotions != null ? promotions.f179779o : 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onClickActivity, activityId: %s", objArr);
        com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions2 = walletOrderInfoNewUI.f180045y;
        if (promotions2 == null || promotions2.f179779o <= 0) {
            return;
        }
        walletOrderInfoNewUI.L1 = true;
        if (walletOrderInfoNewUI.f180048z.equals("-1") || walletOrderInfoNewUI.f180048z.equals("3")) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(13472, walletOrderInfoNewUI.f180032p, java.lang.Integer.valueOf(walletOrderInfoNewUI.f180045y.f179780p), 1, java.lang.Long.valueOf(walletOrderInfoNewUI.f180045y.f179779o), java.lang.Long.valueOf(walletOrderInfoNewUI.f180045y.f179787w));
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions3 = walletOrderInfoNewUI.f180045y;
            g0Var.d(13033, 2, "", promotions3.f179775h, promotions3.f179773f, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoNewUI.f180045y.f179785u) && !com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoNewUI.f180045y.f179786v)) {
                com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions4 = walletOrderInfoNewUI.f180045y;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "promotion jump tiny app, username: %s, path: %s, version: %s", promotions4.f179785u, promotions4.f179786v, java.lang.Integer.valueOf(promotions4.f179788x));
                java.lang.String str = walletOrderInfoNewUI.f180045y.f179779o + "";
                java.lang.String str2 = walletOrderInfoNewUI.f180045y.f179781q + "";
                java.lang.String str3 = walletOrderInfoNewUI.f180045y.f179782r + "";
                java.lang.String str4 = walletOrderInfoNewUI.f180045y.f179783s + "";
                java.lang.String payReqKey = walletOrderInfoNewUI.getPayReqKey();
                java.lang.String str5 = walletOrderInfoNewUI.f180032p;
                com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions5 = walletOrderInfoNewUI.f180045y;
                walletOrderInfoNewUI.f180040v = new com.tencent.mm.plugin.wallet_core.ui.i6(str, str2, str3, str4, payReqKey, str5, promotions5.f179787w, promotions5.f179790z);
                com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions6 = walletOrderInfoNewUI.f180045y;
                java.lang.String str6 = promotions6.f179785u;
                am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                nxVar.f7466a = str6;
                java.lang.String str7 = promotions6.f179786v;
                nxVar.f7467b = str7 != null ? str7 : "";
                nxVar.f7469d = ad1.d.CTRL_INDEX;
                nxVar.f7470e = walletOrderInfoNewUI.f180029m;
                nxVar.f7468c = 0;
                int i17 = promotions6.f179788x;
                if (i17 > 0) {
                    nxVar.f7474i = i17;
                }
                nxVar.f7471f = walletOrderInfoNewUI;
                startAppBrandUIFromOuterEvent.e();
                g0Var.d(14118, walletOrderInfoNewUI.f180029m, walletOrderInfoNewUI.getPayReqKey(), 2);
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions7 = walletOrderInfoNewUI.f180045y;
            int i18 = promotions7.f179780p;
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "doSceneSendPayAward, getAwardParams==null: %s, %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(promotions7.f179789y)), promotions7.f179789y);
                if (com.tencent.mm.sdk.platformtools.t8.K0(promotions7.f179789y)) {
                    walletOrderInfoNewUI.doSceneForceProgress(new ss4.t(promotions7, walletOrderInfoNewUI.getPayReqKey(), walletOrderInfoNewUI.f180029m, promotions7.f179787w));
                    return;
                } else {
                    walletOrderInfoNewUI.doSceneForceProgress(new ss4.n(promotions7.f179789y, promotions7.f179779o));
                    return;
                }
            }
            if (i18 != 2 || com.tencent.mm.sdk.platformtools.t8.K0(promotions7.f179775h)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOrderInfoNewUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                return;
            }
            java.util.HashMap hashMap = walletOrderInfoNewUI.f180041w;
            if (hashMap.containsKey(walletOrderInfoNewUI.f180045y.f179779o + "")) {
                com.tencent.mm.plugin.wallet_core.ui.h6 h6Var = (com.tencent.mm.plugin.wallet_core.ui.h6) hashMap.get(walletOrderInfoNewUI.f180045y.f179779o + "");
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "go to new url %s", h6Var.f180307a);
                java.lang.String str8 = h6Var.f180307a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                    walletOrderInfoNewUI.g7(walletOrderInfoNewUI.f180045y.f179775h);
                    return;
                } else {
                    walletOrderInfoNewUI.g7(str8);
                    return;
                }
            }
            java.lang.String str9 = walletOrderInfoNewUI.f180045y.f179775h;
            walletOrderInfoNewUI.f180042x = str9;
            java.lang.String str10 = walletOrderInfoNewUI.f180045y.f179779o + "";
            java.lang.String str11 = walletOrderInfoNewUI.f180045y.f179781q + "";
            java.lang.String str12 = walletOrderInfoNewUI.f180045y.f179782r + "";
            java.lang.String str13 = walletOrderInfoNewUI.f180045y.f179783s + "";
            java.lang.String payReqKey2 = walletOrderInfoNewUI.getPayReqKey();
            java.lang.String str14 = walletOrderInfoNewUI.f180032p;
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions8 = walletOrderInfoNewUI.f180045y;
            com.tencent.mm.plugin.wallet_core.ui.i6 i6Var = new com.tencent.mm.plugin.wallet_core.ui.i6(str10, str11, str12, str13, payReqKey2, str14, promotions8.f179787w, promotions8.f179790z);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "jumpToH5: %s", str9);
            walletOrderInfoNewUI.h7();
            walletOrderInfoNewUI.f180040v = i6Var;
            com.tencent.mm.wallet_core.ui.r1.W(walletOrderInfoNewUI, str9, false, 1);
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public boolean Z6() {
        return false;
    }

    public void b7() {
        int i17;
        android.os.Bundle bundle;
        h7();
        com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent = new com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent();
        cardOfflinePayFinishButtonEvent.f54029g.f7960a = true;
        cardOfflinePayFinishButtonEvent.e();
        com.tencent.mm.autogen.events.OfflinePayResultNewEvent offlinePayResultNewEvent = new com.tencent.mm.autogen.events.OfflinePayResultNewEvent();
        offlinePayResultNewEvent.f54557g.f6361a = "ok";
        offlinePayResultNewEvent.e();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("intent_pay_end_errcode", getInput().getInt("intent_pay_end_errcode"));
        bundle2.putString("intent_pay_app_url", getInput().getString("intent_pay_app_url"));
        bundle2.putBoolean("intent_pay_end", getInput().getBoolean("intent_pay_end"));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "pay done...feedbackData errCode:" + getInput().getInt("intent_pay_end_errcode"));
        for (java.lang.String str : this.f180027i) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", str);
                if (this.f180025g == null || this.f180031o == null) {
                    gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(str));
                } else {
                    com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                    com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180025g;
                    java.lang.String str2 = orders.f179675e;
                    java.lang.String str3 = ((java.util.ArrayList) orders.M).size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180025g.M).get(0)).f179714r : "";
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180031o;
                    r1Var.g(new com.tencent.mm.wallet_core.model.a1(str, str2, str3, payInfo.f192109e, payInfo.f192111g, this.f180025g.A));
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13033, 2, str, "", "", "");
        }
        com.tencent.mm.wallet_core.h hVar = this.S1;
        if (hVar != null) {
            hVar.o(this, 0, bundle2);
            this.S1 = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "process is null! finish directly");
            finish();
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f180031o;
        if (payInfo2 != null && ((i17 = payInfo2.f192109e) == 46 || i17 == 3)) {
            com.tencent.mm.autogen.mmdata.rpt.WCPayJSAPIPayCallbackManageStruct wCPayJSAPIPayCallbackManageStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayJSAPIPayCallbackManageStruct();
            int i18 = this.f180031o.f192109e;
            if (i18 == 46) {
                wCPayJSAPIPayCallbackManageStruct.f62104d = 2L;
            } else if (i18 == 3) {
                wCPayJSAPIPayCallbackManageStruct.f62104d = 1L;
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f180025g;
            if (orders2 != null && orders2.Y == 0) {
                wCPayJSAPIPayCallbackManageStruct.f62105e = 1L;
            } else if (orders2 != null && orders2.Y == 1) {
                wCPayJSAPIPayCallbackManageStruct.f62105e = 2L;
            } else if (orders2 != null && orders2.Y == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(orders2.f179695x0) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180025g.f179685p0)) {
                wCPayJSAPIPayCallbackManageStruct.f62105e = 3L;
            }
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = this.f180031o;
            if (payInfo3 != null && (bundle = payInfo3.f192122u) != null) {
                java.lang.String string = bundle.getString("extinfo_key_20", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    wCPayJSAPIPayCallbackManageStruct.f62106f = wCPayJSAPIPayCallbackManageStruct.b("SourceH5Url", string, false);
                }
                java.lang.String string2 = this.f180031o.f192122u.getString("extinfo_key_21", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    wCPayJSAPIPayCallbackManageStruct.f62108h = wCPayJSAPIPayCallbackManageStruct.b("SourceAppPath", string2, true);
                }
                java.lang.String string3 = this.f180031o.f192122u.getString("extinfo_key_22", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    wCPayJSAPIPayCallbackManageStruct.f62107g = wCPayJSAPIPayCallbackManageStruct.b("SourceAppUsername", string3, true);
                }
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders3 = this.f180025g;
            if (orders3 != null && orders3.Y == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(orders3.f179695x0) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180025g.f179685p0)) {
                wCPayJSAPIPayCallbackManageStruct.f62110j = wCPayJSAPIPayCallbackManageStruct.b("TargetAppPath", this.f180025g.f179695x0, true);
                wCPayJSAPIPayCallbackManageStruct.f62109i = wCPayJSAPIPayCallbackManageStruct.b("TargetAppUsername", this.f180025g.f179685p0, true);
            }
            wCPayJSAPIPayCallbackManageStruct.k();
            com.tencent.mm.plugin.wallet_core.model.Orders orders4 = this.f180025g;
            if (orders4 != null && orders4.Y == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(orders4.f179695x0) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180025g.f179685p0)) {
                com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                com.tencent.mm.plugin.wallet_core.model.Orders orders5 = this.f180025g;
                java.lang.String str4 = orders5.f179685p0;
                am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                nxVar.f7466a = str4;
                nxVar.f7467b = orders5.f179695x0;
                nxVar.f7469d = ad1.d.CTRL_INDEX;
                nxVar.f7470e = this.f180029m;
                nxVar.f7468c = 0;
                nxVar.f7471f = this;
                startAppBrandUIFromOuterEvent.e();
                return;
            }
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders6 = this.f180025g;
        if (orders6 != null && !com.tencent.mm.sdk.platformtools.t8.K0(orders6.D)) {
            java.lang.String str5 = ((java.util.ArrayList) this.f180025g.M).size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180025g.M).get(0)).f179714r : "";
            com.tencent.mm.plugin.wallet_core.model.Orders orders7 = this.f180025g;
            java.lang.String str6 = orders7.D;
            java.lang.String str7 = orders7.f179675e;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo4 = this.f180031o;
            java.lang.String U6 = U6(str6, str7, str5, payInfo4.f192123v, payInfo4.f192124w);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", U6);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("stastic_scene", 8);
            com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent);
        }
        if (this.D1.getVisibility() != 0 || this.M1.f1115r == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = this.f180032p;
        objArr[1] = this.F1.getText();
        objArr[2] = java.lang.Integer.valueOf(this.M1.f1115r.f1116d == 0 ? 1 : 2);
        objArr[3] = java.lang.Integer.valueOf(this.P1 ? 1 : 2);
        objArr[4] = java.lang.Integer.valueOf(this.f180024a2);
        objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        g0Var.d(17271, objArr);
    }

    public final void d7() {
        this.R.getVisibility();
        this.H.getVisibility();
        this.A1.getVisibility();
        this.H1.getVisibility();
        this.J1.post(new com.tencent.mm.plugin.wallet_core.ui.e6(this));
    }

    public void e7() {
        if (!getInput().containsKey("key_realname_guide_helper")) {
            b7();
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoNewUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
            boolean a17 = realnameGuideHelper.a(this, bundle, new com.tencent.mm.plugin.wallet_core.ui.x5(this), null);
            boolean c17 = realnameGuideHelper.c(this, bundle, new com.tencent.mm.plugin.wallet_core.ui.y5(this), null, false);
            getInput().remove("key_realname_guide_helper");
            if (a17 || c17) {
                return;
            }
            b7();
        }
    }

    public void f7(com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders.Commodity> list;
        this.f180027i.clear();
        if (orders == null || (list = orders.M) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOrderInfoNewUI", "hy: orders is null");
            return;
        }
        for (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity : list) {
            if (commodity.f179722z == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(commodity.f179718v)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "hy: has username and is force recommend");
                this.f180027i.add(commodity.f179718v);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "finish this %s %s", this, new com.tencent.mm.sdk.platformtools.z3());
        if (this.V1) {
            return;
        }
        this.V1 = true;
        super.finish();
    }

    public void g7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "jumpToH5: %s", str);
        h7();
        com.tencent.mm.wallet_core.ui.r1.V(this, str, true);
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d7q;
    }

    public void h7() {
        if (this.f180026h) {
            return;
        }
        com.tencent.mm.autogen.events.JsapiResultEvent jsapiResultEvent = new com.tencent.mm.autogen.events.JsapiResultEvent();
        am.yh yhVar = jsapiResultEvent.f54449g;
        yhVar.f8461a = 4;
        yhVar.f8462b = getInput().getBoolean("intent_pay_end", false) ? -1 : 0;
        yhVar.f8463c = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180025g;
        if (orders != null) {
            yhVar.f8463c.putExtra("key_jsapi_close_page_after_pay", orders.Y);
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f180025g;
        if (orders2 != null && orders2.Y == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(orders2.f179695x0) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180025g.f179685p0)) {
            yhVar.f8463c.putExtra("key_jsapi_close_page_after_pay", 1);
        }
        com.tencent.mm.wallet_core.h hVar = this.S1;
        if (hVar != null) {
            yhVar.f8463c.putExtra("key_is_clear_failure", hVar.f213801c.getInt("key_is_clear_failure", -1));
        }
        jsapiResultEvent.e();
        this.f180026h = true;
    }

    public final void i7() {
        java.util.List list;
        boolean z17;
        if (this.f180025g == null || (list = this.f180030n) == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = this.f180030n.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = true;
                break;
            } else if ("1".equals(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) it.next()).f179711o)) {
                z17 = false;
                break;
            }
        }
        this.A.setVisibility(0);
        this.A.setTextSize(1, 17.0f);
        if (!z17) {
            this.A.setText(com.tencent.mm.R.string.ksv);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180025g.C) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180025g.C.trim())) {
            this.A.setText(this.f180025g.C);
        } else if (this.f180025g.f179679i != 1) {
            this.A.setText(com.tencent.mm.R.string.ksu);
        } else {
            this.A.setText(com.tencent.mm.R.string.kst);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b48  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 3064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.initView():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j7(boolean r26) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.j7(boolean):void");
    }

    public final void k7() {
        if (this.D1.getVisibility() != 0) {
            return;
        }
        if (this.P1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.M1.f1115r.f1124o)) {
                this.E1.setUrl(this.M1.f1115r.f1124o);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.M1.f1115r.f1126q)) {
                return;
            }
            this.F1.setText(this.M1.f1115r.f1126q);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.M1.f1115r.f1125p)) {
                this.F1.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.M1.f1115r.f1125p, true));
            }
            long j17 = this.M1.f1115r.f1120h;
            if (j17 > 0) {
                this.F1.setTextSize(1, (float) j17);
                return;
            }
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.M1.f1115r.f1118f)) {
            this.E1.setUrl(this.M1.f1115r.f1118f);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.M1.f1115r.f1117e)) {
            return;
        }
        this.F1.setText(this.M1.f1115r.f1117e);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.M1.f1115r.f1119g)) {
            this.F1.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.M1.f1115r.f1119g, true));
        }
        long j18 = this.M1.f1115r.f1120h;
        if (j18 > 0) {
            this.F1.setTextSize(1, (float) j18);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onActivityResult %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "do query pay arawrd, query_award_status_params==null: %s, isCallQueryPayAward: %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.f180040v.f180337i)), java.lang.Boolean.valueOf(this.Q1));
            if (this.Q1) {
                return;
            }
            this.Q1 = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180040v.f180337i)) {
                com.tencent.mm.plugin.wallet_core.ui.i6 i6Var = this.f180040v;
                doSceneProgress(new ss4.g0(i6Var.f180329a, i6Var.f180330b, i6Var.f180331c, i6Var.f180332d, i6Var.f180333e, i6Var.f180334f, i6Var.f180335g));
            } else {
                com.tencent.mm.plugin.wallet_core.ui.i6 i6Var2 = this.f180040v;
                doSceneProgress(new ss4.q(i6Var2.f180337i, i6Var2.f180329a));
            }
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo simpleCashierInfo;
        int i17;
        java.lang.String str;
        java.util.List list;
        super.onCreate(bundle);
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
                getWindow().getDecorView().setSystemUiVisibility(8192);
            } else {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
            }
        }
        setContentViewVisibility(4);
        this.f180027i = new java.util.HashSet();
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        this.f180031o = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        this.f180029m = getInput().getString("key_trans_id");
        getInput().getInt("key_pay_type", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "mTransId %s", this.f180029m);
        com.tencent.mm.plugin.wallet_core.model.Orders X6 = X6();
        this.f180025g = X6;
        if (X6 != null) {
            setContentViewVisibility(0);
            f7(this.f180025g);
            if (g17 == null || this.f180025g == null || this.f180031o == null) {
                str = "mOrders info is Illegal!";
            } else {
                boolean s17 = g17.s();
                com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 7);
                int i18 = getInput().getInt("key_support_bankcard", 1) == 2 ? 2 : 1;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = java.lang.Integer.valueOf(this.f180031o.f192109e);
                objArr[1] = java.lang.Boolean.valueOf(this.f180031o.f192109e == 3);
                objArr[2] = java.lang.Integer.valueOf(s17 ? 1 : 2);
                str = "mOrders info is Illegal!";
                objArr[3] = java.lang.Integer.valueOf((int) ((java.lang.System.currentTimeMillis() - com.tencent.mm.wallet_core.model.n1.f213951a) / 1000));
                objArr[4] = java.lang.Integer.valueOf((int) (this.f180025g.f179678h * 100.0d));
                objArr[5] = this.f180025g.f179681m;
                objArr[6] = java.lang.Integer.valueOf(i18);
                g0Var.d(10691, objArr);
            }
            if ((!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() && g17 != null && g17.s()) || !c01.z1.G()) {
                c01.z1.M();
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180025g;
            if (orders == null || (list = orders.M) == null || ((java.util.ArrayList) list).size() <= 0) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletOrderInfoNewUI", str, new java.lang.Object[0]);
                db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet_core.ui.f6(this));
            } else {
                java.util.List list2 = this.f180025g.M;
                this.f180030n = list2;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "init data commoditys size: %s", java.lang.Integer.valueOf(((java.util.ArrayList) list2).size()));
                this.f180029m = ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180030n).get(0)).f179714r;
                this.f180032p = ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180030n).get(0)).f179714r;
                if (this.f180031o != null && g17 != null) {
                    if ((g17.f213801c.getInt("key_pay_flag", 0) == 2) || g17.s()) {
                        doSceneProgress(new ss4.e0(getPayReqKey(), 21));
                    }
                }
            }
            ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(this);
        } else {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new java.lang.Object[0]);
            db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet_core.ui.g6(this));
        }
        initView();
        this.S1 = getProcess();
        i7();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180031o;
        if (payInfo != null && payInfo.f192109e == 46) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "early send result");
            com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(getInput());
            com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f180025g;
            if (orders2 != null) {
                intent.putExtra("key_total_fee", orders2.f179678h);
            }
            com.tencent.mm.wallet_core.h hVar = this.S1;
            if (hVar != null) {
                i17 = -1;
                intent.putExtra("key_is_clear_failure", hVar.f213801c.getInt("key_is_clear_failure", -1));
            } else {
                i17 = -1;
            }
            am.s10 s10Var = walletPayResultEvent.f54965g;
            s10Var.f7861a = intent;
            s10Var.f7866f = 1;
            s10Var.f7864d = getPayReqKey();
            if (!intent.getBooleanExtra("intent_pay_end", false)) {
                i17 = 0;
            }
            s10Var.f7863c = i17;
            walletPayResultEvent.e();
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders3 = this.f180025g;
        if (orders3 != null && (simpleCashierInfo = orders3.B1) != null && simpleCashierInfo.f179814d == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "simple cashier");
            b7();
            return;
        }
        addSceneEndListener(1979);
        addSceneEndListener(2948);
        addSceneEndListener(2710);
        this.U1.alive();
        this.T1.alive();
        this.W1.alive();
        this.R1 = true;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f180031o;
        com.tencent.mm.wallet_core.model.a2.a(payInfo2 != null ? payInfo2.f192109e : 0, payInfo2 == null ? "" : payInfo2.f192114m, 16, "");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        db5.e1.e(getContext(), getString(com.tencent.mm.R.string.ksp), getResources().getStringArray(com.tencent.mm.R.array.f478038am), "", new com.tencent.mm.plugin.wallet_core.ui.s5(this));
        return null;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        a36.d dVar;
        super.onDestroy();
        if (!this.V1) {
            com.tencent.mm.autogen.events.OfflinePayResultNewEvent offlinePayResultNewEvent = new com.tencent.mm.autogen.events.OfflinePayResultNewEvent();
            offlinePayResultNewEvent.f54557g.f6361a = "ok";
            offlinePayResultNewEvent.e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "do follow card bd mch");
        a36.c cVar = this.M1;
        if (cVar != null && (dVar = cVar.f1115r) != null) {
            new ss4.b(dVar.f1121i, dVar.f1116d, this.O1).l().q(new com.tencent.mm.plugin.wallet_core.ui.v5(this));
        }
        this.U1.dead();
        this.T1.dead();
        removeSceneEndListener(1979);
        removeSceneEndListener(2948);
        removeSceneEndListener(2710);
        this.W1.dead();
        if (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.M1)) {
            this.N1.j();
        }
        ss4.a aVar = this.X1;
        if (aVar != null) {
            aVar.j();
        }
        ss4.c cVar2 = this.Y1;
        if (cVar2 != null) {
            cVar2.j();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        e7();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s, exposureInfo: %s", java.lang.Boolean.valueOf(this.R1), this.f180045y, java.lang.Boolean.valueOf(this.K1), java.lang.Boolean.valueOf(this.L1), this.f180038t, this.M1);
        if (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.M1)) {
            this.N1.k();
            return;
        }
        if (this.R1) {
            this.R1 = false;
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = this.f180045y;
        if (promotions == null || !this.L1) {
            if (!this.K1 || this.f180038t == null) {
                return;
            }
            doSceneProgress(new ss4.g0(this.f180038t.f179797m + "", this.f180038t.f179798n + "", this.f180038t.f179799o + "", this.f180038t.f179800p + "", getPayReqKey(), this.f180032p, this.f180038t.f179801q));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "do query payAward, queryAwardStatusParams==null: %s %s, isCallQueryPayAward: %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179790z)), this.f180045y.f179790z, java.lang.Boolean.valueOf(this.Q1));
        if (this.Q1) {
            return;
        }
        this.Q1 = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180045y.f179790z)) {
            doSceneProgress(new ss4.q(this.f180045y.f179790z, this.f180045y.f179779o + ""));
            return;
        }
        doSceneProgress(new ss4.g0(this.f180045y.f179779o + "", this.f180045y.f179781q + "", this.f180045y.f179782r + "", this.f180045y.f179783s + "", getPayReqKey(), this.f180032p, this.f180045y.f179787w));
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onSceneEnd, errType: %s, errCode: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var);
        if (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.M1)) {
            str2 = str;
            if (this.N1.l(i17, i18, str2, m1Var)) {
                return true;
            }
        } else {
            str2 = str;
        }
        boolean z17 = m1Var instanceof ss4.g0;
        java.util.HashMap hashMap = this.f180041w;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                ss4.g0 g0Var = (ss4.g0) m1Var;
                com.tencent.mm.plugin.wallet_core.ui.h6 h6Var = new com.tencent.mm.plugin.wallet_core.ui.h6(g0Var.f412060e);
                com.tencent.mm.plugin.wallet_core.ui.i6 i6Var = this.f180040v;
                java.lang.String str3 = g0Var.f412059d;
                if (i6Var != null) {
                    hashMap.put(str3, h6Var);
                    j7(false);
                    d7();
                } else if (this.K1) {
                    hashMap.put(str3, h6Var);
                    j7(false);
                    d7();
                }
            }
            this.Q1 = false;
        } else {
            if (!(m1Var instanceof ss4.q)) {
                if (m1Var instanceof ss4.t) {
                    if (i17 != 0 || i18 != 0) {
                        db5.e1.G(this, com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.l0g) : str2, null, false, new com.tencent.mm.plugin.wallet_core.ui.z5(this));
                        return true;
                    }
                    ss4.t tVar = (ss4.t) m1Var;
                    java.lang.String str4 = tVar.f412135e;
                    com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = this.f180045y;
                    if (promotions != null) {
                        long j17 = promotions.f179779o;
                        com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions2 = tVar.f412134d;
                        if (j17 == promotions2.f179779o) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "activityAwardState: %s", promotions);
                            this.f180048z = str4;
                            java.lang.String str5 = promotions2.f179774g;
                            j7(false);
                            d7();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(tVar.f412136f) && !"3".equals(str4)) {
                                this.W.setText(tVar.f412136f);
                            }
                        }
                    }
                    if (!"-1".equals(str4) && !"0".equals(str4) && !com.tencent.mm.sdk.platformtools.t8.K0(tVar.f412137g)) {
                        db5.e1.F(this, tVar.f412137g, "", true);
                        return true;
                    }
                    if ("0".equals(str4)) {
                        dp.a.makeText(this, !com.tencent.mm.sdk.platformtools.t8.K0(tVar.f412137g) ? tVar.f412137g : getString(com.tencent.mm.R.string.kuz), 0).show();
                    }
                    return true;
                }
                if (!(m1Var instanceof ss4.n)) {
                    return false;
                }
                if (i17 != 0 || i18 != 0) {
                    db5.e1.G(this, com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.l0g) : str2, null, false, new com.tencent.mm.plugin.wallet_core.ui.a6(this));
                    return true;
                }
                ss4.n nVar = (ss4.n) m1Var;
                r45.ha3 ha3Var = nVar.f412101d;
                if (ha3Var.f375975d == 0) {
                    java.lang.String str6 = ha3Var.f375977f + "";
                    com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions3 = this.f180045y;
                    if (promotions3 != null && promotions3.f179779o == nVar.f412104g) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "activityAwardState: %s", promotions3);
                        this.f180048z = str6;
                        j7(false);
                        d7();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(ha3Var.f375979h) && !"3".equals(str6)) {
                            this.W.setText(ha3Var.f375979h);
                        }
                    }
                    if (!"-1".equals(str6) && !"0".equals(str6) && !com.tencent.mm.sdk.platformtools.t8.K0(ha3Var.f375978g)) {
                        db5.e1.F(this, ha3Var.f375978g, "", true);
                        return true;
                    }
                    if ("0".equals(str6)) {
                        dp.a.makeText(this, !com.tencent.mm.sdk.platformtools.t8.K0(ha3Var.f375978g) ? ha3Var.f375978g : getString(com.tencent.mm.R.string.kuz), 0).show();
                    }
                }
                return true;
            }
            if (i17 == 0 && i18 == 0) {
                ss4.q qVar = (ss4.q) m1Var;
                r45.fh5 fh5Var = qVar.f412126d;
                if (fh5Var.f374357d == 0) {
                    com.tencent.mm.plugin.wallet_core.ui.h6 h6Var2 = new com.tencent.mm.plugin.wallet_core.ui.h6(fh5Var);
                    com.tencent.mm.plugin.wallet_core.ui.i6 i6Var2 = this.f180040v;
                    java.lang.String str7 = qVar.f412129g;
                    if (i6Var2 != null) {
                        hashMap.put(str7 + "", h6Var2);
                        j7(false);
                        d7();
                    } else if (this.K1) {
                        hashMap.put(str7 + "", h6Var2);
                        j7(false);
                        d7();
                    }
                }
            }
            this.Q1 = false;
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
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
