package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class EnvelopeAppBarLayout extends com.google.android.material.appbar.AppBarLayout implements androidx.lifecycle.x, xn5.a0 {

    /* renamed from: f2, reason: collision with root package name */
    public static final /* synthetic */ int f145773f2 = 0;
    public com.tencent.mm.view.MediaBannerIndicator A;
    public int A1;
    public android.widget.TextView B;
    public com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior B1;
    public com.tencent.mm.ui.widget.RoundCornerImageView C;
    public final java.util.ArrayList C1;
    public android.widget.TextView D;
    public com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager D1;
    public android.widget.TextView E;
    public r45.nm5 E1;
    public android.widget.TextView F;
    public java.lang.String F1;
    public android.widget.TextView G;
    public java.lang.String G1;
    public android.widget.TextView H;
    public java.lang.String H1;
    public android.widget.TextView I;
    public java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f145774J;
    public java.lang.String J1;
    public android.view.View K;
    public int K1;
    public android.widget.ImageView L;
    public boolean L1;
    public android.widget.ImageView M;
    public boolean M1;
    public android.widget.ImageView N;
    public boolean N1;
    public boolean O1;
    public android.view.ViewGroup P;
    public android.animation.ValueAnimator P1;
    public android.view.ViewGroup Q;
    public android.animation.ObjectAnimator Q1;
    public android.view.ViewGroup R;
    public android.animation.ValueAnimator R1;
    public android.widget.ProgressBar S;
    public android.animation.AnimatorSet S1;
    public boolean T;
    public com.google.android.material.appbar.g T1;
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI U;
    public boolean U1;
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI V;
    public boolean V1;
    public android.animation.ObjectAnimator W;
    public int W1;
    public int X1;
    public boolean Y1;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f145775a2;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f145776b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f145777c2;

    /* renamed from: d2, reason: collision with root package name */
    public final android.view.View.OnClickListener f145778d2;

    /* renamed from: e2, reason: collision with root package name */
    public final int f145779e2;

    /* renamed from: l1, reason: collision with root package name */
    public int f145780l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.animation.ObjectAnimator f145781p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f145782p1;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f145783r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f145784s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f145785t;

    /* renamed from: u, reason: collision with root package name */
    public ym5.w1 f145786u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.y0 f145787v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager f145788w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout f145789x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f145790x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int f145791x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f145792y;

    /* renamed from: y0, reason: collision with root package name */
    public int f145793y0;

    /* renamed from: y1, reason: collision with root package name */
    public final int f145794y1;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f145795z;

    /* renamed from: z1, reason: collision with root package name */
    public final int f145796z1;

    public EnvelopeAppBarLayout(android.content.Context context) {
        super(context, null);
        this.T = false;
        this.f145790x0 = false;
        this.f145791x1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120);
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120);
        this.f145794y1 = b17;
        this.f145796z1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn) - b17;
        this.A1 = 0;
        this.C1 = new java.util.ArrayList();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.U1 = false;
        this.V1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f145775a2 = false;
        this.f145778d2 = new com.tencent.mm.plugin.luckymoney.story.k(this);
        this.f145779e2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.a4n);
        h();
    }

    public static void e(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        envelopeAppBarLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "story view normal");
        if (envelopeAppBarLayout.O1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "has normal");
            return;
        }
        envelopeAppBarLayout.O1 = true;
        if (envelopeAppBarLayout.E1 == null) {
            return;
        }
        if (envelopeAppBarLayout.i()) {
            ((com.tencent.mm.plugin.luckymoney.ui.j7) envelopeAppBarLayout.U.component(com.tencent.mm.plugin.luckymoney.ui.j7.class)).O6(false);
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = envelopeAppBarLayout.V;
            if (luckyMoneyDetailUI != null) {
                ((com.tencent.mm.plugin.luckymoney.ui.o3) luckyMoneyDetailUI.component(com.tencent.mm.plugin.luckymoney.ui.o3.class)).O6(false);
            }
        }
        envelopeAppBarLayout.m();
        envelopeAppBarLayout.P.setClickable(false);
        if (envelopeAppBarLayout.E1.f381504m != 0) {
            envelopeAppBarLayout.P.setVisibility(0);
        }
        envelopeAppBarLayout.Q.setVisibility(0);
        if (envelopeAppBarLayout.K1 == 2) {
            if (envelopeAppBarLayout.f145777c2) {
                if (envelopeAppBarLayout.f145788w.h1(envelopeAppBarLayout.A1)) {
                    envelopeAppBarLayout.f145788w.i1(2);
                } else {
                    envelopeAppBarLayout.f145788w.i1(1);
                }
            }
            envelopeAppBarLayout.N1 = false;
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = envelopeAppBarLayout.D1;
            envelopeStoryVideoManager.f145805g = false;
            envelopeStoryVideoManager.d(envelopeAppBarLayout.A1);
            if (envelopeAppBarLayout.i()) {
                envelopeAppBarLayout.U.o7(true);
                return;
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI2 = envelopeAppBarLayout.V;
            if (luckyMoneyDetailUI2 != null) {
                luckyMoneyDetailUI2.j7(true);
            }
        }
    }

    private void setCoverFadeAnimation(int i17) {
        android.widget.ImageView imageView = this.f145784s;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", imageView.getAlpha(), 0.0f);
        this.W = ofFloat;
        ofFloat.setDuration(500L);
        long j17 = i17;
        ofFloat.setStartDelay(j17);
        ofFloat.start();
        ofFloat.addListener(new com.tencent.mm.plugin.luckymoney.story.v(this, ofFloat));
        com.tencent.mm.view.MMPAGView mMPAGView = this.f145785t;
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(mMPAGView, "alpha", mMPAGView.getAlpha(), 0.0f);
        this.f145781p0 = ofFloat2;
        ofFloat2.setDuration(500L);
        ofFloat2.setStartDelay(j17);
        ofFloat2.start();
        ofFloat2.addListener(new com.tencent.mm.plugin.luckymoney.story.v(this, ofFloat2));
    }

    public final void f() {
        int i17 = com.tencent.mm.ui.bk.h(getContext()).x;
        if (i17 > 0) {
            this.f145793y0 = i17;
        } else {
            android.graphics.Rect rect = new android.graphics.Rect();
            getWindowVisibleDisplayFrame(rect);
            this.f145793y0 = rect.right - rect.left;
        }
        int i18 = (int) (this.f145793y0 * 1.335f);
        this.f145780l1 = i18;
        this.f145784s.setMinimumHeight(i18);
        this.f145785t.setMinimumHeight(this.f145780l1);
        com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, this.f145780l1);
        layoutParams.f44300a = 3;
        this.f145783r.setLayoutParams(layoutParams);
        this.f145783r.setMinimumHeight(this.f145794y1);
        postDelayed(new com.tencent.mm.plugin.luckymoney.story.b0(this), 50L);
    }

    public final void g() {
        android.animation.ObjectAnimator objectAnimator = this.W;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.W.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f145781p0;
        if (objectAnimator2 == null || !objectAnimator2.isStarted()) {
            return;
        }
        this.f145781p0.cancel();
    }

    public final void h() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bua, this);
        setExpanded(false);
        post(new com.tencent.mm.plugin.luckymoney.story.w(this));
        this.D1 = new com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager();
        this.f145783r = findViewById(com.tencent.mm.R.id.nli);
        this.f145792y = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f485768j03);
        this.f145795z = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j08);
        this.f145784s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nni);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.nnl);
        this.f145785t = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.S = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.nnj);
        this.f145788w = (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager) findViewById(com.tencent.mm.R.id.npf);
        this.A = (com.tencent.mm.view.MediaBannerIndicator) findViewById(com.tencent.mm.R.id.nlj);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nlv);
        this.C = (com.tencent.mm.ui.widget.RoundCornerImageView) findViewById(com.tencent.mm.R.id.now);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.npz);
        this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nou);
        this.F = (android.widget.TextView) findViewById(com.tencent.mm.R.id.npy);
        this.P = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.npm);
        this.Q = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.npn);
        this.G = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485771j06);
        this.H = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485769j04);
        this.f145774J = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f485770j05);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.npl);
        this.L = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485767j02);
        this.M = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nnd);
        this.N = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nne);
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = this.C;
        roundCornerImageView.f211412o = 4;
        roundCornerImageView.f211413p = getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
        this.A.setSelectDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.amw));
        this.A.setUnSelectDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.amx));
        this.A.setIndicatorWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        this.f145788w.setIndicator(this.A);
        this.f145788w.setEnvelopeStoryVideoManager(this.D1);
        com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager horizontalLayoutManager = new com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager(getContext());
        horizontalLayoutManager.f145942v = 1;
        horizontalLayoutManager.setItemPrefetchEnabled(true);
        horizontalLayoutManager.f11881u = 3;
        horizontalLayoutManager.Q(0);
        this.f145788w.setHasFixedSize(true);
        this.f145788w.setItemViewCacheSize(4);
        this.f145788w.setLayoutManager(horizontalLayoutManager);
        com.tencent.mm.plugin.luckymoney.scaledLayout.b bVar = new com.tencent.mm.plugin.luckymoney.scaledLayout.b();
        bVar.f145751g = getContext();
        bVar.f145752h = true;
        this.f145788w.setSnapHelper(bVar);
        post(new com.tencent.mm.plugin.luckymoney.story.s(this));
        this.f145788w.setEnvelopeStoryAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter<>(new in5.s() { // from class: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.25
            @Override // in5.s
            public in5.r getItemConvert(int i17) {
                return new com.tencent.mm.plugin.luckymoney.story.g0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.this);
            }
        }, this.C1, false));
        this.f145788w.setOnInterceptTouchEvent(new com.tencent.mm.plugin.luckymoney.story.t(this, bVar, horizontalLayoutManager));
        this.f145788w.setPageChangeListener(new com.tencent.mm.plugin.luckymoney.story.u(this));
        com.tencent.mm.plugin.luckymoney.story.x xVar = new com.tencent.mm.plugin.luckymoney.story.x(this);
        this.T1 = xVar;
        a(xVar);
    }

    public boolean i() {
        return this.T && this.U != null;
    }

    public void j(boolean z17) {
        in5.s0 s0Var;
        if (this.A1 < 0 || com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.luckymoney.story.g1.f145867h) || (s0Var = (in5.s0) this.f145788w.p0(this.A1)) == null) {
            return;
        }
        boolean h17 = this.f145788w.h1(this.A1);
        com.tencent.mm.plugin.luckymoney.story.h0 h0Var = (com.tencent.mm.plugin.luckymoney.story.h0) s0Var.f293125i;
        if (!h17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19270, 1, this.F1, 0, h0Var.f145875d.f384775e, "", 0, com.tencent.mm.plugin.luckymoney.story.g1.f145867h, 0, gb3.m.f270020a);
            return;
        }
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) this.D1.f145808m).get(java.lang.Integer.valueOf(this.A1));
        if (b1Var == null) {
            return;
        }
        b1Var.f145831k = b1Var.f145833m.getCurrPosSec();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = b1Var.f145832l;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19270, 2, this.F1, atomicInteger, "", h0Var.f145875d.f384775e, java.lang.Integer.valueOf(atomicInteger.get() == 1 ? (int) (b1Var.f145831k - b1Var.f145830j) : atomicInteger.get() > 1 ? (int) ((0 - b1Var.f145830j) + b1Var.f145831k + ((atomicInteger.get() - 1) * 0)) : 0), com.tencent.mm.plugin.luckymoney.story.g1.f145867h, java.lang.Integer.valueOf(b1Var.f145826f ? 1 : 0), gb3.m.f270020a);
    }

    public void k(java.lang.String str, java.lang.String str2, int i17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.G1) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.G1 = str;
        this.H1 = str2;
        this.S.setVisibility(0);
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).nj(this.f145784s, this.G1, this.H1, this.F1, this.f145780l1, this.f145793y0, false, 0, new com.tencent.mm.plugin.luckymoney.story.j(this), i17, 2, 0);
    }

    public void l(java.lang.String str, java.lang.String str2, int i17) {
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_detail_close_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigDetail：%s ", java.lang.Boolean.valueOf(fj6));
        if (fj6 || !com.tencent.mm.sdk.platformtools.t8.K0(this.I1) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f145785t.setVisibility(8);
            return;
        }
        this.I1 = str;
        this.J1 = str2;
        if (this.f145786u == null) {
            com.tencent.mm.plugin.luckymoney.story.o oVar = new com.tencent.mm.plugin.luckymoney.story.o(this);
            this.f145786u = oVar;
            this.f145785t.a(oVar);
            this.f145785t.setRepeatCount(0);
            this.f145785t.setScaleMode(3);
            this.f145785t.b(new com.tencent.mm.plugin.luckymoney.story.p(this));
        }
        this.f145784s.post(new com.tencent.mm.plugin.luckymoney.story.q(this));
        if (this.f145787v == null) {
            this.f145787v = com.tencent.mm.wallet_core.model.z1.f214041a.b();
        }
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.f389499e = i17;
        r45.xv3 xv3Var = new r45.xv3();
        wv3Var.f389501g = xv3Var;
        xv3Var.f390495y = this.I1;
        xv3Var.C = this.J1;
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 2, this.f145787v, new com.tencent.mm.plugin.luckymoney.story.r(this, java.lang.System.currentTimeMillis()));
    }

    public final void m() {
        android.view.ViewGroup viewGroup = this.f145792y;
        android.view.View.OnClickListener onClickListener = this.f145778d2;
        viewGroup.setOnClickListener(onClickListener);
        if (this.N1 || this.K1 != 2) {
            this.f145792y.setBackgroundResource(com.tencent.mm.R.drawable.c9g);
        } else {
            this.f145792y.setBackgroundResource(com.tencent.mm.R.drawable.alv);
        }
        this.f145784s.setOnClickListener(onClickListener);
        this.f145785t.setOnClickListener(onClickListener);
    }

    public void n(r45.nm5 nm5Var, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        int i18;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.G1);
        int i19 = this.f145794y1;
        if (K0) {
            o(0);
            this.f145780l1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 502);
            com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, this.f145780l1);
            layoutParams.f44300a = 3;
            this.f145783r.setMinimumHeight(i19);
            this.f145783r.setLayoutParams(layoutParams);
        } else if (nm5Var == null) {
            o(1);
            f();
            this.G.setText(str2);
            com.tencent.mm.plugin.luckymoney.story.f1.f145854d = str2;
        } else {
            this.E1 = nm5Var;
            this.F1 = str;
            this.f145775a2 = z17;
            this.B.setText(nm5Var.f381501g);
            this.D.setText(this.E1.f381502h);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.E1.f381516y)) {
                this.E.setVisibility(8);
            } else {
                this.E.setText(this.E1.f381516y);
                this.E.setVisibility(0);
                gb3.m.a(24, this.G1);
            }
            this.G.setText(this.E1.f381498d);
            com.tencent.mm.plugin.luckymoney.story.f1.f145854d = this.E1.f381502h;
            r45.jm5 jm5Var = nm5Var.f381509r;
            if ((jm5Var != null ? jm5Var.f377949u : i17) == 2) {
                this.H.setVisibility(0);
                this.F.setVisibility(0);
            } else {
                this.H.setVisibility(8);
                this.F.setVisibility(8);
            }
            r45.nm5 nm5Var2 = this.E1;
            gb3.m.f270026g = nm5Var2.f381504m;
            if (com.tencent.mm.sdk.platformtools.t8.K0(nm5Var2.f381515x)) {
                gb3.m.f270027h = 0;
                gb3.m.f270028i = "";
            } else {
                gb3.m.f270027h = 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[setStoryInfo] action_type：%s", java.lang.Integer.valueOf(this.E1.f381504m));
            r45.nm5 nm5Var3 = this.E1;
            int i27 = nm5Var3.f381504m;
            if (i27 == 1) {
                this.P.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.d0(this));
                this.I.setText(com.tencent.mm.R.string.f490465vt);
            } else if (i27 == 2) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(nm5Var3.f381506o)) {
                    com.tencent.mm.wallet_core.ui.r1.k(this.P, 100);
                    com.tencent.mm.plugin.luckymoney.story.g1.f145872m = 1;
                    this.P.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.a(this));
                    this.I.setText(com.tencent.mm.R.string.gke);
                }
            } else if (i27 == 3) {
                this.P.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.b(this));
                this.I.setText(com.tencent.mm.R.string.gkj);
            } else if (i27 == 4) {
                this.P.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.c(this));
                this.I.setText(com.tencent.mm.R.string.gkh);
            } else if (i27 == 5) {
                this.P.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.d(this));
                this.I.setText(com.tencent.mm.R.string.gkg);
            } else if (i27 == 6) {
                this.P.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.e(this));
                this.I.setText(com.tencent.mm.R.string.gkf);
            } else if (i27 != 7 || nm5Var3.F == null) {
                this.P.setVisibility(8);
                com.tencent.mm.plugin.luckymoney.story.g1.f145872m = 0;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[setStoryInfo] clickInfo is ecs");
                android.view.ViewGroup viewGroup = this.P;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.f(this));
                }
                android.widget.TextView textView = this.I;
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.p2x);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.E1.f381510s)) {
                this.I.setText(this.E1.f381510s);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(nm5Var.f381499e)) {
                i18 = 2;
                this.C.setVisibility(8);
            } else {
                gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
                com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = this.C;
                java.lang.String str3 = nm5Var.f381499e;
                java.lang.String str4 = nm5Var.f381500f;
                int i28 = this.f145779e2;
                i18 = 2;
                ((com.tencent.mm.plugin.luckymoney.model.w2) jVar).mj(roundCornerImageView, str3, str4, str, i28, i28, null);
                this.C.setVisibility(0);
            }
            java.util.ArrayList arrayList = this.C1;
            arrayList.clear();
            java.util.LinkedList linkedList = nm5Var.f381503i;
            if (linkedList == null || linkedList.isEmpty()) {
                o(1);
                f();
            } else {
                com.tencent.mm.plugin.luckymoney.story.g1.f145871l = 1;
                com.tencent.mm.plugin.luckymoney.story.f1.f145855e = i18;
                for (int i29 = 0; i29 < linkedList.size(); i29++) {
                    r45.re6 re6Var = (r45.re6) linkedList.get(i29);
                    com.tencent.mm.plugin.luckymoney.story.h0 h0Var = new com.tencent.mm.plugin.luckymoney.story.h0(this);
                    h0Var.f145875d = re6Var;
                    h0Var.f145879h = i29;
                    int i37 = nm5Var.G;
                    h0Var.f145878g = i37;
                    java.lang.String f17 = com.tencent.mm.plugin.luckymoney.model.d4.f(i37, i29);
                    if (h0Var.f145878g > 0 && com.tencent.mm.vfs.w6.j(f17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[static luckymoney resource] has local video,add path");
                        h0Var.f145880i = f17;
                    }
                    arrayList.add(h0Var);
                    if (re6Var.f384774d == i18) {
                        this.W1++;
                    } else {
                        this.X1++;
                    }
                }
                this.A.setCount(arrayList.size());
                o(i18);
                int i38 = com.tencent.mm.ui.bk.h(getContext()).x;
                if (i38 > 0) {
                    this.f145793y0 = i38;
                } else {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    getWindowVisibleDisplayFrame(rect);
                    this.f145793y0 = rect.right - rect.left;
                }
                float f18 = this.f145793y0;
                int i39 = (int) (1.667f * f18);
                this.f145780l1 = i39;
                int i47 = (int) (f18 * 1.335f);
                this.f145782p1 = i39 - i47;
                this.f145784s.setMinimumHeight(i47);
                this.f145785t.setMinimumHeight(i47);
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams2 = new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, this.f145780l1);
                layoutParams2.f44300a = 3;
                this.f145783r.setLayoutParams(layoutParams2);
                this.f145783r.setMinimumHeight(i19);
                postDelayed(new com.tencent.mm.plugin.luckymoney.story.c0(this), 50L);
                int intValue = this.f145775a2 ? ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC, 0)).intValue() : ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC, 0)).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "show first guide: %s", java.lang.Integer.valueOf(intValue));
                int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_LuckyMoneyEnvelopeFirstGuide_Int, 0);
                if (g17 == 1 || (g17 != i18 && intValue < 3 && this.K1 == i18)) {
                    this.Z1 = true;
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j07);
                    this.R = viewGroup2;
                    viewGroup2.setVisibility(0);
                    this.f145792y.setVisibility(4);
                    android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                    this.P1 = valueAnimator;
                    valueAnimator.setDuration(700L);
                    this.P1.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                    android.animation.ValueAnimator valueAnimator2 = this.P1;
                    int i48 = this.f145791x1;
                    valueAnimator2.setIntValues(0, i48);
                    android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
                    this.Q1 = objectAnimator;
                    objectAnimator.setPropertyName("alpha");
                    float[] fArr = new float[i18];
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    this.Q1.setFloatValues(fArr);
                    this.Q1.setTarget(this.R);
                    this.Q1.setDuration(300L);
                    this.Q1.setStartDelay(200L);
                    this.Q1.addListener(new com.tencent.mm.plugin.luckymoney.story.y(this));
                    android.animation.ValueAnimator valueAnimator3 = new android.animation.ValueAnimator();
                    this.R1 = valueAnimator3;
                    valueAnimator3.setInterpolator(w9.a.f444038e);
                    this.R1.setStartDelay(200L);
                    this.R1.setDuration(300L);
                    this.R1.setIntValues(i48, 0);
                    com.tencent.mm.plugin.luckymoney.story.z zVar = new com.tencent.mm.plugin.luckymoney.story.z(this);
                    this.P1.addUpdateListener(zVar);
                    this.R1.addUpdateListener(zVar);
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    this.S1 = animatorSet;
                    android.animation.Animator[] animatorArr = new android.animation.Animator[3];
                    animatorArr[0] = this.P1;
                    animatorArr[1] = this.Q1;
                    animatorArr[i18] = this.R1;
                    animatorSet.playSequentially(animatorArr);
                    this.S1.addListener(new com.tencent.mm.plugin.luckymoney.story.a0(this));
                    post(new com.tencent.mm.plugin.luckymoney.story.i(this));
                    if (this.f145775a2) {
                        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC;
                        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(((java.lang.Integer) c17.m(u3Var, 0)).intValue() + 1));
                    } else {
                        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC;
                        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(((java.lang.Integer) c18.m(u3Var2, 0)).intValue() + 1));
                    }
                } else {
                    this.f145777c2 = true;
                    q();
                }
            }
            this.f145788w.getAdapter().notifyDataSetChanged();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "set envelope story: %s", java.lang.Integer.valueOf(this.K1));
    }

    public void o(int i17) {
        this.K1 = i17;
        if (i17 == 0) {
            this.L1 = true;
            this.M1 = true;
            this.f145792y.setVisibility(8);
            this.N.setVisibility(8);
            if (com.tencent.mm.ui.bk.C()) {
                this.M.setImageResource(com.tencent.mm.R.drawable.d5r);
            } else {
                this.M.setImageResource(com.tencent.mm.R.raw.icons_filled_detail_skin_hb_mask);
            }
            android.widget.ImageView imageView = this.f145784s;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            imageView.setTag(com.tencent.mm.R.id.iz_, bool);
            this.f145785t.setTag(com.tencent.mm.R.id.iz_, bool);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            this.L1 = false;
            this.M1 = false;
            this.f145792y.setVisibility(0);
            this.L.setVisibility(0);
            this.f145792y.setPadding(i65.a.b(getContext(), 12), i65.a.b(getContext(), 4), i65.a.b(getContext(), 12), i65.a.b(getContext(), 4));
            this.N.setVisibility(0);
            this.N.setAlpha(0.0f);
            if (com.tencent.mm.ui.bk.C()) {
                this.M.setImageResource(com.tencent.mm.R.drawable.d5r);
            } else {
                this.M.setImageResource(com.tencent.mm.R.raw.icons_filled_detail_skin_hb_mask);
            }
            gb3.m.a(4, this.G1);
            android.widget.ImageView imageView2 = this.f145784s;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            imageView2.setTag(com.tencent.mm.R.id.iz_, bool2);
            this.f145785t.setTag(com.tencent.mm.R.id.iz_, bool2);
            this.f145785t.setVisibility(8);
            return;
        }
        this.L1 = true;
        this.M1 = false;
        this.f145792y.setVisibility(8);
        this.L.setVisibility(8);
        this.f145792y.setPadding(i65.a.b(getContext(), 12), i65.a.b(getContext(), 8), i65.a.b(getContext(), 12), i65.a.b(getContext(), 4));
        this.f145784s.setVisibility(0);
        this.f145785t.setVisibility(0);
        this.N.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 15);
        this.f145774J.setLayoutParams(layoutParams);
        if (com.tencent.mm.ui.bk.C()) {
            this.M.setImageResource(com.tencent.mm.R.drawable.d5r);
        } else {
            this.M.setImageResource(com.tencent.mm.R.raw.icons_filled_detail_skin_hb_mask);
        }
        android.widget.ImageView imageView3 = this.f145784s;
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        imageView3.setTag(com.tencent.mm.R.id.iz_, bool3);
        this.f145785t.setTag(com.tencent.mm.R.id.iz_, bool3);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onUIDestroy() {
        j(true);
        this.D1.f();
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager = this.f145788w;
        envelopeStoryViewPager.needLoopPlay = false;
        envelopeStoryViewPager.f145816o2.removeMessages(1);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = envelopeStoryViewPager.storyVideoManager;
        if (envelopeStoryVideoManager != null) {
            envelopeStoryVideoManager.f145809n = null;
        }
        int i17 = this.K1;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.plugin.luckymoney.story.g1.a(3);
        }
        gb3.n.a(11);
        g();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f145785t;
        if (mMPAGView != null) {
            mMPAGView.n();
            this.f145785t.i(this.f145786u);
            this.f145786u = null;
            com.tencent.mm.wallet_core.model.z1.f214041a.a(this.f145787v);
            this.f145787v = null;
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
    }

    public final void p(in5.s0 s0Var, int i17, boolean z17) {
        java.lang.String str;
        boolean z18;
        com.tencent.mm.plugin.luckymoney.story.h0 h0Var = (com.tencent.mm.plugin.luckymoney.story.h0) s0Var.f293125i;
        h0Var.a();
        if (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.c(h0Var.f145878g, h0Var.f145880i)) {
            str = h0Var.f145880i;
            z18 = true;
        } else {
            str = h0Var.f145875d.f384775e;
            z18 = false;
        }
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.D1;
        android.content.Context context = getContext();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.j0c);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j09);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) s0Var.p(com.tencent.mm.R.id.j0a);
        envelopeStoryVideoManager.h(context, frameLayout, imageView, progressBar, str, h0Var.f145875d.f384776f, h0Var.f145876e, h0Var.f145877f, i17, true, z18, z17);
    }

    public final void q() {
        if (this.f145776b2 && this.f145777c2) {
            post(new com.tencent.mm.plugin.luckymoney.story.g(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "not run this time");
        }
    }

    public void setActivityLifeCycle(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[isNewKtLogic] old style");
        luckyMoneyDetailUI.mo133getLifecycle().a(this.D1);
        luckyMoneyDetailUI.mo133getLifecycle().a(this);
        this.V = luckyMoneyDetailUI;
        this.U = null;
        this.T = false;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.D1;
        envelopeStoryVideoManager.f145802d = luckyMoneyDetailUI;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.story.l0(envelopeStoryVideoManager));
    }

    public void setNewActivityLifeCycle(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[isNewKtLogic] new style");
        luckyMoneyNewDetailUI.mo133getLifecycle().a(this.D1);
        luckyMoneyNewDetailUI.mo133getLifecycle().a(this);
        this.V = null;
        this.U = luckyMoneyNewDetailUI;
        this.T = true;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.D1;
        envelopeStoryVideoManager.f145802d = luckyMoneyNewDetailUI;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.story.l0(envelopeStoryVideoManager));
    }

    public EnvelopeAppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = false;
        this.f145790x0 = false;
        this.f145791x1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120);
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120);
        this.f145794y1 = b17;
        this.f145796z1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn) - b17;
        this.A1 = 0;
        this.C1 = new java.util.ArrayList();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.U1 = false;
        this.V1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f145775a2 = false;
        this.f145778d2 = new com.tencent.mm.plugin.luckymoney.story.k(this);
        this.f145779e2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.a4n);
        h();
    }
}
