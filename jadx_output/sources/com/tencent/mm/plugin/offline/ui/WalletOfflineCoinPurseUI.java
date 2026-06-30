package com.tencent.mm.plugin.offline.ui;

@gm0.a2
/* loaded from: classes9.dex */
public class WalletOfflineCoinPurseUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements wo3.s, y60.e, to3.f, com.tencent.mm.plugin.offline.ui.e, com.tencent.mm.sdk.platformtools.f7, yo3.e {
    public static final /* synthetic */ int B2 = 0;
    public java.lang.String A;
    public int A1;
    public final com.tencent.mm.sdk.event.IListener A2;
    public android.view.View B;
    public android.widget.TextView C;
    public com.tencent.mm.ui.widget.imageview.WeImageView D;
    public android.widget.RelativeLayout E;
    public android.widget.LinearLayout F;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView G;
    public android.widget.TextView H;
    public hs4.d H1;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.offline.ui.r3 f152498J;
    public com.tencent.mm.plugin.offline.ui.x3 K;
    public com.tencent.mm.plugin.offline.ui.j3 L;
    public com.tencent.mm.plugin.offline.ui.t3 M;
    public com.tencent.mm.plugin.offline.ui.o3 N;
    public com.tencent.mm.wallet_core.ui.w O1;
    public android.widget.LinearLayout P;
    public com.tencent.mm.plugin.offline.ui.a1 P1;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView Q;
    public boolean Q1;
    public android.widget.TextView R;
    public com.tencent.mm.plugin.offline.ui.OfflineAlertView R1;
    public com.tencent.mm.plugin.offline.ui.u3 S;
    public int T1;
    public android.widget.LinearLayout U;
    public android.widget.LinearLayout V;
    public android.widget.LinearLayout W;
    public android.widget.LinearLayout X;
    public android.widget.LinearLayout Y;
    public java.lang.String Y1;
    public android.widget.LinearLayout Z;

    /* renamed from: a2, reason: collision with root package name */
    public int f152499a2;

    /* renamed from: e2, reason: collision with root package name */
    public at4.r0 f152505e2;

    /* renamed from: h2, reason: collision with root package name */
    public java.lang.String f152511h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent f152513i2;

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152514j2;

    /* renamed from: k2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152515k2;

    /* renamed from: l2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152517l2;

    /* renamed from: m2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152519m2;

    /* renamed from: n2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152521n2;

    /* renamed from: o2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152523o2;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f152525p0;

    /* renamed from: p2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152527p2;

    /* renamed from: q2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152529q2;

    /* renamed from: r2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152531r2;

    /* renamed from: s2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152533s2;

    /* renamed from: t2, reason: collision with root package name */
    public final android.view.View.OnClickListener f152535t2;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f152536u;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f152537u2;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ScrollView f152538v;

    /* renamed from: v2, reason: collision with root package name */
    public final java.util.HashMap f152539v2;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f152540w;

    /* renamed from: w2, reason: collision with root package name */
    public final int f152541w2;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f152542x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f152543x0;

    /* renamed from: x2, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f152545x2;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f152546y;

    /* renamed from: y0, reason: collision with root package name */
    public android.app.Dialog f152547y0;

    /* renamed from: y2, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f152549y2;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f152550z;

    /* renamed from: z1, reason: collision with root package name */
    public to3.q f152551z1;

    /* renamed from: z2, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f152552z2;

    /* renamed from: d, reason: collision with root package name */
    public long f152502d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f152504e = 3;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f152506f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f152508g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f152510h = -1;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f152512i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f152518m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f152520n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f152522o = false;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f152524p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f152528q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f152530r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f152532s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f152534t = "";
    public boolean T = false;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f152516l1 = "";

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f152526p1 = "";

