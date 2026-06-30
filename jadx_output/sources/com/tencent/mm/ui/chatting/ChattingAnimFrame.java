package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class ChattingAnimFrame extends android.widget.FrameLayout implements xn5.a0 {
    public static java.lang.String W = "";
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public android.view.animation.Interpolator I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.animation.Interpolator f198189J;
    public int K;
    public int L;
    public android.animation.ValueAnimator M;
    public final android.animation.ValueAnimator.AnimatorUpdateListener N;
    public final android.animation.Animator.AnimatorListener P;
    public boolean Q;
    public f21.e R;
    public d12.b S;
    public android.animation.ObjectAnimator T;
    public final android.view.View.OnClickListener U;
    public com.tencent.mm.ui.chatting.b3 V;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f198190d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f198191e;

    /* renamed from: f, reason: collision with root package name */
    public int f198192f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f198193g;

    /* renamed from: h, reason: collision with root package name */
    public int f198194h;

    /* renamed from: i, reason: collision with root package name */
    public int f198195i;

    /* renamed from: m, reason: collision with root package name */
    public int f198196m;

    /* renamed from: n, reason: collision with root package name */
    public int f198197n;

    /* renamed from: o, reason: collision with root package name */
    public int f198198o;

    /* renamed from: p, reason: collision with root package name */
    public int f198199p;

    /* renamed from: q, reason: collision with root package name */
    public int f198200q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f198201r;

    /* renamed from: s, reason: collision with root package name */
    public int f198202s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f198203t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f198204u;

    /* renamed from: v, reason: collision with root package name */
    public int f198205v;

    /* renamed from: w, reason: collision with root package name */
    public int f198206w;

    /* renamed from: x, reason: collision with root package name */
    public final float f198207x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f198208y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f198209z;

    public ChattingAnimFrame(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198191e = new java.util.ArrayList();
        this.f198192f = 0;
        this.f198198o = 30;
        this.f198199p = 30;
        this.f198200q = 40;
        this.f198201r = false;
        this.f198202s = 0;
        this.f198203t = new java.util.ArrayList();
        this.f198207x = 0.2f;
        this.N = new com.tencent.mm.ui.chatting.q2(this);
        this.P = new com.tencent.mm.ui.chatting.r2(this);
        this.U = new com.tencent.mm.ui.chatting.t2(this);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f198190d = frameLayout;
        addView(frameLayout);
        this.f198196m = i65.a.k(getContext());
        this.f198197n = i65.a.B(getContext());
        this.f198205v = i65.a.b(getContext(), 60);
        this.f198206w = i65.a.b(getContext(), 80);
    }

    public static float a(float f17, float f18) {
        return f17 + (((float) java.lang.Math.random()) * (f18 - f17));
    }

    private static java.lang.String getDataEmojiPath() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(W)) {
            W = lp0.b.h();
            W += "/emoji";
        }
        return W;
    }

    public void b() {
        java.lang.String str;
        f21.e eVar = this.R;
        f21.d dVar = eVar.f258882r;
        if (dVar != null) {
            f21.h0 h0Var = dVar.f258850g;
            this.K = h0Var.f258907e;
            this.L = i65.a.b(getContext(), (int) a(h0Var.f258909g, h0Var.f258910h));
            str = h0Var.f258906d;
        } else {
            f21.i iVar = eVar.f258883s;
            if (iVar != null) {
                f21.h0 h0Var2 = iVar.f258912e;
                this.K = h0Var2.f258907e;
                this.L = i65.a.b(getContext(), (int) a(h0Var2.f258909g, h0Var2.f258910h));
                str = h0Var2.f258906d;
            } else {
                f21.e0 e0Var = eVar.f258879o.f258869x;
                this.K = e0Var.f258889e;
                this.L = i65.a.b(getContext(), e0Var.f258890f);
                str = e0Var.f258888d;
            }
        }
        int i17 = this.L;
        this.f198205v = i17;
        this.f198206w = i17;
        this.A = 0.0f;
        float f17 = this.f198197n;
        this.B = f17;
        this.C = 0.0f;
        float f18 = this.f198196m;
        this.D = f18;
        float f19 = 0.9f - ((i17 * 1.0f) / f17);
        float f27 = ((-i17) * 1.1f) / f18;
        this.f198189J = new android.view.animation.LinearInterpolator();
        int i18 = this.K;
        if (i18 == 1) {
            float a17 = a(0.1f, f19);
            this.A = a17;
            float a18 = a(a17 - 0.25f, a17 + 0.25f);
            this.B = a18;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a18, f19));
            this.C = 1.0f;
            this.D = f27;
        } else if (i18 == 2) {
            float a19 = a(0.1f, f19);
            this.A = a19;
            float a27 = a(a19 - 0.25f, a19 + 0.25f);
            this.B = a27;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a27, f19));
            this.C = f27;
            this.D = 1.0f;
            this.f198189J = new ta5.a();
        } else if (i18 == 3) {
            float a28 = a(0.1f, f19);
            this.A = a28;
            float a29 = a(a28 - 0.25f, a28 + 0.25f);
            this.B = a29;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a29, f19));
            this.C = 1.5f;
            this.D = a(0.25f, 0.55f);
            this.f198189J = new ta5.b(0.5f);
        } else if (i18 != 4) {
            float a37 = a(0.1f, f19);
            this.A = a37;
            float a38 = a(a37 - 0.5f, a37 + 0.5f);
            this.B = a38;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a38, f19));
            this.C = f27;
            this.D = 1.0f;
        } else {
            float a39 = a(f27, 1.0f - ((this.L * 1.0f) / this.f198195i));
            this.A = 1.0f;
            this.B = 0.0f - ((this.L * 1.0f) / this.f198197n);
            this.C = a39;
            this.D = a39;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "luckyBag, s[%s] e[%s].", java.lang.Float.valueOf(this.A), java.lang.Float.valueOf(this.B));
        float f28 = this.f198197n;
        float f29 = this.A * f28;
        this.E = f29;
        this.F = f28 * this.B;
        float f37 = this.f198196m;
        float f38 = this.C;
        this.G = f37 * f38;
        float f39 = this.D;
        this.H = f37 * f39;
        if (this.K == 4) {
            float f47 = this.f198195i;
            this.G = f38 * f47;
            this.H = f47 * f39;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "luckyBag, init: startX[%s] endX[%s] startY[%s] endY[%s].", java.lang.Float.valueOf(f29), java.lang.Float.valueOf(this.F), java.lang.Float.valueOf(this.G), java.lang.Float.valueOf(this.H));
        if (this.f198204u == null) {
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = new com.tencent.mm.plugin.gif.MMAnimateView(getContext(), null);
            this.f198204u = mMAnimateView;
            mMAnimateView.setOnClickListener(this.U);
        }
        this.f198204u.setPivotX(this.f198205v / 2.0f);
        this.f198204u.setPivotY(this.f198206w / 2.0f);
        this.f198204u.setRotation(0.0f);
        this.f198204u.setImageFilePath(getDataEmojiPath() + "/egg/" + str);
        this.f198204u.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f198205v, this.f198206w));
        this.f198204u.setX(this.E);
        this.f198204u.setY(this.G);
        int a47 = (int) a(7000.0f, 10000.0f);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.setDuration(a47);
        this.M.setInterpolator(new android.view.animation.LinearInterpolator());
        this.M.addUpdateListener(this.N);
        this.M.setStartDelay(1500L);
        this.M.addListener(this.P);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f198204u, (android.util.Property<com.tencent.mm.plugin.gif.MMAnimateView, java.lang.Float>) android.view.View.ROTATION, 0.0f, 15.0f, -15.0f, 15.0f, -15.0f, 0.0f);
        this.T = ofFloat2;
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.T.setDuration(500L);
        this.T.setRepeatCount(1);
        this.f198208y = false;
        this.f198209z = false;
    }

    public boolean c(f21.e eVar) {
        java.util.List list;
        int i17;
        double abs;
        double d17;
        long j17;
        e();
        boolean z17 = false;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingAnimFrame", "egg info is null. ignore.");
            return false;
        }
        java.util.LinkedList linkedList = eVar.f258880p;
        int size = linkedList.size();
        if (size <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAnimFrame", "no anim!!!");
            return false;
        }
        f21.h0 h0Var = (f21.h0) linkedList.get(1 != size ? new java.util.Random().nextInt(size) : 0);
        java.lang.String str = getDataEmojiPath() + "/egg/" + h0Var.f258906d;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingAnimFrame", "egg file isn't exist. ignore");
            return false;
        }
        this.R = eVar;
        setVisibility(0);
        int i18 = 3;
        if (com.tencent.mm.ui.chatting.n9.d(eVar)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1263, 3);
        }
        int i19 = h0Var.f258908f;
        if (i19 > 0) {
            this.f198198o = i19;
            if (i19 > 60) {
                this.f198198o = 60;
            }
        } else {
            this.f198198o = 30;
        }
        int i27 = h0Var.f258909g;
        if (i27 > 0) {
            this.f198199p = i27;
        } else {
            this.f198199p = 30;
        }
        int i28 = h0Var.f258910h;
        if (i28 > 0) {
            this.f198200q = i28;
        } else {
            this.f198200q = 40;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "Egg viewCount:%d minSize:%d maxSize:%d AnimType:%d reportType:%d", java.lang.Integer.valueOf(this.f198198o), java.lang.Integer.valueOf(this.f198199p), java.lang.Integer.valueOf(this.f198200q), java.lang.Integer.valueOf(h0Var.f258907e), java.lang.Integer.valueOf(eVar.f258874g));
        f21.l lVar = eVar.f258887w;
        if (lVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(lVar.f258934g)) {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f198193g;
            if (mMPAGView != null) {
                mMPAGView.n();
                removeView(this.f198193g);
            }
            this.f198193g = new com.tencent.mm.view.MMPAGView(getContext());
            boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxChatSwitch()) == 1;
            this.f198193g.o(z18);
            java.lang.String str2 = getDataEmojiPath() + "/egg/" + eVar.f258887w.f258934g;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 49;
            this.f198193g.setPath(str2);
            if (z18) {
                com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(str2);
                layoutParams.height = (Load.height() * ((android.view.ViewGroup) getParent()).getWidth()) / Load.width();
            } else {
                org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(str2);
                layoutParams.height = (Load2.height() * ((android.view.ViewGroup) getParent()).getWidth()) / Load2.width();
            }
            addView(this.f198193g, 0, layoutParams);
            this.f198193g.g();
        }
        int i29 = this.f198198o;
        float f17 = 0.0f;
        if (i29 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingAnimFrame", "count is zero.");
        } else {
            int i37 = (int) (i29 * 0.1d);
            java.util.ArrayList arrayList = this.f198203t;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f198203t = new java.util.ArrayList();
            }
            while (this.f198203t.size() < i37) {
                int a17 = (int) a(0.0f, i29);
                if (!this.f198203t.contains(java.lang.Integer.valueOf(a17))) {
                    this.f198203t.add(java.lang.Integer.valueOf(a17));
                }
            }
        }
        long j18 = 0;
        int i38 = 0;
        while (true) {
            int i39 = this.f198198o;
            list = this.f198191e;
            if (i38 >= i39) {
                break;
            }
            int b17 = i65.a.b(getContext(), (int) a(this.f198199p, this.f198200q));
            long j19 = j18 + 500;
            int i47 = h0Var.f258907e;
            java.util.ArrayList arrayList2 = this.f198203t;
            int i48 = i38;
            com.tencent.mm.ui.chatting.a3 a3Var = new com.tencent.mm.ui.chatting.a3(this, i47, b17, j19, (arrayList2 == null || !arrayList2.contains(java.lang.Integer.valueOf(i38))) ? z17 : true);
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = new com.tencent.mm.plugin.gif.MMAnimateView(getContext(), null);
            mMAnimateView.setImageFilePath(str);
            mMAnimateView.setAnimation(a3Var);
            mMAnimateView.setLayerType(2, null);
            mMAnimateView.setVisibility(4);
            a3Var.f198361f = mMAnimateView;
            int i49 = a3Var.f198359d;
            mMAnimateView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i49, i49));
            ((java.util.ArrayList) list).add(mMAnimateView);
            int i57 = this.f198192f + 1;
            this.f198192f = i57;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "addView counter++: [%s]. %s", java.lang.Integer.valueOf(i57), mMAnimateView);
            this.f198190d.addView(mMAnimateView);
            int i58 = h0Var.f258907e;
            int i59 = this.f198198o;
            if (i58 == 2) {
                i17 = i48;
                if (i17 < 2) {
                    j17 = 800;
                    j18 += j17;
                    i38 = i17 + 1;
                    z17 = false;
                    i18 = 3;
                    f17 = 0.0f;
                } else {
                    abs = java.lang.Math.abs((i17 - (i59 * 0.5d)) - 5.0d) / (i59 * 3);
                    d17 = 0.01d;
                }
            } else if (i58 != i18) {
                j18 = (int) (a(f17, 4.0f) * 1000.0f);
                i17 = i48;
                i38 = i17 + 1;
                z17 = false;
                i18 = 3;
                f17 = 0.0f;
            } else {
                i17 = i48;
                abs = java.lang.Math.abs((i17 - (i59 * 0.5d)) - 5.0d) / (i59 * 6);
                d17 = 0.06d;
            }
            j17 = (long) ((abs + d17) * 1000.0d);
            j18 += j17;
            i38 = i17 + 1;
            z17 = false;
            i18 = 3;
            f17 = 0.0f;
        }
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                android.view.View view = (android.view.View) it.next();
                if (view != null && (view.getAnimation() instanceof com.tencent.mm.ui.chatting.a3)) {
                    com.tencent.mm.ui.chatting.a3 a3Var2 = (com.tencent.mm.ui.chatting.a3) view.getAnimation();
                    a3Var2.setStartOffset(a3Var2.f198360e);
                    a3Var2.start();
                }
            }
        }
        return true;
    }

    public final void d() {
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f198204u;
        if (mMAnimateView == null || !this.Q) {
            return;
        }
        mMAnimateView.y();
        this.f198190d.removeView(this.f198204u);
        this.Q = false;
        this.S = null;
        android.animation.ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.M = null;
        }
        android.animation.ObjectAnimator objectAnimator = this.T;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.T = null;
        }
        this.f198204u.setRotation(0.0f);
    }

    public void e() {
        java.util.List list = this.f198191e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "stop: view: %s, count:%s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(this.f198192f));
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = (com.tencent.mm.plugin.gif.MMAnimateView) it.next();
            mMAnimateView.clearAnimation();
            mMAnimateView.t();
            this.f198190d.removeView(mMAnimateView);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "stop: remove view %s", mMAnimateView);
        }
        ((java.util.ArrayList) list).clear();
        d();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f198193g;
        if (mMPAGView != null) {
            mMPAGView.n();
            removeView(this.f198193g);
            this.f198193g = null;
        }
        this.f198192f = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "stop: end child count %s", java.lang.Integer.valueOf(getChildCount()));
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f198195i = getMeasuredHeight();
        this.f198194h = getMeasuredWidth();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i27 - i18;
        this.f198195i = i28;
        int i29 = i19 - i17;
        this.f198194h = i29;
        int i37 = this.f198196m;
        if (i28 < i37) {
            this.f198201r = true;
            this.f198202s = i37 - i28;
        } else {
            this.f198201r = false;
            this.f198202s = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "onLayout width:%d height:%d isKeyBordUp:%b keyBordHeight:%d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(this.f198195i), java.lang.Boolean.valueOf(this.f198201r), java.lang.Integer.valueOf(this.f198202s));
    }

    public void setOnLuckyBagClick(com.tencent.mm.ui.chatting.b3 b3Var) {
        this.V = b3Var;
    }
}
