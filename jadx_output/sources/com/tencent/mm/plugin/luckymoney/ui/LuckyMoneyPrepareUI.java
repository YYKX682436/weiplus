package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyPrepareUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI implements com.tencent.mm.plugin.luckymoney.ui.ik, mp5.v {
    public static final java.lang.String D2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf7";
    public android.widget.TextView A;
    public boolean A2;
    public android.widget.TextView B;
    public final com.tencent.mm.sdk.event.IListener B2;
    public android.widget.ImageView C;
    public int C2;
    public android.view.View D;
    public com.tencent.mm.view.MMPAGView E;
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper E1;
    public ym5.w1 F;
    public kotlinx.coroutines.y0 G;
    public java.lang.String G1;
    public boolean H;
    public boolean H1;
    public android.widget.LinearLayout I;
    public java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f146542J;
    public java.lang.String J1;
    public com.tencent.mm.ui.widget.imageview.WeImageView K;
    public java.lang.String K1;
    public android.widget.TextView L;
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel L1;
    public android.view.ViewGroup M;
    public com.tencent.mm.plugin.luckymoney.ui.b M1;
    public android.widget.TextView N;
    public android.view.ViewGroup N1;
    public android.view.View O1;
    public android.view.ViewGroup P;
    public com.tencent.mm.api.IEmojiInfo P1;
    public android.widget.TextView Q;
    public com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct Q1;
    public android.widget.ImageView R;
    public com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct R1;
    public android.widget.TextView S;
    public int S1;
    public android.view.ViewGroup T;
    public com.tencent.mm.ui.widget.imageview.WeImageView U;
    public android.widget.TextView V;
    public int V1;
    public com.tencent.mm.wallet_core.ui.WcPayBannerView W;
    public java.lang.String W1;
    public java.lang.String X1;
    public int Y;
    public java.lang.String Y1;
    public int Z;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f146543a2;

    /* renamed from: f2, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f146548f2;

    /* renamed from: h2, reason: collision with root package name */
    public float f146552h2;

    /* renamed from: l1, reason: collision with root package name */
    public int f146557l1;

    /* renamed from: n2, reason: collision with root package name */
    public android.widget.LinearLayout f146562n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.j f146564o2;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f146565p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f146566p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.c1 f146567p1;

    /* renamed from: p2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f146568p2;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f146569q;

    /* renamed from: q2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f146570q2;

    /* renamed from: r2, reason: collision with root package name */
    public int f146572r2;

    /* renamed from: s2, reason: collision with root package name */
    public java.lang.String f146574s2;

    /* renamed from: t2, reason: collision with root package name */
    public int f146576t2;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f146577u;

    /* renamed from: u2, reason: collision with root package name */
    public long f146578u2;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f146579v;

    /* renamed from: v2, reason: collision with root package name */
    public long f146580v2;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f146581w;

    /* renamed from: w2, reason: collision with root package name */
    public java.lang.String f146582w2;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.MMScrollView f146583x;

    /* renamed from: x0, reason: collision with root package name */
    public int f146584x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.m f146585x1;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f146586x2;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f146587y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f146588y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f146589y1;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f146590y2;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f146591z;

    /* renamed from: z1, reason: collision with root package name */
    public int f146592z1;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f146593z2;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView f146549g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView f146551h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView f146553i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146559m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f146561n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f146563o = null;

    /* renamed from: r, reason: collision with root package name */
    public android.app.Dialog f146571r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Dialog f146573s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.app.Dialog f146575t = null;
    public final com.tencent.mm.plugin.luckymoney.ui.c6 X = new com.tencent.mm.plugin.luckymoney.ui.c6();
    public com.tencent.mm.sdk.platformtools.b4 A1 = null;
    public int B1 = 1;
    public java.lang.String C1 = com.tencent.mm.wallet_core.ui.r1.l("CNY");
    public java.lang.String D1 = null;
    public java.lang.String F1 = "";
    public int T1 = 1;
    public int U1 = 0;
    public boolean Z1 = false;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f146544b2 = false;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f146545c2 = false;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f146546d2 = false;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f146547e2 = false;

    /* renamed from: g2, reason: collision with root package name */
    public float f146550g2 = 0.0f;

    /* renamed from: i2, reason: collision with root package name */
    public int f146554i2 = 1;

    /* renamed from: j2, reason: collision with root package name */
    public java.lang.String f146555j2 = "";

    /* renamed from: k2, reason: collision with root package name */
    public r45.lm5 f146556k2 = null;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f146558l2 = false;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f146560m2 = false;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10, reason: invalid class name */
    /* loaded from: classes9.dex */
    class AnonymousClass10 implements java.lang.Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
            if (luckyMoneyPrepareUI.isFinishing() || luckyMoneyPrepareUI.isDestroyed()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[refreshViewByConfigAndSourceMac] isFinishing() || isDestroyed()");
                return;
            }
            luckyMoneyPrepareUI.s7(false);
            java.lang.String stringExtra = luckyMoneyPrepareUI.getIntent().getStringExtra("key_username");
            java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
            if (c01.e2.S(stringExtra)) {
                hb3.o.Ni().Di().g();
            } else if (luckyMoneyPrepareUI.f146557l1 == 3) {
                hb3.o.Ni().Bi().g();
            } else {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                    hb3.o.Ni().wi().g();
                }
            }
            luckyMoneyPrepareUI.x7();
            if (c01.e2.S(luckyMoneyPrepareUI.getIntent().getStringExtra("key_username"))) {
                luckyMoneyPrepareUI.f146585x1 = hb3.o.Ni().Di().c();
            } else if (luckyMoneyPrepareUI.f146557l1 == 3) {
                luckyMoneyPrepareUI.f146585x1 = hb3.o.Ni().Bi().c();
            } else {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                    luckyMoneyPrepareUI.f146585x1 = hb3.o.Ni().wi().c();
                }
            }
            luckyMoneyPrepareUI.i7();
            com.tencent.mm.plugin.luckymoney.model.m mVar = luckyMoneyPrepareUI.f146585x1;
            if (mVar == null) {
                luckyMoneyPrepareUI.y7(null);
                return;
            }
            r45.wv3 wv3Var = mVar.f145435a;
            if (wv3Var != null) {
                luckyMoneyPrepareUI.V1 = wv3Var.f389516y;
                luckyMoneyPrepareUI.W1 = wv3Var.f389514w;
                luckyMoneyPrepareUI.X1 = wv3Var.f389515x;
            }
            luckyMoneyPrepareUI.y7(wv3Var);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$19, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass19 extends com.tencent.mm.wallet_core.ui.z1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f146610d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f146611e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$19$1, reason: invalid class name */
        /* loaded from: classes9.dex */
        class AnonymousClass1 implements com.tencent.mm.plugin.luckymoney.ui.no {
            public AnonymousClass1() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(boolean z17, boolean z18) {
            super(false);
            this.f146610d = z17;
            this.f146611e = z18;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x034c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x035d  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0365  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x037a  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x034f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0349  */
        @Override // com.tencent.mm.wallet_core.ui.z1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onRealClick(android.view.View r21) {
            /*
                Method dump skipped, instructions count: 936
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass19.onRealClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1594159370;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent) {
            com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent2 = hKCashierJSApiPayResultEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "hkCashierPayResultIListener callback");
            if (hKCashierJSApiPayResultEvent2.f54428g.f6451a == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "hkCashierPayResultIListener callback paysucc");
                hKCashierJSApiPayResultEvent2.f54428g.f6452b = 1;
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.finish();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 200L, false);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146570q2.dead();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class LuckyMoneyPrepareUIAccessibilityConfig extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f146671d = 0;

        public LuckyMoneyPrepareUIAccessibilityConfig(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
        public void initConfig() {
            com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.j5i);
            root.disable(com.tencent.mm.R.id.j5b);
            root.disable(com.tencent.mm.R.id.j6v);
            root.disable(com.tencent.mm.R.id.j6w);
            root.disable(com.tencent.mm.R.id.j2e);
            com.tencent.mm.accessibility.base.ViewSetter desc = root.view(com.tencent.mm.R.id.j2j).desc(com.tencent.mm.R.id.j2k);
            com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
            desc.type(viewType);
            view(com.tencent.mm.R.id.j1d, com.tencent.mm.R.id.j1d).desc(new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$LuckyMoneyPrepareUIAccessibilityConfig$$a());
            com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.j7e);
            root2.view(com.tencent.mm.R.id.j6y).disable();
            root2.view(com.tencent.mm.R.id.j0p).desc(com.tencent.mm.R.string.gj7).type(viewType);
            root.view(com.tencent.mm.R.id.j1g).desc(new yz5.l(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.LuckyMoneyPrepareUIAccessibilityConfig.1
                @Override // yz5.l
                public java.lang.Object invoke(java.lang.Object obj) {
                    android.view.View view = (android.view.View) obj;
                    android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1h);
                    android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1i);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(textView.getText());
                    sb6.append(textView2.getText());
                    return sb6.toString();
                }
            }).type(viewType);
            root.view(com.tencent.mm.R.id.f485775j13).desc(new yz5.l(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.LuckyMoneyPrepareUIAccessibilityConfig.2
                @Override // yz5.l
                public java.lang.Object invoke(java.lang.Object obj) {
                    android.view.View view = (android.view.View) obj;
                    android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1a);
                    android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1b);
                    android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1_);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(textView.getText());
                    sb6.append(textView2.getText());
                    sb6.append(textView3.getText());
                    return sb6.toString();
                }
            }).type(viewType);
        }

        @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
        public void onResume() {
            super.onResume();
        }
    }

    public LuckyMoneyPrepareUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f146568p2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PayLoopInterruptEvent>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.1
            {
                this.__eventId = 1264607315;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PayLoopInterruptEvent payLoopInterruptEvent) {
                if (1 != payLoopInterruptEvent.f54610g.f6481a) {
                    return false;
                }
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.finish();
                return false;
            }
        };
        this.f146570q2 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass2(a0Var);
        this.f146586x2 = false;
        this.f146590y2 = false;
        this.f146593z2 = false;
        this.A2 = false;
        this.B2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.Show261AlertEvent>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.31
            {
                this.__eventId = -2016047906;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.Show261AlertEvent show261AlertEvent) {
                com.tencent.mm.autogen.events.Show261AlertEvent show261AlertEvent2 = show261AlertEvent;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                android.app.Dialog dialog = luckyMoneyPrepareUI.f146571r;
                if (dialog != null && dialog.isShowing()) {
                    luckyMoneyPrepareUI.f146571r.dismiss();
                }
                final at4.a aVar = show261AlertEvent2.f54781g.f7660a;
                if (aVar == null || !aVar.a()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "show 261 alert item");
                luckyMoneyPrepareUI.A2 = true;
                db5.e1.A(luckyMoneyPrepareUI.getContext(), aVar.f13795a, "", aVar.f13797c, aVar.f13796b, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.31.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        at4.a aVar2 = aVar;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "goto h5: %s", aVar2.f13798d);
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass31 anonymousClass31 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass31.this;
                        com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getContext(), aVar2.f13798d, false);
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.A2 = false;
                    }
                }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.31.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.A2 = false;
                    }
                });
                return false;
            }
        };
        this.C2 = 0;
    }

    public static void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI, final boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[openLocalEnvelopeLayout]  mHasSource: %s", java.lang.Integer.valueOf(luckyMoneyPrepareUI.V1));
        final android.app.Dialog F = com.tencent.mm.plugin.luckymoney.model.m5.F(luckyMoneyPrepareUI.getContext(), false);
        com.tencent.mm.plugin.luckymoney.model.n0 g17 = com.tencent.mm.plugin.luckymoney.model.n0.g();
        g17.f213885c = new com.tencent.mm.plugin.luckymoney.model.h("", 1);
        g17.c(new com.tencent.mm.wallet_core.model.d() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.20
            @Override // com.tencent.mm.wallet_core.model.d
            public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
            }

            @Override // com.tencent.mm.wallet_core.model.d
            public void b(java.lang.Object obj, int i17, int i18) {
                r45.co3 co3Var = (r45.co3) obj;
                android.app.Dialog dialog = F;
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                if (co3Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[openLocalEnvelopeLayout] netCallback failed");
                    com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyPrepareUI2.getContext(), "");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[openLocalEnvelopeLayout] netCallback retcode: %s", java.lang.Integer.valueOf(co3Var.f371703d));
                if (co3Var.f371703d != 0) {
                    com.tencent.mm.wallet_core.ui.r1.L(co3Var.f371704e);
                    return;
                }
                try {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.W6(luckyMoneyPrepareUI2, co3Var.toByteArray(), true, z17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyPrepareUI", e17, "", new java.lang.Object[0]);
                }
                luckyMoneyPrepareUI2.L.setVisibility(8);
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().j(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
            }
        }, true);
    }

    public static void W6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI, byte[] bArr, boolean z17, boolean z18) {
        luckyMoneyPrepareUI.H = true;
        android.content.Intent intent = new android.content.Intent(luckyMoneyPrepareUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.class);
        if (bArr != null && bArr.length > 0) {
            intent.putExtra("key_has_resp", true);
        }
        intent.putExtra("key_session_id", luckyMoneyPrepareUI.Y1);
        intent.putExtra("key_has_source", z17);
        intent.putExtra("key_has_reddot", z18);
        intent.putExtra("key_exchange_title", luckyMoneyPrepareUI.W1);
        intent.putExtra("key_exchange_url", luckyMoneyPrepareUI.X1);
        luckyMoneyPrepareUI.startActivityForResult(intent, 5);
    }

    public static void X6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI) {
        luckyMoneyPrepareUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        luckyMoneyPrepareUI.Q1 = redEnvSendWithEmoticonClickStruct;
        redEnvSendWithEmoticonClickStruct.f59936d = 3L;
        redEnvSendWithEmoticonClickStruct.k();
        luckyMoneyPrepareUI.hideTenpayKB();
        luckyMoneyPrepareUI.hideVKB();
        luckyMoneyPrepareUI.M1.show();
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        int i18 = luckyMoneyPrepareUI.S1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 1) {
            luckyMoneyPrepareUI.L1.setHBScene(5);
        } else {
            luckyMoneyPrepareUI.L1.setHBScene(2);
        }
        fc3.j.c(luckyMoneyPrepareUI.f146553i.getInput(), luckyMoneyPrepareUI.N1, luckyMoneyPrepareUI.L1, 0, new qk.u9() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.42
            @Override // qk.u9
            public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
                com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(iEmojiInfo.getMd5());
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                luckyMoneyPrepareUI2.P1 = wi6;
                luckyMoneyPrepareUI2.v7(luckyMoneyPrepareUI2.P1);
                onHide();
            }

            @Override // qk.u9
            public void onHide() {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                fc3.j.a(luckyMoneyPrepareUI2, luckyMoneyPrepareUI2.L1);
                luckyMoneyPrepareUI2.M1.dismiss();
            }
        });
    }

    public final void A7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "update view by mode: %s, %s", java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(i17));
        int i18 = this.Y;
        if (i17 == i18) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.X;
        if (i18 == 0) {
            gb3.p.f270046e = 1;
            this.N.setText(com.tencent.mm.R.string.gls);
            this.P.setVisibility(8);
            this.f146549g.setVisibility(0);
            this.Q.setVisibility(0);
            this.f146569q.setVisibility(8);
            c6Var.e();
            c6Var.d(this.f146549g);
            c6Var.d(this.f146551h);
            c6Var.d(this.f146553i);
            int input = this.f146549g.getInput();
            double input2 = this.f146551h.getInput();
            this.f146551h.setType(this.Y);
            this.f146551h.setShowGroupIcon(false);
            this.f146551h.setTitle(getString(com.tencent.mm.R.string.go9));
            if (input2 > 0.0d && input > 0) {
                this.f146551h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input2 / input));
            }
            if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.f146557l1)) {
                this.f146551h.setMaxAmount(this.f146567p1.f145200y);
            } else {
                this.f146551h.setMaxAmount(this.f146567p1.f145186h);
            }
            w7(this.f146555j2);
        } else if (i18 == 1) {
            gb3.p.f270046e = 2;
            this.N.setText(com.tencent.mm.R.string.glr);
            this.P.setVisibility(8);
            this.f146549g.setVisibility(0);
            this.Q.setVisibility(0);
            this.f146569q.setVisibility(8);
            c6Var.e();
            c6Var.d(this.f146549g);
            c6Var.d(this.f146551h);
            c6Var.d(this.f146553i);
            int input3 = this.f146549g.getInput();
            double input4 = this.f146551h.getInput();
            this.f146551h.setType(this.Y);
            if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.f146557l1)) {
                this.f146551h.setMaxAmount(this.f146567p1.A);
            } else {
                this.f146551h.setMaxAmount(this.f146567p1.f145183e);
            }
            this.f146551h.setTitle(getString(com.tencent.mm.R.string.go8));
            this.f146551h.setShowGroupIcon(true);
            if (i17 == 3 && input4 > 0.0d) {
                this.f146551h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input4));
            } else if (input4 > 0.0d && input3 > 0) {
                this.f146551h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input4 * input3));
            }
            w7(this.f146555j2);
        } else if (i18 == 3) {
            gb3.p.f270046e = 3;
            this.N.setText(com.tencent.mm.R.string.glp);
            this.P.setVisibility(0);
            this.f146549g.setVisibility(8);
            this.Q.setVisibility(8);
            this.f146569q.setVisibility(8);
            c6Var.e();
            c6Var.d((com.tencent.mm.plugin.luckymoney.ui.d6) this.P);
            c6Var.d(this.f146551h);
            c6Var.d(this.f146553i);
            int input5 = this.f146549g.getInput();
            double input6 = this.f146551h.getInput();
            this.f146551h.setType(this.Y);
            this.f146551h.setShowGroupIcon(false);
            this.f146551h.setTitle(getString(com.tencent.mm.R.string.go6));
            if (i17 == 0 && input6 > 0.0d && input5 > 0) {
                this.f146551h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input6 * input5));
            } else if (input6 > 0.0d) {
                this.f146551h.setAmount(com.tencent.mm.wallet_core.ui.r1.o(input6));
            }
            if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.f146557l1)) {
                this.f146551h.setMaxAmount(this.f146567p1.f145200y);
            } else {
                this.f146551h.setMaxAmount(this.f146567p1.f145186h);
            }
            if (!this.f146543a2) {
                this.P.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.14
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                        android.widget.TextView textView = (android.widget.TextView) luckyMoneyPrepareUI.findViewById(com.tencent.mm.R.id.j1h);
                        android.widget.ImageView imageView = (android.widget.ImageView) luckyMoneyPrepareUI.findViewById(com.tencent.mm.R.id.j1e);
                        int left = (imageView.getLeft() - i65.a.b(luckyMoneyPrepareUI.getContext(), 8)) - (textView.getRight() + i65.a.b(luckyMoneyPrepareUI.getContext(), 52));
                        if (left > 0) {
                            luckyMoneyPrepareUI.S.setMaxWidth(left);
                        }
                    }
                });
                this.f146543a2 = true;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_EXCLUSIVE_FIRST_BOOLEAN_SYNC;
            if (((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                w7(getResources().getString(com.tencent.mm.R.string.f492426gl5));
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
            } else {
                w7(this.f146555j2);
            }
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.f146557l1)) {
            this.Q.setVisibility(8);
        }
        D4(true, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r18.K1) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03df  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(boolean r19, int r20) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D4(boolean, int):void");
    }

    public final boolean Y6() {
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.f146567p1;
        return (c1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var.f145194s)) ? false : true;
    }

    public void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[dismissDialogAfterCgi]");
        android.app.Dialog dialog = this.f146573s;
        if (dialog != null && dialog.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[dismissDialogAfterCgi] dismiss coperationTipDialog");
            this.f146573s.dismiss();
        }
        android.app.Dialog dialog2 = this.f146575t;
        if (dialog2 == null || !dialog2.isShowing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[dismissDialogAfterCgi] dismiss coperationTipDialogNoTransparent");
        this.f146575t.dismiss();
    }

    public final void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "do business callback");
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.u5(this.F1, str, this.G1), false);
        } else {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.t5(this.F1, str, this.G1), false);
        }
    }

    public final void b7() {
        android.app.Dialog dialog = this.f146571r;
        if (dialog != null) {
            dialog.show();
            return;
        }
        android.app.Dialog h17 = com.tencent.mm.wallet_core.ui.b2.h(getContext(), true, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.16
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                android.app.Dialog dialog2 = luckyMoneyPrepareUI.f146571r;
                if (dialog2 != null && dialog2.isShowing()) {
                    luckyMoneyPrepareUI.f146571r.dismiss();
                }
                if (luckyMoneyPrepareUI.getContentView().getVisibility() == 8 || luckyMoneyPrepareUI.getContentView().getVisibility() == 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
                    luckyMoneyPrepareUI.finish();
                }
                luckyMoneyPrepareUI.forceCancel();
            }
        });
        this.f146571r = h17;
        h17.setCancelable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(boolean r8) {
        /*
            r7 = this;
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.LuckyMoneyPrepareUI"
            java.lang.String r2 = "[doGetConfig] showLoading : %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r8 == 0) goto L20
            androidx.appcompat.app.AppCompatActivity r8 = r7.getContext()
            android.app.Dialog r8 = com.tencent.mm.plugin.luckymoney.model.m5.F(r8, r0)
            r7.f146573s = r8
        L20:
            r8 = 1
            r7.f146590y2 = r8
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r4 = "key_username"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.util.HashMap r5 = com.tencent.mm.plugin.luckymoney.model.m5.f145452a
            boolean r3 = c01.e2.S(r3)
            java.lang.String r5 = "v1.0"
            if (r3 == 0) goto L65
            java.lang.String r8 = "[doGetConfig] hb type: union"
            com.tencent.mars.xlog.Log.i(r1, r8)
            gm0.b0 r8 = gm0.j1.u()
            com.tencent.mm.storage.n3 r8 = r8.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC
            java.lang.Object r8 = r8.m(r1, r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.V1 = r8
            com.tencent.mm.plugin.luckymoney.model.y5 r1 = new com.tencent.mm.plugin.luckymoney.model.y5
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r2 = r2.getStringExtra(r4)
            r1.<init>(r5, r8, r2)
            r7.doSceneProgress(r1, r0)
            goto L106
        L65:
            int r3 = r7.f146557l1
            r6 = 3
            if (r3 != r6) goto L91
            java.lang.String r8 = "[doGetConfig] hb type: live"
            com.tencent.mars.xlog.Log.i(r1, r8)
            gm0.b0 r8 = gm0.j1.u()
            com.tencent.mm.storage.n3 r8 = r8.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC
            java.lang.Object r8 = r8.m(r1, r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.V1 = r8
            yb3.a r1 = new yb3.a
            r2 = 23
            r1.<init>(r2, r5, r8)
            r7.doSceneProgress(r1, r0)
            goto L106
        L91:
            gm0.b0 r3 = gm0.j1.u()
            com.tencent.mm.storage.n3 r3 = r3.c()
            com.tencent.mm.storage.u3 r6 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC
            java.lang.Object r2 = r3.m(r6, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7.V1 = r2
            int r3 = r7.f146557l1
            if (r3 == r8) goto Lb3
            r8 = 2
            if (r3 == r8) goto Lb0
        Lae:
            r8 = r0
            goto Lc8
        Lb0:
            r8 = 24
            goto Lc8
        Lb3:
            int r3 = r7.Z
            if (r3 == r8) goto Lae
            r8 = 9
            if (r3 == r8) goto Lbf
            r8 = 11
            if (r3 != r8) goto Lc6
        Lbf:
            boolean r8 = r7.j7()
            if (r8 == 0) goto Lc6
            goto Lae
        Lc6:
            r8 = 25
        Lc8:
            java.lang.Class<qg0.h0> r3 = qg0.h0.class
            i95.m r3 = i95.n0.c(r3)
            qg0.h0 r3 = (qg0.h0) r3
            pg0.s3 r3 = (pg0.s3) r3
            r3.getClass()
            boolean r3 = com.tencent.mm.plugin.luckymoney.model.m5.s()
            if (r3 == 0) goto Lf1
            java.lang.String r8 = "[doGetConfig] hb type: hk"
            com.tencent.mars.xlog.Log.i(r1, r8)
            yb3.f r8 = new yb3.f
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r1 = r1.getStringExtra(r4)
            r8.<init>(r1)
            r7.doSceneProgress(r8, r0)
            goto L106
        Lf1:
            java.lang.String r3 = "[doGetConfig] hb type: normal"
            com.tencent.mars.xlog.Log.i(r1, r3)
            com.tencent.mm.plugin.luckymoney.model.x5 r1 = new com.tencent.mm.plugin.luckymoney.model.x5
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r3 = r3.getStringExtra(r4)
            r1.<init>(r8, r5, r2, r3)
            r7.doSceneProgress(r1, r0)
        L106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.c7(boolean):void");
    }

    public final void d7(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.luckymoney.model.d6 d6Var;
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.lang.String r17 = c01.z1.r();
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult() resultCode == RESULT_OK");
            this.C2 = 1;
            java.lang.String str = this.F1;
            java.lang.String str2 = this.I1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d6Var = new com.tencent.mm.plugin.luckymoney.model.d6(str, str2, 1, r17, stringExtra == null ? "" : stringExtra);
        } else {
            if (intent != null) {
                this.C2 = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "doNetSceneLuckyMoneyReport() data == null");
                this.C2 = 3;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", java.lang.Integer.valueOf(this.C2));
            java.lang.String str3 = this.F1;
            java.lang.String str4 = this.I1;
            int i18 = this.C2;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d6Var = new com.tencent.mm.plugin.luckymoney.model.d6(str3, str4, i18, r17, stringExtra == null ? "" : stringExtra);
        }
        gm0.j1.n().f273288b.g(d6Var);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f146577u.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        android.view.View view = this.f146577u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(int r26) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.e7(int):void");
    }

    public final void f7(int i17, java.lang.String str, int i18, long j17, long j18, java.lang.String str2) {
        java.lang.String str3;
        int i19;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.P1;
        if (iEmojiInfo != null) {
            str3 = iEmojiInfo.getMd5();
            i19 = this.P1.getType();
        } else {
            str3 = "";
            i19 = 0;
        }
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146585x1;
        java.lang.String str4 = mVar != null ? mVar.f145436b : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "currency is RMB. userConfirmJump:%s，lastPayResult:%s，lastSendId:%s，mUniqueId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.C2), this.F1, this.I1);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[doRMBPrePareBtnClick] type: union");
            doSceneProgress((!this.f146588y0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? new com.tencent.mm.plugin.luckymoney.model.i6(i18, j17, j18, this.Y, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), null, null, c01.z1.r(), c01.z1.l(), this.Z, str4, this.I1, i17, this.C2, this.F1, str3, i19) : new com.tencent.mm.plugin.luckymoney.model.i6(i18, j17, j18, this.Y, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), str, com.tencent.mm.plugin.luckymoney.model.m5.m(str), c01.z1.r(), c01.z1.l(), this.Z, str4, this.I1, i17, this.C2, this.F1, str3, i19), false);
        } else if (this.f146557l1 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[doRMBPrePareBtnClick] type: live");
            doSceneProgress(new yb3.c(i18, j17, j18, this.Y, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), str, com.tencent.mm.plugin.luckymoney.model.m5.m(str), c01.z1.r(), c01.z1.l(), this.Z, str4, this.I1, i17, this.C2, this.F1, str3, i19, this.K1, getIntent().getStringExtra("key_live_id"), getIntent().getStringExtra("key_live_attach"), getIntent().getIntExtra("key_live_anchor_type", 0)), false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[doRMBPrePareBtnClick] type: normal");
            doSceneProgress((!this.f146588y0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? new com.tencent.mm.plugin.luckymoney.model.h6(i18, j17, j18, this.Y, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), null, null, c01.z1.r(), c01.z1.l(), this.Z, str4, this.I1, i17, this.C2, this.F1, str3, i19, this.K1) : new com.tencent.mm.plugin.luckymoney.model.h6(i18, j17, j18, this.Y, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), str, com.tencent.mm.plugin.luckymoney.model.m5.m(str), c01.z1.r(), c01.z1.l(), this.Z, str4, this.I1, i17, this.C2, this.F1, str3, i19, this.K1), false);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[doRMBPrePareBtnClick] do not has showSourceMac");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[doRMBPrePareBtnClick] has showSourceMac");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 11);
        }
        b7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.E1 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_realname_guide_helper", this.E1);
            j45.l.j(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent, null);
        }
        super.finish();
    }

    public final int g7() {
        if (this.f146588y0) {
            return getIntent().getIntExtra("key_chatroom_num", 0) > 0 ? 2 : 1;
        }
        return 3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489248bv5;
    }

    @Override // mp5.v
    public void h4(float f17) {
        if (f17 > 0.0f && this.f146550g2 <= 0.0f) {
            this.f146550g2 = f17;
        }
        if (f17 > 0.0f || this.f146550g2 <= 0.0f) {
            return;
        }
        this.f146550g2 = f17;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25925, 6, java.lang.Integer.valueOf(this.f146554i2), java.lang.Float.valueOf(this.f146552h2), this.f146551h.getEditText().getText(), this.f146549g.getEditText().getText());
    }

    public r45.lm5 h7() {
        if (this.f146556k2 == null) {
            this.f146556k2 = com.tencent.mm.plugin.luckymoney.model.m5.n();
        }
        return this.f146556k2;
    }

    public void hideTenpayKB() {
        android.view.View view = this.f146565p;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f146565p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i7() {
        final com.tencent.mm.plugin.luckymoney.model.q0 q0Var;
        if (this.B1 == 1) {
            addIconOptionMenu(0, com.tencent.mm.R.string.w_, com.tencent.mm.R.raw.icons_outlined_more, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.17
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
                    final com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                    luckyMoneyPrepareUI.getClass();
                    al5.s0 s0Var = new al5.s0(luckyMoneyPrepareUI, 1, false);
                    s0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.25
                        @Override // db5.o4
                        public void onCreateMMMenu(db5.g4 g4Var) {
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                            g4Var.add(0, 0, 0, luckyMoneyPrepareUI2.getString(com.tencent.mm.R.string.gjn));
                            g4Var.add(0, 1, 0, luckyMoneyPrepareUI2.getString(com.tencent.mm.R.string.kmx));
                        }
                    };
                    s0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.26
                        @Override // db5.t4
                        public void onMMMenuItemSelected(android.view.MenuItem menuItem2, int i17) {
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                            if (i17 == 0) {
                                android.content.Intent intent = new android.content.Intent();
                                intent.setClass(luckyMoneyPrepareUI2.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
                                intent.putExtra("key_username", luckyMoneyPrepareUI2.getIntent().getStringExtra("key_username"));
                                intent.putExtra("key_type", 2);
                                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI3 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(luckyMoneyPrepareUI3, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$26", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                luckyMoneyPrepareUI3.startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(luckyMoneyPrepareUI3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$26", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                            if (i17 == 1) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15511, java.lang.Integer.valueOf(luckyMoneyPrepareUI2.B1), 1);
                                if (luckyMoneyPrepareUI2.B1 == 1) {
                                    com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyPrepareUI2.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2, false);
                                    return;
                                }
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                com.tencent.mm.plugin.luckymoney.model.c1 c1Var = luckyMoneyPrepareUI2.f146567p1;
                                objArr[0] = c1Var != null ? c1Var.f145193r : "";
                                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "show qa foreign, config url: %s", objArr);
                                com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = luckyMoneyPrepareUI2.f146567p1;
                                if (c1Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var2.f145193r)) {
                                    com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyPrepareUI2.getContext(), "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
                                } else {
                                    com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyPrepareUI2.getContext(), luckyMoneyPrepareUI2.f146567p1.f145193r, false);
                                }
                            }
                        }
                    };
                    s0Var.v();
                    return true;
                }
            });
        } else {
            addIconOptionMenu(0, com.tencent.mm.R.string.kmx, com.tencent.mm.R.drawable.ama, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.18
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var = luckyMoneyPrepareUI.f146567p1;
                    if (c1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var.f145193r)) {
                        com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyPrepareUI.getContext(), "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
                        return true;
                    }
                    com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyPrepareUI.getContext(), luckyMoneyPrepareUI.f146567p1.f145193r, false);
                    return true;
                }
            });
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[initCustomEnvelopeEntranceView] showCount: %s", java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_CUSTOM_ENVELOPE_ENTRANCE_INT_SYNC, 0)).intValue()));
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((com.tencent.mm.plugin.luckymoney.ui.to) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.to.class)).P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[initCustomEnvelopeEntranceView] use cover_jumpactionV2");
            q0Var = this.f146567p1.B;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[initCustomEnvelopeEntranceView] use cover_jumpactionV1");
            q0Var = this.f146567p1.f145198w;
        }
        if (this.f146567p1 == null || q0Var == null || this.f146557l1 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[initCustomEnvelopeEntranceView] not show");
            this.T.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f145551e)) {
            this.T.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18890, 11, java.lang.Integer.valueOf(p7()), this.Y1, r7(), o7(), q7());
        this.V.setText(q0Var.f145551e);
        int B = i65.a.B(getContext()) - i65.a.b(getContext(), 70);
        if (B > 0) {
            this.V.setMaxWidth(B);
        }
        this.T.setVisibility(0);
        this.f146546d2 = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f145552f)) {
            o11.f fVar = new o11.f();
            fVar.f342083g = hb3.o.Ni().Zi();
            fVar.f342078b = true;
            fVar.f342096t = false;
            fVar.f342077a = true;
            fVar.f342091o = com.tencent.mm.R.raw.icons_filled_red_envelope;
            n11.a.b().h(q0Var.f145552f, this.U, fVar.a());
        }
        this.T.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(false);
            }

            @Override // com.tencent.mm.wallet_core.ui.z1
            public void onRealClick(android.view.View view) {
                com.tencent.mm.plugin.luckymoney.model.q0 q0Var2 = q0Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "jump to action type: %s", java.lang.Integer.valueOf(q0Var2.f145553g));
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                g0Var.d(18890, 12, java.lang.Integer.valueOf(luckyMoneyPrepareUI.p7()), luckyMoneyPrepareUI.Y1, luckyMoneyPrepareUI.r7(), luckyMoneyPrepareUI.o7(), luckyMoneyPrepareUI.q7());
                switch (q0Var2.f145553g) {
                    case 1:
                        com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyPrepareUI.getContext(), q0Var2.f145554h, false);
                        return;
                    case 2:
                        com.tencent.mm.wallet_core.ui.r1.a0(luckyMoneyPrepareUI.getContext(), q0Var2.f145555i);
                        return;
                    case 3:
                        com.tencent.mm.wallet_core.ui.r1.b0(q0Var2.f145555i, q0Var2.f145554h, 0, 1100);
                        return;
                    case 4:
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("finder_username", q0Var2.f145555i);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f460472a.w(luckyMoneyPrepareUI.getContext(), intent);
                        return;
                    case 5:
                    case 6:
                        java.lang.String str2 = q0Var2.f145555i;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "emoticon liteapp service not found");
                            return;
                        }
                        qk.c0 c0Var = new qk.c0(str2);
                        c0Var.f364198g = 21;
                        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                        if (p6Var == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "emoticon liteapp service not found");
                            return;
                        } else {
                            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(luckyMoneyPrepareUI.getContext(), c0Var);
                            return;
                        }
                    default:
                        return;
                }
            }
        });
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17;
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.3
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.finish();
                return true;
            }
        });
        this.f146577u = findViewById(com.tencent.mm.R.id.j5g);
        this.f146579v = findViewById(com.tencent.mm.R.id.j5k);
        this.f146563o = (android.widget.Button) findViewById(com.tencent.mm.R.id.j5j);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView) findViewById(com.tencent.mm.R.id.j7e);
        this.f146553i = luckyMoneyTextInputView;
        luckyMoneyTextInputView.setHintText(getString(com.tencent.mm.R.string.gjq));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView2 = this.f146553i;
        com.tencent.mm.wallet_core.ui.y yVar = new com.tencent.mm.wallet_core.ui.y(75);
        android.text.InputFilter[] filters = luckyMoneyTextInputView2.f146672d.getFilters();
        android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[filters.length + 1];
        java.lang.System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
        inputFilterArr[filters.length] = yVar;
        luckyMoneyTextInputView2.f146672d.setFilters(inputFilterArr);
        this.f146561n = (android.widget.Button) findViewById(com.tencent.mm.R.id.j58);
        this.f146565p = findViewById(com.tencent.mm.R.id.o1v);
        this.f146569q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485810j56);
        this.f146549g = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView) findViewById(com.tencent.mm.R.id.j4z);
        this.f146551h = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView) findViewById(com.tencent.mm.R.id.f485754iy1);
        this.f146559m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5l);
        this.f146581w = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j5e);
        this.f146583x = (com.tencent.mm.wallet_core.ui.MMScrollView) findViewById(com.tencent.mm.R.id.j6v);
        this.f146587y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5c);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f485775j13);
        this.f146591z = relativeLayout;
        zl5.b.f474086a.a(relativeLayout, i65.a.b(getContext(), 8));
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1b);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1_);
        this.C = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485773j11);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f485778j16);
        this.E = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.D = findViewById(com.tencent.mm.R.id.j17);
        this.I = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j2f);
        this.f146542J = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j0x);
        this.K = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.j0y);
        this.f146562n2 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485758iy5);
        this.L = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485777j15);
        this.M = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j2j);
        this.N = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j2k);
        this.P = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j1g);
        this.Q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5d);
        this.R = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j1f);
        this.S = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1i);
        this.T = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.iyu);
        this.U = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.iyt);
        this.V = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyv);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.W = wcPayBannerView;
        wcPayBannerView.a();
        this.M1 = new com.tencent.mm.plugin.luckymoney.ui.b(this);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.buc, (android.view.ViewGroup) null);
        this.O1 = inflate;
        this.M1.setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.O1.findViewById(com.tencent.mm.R.id.j0q).setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.4
            @Override // com.tencent.mm.wallet_core.ui.z1
            public void onRealClick(android.view.View view) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                fc3.j.a(luckyMoneyPrepareUI, luckyMoneyPrepareUI.L1);
                luckyMoneyPrepareUI.M1.dismiss();
            }
        });
        com.tencent.mm.plugin.luckymoney.ui.b bVar = this.M1;
        bVar.f146732f = new com.tencent.mm.plugin.luckymoney.ui.a() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.5
            @Override // com.tencent.mm.plugin.luckymoney.ui.a
            public void a() {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                fc3.j.a(luckyMoneyPrepareUI, luckyMoneyPrepareUI.L1);
                luckyMoneyPrepareUI.M1.dismiss();
            }
        };
        android.view.Window window = bVar.getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
        }
        this.N1 = (android.view.ViewGroup) this.O1.findViewById(com.tencent.mm.R.id.j0s);
        this.L1 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        this.J1 = stringExtra;
        this.L1.setTalkerName(stringExtra);
        fc3.j.b(this.L1);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.luckymoney.ui.vo voVar = (com.tencent.mm.plugin.luckymoney.ui.vo) zVar.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.vo.class);
        androidx.appcompat.app.AppCompatActivity activity2 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity2 : null;
        android.widget.TextView textView = luckyMoneyPrepareUI != null ? (android.widget.TextView) luckyMoneyPrepareUI.findViewById(com.tencent.mm.R.id.uec) : null;
        voVar.f147593n = textView;
        com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        androidx.appcompat.app.AppCompatActivity activity3 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity3 : null;
        voVar.f147586d = luckyMoneyPrepareUI2 != null ? (android.widget.LinearLayout) luckyMoneyPrepareUI2.findViewById(com.tencent.mm.R.id.qwf) : null;
        androidx.appcompat.app.AppCompatActivity activity4 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI3 = activity4 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity4 : null;
        voVar.f147587e = luckyMoneyPrepareUI3 != null ? (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) luckyMoneyPrepareUI3.findViewById(com.tencent.mm.R.id.qwh) : null;
        androidx.appcompat.app.AppCompatActivity activity5 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI4 = activity5 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity5 : null;
        android.widget.TextView textView2 = luckyMoneyPrepareUI4 != null ? (android.widget.TextView) luckyMoneyPrepareUI4.findViewById(com.tencent.mm.R.id.qwi) : null;
        voVar.f147588f = textView2;
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        androidx.appcompat.app.AppCompatActivity activity6 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI5 = activity6 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity6 : null;
        voVar.f147589g = luckyMoneyPrepareUI5 != null ? (android.widget.TextView) luckyMoneyPrepareUI5.findViewById(com.tencent.mm.R.id.qwg) : null;
        androidx.appcompat.app.AppCompatActivity activity7 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI6 = activity7 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity7 : null;
        if (luckyMoneyPrepareUI6 != null) {
        }
        androidx.appcompat.app.AppCompatActivity activity8 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI7 = activity8 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity8 : null;
        voVar.f147590h = luckyMoneyPrepareUI7 != null ? (android.widget.LinearLayout) luckyMoneyPrepareUI7.findViewById(com.tencent.mm.R.id.upu) : null;
        androidx.appcompat.app.AppCompatActivity activity9 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI8 = activity9 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity9 : null;
        android.widget.TextView textView3 = luckyMoneyPrepareUI8 != null ? (android.widget.TextView) luckyMoneyPrepareUI8.findViewById(com.tencent.mm.R.id.upw) : null;
        voVar.f147591i = textView3;
        if (textView3 != null) {
            textView3.setTextSize(1, 14.0f);
        }
        androidx.appcompat.app.AppCompatActivity activity10 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI9 = activity10 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity10 : null;
        voVar.f147592m = luckyMoneyPrepareUI9 != null ? (android.widget.TextView) luckyMoneyPrepareUI9.findViewById(com.tencent.mm.R.id.upv) : null;
        androidx.appcompat.app.AppCompatActivity activity11 = voVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI10 = activity11 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity11 : null;
        if (luckyMoneyPrepareUI10 != null) {
        }
        if (this.Y == 1) {
            setMMTitle(com.tencent.mm.R.string.gl_);
            this.f146551h.setTitle(getString(com.tencent.mm.R.string.go8));
            this.f146551h.setShowGroupIcon(true);
        } else {
            setMMTitle(com.tencent.mm.R.string.gm9);
            this.f146551h.setTitle(getString(com.tencent.mm.R.string.go9));
            this.f146551h.setShowGroupIcon(false);
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra2)) {
            this.f146551h.setRtxLuckyMoney(1);
        } else if (this.f146557l1 == 3) {
            this.f146551h.setRtxLuckyMoney(2);
        } else {
            this.f146551h.setRtxLuckyMoney(0);
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, i65.a.h(this, com.tencent.mm.R.dimen.a4y));
        if (this.Y == 1) {
            layoutParams.topMargin = i65.a.b(getContext(), 13);
            layoutParams2.topMargin = i65.a.b(getContext(), 13);
        } else {
            layoutParams.topMargin = i65.a.b(getContext(), 16);
            layoutParams2.topMargin = i65.a.b(getContext(), 16);
        }
        this.f146553i.setLayoutParams(layoutParams);
        this.f146591z.setLayoutParams(layoutParams2);
        this.f146551h.setOnInputValidChangerListener(this);
        x7();
        this.f146549g.setOnInputValidChangerListener(this);
        this.f146549g.setHint(getString(com.tencent.mm.R.string.gmc));
        if (c01.e2.S(getIntent().getStringExtra("key_username"))) {
            this.f146549g.setRtxLuckyMoney(1);
        } else if (this.f146557l1 == 3) {
            this.f146549g.setRtxLuckyMoney(2);
        } else {
            this.f146549g.setRtxLuckyMoney(0);
        }
        this.f146553i.setOnInputValidChangerListener(this);
        ((com.tencent.mm.ui.widget.MMEditText) this.f146553i.findViewById(com.tencent.mm.R.id.j6x)).setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z17) {
                if (z17) {
                    gb3.p.f270042a.a(6);
                }
            }
        });
        if (!this.f146588y0) {
            this.f146549g.setNum("");
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 1) {
            this.f146549g.setNum("");
        } else {
            this.f146549g.setNum("1");
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.f146557l1)) {
            this.f146549g.setMaxNum(this.f146567p1.f145199x);
        } else {
            this.f146549g.setMaxNum(this.f146567p1.f145182d);
        }
        if (this.Y == 1) {
            this.f146549g.setMinNum(1);
        } else {
            this.f146549g.setMinNum(1);
        }
        this.f146549g.getInput();
        this.f146551h.setMaxLen(12);
        if (Y6()) {
            this.f146561n.setText(getString(com.tencent.mm.R.string.f492438gn5, this.f146567p1.f145194s));
        }
        boolean z17 = this.f146588y0;
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.X;
        if (z17 || (i17 = this.f146557l1) == 2 || i17 == 3) {
            if (Y6()) {
                setMMTitle(getString(com.tencent.mm.R.string.f492448go5, this.f146567p1.f145194s));
            } else {
                setMMTitle(com.tencent.mm.R.string.f492447go4);
            }
            int intExtra = getIntent().getIntExtra("key_chatroom_num", 0);
            if (this.f146588y0 && intExtra == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[hbtype] single hb");
                this.f146549g.setVisibility(8);
                this.M.setVisibility(8);
                this.P.setVisibility(8);
                c6Var.d(this.f146551h);
            } else {
                if (getIntent().getIntExtra("key_chatroom_num", 0) > 0 || !this.f146588y0) {
                    this.M.setVisibility(0);
                    A7(-1);
                    this.M.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.12
                        @Override // com.tencent.mm.wallet_core.ui.z1
                        public void onRealClick(android.view.View view) {
                            gb3.p.f270042a.a(10);
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI11 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                            luckyMoneyPrepareUI11.hideTenpayKB();
                            luckyMoneyPrepareUI11.hideVKB();
                            luckyMoneyPrepareUI11.f146548f2.i();
                            al5.s0 s0Var = new al5.s0(luckyMoneyPrepareUI11.getContext(), false, 1);
                            s0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.12.1
                                @Override // db5.o4
                                public void onCreateMMMenu(db5.g4 g4Var) {
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI12;
                                    int i18;
                                    gb3.p.f270042a.a(11);
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass12 anonymousClass12 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass12.this;
                                    g4Var.f(1, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getString(com.tencent.mm.R.string.glr));
                                    g4Var.f(2, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getString(com.tencent.mm.R.string.gls));
                                    ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_exclusive_lucky_money, 0);
                                    int intExtra2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getIntent().getIntExtra("key_chatroom_num", 0);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "%s: isOpenImIncludeAssociateRoom:%s", com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username"), java.lang.Boolean.valueOf(c01.e2.R(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username"))));
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI13 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                                    if (!luckyMoneyPrepareUI13.f146567p1.f145197v || luckyMoneyPrepareUI13.B1 != 1 || c01.e2.R(luckyMoneyPrepareUI13.getIntent().getStringExtra("key_username")) || (i18 = (luckyMoneyPrepareUI12 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this).f146557l1) == 2 || i18 == 3 || intExtra2 <= 1) {
                                        return;
                                    }
                                    g4Var.f(3, luckyMoneyPrepareUI12.getString(com.tencent.mm.R.string.glp));
                                }
                            };
                            s0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.12.2
                                @Override // db5.t4
                                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                                    int itemId = menuItem.getItemId();
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass12 anonymousClass12 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass12.this;
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI12 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                                    int i19 = luckyMoneyPrepareUI12.Y;
                                    gb3.p pVar = gb3.p.f270042a;
                                    if (itemId == 1) {
                                        luckyMoneyPrepareUI12.Y = 1;
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.g7()), 2);
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146554i2 = 3;
                                        gb3.p.f270046e = 2;
                                        pVar.a(12);
                                    } else if (itemId == 2) {
                                        luckyMoneyPrepareUI12.Y = 0;
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.g7()), 3);
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146554i2 = 2;
                                        gb3.p.f270046e = 1;
                                        pVar.a(13);
                                    } else if (itemId == 3) {
                                        luckyMoneyPrepareUI12.Y = 3;
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.g7()), 13);
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146554i2 = 4;
                                        gb3.p.f270046e = 3;
                                        pVar.a(14);
                                    }
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI13 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                                    if (luckyMoneyPrepareUI13.f146544b2 && i19 != luckyMoneyPrepareUI13.Y) {
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22237, 2);
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146545c2 = true;
                                    }
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.A7(i19);
                                }
                            };
                            s0Var.v();
                        }
                    });
                    this.P.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.13
                        @Override // com.tencent.mm.wallet_core.ui.z1
                        public void onRealClick(android.view.View view) {
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI11 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                            luckyMoneyPrepareUI11.hideTenpayKB();
                            luckyMoneyPrepareUI11.hideVKB();
                            luckyMoneyPrepareUI11.f146548f2.i();
                            android.content.Intent intent = new android.content.Intent(luckyMoneyPrepareUI11.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI.class);
                            intent.putExtra("chatroomName", luckyMoneyPrepareUI11.J1);
                            luckyMoneyPrepareUI11.startActivityForResult(intent, 6);
                        }
                    });
                } else {
                    this.M.setVisibility(8);
                    this.P.setVisibility(8);
                }
                if (this.f146588y0 && intExtra > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[hbtype] group hb，num：%s", java.lang.Integer.valueOf(intExtra));
                    this.Q.setText(getString(com.tencent.mm.R.string.gmb, java.lang.Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8))));
                } else if (this.f146557l1 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[hbtype] f2f hb");
                    this.f146553i.setVisibility(8);
                }
                this.f146551h.setGroupIconIv(com.tencent.mm.R.drawable.c_i);
            }
        } else {
            int i18 = this.Y;
            if (i18 == 1) {
                this.f146569q.setText(this.f146567p1.f145184f);
                this.f146569q.setVisibility(0);
            } else if (i18 == 0) {
                this.f146569q.setText(this.f146567p1.f145185g);
                this.f146569q.setVisibility(0);
            }
        }
        this.f146561n.setOnClickListener(new com.tencent.mm.ui.ac() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.7
            @Override // com.tencent.mm.ui.ac
            public void a(android.view.View view) {
                gb3.p.f270042a.a(9);
                com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI11 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                luckyMoneyPrepareUI11.Q1 = redEnvSendWithEmoticonClickStruct;
                com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct2 = luckyMoneyPrepareUI11.Q1;
                redEnvSendWithEmoticonClickStruct2.f59936d = 6L;
                redEnvSendWithEmoticonClickStruct2.k();
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(25925, 8, java.lang.Integer.valueOf(luckyMoneyPrepareUI11.f146554i2), java.lang.Float.valueOf(luckyMoneyPrepareUI11.f146552h2), luckyMoneyPrepareUI11.f146551h.getEditText().getText(), luckyMoneyPrepareUI11.f146549g.getEditText().getText());
                if (!((h45.q) i95.n0.c(h45.q.class)).canOpenKindaCashier(luckyMoneyPrepareUI11)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyPrepareUI", "can not request hb while authen");
                    g0Var.A(965, 55);
                    return;
                }
                com.tencent.mm.plugin.luckymoney.ui.c6 c6Var2 = luckyMoneyPrepareUI11.X;
                if ((c6Var2.f146779b || c6Var2.b()) ? false : true) {
                    luckyMoneyPrepareUI11.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "doPrePareBtnClick()");
                    luckyMoneyPrepareUI11.e7(0);
                }
            }
        });
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5_);
        if (textView4 != null) {
            c6Var.f146781d = textView4;
        } else {
            c6Var.getClass();
        }
        this.A1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.8
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
            
                if (com.tencent.mm.sdk.platformtools.t8.K0(r0.K1) != false) goto L12;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
            @Override // com.tencent.mm.sdk.platformtools.a4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onTimerExpired() {
                /*
                    r8 = this;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f146551h
                    int r1 = r1.c()
                    r2 = 3
                    r3 = 0
                    if (r1 == r2) goto L32
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f146549g
                    int r1 = r1.c()
                    if (r1 == r2) goto L32
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f146549g
                    int r1 = r1.getInput()
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r5 = r0.f146551h
                    double r5 = r5.getInput()
                    int r7 = r0.Y
                    if (r7 != 0) goto L28
                    double r1 = (double) r1
                    double r5 = r5 * r1
                    goto L33
                L28:
                    if (r7 != r2) goto L33
                    java.lang.String r1 = r0.K1
                    boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
                    if (r1 == 0) goto L33
                L32:
                    r5 = r3
                L33:
                    int r1 = r0.f146557l1
                    boolean r1 = com.tencent.mm.plugin.luckymoney.model.m5.r(r1)
                    if (r1 == 0) goto L40
                    com.tencent.mm.plugin.luckymoney.model.c1 r1 = r0.f146567p1
                    double r1 = r1.A
                    goto L44
                L40:
                    com.tencent.mm.plugin.luckymoney.model.c1 r1 = r0.f146567p1
                    double r1 = r1.f145183e
                L44:
                    int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r3 == 0) goto L60
                    int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r1 > 0) goto L60
                    com.tencent.mm.plugin.luckymoney.ui.c6 r1 = r0.X
                    boolean r1 = r1.c()
                    if (r1 == 0) goto L55
                    goto L60
                L55:
                    android.widget.Button r1 = r0.f146561n
                    r2 = 1
                    r1.setClickable(r2)
                    android.widget.Button r1 = r0.f146561n
                    r1.setEnabled(r2)
                L60:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "onTimeExpired & check: amount="
                    r1.<init>(r2)
                    r1.append(r5)
                    java.lang.String r2 = ", hasErr="
                    r1.append(r2)
                    com.tencent.mm.plugin.luckymoney.ui.c6 r2 = r0.X
                    boolean r2 = r2.c()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "MicroMsg.LuckyMoneyPrepareUI"
                    com.tencent.mars.xlog.Log.i(r2, r1)
                    com.tencent.mm.sdk.platformtools.b4 r0 = r0.A1
                    r0.e()
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass8.onTimerExpired():boolean");
            }
        }, false);
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = this.f146583x;
        if (mMScrollView != null) {
            mMScrollView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.9
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    if (motionEvent.getAction() == 0) {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI11 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                        luckyMoneyPrepareUI11.hideTenpayKB();
                        luckyMoneyPrepareUI11.hideVKB();
                        luckyMoneyPrepareUI11.f146548f2.i();
                    }
                    yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
        }
        this.f146551h.setType(this.Y);
        i7();
        androidx.appcompat.app.AppCompatActivity activity12 = getContext();
        kotlin.jvm.internal.o.g(activity12, "activity");
        boolean W6 = ((com.tencent.mm.plugin.luckymoney.ui.vo) zVar.a(activity12).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).W6();
        androidx.appcompat.app.AppCompatActivity activity13 = getContext();
        kotlin.jvm.internal.o.g(activity13, "activity");
        boolean U6 = ((com.tencent.mm.plugin.luckymoney.ui.vo) zVar.a(activity13).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).U6();
        if (U6) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(182, 219);
        }
        this.f146591z.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass19(U6, W6));
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146585x1;
        if (mVar != null) {
            y7(mVar.f145435a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "do not has envelopSourceMac");
            y7(null);
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.f146548f2 = wcPayKeyboard;
        wcPayKeyboard.setActionText(getString(com.tencent.mm.R.string.gli));
        this.f146548f2.setActionBtnColor(com.tencent.mm.R.drawable.f481067jw);
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.f146548f2;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.setHeightListener(this);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f146548f2.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.addRule(12);
        }
        this.f146551h.getEditText().setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$$a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView5, int i19, android.view.KeyEvent keyEvent) {
                java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI11 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                luckyMoneyPrepareUI11.getClass();
                if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                    luckyMoneyPrepareUI11.f146548f2.i();
                }
                return true;
            }
        });
        this.f146549g.getEditText().setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$$b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView5, int i19, android.view.KeyEvent keyEvent) {
                java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI11 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                luckyMoneyPrepareUI11.getClass();
                if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                    luckyMoneyPrepareUI11.f146548f2.i();
                }
                return true;
            }
        });
        this.f146551h.getEditText().setTag("mAmountEt");
        this.f146549g.getEditText().setTag("mNumEt");
        u7(this.f146551h.getEditText(), this.f146548f2, false, true, false);
        u7(this.f146549g.getEditText(), this.f146548f2, false, true, true);
        final android.widget.EditText editText = (android.widget.EditText) this.f146551h.findViewById(com.tencent.mm.R.id.j1d);
        final android.widget.EditText editText2 = (android.widget.EditText) this.f146549g.findViewById(com.tencent.mm.R.id.j1d);
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.addTextChangedListener(new android.text.TextWatcher(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.27
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                java.lang.String obj = editable.toString();
                java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+\\.?\\d{0,2})").matcher(obj);
                if (matcher.find()) {
                    java.lang.String group = matcher.group();
                    if (!group.equals(obj) && !obj.startsWith(".")) {
                        editable.replace(0, editable.length(), group);
                        return;
                    }
                }
                boolean startsWith = obj.startsWith(".");
                android.widget.EditText editText3 = editText;
                if (startsWith) {
                    editable.insert(0, "0");
                } else if (com.tencent.mm.wallet_core.ui.formview.WalletFormView.f(obj, editText3)) {
                    return;
                }
                java.lang.String obj2 = editable.toString();
                int indexOf = obj2.indexOf(".");
                int length = obj2.length();
                if (indexOf >= 0 && length - indexOf > 3) {
                    editable.delete(indexOf + 3, length);
                } else if (indexOf > 6) {
                    editable.delete(6, indexOf);
                } else if (indexOf == -1 && length > 6) {
                    editable.delete(6, length);
                }
                editText3.setContentDescription(editable.toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
            }
        });
        editText2.addTextChangedListener(new android.text.TextWatcher(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.28
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                editText2.setContentDescription(editable.toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
            }
        });
        com.tencent.mm.wallet_core.ui.r1.v0(editText2);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
        int intExtra2 = getIntent().getIntExtra("key_chatroom_num", 0);
        if (intExtra2 > 0) {
            this.f146549g.setGroupChatNumber(intExtra2);
        }
    }

    public final boolean j7() {
        return this.f146588y0 && getIntent().getIntExtra("key_chatroom_num", 0) > 0;
    }

    public boolean k7() {
        r45.wv3 wv3Var;
        r45.xv3 xv3Var;
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146585x1;
        return (mVar == null || (wv3Var = mVar.f145435a) == null || (xv3Var = wv3Var.f389501g) == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390477d)) ? false : true;
    }

    public void l7(int i17, android.content.Intent intent) {
        java.lang.String str;
        if (i17 == -1) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(intent.getBooleanExtra("from_wallet_mix", false));
                str = stringExtra;
                bool = valueOf;
            } else {
                str = "";
            }
            if (bool.booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "from walletmix, ignore paycheck");
            } else {
                a7(str);
            }
        }
        finish();
    }

    public void m7(int i17, android.content.Intent intent) {
        java.lang.String str;
        boolean z17;
        r45.wv3 wv3Var;
        r45.wv3 wv3Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onResultPay] call back pay result");
        com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146585x1;
        if (mVar != null && (wv3Var2 = mVar.f145435a) != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(22296, wv3Var2.f389500f);
        }
        if (intent != null && intent.hasExtra("key_realname_guide_helper")) {
            this.E1 = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
        }
        if (i17 != -1) {
            d7(i17, intent);
            return;
        }
        java.lang.String str2 = "";
        if (intent != null) {
            str = intent.getStringExtra("key_trans_id");
            z17 = intent.getBooleanExtra("from_wallet_mix", false);
        } else {
            str = "";
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "from walletmix, ignore paycheck");
        } else {
            a7(str);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(g7()), 5);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        if ((!this.f146588y0 || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) && this.f146557l1 != 3) {
            T6();
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.j5h);
            android.view.View view = this.f146577u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onResultPay", "(ILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onResultPay", "(ILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.luckymoney.model.m5.B(findViewById, null);
            this.f146563o.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.45
                @Override // com.tencent.mm.wallet_core.ui.z1
                public void onRealClick(android.view.View view2) {
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.String str3 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                    g0Var2.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyPrepareUI.g7()), 6);
                    com.tencent.mm.plugin.luckymoney.model.m5.o(luckyMoneyPrepareUI, 2, luckyMoneyPrepareUI.Y, luckyMoneyPrepareUI.f146584x0, true);
                    luckyMoneyPrepareUI.f146577u.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.45.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass45 anonymousClass45 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass45.this;
                            android.view.View view3 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146577u;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$45$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$45$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.U6();
                        }
                    }, 100L);
                }
            });
            ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j59)).setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.46
                @Override // com.tencent.mm.wallet_core.ui.z1
                public void onRealClick(android.view.View view2) {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                    android.view.View view3 = luckyMoneyPrepareUI.f146577u;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$46", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$46", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    luckyMoneyPrepareUI.U6();
                }
            });
            d7(i17, intent);
            return;
        }
        db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f146589y1, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
            finish();
            return;
        }
        java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
        if (hb3.o.Ni().Ui().a(str3)) {
            g0Var.d(31063, str3, 1, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onResultPay] need insert a local msg for luckymoney");
            if (!com.tencent.mm.plugin.luckymoney.model.m5.C(this.f146589y1, stringExtra, 1)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[onResultPay] LuckyMoneyUtil.sendLocalMsg fail!");
                hb3.o.Ni().Ui().b(str3);
                g0Var.d(31063, str3, 1, 2);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[onResultPay] do not need insert a local msg for luckymoney, new xml has insert");
        }
        d7(i17, intent);
        dc3.e eVar = new dc3.e();
        eVar.field_send_id = str3;
        if (!hb3.o.Ni().Ri().get(eVar, new java.lang.String[0])) {
            eVar.field_open_count = 0;
            hb3.o.Ni().Ri().insert(eVar);
        }
        if (j7()) {
            hb3.o.f280130r = this.Y;
        }
        if (this.f146544b2) {
            if (this.f146545c2) {
                g0Var.d(22237, 4);
            } else if (this.Y != 1) {
                g0Var.d(22237, 3);
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct();
        this.R1 = redEnvSendWithEmoticonDataStruct;
        redEnvSendWithEmoticonDataStruct.f59937d = this.T1;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.P1;
        java.lang.String md52 = iEmojiInfo == null ? "" : iEmojiInfo.getMd5();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct2 = this.R1;
        redEnvSendWithEmoticonDataStruct2.f59938e = redEnvSendWithEmoticonDataStruct2.b("emoticonMd5", md52, true);
        this.R1.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "Report RedEnvSendWithEmoticonDataStruct, Scene: %d, md5: %s", java.lang.Integer.valueOf(this.T1), md52);
        if (this.f146547e2) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_quick_send_packet_origin_materialid");
            com.tencent.mm.plugin.luckymoney.model.m mVar2 = this.f146585x1;
            if (mVar2 != null && (wv3Var = mVar2.f145435a) != null && !com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389500f)) {
                str2 = this.f146585x1.f145435a.f389500f;
            }
            java.lang.String str4 = str2;
            if (this.Z == 11) {
                g0Var.d(27809, 5, stringExtra2, str4, getIntent().getStringExtra("key_username"), this.Y1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            } else {
                g0Var.d(27809, 5, stringExtra2, str4, getIntent().getStringExtra("key_username"), this.Y1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS");
            setResult(-1, intent2);
        }
        finish();
    }

    public final void n7(int i17, double d17, boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "has showing error tips, ignore repeat report");
            return;
        }
        int i18 = ((int) d17) * 100;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "report scene = " + i17 + " amount =" + i18);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22775, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public final java.lang.String o7() {
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.plugin.luckymoney.ui.vo) zVar.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).U6()) {
            androidx.appcompat.app.AppCompatActivity activity2 = getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            return ((com.tencent.mm.plugin.luckymoney.ui.vo) zVar.a(activity2).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).S6();
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getContext();
        kotlin.jvm.internal.o.g(activity3, "activity");
        return ((com.tencent.mm.plugin.luckymoney.ui.vo) zVar.a(activity3).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).V6() ? com.tencent.mm.plugin.luckymoney.model.m5.g(h7()) : "";
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1111) {
            switch (i17) {
                case 1:
                    if (intent != null && intent.hasExtra("key_realname_guide_helper")) {
                        this.E1 = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
                    }
                    if (i18 != -1) {
                        if (!com.tencent.mm.wallet_core.model.b2.b(intent)) {
                            if (!com.tencent.mm.wallet_core.model.b2.c(intent)) {
                                d7(i18, intent);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            finish();
                            return;
                        }
                    } else {
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(g7()), 5);
                        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
                        if ((!this.f146588y0 || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) && this.f146557l1 != 3) {
                            T6();
                            android.view.View findViewById = findViewById(com.tencent.mm.R.id.j5h);
                            android.view.View view = this.f146577u;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            com.tencent.mm.plugin.luckymoney.model.m5.B(findViewById, null);
                            this.f146563o.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.43
                                @Override // com.tencent.mm.wallet_core.ui.z1
                                public void onRealClick(android.view.View view2) {
                                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                    java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                                    g0Var2.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyPrepareUI.g7()), 6);
                                    com.tencent.mm.plugin.luckymoney.model.m5.o(luckyMoneyPrepareUI, 2, luckyMoneyPrepareUI.Y, luckyMoneyPrepareUI.f146584x0, true);
                                    luckyMoneyPrepareUI.f146577u.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.43.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass43 anonymousClass43 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass43.this;
                                            android.view.View view3 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.f146577u;
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                            arrayList2.add(8);
                                            java.util.Collections.reverse(arrayList2);
                                            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$43$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$43$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.U6();
                                        }
                                    }, 100L);
                                }
                            });
                            ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j59)).setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.44
                                @Override // com.tencent.mm.wallet_core.ui.z1
                                public void onRealClick(android.view.View view2) {
                                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                                    android.view.View view3 = luckyMoneyPrepareUI.f146577u;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList2.add(8);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$44", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$44", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    luckyMoneyPrepareUI.U6();
                                }
                            });
                            d7(i18, intent);
                        } else {
                            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f146589y1, "msg", null);
                            if (d17 == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
                                finish();
                                return;
                            }
                            java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onActivityResult] pay result");
                            if (hb3.o.Ni().Ui().a(str)) {
                                g0Var.d(31063, str, 1, 1);
                                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onActivityResult] need insert a local msg for luckymoney");
                                if (!com.tencent.mm.plugin.luckymoney.model.m5.C(this.f146589y1, stringExtra, 1)) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[onActivityResult] LuckyMoneyUtil.sendLocalMsg fail!");
                                    hb3.o.Ni().Ui().b(str);
                                    g0Var.d(31063, str, 1, 2);
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[onActivityResult] do not need insert a local msg for luckymoney, new xml has insert");
                            }
                            d7(i18, intent);
                            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct();
                            this.R1 = redEnvSendWithEmoticonDataStruct;
                            redEnvSendWithEmoticonDataStruct.f59937d = this.T1;
                            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.P1;
                            java.lang.String md52 = iEmojiInfo == null ? "" : iEmojiInfo.getMd5();
                            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct2 = this.R1;
                            redEnvSendWithEmoticonDataStruct2.f59938e = redEnvSendWithEmoticonDataStruct2.b("emoticonMd5", md52, true);
                            this.R1.k();
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "Report RedEnvSendWithEmoticonDataStruct, Scene: %d, md5: %s", java.lang.Integer.valueOf(this.T1), md52);
                            finish();
                        }
                        a7(intent != null ? intent.getStringExtra("key_trans_id") : "");
                        break;
                    }
                case 2:
                    if (i18 == -1 && intent != null) {
                        java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(g7()), 7, stringExtra2);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.n6(stringExtra2.replaceAll(",", "|"), this.f146566p0, 1, "v1.0"));
                            break;
                        } else {
                            finish();
                            break;
                        }
                    } else if (i18 == 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
                        intent2.putExtra("key_username", getIntent().getStringExtra("key_username"));
                        intent2.putExtra("key_type", 1);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                    break;
                case 3:
                    if (intent != null && intent.hasExtra("result_data")) {
                        android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                        if (bundleExtra == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
                            break;
                        } else {
                            int P = com.tencent.mm.sdk.platformtools.t8.P(bundleExtra.getString("payState", "2"), 0);
                            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + P + ";STATE_H5_PAY_SUCC=0");
                            if (P == 0) {
                                int i19 = this.Y;
                                hb3.o.f280130r = i19;
                                if (this.f146544b2) {
                                    if (this.f146545c2) {
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22237, 4);
                                    } else if (i19 != 1) {
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22237, 3);
                                    }
                                }
                                finish();
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    l7(i18, intent);
                    break;
                case 5:
                    if (i18 != -1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onActivityResult] REQUEST_CODE_PICK_ENVELOPE: cancel");
                        androidx.appcompat.app.AppCompatActivity activity = getContext();
                        kotlin.jvm.internal.o.g(activity, "activity");
                        ((com.tencent.mm.plugin.luckymoney.ui.to) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.to.class)).O6(false);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16822, 2);
                        break;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[onActivityResult] REQUEST_CODE_PICK_ENVELOPE: ok");
                        this.f146581w.removeAllViews();
                        androidx.appcompat.app.AppCompatActivity activity2 = getContext();
                        kotlin.jvm.internal.o.g(activity2, "activity");
                        ((com.tencent.mm.plugin.luckymoney.ui.to) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.luckymoney.ui.to.class)).O6(true);
                        break;
                    }
                case 6:
                    if (i18 == -1) {
                        java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                        this.K1 = stringExtra3;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "select user: %s", stringExtra3);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.K1)) {
                            ng5.a.a(this.R, this.K1);
                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                            java.lang.String str2 = this.K1;
                            java.lang.String str3 = this.J1;
                            ((sg3.a) v0Var).getClass();
                            java.lang.String h17 = com.tencent.mm.wallet_core.ui.r1.h(c01.a2.f(str2, str3), 8);
                            android.widget.TextView textView = this.S;
                            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                            androidx.appcompat.app.AppCompatActivity context = getContext();
                            float textSize = this.S.getTextSize();
                            ((ke0.e) xVar).getClass();
                            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, h17, textSize));
                            this.R.setVisibility(0);
                            this.S.setVisibility(0);
                        }
                    }
                    D4(true, 0);
                    break;
            }
        } else if (i18 == -1) {
            java.lang.String stringExtra4 = intent != null ? intent.getStringExtra("gif_md5") : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "md5 == null go emoji capture failed!");
            } else {
                com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(stringExtra4);
                this.P1 = wi6;
                v7(wi6);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "go emoji capture failed!");
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0182, code lost:
    
        if (r14 != 2) goto L35;
     */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.X;
        ((java.util.LinkedList) c6Var.f146778a).clear();
        c6Var.f146781d = null;
        this.A1.e();
        android.app.Dialog dialog = this.f146571r;
        if (dialog != null && dialog.isShowing()) {
            this.f146571r.dismiss();
        }
        if (this.L1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "commentfooter release");
            this.L1.h();
            this.L1.getClass();
            this.L1.a();
        }
        this.B2.dead();
        this.f146568p2.dead();
        this.f146570q2.dead();
        if (this.f146546d2) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_CUSTOM_ENVELOPE_ENTRANCE_INT_SYNC;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(((java.lang.Integer) c17.m(u3Var, 0)).intValue() + 1));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25925, 7, java.lang.Integer.valueOf(this.f146554i2), java.lang.Float.valueOf(this.f146552h2), this.f146551h.getEditText().getText(), this.f146549g.getEditText().getText());
        this.E.n();
        this.E.i(this.F);
        this.F = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.G);
        this.G = null;
        gb3.p.f270043b = "";
        gb3.p.f270044c = 0;
        gb3.p.f270045d = 0;
        gb3.p.f270046e = 0;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.view.View view = this.f146565p;
            if (view != null && view.isShown()) {
                android.view.View view2 = this.f146565p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f146548f2;
            if (wcPayKeyboard != null && wcPayKeyboard.isShown()) {
                this.f146548f2.i();
                return true;
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!this.H || this.D == null) {
            return;
        }
        this.E.n();
        android.view.View view = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.H = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.H = false;
        addSceneEndListener(1970);
        android.widget.Button button = this.f146561n;
        if (300 > 0) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(button);
            java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(this);
            ((ku5.t0) ku5.t0.f312615d).l(new m05.h(weakReference2, weakReference, 0, "ViewId_Do_Luckymoney_Btn"), 300L, "wcpay_report_check_btn_no_response");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0293  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r19, int r20, java.lang.String r21, final com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        removeSceneEndListener(1970);
    }

    public final int p7() {
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean U6 = ((com.tencent.mm.plugin.luckymoney.ui.vo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).U6();
        androidx.appcompat.app.AppCompatActivity activity2 = getContext();
        kotlin.jvm.internal.o.g(activity2, "activity");
        boolean V6 = ((com.tencent.mm.plugin.luckymoney.ui.vo) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).V6();
        androidx.appcompat.app.AppCompatActivity activity3 = getContext();
        kotlin.jvm.internal.o.g(activity3, "activity");
        boolean W6 = ((com.tencent.mm.plugin.luckymoney.ui.vo) pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).W6();
        if (U6) {
            return 5;
        }
        if (!V6) {
            return W6 ? 2 : 1;
        }
        r45.lm5 h76 = h7();
        if (h76 != null && h76.f379625g) {
            return h76.f379622d == 1 ? 3 : 4;
        }
        return 1;
    }

    public final java.lang.String q7() {
        r45.lm5 h76;
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        return (!((com.tencent.mm.plugin.luckymoney.ui.vo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).V6() || (h76 = h7()) == null || com.tencent.mm.sdk.platformtools.t8.K0(h76.f379623e)) ? "" : h76.f379623e;
    }

    public final java.lang.String r7() {
        com.tencent.mm.plugin.luckymoney.model.m mVar;
        r45.wv3 wv3Var;
        return (!k7() || (mVar = this.f146585x1) == null || (wv3Var = mVar.f145435a) == null) ? "" : wv3Var.f389500f;
    }

    public void s7(boolean z17) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra)) {
            this.f146567p1 = hb3.o.Ni().Di().a();
            if (z17) {
                this.f146585x1 = hb3.o.Ni().Di().c();
            }
        } else if (this.f146557l1 == 3) {
            this.f146567p1 = hb3.o.Ni().Bi().a();
            if (z17) {
                this.f146585x1 = hb3.o.Ni().Bi().c();
            }
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                com.tencent.mm.plugin.luckymoney.model.h4 Ai = hb3.o.Ni().Ai();
                if (Ai.f145311a == null) {
                    Ai.a();
                }
                this.f146567p1 = Ai.f145311a;
            } else {
                this.f146567p1 = hb3.o.Ni().wi().a();
                if (z17) {
                    this.f146585x1 = hb3.o.Ni().wi().c();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[resetConfig] Config: %s", this.f146567p1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.LuckyMoneyPrepareUIAccessibilityConfig.class);
        hashSet.add(com.tencent.mm.plugin.luckymoney.ui.vo.class);
        hashSet.add(com.tencent.mm.plugin.luckymoney.ui.to.class);
    }

    public void t7(double d17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f146559m.setText(com.tencent.mm.wallet_core.ui.r1.m(d17));
            return;
        }
        this.f146559m.setText(str + com.tencent.mm.wallet_core.ui.r1.o(d17));
    }

    public void u7(final android.widget.EditText editText, final com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, boolean z17, boolean z18, final boolean z19) {
        if (wcPayKeyboard == null || editText == null) {
            return;
        }
        final android.view.View.OnFocusChangeListener onFocusChangeListener = z18 ? editText.getOnFocusChangeListener() : null;
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.47
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(final android.view.View view, boolean z27) {
                if (z27) {
                    boolean equals = "mAmountEt".equals(view.getTag());
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                    if (equals) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25925, 4, java.lang.Integer.valueOf(luckyMoneyPrepareUI.f146554i2), java.lang.Float.valueOf(luckyMoneyPrepareUI.f146552h2), luckyMoneyPrepareUI.f146551h.getEditText().getText(), luckyMoneyPrepareUI.f146549g.getEditText().getText());
                    } else if ("mNumEt".equals(view.getTag())) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25925, 5, java.lang.Integer.valueOf(luckyMoneyPrepareUI.f146554i2), java.lang.Float.valueOf(luckyMoneyPrepareUI.f146552h2), luckyMoneyPrepareUI.f146551h.getEditText().getText(), luckyMoneyPrepareUI.f146549g.getEditText().getText());
                    }
                    ((android.view.inputmethod.InputMethodManager) luckyMoneyPrepareUI.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.47.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass47 anonymousClass47 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass47.this;
                            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = wcPayKeyboard;
                            android.animation.ObjectAnimator objectAnimator = wcPayKeyboard2.F;
                            if (objectAnimator != null) {
                                objectAnimator.end();
                            }
                            android.animation.ObjectAnimator objectAnimator2 = wcPayKeyboard2.G;
                            if (objectAnimator2 != null) {
                                objectAnimator2.end();
                            }
                            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard3 = wcPayKeyboard;
                            boolean isShown = wcPayKeyboard3.isShown();
                            android.view.View view2 = view;
                            if (!isShown && view2.isShown()) {
                                wcPayKeyboard3.setIsOnlySupportInteger(z19);
                                wcPayKeyboard3.u();
                            }
                            wcPayKeyboard3.setInputEditText(editText);
                            ((android.view.inputmethod.InputMethodManager) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        }
                    }, 300L);
                } else {
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.47.2
                        @Override // java.lang.Runnable
                        public void run() {
                            wcPayKeyboard.i();
                        }
                    }, 200L);
                }
                android.view.View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z27);
                }
            }
        });
        if (fp.h.c(28) && z17) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_target28_pay_keyboard_focus, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "ifAutoReqFocusTarget28() swt:%s", java.lang.Integer.valueOf(Ni));
            if (Ni == 1) {
                editText.post(new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.48
                    @Override // java.lang.Runnable
                    public void run() {
                        android.widget.EditText editText2 = editText;
                        if (editText2.findFocus() == null) {
                            editText2.requestFocus();
                        }
                    }
                });
            }
        }
        editText.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.49
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                boolean z27 = z19;
                com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = wcPayKeyboard;
                wcPayKeyboard2.setIsOnlySupportInteger(z27);
                wcPayKeyboard2.u();
                yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public final void v7(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f146553i.g(iEmojiInfo);
        int i17 = this.U1;
        if (i17 == 0 || i17 == 2) {
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            if (n22.m.j(iEmojiInfo)) {
                this.T1 = 2;
            } else {
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                if (n22.m.p(iEmojiInfo)) {
                    this.T1 = 4;
                } else {
                    this.T1 = 3;
                }
            }
        } else if (i17 == 1) {
            this.T1 = 2;
        }
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        this.Q1 = redEnvSendWithEmoticonClickStruct;
        redEnvSendWithEmoticonClickStruct.f59936d = 1L;
        redEnvSendWithEmoticonClickStruct.k();
    }

    public void w7(java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) this.f146581w.findViewById(com.tencent.mm.R.id.f485818j71);
        if (textView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        textView.setText(str);
    }

    public void x7() {
        double d17;
        double d18;
        double d19;
        int i17;
        if (this.f146567p1 == null) {
            this.f146551h.setHint(getString(com.tencent.mm.R.string.glv));
            this.f146551h.setCurrencyUnitPrefix(getString(com.tencent.mm.R.string.kyi));
            return;
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.r(this.f146557l1)) {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.f146567p1;
            d17 = c1Var.A;
            d18 = c1Var.f145200y;
            d19 = c1Var.f145201z;
            i17 = c1Var.f145199x;
        } else {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.f146567p1;
            d17 = c1Var2.f145183e;
            d18 = c1Var2.f145186h;
            d19 = c1Var2.f145188m;
            i17 = c1Var2.f145182d;
        }
        this.f146549g.setMaxNum(i17);
        if (this.Y == 1) {
            this.f146551h.setMaxAmount(d17);
        } else {
            this.f146551h.setMaxAmount(d18);
        }
        this.f146551h.setMinAmount(d19);
        java.lang.String str = this.f146567p1.f145191p;
        if (str == null || str.length() <= 0) {
            this.f146551h.setHint(getString(com.tencent.mm.R.string.glv));
            this.f146551h.setCurrencyUnitPrefix(getString(com.tencent.mm.R.string.kyi));
            return;
        }
        this.f146551h.setHint(str + getString(com.tencent.mm.R.string.glu));
        this.f146551h.setCurrencyUnitPrefix(str);
    }

    public final void y7(final r45.wv3 wv3Var) {
        r45.xv3 xv3Var;
        r45.wv3 wv3Var2;
        r45.wv3 wv3Var3;
        if (isFinishing() || isDestroyed()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "[updateEnvelopeLayout] isFinishing() || isDestroyed()");
            return;
        }
        if (this.f146585x1 == null || wv3Var == null || this.f146557l1 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[updateEnvelopeLayout] hide entrance");
            this.f146591z.setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[updateEnvelopeLayout] show entrance");
            this.f146591z.setVisibility(0);
            if (!this.Z1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18890, 1, java.lang.Integer.valueOf(p7()), this.Y1, r7(), o7(), q7());
                this.Z1 = true;
            }
            boolean z17 = wv3Var.A == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.B);
            this.f146560m2 = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[updateEnvelopeLayout] mSourceDisableStatus: %s", java.lang.Boolean.valueOf(z17));
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.luckymoney.ui.vo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.vo.class)).X6();
            com.tencent.mm.plugin.luckymoney.model.m mVar = this.f146585x1;
            if (mVar.f145437c && !com.tencent.mm.sdk.platformtools.t8.K0(mVar.f145438d)) {
                java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.O1((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_ILLEGAL_STRING_SYNC, ""), ",");
                for (java.lang.String str : O1) {
                    com.tencent.mm.plugin.luckymoney.model.m mVar2 = this.f146585x1;
                    if (mVar2 != null && (wv3Var3 = mVar2.f145435a) != null && str.equals(wv3Var3.f389500f)) {
                        return;
                    }
                }
                com.tencent.mm.plugin.luckymoney.model.m mVar3 = this.f146585x1;
                if (mVar3 != null && (wv3Var2 = mVar3.f145435a) != null) {
                    O1.add(wv3Var2.f389500f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "show alert illegal: %s", this.f146585x1.f145435a.f389500f);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_ILLEGAL_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(O1, ","));
                }
                if (this.f146585x1 != null) {
                    db5.e1.y(getContext(), this.f146585x1.f145438d, "", getString(com.tencent.mm.R.string.l_e), new android.content.DialogInterface.OnClickListener(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.21
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        }
                    });
                }
            }
        }
        if (wv3Var != null && wv3Var.A == 1) {
            this.f146591z.setEnabled(false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.B)) {
                this.A.setVisibility(8);
                this.I.setVisibility(8);
            } else {
                this.A.setText(wv3Var.B);
                this.A.setVisibility(0);
                this.I.setVisibility(0);
            }
            this.C.setImageBitmap(null);
            android.view.View view = this.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "updateEnvelopeLayout", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "updateEnvelopeLayout", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146542J.setVisibility(8);
            this.K.setVisibility(8);
            this.A.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            com.tencent.mm.ui.bk.t0(this.A.getPaint());
        } else if (wv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389498d)) {
            z7(false);
            this.f146591z.setEnabled(true);
            this.C.setImageBitmap(null);
            this.I.setVisibility(8);
            this.f146542J.setVisibility(8);
            this.K.setVisibility(0);
            this.K.setIconColor(i65.a.d(getContext(), com.tencent.mm.R.color.FG_2));
            this.f146562n2.setPadding(i65.a.b(getContext(), 12), i65.a.b(getContext(), 6), i65.a.b(getContext(), 2), i65.a.b(getContext(), 6));
            this.A.setVisibility(8);
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "updateEnvelopeLayout", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "updateEnvelopeLayout", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1a);
            if (textView != null) {
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        } else {
            z7(true);
            this.f146591z.setEnabled(true);
            this.I.setVisibility(0);
            gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
            android.widget.ImageView imageView = this.C;
            com.tencent.mm.plugin.luckymoney.model.w2 w2Var = (com.tencent.mm.plugin.luckymoney.model.w2) jVar;
            w2Var.getClass();
            if (imageView != null) {
                w2Var.Ni(wv3Var, 3, new com.tencent.mm.plugin.luckymoney.model.i1(w2Var, imageView), 0, 0);
            }
            this.f146542J.setVisibility(8);
            this.K.setVisibility(0);
            this.K.setIconColor(android.graphics.Color.parseColor("#806B48"));
            this.f146562n2.setPadding(i65.a.b(getContext(), 12), i65.a.b(getContext(), 6), i65.a.b(getContext(), 8), i65.a.b(getContext(), 6));
            android.view.View view3 = this.D;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "renderEnvelopDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "renderEnvelopDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.n();
            if (!com.tencent.mm.plugin.luckymoney.model.m5.z() && (xv3Var = wv3Var.f389501g) != null && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390492v)) {
                android.view.View view4 = this.D;
                float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
                if (view4 != null) {
                    view4.setOutlineProvider(new zl5.a(true, true, b17));
                }
                if (view4 != null) {
                    view4.setClipToOutline(true);
                }
                if (this.F == null) {
                    ym5.w1 w1Var = new ym5.w1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.22
                        @Override // ym5.w1
                        public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
                        }

                        @Override // ym5.w1
                        public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
                            android.view.View view5 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this.D;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$22", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$22", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }

                        @Override // ym5.w1
                        public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
                        }

                        @Override // ym5.w1
                        public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
                        }
                    };
                    this.F = w1Var;
                    this.E.a(w1Var);
                    this.E.setRepeatCount(1);
                    this.E.setScaleMode(3);
                    this.E.b(new ym5.v1(this) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.23
                        @Override // ym5.v1
                        public void onFlush() {
                        }
                    });
                }
                if (this.G == null) {
                    this.G = com.tencent.mm.wallet_core.model.z1.f214041a.b();
                }
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 3, this.G, new com.tencent.mm.wallet_core.model.y1() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.24
                    @Override // com.tencent.mm.wallet_core.model.y1
                    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        boolean z18 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
                        r45.wv3 wv3Var4 = wv3Var;
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
                        if (z18) {
                            java.lang.String str2 = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "downloadComplete success，file path: %s", str2);
                            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.h(3, str2, luckyMoneyPrepareUI.E);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, wv3Var4.f389501g.f390492v, 1, 4, java.lang.Long.valueOf(currentTimeMillis2));
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
                        android.view.View view5 = luckyMoneyPrepareUI.D;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$24", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$24", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, wv3Var4.f389501g.f390492v, 2, 4, java.lang.Long.valueOf(currentTimeMillis2));
                    }
                });
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j1a);
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setTextColor(android.graphics.Color.parseColor("#FFF6E5"));
                textView2.setShadowLayer(12.0f, 0.0f, 0.0f, android.graphics.Color.parseColor("#FA755411"));
                com.tencent.mm.ui.bk.s0(textView2.getPaint());
            }
            this.A.setText(wv3Var.f389498d);
            this.A.setVisibility(0);
            this.A.setTextColor(android.graphics.Color.parseColor("#FFF6E5"));
            this.A.setShadowLayer(12.0f, 0.0f, 0.0f, android.graphics.Color.parseColor("#FA755411"));
            com.tencent.mm.ui.bk.s0(this.A.getPaint());
        }
        if (wv3Var == null || wv3Var.f389506o != 2) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(0);
        }
    }

    public final void z7(boolean z17) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f146591z.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.D.getLayoutParams();
        int b17 = i65.a.b(getContext(), 56);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "[updateSkinSelectedCellSize] using new skin");
            int b18 = (int) ((com.tencent.mm.ui.bl.b(getContext()).x - i65.a.b(getContext(), 32)) * 0.2194f);
            layoutParams.height = b18;
            layoutParams2.height = b18;
        } else {
            layoutParams.height = b17;
            layoutParams2.height = b17;
        }
        this.f146591z.setLayoutParams(layoutParams);
        this.D.setLayoutParams(layoutParams2);
    }
}
