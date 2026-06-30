package k84;

/* loaded from: classes4.dex */
public abstract class q1 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public static final k84.l Y = new k84.l(null);
    public static final int Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f305186a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final double f305187b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final double f305188c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final double f305189d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final double f305190e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final double f305191f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final double f305192g0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f305193J;
    public final jz5.g K;
    public android.animation.ValueAnimator L;
    public android.animation.ValueAnimator M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final java.util.Map R;
    public final kotlinx.coroutines.flow.j2 S;
    public k84.n T;
    public final java.util.Map U;
    public long V;
    public kotlinx.coroutines.r2 W;
    public boolean X;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305194o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView f305195p;

    /* renamed from: q, reason: collision with root package name */
    public final int f305196q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f305197r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f305198s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f305199t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Random f305200u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f305201v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f305202w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f305203x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f305204y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f305205z;

    static {
        int a17 = a84.d0.a(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn);
        Z = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        int a18 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, (float) 89.6d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        f305186a0 = a18;
        f305187b0 = 0.267949d;
        f305188c0 = 0.965926d;
        double d17 = a18;
        f305189d0 = (d17 / 2.0d) / 0.965926d;
        f305190e0 = d17 * 0.965926d;
        double d18 = d17 * 0.25882d;
        f305191f0 = (a17 * 0.965926d) + d18;
        f305192g0 = d18;
    }

    public q1(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView, int i17, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        super(str, yVar, view);
        this.f305194o = adSocialAttitudeView;
        this.f305195p = adAttitudePlayView;
        this.f305196q = i17;
        this.f305197r = b1Var;
        this.f305198s = iVar;
        int i18 = kotlinx.coroutines.r0.N0;
        this.f305199t = new k84.l0(kotlinx.coroutines.q0.f310567d, this);
        this.f305200u = new java.util.Random();
        this.f305201v = jz5.h.b(new k84.p(this));
        this.f305202w = jz5.h.b(new k84.s(this));
        this.f305203x = jz5.h.b(new k84.q(this));
        this.f305204y = jz5.h.b(new k84.r(this));
        this.f305205z = jz5.h.b(new k84.o(this));
        this.A = jz5.h.b(new k84.j0(this));
        this.B = jz5.h.b(new k84.k0(this));
        this.C = jz5.h.b(new k84.e1(view, this, yVar));
        this.D = jz5.h.b(new k84.d1(this));
        this.E = jz5.h.b(new k84.i1(this));
        this.F = jz5.h.b(new k84.g1(this));
        this.G = jz5.h.b(new k84.j1(this));
        this.H = jz5.h.b(new k84.c1(this));
        this.I = jz5.h.b(new k84.b1(this));
        this.f305193J = jz5.h.b(new k84.h1(this));
        this.K = jz5.h.b(new k84.f1(this));
        this.N = 1;
        this.O = -1;
        this.P = -1;
        this.R = new java.util.LinkedHashMap();
        this.S = kotlinx.coroutines.flow.i3.a(null);
        this.T = new k84.n(0, null, 0, 0, 0);
        this.U = new java.util.LinkedHashMap();
        this.V = -1L;
    }

    public static final /* synthetic */ int A(k84.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        int i17 = q1Var.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return i17;
    }

    public static final /* synthetic */ void B(k84.q1 q1Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.Q = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCurrentAnimBarCount$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final void C(k84.q1 q1Var, android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        if (view != null) {
            view.setClipToOutline(true);
        }
        if (view != null) {
            view.setOutlineProvider(new al5.z1(a84.d0.a(4)));
        }
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        if (view != null) {
            view.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMeasuredBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final void D(k84.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mars.xlog.Log.i(q1Var.j(), "startBreezeAnim");
        android.animation.ValueAnimator valueAnimator = q1Var.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        q1Var.L = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(1000L);
        }
        android.animation.ValueAnimator valueAnimator2 = q1Var.L;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(s74.q4.f404513a.h());
        }
        android.view.ViewGroup J2 = q1Var.J();
        int measuredHeight = J2 != null ? J2.getMeasuredHeight() : 0;
        android.view.ViewGroup J3 = q1Var.J();
        int measuredWidth = J3 != null ? J3.getMeasuredWidth() : 0;
        int max = java.lang.Math.max(measuredHeight - a84.d0.a(6), 0);
        float f17 = measuredWidth;
        float max2 = f17 > 0.0f ? java.lang.Math.max(measuredWidth - a84.d0.a(6), 0) / f17 : 1.0f;
        float f18 = measuredHeight > 0 ? max / measuredHeight : 1.0f;
        int max3 = java.lang.Math.max(a84.d0.a(6) + measuredHeight, 0);
        float max4 = f17 > 0.0f ? java.lang.Math.max(measuredWidth + a84.d0.a(6), 0) / f17 : 1.0f;
        float f19 = measuredHeight;
        float f27 = f19 > 0.0f ? max3 / f19 : 1.0f;
        com.tencent.mars.xlog.Log.i(q1Var.j(), "scaleLimit   " + max2 + "  " + f18);
        com.tencent.mars.xlog.Log.i(q1Var.j(), "scaleAlphaLimit   " + max4 + "  " + f27);
        android.animation.ValueAnimator valueAnimator3 = q1Var.L;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new k84.u0(max2, f18, q1Var, max4, f27));
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        android.animation.ValueAnimator valueAnimator4 = q1Var.L;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new k84.s0(c0Var));
        }
        android.animation.ValueAnimator valueAnimator5 = q1Var.L;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new k84.t0(q1Var, c0Var));
        }
        android.animation.ValueAnimator valueAnimator6 = q1Var.L;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final void E(k84.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        q1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        kotlinx.coroutines.r2 r2Var = q1Var.W;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        q1Var.V = java.lang.System.currentTimeMillis() + 3000;
        kotlinx.coroutines.y0 h17 = q1Var.h();
        q1Var.W = h17 != null ? kotlinx.coroutines.l.d(h17, q1Var.f305199t, null, new k84.w0(q1Var, null), 2, null) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startCheckContinuousEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final boolean U(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        mb4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        boolean z17 = ((snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (cVar = adXml.adSocialInfo) == null) ? null : cVar.f325387l) != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdContinuousLikeComponentExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return z17;
    }

    public static /* synthetic */ void Y(k84.q1 q1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUIForNoAnim");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            throw unsupportedOperationException;
        }
        if ((i17 & 1) != 0) {
            snsInfo = null;
        }
        q1Var.X(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public static final /* synthetic */ java.util.Map y(k84.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBannerBitmaps$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        java.util.Map map = q1Var.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBannerBitmaps$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return map;
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.j2 z(k84.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContinuousLikeStateFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        kotlinx.coroutines.flow.j2 j2Var = q1Var.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContinuousLikeStateFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return j2Var;
    }

    public final android.widget.FrameLayout F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeAnimBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f305205z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeAnimBackground", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return frameLayout;
    }

    public final android.view.ViewGroup G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f305201v).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeContinuousBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f305203x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeContinuousBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeContinuousBgAlpha", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f305204y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeContinuousBgAlpha", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeContinuousContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f305202w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeContinuousContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudePlayView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = this.f305195p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudePlayView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return adAttitudePlayView;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305194o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return adSocialAttitudeView;
    }

    public final mb4.p M(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        mb4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContinuousLikeInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        mb4.p pVar = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (cVar = adXml.adSocialInfo) == null) ? null : cVar.f325387l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContinuousLikeInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return pVar;
    }

    public final android.view.ViewGroup N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.I).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.widget.TextView O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagAnimWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagAnimWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return textView;
    }

    public final android.view.ViewGroup P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.D).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagLikingContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.F).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagLikingContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return viewGroup;
    }

    public final androidx.appcompat.widget.AppCompatTextView S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) ((jz5.n) this.E).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return appCompatTextView;
    }

    public final androidx.appcompat.widget.AppCompatTextView T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) ((jz5.n) this.G).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagWordLiking", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        return appCompatTextView;
    }

    public final void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        android.view.ViewGroup G = G();
        if (G != null) {
            int childCount = G.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = G.getChildAt(i17);
                if (kotlin.jvm.internal.o.b(childAt, F())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent", "resetAttitudeContent", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAttitudeContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public final void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetWordings", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) ((jz5.n) this.f305193J).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        if (appCompatTextView != null) {
            appCompatTextView.setText("");
            appCompatTextView.setTextSize(1, 14.0f);
            androidx.core.widget.a0.b(appCompatTextView, 1, a84.d0.a(14), 1, 0);
        }
        androidx.appcompat.widget.AppCompatTextView T = T();
        if (T != null) {
            T.setText("");
            T.setTextSize(1, 14.0f);
            androidx.core.widget.a0.b(T, 1, a84.d0.a(14), 1, 0);
        }
        androidx.appcompat.widget.AppCompatTextView S = S();
        if (S != null) {
            S.setText("");
            S.setTextSize(1, 14.0f);
            androidx.core.widget.a0.b(S, 1, a84.d0.a(14), 1, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetWordings", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    public final void X(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305194o;
        boolean z17 = !(adSocialAttitudeView != null ? adSocialAttitudeView.m() : false);
        com.tencent.mars.xlog.Log.i(j(), "continuousLikeStateFlow  checkLikeStatus = " + z17);
        if (snsInfo != null) {
            z17 = snsInfo.getLikeFlag() != 0;
        }
        com.tencent.mars.xlog.Log.i(j(), "refresh  checkLikeStatus = " + z17);
        if (z17) {
            android.view.ViewGroup P = P();
            if (P != null) {
                P.setVisibility(4);
            }
            android.view.ViewGroup R = R();
            if (R != null) {
                R.setVisibility(4);
            }
            android.view.ViewGroup N = N();
            if (N != null) {
                N.setVisibility(0);
            }
        } else {
            android.view.ViewGroup P2 = P();
            if (P2 != null) {
                P2.setVisibility(0);
            }
            android.view.ViewGroup R2 = R();
            if (R2 != null) {
                R2.setVisibility(4);
            }
            android.view.ViewGroup N2 = N();
            if (N2 != null) {
                N2.setVisibility(4);
            }
        }
        android.view.ViewGroup J2 = J();
        if (J2 != null) {
            J2.setVisibility(8);
        }
        android.view.ViewGroup G = G();
        if (G != null) {
            G.setVisibility(0);
        }
        android.view.ViewGroup G2 = G();
        if (G2 != null) {
            G2.setBackground(new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478490b)));
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f305194o;
        if (adSocialAttitudeView2 != null) {
            adSocialAttitudeView2.setVisibility(0);
        }
        android.widget.FrameLayout F = F();
        android.view.ViewGroup.LayoutParams layoutParams = F != null ? F.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = 0;
        }
        android.widget.FrameLayout F2 = F();
        android.view.ViewGroup.LayoutParams layoutParams2 = F2 != null ? F2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = 0;
        }
        android.widget.FrameLayout F3 = F();
        if (F3 != null) {
            F3.requestLayout();
        }
        android.view.ViewGroup H = H();
        android.view.ViewGroup.LayoutParams layoutParams3 = H != null ? H.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
        }
        android.view.ViewGroup H2 = H();
        android.view.ViewGroup.LayoutParams layoutParams4 = H2 != null ? H2.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = 0;
        }
        android.view.ViewGroup H3 = H();
        if (H3 != null) {
            H3.requestLayout();
        }
        android.view.ViewGroup I = I();
        android.view.ViewGroup.LayoutParams layoutParams5 = I != null ? I.getLayoutParams() : null;
        if (layoutParams5 != null) {
            layoutParams5.width = 0;
        }
        android.view.ViewGroup I2 = I();
        android.view.ViewGroup.LayoutParams layoutParams6 = I2 != null ? I2.getLayoutParams() : null;
        if (layoutParams6 != null) {
            layoutParams6.height = 0;
        }
        android.view.ViewGroup I3 = I();
        if (I3 != null) {
            I3.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x019d, code lost:
    
        if (r13 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0091, code lost:
    
        if (r15 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00f5  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.q1.d(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r2 != null && r2.a()) == false) goto L17;
     */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onEveryFillItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r8
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.q(r8)
            kotlinx.coroutines.flow.j2 r2 = r7.S
            kotlinx.coroutines.flow.h3 r2 = (kotlinx.coroutines.flow.h3) r2
            java.lang.Object r2 = r2.getValue()
            k84.m r2 = (k84.m) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L26
            boolean r5 = r2.b()
            if (r5 != r3) goto L26
            r5 = r3
            goto L27
        L26:
            r5 = r4
        L27:
            if (r5 != 0) goto L37
            if (r2 == 0) goto L33
            boolean r2 = r2.a()
            if (r2 != r3) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r4
        L34:
            if (r2 != 0) goto L37
            goto L38
        L37:
            r3 = r4
        L38:
            java.lang.String r2 = r7.j()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onEveryFillItem isNotInAnim "
            r5.<init>(r6)
            r5.append(r3)
            r6 = 32
            r5.append(r6)
            boolean r6 = r7.X
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            if (r3 == 0) goto L63
            boolean r2 = r7.X
            if (r2 == 0) goto L63
            r7.X(r8)
            r7.X = r4
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.q1.q(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onResume"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "model"
            kotlin.jvm.internal.o.g(r9, r2)
            super.s(r9)
            kotlinx.coroutines.flow.j2 r9 = r8.S
            kotlinx.coroutines.flow.h3 r9 = (kotlinx.coroutines.flow.h3) r9
            java.lang.Object r9 = r9.getValue()
            k84.m r9 = (k84.m) r9
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L2c
            boolean r4 = r9.b()
            if (r4 != r2) goto L2c
            r4 = r2
            goto L2d
        L2c:
            r4 = r3
        L2d:
            if (r4 != 0) goto L3e
            if (r9 == 0) goto L39
            boolean r4 = r9.a()
            if (r4 != r2) goto L39
            r4 = r2
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 != 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r3
        L3f:
            java.lang.String r5 = r8.j()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "onResume isContinuousClickAnim "
            r6.<init>(r7)
            if (r9 == 0) goto L56
            boolean r7 = r9.a()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L57
        L56:
            r7 = 0
        L57:
            r6.append(r7)
            java.lang.String r7 = " isNotInAnim "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r5, r6)
            if (r9 == 0) goto L73
            boolean r9 = r9.a()
            if (r9 != r2) goto L73
            r9 = r2
            goto L74
        L73:
            r9 = r3
        L74:
            if (r9 == 0) goto L7f
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView r9 = r8.f305195p
            if (r9 != 0) goto L7b
            goto L83
        L7b:
            r9.setVisibility(r3)
            goto L83
        L7f:
            if (r4 == 0) goto L83
            r8.X = r2
        L83:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.q1.s(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        V();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetClipView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.U;
        java.util.Set<android.view.ViewGroup> keySet = linkedHashMap.keySet();
        if (keySet != null) {
            for (android.view.ViewGroup viewGroup : keySet) {
                jz5.l lVar = (jz5.l) linkedHashMap.get(viewGroup);
                if (viewGroup != null) {
                    viewGroup.setClipChildren((lVar == null || (bool2 = (java.lang.Boolean) lVar.f302833d) == null) ? true : bool2.booleanValue());
                }
                if (viewGroup != null) {
                    viewGroup.setClipToPadding((lVar == null || (bool = (java.lang.Boolean) lVar.f302834e) == null) ? true : bool.booleanValue());
                }
            }
        }
        linkedHashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetClipView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        ((kotlinx.coroutines.flow.h3) this.S).k(null);
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305194o;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.setBackground(new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478490b)));
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f305194o;
        if (adSocialAttitudeView2 != null) {
            adSocialAttitudeView2.setVisibility(8);
        }
        android.view.ViewGroup G = G();
        android.view.ViewGroup.LayoutParams layoutParams = G != null ? G.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 8388611;
        }
        android.view.ViewGroup G2 = G();
        if (G2 != null) {
            G2.setBackground(null);
        }
        android.widget.FrameLayout F = F();
        android.view.ViewGroup.LayoutParams layoutParams3 = F != null ? F.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
        }
        android.widget.FrameLayout F2 = F();
        android.view.ViewGroup.LayoutParams layoutParams4 = F2 != null ? F2.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = 0;
        }
        android.widget.FrameLayout F3 = F();
        if (F3 != null) {
            F3.setScaleX(1.0f);
        }
        android.widget.FrameLayout F4 = F();
        if (F4 != null) {
            F4.setScaleY(1.0f);
        }
        android.widget.FrameLayout F5 = F();
        if (F5 != null) {
            F5.requestLayout();
        }
        android.view.ViewGroup J2 = J();
        if (J2 != null) {
            J2.setAlpha(0.0f);
        }
        android.view.ViewGroup J3 = J();
        if (J3 != null) {
            J3.setVisibility(8);
        }
        android.view.ViewGroup J4 = J();
        if (J4 != null) {
            J4.setOnTouchListener(null);
        }
        android.view.ViewGroup J5 = J();
        if (J5 != null) {
            J5.setOnClickListener(null);
        }
        android.view.ViewGroup Q = Q();
        if (Q != null) {
            Q.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = this.f305195p;
        if (adAttitudePlayView != null) {
            adAttitudePlayView.setVisibility(8);
        }
        android.view.ViewGroup P = P();
        if (P != null) {
            P.setVisibility(0);
        }
        android.view.ViewGroup R = R();
        if (R != null) {
            R.setVisibility(4);
        }
        android.view.ViewGroup N = N();
        if (N != null) {
            N.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView3 = this.f305194o;
        if (adSocialAttitudeView3 != null) {
            adSocialAttitudeView3.setClipChildren(true);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView4 = this.f305194o;
        if (adSocialAttitudeView4 != null) {
            adSocialAttitudeView4.setClipToPadding(true);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView5 = this.f305194o;
        if (adSocialAttitudeView5 != null) {
            adSocialAttitudeView5.setClipToOutline(true);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView6 = this.f305194o;
        if (adSocialAttitudeView6 != null) {
            adSocialAttitudeView6.setOutlineProvider(new al5.z1(a84.d0.a(4)));
        }
        this.N = 1;
        this.Q = 0;
        W();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
    }
}
