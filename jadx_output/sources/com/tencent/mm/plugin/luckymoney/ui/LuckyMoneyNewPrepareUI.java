package com.tencent.mm.plugin.luckymoney.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI;", "Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBaseUI;", "Lcom/tencent/mm/plugin/luckymoney/ui/ik;", "Lmp5/v;", "<init>", "()V", "com/tencent/mm/plugin/luckymoney/ui/la", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LuckyMoneyNewPrepareUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI implements com.tencent.mm.plugin.luckymoney.ui.ik, mp5.v {

    /* renamed from: x2, reason: collision with root package name */
    public static java.lang.ref.WeakReference f146241x2;
    public android.widget.ImageView A;
    public android.view.View B;
    public java.lang.String B1;
    public com.tencent.mm.view.MMPAGView C;
    public boolean C1;
    public ym5.w1 D;
    public java.lang.String D1;
    public kotlinx.coroutines.y0 E;
    public java.lang.String E1;
    public boolean F;
    public java.lang.String F1;
    public android.widget.TextView G;
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel G1;
    public android.view.ViewGroup H;
    public com.tencent.mm.plugin.luckymoney.ui.b H1;
    public android.widget.TextView I;
    public android.view.ViewGroup I1;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f146244J;
    public android.view.View J1;
    public android.widget.TextView K;
    public com.tencent.mm.api.IEmojiInfo K1;
    public android.widget.ImageView L;
    public com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct L1;
    public android.widget.TextView M;
    public com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct M1;
    public android.view.ViewGroup N;
    public int N1;
    public com.tencent.mm.ui.widget.imageview.WeImageView P;
    public int P1;
    public android.widget.TextView Q;
    public int Q1;
    public com.tencent.mm.wallet_core.ui.WcPayBannerView R;
    public java.lang.String R1;
    public java.lang.String S1;
    public int T;
    public java.lang.String T1;
    public int U;
    public boolean U1;
    public java.lang.String V;
    public boolean V1;
    public int W;
    public boolean W1;
    public boolean X;
    public boolean X1;
    public int Y;
    public boolean Y1;
    public com.tencent.mm.plugin.luckymoney.model.c1 Z;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f146245a2;

    /* renamed from: b2, reason: collision with root package name */
    public float f146246b2;

    /* renamed from: c2, reason: collision with root package name */
    public float f146247c2;

    /* renamed from: f2, reason: collision with root package name */
    public r45.lm5 f146250f2;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView f146251g;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f146252g2;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView f146253h;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.j f146254h2;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView f146255i;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f146256i2;

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f146257j2;

    /* renamed from: k2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f146258k2;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f146259l1;

    /* renamed from: l2, reason: collision with root package name */
    public int f146260l2;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146261m;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.String f146262m2;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f146263n;

    /* renamed from: n2, reason: collision with root package name */
    public int f146264n2;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f146265o;

    /* renamed from: o2, reason: collision with root package name */
    public long f146266o2;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f146267p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.m f146268p0;

    /* renamed from: p2, reason: collision with root package name */
    public long f146270p2;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f146271q;

    /* renamed from: q2, reason: collision with root package name */
    public java.lang.String f146272q2;

    /* renamed from: r, reason: collision with root package name */
    public android.app.Dialog f146273r;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f146274r2;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Dialog f146275s;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f146276s2;

    /* renamed from: t, reason: collision with root package name */
    public android.app.Dialog f146277t;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f146278t2;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f146279u;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f146280u2;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f146281v;

    /* renamed from: v2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f146282v2;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f146283w;

    /* renamed from: w2, reason: collision with root package name */
    public int f146284w2;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.MMScrollView f146285x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f146286x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f146288y;

    /* renamed from: y0, reason: collision with root package name */
    public int f146289y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f146290y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f146291z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f146292z1;

    /* renamed from: y2, reason: collision with root package name */
    public static final java.lang.String f146242y2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf7";

    /* renamed from: z2, reason: collision with root package name */
    public static final java.lang.String f146243z2 = "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml";
    public static final int A2 = 1;
    public static final int B2 = 2;
    public static final int C2 = 3;
    public static final int D2 = 4;
    public static final int E2 = 5;
    public static final int F2 = 6;
    public static final int G2 = 1;
    public static final int H2 = 2;
    public static final int I2 = 3;
    public static final int J2 = 2;
    public static final int K2 = 1;
    public static final int L2 = 8;
    public static final int M2 = 1;
    public static final int N2 = 1;
    public static final double O2 = 0.01d;
    public static final int P2 = 401;
    public static final int Q2 = 402;
    public static final int R2 = 5000;
    public static final int S2 = 268502454;
    public static final int T2 = 1;
    public static final int U2 = 2;
    public static final int V2 = 1;
    public final com.tencent.mm.plugin.luckymoney.ui.c6 S = new com.tencent.mm.plugin.luckymoney.ui.c6();

    /* renamed from: p1, reason: collision with root package name */
    public int f146269p1 = 1;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f146287x1 = com.tencent.mm.wallet_core.ui.r1.l("CNY");
    public java.lang.String A1 = "";
    public int O1 = 1;

    /* renamed from: d2, reason: collision with root package name */
    public int f146248d2 = 1;

    /* renamed from: e2, reason: collision with root package name */
    public java.lang.String f146249e2 = "";

    public LuckyMoneyNewPrepareUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f146257j2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PayLoopInterruptEvent>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI$mPayLoopInterruptListener$1
            {
                this.__eventId = 1264607315;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PayLoopInterruptEvent payLoopInterruptEvent) {
                com.tencent.mm.autogen.events.PayLoopInterruptEvent event = payLoopInterruptEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (1 != event.f54610g.f6481a) {
                    return false;
                }
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.this.finish();
                return false;
            }
        };
        this.f146258k2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI$hkCashierPayResultIListener$1
            {
                this.__eventId = -1594159370;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent) {
                com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent event = hKCashierJSApiPayResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "hkCashierPayResultIListener callback");
                if (event.f54428g.f6451a == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "hkCashierPayResultIListener callback paysucc");
                    event.f54428g.f6452b = 1;
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.luckymoney.ui.pa paVar = new com.tencent.mm.plugin.luckymoney.ui.pa(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.this);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(paVar, 200L, false);
                }
                dead();
                return true;
            }
        };
        this.f146262m2 = "";
        this.f146272q2 = "";
        this.f146282v2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.Show261AlertEvent>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI$mShow261AlertEventIListener$1
            {
                this.__eventId = -2016047906;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.Show261AlertEvent show261AlertEvent) {
                android.app.Dialog dialog;
                com.tencent.mm.autogen.events.Show261AlertEvent event = show261AlertEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.this;
                android.app.Dialog dialog2 = luckyMoneyNewPrepareUI.f146273r;
                if (dialog2 != null) {
                    if ((dialog2.isShowing()) && (dialog = luckyMoneyNewPrepareUI.f146273r) != null) {
                        dialog.dismiss();
                    }
                }
                at4.a aVar = event.f54781g.f7660a;
                if (aVar != null && aVar.a()) {
                    java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "show 261 alert item");
                    luckyMoneyNewPrepareUI.f146280u2 = true;
                    db5.e1.A(luckyMoneyNewPrepareUI.getContext(), aVar.f13795a, "", aVar.f13797c, aVar.f13796b, new com.tencent.mm.plugin.luckymoney.ui.nb(aVar, luckyMoneyNewPrepareUI), new com.tencent.mm.plugin.luckymoney.ui.ob(luckyMoneyNewPrepareUI));
                }
                return false;
            }
        };
    }

    public static final void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, byte[] bArr, boolean z17, boolean z18) {
        luckyMoneyNewPrepareUI.F = true;
        android.content.Intent intent = new android.content.Intent(luckyMoneyNewPrepareUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.class);
        if (bArr != null) {
            if ((!(bArr.length == 0)) && bArr.length > 0) {
                intent.putExtra("key_has_resp", true);
            }
        }
        intent.putExtra("key_session_id", luckyMoneyNewPrepareUI.T1);
        intent.putExtra("key_has_source", z17);
        intent.putExtra("key_has_reddot", z18);
        intent.putExtra("key_exchange_title", luckyMoneyNewPrepareUI.R1);
        intent.putExtra("key_exchange_url", luckyMoneyNewPrepareUI.S1);
        luckyMoneyNewPrepareUI.startActivityForResult(intent, E2);
    }

    public static final void W6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, int i17) {
        luckyMoneyNewPrepareUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportEmoticonActionFor18890] action: ");
        sb6.append(i17);
        sb6.append(", emoticonMd5: ");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = luckyMoneyNewPrepareUI.K1;
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", sb6.toString());
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[13];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.q7());
        objArr[2] = luckyMoneyNewPrepareUI.T1;
        objArr[3] = luckyMoneyNewPrepareUI.s7();
        objArr[4] = luckyMoneyNewPrepareUI.p7();
        objArr[5] = luckyMoneyNewPrepareUI.r7();
        objArr[6] = "";
        objArr[7] = 0;
        objArr[8] = "";
        objArr[9] = 0;
        objArr[10] = "";
        objArr[11] = 0;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = luckyMoneyNewPrepareUI.K1;
        java.lang.String md52 = iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null;
        objArr[12] = md52 != null ? md52 : "";
        g0Var.d(18890, objArr);
    }

    public static final void X6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        luckyMoneyNewPrepareUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        luckyMoneyNewPrepareUI.L1 = redEnvSendWithEmoticonClickStruct;
        redEnvSendWithEmoticonClickStruct.f59936d = 3L;
        redEnvSendWithEmoticonClickStruct.k();
        luckyMoneyNewPrepareUI.hideTenpayKB();
        luckyMoneyNewPrepareUI.hideVKB();
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(ec3.g1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((ec3.g1) a17).R6(false);
        com.tencent.mm.plugin.luckymoney.ui.b bVar = luckyMoneyNewPrepareUI.H1;
        if (bVar != null) {
            bVar.show();
        }
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        int i18 = luckyMoneyNewPrepareUI.N1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 1) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = luckyMoneyNewPrepareUI.G1;
            if (chatFooterPanel != null) {
                chatFooterPanel.setHBScene(5);
            }
        } else {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = luckyMoneyNewPrepareUI.G1;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setHBScene(2);
            }
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = luckyMoneyNewPrepareUI.f146255i;
        fc3.j.c(luckyMoneyTextInputView != null ? luckyMoneyTextInputView.getInput() : null, luckyMoneyNewPrepareUI.I1, luckyMoneyNewPrepareUI.G1, 0, new com.tencent.mm.plugin.luckymoney.ui.wc(luckyMoneyNewPrepareUI));
    }

    public final void A7(int i17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView2;
        android.widget.TextView textView;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView3;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "update view by mode: %s, %s", java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(i17));
        int i18 = this.T;
        if (i17 == i18) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.S;
        if (i18 == 0) {
            gb3.p.f270046e = 1;
            android.widget.TextView textView2 = this.I;
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.gls);
            }
            android.view.ViewGroup viewGroup = this.f146244J;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f146251g;
            if (luckyMoneyNumInputView != null) {
                luckyMoneyNumInputView.setVisibility(0);
            }
            android.widget.TextView textView3 = this.K;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            android.widget.TextView textView4 = this.f146271q;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            c6Var.e();
            c6Var.d(this.f146251g);
            c6Var.d(this.f146253h);
            c6Var.d(this.f146255i);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView2 = this.f146251g;
            int input = luckyMoneyNumInputView2 != null ? luckyMoneyNumInputView2.getInput() : 0;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView4 = this.f146253h;
            double input2 = luckyMoneyMoneyInputView4 != null ? luckyMoneyMoneyInputView4.getInput() : 0.0d;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView5 = this.f146253h;
            if (luckyMoneyMoneyInputView5 != null) {
                luckyMoneyMoneyInputView5.setType(this.T);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView6 = this.f146253h;
            if (luckyMoneyMoneyInputView6 != null) {
                luckyMoneyMoneyInputView6.setShowGroupIcon(false);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView7 = this.f146253h;
            if (luckyMoneyMoneyInputView7 != null) {
                luckyMoneyMoneyInputView7.setTitle(getString(com.tencent.mm.R.string.go9));
            }
            if (input2 > 0.0d && input > 0 && (luckyMoneyMoneyInputView3 = this.f146253h) != null) {
                luckyMoneyMoneyInputView3.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input2 / input));
            }
            if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.Y)) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView8 = this.f146253h;
                if (luckyMoneyMoneyInputView8 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.Z;
                    luckyMoneyMoneyInputView8.setMaxAmount(c1Var != null ? c1Var.f145200y : 0.0d);
                }
            } else {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView9 = this.f146253h;
                if (luckyMoneyMoneyInputView9 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.Z;
                    luckyMoneyMoneyInputView9.setMaxAmount(c1Var2 != null ? c1Var2.f145186h : 0.0d);
                }
            }
            x7(this.f146249e2);
        } else if (i18 == 1) {
            gb3.p.f270046e = 2;
            android.widget.TextView textView5 = this.I;
            if (textView5 != null) {
                textView5.setText(com.tencent.mm.R.string.glr);
            }
            android.view.ViewGroup viewGroup2 = this.f146244J;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView3 = this.f146251g;
            if (luckyMoneyNumInputView3 != null) {
                luckyMoneyNumInputView3.setVisibility(0);
            }
            android.widget.TextView textView6 = this.K;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            android.widget.TextView textView7 = this.f146271q;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            c6Var.e();
            c6Var.d(this.f146251g);
            c6Var.d(this.f146253h);
            c6Var.d(this.f146255i);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView4 = this.f146251g;
            int input3 = luckyMoneyNumInputView4 != null ? luckyMoneyNumInputView4.getInput() : 0;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView10 = this.f146253h;
            double input4 = luckyMoneyMoneyInputView10 != null ? luckyMoneyMoneyInputView10.getInput() : 0.0d;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView11 = this.f146253h;
            if (luckyMoneyMoneyInputView11 != null) {
                luckyMoneyMoneyInputView11.setType(this.T);
            }
            if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.Y)) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView12 = this.f146253h;
                if (luckyMoneyMoneyInputView12 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var3 = this.Z;
                    luckyMoneyMoneyInputView12.setMaxAmount(c1Var3 != null ? c1Var3.A : 0.0d);
                }
            } else {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView13 = this.f146253h;
                if (luckyMoneyMoneyInputView13 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var4 = this.Z;
                    luckyMoneyMoneyInputView13.setMaxAmount(c1Var4 != null ? c1Var4.f145183e : 0.0d);
                }
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView14 = this.f146253h;
            if (luckyMoneyMoneyInputView14 != null) {
                luckyMoneyMoneyInputView14.setTitle(getString(com.tencent.mm.R.string.go8));
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView15 = this.f146253h;
            if (luckyMoneyMoneyInputView15 != null) {
                luckyMoneyMoneyInputView15.setShowGroupIcon(true);
            }
            if (i17 == 3 && input4 > 0.0d) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView16 = this.f146253h;
                if (luckyMoneyMoneyInputView16 != null) {
                    luckyMoneyMoneyInputView16.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input4));
                }
            } else if (input4 > 0.0d && input3 > 0 && (luckyMoneyMoneyInputView2 = this.f146253h) != null) {
                luckyMoneyMoneyInputView2.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input4 * input3));
            }
            x7(this.f146249e2);
        } else if (i18 == 3) {
            gb3.p.f270046e = 3;
            android.widget.TextView textView8 = this.I;
            if (textView8 != null) {
                textView8.setText(com.tencent.mm.R.string.glp);
            }
            android.view.ViewGroup viewGroup3 = this.f146244J;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView5 = this.f146251g;
            if (luckyMoneyNumInputView5 != null) {
                luckyMoneyNumInputView5.setVisibility(8);
            }
            android.widget.TextView textView9 = this.K;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            android.widget.TextView textView10 = this.f146271q;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
            c6Var.e();
            android.view.ViewParent viewParent = this.f146244J;
            c6Var.d(viewParent instanceof com.tencent.mm.plugin.luckymoney.ui.d6 ? (com.tencent.mm.plugin.luckymoney.ui.d6) viewParent : null);
            c6Var.d(this.f146253h);
            c6Var.d(this.f146255i);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView6 = this.f146251g;
            int input5 = luckyMoneyNumInputView6 != null ? luckyMoneyNumInputView6.getInput() : 0;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView17 = this.f146253h;
            double input6 = luckyMoneyMoneyInputView17 != null ? luckyMoneyMoneyInputView17.getInput() : 0.0d;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView18 = this.f146253h;
            if (luckyMoneyMoneyInputView18 != null) {
                luckyMoneyMoneyInputView18.setType(this.T);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView19 = this.f146253h;
            if (luckyMoneyMoneyInputView19 != null) {
                luckyMoneyMoneyInputView19.setShowGroupIcon(false);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView20 = this.f146253h;
            if (luckyMoneyMoneyInputView20 != null) {
                luckyMoneyMoneyInputView20.setTitle(getString(com.tencent.mm.R.string.go6));
            }
            if (i17 == 0 && input6 > 0.0d && input5 > 0) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView21 = this.f146253h;
                if (luckyMoneyMoneyInputView21 != null) {
                    luckyMoneyMoneyInputView21.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input6 * input5));
                }
            } else if (input6 > 0.0d && (luckyMoneyMoneyInputView = this.f146253h) != null) {
                luckyMoneyMoneyInputView.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input6));
            }
            if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.Y)) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView22 = this.f146253h;
                if (luckyMoneyMoneyInputView22 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var5 = this.Z;
                    luckyMoneyMoneyInputView22.setMaxAmount(c1Var5 != null ? c1Var5.f145200y : 0.0d);
                }
            } else {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView23 = this.f146253h;
                if (luckyMoneyMoneyInputView23 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var6 = this.Z;
                    luckyMoneyMoneyInputView23.setMaxAmount(c1Var6 != null ? c1Var6.f145186h : 0.0d);
                }
            }
            if (!this.V1) {
                android.view.ViewGroup viewGroup4 = this.f146244J;
                if (viewGroup4 != null) {
                    viewGroup4.post(new com.tencent.mm.plugin.luckymoney.ui.ad(this));
                }
                this.V1 = true;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_EXCLUSIVE_FIRST_BOOLEAN_SYNC;
            java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.TRUE);
            java.lang.Boolean bool = m17 instanceof java.lang.Boolean ? (java.lang.Boolean) m17 : null;
            if (bool != null ? bool.booleanValue() : true) {
                x7(getResources().getString(com.tencent.mm.R.string.f492426gl5));
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
            } else {
                x7(this.f146249e2);
            }
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.Y) && (textView = this.K) != null) {
            textView.setVisibility(8);
        }
        D4(true, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x058a  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(boolean r27, int r28) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.D4(boolean, int):void");
    }

    public final boolean Y6() {
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.Z;
        if (c1Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c1Var != null ? c1Var.f145194s : null)) {
                return true;
            }
        }
        return false;
    }

    public final void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[dismissDialogAfterCgi] ");
        android.app.Dialog dialog = this.f146275s;
        if (dialog != null) {
            if (dialog != null && dialog.isShowing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[dismissDialogAfterCgi] dismiss coperationTipDialog");
                android.app.Dialog dialog2 = this.f146275s;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
            }
        }
        android.app.Dialog dialog3 = this.f146277t;
        if (dialog3 != null) {
            if (dialog3 != null && dialog3.isShowing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[dismissDialogAfterCgi] dismiss coperationTipDialogNoTransparent");
                android.app.Dialog dialog4 = this.f146277t;
                if (dialog4 != null) {
                    dialog4.dismiss();
                }
            }
        }
    }

    public final void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "do business callback");
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.u5(this.A1, str, this.B1), false);
        } else {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.t5(this.A1, str, this.B1), false);
        }
    }

    public final void b7() {
        android.app.Dialog dialog = this.f146273r;
        if (dialog != null) {
            if (dialog != null) {
                dialog.show();
            }
        } else {
            android.app.Dialog h17 = com.tencent.mm.wallet_core.ui.b2.h(getContext(), true, new com.tencent.mm.plugin.luckymoney.ui.na(this));
            this.f146273r = h17;
            h17.setCancelable(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(boolean r9) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.c7(boolean):void");
    }

    public final void d7(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.luckymoney.model.d6 d6Var;
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        java.lang.String r17 = c01.z1.r();
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "onActivityResult() resultCode == RESULT_OK");
            this.f146284w2 = 1;
            java.lang.String str2 = this.A1;
            java.lang.String str3 = this.D1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d6Var = new com.tencent.mm.plugin.luckymoney.model.d6(str2, str3, 1, r17, str);
        } else {
            if (intent != null) {
                this.f146284w2 = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "doNetSceneLuckyMoneyReport() data == null");
                this.f146284w2 = 3;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", java.lang.Integer.valueOf(this.f146284w2));
            java.lang.String str4 = this.A1;
            java.lang.String str5 = this.D1;
            int i18 = this.f146284w2;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d6Var = new com.tencent.mm.plugin.luckymoney.model.d6(str4, str5, i18, r17, str);
        }
        gm0.j1.n().f273288b.g(d6Var);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4) {
            android.view.View view = this.f146279u;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f146279u;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                U6();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(int r26) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.e7(int):void");
    }

    public final void f7(int i17, java.lang.String str, int i18, long j17, long j18, java.lang.String str2) {
        java.lang.String str3;
        int i19;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.K1;
        java.lang.String str4 = null;
        if (iEmojiInfo != null) {
            java.lang.String md52 = iEmojiInfo != null ? iEmojiInfo.getMd5() : null;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = this.K1;
            str3 = md52;
            i19 = iEmojiInfo2 != null ? iEmojiInfo2.getType() : 0;
        } else {
            str3 = "";
            i19 = 0;
        }
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146268p0;
        if (mVar == null) {
            str4 = "";
        } else if (mVar != null) {
            str4 = mVar.f145436b;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "currency is RMB. userConfirmJump:%s，lastPayResult:%s，lastSendId:%s，mUniqueId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f146284w2), this.A1, this.D1);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doRMBPrePareBtnClick] type: union");
            doSceneProgress((!this.X || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? new com.tencent.mm.plugin.luckymoney.model.i6(i18, j17, j18, this.T, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), null, null, c01.z1.r(), c01.z1.l(), this.U, str4, this.D1, i17, this.f146284w2, this.A1, str3, i19) : new com.tencent.mm.plugin.luckymoney.model.i6(i18, j17, j18, this.T, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), str, com.tencent.mm.plugin.luckymoney.model.m5.m(str), c01.z1.r(), c01.z1.l(), this.U, str4, this.D1, i17, this.f146284w2, this.A1, str3, i19), false);
        } else if (this.Y == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doRMBPrePareBtnClick] type: live");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_live_id");
            java.lang.String str5 = stringExtra2 == null ? "" : stringExtra2;
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_live_attach");
            doSceneProgress(new yb3.c(i18, j17, j18, this.T, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), str, com.tencent.mm.plugin.luckymoney.model.m5.m(str), c01.z1.r(), c01.z1.l(), this.U, str4, this.D1, i17, this.f146284w2, this.A1, str3, i19, this.F1, str5, stringExtra3 == null ? "" : stringExtra3, getIntent().getIntExtra("key_live_anchor_type", 0)), false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doRMBPrePareBtnClick] type: normal");
            doSceneProgress((!this.X || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? new com.tencent.mm.plugin.luckymoney.model.h6(i18, j17, j18, this.T, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), null, null, c01.z1.r(), c01.z1.l(), this.U, str4, this.D1, i17, this.f146284w2, this.A1, str3, i19, this.F1) : new com.tencent.mm.plugin.luckymoney.model.h6(i18, j17, j18, this.T, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), str, com.tencent.mm.plugin.luckymoney.model.m5.m(str), c01.z1.r(), c01.z1.l(), this.U, str4, this.D1, i17, this.f146284w2, this.A1, str3, i19, this.F1), false);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doRMBPrePareBtnClick] do not has showSourceMac");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doRMBPrePareBtnClick] has showSourceMac");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 11);
        }
        b7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f146292z1 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_realname_guide_helper", this.f146292z1);
            j45.l.j(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent, null);
        }
        super.finish();
    }

    public final r45.lm5 g7() {
        if (this.f146250f2 == null) {
            this.f146250f2 = com.tencent.mm.plugin.luckymoney.model.m5.n();
        }
        return this.f146250f2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489249ej2;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.widget.EditText editText;
        android.widget.EditText editText2;
        if (f17 > 0.0f && this.f146246b2 <= 0.0f) {
            this.f146246b2 = f17;
        }
        if (f17 > 0.0f || this.f146246b2 <= 0.0f) {
            return;
        }
        this.f146246b2 = f17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = 6;
        objArr[1] = java.lang.Integer.valueOf(this.f146248d2);
        objArr[2] = java.lang.Float.valueOf(this.f146247c2);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = this.f146253h;
        android.text.Editable editable = null;
        objArr[3] = (luckyMoneyMoneyInputView == null || (editText2 = luckyMoneyMoneyInputView.getEditText()) == null) ? null : editText2.getText();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f146251g;
        if (luckyMoneyNumInputView != null && (editText = luckyMoneyNumInputView.getEditText()) != null) {
            editable = editText.getText();
        }
        objArr[4] = editable;
        g0Var.d(25925, objArr);
    }

    public final void h7() {
        android.widget.TextView textView;
        if (this.f146269p1 == 1) {
            addIconOptionMenu(0, com.tencent.mm.R.string.w_, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.luckymoney.ui.qa(this));
        } else {
            addIconOptionMenu(0, com.tencent.mm.R.string.kmx, com.tencent.mm.R.drawable.ama, new com.tencent.mm.plugin.luckymoney.ui.ra(this));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_CUSTOM_ENVELOPE_ENTRANCE_INT_SYNC, 0);
        com.tencent.mm.plugin.luckymoney.model.q0 q0Var = null;
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[initCustomEnvelopeEntranceView] showCount: %s", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (((com.tencent.mm.plugin.luckymoney.ui.jd) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[initCustomEnvelopeEntranceView] use cover_jumpactionV2");
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.Z;
            if (c1Var != null) {
                q0Var = c1Var.B;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[initCustomEnvelopeEntranceView] use cover_jumpactionV1");
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.Z;
            if (c1Var2 != null) {
                q0Var = c1Var2.f145198w;
            }
        }
        if (this.Z == null || q0Var == null || this.Y == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[initCustomEnvelopeEntranceView] not show");
            android.view.ViewGroup viewGroup = this.N;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f145551e)) {
            android.view.ViewGroup viewGroup2 = this.N;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18890, 11, java.lang.Integer.valueOf(q7()), this.T1, s7(), p7(), r7());
        android.widget.TextView textView2 = this.Q;
        if (textView2 != null) {
            textView2.setText(q0Var.f145551e);
        }
        int B = i65.a.B(getContext()) - i65.a.b(getContext(), 70);
        if (B > 0 && (textView = this.Q) != null) {
            textView.setMaxWidth(B);
        }
        android.view.ViewGroup viewGroup3 = this.N;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        this.Y1 = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f145552f)) {
            o11.f fVar = new o11.f();
            fVar.f342083g = hb3.o.Ni().Zi();
            fVar.f342078b = true;
            fVar.f342096t = false;
            fVar.f342077a = true;
            fVar.f342091o = com.tencent.mm.R.raw.icons_filled_red_envelope;
            n11.a.b().h(q0Var.f145552f, this.P, fVar.a());
        }
        android.view.ViewGroup viewGroup4 = this.N;
        if (viewGroup4 != null) {
            viewGroup4.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.ua(q0Var, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0.isShown() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hideTenpayKB() {
        /*
            r11 = this;
            android.view.View r0 = r11.f146267p
            if (r0 == 0) goto L5b
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShown()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L5b
            android.view.View r0 = r11.f146267p
            if (r0 != 0) goto L17
            goto L5b
        L17:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r4 = r2.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI"
            java.lang.String r6 = "hideTenpayKB"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI"
            java.lang.String r5 = "hideTenpayKB"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.hideTenpayKB():void");
    }

    public final boolean i7() {
        return this.X && getIntent().getIntExtra("key_chatroom_num", 0) > 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView;
        android.widget.EditText editText;
        android.widget.EditText editText2;
        int i17;
        android.widget.Button button;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView;
        android.view.View findViewById;
        com.tencent.mm.plugin.luckymoney.ui.b bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "initView");
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.fb(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j5g);
        if (!(findViewById2 instanceof android.view.View)) {
            findViewById2 = null;
        }
        this.f146279u = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.j5k);
        if (!(findViewById3 instanceof android.view.View)) {
            findViewById3 = null;
        }
        this.f146281v = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.j5j);
        this.f146265o = findViewById4 instanceof android.widget.Button ? (android.widget.Button) findViewById4 : null;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.j7e);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView2 = findViewById5 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView) findViewById5 : null;
        this.f146255i = luckyMoneyTextInputView2;
        if (luckyMoneyTextInputView2 != null) {
            luckyMoneyTextInputView2.setHintText(getString(com.tencent.mm.R.string.gjq));
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView3 = this.f146255i;
        if (luckyMoneyTextInputView3 != null) {
            com.tencent.mm.wallet_core.ui.y yVar = new com.tencent.mm.wallet_core.ui.y(75);
            android.text.InputFilter[] filters = luckyMoneyTextInputView3.f146672d.getFilters();
            android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[filters.length + 1];
            java.lang.System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = yVar;
            luckyMoneyTextInputView3.f146672d.setFilters(inputFilterArr);
        }
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.j58);
        this.f146263n = findViewById6 instanceof android.widget.Button ? (android.widget.Button) findViewById6 : null;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        if (findViewById7 instanceof com.tenpay.android.wechat.MyKeyboardWindow) {
        }
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.o1v);
        if (!(findViewById8 instanceof android.view.View)) {
            findViewById8 = null;
        }
        this.f146267p = findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f485810j56);
        this.f146271q = findViewById9 instanceof android.widget.TextView ? (android.widget.TextView) findViewById9 : null;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.j4z);
        this.f146251g = findViewById10 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView) findViewById10 : null;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.f485754iy1);
        this.f146253h = findViewById11 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView) findViewById11 : null;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.j5l);
        android.widget.TextView textView = findViewById12 instanceof android.widget.TextView ? (android.widget.TextView) findViewById12 : null;
        this.f146261m = textView;
        if (textView != null) {
            textView.setTextSize(0, i65.a.a(getContext(), 48.0f));
        }
        android.widget.TextView textView2 = this.f146261m;
        if (textView2 != null) {
            textView2.setFocusable(true);
        }
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.j5e);
        this.f146283w = findViewById13 instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById13 : null;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.j6v);
        this.f146285x = findViewById14 instanceof com.tencent.mm.wallet_core.ui.MMScrollView ? (com.tencent.mm.wallet_core.ui.MMScrollView) findViewById14 : null;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.j5c);
        this.f146288y = findViewById15 instanceof android.widget.TextView ? (android.widget.TextView) findViewById15 : null;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f485775j13);
        this.f146291z = relativeLayout;
        zl5.b bVar2 = zl5.b.f474086a;
        zl5.b.b(bVar2, relativeLayout, i65.a.b(getContext(), 8), false, false, 12, null);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485773j11);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f485778j16);
        this.C = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.B = findViewById(com.tencent.mm.R.id.j17);
        this.G = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485777j15);
        this.H = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j2j);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j2k);
        this.I = textView3;
        if (textView3 != null) {
            textView3.setTextSize(0, i65.a.a(getContext(), 14.0f) * i65.a.m(getContext()));
        }
        this.f146244J = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j1g);
        this.K = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5d);
        this.L = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j1f);
        this.M = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1i);
        this.N = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.iyu);
        this.P = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.iyt);
        this.Q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyv);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.R = wcPayBannerView;
        if (wcPayBannerView != null) {
            wcPayBannerView.a();
        }
        this.H1 = new com.tencent.mm.plugin.luckymoney.ui.b(this);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.buc, (android.view.ViewGroup) null);
        this.J1 = inflate;
        if (inflate != null && (bVar = this.H1) != null) {
            bVar.setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View view = this.J1;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.j0q)) != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.gb(this));
        }
        com.tencent.mm.plugin.luckymoney.ui.b bVar3 = this.H1;
        if (bVar3 != null) {
            bVar3.f146732f = new com.tencent.mm.plugin.luckymoney.ui.hb(this);
        }
        android.view.Window window = bVar3 != null ? bVar3.getWindow() : null;
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
        }
        android.view.View view2 = this.J1;
        android.view.View findViewById16 = view2 != null ? view2.findViewById(com.tencent.mm.R.id.j0s) : null;
        this.I1 = findViewById16 instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById16 : null;
        this.G1 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E1 = stringExtra;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.G1;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(stringExtra);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.G1;
        if (chatFooterPanel2 != null) {
            int i18 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            chatFooterPanel2.setSearchSource(7);
        }
        fc3.j.b(this.G1);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.luckymoney.ui.ld ldVar = (com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ld.class);
        androidx.appcompat.app.AppCompatActivity activity = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        android.widget.TextView textView4 = luckyMoneyNewPrepareUI != null ? (android.widget.TextView) luckyMoneyNewPrepareUI.findViewById(com.tencent.mm.R.id.uec) : null;
        ldVar.f147143n = textView4;
        com.tencent.mm.ui.bk.s0(textView4 != null ? textView4.getPaint() : null);
        androidx.appcompat.app.AppCompatActivity activity2 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        ldVar.f147136d = luckyMoneyNewPrepareUI2 != null ? (android.widget.LinearLayout) luckyMoneyNewPrepareUI2.findViewById(com.tencent.mm.R.id.qwf) : null;
        androidx.appcompat.app.AppCompatActivity activity3 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
        ldVar.f147137e = luckyMoneyNewPrepareUI3 != null ? (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) luckyMoneyNewPrepareUI3.findViewById(com.tencent.mm.R.id.qwh) : null;
        androidx.appcompat.app.AppCompatActivity activity4 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI4 = activity4 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity4 : null;
        ldVar.f147138f = luckyMoneyNewPrepareUI4 != null ? (android.widget.TextView) luckyMoneyNewPrepareUI4.findViewById(com.tencent.mm.R.id.qwi) : null;
        androidx.appcompat.app.AppCompatActivity activity5 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI5 = activity5 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity5 : null;
        ldVar.f147139g = luckyMoneyNewPrepareUI5 != null ? (android.widget.TextView) luckyMoneyNewPrepareUI5.findViewById(com.tencent.mm.R.id.qwg) : null;
        androidx.appcompat.app.AppCompatActivity activity6 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI6 = activity6 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity6 : null;
        if (luckyMoneyNewPrepareUI6 != null) {
        }
        androidx.appcompat.app.AppCompatActivity activity7 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI7 = activity7 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity7 : null;
        ldVar.f147140h = luckyMoneyNewPrepareUI7 != null ? (android.widget.LinearLayout) luckyMoneyNewPrepareUI7.findViewById(com.tencent.mm.R.id.upu) : null;
        androidx.appcompat.app.AppCompatActivity activity8 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI8 = activity8 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity8 : null;
        ldVar.f147141i = luckyMoneyNewPrepareUI8 != null ? (android.widget.TextView) luckyMoneyNewPrepareUI8.findViewById(com.tencent.mm.R.id.upw) : null;
        androidx.appcompat.app.AppCompatActivity activity9 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI9 = activity9 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity9 : null;
        ldVar.f147142m = luckyMoneyNewPrepareUI9 != null ? (android.widget.TextView) luckyMoneyNewPrepareUI9.findViewById(com.tencent.mm.R.id.upv) : null;
        androidx.appcompat.app.AppCompatActivity activity10 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI10 = activity10 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity10 : null;
        if (luckyMoneyNewPrepareUI10 != null) {
        }
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.luckymoney.ui.jd) zVar.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).getClass();
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.luckymoney.ui.qd qdVar = (com.tencent.mm.plugin.luckymoney.ui.qd) zVar.a(context3).a(com.tencent.mm.plugin.luckymoney.ui.qd.class);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) qdVar.findViewById(com.tencent.mm.R.id.udy);
        float b17 = i65.a.b(qdVar.getContext(), 2);
        if (relativeLayout2 != null) {
            relativeLayout2.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (relativeLayout2 != null) {
            relativeLayout2.setClipToOutline(true);
        }
        qdVar.f147347d = com.tencent.mm.ui.bl.b(qdVar.getContext()).x - i65.a.b(qdVar.getContext(), 32);
        androidx.appcompat.app.AppCompatActivity context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        ec3.g1 g1Var = (ec3.g1) zVar.a(context4).a(ec3.g1.class);
        g1Var.f251010d = com.tencent.mm.ui.bl.b(g1Var.getContext());
        i65.a.b(g1Var.getContext(), 32);
        androidx.appcompat.app.AppCompatActivity activity11 = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI11 = activity11 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity11 : null;
        g1Var.f251026w = luckyMoneyNewPrepareUI11 != null ? luckyMoneyNewPrepareUI11.T1 : null;
        zl5.b.b(bVar2, (android.widget.RelativeLayout) g1Var.findViewById(com.tencent.mm.R.id.udw), i65.a.b(g1Var.getContext(), 8), false, false, 8, null);
        zl5.b.b(bVar2, (android.widget.RelativeLayout) g1Var.findViewById(com.tencent.mm.R.id.udo), i65.a.b(g1Var.getContext(), 8), false, false, 8, null);
        android.widget.LinearLayout Y6 = g1Var.Y6();
        if (Y6 != null) {
            Y6.setOnClickListener(new ec3.j0(g1Var));
        }
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(g1Var.getActivity());
        g1Var.f251021r = f5Var;
        f5Var.f210400e = g1Var;
        android.widget.TextView W6 = g1Var.W6();
        if (W6 != null) {
            W6.setTextSize(0, i65.a.a(g1Var.getContext(), 14.0f) * i65.a.m(g1Var.getContext()));
        }
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = new com.google.android.flexbox.FlexboxLayoutManager(g1Var.getContext());
        flexboxLayoutManager.E(0);
        if (flexboxLayoutManager.f44201f != 2) {
            flexboxLayoutManager.f44201f = 2;
            flexboxLayoutManager.requestLayout();
        }
        flexboxLayoutManager.F(0);
        flexboxLayoutManager.D(2);
        com.tencent.mm.view.recyclerview.WxRecyclerView X6 = g1Var.X6();
        if (X6 != null) {
            X6.setLayoutManager(flexboxLayoutManager);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView X62 = g1Var.X6();
        if (X62 != null) {
            X62.N(new ec3.k0(g1Var));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.luckymoney.ui.recommend.LuckyMoneyNewPrepareUIRecommendUIC$initRightContainer$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new ec3.j1();
            }
        }, g1Var.f251011e, false);
        wxRecyclerAdapter.f293105o = new ec3.m0(g1Var);
        g1Var.f251012f = wxRecyclerAdapter;
        com.tencent.mm.view.recyclerview.WxRecyclerView X63 = g1Var.X6();
        if (X63 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = g1Var.f251012f;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("mSkinAdapter");
                throw null;
            }
            X63.setAdapter(wxRecyclerAdapter2);
        }
        ec3.g1.e7(g1Var, ec3.m.f251051e, null, 2, null);
        androidx.appcompat.app.AppCompatActivity activity12 = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI12 = activity12 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity12 : null;
        android.view.View findViewById17 = (luckyMoneyNewPrepareUI12 == null || (luckyMoneyTextInputView = luckyMoneyNewPrepareUI12.f146255i) == null) ? null : luckyMoneyTextInputView.findViewById(com.tencent.mm.R.id.j6x);
        com.tencent.mm.ui.widget.MMEditText mMEditText = findViewById17 instanceof com.tencent.mm.ui.widget.MMEditText ? (com.tencent.mm.ui.widget.MMEditText) findViewById17 : null;
        g1Var.f251013g = mMEditText;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(new ec3.o0(g1Var));
        }
        if (this.T == 1) {
            setMMTitle(com.tencent.mm.R.string.gl_);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = this.f146253h;
            if (luckyMoneyMoneyInputView != null) {
                luckyMoneyMoneyInputView.setTitle(getString(com.tencent.mm.R.string.go8));
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView2 = this.f146253h;
            if (luckyMoneyMoneyInputView2 != null) {
                luckyMoneyMoneyInputView2.setShowGroupIcon(true);
            }
        } else {
            setMMTitle(com.tencent.mm.R.string.gm9);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView3 = this.f146253h;
            if (luckyMoneyMoneyInputView3 != null) {
                luckyMoneyMoneyInputView3.setTitle(getString(com.tencent.mm.R.string.go9));
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView4 = this.f146253h;
            if (luckyMoneyMoneyInputView4 != null) {
                luckyMoneyMoneyInputView4.setShowGroupIcon(false);
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra2)) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView5 = this.f146253h;
            if (luckyMoneyMoneyInputView5 != null) {
                luckyMoneyMoneyInputView5.setRtxLuckyMoney(1);
            }
        } else if (this.Y == 3) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView6 = this.f146253h;
            if (luckyMoneyMoneyInputView6 != null) {
                luckyMoneyMoneyInputView6.setRtxLuckyMoney(2);
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView7 = this.f146253h;
            if (luckyMoneyMoneyInputView7 != null) {
                luckyMoneyMoneyInputView7.setRtxLuckyMoney(0);
            }
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, i65.a.h(this, com.tencent.mm.R.dimen.a4y));
        if (this.T == 1) {
            layoutParams.topMargin = i65.a.b(getContext(), 13);
            layoutParams2.topMargin = i65.a.b(getContext(), 13);
        } else {
            layoutParams.topMargin = i65.a.b(getContext(), 16);
            layoutParams2.topMargin = i65.a.b(getContext(), 16);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView4 = this.f146255i;
        if (luckyMoneyTextInputView4 != null) {
            luckyMoneyTextInputView4.setLayoutParams(layoutParams);
        }
        android.widget.RelativeLayout relativeLayout3 = this.f146291z;
        if (relativeLayout3 != null) {
            relativeLayout3.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView8 = this.f146253h;
        if (luckyMoneyMoneyInputView8 != null) {
            luckyMoneyMoneyInputView8.setOnInputValidChangerListener(this);
        }
        y7();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView2 = this.f146251g;
        if (luckyMoneyNumInputView2 != null) {
            luckyMoneyNumInputView2.setOnInputValidChangerListener(this);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView3 = this.f146251g;
        if (luckyMoneyNumInputView3 != null) {
            luckyMoneyNumInputView3.setHint(getString(com.tencent.mm.R.string.gmc));
        }
        if (c01.e2.S(getIntent().getStringExtra("key_username"))) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView4 = this.f146251g;
            if (luckyMoneyNumInputView4 != null) {
                luckyMoneyNumInputView4.setRtxLuckyMoney(1);
            }
        } else if (this.Y == 3) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView5 = this.f146251g;
            if (luckyMoneyNumInputView5 != null) {
                luckyMoneyNumInputView5.setRtxLuckyMoney(2);
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView6 = this.f146251g;
            if (luckyMoneyNumInputView6 != null) {
                luckyMoneyNumInputView6.setRtxLuckyMoney(0);
            }
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView5 = this.f146255i;
        if (luckyMoneyTextInputView5 != null) {
            luckyMoneyTextInputView5.setOnInputValidChangerListener(this);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView6 = this.f146255i;
        android.view.View findViewById18 = luckyMoneyTextInputView6 != null ? luckyMoneyTextInputView6.findViewById(com.tencent.mm.R.id.j6x) : null;
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = findViewById18 instanceof com.tencent.mm.ui.widget.MMEditText ? (com.tencent.mm.ui.widget.MMEditText) findViewById18 : null;
        if (mMEditText2 != null) {
            mMEditText2.setOnFocusChangeListener(new com.tencent.mm.plugin.luckymoney.ui.ib());
        }
        if (!this.X) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView7 = this.f146251g;
            if (luckyMoneyNumInputView7 != null) {
                luckyMoneyNumInputView7.setNum("");
            }
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 1) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView8 = this.f146251g;
            if (luckyMoneyNumInputView8 != null) {
                luckyMoneyNumInputView8.setNum("");
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView9 = this.f146251g;
            if (luckyMoneyNumInputView9 != null) {
                luckyMoneyNumInputView9.setNum(K2 + "");
            }
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.Y)) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView10 = this.f146251g;
            if (luckyMoneyNumInputView10 != null) {
                com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.Z;
                luckyMoneyNumInputView10.setMaxNum(c1Var != null ? c1Var.f145199x : 0);
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView11 = this.f146251g;
            if (luckyMoneyNumInputView11 != null) {
                com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.Z;
                luckyMoneyNumInputView11.setMaxNum(c1Var2 != null ? c1Var2.f145182d : 0);
            }
        }
        if (this.T == 1) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView12 = this.f146251g;
            if (luckyMoneyNumInputView12 != null) {
                luckyMoneyNumInputView12.setMinNum(M2);
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView13 = this.f146251g;
            if (luckyMoneyNumInputView13 != null) {
                luckyMoneyNumInputView13.setMinNum(N2);
            }
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView14 = this.f146251g;
        if (luckyMoneyNumInputView14 != null) {
            luckyMoneyNumInputView14.getInput();
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView9 = this.f146253h;
        if (luckyMoneyMoneyInputView9 != null) {
            luckyMoneyMoneyInputView9.setMaxLen(12);
        }
        if (Y6() && (button = this.f146263n) != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var3 = this.Z;
            objArr[0] = c1Var3 != null ? c1Var3.f145194s : null;
            button.setText(getString(com.tencent.mm.R.string.f492438gn5, objArr));
        }
        if (this.X || (i17 = this.Y) == 2 || i17 == 3) {
            if (Y6()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                com.tencent.mm.plugin.luckymoney.model.c1 c1Var4 = this.Z;
                objArr2[0] = c1Var4 != null ? c1Var4.f145194s : null;
                setMMTitle(getString(com.tencent.mm.R.string.f492448go5, objArr2));
            } else {
                setMMTitle(com.tencent.mm.R.string.f492447go4);
            }
            int intExtra = getIntent().getIntExtra("key_chatroom_num", 0);
            if (this.X && intExtra == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[hbtype] single hb");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView15 = this.f146251g;
                if (luckyMoneyNumInputView15 != null) {
                    luckyMoneyNumInputView15.setVisibility(8);
                }
                android.view.ViewGroup viewGroup = this.H;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                android.view.ViewGroup viewGroup2 = this.f146244J;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                this.S.d(this.f146253h);
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView10 = this.f146253h;
                if (luckyMoneyMoneyInputView10 != null) {
                    luckyMoneyMoneyInputView10.setTitle(getString(com.tencent.mm.R.string.go6));
                }
            } else {
                if (getIntent().getIntExtra("key_chatroom_num", 0) > 0 || !this.X) {
                    android.view.ViewGroup viewGroup3 = this.H;
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(0);
                    }
                    A7(-1);
                    android.view.ViewGroup viewGroup4 = this.H;
                    if (viewGroup4 != null) {
                        viewGroup4.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.cb(this));
                    }
                    android.view.ViewGroup viewGroup5 = this.f146244J;
                    if (viewGroup5 != null) {
                        viewGroup5.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.db(this));
                    }
                } else {
                    android.view.ViewGroup viewGroup6 = this.H;
                    if (viewGroup6 != null) {
                        viewGroup6.setVisibility(8);
                    }
                    android.view.ViewGroup viewGroup7 = this.f146244J;
                    if (viewGroup7 != null) {
                        viewGroup7.setVisibility(8);
                    }
                }
                if (this.X && intExtra > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[hbtype] group hb，num：%s", java.lang.Integer.valueOf(intExtra));
                    java.lang.String string = getString(com.tencent.mm.R.string.gmb, java.lang.Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", L2)));
                    android.widget.TextView textView5 = this.K;
                    if (textView5 != null) {
                        textView5.setText(string);
                    }
                } else if (this.Y == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[hbtype] f2f hb");
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView7 = this.f146255i;
                    if (luckyMoneyTextInputView7 != null) {
                        luckyMoneyTextInputView7.setVisibility(8);
                    }
                }
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView11 = this.f146253h;
                if (luckyMoneyMoneyInputView11 != null) {
                    luckyMoneyMoneyInputView11.setGroupIconIv(com.tencent.mm.R.drawable.c_i);
                }
            }
        } else {
            int i19 = this.T;
            if (i19 == 1) {
                android.widget.TextView textView6 = this.f146271q;
                if (textView6 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var5 = this.Z;
                    textView6.setText(c1Var5 != null ? c1Var5.f145184f : null);
                }
                android.widget.TextView textView7 = this.f146271q;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
            } else if (i19 == 0) {
                android.widget.TextView textView8 = this.f146271q;
                if (textView8 != null) {
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var6 = this.Z;
                    textView8.setText(c1Var6 != null ? c1Var6.f145185g : null);
                }
                android.widget.TextView textView9 = this.f146271q;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
            }
        }
        android.widget.Button button2 = this.f146263n;
        if (button2 != null) {
            button2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.jb(this));
        }
        android.view.View findViewById19 = findViewById(com.tencent.mm.R.id.j5_);
        android.widget.TextView textView10 = findViewById19 instanceof android.widget.TextView ? (android.widget.TextView) findViewById19 : null;
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.S;
        if (textView10 != null) {
            c6Var.f146781d = textView10;
        } else {
            c6Var.getClass();
        }
        this.f146259l1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.luckymoney.ui.kb(this), false);
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = this.f146285x;
        if (mMScrollView != null) {
            mMScrollView.setOnTouchListener(new com.tencent.mm.plugin.luckymoney.ui.lb(this));
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView12 = this.f146253h;
        if (luckyMoneyMoneyInputView12 != null) {
            luckyMoneyMoneyInputView12.setType(this.T);
        }
        h7();
        androidx.appcompat.app.AppCompatActivity context5 = getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        boolean Z6 = ((com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context5).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).Z6();
        androidx.appcompat.app.AppCompatActivity context6 = getContext();
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        boolean X64 = ((com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context6).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).X6();
        if (X64) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(182, 219);
        }
        android.widget.RelativeLayout relativeLayout4 = this.f146291z;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.za(this, X64, Z6));
        }
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146268p0;
        if (mVar != null) {
            z7(mVar.f145435a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "do not has envelopSourceMac");
            z7(null);
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.f146245a2 = wcPayKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.setActionText(getString(com.tencent.mm.R.string.gli));
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.f146245a2;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.setActionBtnColor(com.tencent.mm.R.drawable.f481067jw);
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard3 = this.f146245a2;
        if (wcPayKeyboard3 != null) {
            wcPayKeyboard3.setHeightListener(this);
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard4 = this.f146245a2;
        android.view.ViewGroup.LayoutParams layoutParams3 = wcPayKeyboard4 != null ? wcPayKeyboard4.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.addRule(12);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView13 = this.f146253h;
        if (luckyMoneyMoneyInputView13 != null && (editText2 = luckyMoneyMoneyInputView13.getEditText()) != null) {
            editText2.setOnEditorActionListener(new com.tencent.mm.plugin.luckymoney.ui.mb(this));
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView16 = this.f146251g;
        if (luckyMoneyNumInputView16 != null && (editText = luckyMoneyNumInputView16.getEditText()) != null) {
            editText.setOnEditorActionListener(new com.tencent.mm.plugin.luckymoney.ui.eb(this));
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView14 = this.f146253h;
        android.widget.EditText editText3 = luckyMoneyMoneyInputView14 != null ? luckyMoneyMoneyInputView14.getEditText() : null;
        if (editText3 != null) {
            editText3.setTag("mAmountEt");
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView17 = this.f146251g;
        android.widget.EditText editText4 = luckyMoneyNumInputView17 != null ? luckyMoneyNumInputView17.getEditText() : null;
        if (editText4 != null) {
            editText4.setTag("mNumEt");
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView15 = this.f146253h;
        v7(luckyMoneyMoneyInputView15 != null ? luckyMoneyMoneyInputView15.getEditText() : null, this.f146245a2, false, true, false);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView18 = this.f146251g;
        v7(luckyMoneyNumInputView18 != null ? luckyMoneyNumInputView18.getEditText() : null, this.f146245a2, false, true, true);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView16 = this.f146253h;
        android.view.View findViewById20 = luckyMoneyMoneyInputView16 != null ? luckyMoneyMoneyInputView16.findViewById(com.tencent.mm.R.id.j1d) : null;
        android.widget.EditText editText5 = findViewById20 instanceof android.widget.EditText ? (android.widget.EditText) findViewById20 : null;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView19 = this.f146251g;
        android.view.View findViewById21 = luckyMoneyNumInputView19 != null ? luckyMoneyNumInputView19.findViewById(com.tencent.mm.R.id.j1d) : null;
        android.widget.EditText editText6 = findViewById21 instanceof android.widget.EditText ? (android.widget.EditText) findViewById21 : null;
        com.tencent.mm.wallet_core.ui.r1.v0(editText5);
        java.lang.Object systemService = getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText5, 0);
        }
        if (editText5 != null) {
            editText5.addTextChangedListener(new com.tencent.mm.plugin.luckymoney.ui.va(editText5));
        }
        if (editText6 != null) {
            editText6.addTextChangedListener(new com.tencent.mm.plugin.luckymoney.ui.wa(editText6));
        }
        com.tencent.mm.wallet_core.ui.r1.v0(editText6);
        java.lang.Object systemService2 = getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager2 = systemService2 instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService2 : null;
        if (inputMethodManager2 != null) {
            inputMethodManager2.showSoftInput(editText6, 0);
        }
        int intExtra2 = getIntent().getIntExtra("key_chatroom_num", 0);
        if (intExtra2 <= 0 || (luckyMoneyNumInputView = this.f146251g) == null) {
            return;
        }
        luckyMoneyNumInputView.setGroupChatNumber(intExtra2);
    }

    public final boolean j7() {
        r45.wv3 wv3Var;
        r45.wv3 wv3Var2;
        r45.wv3 wv3Var3;
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146268p0;
        if (mVar == null) {
            return false;
        }
        java.lang.String str = null;
        if ((mVar != null ? mVar.f145435a : null) == null) {
            return false;
        }
        if (((mVar == null || (wv3Var3 = mVar.f145435a) == null) ? null : wv3Var3.f389501g) == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isUsingNewSkin] hasCorpName: ");
        com.tencent.mm.plugin.luckymoney.model.m mVar2 = this.f146268p0;
        sb6.append((mVar2 == null || (wv3Var2 = mVar2.f145435a) == null) ? null : wv3Var2.f389498d);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", sb6.toString());
        com.tencent.mm.plugin.luckymoney.model.m mVar3 = this.f146268p0;
        if (mVar3 != null && (wv3Var = mVar3.f145435a) != null) {
            str = wv3Var.f389498d;
        }
        return !com.tencent.mm.sdk.platformtools.t8.K0(str);
    }

    public final int k7() {
        if (this.X) {
            return getIntent().getIntExtra("key_chatroom_num", 0) > 0 ? 2 : 1;
        }
        return 3;
    }

    public final void l7(int i17, android.content.Intent intent) {
        java.lang.String str;
        if (i17 == -1) {
            boolean z17 = false;
            str = "";
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
                str = stringExtra != null ? stringExtra : "";
                z17 = intent.getBooleanExtra("from_wallet_mix", false);
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "from walletMix, ignore payCheck");
            } else {
                a7(str);
            }
        }
        finish();
    }

    public final void m7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[openLocalEnvelopeLayout] mHasSource: %s", java.lang.Integer.valueOf(this.Q1));
        android.app.Dialog F = com.tencent.mm.plugin.luckymoney.model.m5.F(getContext(), false);
        com.tencent.mm.plugin.luckymoney.model.n0 g17 = com.tencent.mm.plugin.luckymoney.model.n0.g();
        g17.f213885c = new com.tencent.mm.plugin.luckymoney.model.h("", 1);
        g17.c(new com.tencent.mm.plugin.luckymoney.ui.hc(F, this, z17), true);
    }

    public final void n7(int i17, double d17, boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "has showing error tips, ignore repeat report");
            return;
        }
        int i18 = ((int) d17) * 100;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "report scene = " + i17 + " amount =" + i18);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22775, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public final void o7(int i17, double d17, double d18, boolean z17) {
        if (z17) {
            return;
        }
        java.lang.String str = this.D1;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "mUnique id is empty need generate");
            str = java.util.UUID.randomUUID().toString();
        }
        double d19 = 100;
        long j17 = (long) (d17 * d19);
        long j18 = (long) (d18 * d19);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[reportAmountLimitExceed] reportID: 37874 type=" + i17 + " sessionId=" + this.T1 + " uniqueId=" + str + " maxAmount=" + j17 + " currentAmount=" + j18);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37874, this.T1, str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        java.lang.String stringExtra3;
        str = "";
        if (i17 == A2) {
            if (intent != null && intent.hasExtra("key_realname_guide_helper")) {
                this.f146292z1 = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
            }
            if (i18 == -1) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(k7()), 5);
                java.lang.String stringExtra4 = getIntent().getStringExtra("key_username");
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                if ((!this.X || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) && this.Y != 3) {
                    T6();
                    android.view.View findViewById = findViewById(com.tencent.mm.R.id.j5h);
                    android.view.View view = this.f146279u;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.plugin.luckymoney.model.m5.B(findViewById, null);
                    android.widget.Button button = this.f146265o;
                    if (button != null) {
                        button.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.qb(this));
                    }
                    android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j59);
                    android.widget.ImageView imageView = findViewById2 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById2 : null;
                    if (imageView != null) {
                        imageView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.rb(this));
                    }
                    d7(i18, intent);
                } else {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f146286x0, "msg", null);
                    if (d17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "luckymoneyNewPrepareUI onActivityResult values is null");
                        finish();
                        return;
                    }
                    java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onActivityResult] pay result");
                    if (hb3.o.Ni().Ui().a(str2)) {
                        g0Var.d(31063, str2, 1, 1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onActivityResult] need insert a local msg for luckymoney");
                        if (!com.tencent.mm.plugin.luckymoney.model.m5.C(this.f146286x0, stringExtra4, 1)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[onActivityResult] LuckyMoneyUtil.sendLocalMsg fail!");
                            hb3.o.Ni().Ui().b(str2);
                            g0Var.d(31063, str2, 1, 2);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[onActivityResult] do not need insert a local msg for luckymoney, new xml has insert");
                    }
                    d7(i18, intent);
                    com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct();
                    this.M1 = redEnvSendWithEmoticonDataStruct;
                    redEnvSendWithEmoticonDataStruct.f59937d = this.O1;
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.K1;
                    java.lang.String md52 = iEmojiInfo == null ? "" : iEmojiInfo.getMd5();
                    com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct2 = this.M1;
                    if (redEnvSendWithEmoticonDataStruct2 != null) {
                        redEnvSendWithEmoticonDataStruct2.f59938e = redEnvSendWithEmoticonDataStruct2.b("emoticonMd5", md52, true);
                    }
                    com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct3 = this.M1;
                    if (redEnvSendWithEmoticonDataStruct3 != null) {
                        redEnvSendWithEmoticonDataStruct3.k();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "Report RedEnvSendWithEmoticonDataStruct, Scene: %d, md5: %s", java.lang.Integer.valueOf(this.O1), md52);
                    finish();
                }
                if (intent != null && (stringExtra3 = intent.getStringExtra("key_trans_id")) != null) {
                    str = stringExtra3;
                }
                a7(str);
            } else if (com.tencent.mm.wallet_core.model.b2.b(intent)) {
                finish();
                return;
            } else if (com.tencent.mm.wallet_core.model.b2.c(intent)) {
                return;
            } else {
                d7(i18, intent);
            }
        } else if (i17 == B2) {
            if (i18 == -1 && intent != null) {
                java.lang.String stringExtra5 = intent.getStringExtra("Select_Conv_User");
                str = stringExtra5 != null ? stringExtra5 : "";
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(k7()), 7, str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    finish();
                } else {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(str).replaceAll("|");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.n6(replaceAll, this.V, 1, "v1.0"));
                }
            } else if (i18 == 0) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
                intent2.putExtra("key_username", getIntent().getStringExtra("key_username"));
                intent2.putExtra("key_type", 1);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (i17 == C2) {
            if (intent != null && intent.hasExtra("result_data")) {
                android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                if (bundleExtra != null) {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(bundleExtra.getString("payState", J2 + ""), 0);
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + P + ";STATE_H5_PAY_SUCC=0");
                    if (P == 0) {
                        int i27 = this.T;
                        hb3.o.f280130r = i27;
                        if (this.W1) {
                            if (this.X1) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22237, 4);
                            } else if (i27 != 1) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22237, 3);
                            }
                        }
                        finish();
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
                }
            }
        } else if (i17 == D2) {
            l7(i18, intent);
        } else if (i17 == E2) {
            if (i18 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onActivityResult] REQUEST_CODE_PICK_ENVELOPE: ok");
                android.view.ViewGroup viewGroup = this.f146283w;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((com.tencent.mm.plugin.luckymoney.ui.jd) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).O6(true);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onActivityResult] REQUEST_CODE_PICK_ENVELOPE: cancel");
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                ((com.tencent.mm.plugin.luckymoney.ui.jd) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).O6(false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16822, 2);
            }
        } else if (i17 == 1111) {
            if (i18 == -1) {
                if (intent != null && (stringExtra2 = intent.getStringExtra("gif_md5")) != null) {
                    str = stringExtra2;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "md5 == null go emoji capture failed!");
                } else {
                    com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(str);
                    this.K1 = wi6;
                    if (wi6 == null || ((com.tencent.mm.storage.emotion.EmojiInfo) wi6).E0()) {
                        w7(this.K1);
                    } else {
                        ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi(wi6, new com.tencent.mm.plugin.luckymoney.ui.sc(this, wi6));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "go emoji capture failed!");
            }
        } else if (i17 == F2) {
            if (i18 == -1) {
                if (intent != null && (stringExtra = intent.getStringExtra("Select_Contact")) != null) {
                    str = stringExtra;
                }
                this.F1 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "select user: %s", str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.F1)) {
                    ng5.a.a(this.L, this.F1);
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = this.F1;
                    java.lang.String str4 = this.E1;
                    ((sg3.a) v0Var).getClass();
                    java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(c01.a2.f(str3, str4), 8);
                    android.widget.TextView textView = this.M;
                    if (textView != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        androidx.appcompat.app.AppCompatActivity context3 = getContext();
                        android.widget.TextView textView2 = this.M;
                        float textSize = textView2 != null ? textView2.getTextSize() : 0.0f;
                        ((ke0.e) xVar).getClass();
                        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, I, textSize));
                    }
                    android.widget.ImageView imageView2 = this.L;
                    i19 = 0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    android.widget.TextView textView3 = this.M;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    D4(true, i19);
                }
            }
            i19 = 0;
            D4(true, i19);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x017b, code lost:
    
        if (r1 != 2) goto L38;
     */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.widget.EditText editText;
        android.widget.EditText editText2;
        android.app.Dialog dialog;
        super.onDestroy();
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.S;
        ((java.util.LinkedList) c6Var.f146778a).clear();
        c6Var.f146781d = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f146259l1;
        if (b4Var != null) {
            b4Var.e();
        }
        android.app.Dialog dialog2 = this.f146273r;
        if (dialog2 != null) {
            if ((dialog2.isShowing()) && (dialog = this.f146273r) != null) {
                dialog.dismiss();
            }
        }
        if (this.G1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "commentfooter release");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.G1;
            if (chatFooterPanel != null) {
                chatFooterPanel.h();
            }
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.G1;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.a();
            }
        }
        this.f146282v2.dead();
        this.f146257j2.dead();
        this.f146258k2.dead();
        if (this.Y1) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_CUSTOM_ENVELOPE_ENTRANCE_INT_SYNC;
            java.lang.Object m17 = c17.m(u3Var, 0);
            java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = 7;
        objArr[1] = java.lang.Integer.valueOf(this.f146248d2);
        objArr[2] = java.lang.Float.valueOf(this.f146247c2);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = this.f146253h;
        objArr[3] = (luckyMoneyMoneyInputView == null || (editText2 = luckyMoneyMoneyInputView.getEditText()) == null) ? null : editText2.getText();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f146251g;
        objArr[4] = (luckyMoneyNumInputView == null || (editText = luckyMoneyNumInputView.getEditText()) == null) ? null : editText.getText();
        g0Var.d(25925, objArr);
        com.tencent.mm.view.MMPAGView mMPAGView = this.C;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.C;
        if (mMPAGView2 != null) {
            mMPAGView2.i(this.D);
        }
        this.D = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.E);
        this.E = null;
        gb3.p.f270043b = "";
        gb3.p.f270044c = 0;
        gb3.p.f270045d = 0;
        gb3.p.f270046e = 0;
        java.lang.ref.WeakReference weakReference = f146241x2;
        if (kotlin.jvm.internal.o.b(weakReference != null ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) weakReference.get() : null, this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onDestroy] clear latestInstanceRef : " + hashCode());
            f146241x2 = null;
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 4) {
            android.view.View view = this.f146267p;
            boolean z17 = false;
            if (view != null) {
                if (view != null && view.isShown()) {
                    android.view.View view2 = this.f146267p;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    return true;
                }
            }
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f146245a2;
            if (wcPayKeyboard != null) {
                if (wcPayKeyboard != null && wcPayKeyboard.isShown()) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.f146245a2;
                    if (wcPayKeyboard2 != null) {
                        wcPayKeyboard2.i();
                    }
                    return true;
                }
            }
        }
        return super.onKeyUp(i17, event);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!this.F || this.B == null) {
            return;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.C;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.F = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.F = false;
        addSceneEndListener(1970);
        android.widget.Button button = this.f146263n;
        if (300 > 0) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(button);
            ((ku5.t0) ku5.t0.f312615d).l(new m05.h(new java.lang.ref.WeakReference(this), weakReference, 0, "ViewId_Do_Luckymoney_Btn"), 300L, "wcpay_report_check_btn_no_response");
        }
        f146241x2 = new java.lang.ref.WeakReference(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onResume] update latestInstanceRef : " + hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a6  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r26, int r27, java.lang.String r28, com.tencent.mm.modelbase.m1 r29) {
        /*
            Method dump skipped, instructions count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        removeSceneEndListener(1970);
    }

    public final java.lang.String p7() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).X6()) {
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            return ((com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).T6();
        }
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        return ((com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context3).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).Y6() ? com.tencent.mm.plugin.luckymoney.model.m5.g(g7()) : "";
    }

    public final int q7() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean X6 = ((com.tencent.mm.plugin.luckymoney.ui.ld) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).X6();
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        boolean Y6 = ((com.tencent.mm.plugin.luckymoney.ui.ld) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).Y6();
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        boolean Z6 = ((com.tencent.mm.plugin.luckymoney.ui.ld) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).Z6();
        if (X6) {
            return 5;
        }
        if (!Y6) {
            return Z6 ? 2 : 1;
        }
        r45.lm5 g76 = g7();
        if (g76 != null && g76.f379625g) {
            return g76.f379622d == 1 ? 3 : 4;
        }
        return 1;
    }

    public final java.lang.String r7() {
        r45.lm5 g76;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return (!((com.tencent.mm.plugin.luckymoney.ui.ld) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ld.class)).Y6() || (g76 = g7()) == null || com.tencent.mm.sdk.platformtools.t8.K0(g76.f379623e)) ? "" : g76.f379623e;
    }

    public final java.lang.String s7() {
        com.tencent.mm.plugin.luckymoney.model.m mVar;
        r45.wv3 wv3Var;
        if (!j7() || (mVar = this.f146268p0) == null) {
            return "";
        }
        if ((mVar != null ? mVar.f145435a : null) == null) {
            return "";
        }
        if (mVar == null || (wv3Var = mVar.f145435a) == null) {
            return null;
        }
        return wv3Var.f389500f;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.luckymoney.ui.la.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.ld.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.jd.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.qd.class);
        set.add(ec3.g1.class);
    }

    public final void t7(boolean z17) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            this.Z = hb3.o.Ni().Di().a();
            if (z17) {
                this.f146268p0 = hb3.o.Ni().Di().c();
            }
        } else if (this.Y == 3) {
            this.Z = hb3.o.Ni().Bi().a();
            if (z17) {
                this.f146268p0 = hb3.o.Ni().Bi().c();
            }
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                com.tencent.mm.plugin.luckymoney.model.h4 Ai = hb3.o.Ni().Ai();
                if (Ai.f145311a == null) {
                    Ai.a();
                }
                this.Z = Ai.f145311a;
            } else {
                this.Z = hb3.o.Ni().wi().a();
                if (z17) {
                    this.f146268p0 = hb3.o.Ni().wi().c();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[resetConfig] Config: %s", this.Z);
    }

    public final void u7(double d17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.widget.TextView textView = this.f146261m;
            if (textView == null) {
                return;
            }
            textView.setText(com.tencent.mm.wallet_core.ui.r1.m(d17));
            return;
        }
        android.widget.TextView textView2 = this.f146261m;
        if (textView2 == null) {
            return;
        }
        textView2.setText(str + com.tencent.mm.wallet_core.ui.r1.o(d17));
    }

    public final void v7(android.widget.EditText editText, com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, boolean z17, boolean z18, boolean z19) {
        if (wcPayKeyboard == null || editText == null) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = z18 ? editText.getOnFocusChangeListener() : null;
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.tencent.mm.plugin.luckymoney.ui.oc(this, onFocusChangeListener, wcPayKeyboard, z19, editText));
        if (fp.h.c(28) && z17) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_target28_pay_keyboard_focus, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "ifAutoReqFocusTarget28() swt:%s", java.lang.Integer.valueOf(Ni));
            if (Ni == 1) {
                editText.post(new com.tencent.mm.plugin.luckymoney.ui.pc(editText));
            }
        }
        editText.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.qc(wcPayKeyboard, z19));
    }

    public final void w7(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = this.f146255i;
        if (luckyMoneyTextInputView != null) {
            luckyMoneyTextInputView.g(iEmojiInfo);
        }
        int i17 = this.P1;
        if (i17 == 0 || i17 == 2) {
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            if (n22.m.j(iEmojiInfo)) {
                this.O1 = 2;
            } else {
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                if (n22.m.p(iEmojiInfo)) {
                    this.O1 = 4;
                } else {
                    this.O1 = 3;
                }
            }
        } else if (i17 == 1) {
            this.O1 = 2;
        }
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        this.L1 = redEnvSendWithEmoticonClickStruct;
        redEnvSendWithEmoticonClickStruct.f59936d = 1L;
        redEnvSendWithEmoticonClickStruct.k();
    }

    public final void x7(java.lang.String str) {
        android.view.ViewGroup viewGroup = this.f146283w;
        android.view.KeyEvent.Callback findViewById = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.f485818j71) : null;
        android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        if (textView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        textView.setText(str);
    }

    public final void y7() {
        double d17;
        double d18;
        double d19;
        java.lang.String str;
        if (this.Z == null) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = this.f146253h;
            if (luckyMoneyMoneyInputView != null) {
                luckyMoneyMoneyInputView.setHint(getString(com.tencent.mm.R.string.glv));
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView2 = this.f146253h;
            if (luckyMoneyMoneyInputView2 != null) {
                luckyMoneyMoneyInputView2.setCurrencyUnitPrefix(getString(com.tencent.mm.R.string.kyi));
                return;
            }
            return;
        }
        int i17 = 0;
        if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.Y)) {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.Z;
            d17 = c1Var != null ? c1Var.A : 0.0d;
            d18 = c1Var != null ? c1Var.f145200y : 0.0d;
            d19 = c1Var != null ? c1Var.f145201z : 0.0d;
            if (c1Var != null) {
                i17 = c1Var.f145199x;
            }
        } else {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.Z;
            d17 = c1Var2 != null ? c1Var2.f145183e : 0.0d;
            d18 = c1Var2 != null ? c1Var2.f145186h : 0.0d;
            d19 = c1Var2 != null ? c1Var2.f145188m : 0.0d;
            if (c1Var2 != null) {
                i17 = c1Var2.f145182d;
            }
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f146251g;
        if (luckyMoneyNumInputView != null) {
            luckyMoneyNumInputView.setMaxNum(i17);
        }
        if (this.T == 1) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView3 = this.f146253h;
            if (luckyMoneyMoneyInputView3 != null) {
                luckyMoneyMoneyInputView3.setMaxAmount(d17);
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView4 = this.f146253h;
            if (luckyMoneyMoneyInputView4 != null) {
                luckyMoneyMoneyInputView4.setMaxAmount(d18);
            }
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView5 = this.f146253h;
        if (luckyMoneyMoneyInputView5 != null) {
            luckyMoneyMoneyInputView5.setMinAmount(d19);
        }
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var3 = this.Z;
        if (c1Var3 == null || (str = c1Var3.f145191p) == null) {
            str = "";
        }
        if (str.length() <= 0) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView6 = this.f146253h;
            if (luckyMoneyMoneyInputView6 != null) {
                luckyMoneyMoneyInputView6.setHint(getString(com.tencent.mm.R.string.glv));
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView7 = this.f146253h;
            if (luckyMoneyMoneyInputView7 != null) {
                luckyMoneyMoneyInputView7.setCurrencyUnitPrefix(getString(com.tencent.mm.R.string.kyi));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView8 = this.f146253h;
        if (luckyMoneyMoneyInputView8 != null) {
            luckyMoneyMoneyInputView8.setHint(str + getString(com.tencent.mm.R.string.glu));
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView9 = this.f146253h;
        if (luckyMoneyMoneyInputView9 != null) {
            luckyMoneyMoneyInputView9.setCurrencyUnitPrefix(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z7(r45.wv3 r29) {
        /*
            Method dump skipped, instructions count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.z7(r45.wv3):void");
    }
}
