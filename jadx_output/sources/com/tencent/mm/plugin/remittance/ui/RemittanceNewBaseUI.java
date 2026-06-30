package com.tencent.mm.plugin.remittance.ui;

@db5.a(1026)
/* loaded from: classes9.dex */
public abstract class RemittanceNewBaseUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements kv.e0, mp5.v, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: s2, reason: collision with root package name */
    public static final /* synthetic */ int f157428s2 = 0;
    public android.widget.LinearLayout A;
    public java.lang.String A1;
    public android.widget.LinearLayout B;
    public com.tencent.mm.ui.widget.dialog.z2 B1;
    public android.widget.LinearLayout C;
    public com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage C1;
    public android.widget.RelativeLayout D;
    public long D1;
    public android.widget.TextView E;
    public java.lang.String E1;
    public android.widget.RelativeLayout F;
    public long F1;
    public java.lang.String G;
    public boolean G1;
    public java.lang.String H;
    public java.lang.String H1;
    public java.lang.String I;
    public java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f157429J;
    public int J1;
    public int K;
    public final int K1;
    public java.lang.String L;
    public boolean L1;
    public java.lang.String M;
    public android.widget.LinearLayout M1;
    public java.lang.String N;
    public android.widget.LinearLayout N1;
    public android.widget.TextView O1;
    public int P;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView P1;
    public int Q;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView Q1;
    public int R;
    public android.widget.TextView R1;
    public int S;
    public android.widget.LinearLayout S1;
    public java.lang.String T;
    public android.widget.LinearLayout T1;
    public java.lang.String U;
    public android.widget.TextView U1;
    public java.lang.String V;
    public android.widget.TextView V1;
    public java.lang.String W;
    public android.widget.TextView W1;
    public java.lang.String X;
    public android.widget.ProgressBar X1;
    public boolean Y;
    public android.widget.TextView Y1;
    public final java.util.Map Z;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f157430a2;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f157431b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f157432c2;

    /* renamed from: d, reason: collision with root package name */
    public nr4.a f157433d;

    /* renamed from: d2, reason: collision with root package name */
    public final java.lang.Runnable f157434d2;

    /* renamed from: e, reason: collision with root package name */
    public double f157435e;

    /* renamed from: e2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157436e2;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157437f;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f157438f2;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157439g;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f157440g2;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f157441h;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f157442h2;

    /* renamed from: i, reason: collision with root package name */
    public int f157443i;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f157444i2;

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157445j2;

    /* renamed from: k2, reason: collision with root package name */
    public r45.o10 f157446k2;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f157447l1;

    /* renamed from: l2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157448l2;

    /* renamed from: m, reason: collision with root package name */
    public int f157449m;

    /* renamed from: m2, reason: collision with root package name */
    public int f157450m2;

    /* renamed from: n, reason: collision with root package name */
    public int f157451n;

    /* renamed from: n2, reason: collision with root package name */
    public double f157452n2;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f157453o;

    /* renamed from: o2, reason: collision with root package name */
    public java.lang.String f157454o2;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f157455p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f157456p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.q0 f157457p1;

    /* renamed from: p2, reason: collision with root package name */
    public java.lang.String f157458p2;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f157459q;

    /* renamed from: q2, reason: collision with root package name */
    public java.lang.String f157460q2;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f157461r;

    /* renamed from: r2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157462r2;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f157463s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f157464t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f157465u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f157466v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f157467w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f157468x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f157469x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.o1 f157470x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f157471y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f157472y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct f157473y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ScrollView f157474z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f157475z1;

    /* loaded from: classes9.dex */
    public static class PayCheckStrut {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f157547a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f157548b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f157549c;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f157550d;

        /* renamed from: e, reason: collision with root package name */
        public final int f157551e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f157552f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f157553g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.String f157554h;

        /* renamed from: i, reason: collision with root package name */
        public final long f157555i;

        public PayCheckStrut(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, java.lang.String str7, long j17) {
            this.f157547a = str;
            this.f157548b = str2;
            this.f157549c = str3;
            this.f157550d = str4;
            this.f157551e = i17;
            this.f157552f = str5;
            this.f157553g = str6;
            this.f157554h = str7;
            this.f157555i = j17;
        }
    }

    public RemittanceNewBaseUI() {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
        this.f157433d = null;
        this.f157451n = -1;
        this.G = "";
        this.H = "";
        this.M = null;
        this.N = null;
        this.R = 4;
        this.X = "";
        this.Z = new java.util.HashMap();
        this.f157472y0 = false;
        this.f157447l1 = false;
        this.f157475z1 = false;
        this.G1 = false;
        this.H1 = "";
        this.I1 = "";
        this.J1 = 0;
        this.K1 = 2;
        this.L1 = true;
        this.Z1 = false;
        this.f157430a2 = false;
        this.f157431b2 = false;
        this.f157432c2 = 0;
        this.f157434d2 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.f157432c2 == 2 && remittanceNewBaseUI.isHandleAutoShowNormalStWcKb()) {
                    remittanceNewBaseUI.showNormalStWcKb();
                }
            }
        };
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f157436e2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.21
            {
                this.__eventId = -260010650;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent walletErrorCodeDialogClickEvent) {
                com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent walletErrorCodeDialogClickEvent2 = walletErrorCodeDialogClickEvent;
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.G1) {
                    com.tencent.mm.plugin.remittance.model.o1 o1Var = remittanceNewBaseUI.f157470x1;
                    if (o1Var != null && com.tencent.mm.sdk.platformtools.t8.D0(o1Var.getReqResp().getUri(), walletErrorCodeDialogClickEvent2.f54954g.f6806a)) {
                        if (remittanceNewBaseUI.f157470x1.f156924r.f378212n == 1) {
                            remittanceNewBaseUI.finish();
                        }
                    }
                } else {
                    com.tencent.mm.plugin.remittance.model.q0 q0Var = remittanceNewBaseUI.f157457p1;
                    if (q0Var != null && com.tencent.mm.sdk.platformtools.t8.D0(q0Var.getUri(), walletErrorCodeDialogClickEvent2.f54954g.f6806a)) {
                        if (remittanceNewBaseUI.f157457p1.T == 1) {
                            remittanceNewBaseUI.finish();
                        }
                    }
                }
                return false;
            }
        };
        this.f157438f2 = false;
        this.f157440g2 = false;
        this.f157442h2 = false;
        this.f157444i2 = false;
        this.f157445j2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.27
            {
                this.__eventId = -84556123;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent remittanceLargeMoneyPayEvent) {
                am.rq rqVar;
                com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent remittanceLargeMoneyPayEvent2 = remittanceLargeMoneyPayEvent;
                if (remittanceLargeMoneyPayEvent2 == null || (rqVar = remittanceLargeMoneyPayEvent2.f54676g) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "event == null || event.data == null");
                    return false;
                }
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "LargeMoney callback，mPlaceOrderAttach：%s event:%s", remittanceNewBaseUI.f157469x0, rqVar.f7834a);
                if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.f157469x0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "carsonhe mPlaceOrderAttach is null ");
                    return false;
                }
                if (!remittanceNewBaseUI.f157469x0.equals(rqVar.f7834a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "mPlaceOrderAttach not equals ");
                    return false;
                }
                remittanceNewBaseUI.f157435e = rqVar.f7835b;
                remittanceNewBaseUI.Z6(remittanceNewBaseUI.f157469x0);
                remittanceNewBaseUI.f157445j2.dead();
                return false;
            }
        };
        this.f157446k2 = null;
        this.f157448l2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.F2fDynamicStartPayEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.38
            {
                this.__eventId = -1113934945;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
                com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent2 = f2fDynamicStartPayEvent;
                if (f2fDynamicStartPayEvent2.f54222g.f6544c == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15386, 4, 1);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15386, 5, 1);
                }
                am.e9 e9Var = f2fDynamicStartPayEvent2.f54222g;
                java.lang.String str = e9Var.f6542a;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "receive dynamic req: %s, %s", java.lang.Integer.valueOf(e9Var.f6544c), str);
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.f157449m == 33) {
                    java.lang.String str2 = remittanceNewBaseUI.G;
                    int i17 = remittanceNewBaseUI.f157451n;
                    remittanceNewBaseUI.getClass();
                    remittanceNewBaseUI.b7(str2, i17, null, null, remittanceNewBaseUI.H, remittanceNewBaseUI.I, str, f2fDynamicStartPayEvent2);
                    return false;
                }
                java.lang.String str3 = remittanceNewBaseUI.G;
                int i18 = remittanceNewBaseUI.f157451n;
                remittanceNewBaseUI.getClass();
                remittanceNewBaseUI.b7(str3, i18, null, null, remittanceNewBaseUI.H, null, str, f2fDynamicStartPayEvent2);
                return false;
            }
        };
        this.f157450m2 = 0;
        this.f157452n2 = 0.0d;
        this.f157454o2 = "";
        this.f157458p2 = "";
        this.f157460q2 = "";
        this.f157462r2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.F2fPayCheckEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.42
            {
                this.__eventId = 1822922800;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent) {
                com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent2 = f2fPayCheckEvent;
                am.g9 g9Var = f2fPayCheckEvent2.f54224g;
                java.lang.String str = g9Var.f6743a;
                boolean z17 = g9Var.f6745c;
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                if (z17) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.RemittanceNewBaseUI", "F2fPayCheckEvent is from kinda");
                    remittanceNewBaseUI.f157447l1 = false;
                    com.tencent.mm.sdk.platformtools.u3.i(remittanceNewBaseUI.f157434d2, 300L);
                    am.g9 g9Var2 = f2fPayCheckEvent2.f54224g;
                    int i17 = g9Var2.f6746d;
                    boolean z18 = true;
                    if (i17 == 1 || i17 == 3) {
                        if (i17 == 3 && remittanceNewBaseUI.f157449m == 31) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "from wallet mix callback, ignore paycheck");
                        } else {
                            remittanceNewBaseUI.Y6(str, g9Var2.f6744b);
                        }
                        if (g9Var2.f6747e != remittanceNewBaseUI.getContext().hashCode()) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceNewBaseUI", "callback to wrong page: %s, %s", java.lang.Integer.valueOf(g9Var2.f6747e), java.lang.Integer.valueOf(remittanceNewBaseUI.getContext().hashCode()));
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.W)) {
                            kw3.p.Ai().Di().d(remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.f157439g, "");
                        } else {
                            kw3.p.Ai().Di().d(remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.W, remittanceNewBaseUI.f157439g);
                        }
                        if (remittanceNewBaseUI.D1 > 0) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.W)) {
                                com.tencent.mm.plugin.remittance.model.h.f156847b.a(remittanceNewBaseUI.f157439g, remittanceNewBaseUI.D1, remittanceNewBaseUI.E1, remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.F1);
                            } else {
                                com.tencent.mm.plugin.remittance.model.h.f156847b.a(remittanceNewBaseUI.W, remittanceNewBaseUI.D1, remittanceNewBaseUI.E1, remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.F1);
                            }
                        }
                    } else if (i17 == 2) {
                        int i18 = remittanceNewBaseUI.f157443i;
                        if (i18 != 2 && i18 != 5) {
                            z18 = false;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.f157439g) || z18) {
                            remittanceNewBaseUI.finish();
                        } else {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Chat_User", remittanceNewBaseUI.f157439g);
                            intent.putExtra("finish_direct", false);
                            j45.l.u(remittanceNewBaseUI, ".ui.chatting.ChattingUI", intent, null);
                        }
                    } else if (i17 == 4 && remittanceNewBaseUI.f157449m == 31) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "get hasTryHKPay from kinda is : %s", java.lang.Boolean.valueOf(g9Var2.f6748f));
                        remittanceNewBaseUI.f157431b2 = g9Var2.f6748f;
                    }
                } else {
                    java.lang.String str2 = g9Var.f6744b;
                    int i19 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                    remittanceNewBaseUI.Y6(str, str2);
                }
                return false;
            }
        };
    }

    public static void W6(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.G)) {
            remittanceNewBaseUI.f157465u.setVisibility(8);
            if (remittanceNewBaseUI.f157443i == 1) {
                remittanceNewBaseUI.m7(remittanceNewBaseUI.getString(com.tencent.mm.R.string.hyd));
            } else {
                remittanceNewBaseUI.m7(remittanceNewBaseUI.getString(com.tencent.mm.R.string.hyc));
            }
            remittanceNewBaseUI.f157466v.setVisibility(0);
            return;
        }
        java.lang.String string = remittanceNewBaseUI.getString(com.tencent.mm.R.string.f492824i05);
        java.lang.String string2 = remittanceNewBaseUI.getString(com.tencent.mm.R.string.b9z, remittanceNewBaseUI.G, string);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(remittanceNewBaseUI, string2);
        com.tencent.mm.wallet_core.ui.r1.w0(remittanceNewBaseUI.f157465u, i17.toString(), i17.length() - string.length(), i17.length(), new com.tencent.mm.wallet_core.ui.a0(new com.tencent.mm.wallet_core.ui.z() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.10
            @Override // com.tencent.mm.wallet_core.ui.z
            public void onClick(android.view.View view) {
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.X6(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this);
            }
        }, true), remittanceNewBaseUI.getContext());
        remittanceNewBaseUI.f157466v.setVisibility(8);
        remittanceNewBaseUI.f157465u.setVisibility(0);
    }

    public static void X6(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI) {
        remittanceNewBaseUI.showCircleStWcKb();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(12689, 9, 1);
        int i17 = remittanceNewBaseUI.f157443i;
        if (i17 == 1 || i17 == 6) {
            java.lang.String string = remittanceNewBaseUI.getString(com.tencent.mm.R.string.hyd);
            java.lang.String string2 = remittanceNewBaseUI.getString(com.tencent.mm.R.string.hz8);
            g0Var.d(14074, 1);
            gt4.l.b(remittanceNewBaseUI, string, remittanceNewBaseUI.G, string2, true, 20, new db5.a1() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.44
                @Override // db5.a1
                public boolean onFinish(java.lang.CharSequence charSequence) {
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString());
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI2 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                    if (K0) {
                        remittanceNewBaseUI2.G = null;
                    } else {
                        remittanceNewBaseUI2.G = charSequence.toString();
                    }
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.W6(remittanceNewBaseUI2);
                    return true;
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.45
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.45.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.hideVKB();
                        }
                    }, 500L);
                }
            });
            return;
        }
        if (remittanceNewBaseUI.C1 == null) {
            remittanceNewBaseUI.C1 = new com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage(remittanceNewBaseUI, 60, remittanceNewBaseUI.X, com.tencent.mm.plugin.remittance.ui.l7.f157807d);
        }
        remittanceNewBaseUI.C1.a(remittanceNewBaseUI.G, remittanceNewBaseUI.getString(com.tencent.mm.R.string.i0x), new com.tencent.mm.plugin.remittance.ui.m7() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.46
            @Override // com.tencent.mm.plugin.remittance.ui.m7
            public void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI2 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                if (!z17) {
                    remittanceNewBaseUI2.G = str;
                    remittanceNewBaseUI2.H += str2;
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.W6(remittanceNewBaseUI2);
                }
                remittanceNewBaseUI2.f157459q.p();
                remittanceNewBaseUI2.showNormalStWcKb();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r2 < r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A7(android.widget.TextView r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            android.text.TextPaint r0 = r10.getPaint()
            int r1 = r10.getWidth()
            float r2 = r10.getTextSize()
            int r6 = (int) r2
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r11)
            java.lang.String r3 = ""
            if (r2 == 0) goto L16
            r11 = r3
        L16:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            if (r2 == 0) goto L1e
            r12 = r3
            goto L31
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r2.<init>(r4)
            r2.append(r12)
            java.lang.String r12 = ")"
            r2.append(r12)
            java.lang.String r12 = r2.toString()
        L31:
            if (r13 != 0) goto L34
            r13 = r3
        L34:
            float r2 = r0.measureText(r11)
            float r3 = r0.measureText(r12)
            float r4 = r0.measureText(r13)
            float r2 = r2 + r3
            float r4 = r4 + r2
            int r5 = r1 * 2
            float r5 = (float) r5
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L52
            float r5 = (float) r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L72
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L72
        L52:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "\n"
            r2.<init>(r4)
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r13 = android.text.TextUtils.ellipsize(r13, r0, r1, r4)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            float r1 = r1 - r3
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r11 = android.text.TextUtils.ellipsize(r11, r0, r1, r2)
            java.lang.String r11 = r11.toString()
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Class<le0.x> r13 = le0.x.class
            i95.m r13 = i95.n0.c(r13)
            le0.x r13 = (le0.x) r13
            ke0.e r13 = (ke0.e) r13
            r13.getClass()
            android.text.SpannableString r13 = com.tencent.mm.pluginsdk.ui.span.c0.i(r9, r12)
            r0 = 2131100030(0x7f06017e, float:1.781243E38)
            android.content.res.ColorStateList r8 = i65.a.e(r9, r0)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r4 = 0
            r5 = 0
            r3 = r0
            r7 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            int r11 = r11.length()
            int r12 = r12.length()
            r1 = 33
            r13.setSpan(r0, r11, r12, r1)
            android.widget.TextView$BufferType r11 = android.widget.TextView.BufferType.SPANNABLE
            r10.setText(r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.A7(android.widget.TextView, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:27:0x0128). Please report as a decompilation issue!!! */
    public void B7() {
        int i17;
        if (this.G1) {
            boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_UNION_TRANSFER_KEYBOARD_TIPS_DISABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_union_transfer_keyboard_tip_disable_android, false);
            if (booleanValue || fj6) {
                this.f157455p.h();
                return;
            } else {
                this.f157455p.setTipText(getString(com.tencent.mm.R.string.k2w));
                return;
            }
        }
        int i18 = this.K;
        boolean z17 = i18 == 14 || i18 == 58;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.M) || (i17 = this.Q) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "mComfirmWording: %s", this.M);
            if (this.L1 && z17) {
                this.f157455p.setTipText(getString(com.tencent.mm.R.string.i0f));
                return;
            } else {
                this.f157455p.h();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "has resp, update placeholdertv, mComfirmWording: %s  mDelayMode: %s, flag: %s", this.M, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.L1));
        int i19 = this.Q == 1 ? 2 : 24;
        try {
            if (this.L1 && z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "first group transfer");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d6r, null);
                ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.pcf)).setText(getString(com.tencent.mm.R.string.i0f));
                ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.pce)).setText(java.lang.String.format(this.M, java.lang.Integer.valueOf(i19)));
                this.f157455p.setToolBarContent(linearLayout);
            } else {
                this.f157455p.setTipText(java.lang.String.format(this.M, java.lang.Integer.valueOf(i19)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "updatePlaceHolderTv() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f157455p;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i19)};
            i19 = com.tencent.mm.R.string.i0g;
            wcPayKeyboard.setTipText(getString(com.tencent.mm.R.string.i0g, objArr));
        }
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onGet");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUI", "notifyChanged: user = " + str);
        } else if (str.equals(this.f157439g)) {
            w7();
        }
    }

    public final void Y6(java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.Z;
        com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.PayCheckStrut payCheckStrut = (com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.PayCheckStrut) ((java.util.HashMap) map).get(str);
        ((java.util.HashMap) map).size();
        if (payCheckStrut == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "no data for: %s", str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "pay check: %d", java.lang.Integer.valueOf(this.f157449m));
            if (com.tencent.mm.sdk.platformtools.t8.K0(payCheckStrut.f157553g)) {
                payCheckStrut.f157553g = str2;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(payCheckStrut.f157548b)) {
                payCheckStrut.f157548b = str2;
            }
            if (this.f157449m != 31) {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.w(payCheckStrut.f157547a, payCheckStrut.f157548b, payCheckStrut.f157549c, payCheckStrut.f157550d, payCheckStrut.f157551e));
            } else if (this.G1) {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.n1(payCheckStrut.f157548b, this.W));
            } else {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.k0(str, payCheckStrut.f157552f, payCheckStrut.f157553g, payCheckStrut.f157554h, payCheckStrut.f157555i, payCheckStrut.f157549c));
            }
        }
        ((java.util.HashMap) map).clear();
    }

    public void Z6(java.lang.String str) {
        if (this.f157449m == 33) {
            if (this.G1) {
                return;
            }
            c7(this.G, this.f157451n, null, null, this.H, this.I, "", null, str);
        } else if (this.G1) {
            e7(this.G, this.H);
        } else {
            c7(this.G, this.f157451n, null, null, this.H, null, "", null, str);
        }
    }

    public abstract void a7();

    public abstract void b7(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent);

    public abstract void c7(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent, java.lang.String str7);

    public abstract void d7();

    public abstract void e7(java.lang.String str, java.lang.String str2);

    public android.content.Context f7() {
        com.tencent.mm.plugin.remittance.ui.h2.b();
        android.content.Context context = (android.content.Context) com.tencent.mm.plugin.remittance.ui.g2.f157719a.f157732a.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            context = null;
        }
        return context != null ? context : this;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.remittance.ui.h2.b();
        com.tencent.mm.plugin.remittance.ui.g2.f157719a.a(0);
        super.finish();
    }

    public final java.lang.String g7(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String z07;
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
            com.tencent.mm.storage.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
            z07 = z08 != null ? z08.z0(n17.d1()) : null;
        } else {
            z07 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = n17.f2();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(z07) ? n17.d1() : z07;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ced;
    }

    @Override // mp5.v
    public void h4(float f17) {
    }

    public final boolean h7(final com.tencent.mm.plugin.remittance.model.o1 o1Var) {
        if (com.tencent.mm.plugin.wallet_core.utils.l0.e(o1Var.f156924r.f378207f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "should intercept");
            new com.tencent.mm.plugin.wallet_core.utils.l0(this).c(o1Var.f156924r.f378207f, new com.tencent.mm.plugin.wallet_core.utils.k0() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.22
                @Override // com.tencent.mm.plugin.wallet_core.utils.k0
                public void a(r45.n34 n34Var) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "click intercept button %s %s", java.lang.Integer.valueOf(n34Var.f381049e), n34Var.f381048d);
                    int i17 = n34Var.f381049e;
                    com.tencent.mm.plugin.remittance.model.o1 o1Var2 = o1Var;
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                    if (i17 == 0) {
                        java.lang.String str = o1Var2.f156924r.f378209h;
                        int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                        remittanceNewBaseUI.k7(2, 2, str);
                    } else {
                        if (i17 == 1) {
                            java.lang.String str2 = o1Var2.f156924r.f378209h;
                            int i19 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                            remittanceNewBaseUI.k7(2, 2, str2);
                            remittanceNewBaseUI.finish();
                            return;
                        }
                        if (i17 == 2) {
                            java.lang.String str3 = o1Var2.f156924r.f378209h;
                            int i27 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                            remittanceNewBaseUI.k7(2, 3, str3);
                            if (((com.tencent.mm.wallet_core.ui.WalletBaseUI) remittanceNewBaseUI).mKindaEnable) {
                                remittanceNewBaseUI.showLoading();
                            }
                            remittanceNewBaseUI.u7(o1Var2);
                        }
                    }
                }
            });
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(o1Var.f156924r.f378210i)) {
            return false;
        }
        java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.f157439g), 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            I = getString(com.tencent.mm.R.string.hyz, I, this.L);
        }
        java.lang.String str = I;
        r45.jy jyVar = o1Var.f156924r;
        s7(jyVar.f378211m, jyVar.f378210i, str, o1Var.f156925s + "", null, o1Var);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideLoading() {
        super.hideLoading();
        com.tencent.mm.plugin.remittance.ui.h2.b();
        com.tencent.mm.plugin.remittance.ui.h2 h2Var = com.tencent.mm.plugin.remittance.ui.g2.f157719a;
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceControlLogic", "hideProgress()");
        android.content.Context context = (android.content.Context) h2Var.f157732a.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceControlLogic", "getContext() == null");
        } else if (!(context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceUI) && (context instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI)) {
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) context).hideProgress();
        }
    }

    public final void i7(boolean z17, android.content.Intent intent) {
        if (z17) {
            if (this.f157472y0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15386, 3, 1);
            }
            java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157456p0)) {
                this.f157456p0 = stringExtra;
            }
            int i17 = this.f157449m;
            if (i17 != 33 && i17 != 32) {
                com.tencent.mm.plugin.remittance.model.u1.a(this.f157439g);
            }
            if (this.f157443i == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 17, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 8, 1);
            }
            finish();
        } else if (com.tencent.mm.wallet_core.model.b2.b(intent)) {
            finish();
            return;
        } else {
            if (com.tencent.mm.wallet_core.model.b2.c(intent)) {
                return;
            }
            if (this.f157443i == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 16, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 7, 1);
            }
        }
        int i18 = this.f157451n;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 0) {
            if (z17) {
                this.f157450m2 = 1;
            } else {
                if (intent == null) {
                    return;
                }
                this.f157450m2 = intent.getIntExtra("key_pay_reslut_type", 3);
                this.f157452n2 = this.f157435e;
                this.f157454o2 = this.G;
                this.f157458p2 = this.H;
                this.f157460q2 = this.f157456p0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "savePayInfoInReRemittanceUI() mLastPayResult:%s mlastTotalFee:%s mLastDesc:%s mLastAddress:%s mLastTransferId:%s", java.lang.Integer.valueOf(this.f157450m2), java.lang.Double.valueOf(this.f157452n2), this.f157454o2, this.f157458p2, this.f157460q2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        hideActionbarLine();
        int i17 = this.f157449m;
        if (i17 == 33 || i17 == 32) {
            setMMTitle(com.tencent.mm.R.string.hys);
        } else {
            setMMTitle("");
        }
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                int i18 = remittanceNewBaseUI.f157443i;
                if (i18 == 1 || i18 == 6) {
                    com.tencent.mm.plugin.remittance.model.l0 l0Var = new com.tencent.mm.plugin.remittance.model.l0(remittanceNewBaseUI.f157439g, remittanceNewBaseUI.f157453o);
                    l0Var.setProcessName("RemittanceProcess");
                    remittanceNewBaseUI.doSceneProgress(l0Var);
                    remittanceNewBaseUI.finish();
                } else if (i18 == 2 || i18 == 5) {
                    remittanceNewBaseUI.finish();
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("recent_remittance_contact_list", com.tencent.mm.plugin.remittance.model.u1.b());
                    intent.setClass(remittanceNewBaseUI.getContext(), com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.class);
                    remittanceNewBaseUI.startActivityForResult(intent, 2);
                }
                return true;
            }
        });
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.mKBLayout = findViewById(com.tencent.mm.R.id.o1v);
        this.f157474z = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view);
        this.f157461r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lwn);
        this.f157463s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwo);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwp);
        this.f157464t = textView;
        textView.setVisibility(8);
        this.B = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486619lw0);
        this.A = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486624lw5);
        this.f157468x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486622lw3);
        this.f157471y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486623lw4);
        this.f157467w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486621lw2);
        this.R1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lx6);
        this.S1 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gyr);
        this.T1 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.osa);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.osf);
        this.U1 = textView2;
        com.tencent.mm.wallet_core.ui.r1.d(textView2);
        this.V1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ose);
        this.W1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.osd);
        this.X1 = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.osc);
        this.Y1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.osb);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lwf);
        this.M1 = linearLayout;
        this.N1 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.lx9);
        this.O1 = (android.widget.TextView) this.M1.findViewById(com.tencent.mm.R.id.lxb);
        this.P1 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.M1.findViewById(com.tencent.mm.R.id.lx_);
        this.Q1 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.M1.findViewById(com.tencent.mm.R.id.lxa);
        this.R1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lx6);
        j7();
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485972jq4);
        this.f157459q = walletFormView;
        if (this.f157449m == 33) {
            this.f157468x.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f157435e));
            this.f157471y.setText(com.tencent.mm.wallet_core.model.c2.b());
            java.lang.String stringExtra = getIntent().getStringExtra("desc");
            this.I = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f157467w.setVisibility(8);
            } else {
                android.widget.TextView textView3 = this.f157467w;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String str = this.I;
                float textSize = this.f157467w.getTextSize();
                ((ke0.e) xVar).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
                this.f157467w.setVisibility(0);
            }
            this.A.setVisibility(0);
            this.B.setVisibility(8);
        } else {
            walletFormView.getTitleTv().setText(java.lang.String.format(getString(com.tencent.mm.R.string.i09), "¥"));
            this.f157459q.b(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.16
                @Override // android.text.TextWatcher
                public void afterTextChanged(android.text.Editable editable) {
                    int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.f157455p.e(true);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(java.lang.CharSequence charSequence, int i18, int i19, int i27) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(java.lang.CharSequence charSequence, int i18, int i19, int i27) {
                }
            });
            this.f157459q.r(7, 2);
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
            this.f157455p = wcPayKeyboard;
            wcPayKeyboard.e(true);
            setWPKeyboard(this.f157459q.getContentEt(), true, false);
            this.f157459q.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.17
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.f157459q.getContentEt().requestFocus();
                }
            });
            setWcKbHeightListener(this);
            this.f157455p.setActionText(getString(com.tencent.mm.R.string.i0n));
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.remittance.model.r1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.remittance.model.r1.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.i0n));
            ((android.widget.RelativeLayout.LayoutParams) this.f157455p.getLayoutParams()).addRule(12);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.lwe);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.A.setVisibility(8);
            this.B.setVisibility(0);
            setTenpayKBStateListener(new com.tencent.mm.wallet_core.ui.m(this) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.18
                @Override // com.tencent.mm.wallet_core.ui.m
                public void onVisibleStateChange(boolean z17) {
                }
            });
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pck);
        if (com.tencent.mm.ui.bk.C()) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chv);
        } else {
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chu);
        }
        final com.tencent.mm.wallet_core.ui.z1 z1Var = new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.3
            @Override // com.tencent.mm.wallet_core.ui.z1
            public void onRealClick(android.view.View view) {
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                int i18 = remittanceNewBaseUI.f157449m;
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI2 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                if (i18 != 33) {
                    remittanceNewBaseUI.f157435e = com.tencent.mm.sdk.platformtools.t8.F(remittanceNewBaseUI.f157459q.getText(), 0.0d);
                    if (!remittanceNewBaseUI2.f157459q.n()) {
                        android.widget.Toast makeText = dp.a.makeText(remittanceNewBaseUI2.getContext(), "", 0);
                        android.view.View inflate = android.view.View.inflate(remittanceNewBaseUI2.getContext(), com.tencent.mm.R.layout.f488379rq, null);
                        java.lang.String string = remittanceNewBaseUI2.getContext().getResources().getString(com.tencent.mm.R.string.i0i);
                        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(com.tencent.mm.R.raw.icons_filled_info);
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(string);
                        makeText.setGravity(17, 0, 0);
                        makeText.setView(inflate);
                        makeText.show();
                        inflate.announceForAccessibility(string);
                    } else if (remittanceNewBaseUI2.f157435e < 0.01d) {
                        remittanceNewBaseUI2.q7();
                    } else {
                        remittanceNewBaseUI2.hideWcKb();
                        remittanceNewBaseUI2.f157459q.clearFocus();
                        com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI3 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                        if (remittanceNewBaseUI3.G1) {
                            remittanceNewBaseUI3.e7(remittanceNewBaseUI3.G, remittanceNewBaseUI3.H);
                        } else {
                            java.lang.String str2 = remittanceNewBaseUI3.G;
                            int i19 = remittanceNewBaseUI3.f157451n;
                            remittanceNewBaseUI3.getClass();
                            remittanceNewBaseUI2.getClass();
                            remittanceNewBaseUI3.b7(str2, i19, null, null, remittanceNewBaseUI2.H, null, "", null);
                        }
                    }
                } else if (!remittanceNewBaseUI.G1) {
                    java.lang.String str3 = remittanceNewBaseUI.G;
                    int i27 = remittanceNewBaseUI.f157451n;
                    remittanceNewBaseUI.getClass();
                    remittanceNewBaseUI2.getClass();
                    remittanceNewBaseUI.b7(str3, i27, null, null, remittanceNewBaseUI2.H, remittanceNewBaseUI2.I, "", null);
                }
                remittanceNewBaseUI2.getClass();
                if (remittanceNewBaseUI2.f157443i == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 15, 1);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 6, 1);
                }
                if (remittanceNewBaseUI2.f157443i != 1 || com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI2.G)) {
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14074, 2);
            }
        };
        this.f157459q.getContentEt().setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener(this) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.4
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(android.widget.TextView textView4, int i18, android.view.KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "click enter");
                    z1Var.onClick(null);
                }
                return true;
            }
        });
        this.f157459q.setmContentAbnormalMoneyCheck(true);
        this.f157459q.getContentEt().setTextSize(1, 56.0f);
        this.f157459q.getTitleTv().setTextSize(1, 56.0f);
        this.f157465u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486617lv4);
        this.f157466v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482711lu);
        this.f157465u.setClickable(true);
        this.f157466v.setClickable(true);
        com.tencent.mm.wallet_core.ui.r1.k(this.f157465u, 50);
        com.tencent.mm.wallet_core.ui.r1.k(this.f157466v, 50);
        int i18 = this.f157443i;
        if (i18 == 1 || i18 == 6) {
            m7(getString(com.tencent.mm.R.string.hyd));
        } else {
            m7(getString(com.tencent.mm.R.string.hyc));
        }
        if (!c01.z1.I()) {
            int i19 = this.f157451n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (i19 == 0) {
                this.F = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcl);
                if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK")) {
                    this.D = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcn);
                    this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pcq);
                    this.D.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.5
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                            remittanceNewBaseUI.S = remittanceNewBaseUI.D.getWidth();
                            remittanceNewBaseUI.F.setVisibility(8);
                            int i27 = remittanceNewBaseUI.S;
                        }
                    });
                    this.f157459q.setmWalletFormViewListener(new qp5.k0() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.6
                        @Override // qp5.k0
                        public void a(java.lang.CharSequence charSequence) {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                            int i27 = remittanceNewBaseUI.R;
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (i27 == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "mAmountRemindBit == 0");
                                remittanceNewBaseUI.F.setVisibility(8);
                                return;
                            }
                            long longValue = new java.lang.Double(com.tencent.mm.sdk.platformtools.t8.F(charSequence.toString(), 0.0d)).longValue();
                            int i28 = 0;
                            int i29 = 0;
                            while (longValue != 0) {
                                int i37 = (int) (longValue % 10);
                                longValue /= 10;
                                i28++;
                                i29 = i37;
                            }
                            if (i28 < remittanceNewBaseUI.R) {
                                remittanceNewBaseUI.F.setVisibility(8);
                                return;
                            }
                            int k17 = remittanceNewBaseUI.f157459q.k(charSequence, remittanceNewBaseUI.S, i29);
                            if (k17 == 0) {
                                remittanceNewBaseUI.F.setVisibility(8);
                                return;
                            }
                            remittanceNewBaseUI.F.setVisibility(0);
                            remittanceNewBaseUI.E.setText(com.tencent.mm.wallet_core.model.b2.a(i28));
                            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) remittanceNewBaseUI.D.getLayoutParams();
                            layoutParams.leftMargin = k17;
                            remittanceNewBaseUI.D.setLayoutParams(layoutParams);
                        }
                    });
                } else {
                    this.F.setVisibility(8);
                }
            }
        }
        if (this.f157443i == 1) {
            gm0.j1.i();
            if (((java.lang.String) gm0.j1.u().c().l(327732, "0")).equals("0")) {
                db5.e1.m(getContext(), com.tencent.mm.R.string.i0b, com.tencent.mm.R.string.i0c, new android.content.DialogInterface.OnClickListener(this) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.7
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i27) {
                    }
                });
                gm0.j1.i();
                gm0.j1.u().c().w(327732, "1");
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            }
        }
        this.C = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lwe);
        B7();
        x7();
        y7();
        int i27 = this.f157449m;
        if (i27 == 33 || i27 == 32) {
            return;
        }
        this.f157474z.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(view);
                arrayList6.add(motionEvent);
                java.lang.Object[] array = arrayList6.toArray();
                arrayList6.clear();
                yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.handleKeyboardTouchEvent(motionEvent);
                yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        });
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        return this.mKindaEnable ? !this.f157447l1 && this.f157455p.o() : this.f157455p.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j7() {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.j7():void");
    }

    public final void k7(int i17, int i18, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct wCPayLargeAmountTransferReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct();
        this.f157473y1 = wCPayLargeAmountTransferReportStruct;
        wCPayLargeAmountTransferReportStruct.f62111d = i17;
        wCPayLargeAmountTransferReportStruct.f62112e = i18;
        wCPayLargeAmountTransferReportStruct.f62113f = wCPayLargeAmountTransferReportStruct.b("OrderId", str, true);
        this.f157473y1.k();
    }

    public final void l7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUI", "msgxml is null");
            return;
        }
        java.lang.String decode = java.net.URLDecoder.decode(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "helios:" + decode);
        java.lang.String str2 = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(decode, "msg", null).get(".msg.appmsg.wcpayinfo.transferid");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUI", "paymsgid count't be null in appmsg");
            return;
        }
        com.tencent.mm.plugin.remittance.model.t1 Di = kw3.p.Ai().Di();
        Di.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(decode)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceLocalMsgMgr", "saveMsgContent param error");
        } else {
            Di.f157025b.put(str2, decode);
        }
    }

    public final void m7(java.lang.String str) {
        com.tencent.mm.wallet_core.ui.r1.w0(this.f157466v, str, 0, str.length(), new com.tencent.mm.wallet_core.ui.a0(new com.tencent.mm.wallet_core.ui.z() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.43
            @Override // com.tencent.mm.wallet_core.ui.z
            public void onClick(android.view.View view) {
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.X6(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this);
            }
        }, true), getContext());
    }

    public final boolean n7(final com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        at4.a aVar = q0Var.f156983z;
        if (aVar == null || !aVar.a()) {
            return false;
        }
        this.f157444i2 = true;
        android.content.Context f76 = f7();
        at4.a aVar2 = q0Var.f156983z;
        db5.e1.A(f76, aVar2.f13795a, "", aVar2.f13797c, aVar2.f13796b, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.23
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.mm.plugin.remittance.model.q0 q0Var2 = q0Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "goto h5: %s", q0Var2.f156983z.f13798d);
                com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.getContext(), q0Var2.f156983z.f13798d, false);
            }
        }, new android.content.DialogInterface.OnClickListener(this) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.24
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
            }
        });
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needLockPage() {
        int i17 = this.f157449m;
        return i17 == 33 || i17 == 32;
    }

    public final java.lang.Boolean o7(com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "showAmountReInputPage");
        if (q0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "scene == null");
            return java.lang.Boolean.FALSE;
        }
        if (q0Var.f156967g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "scene.amountReInputPageInfo == null");
            return java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "goto large moneny ui");
        hideLoading();
        this.f157445j2.alive();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String C0 = com.tencent.mm.wallet_core.ui.r1.C0(com.tencent.mm.wallet_core.ui.r1.x(this.f157439g), 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            C0 = getString(com.tencent.mm.R.string.hyz, C0, this.L);
        }
        intent.putExtra("key_amount_remind_bit", this.R);
        intent.putExtra("key_title", q0Var.f156967g.f156922a);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156967g.f156923b) && !com.tencent.mm.sdk.platformtools.t8.K0(C0)) {
            intent.putExtra("key_desc", q0Var.f156967g.f156923b.replace("${receiver_name}", C0));
        }
        intent.putExtra("key_display_name", C0);
        intent.putExtra("key_place_attach", this.f157469x0);
        intent.setClass(this, com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI.class);
        startActivityForResult(intent, 7);
        return java.lang.Boolean.TRUE;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "reqcode=" + i17 + ", resultCode=" + i18 + ", username=" + this.f157439g);
        com.tencent.mm.plugin.remittance.ui.h2.b();
        com.tencent.mm.plugin.remittance.ui.g2.f157719a.c(this);
        if (i17 == 1) {
            i7(i18 == -1, intent);
        } else if (i17 != 2) {
            if (i17 == 5) {
                i7(i18 == -1, intent);
            } else if (i17 == 7 && i18 == -1 && intent != null) {
                int intExtra = intent.getIntExtra("key_close_scene", 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "closeScene is: %s", java.lang.Integer.valueOf(intExtra));
                if (intExtra == 1) {
                    showLoading();
                } else if (intExtra != 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "normal close");
                } else {
                    this.f157459q.getContentEt().setText("");
                }
            }
        } else if (i18 != -1 || intent == null) {
            finish();
        } else {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                finish();
            } else {
                this.f157439g = stringExtra;
                j7();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f157443i = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f157449m = getIntent().getIntExtra("pay_scene", 31);
        int i17 = this.f157443i;
        if (!(i17 == 0 || i17 == 2)) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            this.A1 = uuid;
            zr4.b.d(uuid);
        }
        if (this instanceof com.tencent.mm.plugin.remittance.ui.RemittanceUI) {
            this.f157451n = 0;
        }
        super.onCreate(bundle);
        addSceneEndListener(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE);
        addSceneEndListener(2548);
        this.f157433d = nr4.a.d(getIntent());
        this.f157453o = getIntent().getStringExtra("scan_remittance_id");
        this.f157435e = getIntent().getDoubleExtra("fee", 0.0d);
        this.f157439g = getIntent().getStringExtra("receiver_name");
        getIntent().getStringExtra("receiver_nick_name");
        this.L = getIntent().getStringExtra("receiver_true_name");
        this.f157437f = getIntent().getStringExtra("mch_name");
        this.f157441h = getIntent().getStringExtra("mch_info");
        this.K = getIntent().getIntExtra("pay_channel", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("rcvr_open_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.T = stringExtra;
        this.W = getIntent().getStringExtra("key_group_name");
        this.G1 = com.tencent.mm.storage.z3.m4(this.f157439g);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_TRANSFER_SHOW_ALIAS_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.Y = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.W)) {
            this.K = 11;
            if (this.G1) {
                this.J1 = 2;
            } else {
                this.J1 = 1;
            }
        } else if (c01.e2.E(this.W)) {
            this.K = 58;
            this.J1 = 4;
        } else {
            this.K = 14;
            this.J1 = 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", " mUserName:%s mSendType:%s mChatType:%s", this.f157439g, java.lang.Integer.valueOf(this.K1), java.lang.Integer.valueOf(this.J1));
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        if ((16 & longValue) != 0) {
            this.Q = 1;
        } else if ((longValue & 32) != 0) {
            this.Q = 2;
        } else {
            this.Q = 0;
        }
        if (this.G1) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f157439g, true);
            java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
            this.H1 = fj6;
            if (fj6 == null) {
                this.H1 = "";
            }
            d7();
        } else {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WALLET_GROUP_TRANSFER_KEYBOARD_TIPS_FIRST_SHOWN_BOOLEAN_SYNC;
            boolean booleanValue = ((java.lang.Boolean) c18.m(u3Var2, java.lang.Boolean.TRUE)).booleanValue();
            this.L1 = booleanValue;
            if (booleanValue) {
                gm0.j1.u().c().x(u3Var2, bool);
            }
            a7();
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
        initView();
        this.f157462r2.alive();
        com.tencent.mm.wallet_core.b.a().getClass();
        this.mKindaEnable = true;
        this.f157432c2 = 1;
        com.tencent.mm.plugin.remittance.ui.h2.b();
        com.tencent.mm.plugin.remittance.ui.g2.f157719a.c(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", " onDestroy()");
        com.tencent.mm.sdk.platformtools.u3.l(this.f157434d2);
        this.f157436e2.dead();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().q(this);
        this.f157462r2.dead();
        this.f157448l2.dead();
        this.f157445j2.dead();
        zr4.b.c(this.A1);
        removeSceneEndListener(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE);
        removeSceneEndListener(2548);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.f157434d2, 300L);
        this.f157430a2 = false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f157455p;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onPause()");
        if (!this.f157455p.p()) {
            this.f157432c2 = 3;
        }
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(getContext(), this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onResume()");
        com.tencent.mm.plugin.remittance.ui.h2.b();
        com.tencent.mm.plugin.remittance.ui.g2.f157719a.c(this);
        if (this.f157432c2 == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
            this.f157459q.requestFocus();
        }
        this.f157432c2 = 2;
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(getContext(), this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, final com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        this.V = "";
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof ss4.k0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "net error, use hardcode wording");
                this.mWcKeyboard.h();
            } else {
                boolean z17 = m1Var instanceof com.tencent.mm.plugin.remittance.model.q0;
                com.tencent.mm.sdk.event.IListener iListener = this.f157436e2;
                if (z17) {
                    if (this.mKindaEnable) {
                        hideLoading();
                    }
                    com.tencent.mm.plugin.remittance.model.q0 q0Var = (com.tencent.mm.plugin.remittance.model.q0) m1Var;
                    this.f157457p1 = q0Var;
                    iListener.alive();
                    com.tencent.mm.wallet_core.model.a2.b(this.f157449m, "", i18);
                    this.f157430a2 = true;
                    if (n7(q0Var)) {
                        return true;
                    }
                    if (f7() instanceof com.tencent.mm.plugin.remittance.ui.RemittanceLargeMoneyUI) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "Remittance LargeMoneyUI error process");
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(f7());
                        u1Var.g(com.tencent.mm.sdk.platformtools.t8.K0(str) ? getContext().getString(com.tencent.mm.R.string.l0g) : str);
                        u1Var.l(new com.tencent.mm.ui.widget.dialog.w1(this) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.19
                            @Override // com.tencent.mm.ui.widget.dialog.w1
                            public void a(boolean z18, java.lang.String str2) {
                                int i27 = ((com.tencent.mm.plugin.remittance.model.q0) m1Var).W;
                                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "error_retcode: %s", java.lang.Integer.valueOf(i27));
                                com.tencent.mm.plugin.remittance.ui.h2 h2Var = com.tencent.mm.plugin.remittance.ui.g2.f157719a;
                                if (i27 == 268491141) {
                                    com.tencent.mm.plugin.remittance.ui.h2.b();
                                    h2Var.a(2);
                                } else {
                                    com.tencent.mm.plugin.remittance.ui.h2.b();
                                    h2Var.a(0);
                                }
                            }
                        });
                        u1Var.n(getContext().getString(com.tencent.mm.R.string.ke6));
                        u1Var.q(false);
                        return true;
                    }
                } else if (m1Var instanceof com.tencent.mm.plugin.remittance.model.o1) {
                    if (this.mKindaEnable) {
                        hideLoading();
                    }
                    com.tencent.mm.plugin.remittance.model.o1 o1Var = (com.tencent.mm.plugin.remittance.model.o1) m1Var;
                    this.f157470x1 = o1Var;
                    iListener.alive();
                    com.tencent.mm.wallet_core.model.a2.b(this.f157449m, "", i18);
                    if (!h7(o1Var)) {
                        p7(this, str, false);
                    }
                }
            }
            return false;
        }
        boolean z18 = m1Var instanceof com.tencent.mm.plugin.remittance.model.q0;
        java.util.Map map = this.Z;
        if (z18) {
            com.tencent.mm.plugin.remittance.model.q0 q0Var2 = (com.tencent.mm.plugin.remittance.model.q0) m1Var;
            com.tencent.mm.wallet_core.model.a2.b(this.f157449m, q0Var2.f156964d, i18);
            this.f157429J = q0Var2.f156970m;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(q0Var2.f156976s)) {
                this.L = q0Var2.f156976s;
            }
            int i27 = this.f157449m;
            if (i27 == 32 || i27 == 33) {
                this.f157456p0 = q0Var2.f156978u;
            } else {
                this.f157456p0 = q0Var2.D;
            }
            this.f157469x0 = q0Var2.f156968h;
            nr4.a aVar = this.f157433d;
            if (aVar != null) {
                aVar.b(10000, java.lang.Integer.valueOf(i27), this.f157439g, java.lang.Double.valueOf(q0Var2.f156982y));
            }
            r45.o10 o10Var = q0Var2.R;
            this.U = o10Var == null ? "" : com.tencent.mm.sdk.platformtools.t8.K0(o10Var.f381813g) ? this.U : q0Var2.R.f381813g;
            if (!r7(q0Var2)) {
                v7(q0Var2.f156964d, this.f157439g, this.L, q0Var2);
            } else if (this.mKindaEnable) {
                hideLoading();
            }
            ((java.util.HashMap) map).put(q0Var2.f156964d, new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.PayCheckStrut(q0Var2.f156977t, q0Var2.f156978u, q0Var2.f156979v, q0Var2.f156980w, q0Var2.f156981x, q0Var2.D, q0Var2.E, q0Var2.F, com.tencent.mm.sdk.platformtools.t8.V(q0Var2.B, 0L)));
            long j17 = q0Var2.V;
            if (j17 <= 0 || j17 > 1800) {
                this.D1 = 0L;
                this.E1 = "";
                this.F1 = 0L;
                return true;
            }
            this.D1 = j17;
            this.E1 = q0Var2.U;
            this.F1 = com.tencent.mm.sdk.platformtools.t8.V(q0Var2.B, 0L);
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.o1)) {
            if (!(m1Var instanceof ss4.k0)) {
                return true;
            }
            ss4.k0 k0Var = (ss4.k0) m1Var;
            this.M = k0Var.f412075d;
            this.N = k0Var.f412080i;
            this.P = k0Var.f412081m;
            B7();
            y7();
            return true;
        }
        com.tencent.mm.plugin.remittance.model.o1 o1Var2 = (com.tencent.mm.plugin.remittance.model.o1) m1Var;
        r45.jy jyVar = o1Var2.f156924r;
        com.tencent.mm.wallet_core.model.a2.b(this.f157449m, jyVar.f378211m, i18);
        if (jyVar.f378205d != 0) {
            hideLoading();
            p7(this, jyVar.f378206e, false);
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jyVar.f378211m)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "UnionTransferPlaceOrder prepay_id is null");
        }
        this.f157429J = jyVar.f378208g;
        this.f157456p0 = jyVar.f378209h;
        nr4.a aVar2 = this.f157433d;
        double d17 = o1Var2.f156925s;
        if (aVar2 != null) {
            aVar2.b(10000, java.lang.Integer.valueOf(this.f157449m), this.f157439g, java.lang.Double.valueOf(d17));
        }
        if (!h7(o1Var2)) {
            u7(o1Var2);
        } else if (this.mKindaEnable) {
            hideLoading();
        }
        java.lang.String str2 = jyVar.f378209h;
        java.lang.String str3 = this.f157439g;
        ((java.util.HashMap) map).put(jyVar.f378211m, new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.PayCheckStrut("", str2, "", str3, 0, str2, str2, str3, 0L));
        r45.tr6 tr6Var = jyVar.f378213o;
        if (tr6Var == null || (i19 = tr6Var.f386747d) <= 0 || i19 > 1800) {
            this.D1 = 0L;
            this.E1 = "";
            this.F1 = 0L;
            return true;
        }
        this.D1 = i19;
        this.E1 = tr6Var.f386748e.i();
        this.F1 = java.lang.Math.round(d17 * 100.0d);
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onWindowFocusChanged");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.B1;
        if (z2Var != null && !z2Var.h()) {
            this.B1.B();
            this.B1 = null;
            java.lang.Runnable runnable = this.f157434d2;
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.i(runnable, 300L);
            }
        }
        super.onWindowFocusChanged(z17);
    }

    public void p7(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, final boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = mMActivity.getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.G(mMActivity, str, null, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.20
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                dialogInterface.dismiss();
                if (z17) {
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.finish();
                }
            }
        });
    }

    public abstract void q7();

    public final boolean r7(final com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        boolean z17;
        boolean z18 = false;
        if (this.f157438f2 || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156969i)) {
            z17 = false;
        } else {
            this.f157438f2 = true;
            k7(2, 1, q0Var.D);
            db5.e1.A(f7(), q0Var.f156969i, "", getString(com.tencent.mm.R.string.f492818hz5), getString(com.tencent.mm.R.string.f492823i04), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.25
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.mm.plugin.remittance.model.q0 q0Var2 = q0Var;
                    java.lang.String str = q0Var2.D;
                    int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                    remittanceNewBaseUI.k7(2, 3, str);
                    if (remittanceNewBaseUI.r7(q0Var2)) {
                        return;
                    }
                    if (remittanceNewBaseUI.o7(q0Var2).booleanValue()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "showAmountReInputPage success");
                    } else {
                        remittanceNewBaseUI.showLoading();
                        remittanceNewBaseUI.v7(q0Var2.f156964d, remittanceNewBaseUI.f157439g, remittanceNewBaseUI.L, q0Var2);
                    }
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.26
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    java.lang.String str = q0Var.D;
                    int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                    remittanceNewBaseUI.k7(2, 2, str);
                    int i19 = remittanceNewBaseUI.f157443i;
                    if (i19 == 1 || i19 == 6) {
                        com.tencent.mm.plugin.remittance.model.l0 l0Var = new com.tencent.mm.plugin.remittance.model.l0(remittanceNewBaseUI.f157439g, remittanceNewBaseUI.f157453o);
                        l0Var.setProcessName("RemittanceProcess");
                        remittanceNewBaseUI.doSceneProgress(l0Var);
                        remittanceNewBaseUI.finish();
                        return;
                    }
                    if (i19 == 2 || i19 == 5) {
                        remittanceNewBaseUI.finish();
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("recent_remittance_contact_list", com.tencent.mm.plugin.remittance.model.u1.b());
                    intent.setClass(remittanceNewBaseUI.getContext(), com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.class);
                    remittanceNewBaseUI.startActivityForResult(intent, 2);
                }
            });
            z17 = true;
        }
        if (!z17 && !this.f157440g2) {
            if (q0Var.f156965e > 0) {
                this.f157440g2 = true;
                if (q0Var.f156966f != null) {
                    t7(f7(), com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156966f.f156952a) ? getString(com.tencent.mm.R.string.i0z, java.lang.Integer.valueOf(q0Var.f156965e)) : q0Var.f156966f.f156952a, getString(com.tencent.mm.R.string.i1b), getString(com.tencent.mm.R.string.f492818hz5), com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156966f.f156953b) ? getString(com.tencent.mm.R.string.i0o) : q0Var.f156966f.f156953b, new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.28
                        @Override // com.tencent.mm.ui.widget.dialog.p3
                        public void a() {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                            com.tencent.mm.ui.widget.dialog.z2 z2Var = remittanceNewBaseUI.B1;
                            if (z2Var != null) {
                                z2Var.B();
                                remittanceNewBaseUI.B1 = null;
                            }
                            com.tencent.mm.plugin.remittance.model.q0 q0Var2 = q0Var;
                            if (remittanceNewBaseUI.r7(q0Var2)) {
                                return;
                            }
                            if (((com.tencent.mm.wallet_core.ui.WalletBaseUI) remittanceNewBaseUI).mKindaEnable) {
                                remittanceNewBaseUI.showLoading();
                            }
                            remittanceNewBaseUI.v7(q0Var2.f156964d, remittanceNewBaseUI.f157439g, remittanceNewBaseUI.L, q0Var2);
                        }
                    }, new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.29
                        @Override // com.tencent.mm.ui.widget.dialog.p3
                        public void a() {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                            com.tencent.mm.ui.widget.dialog.z2 z2Var = remittanceNewBaseUI.B1;
                            if (z2Var != null) {
                                z2Var.B();
                                remittanceNewBaseUI.B1 = null;
                            }
                            com.tencent.mm.plugin.remittance.model.q0 q0Var2 = q0Var;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var2.f156966f.f156954c)) {
                                com.tencent.mm.wallet_core.a.k(remittanceNewBaseUI, "order", "ShowOrdersInfoProcess", null, null);
                                return;
                            }
                            js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                            java.lang.String str = q0Var2.f156966f.f156954c;
                            ((is.h) s0Var).getClass();
                            c71.b.c(remittanceNewBaseUI, str, 5, true);
                        }
                    });
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "scene.zaituMessage == null");
                    t7(f7(), getString(com.tencent.mm.R.string.i0z, java.lang.Integer.valueOf(q0Var.f156965e)), getString(com.tencent.mm.R.string.i1b), getString(com.tencent.mm.R.string.f492818hz5), getString(com.tencent.mm.R.string.i0o), new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.30
                        @Override // com.tencent.mm.ui.widget.dialog.p3
                        public void a() {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                            com.tencent.mm.ui.widget.dialog.z2 z2Var = remittanceNewBaseUI.B1;
                            if (z2Var != null) {
                                z2Var.B();
                                remittanceNewBaseUI.B1 = null;
                            }
                            com.tencent.mm.plugin.remittance.model.q0 q0Var2 = q0Var;
                            if (remittanceNewBaseUI.r7(q0Var2)) {
                                return;
                            }
                            remittanceNewBaseUI.showLoading();
                            remittanceNewBaseUI.v7(q0Var2.f156964d, remittanceNewBaseUI.f157439g, remittanceNewBaseUI.L, q0Var2);
                        }
                    }, new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.31
                        @Override // com.tencent.mm.ui.widget.dialog.p3
                        public void a() {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                            com.tencent.mm.ui.widget.dialog.z2 z2Var = remittanceNewBaseUI.B1;
                            if (z2Var != null) {
                                z2Var.B();
                                remittanceNewBaseUI.B1 = null;
                            }
                            com.tencent.mm.wallet_core.a.k(remittanceNewBaseUI, "order", "ShowOrdersInfoProcess", null, null);
                        }
                    });
                }
                z17 = true;
            } else {
                z17 = false;
            }
        }
        if (!z17 && !this.f157442h2) {
            if (q0Var.f156973p) {
                this.f157442h2 = true;
                com.tencent.mm.plugin.remittance.ui.b2.c(f7(), this.f157443i, this.f157435e, q0Var.f156975r / 100.0d, null, q0Var.f156974q / 100.0d, q0Var.f156971n / 100.0d, q0Var.f156972o, new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.33
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                        remittanceNewBaseUI.showLoading();
                        com.tencent.mm.plugin.remittance.model.q0 q0Var2 = q0Var;
                        remittanceNewBaseUI.v7(q0Var2.f156964d, remittanceNewBaseUI.f157439g, remittanceNewBaseUI.L, q0Var2);
                        if (remittanceNewBaseUI.f157443i == 1) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 12, 1);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 3, 1);
                        }
                        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                z18 = true;
            }
            z17 = z18;
        }
        if (!z17 && !this.f157444i2) {
            z17 = n7(q0Var);
        }
        if (z17 || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.B) || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.C)) {
            return z17;
        }
        java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.f157439g), 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            I = getString(com.tencent.mm.R.string.hyz, I, this.L);
        }
        s7(q0Var.f156964d, q0Var.C, I, q0Var.B, q0Var, null);
        return true;
    }

    public boolean s7(final java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.tencent.mm.plugin.remittance.model.q0 q0Var, final com.tencent.mm.plugin.remittance.model.o1 o1Var) {
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ceh, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m8a);
        final android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m8_);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m89);
        textView.setText(str2);
        if (!this.G1) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str3, textSize));
        } else if (textView2.getWidth() > 0) {
            z7(textView2);
        } else {
            textView2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.39
                @Override // java.lang.Runnable
                public void run() {
                    int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.f157428s2;
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.z7(textView2);
                }
            });
        }
        textView3.setText(java.lang.String.format("%s%.2f", com.tencent.mm.wallet_core.model.c2.b(), java.lang.Double.valueOf(java.lang.Double.valueOf(com.tencent.mm.sdk.platformtools.t8.F(str4, 0.0d)).doubleValue() / 100.0d)));
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(f7());
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = false;
        i0Var.g(com.tencent.mm.R.string.i1b);
        aVar.L = inflate;
        i0Var.f(com.tencent.mm.R.string.f492818hz5);
        i0Var.e(com.tencent.mm.R.string.apj);
        aVar.F = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.40
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23749, 2);
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.showNormalStWcKb();
            }
        };
        aVar.E = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.41
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23749, 3);
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                remittanceNewBaseUI.showLoading();
                if (remittanceNewBaseUI.G1) {
                    remittanceNewBaseUI.u7(o1Var);
                    return;
                }
                remittanceNewBaseUI.v7(str, remittanceNewBaseUI.f157439g, remittanceNewBaseUI.L, q0Var);
            }
        };
        i0Var.a().show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23749, 1);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.remittance.model.r1.class);
        hashSet.add(com.tencent.mm.plugin.remittance.ui.d7.class);
    }

    public void t7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.ui.widget.dialog.p3 p3Var, com.tencent.mm.ui.widget.dialog.p3 p3Var2) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.B1;
        if (z2Var != null) {
            z2Var.B();
            this.B1 = null;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 3);
        this.B1 = z2Var2;
        z2Var2.m(str4, str3);
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.B1;
        z2Var3.D = p3Var2;
        z2Var3.E = p3Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cec, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gwd);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(str2);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.gw7)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.32
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.ui.widget.dialog.z2 z2Var4 = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.B1;
                if (z2Var4 != null) {
                    z2Var4.B();
                }
                yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.B1.s(inflate);
        android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.ceb, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.gw8);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        textView2.setText(str);
        this.B1.j(inflate2);
        this.B1.C();
    }

    public void u7(com.tencent.mm.plugin.remittance.model.o1 o1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "startPay prepayId:%s", o1Var.f156924r.f378211m);
        l7(this.f157429J);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("prepayId", o1Var.f156924r.f378211m);
        bundle.putInt("payScene", 82);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.W)) {
            bundle.putInt("payChannel", 57);
        } else {
            bundle.putInt("payChannel", 58);
        }
        bundle.putString("payee_enterprise_name", this.H1);
        bundle.putString("payee_salesperson_nickname", com.tencent.mm.wallet_core.ui.r1.x(this.f157439g));
        bundle.putInt("chatType", this.J1);
        bundle.putInt("sendType", this.K1);
        bundle.putString("qrcodeSenderName", getIntent().getStringExtra("qrcode_sender_username"));
        bundle.putString("qrcodeSenderMsgId", getIntent().getStringExtra("msg_svr_id"));
        ((h45.q) i95.n0.c(h45.q.class)).startInWxAppPayUseCase(this, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v7(final java.lang.String r18, final java.lang.String r19, final java.lang.String r20, final com.tencent.mm.plugin.remittance.model.q0 r21) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.v7(java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.remittance.model.q0):void");
    }

    public final void w7() {
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.14
            @Override // java.lang.Runnable
            public void run() {
                kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
                com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                ((com.tencent.mm.feature.avatar.w) zVar).Ri(remittanceNewBaseUI.f157461r, remittanceNewBaseUI.f157439g, 0.1f);
            }
        };
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            runnable.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.15
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            });
        }
    }

    public abstract void x7();

    public final void y7() {
        int i17 = this.f157443i;
        if (!(i17 == 0 || i17 == 2) || com.tencent.mm.sdk.platformtools.t8.K0(this.N) || this.Q == 0 || this.P != 1) {
            removeAllOptionMenu();
        } else {
            addIconOptionMenu(0, com.tencent.mm.R.drawable.chy, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.9
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                    com.tencent.mm.wallet_core.ui.r1.V(remittanceNewBaseUI.getContext(), remittanceNewBaseUI.N, false);
                    return false;
                }
            });
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.remittance.model.q0 q0Var;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onScreenShot");
        if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).ij() || !this.f157430a2 || (q0Var = this.f157457p1) == null || (i17 = q0Var.W) == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "[onScreenShot] error_retcode: %s", java.lang.Integer.valueOf(i17));
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_transfer_interrupt_page", null, i17);
    }

    public final void z7(android.widget.TextView textView) {
        A7(textView, com.tencent.mm.wallet_core.ui.r1.x(this.f157439g), this.L, t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f157439g, true)));
    }
}
