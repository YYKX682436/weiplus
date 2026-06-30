package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes9.dex */
public class LuckyMoneyNewYearReceiveUIV2 extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final /* synthetic */ int Y1 = 0;
    public boolean A1;
    public android.widget.ImageView B;
    public boolean B1;
    public android.widget.ImageView C;
    public tl.h C1;
    public android.view.View D;
    public java.lang.String D1;
    public android.widget.ImageView E;
    public java.lang.String E1;
    public android.view.View F;
    public java.lang.String F1;
    public com.tencent.mm.emoji.view.BaseEmojiView G;
    public long G1;
    public boolean H1;
    public java.lang.String I;
    public long I1;
    public java.lang.String J1;
    public com.tencent.mm.storage.f9 K;
    public int K1;
    public int L;
    public int L1;
    public boolean M;
    public int M1;
    public long N;
    public boolean N1;
    public android.view.View O1;
    public com.tencent.mm.api.IEmojiInfo P;
    public boolean P1;
    public java.lang.String Q;
    public boolean Q1;
    public android.view.View R;
    public com.tencent.mm.plugin.luckymoney.model.l6 R1;
    public com.tencent.mm.view.MMPAGView S;
    public final com.tencent.mm.sdk.event.IListener S1;
    public ym5.w1 T;
    public final com.tencent.mm.feature.emoji.api.q5 T1;
    public ym5.w1 U;
    public final tl.e U1;
    public com.tencent.mm.plugin.luckymoney.model.s4 V;
    public final tl.f V1;
    public android.view.View W;
    public final com.tencent.mm.modelcdntran.q0 W1;
    public android.view.View X;
    public final android.view.View.OnClickListener X1;
    public android.widget.TextView Y;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView Z;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f146341g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f146342h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f146343i;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f146344l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView f146345m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f146346n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f146347o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f146348p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.RelativeLayout f146349p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.FrameLayout f146350p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f146351q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f146352r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f146353s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f146354t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f146355u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f146356v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f146357w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f146358x;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ImageView f146359x0;

    /* renamed from: x1, reason: collision with root package name */
    public fc3.e f146360x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f146361y;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ImageView f146362y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.util.List f146363y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f146364z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f146365z1;
    public com.tencent.mm.ui.widget.dialog.u3 A = null;
    public int H = 0;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f146340J = "";

    public LuckyMoneyNewYearReceiveUIV2() {
        new com.tencent.mm.sdk.platformtools.n3();
        this.M = false;
        this.N = 0L;
        this.V = new com.tencent.mm.plugin.luckymoney.model.s4();
        this.f146363y1 = null;
        this.f146365z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.D1 = "";
        this.E1 = "";
        this.F1 = "";
        this.H1 = true;
        this.J1 = "";
        this.K1 = 2;
        this.L1 = 2;
        this.M1 = 1;
        this.N1 = false;
        this.P1 = false;
        this.Q1 = false;
        this.S1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.1
            {
                this.__eventId = -261846412;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent) {
                com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent2 = wxPayLuckMoneyNewYearDownloadPAGResultEvent;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(wxPayLuckMoneyNewYearDownloadPAGResultEvent2.f54996g.f8341a);
                am.x20 x20Var = wxPayLuckMoneyNewYearDownloadPAGResultEvent2.f54996g;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "downloadPAGResultIListener downloadret：%s unfoldret:%s", valueOf, java.lang.Boolean.valueOf(x20Var.f8342b));
                if (x20Var.f8341a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "downloadPAGResult succ");
                } else {
                    boolean z17 = x20Var.f8342b;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.this;
                    if (z17 && com.tencent.mm.plugin.luckymoney.model.e5.a()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "zipPAGResult succ");
                        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
                        luckyMoneyNewYearReceiveUIV2.a7(1);
                        luckyMoneyNewYearReceiveUIV2.S1.dead();
                    } else {
                        int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
                        luckyMoneyNewYearReceiveUIV2.a7(0);
                    }
                }
                return true;
            }
        };
        this.T1 = new com.tencent.mm.plugin.luckymoney.ui.kg(this);
        this.U1 = new com.tencent.mm.plugin.luckymoney.ui.mg(this);
        this.V1 = new com.tencent.mm.plugin.luckymoney.ui.og(this);
        this.W1 = new com.tencent.mm.modelcdntran.q0() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$a
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
            
                if (r2 == 10) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            @Override // com.tencent.mm.modelcdntran.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(com.tencent.mm.modelcdntran.n1 r9) {
                /*
                    r8 = this;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 r0 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.this
                    java.lang.String r1 = r0.D1
                    dn.m r2 = r9.f71106d
                    if (r2 == 0) goto L12
                    java.lang.String r3 = r2.field_fullpath
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 != 0) goto L12
                    java.lang.String r1 = r2.field_fullpath
                L12:
                    com.tencent.mm.modelcdntran.m1 r2 = com.tencent.mm.modelcdntran.m1.f71077f
                    java.lang.String r3 = "MicroMsg.LuckyMoneyNewYearReceiveUIV2"
                    com.tencent.mm.modelcdntran.m1 r4 = r9.f71103a
                    if (r4 == r2) goto L2c
                    java.lang.String r2 = r0.D1
                    int r5 = r9.f71105c
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r4, r5}
                    java.lang.String r5 = "voice download fullPath: %s, fileName:%s %s %s"
                    com.tencent.mars.xlog.Log.i(r3, r5, r2)
                L2c:
                    int r2 = r4.ordinal()
                    if (r2 == 0) goto L7f
                    r4 = 1
                    if (r2 == r4) goto L43
                    r9 = 2
                    if (r2 == r9) goto L87
                    r9 = 6
                    if (r2 == r9) goto L7f
                    r9 = 7
                    if (r2 == r9) goto L7f
                    r9 = 10
                    if (r2 == r9) goto L7f
                    goto L87
                L43:
                    dn.h r9 = r9.f71108f
                    r2 = 4
                    if (r9 == 0) goto L74
                    long r4 = com.tencent.mm.vfs.w6.k(r1)
                    long r6 = r0.G1
                    int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r9 >= 0) goto L6b
                    java.lang.Long r9 = java.lang.Long.valueOf(r4)
                    long r4 = r0.G1
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    java.lang.Object[] r9 = new java.lang.Object[]{r9, r4}
                    java.lang.String r4 = "OnDownloadCallbackSuccess, but realLength:%s < voiceFileLength:%s, need to delete"
                    com.tencent.mars.xlog.Log.e(r3, r4, r9)
                    r0.M1 = r2
                    com.tencent.mm.vfs.w6.h(r1)
                    goto L87
                L6b:
                    java.lang.String r9 = "OnDownloadCallbackSuccess"
                    com.tencent.mars.xlog.Log.i(r3, r9)
                    r9 = 3
                    r0.M1 = r9
                    goto L87
                L74:
                    java.lang.String r9 = "OnDownloadCallbackSuccess, but getSceneResult is null"
                    com.tencent.mars.xlog.Log.e(r3, r9)
                    r0.M1 = r2
                    r0.Z6(r1)
                    goto L87
                L7f:
                    java.lang.String r9 = "cdn download error"
                    com.tencent.mars.xlog.Log.i(r3, r9)
                    r0.Z6(r1)
                L87:
                    android.view.View r9 = r0.f146342h
                    if (r9 == 0) goto L93
                    com.tencent.mm.plugin.luckymoney.ui.pg r1 = new com.tencent.mm.plugin.luckymoney.ui.pg
                    r1.<init>(r0)
                    r9.post(r1)
                L93:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$a.a(com.tencent.mm.modelcdntran.n1):void");
            }
        };
        this.X1 = new com.tencent.mm.plugin.luckymoney.ui.qg(this);
    }

    public static void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        luckyMoneyNewYearReceiveUIV2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voicePlayer startPlay");
        luckyMoneyNewYearReceiveUIV2.B1 = true;
        luckyMoneyNewYearReceiveUIV2.N1 = false;
        luckyMoneyNewYearReceiveUIV2.A1 = true;
        android.widget.ImageView imageView = luckyMoneyNewYearReceiveUIV2.f146362y0;
        java.lang.String str = com.tencent.mm.plugin.luckymoney.model.e5.f145262a;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.drawable.amt);
            android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable();
            if (animationDrawable != null) {
                animationDrawable.start();
            }
        }
        ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
        w21.d0 d0Var = new w21.d0(luckyMoneyNewYearReceiveUIV2, 1.0f);
        luckyMoneyNewYearReceiveUIV2.C1 = d0Var;
        d0Var.f442313e = luckyMoneyNewYearReceiveUIV2.U1;
        d0Var.f442314f = luckyMoneyNewYearReceiveUIV2.V1;
        d0Var.j(luckyMoneyNewYearReceiveUIV2.D1, true);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        luckyMoneyNewYearReceiveUIV2.I1 = java.lang.System.currentTimeMillis();
        luckyMoneyNewYearReceiveUIV2.d7(14);
        java.util.List list = luckyMoneyNewYearReceiveUIV2.f146363y1;
        if (list != null && list.size() > 0) {
            luckyMoneyNewYearReceiveUIV2.f146360x1.f(false);
            fc3.e eVar = luckyMoneyNewYearReceiveUIV2.f146360x1;
            java.lang.String str2 = luckyMoneyNewYearReceiveUIV2.f146341g;
            eVar.getClass();
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            eVar.f261035l = str2;
            fc3.e eVar2 = luckyMoneyNewYearReceiveUIV2.f146360x1;
            java.lang.String str3 = luckyMoneyNewYearReceiveUIV2.J1;
            eVar2.getClass();
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            eVar2.f261036m = str3;
            fc3.e eVar3 = luckyMoneyNewYearReceiveUIV2.f146360x1;
            eVar3.f261037n = luckyMoneyNewYearReceiveUIV2.K1;
            eVar3.f261038o = luckyMoneyNewYearReceiveUIV2.L1;
            eVar3.c(luckyMoneyNewYearReceiveUIV2.f146363y1);
        }
        if (luckyMoneyNewYearReceiveUIV2.getStreamVolume(3) <= 0) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.luckymoney.ui.rg rgVar = new com.tencent.mm.plugin.luckymoney.ui.rg(luckyMoneyNewYearReceiveUIV2);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(rgVar, 2000L, false);
        }
    }

    public static void W6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        luckyMoneyNewYearReceiveUIV2.f146358x.setVisibility(8);
        com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(luckyMoneyNewYearReceiveUIV2.f146340J);
        luckyMoneyNewYearReceiveUIV2.P = wi6;
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "showExpression() mEmojiInfo == null ");
            return;
        }
        if (com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) wi6).N0()) <= 0 && !luckyMoneyNewYearReceiveUIV2.P.k() && !luckyMoneyNewYearReceiveUIV2.P.I1()) {
            luckyMoneyNewYearReceiveUIV2.G.setVisibility(8);
            luckyMoneyNewYearReceiveUIV2.f146356v.setVisibility(0);
            luckyMoneyNewYearReceiveUIV2.f146357w.setImageResource(com.tencent.mm.R.raw.lucky_money_newyear_creat_loading);
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(luckyMoneyNewYearReceiveUIV2.T1);
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Zi(luckyMoneyNewYearReceiveUIV2.P);
            return;
        }
        luckyMoneyNewYearReceiveUIV2.G.setVisibility(0);
        com.tencent.mm.feature.emoji.api.j6 j6Var = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = luckyMoneyNewYearReceiveUIV2.P;
        ((com.tencent.mm.feature.emoji.h2) j6Var).getClass();
        if (n22.m.j(iEmojiInfo)) {
            luckyMoneyNewYearReceiveUIV2.G.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else if (luckyMoneyNewYearReceiveUIV2.P.k()) {
            luckyMoneyNewYearReceiveUIV2.G.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        } else {
            luckyMoneyNewYearReceiveUIV2.G.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
        luckyMoneyNewYearReceiveUIV2.G.setEmojiInfo(luckyMoneyNewYearReceiveUIV2.P);
    }

    public final void X6(int i17) {
        java.lang.StringBuilder sb6;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() localReceiveStatus:%s newStatus:%s", java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            this.K1 = 2;
        } else if (i17 == 1) {
            this.K1 = 4;
        } else if (i17 == 2) {
            this.K1 = 3;
        }
        com.tencent.mm.storage.f9 f9Var = this.K;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() mEmojiInfo == null");
            return;
        }
        int i18 = this.L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        if (i18 == 2) {
            return;
        }
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(f9Var.j());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int indexOf = sb7.indexOf("<localreceivestatus>");
            if (indexOf <= 0 || indexOf >= sb7.length()) {
                int indexOf2 = sb7.indexOf("<emoji>");
                if (indexOf2 <= 0 || indexOf2 >= sb7.length()) {
                    int indexOf3 = sb7.indexOf("<wcpayinfo>");
                    sb8.append("<emoji><localreceivestatus>");
                    sb8.append(i17);
                    sb8.append("</localreceivestatus></emoji>");
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(sb7.substring(0, indexOf3));
                    java.lang.String trim = sb7.substring(indexOf3).trim();
                    sb9.append((java.lang.CharSequence) sb8);
                    sb9.append(trim);
                    sb6 = sb9;
                } else {
                    sb8.append("<localreceivestatus>");
                    sb8.append(i17);
                    sb8.append("</localreceivestatus>");
                    int i19 = indexOf2 + 7;
                    sb6 = new java.lang.StringBuilder(sb7.substring(0, i19));
                    java.lang.String trim2 = sb7.substring(i19).trim();
                    sb6.append((java.lang.CharSequence) sb8);
                    sb6.append(trim2);
                }
            } else {
                sb6 = new java.lang.StringBuilder(sb7.substring(0, indexOf + 20));
                java.lang.String substring = sb7.substring(indexOf + 21);
                sb6.append(i17);
                sb6.append(substring);
            }
            this.K.d1(sb6.toString());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.K.getMsgId(), this.K);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() success msgXml:%s", sb6);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() Exception:%s", e17.getMessage());
        }
    }

    public final void Y6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.P1 = true;
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.f6(i17, i18, str, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.l(), getIntent().getStringExtra("key_username"), "v1.0", str3), false);
    }

    public final void Z6(java.lang.String str) {
        long k17 = com.tencent.mm.vfs.w6.k(str);
        if (k17 >= this.G1) {
            this.M1 = 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "cdn download finish, file is exists");
        } else {
            this.M1 = 4;
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "cdn download finish, and realLength:%s < voiceFileLength:%s, need to delete", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(this.G1));
            com.tencent.mm.vfs.w6.h(str);
        }
    }

    public final void a7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "exchangeExpressionState() state:%s", java.lang.Integer.valueOf(i17));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.gg(this, i17));
    }

    public final void b7() {
        android.view.View view = this.R;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "hideAllPAGAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "hideAllPAGAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.S.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.model.e5.o(this.S, this.T, this.U);
    }

    public final void c7(boolean z17) {
        if (!z17) {
            this.f146361y.setVisibility(8);
            this.f146361y.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.bg(this));
            this.f146364z.setText(getString(com.tencent.mm.R.string.gnf));
        } else {
            this.f146361y.setVisibility(8);
            ((android.widget.RelativeLayout.LayoutParams) this.f146361y.getLayoutParams()).addRule(3, com.tencent.mm.R.id.j4h);
            this.f146364z.setText(getString(com.tencent.mm.R.string.gng));
            this.f146361y.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.ag(this));
        }
    }

    public final void d7(int i17) {
        e7(i17, 0L);
    }

    public final void e7(int i17, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct luckyMoneyNewYearReportStruct = new com.tencent.mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct();
        luckyMoneyNewYearReportStruct.f58702h = luckyMoneyNewYearReportStruct.b("sessionid", this.J1, true);
        luckyMoneyNewYearReportStruct.f58703i = luckyMoneyNewYearReportStruct.b("flistid", this.f146341g, true);
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = this.R1;
        if (l6Var != null) {
            luckyMoneyNewYearReportStruct.f58701g = (int) l6Var.f145425r;
        }
        luckyMoneyNewYearReportStruct.f58699e = this.L1;
        luckyMoneyNewYearReportStruct.f58704j = this.K1;
        luckyMoneyNewYearReportStruct.f58698d = i17;
        luckyMoneyNewYearReportStruct.f58700f = j17;
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f146363y1)) {
            luckyMoneyNewYearReportStruct.f58705k = 0;
        } else {
            luckyMoneyNewYearReportStruct.f58705k = this.f146363y1.size();
        }
        luckyMoneyNewYearReportStruct.k();
    }

    public final void f7(boolean z17) {
        if (this.C1 == null || !this.A1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "stopVoicePlay but no need");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "stopVoicePlay");
        if (z17) {
            com.tencent.mm.plugin.luckymoney.model.e5.n(this.f146362y0);
        }
        ((w21.d0) this.C1).stop();
        this.A1 = false;
        long j17 = this.I1;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        this.I1 = 0L;
        e7(16, currentTimeMillis);
        java.util.List list = this.f146363y1;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f146360x1.a();
    }

    public final void g7(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.V.f145606f) || !this.H1) {
            android.view.View view = this.W;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "show StatusLayout:%s", this.V.f145606f);
        if (z17) {
            com.tencent.mm.plugin.luckymoney.model.e5.j(this.W, 0);
        } else {
            android.view.View view2 = this.W;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.Y.setText(getString(com.tencent.mm.R.string.gm8, this.V.f145606f));
        java.lang.String Ni = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ni();
        java.lang.String Ri = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ri();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout:publishIconId:%s  showIconId:%s", Ni, Ri);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).oj(this.Z, Ri, bi4.d.FILLED, bi4.b.DEFAULT);
        this.W.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.jg(this, Ni));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.buv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setActionbarColor(-839716110);
        this.f146342h = findViewById(com.tencent.mm.R.id.j3z);
        if (com.tencent.mm.ui.bk.C()) {
            this.f146342h.setBackgroundResource(com.tencent.mm.R.color.BW_0_Alpha_0_8);
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8));
        } else {
            this.f146342h.setBackgroundColor(-839716110);
            setActionbarColor(-839716110);
            setNavigationbarColor(-839716110);
        }
        this.f146343i = findViewById(com.tencent.mm.R.id.j4i);
        this.f146345m = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView) findViewById(com.tencent.mm.R.id.j4e);
        this.f146346n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485757iy4);
        this.f146347o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4p);
        this.f146348p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j4f);
        this.f146352r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j4n);
        this.f146353s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4l);
        this.f146354t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j4m);
        this.f146351q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4o);
        this.f146355u = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j4k);
        this.E = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j3p);
        this.F = findViewById(com.tencent.mm.R.id.j3m);
        this.G = (com.tencent.mm.emoji.view.BaseEmojiView) findViewById(com.tencent.mm.R.id.j3f);
        this.f146358x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485801j42);
        this.f146356v = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j3r);
        this.f146357w = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.f485684im5);
        this.f146361y = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iyp);
        this.f146364z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyq);
        this.W = findViewById(com.tencent.mm.R.id.j4r);
        this.X = findViewById(com.tencent.mm.R.id.j4s);
        this.Y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4y);
        this.Z = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.j4w);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.j4t);
        this.O1 = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.3f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.R = findViewById(com.tencent.mm.R.id.j3w);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.j3y);
        this.S = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        com.tencent.mm.plugin.luckymoney.ui.dg dgVar = new com.tencent.mm.plugin.luckymoney.ui.dg(this);
        this.T = dgVar;
        this.U = new com.tencent.mm.plugin.luckymoney.ui.eg(this);
        this.S.a(dgVar);
        this.S.setRepeatCount(1);
        this.S.setScaleMode(3);
        this.f146358x.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.sg(this));
        this.f146349p0 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f485809j54);
        this.f146359x0 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.r3o);
        this.f146362y0 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.r3n);
        this.f146344l1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.r3q);
        this.f146350p1 = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.r3k);
        this.f146360x1 = new fc3.e(this, this.f146350p1);
        if (this.f146365z1) {
            this.f146349p0.setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = this.f146349p0.getLayoutParams();
            if (this.N > 5000) {
                this.f146359x0.setImageResource(com.tencent.mm.R.drawable.a5g);
                layoutParams.width = i65.a.b(this, 182);
            } else {
                this.f146359x0.setImageResource(com.tencent.mm.R.drawable.a5h);
                layoutParams.width = i65.a.b(this, 120);
            }
            this.f146349p0.setLayoutParams(layoutParams);
            this.f146344l1.setText((this.N / 1000) + "\"");
            android.widget.RelativeLayout relativeLayout = this.f146349p0;
            android.view.View.OnClickListener onClickListener = this.X1;
            relativeLayout.setOnClickListener(onClickListener);
            this.f146343i.setOnClickListener(onClickListener);
            this.f146350p1.setVisibility(0);
            this.f146360x1.b();
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485805j46);
        this.B = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.tg(this));
        this.D = findViewById(com.tencent.mm.R.id.j3d);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485804j45);
        this.C = imageView2;
        imageView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.sf(this));
        setContentViewVisibility(8);
        this.A = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.tf(this));
        if (this.f146365z1) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) findViewById(com.tencent.mm.R.id.j4g).getLayoutParams();
            layoutParams2.topMargin = i65.a.b(getContext(), com.tencent.mm.plugin.appbrand.jsapi.u4.CTRL_INDEX);
            findViewById(com.tencent.mm.R.id.j4g).setLayoutParams(layoutParams2);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) findViewById(com.tencent.mm.R.id.j4h).getLayoutParams();
            layoutParams3.topMargin = i65.a.b(getContext(), -16);
            findViewById(com.tencent.mm.R.id.j4h).setLayoutParams(layoutParams3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "setBackgroundContainerSize");
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(getContext());
        int i17 = b17.x;
        int i18 = b17.y;
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        int c17 = com.tencent.mm.ui.bl.c(getContext());
        int b18 = i65.a.b(getContext(), com.tencent.mapsdk.internal.km.f50100e);
        int b19 = i65.a.b(getContext(), 560);
        android.view.ViewGroup.LayoutParams layoutParams4 = this.f146343i.getLayoutParams();
        float f17 = j65.f.f297943g;
        float b27 = i65.a.b(getContext(), 48);
        if (f17 > 1.0f) {
            b27 /= f17;
        }
        int b28 = i65.a.b(getContext(), 48) + i65.a.b(getContext(), 40);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "screenWidth：%s containerRealWidth:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b18));
        float f18 = i17;
        if (f18 <= b18 + b27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "need adjust width");
            layoutParams4.width = (int) (f18 - b27);
        }
        int i19 = (i18 - h17) - c17;
        int i27 = b19 + b28;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "carsonhe screenHeighh - s - n：%s  statusHeight:%s containerRealHeight + buttonHeight:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i27));
        if (i19 < i27) {
            this.Q1 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "need adjust height");
            layoutParams4.height = i19 - b28;
            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) findViewById(com.tencent.mm.R.id.j4g).getLayoutParams();
            layoutParams5.topMargin = i65.a.b(getContext(), 256);
            findViewById(com.tencent.mm.R.id.j4g).setLayoutParams(layoutParams5);
            android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) this.f146347o.getLayoutParams();
            layoutParams6.bottomMargin = 0;
            this.f146347o.setLayoutParams(layoutParams6);
            android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) this.f146355u.getLayoutParams();
            layoutParams7.bottomMargin = i65.a.b(getContext(), 6);
            this.f146355u.setLayoutParams(layoutParams7);
            android.widget.LinearLayout.LayoutParams layoutParams8 = (android.widget.LinearLayout.LayoutParams) this.D.getLayoutParams();
            layoutParams8.topMargin = i65.a.b(getContext(), 24);
            this.D.setLayoutParams(layoutParams8);
        }
        this.f146343i.setLayoutParams(layoutParams4);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        this.I = getIntent().getStringExtra("key_username");
        this.f146340J = getIntent().getStringExtra("key_emoji_md5");
        this.K = pt0.f0.Li(this.I, getIntent().getLongExtra("key_msgid", 0L));
        this.L = getIntent().getIntExtra("key_msg_newyear_localreceivestatus", 0);
        this.J1 = java.util.UUID.randomUUID().toString();
        this.F1 = getIntent().getStringExtra("key_voice_url");
        this.E1 = getIntent().getStringExtra("key_voice_asekey");
        this.G1 = getIntent().getLongExtra("key_voice_length", 0L);
        this.N = getIntent().getLongExtra("key_voice_play_time", 0L);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.E1)) {
            this.f146365z1 = true;
            java.lang.String str = this.E1;
            java.lang.String str2 = com.tencent.mm.plugin.luckymoney.model.e5.f145262a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.plugin.luckymoney.model.e5.f145262a + "voice/");
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            this.D1 = sb7;
            if (com.tencent.mm.vfs.w6.j(sb7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onCreate, cdn already download");
                this.M1 = 3;
            } else if (com.tencent.mm.plugin.luckymoney.model.e5.c(this.F1, this.E1, this.W1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onCreate, wait cdn download");
                this.N1 = true;
                this.M1 = 2;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onCreate, cdn download fail");
                this.M1 = 4;
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_voice_keyword");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            fc3.a aVar = fc3.e.f261020q;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.o.d(stringExtra);
                java.util.Iterator it = r26.n0.f0(stringExtra, new java.lang.String[]{"|"}, false, 0, 6, null).iterator();
                while (it.hasNext()) {
                    java.util.List f07 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"-"}, false, 0, 6, null);
                    if (f07.size() >= 2) {
                        arrayList.add(new z21.c((java.lang.String) f07.get(0), (java.lang.String) f07.get(1)));
                    }
                }
            }
            this.f146363y1 = arrayList;
        }
        this.Q = getIntent().getStringExtra("key_native_url");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "emojiMd5:" + this.f146340J + " cdnAesKey:" + this.E1 + " playTime:" + this.N + " keywordStr:" + stringExtra);
        java.lang.String str3 = this.Q;
        if (str3 == null) {
            str3 = "";
        }
        android.net.Uri parse = android.net.Uri.parse(str3);
        try {
            this.f146341g = parse.getQueryParameter("sendid");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onCreate() Exception:%s", e17.getMessage());
        }
        initView();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146341g)) {
            finish();
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "sendid null & finish");
        } else {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.l6(1, com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("channelid"), 1), this.f146341g, this.Q, 1, "v1.0", ""), false);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
            if (u3Var != null) {
                u3Var.show();
            }
        }
        d7(1);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
        if (u3Var != null && u3Var.isShowing()) {
            this.A.dismiss();
        }
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(null);
        b7();
        f7(false);
        fc3.e eVar = this.f146360x1;
        if (eVar != null) {
            eVar.f(false);
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f146357w;
        if (mMAnimateView != null) {
            mMAnimateView.pause();
            this.f146357w.y();
        }
        this.S1.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.M) {
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var;
        int i27;
        int i28;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.l6)) {
            if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.f6)) {
                return false;
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
            if (u3Var != null && u3Var.isShowing()) {
                this.A.dismiss();
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != 416) {
                    db5.e1.G(this, android.text.TextUtils.isEmpty(str) ? getString(com.tencent.mm.R.string.l0g) : str, null, false, new com.tencent.mm.plugin.luckymoney.ui.zf(this));
                    return true;
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.A;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.A.dismiss();
                }
                this.M = true;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUChangeBankcardUI");
                bundle.putString("realname_verify_process_jump_plugin", "wallet_payu");
                return com.tencent.mm.plugin.luckymoney.model.m5.d(this, i18, str, m1Var, bundle, true, null, null, 1004);
            }
            com.tencent.mm.plugin.luckymoney.model.f6 f6Var = (com.tencent.mm.plugin.luckymoney.model.f6) m1Var;
            this.H1 = f6Var.f145295z;
            if (com.tencent.mm.plugin.wallet_core.utils.l0.d(f6Var.f145290u)) {
                setContentViewVisibility(4);
                new com.tencent.mm.plugin.wallet_core.utils.l0(this).b(f6Var.f145290u, new com.tencent.mm.plugin.luckymoney.ui.xf(this, f6Var));
                return true;
            }
            setContentViewVisibility(0);
            this.P1 = false;
            this.H = f6Var.f145286q;
            this.V = f6Var.f145293x;
            this.f146345m.c(getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a59), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a57));
            this.f146345m.invalidate();
            this.f146347o.setVisibility(0);
            int i29 = this.H;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (i29 == 1) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f146340J)) {
                    a7(2);
                } else if (com.tencent.mm.plugin.luckymoney.model.e5.a()) {
                    a7(1);
                } else {
                    a7(3);
                }
            } else if (com.tencent.mm.plugin.luckymoney.model.e5.a()) {
                a7(1);
            } else {
                a7(3);
            }
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var = f6Var.f145280h;
            this.f146353s.setText(e1Var.f145236f);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.luckymoney.ui.uf ufVar = new com.tencent.mm.plugin.luckymoney.ui.uf(this, f6Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(ufVar, 500L, false);
            if (e1Var.f145235e == 4 && !android.text.TextUtils.isEmpty(f6Var.f145280h.f145236f)) {
                this.f146354t.setVisibility(8);
            }
            c7(false);
            setContentViewVisibility(0);
            com.tencent.mm.plugin.luckymoney.model.e5.g(this.f146343i, null);
            X6(2);
            d7(20);
            if (!this.B1 && this.M1 == 3) {
                ku5.u0 u0Var2 = ku5.t0.f312615d;
                com.tencent.mm.plugin.luckymoney.ui.yf yfVar = new com.tencent.mm.plugin.luckymoney.ui.yf(this);
                ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                t0Var2.getClass();
                t0Var2.z(yfVar, 1000L, false);
            }
            return true;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.A;
            if (u3Var3 != null && u3Var3.isShowing()) {
                this.A.dismiss();
            }
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var2 = (com.tencent.mm.plugin.luckymoney.model.l6) m1Var;
        this.R1 = l6Var2;
        this.H = l6Var2.K;
        this.H1 = l6Var2.R;
        if (l6Var2.f145431x == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "is Sender hb!");
            this.L1 = 1;
            if (l6Var2.f145426s != 4) {
                this.f146355u.setVisibility(8);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = this.A;
            if (u3Var4 != null && u3Var4.isShowing()) {
                this.A.dismiss();
            }
            if (l6Var2.f145426s != 5) {
                java.lang.String o17 = com.tencent.mm.wallet_core.ui.r1.o(l6Var2.f145425r / 100.0d);
                this.f146345m.setContentDescription(o17);
                this.f146345m.setFinalText(o17);
                this.f146345m.a();
                com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146347o, l6Var2.f145430w);
                this.f146352r.setVisibility(8);
                this.f146355u.setVisibility(0);
                if (l6Var2.f145426s == 4) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f146348p, this.I, null);
                    X6(2);
                } else {
                    this.f146348p.setVisibility(8);
                }
                this.f146351q.setText(l6Var2.f145428u);
                this.f146351q.setTextSize(1, 16.0f);
                if (!this.Q1) {
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f146355u.getLayoutParams();
                    layoutParams.bottomMargin = i65.a.b(this, 20);
                    this.f146355u.setLayoutParams(layoutParams);
                }
                this.f146355u.invalidate();
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.j4g);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j4g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setText(l6Var2.f145428u);
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setVisibility(0);
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setTextSize(24.0f);
                c7(true);
                X6(1);
            }
            setContentViewVisibility(0);
            com.tencent.mm.plugin.luckymoney.model.e5.g(this.f146343i, null);
            this.B.setVisibility(8);
            this.C.setVisibility(0);
            i19 = 5;
            l6Var = l6Var2;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "is receiver hb!");
            if (!android.text.TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f146348p, getIntent().getStringExtra("key_username"), null);
            } else if (!android.text.TextUtils.isEmpty(l6Var2.f145424q)) {
                com.tencent.mm.plugin.luckymoney.model.m5.b(this.f146348p, l6Var2.f145424q, l6Var2.f145433z);
            }
            this.f146351q.setTextSize(1, 16.0f);
            com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146351q, l6Var2.f145422o + getString(com.tencent.mm.R.string.f492432gm5));
            if (!this.Q1) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f146355u.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.b(this, 20);
                this.f146355u.setLayoutParams(layoutParams2);
            }
            this.f146355u.invalidate();
            this.f146355u.setVisibility(8);
            this.f146352r.setVisibility(8);
            if (l6Var2.f145427t != 0 || (i27 = l6Var2.f145426s) == 4 || i27 == 5 || i27 == 1) {
                i19 = 5;
                l6Var = l6Var2;
                com.tencent.mm.ui.widget.dialog.u3 u3Var5 = this.A;
                if (u3Var5 != null && u3Var5.isShowing()) {
                    this.A.dismiss();
                }
                if (l6Var.f145426s != 5) {
                    java.lang.String o18 = com.tencent.mm.wallet_core.ui.r1.o(l6Var.f145425r / 100.0d);
                    this.f146345m.setContentDescription(o18);
                    this.f146345m.setFinalText(o18);
                    this.f146345m.a();
                    com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146347o, l6Var.f145430w);
                    X6(2);
                    c7(false);
                    android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.j4g);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f146349p0.setVisibility(8);
                    this.f146361y.setVisibility(8);
                    android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.j4g);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setText(l6Var.f145428u);
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setVisibility(0);
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setTextSize(24.0f);
                    X6(1);
                }
                setContentViewVisibility(0);
                com.tencent.mm.plugin.luckymoney.model.e5.g(this.f146343i, null);
            } else {
                if ("0".equals(l6Var2.C)) {
                    com.tencent.mm.plugin.luckymoney.model.r4 r4Var = this.f145972d;
                    java.lang.String str2 = l6Var2.D;
                    java.lang.String str3 = l6Var2.E;
                    java.lang.String str4 = l6Var2.F;
                    java.lang.String str5 = l6Var2.G;
                    com.tencent.mm.plugin.luckymoney.ui.vf vfVar = new com.tencent.mm.plugin.luckymoney.ui.vf(this, l6Var2);
                    zs4.q qVar = new zs4.q();
                    qVar.f475313e = new java.lang.ref.WeakReference(this);
                    qVar.f475314f = new java.lang.ref.WeakReference(r4Var);
                    java.lang.ref.WeakReference weakReference = qVar.f475313e;
                    if (weakReference == null || weakReference.get() == null) {
                        i28 = 5;
                        l6Var = l6Var2;
                    } else {
                        qVar.f475312d = vfVar;
                        java.lang.String str6 = str2 + str3;
                        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
                        b4Var.f180146d = new zs4.g(qVar, 1005, str4, this);
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        android.text.SpannableString i37 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, str6);
                        android.text.SpannableString spannableString = new android.text.SpannableString(i37);
                        spannableString.setSpan(b4Var, i37.length() - str3.length(), i37.length(), 33);
                        android.widget.TextView textView = new android.widget.TextView(this);
                        textView.setText(spannableString);
                        textView.setTextSize(0, i65.a.h(this, com.tencent.mm.R.dimen.f479853h2));
                        textView.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.a0c));
                        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        com.tencent.mm.wallet_core.ui.r1.r0(0, 1, com.tencent.mm.sdk.platformtools.t8.i1(), 1005);
                        i28 = 5;
                        l6Var = l6Var2;
                        qVar.f475315g = db5.e1.r(this, "", textView, str5, getString(com.tencent.mm.R.string.f490347sg), new zs4.h(qVar, 1005), new zs4.i(qVar, 1005));
                    }
                } else {
                    i28 = 5;
                    l6Var = l6Var2;
                    Y6(l6Var.f145418h, l6Var.f145419i, l6Var.f145420m, l6Var.f145421n, l6Var.P);
                }
                i19 = i28;
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f146352r.getLayoutParams();
            layoutParams3.topMargin = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a5_);
            this.f146352r.setLayoutParams(layoutParams3);
            this.f146352r.invalidate();
            this.f146353s.setTextSize(1, 12.0f);
            this.B.setVisibility(8);
            this.C.setVisibility(0);
        }
        if (!this.P1) {
            this.V = l6Var.B;
            if (!(l6Var.f145431x == 1)) {
                g7(false);
            }
            int i38 = l6Var.f145426s;
            boolean z18 = (i38 == i19 || i38 == 1) ? false : true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "receiveScene.hbStatus is " + l6Var.f145426s + ", isValidStatus is " + z18);
            int i39 = this.H;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (((i39 == 1) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f146340J)) && z18) {
                a7(2);
            } else if (com.tencent.mm.plugin.luckymoney.model.e5.a()) {
                a7(1);
            } else {
                a7(3);
            }
            this.f146345m.c(getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a59), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a57));
            this.f146345m.invalidate();
            this.f146347o.setVisibility(0);
            if (!this.B1 && this.M1 == 3 && this.f146349p0.getVisibility() == 0) {
                ku5.u0 u0Var3 = ku5.t0.f312615d;
                com.tencent.mm.plugin.luckymoney.ui.wf wfVar = new com.tencent.mm.plugin.luckymoney.ui.wf(this);
                ku5.t0 t0Var3 = (ku5.t0) u0Var3;
                t0Var3.getClass();
                t0Var3.z(wfVar, 1000L, false);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onStop");
        f7(true);
    }
}
