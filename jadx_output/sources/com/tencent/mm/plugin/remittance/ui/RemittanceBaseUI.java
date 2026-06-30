package com.tencent.mm.plugin.remittance.ui;

@db5.a(2)
/* loaded from: classes9.dex */
public abstract class RemittanceBaseUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements kv.e0 {
    public static final /* synthetic */ int I1 = 0;
    public android.widget.TextView A;
    public r45.o10 A1;
    public android.widget.ScrollView B;
    public final com.tencent.mm.sdk.event.IListener B1;
    public android.widget.LinearLayout C;
    public int C1;
    public android.widget.LinearLayout D;
    public double D1;
    public android.widget.LinearLayout E;
    public java.lang.String E1;
    public android.widget.TextView F;
    public java.lang.String F1;
    public android.widget.TextView G;
    public java.lang.String G1;
    public java.lang.String H;
    public final com.tencent.mm.sdk.event.IListener H1;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f157132J;
    public java.lang.String K;
    public boolean L;
    public java.lang.String M;
    public java.lang.String N;
    public int P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public int T;
    public int U;
    public java.lang.String V;
    public java.lang.String W;
    public final java.util.Map X;
    public java.lang.String Y;
    public com.tencent.mm.plugin.remittance.model.q0 Z;

    /* renamed from: d, reason: collision with root package name */
    public nr4.a f157133d;

    /* renamed from: e, reason: collision with root package name */
    public double f157134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157136g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f157137h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f157138i;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157139l1;

    /* renamed from: m, reason: collision with root package name */
    public int f157140m;

    /* renamed from: n, reason: collision with root package name */
    public int f157141n;

    /* renamed from: o, reason: collision with root package name */
    public int f157142o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f157143p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct f157144p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f157145p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f157146q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f157147r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f157148s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f157149t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f157150u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f157151v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f157152w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f157153x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f157154x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f157155x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f157156y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f157157y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f157158y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f157159z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f157160z1;