    /* renamed from: x1, reason: collision with root package name */
    public boolean f152544x1 = true;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f152548y1 = false;
    public boolean B1 = false;
    public boolean C1 = false;
    public boolean D1 = false;
    public boolean E1 = true;
    public boolean F1 = false;
    public int G1 = -1;
    public int I1 = 1;
    public boolean J1 = false;
    public boolean K1 = false;
    public boolean L1 = false;
    public final java.util.ArrayList M1 = new java.util.ArrayList();
    public final java.util.ArrayList N1 = new java.util.ArrayList();
    public boolean S1 = false;
    public boolean U1 = false;
    public java.lang.String V1 = null;
    public boolean W1 = false;
    public int X1 = 0;
    public boolean Z1 = false;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f152500b2 = true;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f152501c2 = false;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f152503d2 = false;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f152507f2 = false;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f152509g2 = false;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1878810586;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent) {
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent2 = jsApiOfflineUserBindQueryResultCallBackEvent;
            am.uh uhVar = jsApiOfflineUserBindQueryResultCallBackEvent2.f54445g;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "FQOpenResultCallBackEvent callback，appid：%s,event.data.nonceStr：%s，event.data.paySign：%s,event.data.signType:%s，event.data.bankType:%s，event.data.bindSerial:%s，event.data.openSuccess:%s", uhVar.f8085a, uhVar.f8088d, uhVar.f8091g, uhVar.f8092h, uhVar.f8093i, uhVar.f8094j, uhVar.f8095k);
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.f152513i2 = jsApiOfflineUserBindQueryResultCallBackEvent2;
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.offline.ui.w1(this, jsApiOfflineUserBindQueryResultCallBackEvent2));
            return false;
        }
    }

    public WalletOfflineCoinPurseUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f152514j2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.1
            {
                this.__eventId = 520089918;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
                if (walletPayResultEvent2.f54965g.f7865e) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.WalletOfflineCoinPurseUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                } else {
                    dead();
                    if (walletPayResultEvent2.f54965g.f7863c == 0) {
                        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.f152548y1 = false;
                    }
                }
                return false;
            }
        };
        this.f152515k2 = new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.AnonymousClass2(a0Var);
        this.f152517l2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.3
            {
                this.__eventId = 520089918;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard g17;
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "callback from kinda");
                android.content.Intent intent = walletPayResultEvent2.f54965g.f7861a;
                if (intent == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "event.data.intent == null");
                } else {
                    android.os.Bundle extras = intent.getExtras();
                    if (extras != null) {
                        int i17 = extras.getInt("isFromKinda");
                        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                        if (i17 == 1 && extras.getInt("payScene") == 8) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "pay from Kinda ");
                            walletOfflineCoinPurseUI.f152503d2 = true;
                            walletOfflineCoinPurseUI.f152501c2 = false;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "kinda offline pay cashier callback, with data.");
                        if (extras.getInt("payScene") == 8 && walletPayResultEvent2.f54965g.f7863c == -1) {
                            java.lang.String string = extras.getString("pay_bind_serial");
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "tempBindSerial:%s", string);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && (g17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().g(string, true, true)) != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "bindSerial：now bindSerial:%s、pay serial:%s", walletOfflineCoinPurseUI.f152532s, g17.field_bindSerial);
                                if (at4.l1.b(g17)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "after pay：set as default bankcard");
                                    yo3.m.s(g17.field_bindSerial);
                                    to3.c0.Ai().wi().f420970b = g17.field_bindSerial;
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "after pay：do not set as default bankcard");
                                }
                            }
                            com.tencent.mm.autogen.events.OfflinePayResultNewEvent offlinePayResultNewEvent = new com.tencent.mm.autogen.events.OfflinePayResultNewEvent();
                            offlinePayResultNewEvent.f54557g.f6361a = "ok";
                            offlinePayResultNewEvent.e();
                            walletOfflineCoinPurseUI.finish();
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "kinda offline pay cashier callback, finish.");
                        }
                    }
                }
                return false;
            }
        };
        this.f152519m2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.4
            {
                this.__eventId = -1811648750;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent doOfflineShowCodeEventEvent) {
                com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent doOfflineShowCodeEventEvent2 = doOfflineShowCodeEventEvent;
                wo3.n nVar = new wo3.n(to3.c0.Ai().wi().a(), com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.f152510h, 0, doOfflineShowCodeEventEvent2.f54092g.f6536a, "", yo3.m.f() == 2 ? "1" : "0");
                gm0.j1.i();
                gm0.j1.n().f273288b.g(nVar);
                return false;
            }
        };
        this.f152521n2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenECardFinishEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.5
            {
                this.__eventId = 1883130380;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OpenECardFinishEvent openECardFinishEvent) {
                openECardFinishEvent.f54594g.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", " ecard finish: %s", 0);
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.doSceneProgress(new ss4.e0(null, 8), false);
                return false;
            }
        };
        this.f152523o2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OfflineBindCardEventEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.7
            {
                this.__eventId = 619332608;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OfflineBindCardEventEvent offlineBindCardEventEvent) {
                ss4.e0 e0Var = new ss4.e0(null, 8);
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                walletOfflineCoinPurseUI.doSceneProgress(e0Var, false);
                int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
                walletOfflineCoinPurseUI.p7();
                walletOfflineCoinPurseUI.q7();
                walletOfflineCoinPurseUI.l7();
                return false;
            }
        };
        this.f152527p2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OfflineCreateEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.8
            {
                this.__eventId = 1771437899;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OfflineCreateEvent offlineCreateEvent) {
                if (offlineCreateEvent.f54556g.f6262a == hashCode()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "has create a new ui, finish self");
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.finish();
                return false;
            }
        };
        this.f152529q2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShowWalletOrderInfoEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.9
            {
                this.__eventId = -837480444;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ShowWalletOrderInfoEvent showWalletOrderInfoEvent) {
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                if (walletOfflineCoinPurseUI.isFinishing()) {
                    return false;
                }
                walletOfflineCoinPurseUI.finish();
                return false;
            }
        };
        this.f152531r2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.10
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
                int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                walletOfflineCoinPurseUI.getClass();
                if ("1".equals(a0Var2.f448135a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "need realname verify");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".ui.WalletOfflineCoinPurseUI");
                    bundle.putString("realname_verify_process_jump_plugin", "offline");
                    zs4.q.g(walletOfflineCoinPurseUI, a0Var2.f448136b, 0, a0Var2.f448137c, a0Var2.f448138d, bundle, walletOfflineCoinPurseUI.isTransparent(), null, null, 0, 2);
                    return false;
                }
                java.lang.String str = a0Var2.f448135a;
                if ("2".equals(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "need upload credit");
                    zs4.q.h(walletOfflineCoinPurseUI, a0Var2.f448136b, a0Var2.f448139e, a0Var2.f448137c, a0Var2.f448138d, false, null);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "realnameGuideFlag =  " + str);
                return false;
            }
        };
        this.f152533s2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.11
            {
                this.__eventId = 2018267472;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent) {
                com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent2 = cardOfflinePayFinishButtonEvent;
                if (yo3.m.f464160g != 3 || !(cardOfflinePayFinishButtonEvent2 instanceof com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent) || !cardOfflinePayFinishButtonEvent2.f54029g.f7960a) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "finish button event!");
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.finish();
                return true;
            }
        };
        this.f152535t2 = new com.tencent.mm.plugin.offline.ui.y1(this);
        this.f152537u2 = false;
        this.f152539v2 = new java.util.HashMap();
        this.f152541w2 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        this.f152545x2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.offline.ui.d3(this), false);
        this.f152549y2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.offline.ui.e3(this), false);
        this.f152552z2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.offline.ui.f3(this), false);
        this.A2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(a0Var) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.49
            {
                this.__eventId = 572563856;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
                com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "KindaBindCardEvent callback");
                if (kindaBindCardEvent2 == null) {
                    return false;
                }
                com.tencent.mm.wallet_core.model.i1.a();
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                am.di diVar = kindaBindCardEvent2.f54454g;
                if (diVar != null) {
                    if (diVar.f6453a) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "KindaBindCardEvent bindCard Succ");
                        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                            walletOfflineCoinPurseUI.doSceneForceProgress(new ss4.e0(null, 13));
                        } else {
                            walletOfflineCoinPurseUI.doSceneForceProgress(new ss4.e0(null, 22));
                        }
                        walletOfflineCoinPurseUI.U1 = true;
                        walletOfflineCoinPurseUI.V1 = diVar.f6456d;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "KindaBindCardEvent bindCard Cancel");
                    }
                }
                walletOfflineCoinPurseUI.A2.dead();
                return true;
            }
        };
    }

    public static void f7(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.ClickFFOfflineCoinPurseStruct clickFFOfflineCoinPurseStruct = new com.tencent.mm.autogen.mmdata.rpt.ClickFFOfflineCoinPurseStruct();
        clickFFOfflineCoinPurseStruct.f55689d = i17;
        clickFFOfflineCoinPurseStruct.k();
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (android.text.TextUtils.isEmpty(str) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f152506f.get(str);
        java.lang.Integer num = (java.lang.Integer) this.f152508g.get(str);
        if (imageView == null || num == null) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(getMainLooper()).post(new com.tencent.mm.plugin.offline.ui.i2(this, num, imageView, bitmap));
    }

    public final int W6(long j17) {
        return android.graphics.Color.argb((int) ((j17 >> 24) & 255), (int) ((j17 >> 16) & 255), (int) ((j17 >> 8) & 255), (int) (j17 & 255));
    }

    public final boolean X6() {
        if (!this.R1.d(2)) {
            return false;
        }
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.R1;
        if (offlineAlertView.f152473d == 2) {
            offlineAlertView.a();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList c17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().c(true);
        for (int i17 = 0; i17 < c17.size(); i17++) {
            arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) c17.get(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "getOfflineBindBankCardList() list size is " + arrayList.size());
        if (arrayList.size() < 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
            return false;
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(i18);
            if (bankcard != null && bankcard.field_support_micropay && com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord)) {
                return true;
            }
        }
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView2 = this.R1;
        android.view.View view = this.f152540w;
        com.tencent.mm.plugin.offline.ui.r2 r2Var = new com.tencent.mm.plugin.offline.ui.r2(this);
        com.tencent.mm.plugin.offline.ui.s2 s2Var = new com.tencent.mm.plugin.offline.ui.s2(this);
        offlineAlertView2.f152473d = 2;
        offlineAlertView2.setVisibility(0);
        offlineAlertView2.f152475f.removeAllViews();
        android.view.View inflate = android.view.LayoutInflater.from(offlineAlertView2.getContext()).inflate(com.tencent.mm.R.layout.d7g, (android.view.ViewGroup) null);
        offlineAlertView2.f152475f.addView(inflate);
        view.post(new com.tencent.mm.plugin.offline.ui.t(offlineAlertView2, r2Var, s2Var, view, inflate));
        return false;
    }

    public void Y6(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        doSceneProgress(new wo3.f(i17, str, str2, str3), yo3.m.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z6(boolean z17) {
        android.graphics.Bitmap b17;
        android.graphics.Bitmap b18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z17 && (com.tencent.mm.sdk.platformtools.t8.K0(this.f152516l1) || com.tencent.mm.sdk.platformtools.t8.K0(this.f152526p1))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "empty code!");
            if (this.R1.d(5)) {
                com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.R1;
                if (offlineAlertView.f152473d == 5) {
                    offlineAlertView.a();
                }
                com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView2 = this.R1;
                android.view.View view = this.f152540w;
                com.tencent.mm.plugin.offline.ui.n2 n2Var = new com.tencent.mm.plugin.offline.ui.n2(this);
                offlineAlertView2.f152473d = 5;
                offlineAlertView2.setVisibility(0);
                offlineAlertView2.f152476g = false;
                offlineAlertView2.f152475f.removeAllViews();
                android.view.View inflate = android.view.LayoutInflater.from(offlineAlertView2.getContext()).inflate(com.tencent.mm.R.layout.d7j, (android.view.ViewGroup) null);
                offlineAlertView2.f152475f.addView(inflate);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482933s7)).setText(com.tencent.mm.R.string.hdy);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.h5h);
                button.setText(com.tencent.mm.R.string.hdx);
                button.setOnClickListener(n2Var);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.m9c);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                view.post(new com.tencent.mm.plugin.offline.ui.i(offlineAlertView2, view, inflate));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 73L, 1L, true);
            }
        } else if (this.R1.e()) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView3 = this.R1;
            if (offlineAlertView3.f152473d == 5) {
                offlineAlertView3.a();
            }
        }
        android.graphics.Bitmap bitmap = this.f152512i;
        if (android.text.TextUtils.isEmpty(this.f152516l1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "getBitmap mQRcode == null");
            b17 = null;
        } else {
            kd0.k2 k2Var = (kd0.k2) i95.n0.c(kd0.k2.class);
            java.lang.String str = this.f152516l1;
            ((jd0.w1) k2Var).getClass();
            b17 = x45.a.b(this, str, 12, 3, 0.0d);
        }
        this.f152512i = b17;
        this.f152542x.setImageBitmap(b17);
        this.M1.add(0, bitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh qrcode is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        android.graphics.Bitmap bitmap2 = this.f152518m;
        if (android.text.TextUtils.isEmpty(this.f152526p1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "getBarcodeBitmap mBarcode == null");
            b18 = null;
        } else {
            kd0.k2 k2Var2 = (kd0.k2) i95.n0.c(kd0.k2.class);
            java.lang.String str2 = this.f152526p1;
            ((jd0.w1) k2Var2).getClass();
            b18 = x45.a.b(this, str2, 5, 0, 0.0d);
        }
        this.f152518m = b18;
        this.f152546y.setImageBitmap(b18);
        int i17 = this.f152504e;
        if ((i17 == 2 || i17 == 1 || i17 == 7) == true) {
            this.f152546y.setAlpha(10);
        } else {
            this.f152546y.setAlpha(255);
        }
        this.N1.add(0, bitmap2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.util.ArrayList arrayList = this.M1;
        if (arrayList.size() >= 2) {
            for (int size = arrayList.size() - 1; size > 1; size--) {
                com.tencent.mm.wallet_core.ui.r1.n0((android.graphics.Bitmap) arrayList.remove(size));
            }
        }
        java.util.ArrayList arrayList2 = this.N1;
        if (arrayList2.size() >= 2) {
            for (int size2 = arrayList2.size() - 1; size2 > 1; size2--) {
                com.tencent.mm.wallet_core.ui.r1.n0((android.graphics.Bitmap) arrayList2.remove(size2));
            }
        }
        com.tencent.mm.wallet_core.ui.w wVar = this.O1;
        if (wVar != null) {
            wVar.f214249e = this.f152526p1;
            wVar.f214246b = this.f152512i;
            wVar.f214247c = this.f152518m;
            db5.d5 d5Var = wVar.f214252h;
            if (d5Var != null && d5Var.isShowing()) {
                wVar.d();
            }
        }
        u7();
        gm0.j1.i();
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            this.P.setVisibility(8);
        } else {
            this.S = new com.tencent.mm.plugin.offline.ui.u3(null);
            try {
                com.tencent.mm.plugin.offline.ui.u3.a(this.S, new org.json.JSONObject(str3));
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.S.f152733b)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "title is null, can not show info page");
                    this.P.setVisibility(8);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "show jump info layout");
                    if (!this.T) {
                        this.T = true;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14515, 5);
                    }
                    this.P.setVisibility(0);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(this.S.f152732a)) {
                        this.Q.setVisibility(8);
                    } else {
                        this.Q.setUrl(this.S.f152732a);
                        this.Q.setVisibility(0);
                    }
                    this.R.setText(this.S.f152733b);
                    this.P.setOnClickListener(new com.tencent.mm.plugin.offline.ui.t1(this));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "parse jumpinfo json fail : %s", e17.getMessage());
                this.P.setVisibility(8);
            }
        }
        com.tencent.mm.wallet_core.model.n1.d(10, 0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.app.w wVar2 = com.tencent.mm.app.w.INSTANCE;
        g0Var.d(14163, 3, java.lang.Integer.valueOf(1 ^ (wVar2.f53889n ? 1 : 0)), java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 0), java.lang.Integer.valueOf(to3.c0.Ai().wi().a()));
        g0Var.idkeyStat(135L, 67L, 1L, true);
        if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            g0Var.idkeyStat(135L, 32L, 1L, true);
        } else {
            g0Var.idkeyStat(135L, 33L, 1L, true);
        }
        if (wVar2.f53889n) {
            g0Var.idkeyStat(135L, 34L, 1L, true);
        } else {
            g0Var.idkeyStat(135L, 35L, 1L, true);
        }
    }

    public final void a7(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, boolean z17) {
        if (bankcard == null) {
            return;
        }
        java.lang.String str = bankcard.field_bindSerial;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "doSelectBackcard tempSerial:%s，mBindSerial：%s", str, this.f152532s);
        if (android.text.TextUtils.isEmpty(str) || str.equals(this.f152532s)) {
            return;
        }
        i7(bankcard);
        h7();
        r7(0, z17);
        Z6(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, db5.b1
    public void addDialog(android.app.Dialog dialog) {
        if ((dialog instanceof com.tencent.mm.ui.widget.dialog.j0) && this.C1) {
            this.D1 = true;
            dialog.setOnDismissListener(new com.tencent.mm.plugin.offline.ui.f2(this, ((com.tencent.mm.ui.widget.dialog.j0) dialog).L));
        } else if ((dialog instanceof com.tencent.mm.ui.widget.dialog.k2) && this.C1) {
            this.D1 = true;
            dialog.setOnDismissListener(new com.tencent.mm.plugin.offline.ui.g2(this));
        }
        super.addDialog(dialog);
    }

    public final void b7(final com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, final boolean z17, final java.lang.Runnable runnable) {
        if (bankcard == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "doSelectPaymentCompat: %s", bankcard.field_bindSerial);
        if (bankcard.field_bindSerial.equals(this.f152532s)) {
            return;
        }
        if (yo3.m.f() == 2) {
            if (wo3.b.f448141n) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "is doing setpayment, skip");
                o7();
                return;
            } else {
                showLoading(false);
                new wo3.b(bankcard.field_bindSerial, bankcard.field_bankcardType, bankcard.field_defaultCardState).l().h(new gm5.a() { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$a
                    @Override // gm5.a
                    public final java.lang.Object call(java.lang.Object obj) {
                        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                        int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
                        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                        walletOfflineCoinPurseUI.hideLoading();
                        if (!walletOfflineCoinPurseUI.isFinishing() && !walletOfflineCoinPurseUI.isDestroyed()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response: %s, %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
                            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response retcode: %s, %s", java.lang.Integer.valueOf(((r45.i26) fVar.f70618d).f376689d), ((r45.i26) fVar.f70618d).f376690e);
                                r45.i26 i26Var = (r45.i26) fVar.f70618d;
                                if (i26Var.f376689d == 0) {
                                    walletOfflineCoinPurseUI.f152511h2 = null;
                                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
                                    walletOfflineCoinPurseUI.u7();
                                    walletOfflineCoinPurseUI.a7(bankcard, z17);
                                    java.lang.Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                    }
                                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(i26Var.f376690e)) {
                                    db5.e1.t(walletOfflineCoinPurseUI.getContext(), ((r45.i26) fVar.f70618d).f376690e, "", new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$c());
                                }
                            } else {
                                db5.e1.y(walletOfflineCoinPurseUI.getContext(), walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.krq), "", walletOfflineCoinPurseUI.getString(com.tencent.mm.R.string.f490455vj), new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$d());
                            }
                        }
                        return null;
                    }
                }).f(this);
                return;
            }
        }
        this.f152511h2 = null;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
        u7();
        a7(bankcard, z17);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c7() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(false);
        this.f152536u = a17;
        if (a17 != null) {
            this.f152532s = a17.field_bindSerial;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial(): %s", this.f152532s);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    public final void d7() {
        int size = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true).size();
        com.tencent.mm.plugin.wallet_core.model.Bankcard d17 = yo3.m.d(false);
        this.P1.getClass();
        if (to3.c0.Ai().Ri().f448145b != null) {
            this.f152504e = 7;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FREEZE");
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(getBaseContext())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_DISCONNECT_NETWORK");
            this.f152504e = 6;
            return;
        }
        if (yo3.m.k()) {
            if (size == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount == 0");
                this.f152504e = 1;
                return;
            } else if (size == 0 || d17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
                this.f152504e = 5;
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount != 0 && bankcard == null");
                this.f152504e = 2;
                return;
            }
        }
        if (size == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount == 0");
            this.f152504e = 1;
        } else if (size == 0 || d17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
            this.f152504e = 5;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount != 0 && bankcard == null");
            this.f152504e = 2;
        }
    }

    public final void e7(boolean z17, boolean z18) {
        boolean z19 = true;
        if (((java.util.ArrayList) yo3.m.c(true)).size() >= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList size > 0");
            c7();
            h7();
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList== null or size is 0");
        }
        if (z17) {
            r7(0, false);
        }
        Z6(z18);
        if (yo3.m.k()) {
            r45.ak0 ak0Var = ((com.tencent.mm.plugin.offline.ui.h4) component(com.tencent.mm.plugin.offline.ui.h4.class)).f152638d;
            if (ak0Var != null && ak0Var.f370061d != 0) {
                z19 = false;
            }
            if (z19) {
                this.E.setVisibility(0);
                n7();
            }
        }
        this.E.setVisibility(4);
        n7();
    }

    public final void g7(boolean z17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "resetDefaultBankcard");
        yo3.f fVar = yo3.f.f464145a;
        yo3.d dVar = yo3.f.f464146b;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("sImpl");
            throw null;
        }
        dVar.a();
        if (!z17 || (a17 = fVar.a(true)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "newCard : %s，oldCard：：%s", a17.field_bindSerial, this.f152532s);
        if (yo3.m.f() != 2) {
            b7(a17, false, null);
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152536u;
        if (!(bankcard != null && bankcard.z0())) {
            this.K1 = false;
        } else {
            f7(8);
            this.K1 = true;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d7a;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return super.getResources();
    }

    public void h7() {
        boolean z17;
        java.lang.String str;
        at4.k kVar;
        java.lang.String str2;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152536u;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pf8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C.setTextSize(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479897ia));
        if (this.C == null || bankcard == null) {
            if (bankcard == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "setChangeBankcardText bankcard == null");
            }
            z17 = false;
        } else {
            java.lang.String string = bankcard.z0() ? bankcard.f179574m3 : getString(com.tencent.mm.R.string.l1c, bankcard.field_desc);
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            java.util.List list = fj6.f14003l;
            java.util.List<at4.g> list2 = (list == null || list.size() <= 0) ? null : fj6.f14003l;
            if (list2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord)) {
                for (at4.g gVar : list2) {
                    if (gVar.f13855a.equals(bankcard.field_bindSerial)) {
                        break;
                    }
                }
            }
            gVar = null;
            if (gVar == null || com.tencent.mm.sdk.platformtools.t8.K0(gVar.f13856b)) {
                z17 = false;
            } else {
                if (!bankcard.z0()) {
                    string = bankcard.field_desc + gVar.f13856b;
                }
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pf8);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14515, 2);
                this.C.setTextSize(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2));
                z17 = true;
            }
            android.widget.TextView textView = this.C;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            float textSize = this.C.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize));
        }
        if (bankcard != null) {
            if (android.text.TextUtils.isEmpty(this.f152532s)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() mBindSerial is null");
            } else if (bankcard.A0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "show local hy logo");
                this.D.setImageDrawable(m95.a.e(getContext().getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
            } else {
                java.lang.String str3 = this.f152532s;
                java.util.ArrayList a17 = at4.l1.a(true);
                if (android.text.TextUtils.isEmpty(yo3.m.f464158e)) {
                    str = to3.c0.Ai().Ni(196615);
                    yo3.m.f464158e = str;
                } else {
                    str = yo3.m.f464158e;
                }
                java.util.LinkedList p17 = yo3.m.p(str);
                java.lang.String str4 = "";
                if (p17 == null || p17.size() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() cardList == null || cardLogoList == null || cardList.size() == 0 || cardLogoList.size() == 0");
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= a17.size()) {
                            str2 = "";
                            break;
                        }
                        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i17);
                        if (bankcard2 != null && str3.equals(bankcard2.field_bindSerial)) {
                            str2 = bankcard2.field_bankcardType;
                            break;
                        }
                        i17++;
                    }
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        int i18 = 0;
                        while (true) {
                            if (i18 >= p17.size()) {
                                break;
                            }
                            yo3.l lVar = (yo3.l) p17.get(i18);
                            if (lVar != null && str2.equals(lVar.f464152a)) {
                                str4 = lVar.f464153b;
                                break;
                            }
                            i18++;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() bank_type == null, can not find this bank_type");
                    }
                }
                if (bankcard.D0() && (kVar = bankcard.f179562a3) != null) {
                    str4 = kVar.f13878a;
                }
                if (android.text.TextUtils.isEmpty(str4)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() icon_url == null, can not find this icon_url");
                    this.D.setImageBitmap(null);
                } else {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.D;
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9);
                    if (weImageView != null && !android.text.TextUtils.isEmpty(str4)) {
                        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                        gt4.c1 c1Var = new gt4.c1(str4);
                        ((x60.e) fVar).getClass();
                        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                        if (d17 != null) {
                            weImageView.setEnableColorFilter(false);
                            weImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.S(d17, dimensionPixelOffset, dimensionPixelOffset, true, false));
                        }
                        this.f152506f.put(str4, weImageView);
                        this.f152508g.put(str4, java.lang.Integer.valueOf(dimensionPixelOffset));
                    }
                }
            }
        }
        if (z17) {
            this.D.setEnableColorFilter(true);
            this.D.setIconColor(android.graphics.Color.parseColor("#FA9D3B"));
            this.D.setImageResource(com.tencent.mm.R.raw.icons_filled_error);
        }
    }

    public final void i7(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        if (bankcard == null) {
            return;
        }
        java.lang.String bindSerial = bankcard.field_bindSerial;
        this.f152532s = bindSerial;
        this.f152536u = bankcard;
        yo3.f fVar = yo3.f.f464145a;
        kotlin.jvm.internal.o.g(bindSerial, "bindSerial");
        yo3.d dVar = yo3.f.f464146b;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("sImpl");
            throw null;
        }
        dVar.d(bindSerial);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "set current bindSerial: %s, %s", this.f152532s, bankcard.field_bankcardType);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.khh);
        this.f152538v = scrollView;
        scrollView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478545af));
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = (com.tencent.mm.plugin.offline.ui.OfflineAlertView) findViewById(com.tencent.mm.R.id.khc);
        this.R1 = offlineAlertView;
        offlineAlertView.a();
        this.R1.setDialogState(new com.tencent.mm.plugin.offline.ui.q1(this));
        com.tencent.mm.wallet_core.model.g.c().f(getApplicationContext());
        int i17 = this.f152510h;
        if (i17 == 3 || i17 == 10 || i17 == 11 || i17 == 12) {
            setMMTitle(com.tencent.mm.R.string.l1l);
        } else {
            setMMTitle(com.tencent.mm.R.string.l1m);
        }
        com.tencent.mm.plugin.offline.ui.a1 a1Var = new com.tencent.mm.plugin.offline.ui.a1(this, this);
        this.P1 = a1Var;
        a1Var.f152580d = (android.os.Vibrator) a1Var.f152577a.getSystemService("vibrator");
        com.tencent.mm.wallet_core.ui.w wVar = new com.tencent.mm.wallet_core.ui.w(this, true);
        this.O1 = wVar;
        wVar.a();
        this.f152540w = findViewById(com.tencent.mm.R.id.pev);
        this.f152542x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.peu);
        this.f152546y = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pau);
        this.f152550z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.paw);
        this.B = findViewById(com.tencent.mm.R.id.pf7);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pf9);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.pf6);
        this.D = weImageView;
        weImageView.setEnableColorFilter(false);
        this.E = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487662pd1);
        this.F = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pfb);
        this.G = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.pfc);
        this.H = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfa);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pf_);
        this.B.post(new com.tencent.mm.plugin.offline.ui.u1(this));
        this.E.setOnClickListener(new com.tencent.mm.plugin.offline.ui.v1(this));
        android.widget.ImageView imageView = this.f152542x;
        android.view.View.OnClickListener onClickListener = this.f152535t2;
        imageView.setOnClickListener(onClickListener);
        this.f152546y.setOnClickListener(onClickListener);
        this.f152550z.setOnClickListener(onClickListener);
        this.B.setClickable(true);
        this.B.setOnClickListener(new com.tencent.mm.plugin.offline.ui.x1(this));
        this.f152502d = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.offline.ui.r3 r3Var = new com.tencent.mm.plugin.offline.ui.r3(this);
        this.f152498J = r3Var;
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(r3Var);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC;
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        boolean d17 = g17.d(u3Var, u3Var2);
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW;
        if (d17) {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                r3Var.f152635d.setVisibility(0);
                r3Var.e5(rVar, true);
            } else {
                r3Var.f152636e.setText(str);
                r3Var.f152636e.setVisibility(0);
                r3Var.f152637f.setVisibility(0);
                r3Var.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
            }
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f152498J);
        com.tencent.mm.plugin.offline.ui.x3 x3Var = new com.tencent.mm.plugin.offline.ui.x3(this);
        this.K = x3Var;
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(x3Var);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().d(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, u3Var2)) {
            x3Var.f152635d.setVisibility(0);
            x3Var.e5(rVar, true);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.K);
        com.tencent.mm.plugin.offline.ui.j3 j3Var = new com.tencent.mm.plugin.offline.ui.j3(this);
        this.L = j3Var;
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(j3Var);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().d(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, u3Var2)) {
            j3Var.f152635d.setVisibility(0);
            j3Var.e5(rVar, true);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.L);
        com.tencent.mm.plugin.offline.ui.t3 t3Var = new com.tencent.mm.plugin.offline.ui.t3(this);
        this.M = t3Var;
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(t3Var);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().d(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, u3Var2)) {
            t3Var.f152635d.setVisibility(0);
            t3Var.e5(rVar, true);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.M);
        this.N = new com.tencent.mm.plugin.offline.ui.o3(this);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.N);
        int i18 = this.f152510h;
        if (i18 == 3 || i18 == 10 || i18 == 11 || i18 == 12) {
            this.U.setVisibility(8);
            this.V.setVisibility(8);
            this.W.setVisibility(8);
            this.X.setVisibility(8);
        } else {
            this.X.setVisibility(0);
            this.Y.setVisibility(0);
            boolean wi6 = ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).wi(this.f152498J);
            boolean wi7 = ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).wi(this.L);
            boolean wi8 = ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).wi(this.M);
            boolean wi9 = ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).wi(this.K);
            boolean wi10 = ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).wi(this.N);
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "no need scroll");
            } else {
                getWindow().getDecorView().post(new com.tencent.mm.plugin.offline.ui.s1(this, wi6, wi9, wi7, wi8, wi10));
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ade);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.adc);
            if (this.W1) {
                textView.setText(com.tencent.mm.R.string.ado);
                imageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_transfer);
                imageView2.getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9), android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else {
                textView.setText(com.tencent.mm.R.string.f490703af0);
                imageView2.setImageResource(com.tencent.mm.R.raw.bank_remit_transfer);
                imageView2.clearColorFilter();
            }
        }
        this.P = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pcz);
        this.Q = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.pcy);
        this.R = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487661pd0);
        this.Z = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f487663pd2);
        this.f152525p0 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487664pd3);
        if (yo3.m.k()) {
            this.P1.getClass();
            if (to3.c0.Ai().Ri().f448145b != null) {
                this.P1.d(to3.c0.Ai().Ri().f448145b);
            }
        }
        d7();
        e7(true, true);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f152545x2;
        long j17 = this.f152541w2;
        b4Var.c(j17, j17);
        int i19 = yo3.m.f464160g;
        if (i19 == 3 && yo3.m.f464163j) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, is marked!");
            int i27 = yo3.m.f464161h;
            long j18 = yo3.m.f464162i;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j19 = ((i27 * 1000) + j18) - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "expire_time:" + i27 + " beginTime:" + j18 + " now:" + currentTimeMillis + " interval:" + j19);
            if (yo3.m.f464161h <= 0 || yo3.m.f464162i <= 0 || j19 <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "not to start card expire timer!");
            } else {
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f152552z2;
                if (!b4Var2.e()) {
                    b4Var2.d();
                }
                b4Var2.c(j19, j19);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "start card expire timer!");
            }
        } else if (i19 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, not need to mark!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from %d, not need to start timer!", java.lang.Integer.valueOf(i19));
        }
        n7();
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "5";
        walletGetBulletinEvent.f192364d = new com.tencent.mm.plugin.offline.ui.r1(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
    }

    public final void j7(boolean z17) {
        boolean z18;
        if (!yo3.m.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "unOpen %s", java.lang.Boolean.valueOf(yo3.m.k()));
            return;
        }
        if (yo3.m.f() == 2) {
            int n17 = gm0.j1.d().n();
            if (n17 == 6 || n17 == 4) {
                z18 = true;
            } else {
                o7();
                z18 = false;
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "network disabled");
                return;
            }
        }
        if (((java.util.ArrayList) yo3.m.c(false)).size() < 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
            this.C.setVisibility(8);
            return;
        }
        java.util.ArrayList a17 = at4.l1.a(true);
        if (z17 && this.H1 == null) {
            this.H1 = new hs4.d(this);
        } else {
            this.H1 = null;
            this.H1 = new hs4.d(this);
        }
        this.G1 = -1;
        this.H1.c();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = null;
        int i17 = 0;
        for (int i18 = 0; i18 < a17.size(); i18++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i18);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard2.field_bindSerial) && this.f152532s.equals(bankcard2.field_bindSerial)) {
                i17 = i18;
                bankcard = bankcard2;
            }
        }
        if (bankcard != null) {
            a17.remove(bankcard);
            a17.add(0, bankcard);
            i17 = 0;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
        hs4.d dVar = this.H1;
        dVar.f284618c = new com.tencent.mm.plugin.offline.ui.x2(this, a17);
        if (fj6) {
            dVar.f284619d = new com.tencent.mm.plugin.offline.ui.y2(this, a17);
        } else {
            dVar.f284616a.F = new com.tencent.mm.plugin.offline.ui.z2(this, a17);
        }
        if (fj6 && fj6) {
            db5.g4 g4Var = new db5.g4(this);
            g4Var.t(0, "", true);
            hs4.d dVar2 = this.H1;
            com.tencent.mm.plugin.offline.ui.a3 a3Var = new com.tencent.mm.plugin.offline.ui.a3(this);
            dVar2.f284622g = g4Var;
            dVar2.f284620e = a3Var;
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.d79, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.khl);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hdr) + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hdq));
        com.tencent.mm.wallet_core.ui.r1.d((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.khk));
        inflate.findViewById(com.tencent.mm.R.id.khf).setOnClickListener(new com.tencent.mm.plugin.offline.ui.b3(this));
        inflate.findViewById(com.tencent.mm.R.id.khf).setContentDescription(getString(com.tencent.mm.R.string.kdv));
        hs4.d dVar3 = this.H1;
        dVar3.f284626k = true;
        dVar3.f284616a.y(getResources().getString(com.tencent.mm.R.string.kl_));
        hs4.d dVar4 = this.H1;
        dVar4.f284628m = i17;
        dVar4.f284627l = true;
        dVar4.f284616a.t(inflate);
        dVar4.f284625j = inflate;
        this.H1.d();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.offline.ui.c3(this, linearLayout), 500L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13955, 3);
    }

    public final void k7() {
        at4.r0 r0Var = this.f152505e2;
        if (r0Var == null || !r0Var.f13935a) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.R1;
            if (offlineAlertView.f152473d == 8) {
                offlineAlertView.a();
                return;
            }
            return;
        }
        if (this.R1.d(8)) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView2 = this.R1;
            if (offlineAlertView2.f152473d == 8) {
                offlineAlertView2.a();
            }
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView3 = this.R1;
            android.view.View view = this.f152540w;
            at4.r0 r0Var2 = this.f152505e2;
            offlineAlertView3.f152473d = 8;
            offlineAlertView3.setVisibility(0);
            offlineAlertView3.f152476g = false;
            offlineAlertView3.f152475f.removeAllViews();
            android.view.View inflate = android.view.LayoutInflater.from(offlineAlertView3.getContext()).inflate(com.tencent.mm.R.layout.d7e, offlineAlertView3.f152475f, false);
            offlineAlertView3.f152475f.addView(inflate);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j97);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nqv);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.h5h);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.h7o);
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_info);
            weImageView.setIconColor(offlineAlertView3.getResources().getColor(com.tencent.mm.R.color.f479545aa2));
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            at4.q0 b17 = (f17.equals("zh_CN") || f17.equals("zh_HK") || f17.equals("zh_TW")) ? offlineAlertView3.b(r0Var2, f17) : offlineAlertView3.b(r0Var2, "en");
            if (b17 != null) {
                textView.setText(b17.f13927a);
                textView2.setText(b17.f13928b);
                button.setText(b17.f13929c);
            }
            button.setTextColor(offlineAlertView3.getResources().getColor(com.tencent.mm.R.color.f478838io));
            button.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
            button.setOnClickListener(new com.tencent.mm.plugin.offline.ui.n(offlineAlertView3, r0Var2));
            view.post(new com.tencent.mm.plugin.offline.ui.o(offlineAlertView3, view, inflate));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20258, 1);
        }
    }

    public final void l7() {
        if (!this.B1 && this.R1.d(4)) {
            gm0.j1.i();
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue() || this.R1.e()) {
                return;
            }
            m7();
        }
    }

    public final void m7() {
        if (this.R1.d(4)) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.R1;
            android.view.View view = this.f152540w;
            offlineAlertView.setVisibility(0);
            offlineAlertView.f152475f.removeAllViews();
            android.view.View inflate = android.view.LayoutInflater.from(offlineAlertView.getContext()).inflate(com.tencent.mm.R.layout.d7b, (android.view.ViewGroup) null);
            offlineAlertView.f152475f.addView(inflate);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13750, 1);
            offlineAlertView.f152473d = 4;
            android.widget.TextView textView = (android.widget.TextView) offlineAlertView.f152474e.findViewById(com.tencent.mm.R.id.h5h);
            if (textView != null) {
                textView.setOnClickListener(new com.tencent.mm.plugin.offline.ui.u(offlineAlertView));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineAlertView", "iKnowBtn is null!");
            }
            android.widget.TextView textView2 = (android.widget.TextView) offlineAlertView.f152474e.findViewById(com.tencent.mm.R.id.nxl);
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.krp);
                com.tencent.mm.wallet_core.ui.r1.w0(textView2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.krp), 0, textView2.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.offline.ui.v(offlineAlertView), true), offlineAlertView.f152474e.getContext());
                com.tencent.mm.wallet_core.ui.r1.k(textView2, i65.a.h(offlineAlertView.getContext(), com.tencent.mm.R.dimen.f479672c9));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineAlertView", "moreTV is null!");
            }
            view.post(new com.tencent.mm.plugin.offline.ui.w(offlineAlertView, view, inflate));
        }
    }

    public final void n7() {
        if (this.f152537u2 || com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(getBaseContext()) || to3.c0.Ai().wi().a() != 0) {
            return;
        }
        this.f152537u2 = true;
        com.tencent.mars.xlog.Log.e("MicroMsg.OfflineErrorHelper", "offline code size is 0, show check network error dialog");
        db5.e1.G(this, getString(com.tencent.mm.R.string.l1f), null, false, new com.tencent.mm.plugin.offline.ui.g0(this));
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "network disconnect and code count == 0");
    }

    public final void o7() {
        if (this.f152543x0 != null && getContext() != null && (getContext() instanceof android.app.Activity) && !getContext().isDestroyed()) {
            this.f152543x0.cancel();
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getString(com.tencent.mm.R.string.krq);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        this.f152543x0 = e4Var.c();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (yo3.m.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "invalid create coinpurse ui, go offline kinda");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1105, 161);
            ((h45.q) i95.n0.c(h45.q.class)).startOfflinePrePay(getContext(), 4, 0, 0, null, false, "", null);
            finish();
            return;
        }
        yo3.f.f464145a.c();
        this.W1 = ((pg0.a3) i95.n0.c(pg0.a3.class)).nj();
        boolean z17 = true;
        to3.c0.f420951i = true;
        com.tencent.mm.wallet_core.ui.r1.q0(41, 1);
        android.content.Intent intent = getIntent();
        this.B1 = intent.getBooleanExtra("is_offline_create", false);
        if (intent.hasExtra("key_entry_scene")) {
            this.f152510h = intent.getIntExtra("key_entry_scene", this.f152510h);
        }
        this.A1 = intent.getIntExtra("key_from_scene", 0);
        java.lang.String stringExtra = intent.getStringExtra("key_business_attach");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A = stringExtra;
        this.T1 = 1;
        int i17 = this.f152510h;
        if (i17 == 2) {
            this.T1 = 1;
        } else if (i17 == 1) {
            this.T1 = 2;
        } else if (i17 == 8) {
            this.T1 = 4;
        } else if (i17 == 4) {
            this.T1 = 6;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %d", 1);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a()) {
            getWindow().addFlags(8192);
        }
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        setContentViewVisibility(0);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478545af));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478545af));
        hideActionbarLine();
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        setBackBtn(new com.tencent.mm.plugin.offline.ui.g3(this));
        try {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", e17, "", new java.lang.Object[0]);
            getWindow().setFlags(8192, 8192);
            z17 = false;
        }
        if (!z17) {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.h1(), null));
        int i18 = wo3.p.f448206h;
        if (!yo3.m.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "doNetSceneUserBindQuery on create when not open offlinepay");
            wo3.p pVar = new wo3.p(this.f152510h, null, 8, this.X1, this.Y1, this.I1);
            this.I1 = 0;
            doSceneProgress(pVar, false);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is invalid");
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is isUnreg");
            yo3.m.a();
            to3.c0.Ai().Vi(196648, "0");
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            yo3.m.k();
        }
        initView();
        java.lang.String str2 = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                this.f152505e2 = at4.r0.a(new org.json.JSONObject(str2));
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", e18, "", new java.lang.Object[0]);
            }
        }
        this.f152511h2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
        u7();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        wo3.c0 Ri = to3.c0.Ai().Ri();
        if (Ri.f448144a == null) {
            Ri.f448144a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f448144a).add(new java.lang.ref.WeakReference(this));
        addSceneEndListener(606);
        addSceneEndListener(com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeFormatUnSupport);
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX);
        addSceneEndListener(580);
        to3.n wi6 = to3.c0.Ai().wi();
        if (wi6.f420942a != null) {
            wi6.f420942a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) wi6.f420942a).add(new java.lang.ref.WeakReference(this));
        this.f152533s2.alive();
        to3.c0.Ai().Vi(196643, "1");
        this.f152529q2.alive();
        this.f152523o2.alive();
        this.f152514j2.alive();
        this.f152515k2.alive();
        java.util.ArrayList arrayList = yo3.f.f464147c;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.f152517l2.alive();
        this.f152519m2.alive();
        this.f152521n2.alive();
        this.f152551z1 = new to3.q();
        com.tencent.mm.autogen.events.OfflineCreateEvent offlineCreateEvent = new com.tencent.mm.autogen.events.OfflineCreateEvent();
        offlineCreateEvent.f54556g.f6262a = hashCode();
        offlineCreateEvent.e();
        this.f152527p2.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory()");
        if (yo3.m.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory() from kindaOffline enable");
            super.onDestroy();
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152536u;
        if (bankcard != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "mBindSerial:%s serial:%s", this.f152532s, bankcard.field_bindSerial);
            if (at4.l1.b(this.f152536u)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory：do set as default card");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory：do not set as default card");
                g7(false);
            }
        }
        this.R1.a();
        to3.c0.f420951i = false;
        com.tencent.mm.wallet_core.ui.r1.n0(this.f152512i);
        com.tencent.mm.wallet_core.ui.r1.n0(this.f152518m);
        java.util.ArrayList arrayList = this.M1;
        com.tencent.mm.wallet_core.ui.r1.o0(arrayList);
        java.util.ArrayList arrayList2 = this.N1;
        com.tencent.mm.wallet_core.ui.r1.o0(arrayList2);
        arrayList.clear();
        arrayList2.clear();
        this.f152524p.clear();
        this.f152528q.clear();
        this.f152530r.clear();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        to3.c0.Ai().Ri().j(this);
        removeSceneEndListener(606);
        removeSceneEndListener(com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeFormatUnSupport);
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX);
        removeSceneEndListener(580);
        to3.n wi6 = to3.c0.Ai().wi();
        if (wi6.f420942a != null) {
            for (int i17 = 0; i17 < ((java.util.ArrayList) wi6.f420942a).size(); i17++) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) wi6.f420942a).get(i17);
                if (weakReference != null && (obj = weakReference.get()) != null && obj.equals(this)) {
                    weakReference.clear();
                    ((java.util.ArrayList) wi6.f420942a).remove(weakReference);
                }
            }
        }
        this.f152533s2.dead();
        this.f152529q2.dead();
        this.f152514j2.dead();
        this.f152515k2.dead();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f152545x2;
        if (!b4Var.e()) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f152552z2;
        if (!b4Var2.e()) {
            b4Var2.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f152549y2;
        if (!b4Var3.e()) {
            b4Var3.d();
        }
        com.tencent.mm.wallet_core.ui.w wVar = this.O1;
        if (wVar != null) {
            wVar.b();
        }
        com.tencent.mm.plugin.offline.ui.a1 a1Var = this.P1;
        if (a1Var != null) {
            a1Var.f152580d.cancel();
            a1Var.f152577a = null;
        }
        this.f152523o2.dead();
        this.f152519m2.dead();
        this.f152521n2.dead();
        to3.q qVar = this.f152551z1;
        qVar.g();
        to3.q.e();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, qVar.f420975a);
        qVar.f420976b = null;
        this.f152527p2.dead();
        this.f152517l2.dead();
        tw3.b.f422479a = 0;
        yo3.f fVar = yo3.f.f464145a;
        yo3.f.f464147c.remove(this);
        fVar.c();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView;
        if (i17 == 4 && (offlineAlertView = this.R1) != null && offlineAlertView.getVisibility() == 0) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView2 = this.R1;
            if (offlineAlertView2.f152476g) {
                offlineAlertView2.a();
                return true;
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on new intent");
        this.f152520n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0085, code lost:
    
        if (yo3.m.m() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02be  */
    @Override // wo3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNotify(wo3.v r24) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.onNotify(wo3.v):boolean");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        to3.a0 Ui = to3.c0.Ai().Ui();
        Ui.f420945f.removeCallbacks(Ui.f420947h);
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        this.Q1 = false;
        this.f152531r2.dead();
        this.f152551z1.g();
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f152543x0;
        if (f4Var != null) {
            f4Var.cancel();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        boolean z17;
        java.lang.String str;
        super.onResume();
        to3.c0.f420951i = true;
        this.f152531r2.alive();
        try {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", e17, "", new java.lang.Object[0]);
        }
        if (!this.S1) {
            p7();
            X6();
            q7();
            k7();
            l7();
            this.S1 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on resume");
        this.Q1 = true;
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
        if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(getBaseContext())) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s()) {
                doSceneForceProgress(new ss4.e0(null, 8));
            }
            if (yo3.m.k() && this.f152500b2) {
                to3.c0.Ai().Ui().e(false);
                this.P1.getClass();
                if (!(to3.c0.Ai().Ri().f448145b != null)) {
                    int i17 = wo3.p.f448206h;
                    if (this.J1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "do not doNetSceneUserBindQuery()");
                        this.J1 = false;
                    } else if (this.f152503d2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "callbackFromKinda，do not doSceneUserBindQuery");
                        this.f152503d2 = false;
                        this.f152501c2 = false;
                    } else if (this.f152501c2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "is paying in kinda，do not doSceneUserBindQuery");
                    } else {
                        wo3.p pVar = new wo3.p(this.f152510h, null, 8, this.X1, this.Y1, this.I1);
                        this.I1 = 0;
                        doSceneProgress(pVar, false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "do doNetSceneUserBindQuery()");
                    }
                }
            }
        }
        if (!this.f152500b2) {
            this.f152500b2 = true;
        }
        d7();
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(false);
        if (a17 == null || (str = a17.field_bindSerial) == null || str.equals(this.f152532s)) {
            z17 = false;
        } else {
            i7(a17);
            z17 = true;
        }
        if (z17 || (this.f152522o && this.f152520n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onresume BindSerial isChange");
            this.f152522o = false;
            this.f152520n = false;
            h7();
            r7(0, false);
            Z6(true);
        }
        to3.q qVar = this.f152551z1;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "OFFLINEGETMSGLOGIN START; IS stopped=" + qVar.f420976b.e());
        com.tencent.mm.sdk.platformtools.b4 b4Var = qVar.f420976b;
        if (b4Var == null || b4Var.e()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 61L, 1L, true);
            to3.q.e();
            long j17 = 5000;
            qVar.f420976b.c(j17, j17);
        }
        if (this.Z1) {
            this.Z1 = false;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18930, java.lang.Integer.valueOf(this.f152499a2), 4);
        }
        this.f152507f2 = false;
        this.f152509g2 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x054e  */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r26, int r27, java.lang.String r28, com.tencent.mm.modelbase.m1 r29) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    public final void p7() {
        if (this.R1.d(1)) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.R1;
            if (offlineAlertView.f152473d == 1) {
                offlineAlertView.a();
            }
            boolean y17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y();
            boolean x17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x();
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            boolean z17 = false;
            if (v1Var != null) {
                if ((v1Var.field_is_reg == 1) && v1Var.field_isDomesticUser) {
                    if (v1Var.field_authen_account_type == 0) {
                        z17 = true;
                    }
                }
            }
            if (y17 || x17 || z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "unreg: %B, simplereg: %B, isRegButUnRealname: %B", java.lang.Boolean.valueOf(y17), java.lang.Boolean.valueOf(x17), java.lang.Boolean.valueOf(z17));
                this.R1.f(this.f152540w, new com.tencent.mm.plugin.offline.ui.l2(this), 1);
            }
        }
    }

    public final void q7() {
        if (this.R1.d(3)) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.R1;
            if (offlineAlertView.f152473d == 3) {
                offlineAlertView.a();
            }
            java.lang.String Ni = to3.c0.Ai().Ni(196617);
            boolean g17 = com.tencent.mm.wallet_core.model.g.c().g(Ni);
            boolean k17 = yo3.m.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "show unopened alert, %B, %B", java.lang.Boolean.valueOf(g17), java.lang.Boolean.valueOf(k17));
            if (g17 && k17) {
                return;
            }
            if (!g17) {
                gm0.j1.i();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "");
                if (str == null || !str.equals(wo.w0.g(true))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is diff between create and getToken");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is same between create and getToken");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineEntranceUI CertUtil.getInstance().isCertExist(cn) is false ,cn == " + Ni + " ,recreate offline");
                yo3.m.a();
            }
            this.E.setVisibility(4);
            this.R1.f(this.f152540w, new com.tencent.mm.plugin.offline.ui.m2(this), 3);
        }
    }

    public final void r7(final int i17, boolean z17) {
        if (!yo3.m.k()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "offline is not create!");
            return;
        }
        r45.ak0 ak0Var = ((com.tencent.mm.plugin.offline.ui.h4) component(com.tencent.mm.plugin.offline.ui.h4.class)).f152638d;
        if (!(ak0Var == null || ak0Var.f370061d == 0)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "token is disabled");
            return;
        }
        if (wo3.b.f448141n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "is doing setofflinepayment, skip update code");
            return;
        }
        if (this.f152536u == null || yo3.m.f() != 2 || z17 || at4.l1.b(this.f152536u)) {
            t7(i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "update undefault card, need do setpayment");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152536u;
        new wo3.b(bankcard.field_bindSerial, bankcard.field_bankcardType, bankcard.field_defaultCardState).l().h(new gm5.a() { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$b
            @Override // gm5.a
            public final java.lang.Object call(java.lang.Object obj) {
                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                int i18 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
                com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this;
                if (walletOfflineCoinPurseUI.isFinishing() || walletOfflineCoinPurseUI.isDestroyed()) {
                    return null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response: %s, %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
                if (fVar.f70615a != 0 || fVar.f70616b != 0) {
                    return null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response retcode: %s, %s", java.lang.Integer.valueOf(((r45.i26) fVar.f70618d).f376689d), ((r45.i26) fVar.f70618d).f376690e);
                if (((r45.i26) fVar.f70618d).f376689d != 0) {
                    return null;
                }
                walletOfflineCoinPurseUI.t7(i17);
                walletOfflineCoinPurseUI.Z6(true);
                return null;
            }
        }).f(this);
    }

    public void s7() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f152545x2;
        if (!b4Var.e()) {
            b4Var.d();
        }
        r7(0, false);
        Z6(true);
        this.f152548y1 = false;
        long j17 = this.f152541w2;
        b4Var.c(j17, j17);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.offline.ui.m3.class);
        hashSet.add(com.tencent.mm.plugin.offline.ui.h4.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t7(int i17) {
        java.lang.Object[] objArr;
        java.lang.String str;
        java.util.LinkedList o17;
        java.lang.String str2;
        to3.n wi6 = to3.c0.Ai().wi();
        int i18 = this.f152510h;
        java.lang.String str3 = this.A;
        wi6.getClass();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generatetKey scene %s isSnapshot %s stack: %s", valueOf, valueOf2, com.tencent.mm.sdk.platformtools.z3.b(true));
        int a17 = wi6.a();
        java.lang.String str4 = "";
        if (a17 > 0) {
            if (a17 < to3.c0.Bi()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount < %s", java.lang.Integer.valueOf(to3.c0.Bi()));
                to3.c0.Ai().Ui().c(2, 2);
            }
            java.lang.String Ni = to3.c0.Ai().Ni(196617);
            if (android.text.TextUtils.isEmpty(Ni)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineCodesMgr", "generateKey_V3 cn is null, the csr is not exist! cn:" + Ni);
            } else {
                com.tencent.mm.wallet_core.model.g.c().getClass();
                com.tencent.mm.sdk.platformtools.z3.b(true);
                java.lang.String token = com.tenpay.ndk.CertUtil.getInstance().getToken(Ni);
                if (android.text.TextUtils.isEmpty(token)) {
                    to3.c0.Ai().Ui().b(1, 1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null");
                } else {
                    long j17 = 0;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(token)) {
                        objArr = false;
                    } else {
                        long parseLong = java.lang.Long.parseLong(token);
                        java.lang.Object[] objArr2 = (parseLong & 4503599627370496L) == 0;
                        java.lang.Long.toBinaryString(parseLong);
                        objArr = objArr2;
                    }
                    yo3.m.u(objArr == true ? 2 : 1);
                    yo3.m.l();
                    if (token != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code length : %s ext_business_attach %s %s", java.lang.Integer.valueOf(token.length()), str3, token);
                    }
                    int i19 = a17 - 1;
                    wo3.n nVar = new wo3.n(i19, i18, i17, 0, str3, objArr != false ? "1" : "0");
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(nVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "doNetSceneShowCode count " + i19);
                    if (yo3.m.j(token)) {
                        long longValue = java.lang.Long.valueOf(token, 10).longValue();
                        if (objArr == true) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "is online code");
                        } else {
                            if (!android.text.TextUtils.isEmpty(yo3.m.f464156c)) {
                                str = yo3.m.f464156c;
                            } else if (android.text.TextUtils.isEmpty(yo3.m.f464156c)) {
                                str = to3.c0.Ai().Ni(196656);
                                yo3.m.f464156c = str;
                            } else {
                                if (android.text.TextUtils.isEmpty(yo3.m.f464156c)) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "offline_card_list is null");
                                }
                                str = yo3.m.f464156c;
                            }
                            if (!android.text.TextUtils.isEmpty(str)) {
                                try {
                                    o17 = yo3.m.o(new org.json.JSONArray(str));
                                } catch (org.json.JSONException e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOfflineUtil", e17, "", new java.lang.Object[0]);
                                }
                                if (o17 != null || o17.size() == 0) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 cardList is null");
                                    to3.c0.Ai().Ui().b(1, 1);
                                } else {
                                    for (int i27 = 0; i27 < o17.size(); i27++) {
                                        yo3.k kVar = (yo3.k) o17.get(i27);
                                        if (kVar != null && (str2 = kVar.f464151b) != null && str2.equals(wi6.f420970b)) {
                                            j17 = kVar.f464150a;
                                        }
                                    }
                                    longValue |= j17 << 48;
                                }
                            }
                            o17 = null;
                            if (o17 != null) {
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 cardList is null");
                            to3.c0.Ai().Ui().b(1, 1);
                        }
                        java.lang.String str5 = "" + longValue;
                        if (str5.length() == 15) {
                            str5 = "0".concat(str5);
                        } else if (str5.length() == 14) {
                            str5 = "00".concat(str5);
                        } else if (str5.length() == 13) {
                            str5 = "000".concat(str5);
                        } else if (str5.length() == 12) {
                            str5 = "0000".concat(str5);
                        }
                        str4 = android.text.TextUtils.isEmpty(to3.c0.Ai().Ni(196647)) ? "12" + str5 : to3.c0.Ai().Ni(196647) + str5;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null or is not isNumeric");
                    }
                }
            }
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(14163, 2, java.lang.Integer.valueOf(!com.tencent.mm.app.w.INSTANCE.f53889n ? 1 : 0), java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 0));
            g0Var.idkeyStat(135L, 29L, 1L, true);
            if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                g0Var.idkeyStat(135L, 31L, 1L, true);
            } else {
                g0Var.idkeyStat(135L, 30L, 1L, true);
            }
            to3.c0.Ai().Ui().b(1, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount is 0");
        }
        this.f152526p1 = str4;
        this.f152516l1 = str4;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        r45.r1 c17 = at4.g0.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f152516l1);
        gm0.j1.i();
        sb6.append(kk.v.a(gm0.j1.b().h()));
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
        if (c17 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13444, c17.f384412i, c17.f384413m, java.lang.Long.valueOf(c17.f384411h), a18, c17.f384414n, c17.f384415o, c17.f384416p);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(14163, 1, java.lang.Integer.valueOf(!com.tencent.mm.app.w.INSTANCE.f53889n ? 1 : 0), java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(getBaseContext()) ? 1 : 0));
            g0Var2.idkeyStat(135L, 26L, 1L, true);
            if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(getBaseContext())) {
                g0Var2.idkeyStat(135L, 28L, 1L, true);
            } else {
                g0Var2.idkeyStat(135L, 27L, 1L, true);
            }
        }
    }

    public final void u7() {
        boolean z17;
        java.lang.String str;
        if (!(yo3.m.f() == 2) || com.tencent.mm.sdk.platformtools.t8.K0(this.f152511h2)) {
            this.Z.setVisibility(8);
            z17 = false;
        } else {
            this.Z.setVisibility(0);
            this.f152525p0.setText(this.f152511h2);
            z17 = true;
        }
        if (z17) {
            return;
        }
        r45.ey4 ey4Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14005n;
        if (ey4Var == null) {
            this.F.setVisibility(8);
            return;
        }
        if (ey4Var.f373810d == 1) {
            r45.fy4 fy4Var = ey4Var.f373811e;
            if (fy4Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "offlineGuideBar.guide_data == null");
                this.F.setVisibility(8);
                return;
            }
            java.lang.String str2 = fy4Var.f374730d;
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().g(str2, false, false) == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr[0] = str2 != null ? str2 : "";
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "updateOfflineGuideBar bindSerial(%s) is null bankcard!", objArr);
                this.F.setVisibility(8);
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152536u;
            if (bankcard != null && (str = bankcard.field_bindSerial) != null && com.tencent.mm.sdk.platformtools.t8.D0(ey4Var.f373811e.f374730d, str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "updateOfflineGuideBar defaultBankcard(%s) == bindSerial(%s)", bankcard.field_bindSerial, ey4Var.f373811e.f374730d);
                this.F.setVisibility(8);
                return;
            }
        }
        if (this.F.isShown() && this.F.getTag() != null && (this.F.getTag() instanceof r45.ey4) && com.tencent.mm.sdk.platformtools.t8.C0((r45.ey4) this.F.getTag(), ey4Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "");
            return;
        }
        if (ey4Var.f373812f == 0) {
            this.F.setVisibility(8);
            return;
        }
        if (!this.E1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineCoinPurseUI", "isShowGuideBar == false");
            return;
        }
        int visibility = this.F.getVisibility();
        this.F.setTag(ey4Var);
        this.F.setVisibility(0);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 20.0f);
        this.G.b(ey4Var.f373818o, d17, d17, -1);
        this.H.setText(ey4Var.f373813g);
        this.I.setText(ey4Var.f373815i);
        com.tencent.mm.ui.bk.r0(this.I.getPaint(), 0.8f);
        int i17 = ey4Var.f373810d;
        if (i17 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ey4Var.f373819p) && this.F.getBackground() != null) {
                this.F.getBackground().setColorFilter(android.graphics.Color.parseColor(ey4Var.f373819p), android.graphics.PorterDuff.Mode.SRC);
            }
            this.H.setTextColor(android.graphics.Color.parseColor(ey4Var.f373814h));
            this.I.setTextColor(android.graphics.Color.parseColor(ey4Var.f373816m));
            this.I.setTag(ey4Var.f373811e.f374730d);
            this.I.setOnClickListener(new com.tencent.mm.plugin.offline.ui.z1(this));
            f7(1);
            this.L1 = true;
        } else if (i17 == 2) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ey4Var.f373819p) && this.F.getBackground() != null) {
                this.F.getBackground().setColorFilter(W6(java.lang.Long.parseLong(ey4Var.f373819p.substring(2), 16)), android.graphics.PorterDuff.Mode.SRC);
            }
            this.H.setTextColor(W6(java.lang.Long.parseLong(ey4Var.f373814h.substring(2), 16)));
            this.I.setTextColor(W6(java.lang.Long.parseLong(ey4Var.f373816m.substring(2), 16)));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ey4Var.f373817n)) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.I.getLayoutParams();
                layoutParams.rightMargin = i65.a.b(getContext(), 8);
                this.I.setLayoutParams(layoutParams);
                this.I.setPadding(i65.a.b(getContext(), 12), i65.a.b(getContext(), 4), i65.a.b(getContext(), 12), i65.a.b(getContext(), 4));
                int W6 = W6(java.lang.Long.parseLong(ey4Var.f373817n.substring(2), 16));
                this.I.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bad));
                ((android.graphics.drawable.GradientDrawable) this.I.getBackground()).setColor(W6);
                this.I.setOnTouchListener(new com.tencent.mm.plugin.offline.ui.a2(this, W6));
            }
            this.I.setOnClickListener(new com.tencent.mm.plugin.offline.ui.c2(this, ey4Var));
            f7(4);
            this.L1 = false;
        }
        if (visibility == 8 && this.R1.e()) {
            l7();
            if (!this.B1 && this.R1.d(4)) {
                gm0.j1.i();
                if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                    return;
                }
                m7();
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "setScreenShotCallback");
        r7(1, false);
        Z6(true);
        com.tencent.mm.wallet_core.ui.r1.q0(40, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 21L, 1L, true);
        if (!this.O1.f214252h.isShowing()) {
            m7();
            return;
        }
        com.tencent.mm.wallet_core.ui.w wVar = this.O1;
        if (wVar.f214250f) {
            android.view.ViewGroup viewGroup = wVar.f214258n;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                wVar.f214258n.post(new com.tencent.mm.wallet_core.ui.u(wVar));
                return;
            }
            return;
        }
        db5.d5 d5Var = wVar.f214252h;
        if (d5Var != null && d5Var.isShowing()) {
            wVar.f214252h.dismiss();
        }
        m7();
    }
}