    public RemittanceBaseUI() {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
        this.f157133d = null;
        this.f157142o = -1;
        this.L = true;
        this.R = null;
        this.S = null;
        this.X = new java.util.HashMap();
        this.f157154x0 = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f157139l1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.13
            {
                this.__eventId = -260010650;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent walletErrorCodeDialogClickEvent) {
                com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.this;
                if (com.tencent.mm.sdk.platformtools.t8.D0(remittanceBaseUI.Z.getUri(), walletErrorCodeDialogClickEvent.f54954g.f6806a)) {
                    if (remittanceBaseUI.Z.T == 1) {
                        remittanceBaseUI.finish();
                    }
                }
                return false;
            }
        };
        this.f157145p1 = false;
        this.f157155x1 = false;
        this.f157158y1 = false;
        this.f157160z1 = false;
        this.A1 = null;
        this.B1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.F2fDynamicStartPayEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.29
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
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "receive dynamic req: %s, %s", java.lang.Integer.valueOf(e9Var.f6544c), str);
                com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.this;
                if (remittanceBaseUI.f157141n == 33) {
                    remittanceBaseUI.Z6(remittanceBaseUI.H, remittanceBaseUI.f157142o, remittanceBaseUI.I, remittanceBaseUI.f157132J, remittanceBaseUI.K, remittanceBaseUI.M, str, f2fDynamicStartPayEvent2);
                    return false;
                }
                remittanceBaseUI.Z6(remittanceBaseUI.H, remittanceBaseUI.f157142o, remittanceBaseUI.I, remittanceBaseUI.f157132J, remittanceBaseUI.K, null, str, f2fDynamicStartPayEvent2);
                return false;
            }
        };
        this.C1 = 0;
        this.D1 = 0.0d;
        this.E1 = "";
        this.F1 = "";
        this.G1 = "";
        this.H1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.F2fPayCheckEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.32
            {
                this.__eventId = 1822922800;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent) {
                com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent2 = f2fPayCheckEvent;
                am.g9 g9Var = f2fPayCheckEvent2.f54224g;
                boolean z17 = g9Var.f6745c;
                com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.this;
                if (z17) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.RemittanceBaseUI", "F2fPayCheckEvent is from kinda");
                    am.g9 g9Var2 = f2fPayCheckEvent2.f54224g;
                    int i17 = g9Var2.f6746d;
                    boolean z18 = true;
                    if (i17 == 1 || i17 == 3) {
                        java.lang.String str = g9Var2.f6743a;
                        if (i17 == 3 && remittanceBaseUI.f157141n == 31) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "from wallet mix callback, ignore paycheck");
                        } else {
                            com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.U6(remittanceBaseUI, str, g9Var2.f6744b);
                        }
                        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.U6(remittanceBaseUI, str, g9Var2.f6744b);
                        if (g9Var2.f6747e == remittanceBaseUI.getContext().hashCode()) {
                            kw3.p.Ai().Di().d(remittanceBaseUI.Y, remittanceBaseUI.f157135f, "");
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBaseUI", "callback to wrong page: %s, %s", java.lang.Integer.valueOf(g9Var2.f6747e), java.lang.Integer.valueOf(remittanceBaseUI.getContext().hashCode()));
                        }
                    } else if (i17 == 2) {
                        int i18 = remittanceBaseUI.f157140m;
                        if (i18 != 2 && i18 != 5) {
                            z18 = false;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceBaseUI.f157135f) || z18) {
                            remittanceBaseUI.finish();
                        } else {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Chat_User", remittanceBaseUI.f157135f);
                            intent.putExtra("finish_direct", false);
                            j45.l.u(remittanceBaseUI, ".ui.chatting.ChattingUI", intent, null);
                        }
                    }
                } else {
                    com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.U6(remittanceBaseUI, g9Var.f6743a, g9Var.f6744b);
                }
                return false;
            }
        };
    }

    public static void U6(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = (java.util.HashMap) remittanceBaseUI.X;
        com.tencent.mm.plugin.remittance.ui.q1 q1Var = (com.tencent.mm.plugin.remittance.ui.q1) hashMap.get(str);
        hashMap.size();
        if (q1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "no data for: %s", str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "pay check: %d", java.lang.Integer.valueOf(remittanceBaseUI.f157141n));
            if (com.tencent.mm.sdk.platformtools.t8.K0(q1Var.f157891g)) {
                q1Var.f157891g = str2;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(q1Var.f157886b)) {
                q1Var.f157886b = str2;
            }
            if (remittanceBaseUI.f157141n == 31) {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.k0(str, q1Var.f157890f, q1Var.f157891g, q1Var.f157892h, q1Var.f157893i, q1Var.f157887c));
            } else {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.w(q1Var.f157885a, q1Var.f157886b, q1Var.f157887c, q1Var.f157888d, q1Var.f157889e));
            }
        }
        hashMap.clear();
    }

    public static void V6(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceBaseUI.H)) {
            remittanceBaseUI.f157152w.setVisibility(8);
            if (remittanceBaseUI.f157140m == 1) {
                remittanceBaseUI.f157153x.setText(com.tencent.mm.R.string.hyd);
            } else {
                remittanceBaseUI.f157153x.setText(com.tencent.mm.R.string.hyc);
            }
            remittanceBaseUI.f157153x.setVisibility(0);
            return;
        }
        new com.tencent.mm.plugin.wallet_core.ui.b4(remittanceBaseUI.getContext());
        java.lang.String string = remittanceBaseUI.getString(com.tencent.mm.R.string.f492824i05);
        java.lang.String string2 = remittanceBaseUI.getString(com.tencent.mm.R.string.b9z, remittanceBaseUI.H, string);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(remittanceBaseUI, string2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(i17);
        spannableStringBuilder.setSpan(remittanceBaseUI.f157142o == 0 ? new android.text.style.ForegroundColorSpan(-15970418) : new android.text.style.ForegroundColorSpan(remittanceBaseUI.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo)), i17.length() - string.length(), i17.length(), 34);
        remittanceBaseUI.f157152w.setText(spannableStringBuilder);
        remittanceBaseUI.f157153x.setVisibility(8);
        remittanceBaseUI.f157152w.setVisibility(0);
    }

    public static void h7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = str2;
        aVar.f211729s = str;
        aVar.f211732v = str3;
        aVar.E = onClickListener;
        aVar.f211733w = str4;
        aVar.F = onClickListener2;
        aVar.A = false;
        aVar.B = true;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        db5.e1.a(context, j0Var);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "onGet");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceBaseUI", "notifyChanged: user = " + str);
        } else if (str.equals(this.f157135f)) {
            j7();
        }
    }

    public void W6() {
    }

    public abstract void X6();

    public void Y6() {
        com.tencent.mm.plugin.remittance.model.l0 l0Var = new com.tencent.mm.plugin.remittance.model.l0(this.f157135f, this.f157143p);
        l0Var.setProcessName("RemittanceProcess");
        doSceneProgress(l0Var);
    }

    public abstract void Z6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent);

    public final void a7(boolean z17, android.content.Intent intent) {
        if (z17) {
            java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.Y)) {
                this.Y = stringExtra;
            }
            int i17 = this.f157141n;
            if (i17 != 33 && i17 != 32) {
                com.tencent.mm.plugin.remittance.model.u1.a(this.f157135f);
            }
            if (this.f157140m == 1) {
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
            if (this.f157140m == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 16, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 7, 1);
            }
        }
        int i18 = this.f157142o;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 0) {
            if (z17) {
                this.C1 = 1;
            } else {
                if (intent == null) {
                    return;
                }
                this.C1 = intent.getIntExtra("key_pay_reslut_type", 3);
                this.D1 = this.f157134e;
                this.E1 = this.H;
                this.F1 = this.K;
                this.G1 = this.Y;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "savePayInfoInReRemittanceUI() mLastPayResult:%s mlastTotalFee:%s mLastDesc:%s mLastAddress:%s mLastTransferId:%s", java.lang.Integer.valueOf(this.C1), java.lang.Double.valueOf(this.D1), this.E1, this.F1, this.G1);
        }
    }

    public void b7() {
        com.tencent.mm.modelavatar.r0 n07;
        java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.f157135f), 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            I = getString(com.tencent.mm.R.string.hyz, I, this.Q);
        }
        int i17 = this.f157140m;
        boolean z17 = false;
        if (i17 == 1) {
            I = getIntent().getStringExtra("receiver_tips");
            this.f157149t.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            this.f157150u.setVisibility(0);
            java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(this.f157135f) ? getString(com.tencent.mm.R.string.f492815hz2, this.Q) : getString(com.tencent.mm.R.string.f492814hz1, com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.f157135f), 10), this.Q);
            android.widget.TextView textView = this.f157150u;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = this.f157150u.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string, textSize));
        } else if (i17 == 6) {
            java.lang.String stringExtra = getIntent().getStringExtra("receiver_tips");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f157137h)) {
                I = this.f157137h;
            }
            I = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? getString(com.tencent.mm.R.string.f492813hz0, I) : com.tencent.mm.sdk.platformtools.t8.z1(stringExtra, I);
        }
        android.widget.TextView textView2 = this.f157149t;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float textSize2 = this.f157149t.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, I, textSize2));
        if (gm0.j1.a()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
            if (Ni != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f157135f) && ((n07 = Ni.n0(this.f157135f)) == null || com.tencent.mm.sdk.platformtools.t8.K0(n07.d()))) {
                ((c01.k7) c01.n8.a()).b(this.f157135f, 4, new com.tencent.mm.plugin.remittance.ui.m1(this, java.lang.System.currentTimeMillis()));
                z17 = true;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f157135f) || com.tencent.mm.sdk.platformtools.t8.K0(this.f157136g)) {
            if (z17) {
                return;
            }
            j7();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "use mRecvHeadimgurl(%s) to avatar, mReceiverAvatarIv:%s", this.f157136g, this.f157148s.getClass().getSimpleName());
            if (this.f157148s instanceof com.tencent.mm.pluginsdk.ui.applet.CdnImageView) {
                int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 44.0f);
                ((com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f157148s).setRoundCorner(true);
                ((com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f157148s).b(this.f157136g, d17, d17, com.tencent.mm.R.drawable.bhm);
            }
        }
    }

    public final void c7(int i17, int i18, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct wCPayLargeAmountTransferReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct();
        this.f157144p0 = wCPayLargeAmountTransferReportStruct;
        wCPayLargeAmountTransferReportStruct.f62111d = i17;
        wCPayLargeAmountTransferReportStruct.f62112e = i18;
        wCPayLargeAmountTransferReportStruct.f62113f = wCPayLargeAmountTransferReportStruct.b("OrderId", str, true);
        this.f157144p0.k();
    }

    public void d7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("recent_remittance_contact_list", com.tencent.mm.plugin.remittance.model.u1.b());
        intent.setClass(getContext(), com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.class);
        startActivityForResult(intent, 2);
    }

    public final boolean e7(com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        at4.a aVar = q0Var.f156983z;
        if (aVar == null || !aVar.a()) {
            return false;
        }
        this.f157160z1 = true;
        at4.a aVar2 = q0Var.f156983z;
        db5.e1.A(this, aVar2.f13795a, "", aVar2.f13797c, aVar2.f13796b, new com.tencent.mm.plugin.remittance.ui.m0(this, q0Var), new com.tencent.mm.plugin.remittance.ui.n0(this));
        return true;
    }

    public abstract void f7();

    public final boolean g7(com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        if (this.f157145p1 || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156969i)) {
            z17 = false;
        } else {
            this.f157145p1 = true;
            c7(2, 1, q0Var.D);
            db5.e1.A(this, q0Var.f156969i, getString(com.tencent.mm.R.string.f490539xy), getString(com.tencent.mm.R.string.f492818hz5), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.remittance.ui.o0(this, q0Var), new com.tencent.mm.plugin.remittance.ui.p0(this, q0Var));
            z17 = true;
        }
        if (!z17 && !this.f157155x1) {
            if (q0Var.f156965e > 0) {
                this.f157155x1 = true;
                com.tencent.mm.plugin.remittance.model.p0 p0Var = q0Var.f156966f;
                if (p0Var != null) {
                    h7(this, com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f156952a) ? getString(com.tencent.mm.R.string.i0z, java.lang.Integer.valueOf(q0Var.f156965e)) : q0Var.f156966f.f156952a, "", getString(com.tencent.mm.R.string.f492818hz5), com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156966f.f156953b) ? getString(com.tencent.mm.R.string.i0o) : q0Var.f156966f.f156953b, new com.tencent.mm.plugin.remittance.ui.q0(this, q0Var), new com.tencent.mm.plugin.remittance.ui.r0(this, q0Var));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "scene.zaituMessage == null");
                    h7(this, getString(com.tencent.mm.R.string.i0z, java.lang.Integer.valueOf(q0Var.f156965e)), getString(com.tencent.mm.R.string.f490539xy), getString(com.tencent.mm.R.string.f492818hz5), getString(com.tencent.mm.R.string.i0o), new com.tencent.mm.plugin.remittance.ui.t0(this, q0Var), new com.tencent.mm.plugin.remittance.ui.u0(this));
                }
                z17 = true;
            } else {
                z17 = false;
            }
        }
        if (z17 || this.f157158y1) {
            z18 = false;
            z19 = true;
        } else {
            if (q0Var.f156973p) {
                this.f157158y1 = true;
                z18 = false;
                z19 = true;
                com.tencent.mm.plugin.remittance.ui.b2.c(this, this.f157140m, this.f157134e, q0Var.f156975r / 100.0d, null, q0Var.f156974q / 100.0d, q0Var.f156971n / 100.0d, q0Var.f156972o, new com.tencent.mm.plugin.remittance.ui.v0(this, q0Var));
                z27 = true;
            } else {
                z18 = false;
                z19 = true;
                z27 = false;
            }
            z17 = z27;
        }
        if (!z17 && !this.f157160z1) {
            z17 = e7(q0Var);
        }
        boolean z28 = z17;
        if (z28 || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.B) || com.tencent.mm.sdk.platformtools.t8.K0(q0Var.C)) {
            return z28;
        }
        java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.f157135f), 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f157137h)) {
            I = this.f157137h;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            I = getString(com.tencent.mm.R.string.hyz, I, this.Q);
        }
        java.lang.String str = q0Var.f156964d;
        java.lang.String str2 = q0Var.C;
        java.lang.String str3 = q0Var.B;
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ceh, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m8a);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m8_);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m89);
        textView.setText(str2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, I, textSize));
        textView3.setText(java.lang.String.format("%s%.2f", com.tencent.mm.wallet_core.model.c2.b(), java.lang.Double.valueOf(java.lang.Double.valueOf(com.tencent.mm.sdk.platformtools.t8.F(str3, 0.0d)).doubleValue() / 100.0d)));
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = z18;
        i0Var.g(com.tencent.mm.R.string.i1b);
        aVar.L = inflate;
        i0Var.f(com.tencent.mm.R.string.f492818hz5);
        i0Var.e(com.tencent.mm.R.string.apj);
        aVar.F = new com.tencent.mm.plugin.remittance.ui.h1(this);
        aVar.E = new com.tencent.mm.plugin.remittance.ui.i1(this, str, q0Var);
        i0Var.a().show();
        return z19;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        int i17 = this.f157141n;
        if (i17 == 33 || i17 == 32) {
            return com.tencent.mm.R.layout.cea;
        }
        int i18 = this.f157142o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (!(i18 == 0)) {
            return com.tencent.mm.R.layout.ce_;
        }
        hideActionbarLine();
        return com.tencent.mm.R.layout.ced;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i7(java.lang.String r19, java.lang.String r20, java.lang.String r21, com.tencent.mm.plugin.remittance.model.q0 r22) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.i7(java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.remittance.model.q0):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17 = this.f157141n;
        if (i17 == 33 || i17 == 32) {
            setMMTitle(com.tencent.mm.R.string.hys);
        } else {
            setMMTitle(com.tencent.mm.R.string.i1h);
        }
        setBackBtn(new com.tencent.mm.plugin.remittance.ui.s0(this));
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.mKBLayout = findViewById(com.tencent.mm.R.id.o1v);
        this.B = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view);
        this.f157148s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lwn);
        this.f157149t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwo);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwp);
        this.f157150u = textView;
        textView.setVisibility(8);
        this.D = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486619lw0);
        this.C = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486624lw5);
        this.f157159z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486622lw3);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486623lw4);
        this.f157156y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486621lw2);
        int i18 = this.f157142o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 0) {
            this.E = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lu9);
            this.F = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k3r);
            this.G = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482740mn);
        }
        b7();
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485972jq4);
        this.f157147r = walletFormView;
        if (this.f157141n == 33) {
            this.f157159z.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f157134e));
            this.A.setText(com.tencent.mm.wallet_core.model.c2.b());
            java.lang.String stringExtra = getIntent().getStringExtra("desc");
            this.M = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f157156y.setVisibility(8);
            } else {
                android.widget.TextView textView2 = this.f157156y;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String str = this.M;
                float textSize = this.f157156y.getTextSize();
                ((ke0.e) xVar).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
                this.f157156y.setVisibility(0);
            }
            this.C.setVisibility(0);
            this.D.setVisibility(8);
        } else {
            walletFormView.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.p1(this));
            this.f157147r.getTitleTv().setText(java.lang.String.format(getString(com.tencent.mm.R.string.i09), "¥"));
            this.f157147r.b(new com.tencent.mm.plugin.remittance.ui.k0(this));
            setEditFocusListener(this.f157147r, 2, false);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.lwe);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(8);
            this.D.setVisibility(0);
            setTenpayKBStateListener(new com.tencent.mm.plugin.remittance.ui.l0(this));
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f157146q = button;
        button.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.d1(this));
        this.f157152w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486617lv4);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482711lu);
        this.f157153x = textView3;
        int i19 = this.f157140m;
        if (i19 == 1 || i19 == 6) {
            textView3.setText(com.tencent.mm.R.string.hyd);
        } else {
            textView3.setText(com.tencent.mm.R.string.hyc);
        }
        if (!c01.z1.I()) {
            findViewById(com.tencent.mm.R.id.f486618lv5).setOnClickListener(new com.tencent.mm.plugin.remittance.ui.j1(this));
        }
        if (this.f157140m == 1) {
            gm0.j1.i();
            if (((java.lang.String) gm0.j1.u().c().l(327732, "0")).equals("0")) {
                db5.e1.m(getContext(), com.tencent.mm.R.string.i0b, com.tencent.mm.R.string.i0c, new com.tencent.mm.plugin.remittance.ui.k1(this));
                gm0.j1.i();
                gm0.j1.u().c().w(327732, "1");
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            }
        }
        this.f157151v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kw8);
        m7();
        k7();
        l7();
    }

    public final void j7() {
        com.tencent.mm.plugin.remittance.ui.n1 n1Var = new com.tencent.mm.plugin.remittance.ui.n1(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            n1Var.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.remittance.ui.o1(this, n1Var));
        }
    }

    public abstract void k7();

    public final void l7() {
        int i17 = this.f157140m;
        if (!(i17 == 0 || i17 == 2) || com.tencent.mm.sdk.platformtools.t8.K0(this.S) || this.U == 0 || this.T != 1) {
            removeAllOptionMenu();
        } else {
            addIconOptionMenu(0, com.tencent.mm.R.drawable.chy, new com.tencent.mm.plugin.remittance.ui.l1(this));
        }
    }

    public final void m7() {
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.R) || (i17 = this.U) == 0) {
            this.f157151v.setText("");
            this.f157151v.setVisibility(8);
            return;
        }
        int i18 = i17 == 1 ? 2 : 24;
        try {
            this.f157151v.setText(java.lang.String.format(this.R, java.lang.Integer.valueOf(i18)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceBaseUI", e17, "", new java.lang.Object[0]);
            this.f157151v.setText(getString(com.tencent.mm.R.string.i0g, java.lang.Integer.valueOf(i18)));
        }
        this.f157151v.setVisibility(0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needLockPage() {
        int i17 = this.f157141n;
        return i17 == 33 || i17 == 32;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqcode=");
        sb6.append(i17);
        sb6.append(", resultCode=");
        sb6.append(i18);
        sb6.append(", username=");
        java.lang.String str = this.f157135f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(", =");
        java.lang.String str2 = this.f157137h;
        sb6.append(str2 != null ? str2 : "null");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", sb6.toString());
        if (i17 == 1) {
            a7(i18 == -1, intent);
        } else if (i17 != 2) {
            if (i17 == 5) {
                a7(i18 == -1, intent);
            } else if (i17 == 6) {
                if (i18 == -1 && intent != null) {
                    hideTenpayKB();
                    java.lang.String string = getString(com.tencent.mm.R.string.aeq);
                    java.lang.String string2 = getString(com.tencent.mm.R.string.hz8);
                    java.lang.String stringExtra = intent.getStringExtra("userName");
                    java.lang.String stringExtra2 = intent.getStringExtra("telNumber");
                    java.lang.String str3 = intent.getStringExtra("proviceFirstStageName") + intent.getStringExtra("addressCitySecondStageName") + intent.getStringExtra("addressCountiesThirdStageName") + intent.getStringExtra("addressDetailInfo");
                    java.lang.String str4 = this.H;
                    com.tencent.mm.plugin.remittance.ui.w0 w0Var = new com.tencent.mm.plugin.remittance.ui.w0(this);
                    com.tencent.mm.plugin.remittance.ui.y0 y0Var = new com.tencent.mm.plugin.remittance.ui.y0(this);
                    if (!isFinishing()) {
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                        u1Var.a(true);
                        u1Var.i(y0Var);
                        u1Var.u(string);
                        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f489609d54, null);
                        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.d98);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                            float textSize = editText.getTextSize();
                            ((ke0.e) xVar).getClass();
                            editText.append(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str4, textSize));
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                            editText.setHint(string2);
                        }
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f482688lb);
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f482742mp);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k3r);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482740mn);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482743mq);
                        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482687la)).getDrawable().setColorFilter(-15970418, android.graphics.PorterDuff.Mode.SRC_ATOP);
                        textView3.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hyb));
                        linearLayout.setOnClickListener(new gt4.d(w0Var, editText, this, u1Var));
                        linearLayout.setVisibility(8);
                        linearLayout2.setVisibility(0);
                        textView.setText(stringExtra + "  " + stringExtra2);
                        textView2.setText(str3);
                        inflate.findViewById(com.tencent.mm.R.id.dik).setOnClickListener(new gt4.e(w0Var, editText, stringExtra, stringExtra2, textView2, this, u1Var));
                        inflate.findViewById(com.tencent.mm.R.id.f484042ct5).setOnClickListener(new gt4.f(linearLayout, linearLayout2, textView, textView2));
                        u1Var.m(com.tencent.mm.R.string.f490507x1);
                        u1Var.l(new gt4.h(this, w0Var, textView, editText, stringExtra, stringExtra2, textView2));
                        ck5.f b17 = ck5.f.b(editText);
                        b17.f42561f = 0;
                        b17.f42560e = 20;
                        b17.d(null);
                        u1Var.d(inflate);
                        u1Var.q(false);
                        u1Var.f211998c.getContentView().post(new gt4.i(false, textView2, this));
                        com.tencent.mm.sdk.platformtools.u3.h(new gt4.j(this, editText));
                    }
                }
            }
        } else if (i18 != -1 || intent == null) {
            finish();
        } else {
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Conv_User");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                finish();
            } else {
                this.f157135f = stringExtra3;
                b7();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f157140m = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f157141n = getIntent().getIntExtra("pay_scene", 31);
        int i17 = this.f157140m;
        if (!(i17 == 0 || i17 == 2)) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            this.f157157y0 = uuid;
            zr4.b.d(uuid);
        }
        if (this instanceof com.tencent.mm.plugin.remittance.ui.RemittanceHKUI) {
            this.f157142o = 1;
        } else if (this instanceof com.tencent.mm.plugin.remittance.ui.RemittanceOSUI) {
            this.f157142o = 2;
        }
        super.onCreate(bundle);
        this.f157133d = nr4.a.d(getIntent());
        this.f157143p = getIntent().getStringExtra("scan_remittance_id");
        this.f157134e = getIntent().getDoubleExtra("fee", 0.0d);
        this.f157135f = getIntent().getStringExtra("receiver_name");
        this.f157136g = getIntent().getStringExtra("recv_headimgurl");
        this.f157137h = getIntent().getStringExtra("receiver_nick_name");
        this.Q = getIntent().getStringExtra("receiver_true_name");
        getIntent().getStringExtra("mch_name");
        this.f157138i = getIntent().getStringExtra("mch_info");
        this.P = getIntent().getIntExtra("pay_channel", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("rcvr_open_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.V = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "mUserName %s", this.f157135f);
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        if ((16 & longValue) != 0) {
            this.U = 1;
        } else if ((longValue & 32) != 0) {
            this.U = 2;
        } else {
            this.U = 0;
        }
        X6();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
        initView();
        this.H1.alive();
        com.tencent.mm.wallet_core.b.a().getClass();
        this.mKindaEnable = true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f157139l1.dead();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().q(this);
        this.H1.dead();
        this.B1.dead();
        zr4.b.c(this.f157157y0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof ss4.k0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "net error, use hardcode wording");
                this.f157151v.setText("");
                this.f157151v.setVisibility(8);
                return false;
            }
            if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.q0)) {
                return false;
            }
            if (this.mKindaEnable) {
                hideLoading();
            }
            com.tencent.mm.plugin.remittance.model.q0 q0Var = (com.tencent.mm.plugin.remittance.model.q0) m1Var;
            this.Z = q0Var;
            this.f157139l1.alive();
            com.tencent.mm.wallet_core.model.a2.b(this.f157141n, "", i18);
            return e7(q0Var);
        }
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.q0) {
            com.tencent.mm.plugin.remittance.model.q0 q0Var2 = (com.tencent.mm.plugin.remittance.model.q0) m1Var;
            com.tencent.mm.wallet_core.model.a2.b(this.f157141n, q0Var2.f156964d, i18);
            this.N = q0Var2.f156970m;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(q0Var2.f156976s)) {
                this.Q = q0Var2.f156976s;
            }
            int i19 = this.f157141n;
            if (i19 == 32 || i19 == 33) {
                this.Y = q0Var2.f156978u;
            } else {
                this.Y = q0Var2.D;
            }
            nr4.a aVar = this.f157133d;
            if (aVar != null) {
                aVar.b(10000, java.lang.Integer.valueOf(i19), this.f157135f, java.lang.Double.valueOf(q0Var2.f156982y));
            }
            r45.o10 o10Var = q0Var2.R;
            this.W = o10Var != null ? com.tencent.mm.sdk.platformtools.t8.K0(o10Var.f381813g) ? this.W : q0Var2.R.f381813g : "";
            if (!g7(q0Var2)) {
                i7(q0Var2.f156964d, this.f157135f, this.Q, q0Var2);
            } else if (this.mKindaEnable) {
                hideLoading();
            }
            ((java.util.HashMap) this.X).put(q0Var2.f156964d, new com.tencent.mm.plugin.remittance.ui.q1(q0Var2.f156977t, q0Var2.f156978u, q0Var2.f156979v, q0Var2.f156980w, q0Var2.f156981x, q0Var2.D, q0Var2.E, q0Var2.F, com.tencent.mm.sdk.platformtools.t8.V(q0Var2.B, 0L)));
        } else if (m1Var instanceof ss4.k0) {
            ss4.k0 k0Var = (ss4.k0) m1Var;
            this.R = k0Var.f412075d;
            this.S = k0Var.f412080i;
            this.T = k0Var.f412081m;
            m7();
            l7();
        }
        return true;
    }
}
