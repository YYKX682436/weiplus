package d84;

/* loaded from: classes4.dex */
public abstract class j0 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public com.tencent.mm.view.MMPAGView F;
    public com.tencent.mm.view.MMPAGView G;
    public com.tencent.mm.view.MMPAGView H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f227075J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g O;
    public final jz5.g P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public float U;
    public int V;
    public boolean W;
    public boolean X;
    public final android.os.Handler Y;
    public final kotlinx.coroutines.flow.j2 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f227076a0;

    /* renamed from: b0, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f227077b0;

    /* renamed from: c0, reason: collision with root package name */
    public final d84.l f227078c0;

    /* renamed from: d0, reason: collision with root package name */
    public final d84.o f227079d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d84.y f227080e0;

    /* renamed from: f0, reason: collision with root package name */
    public final d84.k f227081f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d84.n f227082g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d84.x f227083h0;

    /* renamed from: i0, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1 f227084i0;

    /* renamed from: j0, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnWindowFocusChangeListener f227085j0;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f227086o;

    /* renamed from: p, reason: collision with root package name */
    public final int f227087p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f227088q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f227089r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f227090s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f227091t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f227092u;

    /* renamed from: v, reason: collision with root package name */
    public d84.l0 f227093v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f227094w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f227095x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f227096y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f227097z;

    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1] */
    public j0(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        super(str, yVar, view);
        this.f227086o = view;
        this.f227087p = i17;
        this.f227088q = z17;
        this.f227089r = nVar;
        this.f227090s = iVar;
        this.f227095x = jz5.h.b(new d84.z(this));
        this.f227097z = jz5.h.b(new d84.w(this));
        this.A = jz5.h.b(new d84.q(this));
        this.B = jz5.h.b(new d84.v(this));
        this.C = jz5.h.b(new d84.a0(this));
        this.D = jz5.h.b(new d84.b0(this));
        this.E = jz5.h.b(new d84.i(this));
        this.I = jz5.h.b(new d84.r(this));
        this.f227075J = jz5.h.b(new d84.t(this));
        this.K = jz5.h.b(new d84.s(this));
        this.L = jz5.h.b(new d84.u(this));
        this.M = jz5.h.b(new d84.m(this));
        this.N = jz5.h.b(new d84.p(this));
        this.O = jz5.h.b(new d84.c0(this));
        this.P = jz5.h.b(new d84.j(this));
        this.Y = new android.os.Handler(android.os.Looper.getMainLooper());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.Z = kotlinx.coroutines.flow.i3.a(bool);
        this.f227076a0 = kotlinx.coroutines.flow.i3.a(bool);
        this.f227078c0 = new d84.l(this);
        this.f227079d0 = new d84.o(this);
        this.f227080e0 = new d84.y(this);
        this.f227081f0 = new d84.k(this);
        this.f227082g0 = new d84.n(this);
        this.f227083h0 = new d84.x(this);
        android.content.Context context = view != null ? view.getContext() : null;
        final androidx.lifecycle.y yVar2 = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        yVar2 = yVar2 == null ? com.tencent.mm.app.a0.f53288d : yVar2;
        this.f227084i0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdNotifyTimelineCommentEvent>(yVar2) { // from class: com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1
            {
                this.__eventId = -623739088;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdNotifyTimelineCommentEvent snsAdNotifyTimelineCommentEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                com.tencent.mm.autogen.events.SnsAdNotifyTimelineCommentEvent event = snsAdNotifyTimelineCommentEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str2 = event.f54797g.f6709a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                d84.j0 j0Var = d84.j0.this;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = j0Var.f227092u;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                java.lang.String snsId = snsInfo != null ? snsInfo.getSnsId() : null;
                if (snsId == null) {
                    snsId = "";
                }
                java.lang.String j17 = j0Var.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snsId is ");
                sb6.append(str2);
                sb6.append(", snsIdFromSnsInfo is ");
                sb6.append(snsId);
                sb6.append(", source is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                sb6.append(j0Var.f227087p);
                com.tencent.mars.xlog.Log.i(j17, sb6.toString());
                if (kotlin.jvm.internal.o.b(snsId, str2)) {
                    com.tencent.mars.xlog.Log.i(j0Var.j(), "event callback, pageValue is true, focusValue is " + ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) d84.j0.F(j0Var)).getValue()).booleanValue());
                    ((kotlinx.coroutines.flow.h3) d84.j0.A(j0Var)).k(java.lang.Boolean.TRUE);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mEventListener$1");
                return false;
            }
        };
        this.f227085j0 = new d84.d0(this);
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.j2 A(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHalfDynamicPageNotifyFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        kotlinx.coroutines.flow.j2 j2Var = j0Var.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHalfDynamicPageNotifyFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return j2Var;
    }

    public static final /* synthetic */ android.widget.ImageView B(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView N = j0Var.N();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return N;
    }

    public static final /* synthetic */ android.widget.ImageView C(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView O = j0Var.O();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return O;
    }

    public static final /* synthetic */ android.widget.ImageView D(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView P = j0Var.P();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return P;
    }

    public static final /* synthetic */ android.widget.LinearLayout E(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRockPaperScissorsView$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.LinearLayout linearLayout = j0Var.f227096y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRockPaperScissorsView$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return linearLayout;
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.j2 F(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMWindowFocusChangeFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        kotlinx.coroutines.flow.j2 j2Var = j0Var.f227076a0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMWindowFocusChangeFlow$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return j2Var;
    }

    public static /* synthetic */ void I(d84.j0 j0Var, android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (obj == null) {
            j0Var.H(view, i17, i18, (i37 & 8) != 0 ? 0 : i19, (i37 & 16) != 0 ? 0 : i27, (i37 & 32) != 0 ? 0 : i28, (i37 & 64) != 0 ? 0 : i29);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        } else {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            throw unsupportedOperationException;
        }
    }

    public static /* synthetic */ void K(d84.j0 j0Var, android.view.View view, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutViewMargins$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (obj == null) {
            j0Var.J(view, (i28 & 2) != 0 ? 0 : i17, (i28 & 4) != 0 ? 0 : i18, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) == 0 ? i27 : 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutViewMargins$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        } else {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutViewMargins");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutViewMargins$default", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            throw unsupportedOperationException;
        }
    }

    public static final /* synthetic */ d84.l0 y(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdRockPaperScissorsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.l0 l0Var = j0Var.f227093v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdRockPaperScissorsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return l0Var;
    }

    public static final /* synthetic */ android.content.Context z(d84.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.content.Context context = j0Var.f227091t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return context;
    }

    public final void G() {
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String j17 = j();
        try {
            alive();
            android.content.Context context = this.f227091t;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnWindowFocusChangeListener(this.f227085j0);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void H(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i18;
            marginLayoutParams.leftMargin = i19;
            marginLayoutParams.topMargin = i27;
            marginLayoutParams.rightMargin = i28;
            marginLayoutParams.bottomMargin = i29;
        }
        view.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void J(android.view.View view, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutViewMargins", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutViewMargins", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i17;
            marginLayoutParams.topMargin = i18;
            marginLayoutParams.rightMargin = i19;
            marginLayoutParams.bottomMargin = i27;
        }
        view.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutViewMargins", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void L() {
        float f17;
        int i17;
        int i18;
        double d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRockPaperScissorsTwoLinesTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRockPaperScissorsTwoLinesTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (linearLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        int N = (int) ca4.m0.N(R());
        int i19 = this.T;
        int i27 = N < i19 ? i19 : N;
        double N2 = ca4.m0.N(M());
        int i28 = (int) (i27 + N2 + this.V);
        int i29 = (i28 * 34) / 44;
        this.R = this.Q - (i29 * 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.I).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        I(this, frameLayout, i29, i28, 0, 0, 0, 0, 120, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ((jz5.n) this.f227075J).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        I(this, frameLayout2, i29, i28, 0, 0, 0, 0, 120, null);
        I(this, linearLayout, this.R, i28, 0, 0, 0, 0, 120, null);
        int i37 = this.R - (this.T * 4);
        ca4.m0.c(this.f227091t, R(), this.U, i37, i27);
        ca4.m0.c(this.f227091t, M(), this.U, this.R, (float) N2);
        int N3 = (int) ca4.m0.N(R());
        int i38 = this.T;
        int i39 = N3 < i38 ? i38 : N3;
        int N4 = (int) ca4.m0.N(M());
        this.S = N4;
        float f18 = (((i28 - this.V) - i39) - N4) * 0.5f;
        if (i39 <= 0 || N4 <= 0 || f18 <= 0.0f) {
            f17 = f18;
            i17 = N4;
            i18 = i39;
            d17 = N2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ((jz5.n) this.D).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            int i47 = (int) f18;
            f17 = f18;
            i17 = N4;
            i18 = i39;
            d17 = N2;
            I(this, linearLayout2, this.R, i39, 0, i47, 0, 0, 96, null);
            H(M(), this.R, i17, 0, this.V, 0, i47);
        }
        com.tencent.mars.xlog.Log.i(j(), "doResizeUI, titleContainerTotalHeight is " + i27 + ", descTotalHeight is " + d17 + ", titleContainerTotalHeightForAutoSize is " + i18 + ", descTotalHeightForAutoSize is " + i17 + ", twoLinesTextContainerHeight is " + i28 + ", mAvailableWidth is " + this.Q + ", textContainerWidth is " + this.R + ", titleMaxWidth is " + i37 + ", margin is " + f17);
        android.widget.LinearLayout linearLayout3 = this.f227096y;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final android.widget.TextView M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDesc", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.P).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDesc", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return textView;
    }

    public final android.widget.ImageView N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRockPaperScissorsPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return imageView;
    }

    public final android.widget.ImageView O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.K).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdLeftDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return imageView;
    }

    public final android.widget.ImageView P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.L).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRightDecorPAGThumb", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return imageView;
    }

    public final com.tencent.mm.ui.widget.RoundCornerFrameLayout Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRockPaperScissorsPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) ((jz5.n) this.f227097z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRockPaperScissorsPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return roundCornerFrameLayout;
    }

    public final android.widget.TextView R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTitle", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.O).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTitle", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        return textView;
    }

    public final void S(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestDynamicData", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        kotlinx.coroutines.y0 h17 = h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new d84.f0(snsInfo, this, null), 2, null);
        }
        kotlinx.coroutines.y0 h18 = h();
        if (h18 != null) {
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h18, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new d84.h0(snsInfo, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestDynamicData", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void T() {
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        this.W = false;
        android.widget.LinearLayout linearLayout = this.f227096y;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.Y.removeCallbacksAndMessages(null);
        kotlinx.coroutines.flow.j2 j2Var = this.Z;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((kotlinx.coroutines.flow.h3) j2Var).k(bool);
        ((kotlinx.coroutines.flow.h3) this.f227076a0).k(bool);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String j17 = j();
        try {
            dead();
            android.content.Context context = this.f227091t;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(this.f227085j0);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAndRemovePAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String j18 = j();
        try {
            U();
            V();
            W();
        } catch (java.lang.Throwable th7) {
            ca4.q.c(j18, th7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAndRemovePAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        this.X = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.view.MMPAGView mMPAGView = this.G;
        if (mMPAGView != null) {
            a84.y0.i(mMPAGView);
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.G;
            this.G = null;
            d84.l lVar = this.f227078c0;
            d84.k kVar = this.f227081f0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (mMPAGView2 != null) {
                try {
                    mMPAGView2.i(lVar);
                    mMPAGView2.j(kVar);
                    mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.b0(mMPAGView2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.tencent.mars.xlog.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.tencent.mars.xlog.Log.w(j(), "resetAndRemovePAGView, leftDecorPAGView is not created");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.view.MMPAGView mMPAGView = this.H;
        if (mMPAGView != null) {
            a84.y0.i(mMPAGView);
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.H;
            this.H = null;
            d84.o oVar = this.f227079d0;
            d84.n nVar = this.f227082g0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (mMPAGView2 != null) {
                try {
                    mMPAGView2.i(oVar);
                    mMPAGView2.j(nVar);
                    mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.b0(mMPAGView2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.tencent.mars.xlog.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.tencent.mars.xlog.Log.w(j(), "resetAndRemovePAGView, rightDecorPAGView is not created");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.view.MMPAGView mMPAGView = this.F;
        if (mMPAGView != null) {
            a84.y0.i(mMPAGView);
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.F;
            this.F = null;
            d84.y yVar = this.f227080e0;
            d84.x xVar = this.f227083h0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (mMPAGView2 != null) {
                try {
                    mMPAGView2.i(yVar);
                    mMPAGView2.j(xVar);
                    mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.b0(mMPAGView2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.tencent.mars.xlog.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.tencent.mars.xlog.Log.w(j(), "resetAndRemovePAGView, snsAdRockPaperScissorsPAGView is not created");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    public final void X(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            return;
        }
        d84.l0 l0Var = this.f227093v;
        if (l0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) l0Var.f227114m).a(l0Var, d84.l0.f227101o[2]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
        } else {
            adClickActionInfo = null;
        }
        if (adClickActionInfo != null) {
            adClickActionInfo.f162569a = 35;
            w64.n nVar = this.f227089r;
            if (nVar != null) {
                nVar.n(adClickActionInfo, snsInfo);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.E).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (view != null) {
            view.setOnClickListener(new d84.i0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        java.lang.String str;
        android.content.Context context;
        java.lang.String str2;
        java.lang.String str3;
        d84.l0 l0Var;
        java.lang.String str4;
        mb4.e eVar;
        r45.jj4 b17;
        r45.jj4 jj4Var;
        int i17;
        java.lang.String str5;
        int e17;
        s34.g1 g1Var;
        kotlin.coroutines.Continuation continuation;
        s34.g1 g1Var2;
        mb4.e eVar2;
        mb4.e eVar3;
        mb4.e eVar4;
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        kotlin.jvm.internal.o.g(model, "model");
        android.view.View view = this.f227086o;
        if (view == null || (context = view.getContext()) == null) {
            str = "bindComponentModel";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        } else {
            this.f227091t = context;
            java.lang.String j17 = j();
            try {
                if (!this.f227094w) {
                    try {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRockPaperScissorsStub", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f227095x).getValue();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRockPaperScissorsStub", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        android.view.View h17 = a84.y0.h(viewStub);
                        this.f227096y = h17 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) h17 : null;
                        this.f227094w = true;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = j17;
                        str = "bindComponentModel";
                    }
                }
                this.f227092u = model;
                l0Var = model.getAdXml().adRockPaperScissorsInfo;
            } catch (java.lang.Throwable th7) {
                th = th7;
                str2 = j17;
                str = "bindComponentModel";
            }
            if (l0Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                str = "bindComponentModel";
            } else {
                this.f227093v = l0Var;
                this.Q = ca4.m0.y(j(), this.f227091t, this.f227087p, this.f227088q);
                d84.l0 l0Var2 = this.f227093v;
                int i18 = l0Var2 != null ? l0Var2.f227102a : 0;
                int i19 = l0Var2 != null ? l0Var2.f227103b : 0;
                com.tencent.mars.xlog.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.field_snsId) + ", isSame is " + z17 + ", containerWidth is " + i18 + ", containerHeight is " + i19);
                if (i18 <= 0 || i19 <= 0) {
                    str2 = j17;
                    str = "bindComponentModel";
                    try {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                    }
                } else {
                    try {
                        android.widget.LinearLayout linearLayout2 = this.f227096y;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(4);
                        }
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f227077b0;
                        if (baseViewHolder != null && (linearLayout = this.f227096y) != null) {
                            linearLayout.setTag(baseViewHolder);
                        }
                        android.widget.ImageView O = O();
                        if (O != null) {
                            O.setVisibility(0);
                        }
                        android.widget.ImageView P = P();
                        if (P != null) {
                            P.setVisibility(0);
                        }
                        android.widget.ImageView N = N();
                        if (N != null) {
                            N.setVisibility(0);
                        }
                        com.tencent.mm.ui.widget.RoundCornerFrameLayout Q = Q();
                        if (Q != null) {
                            Q.setRadius(i65.a.b(this.f227091t, 8));
                        }
                        com.tencent.mm.ui.widget.RoundCornerFrameLayout Q2 = Q();
                        int i27 = this.Q;
                        int i28 = i19;
                        int i29 = i18;
                        str2 = j17;
                        str4 = "bindComponentModel";
                        try {
                            I(this, Q2, i27, (i27 * i19) / i18, 0, 0, 0, 0, 120, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.view.View view2 = (android.view.View) ((jz5.n) this.E).getValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            int i37 = this.Q;
                            int i38 = (int) (i37 * 0.5f);
                            I(this, view2, i38, (i37 * i28) / i29, i38, 0, 0, 0, 112, null);
                            if (com.tencent.mm.ui.bk.C()) {
                                d84.l0 l0Var3 = this.f227093v;
                                if (l0Var3 != null && (eVar4 = l0Var3.f227105d) != null) {
                                    b17 = eVar4.b();
                                    jj4Var = b17;
                                }
                                jj4Var = null;
                            } else {
                                d84.l0 l0Var4 = this.f227093v;
                                if (l0Var4 != null && (eVar = l0Var4.f227104c) != null) {
                                    b17 = eVar.b();
                                    jj4Var = b17;
                                }
                                jj4Var = null;
                            }
                            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                            android.widget.ImageView N2 = N();
                            android.content.Context context2 = this.f227091t;
                            int hashCode = context2 != null ? context2.hashCode() : 0;
                            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
                            s7Var.f195313b = model.getTimeLine().CreateTime;
                            hj6.W(jj4Var, N2, -1, hashCode, s7Var);
                            com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
                            d84.l0 l0Var5 = this.f227093v;
                            r45.jj4 b18 = (l0Var5 == null || (eVar3 = l0Var5.f227112k) == null) ? null : eVar3.b();
                            android.widget.ImageView O2 = O();
                            android.content.Context context3 = this.f227091t;
                            int hashCode2 = context3 != null ? context3.hashCode() : 0;
                            s7Var.f195313b = model.getTimeLine().CreateTime;
                            hj7.W(b18, O2, -1, hashCode2, s7Var);
                            com.tencent.mm.plugin.sns.model.i1 hj8 = com.tencent.mm.plugin.sns.model.l4.hj();
                            d84.l0 l0Var6 = this.f227093v;
                            r45.jj4 b19 = (l0Var6 == null || (eVar2 = l0Var6.f227113l) == null) ? null : eVar2.b();
                            android.widget.ImageView P2 = P();
                            android.content.Context context4 = this.f227091t;
                            int hashCode3 = context4 != null ? context4.hashCode() : 0;
                            s7Var.f195313b = model.getTimeLine().CreateTime;
                            hj8.W(b19, P2, -1, hashCode3, s7Var);
                            if (com.tencent.mm.ui.bk.C()) {
                                d84.l0 l0Var7 = this.f227093v;
                                if (l0Var7 != null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                    java.lang.String str6 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) l0Var7.f227109h).a(l0Var7, d84.l0.f227101o[1]);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                    str5 = str6;
                                } else {
                                    str5 = null;
                                }
                                i17 = 0;
                            } else {
                                d84.l0 l0Var8 = this.f227093v;
                                if (l0Var8 != null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                    i17 = 0;
                                    str5 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) l0Var8.f227108g).a(l0Var8, d84.l0.f227101o[0]);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
                                } else {
                                    i17 = 0;
                                    str5 = null;
                                }
                            }
                            this.T = i65.a.b(this.f227091t, 8);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            jz5.g gVar = this.M;
                            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).getValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            a84.m.b(str5, imageView);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            jz5.g gVar2 = this.N;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            a84.m.b(str5, imageView2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.widget.ImageView imageView3 = (android.widget.ImageView) ((jz5.n) gVar).getValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLeftImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            int i39 = this.T;
                            int i47 = i17;
                            I(this, imageView3, i39, i39, 0, 0, 0, 0, 120, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.widget.ImageView imageView4 = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRightImg", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            int i48 = this.T;
                            I(this, imageView4, i48, i48, 0, 0, 0, 0, 120, null);
                            if (com.tencent.mm.ui.bk.C()) {
                                d84.l0 l0Var9 = this.f227093v;
                                e17 = ca4.n0.e((l0Var9 == null || (g1Var2 = l0Var9.f227107f) == null) ? null : g1Var2.b(), android.graphics.Color.parseColor("#D39A4A"));
                            } else {
                                d84.l0 l0Var10 = this.f227093v;
                                e17 = ca4.n0.e((l0Var10 == null || (g1Var = l0Var10.f227107f) == null) ? null : g1Var.a(), android.graphics.Color.parseColor("#D39A4A"));
                            }
                            float b27 = i65.a.b(this.f227091t, 17);
                            float b28 = i65.a.b(this.f227091t, 14) * i65.a.q(this.f227091t);
                            this.U = b28 > b27 ? b27 : b28;
                            com.tencent.mars.xlog.Log.i(j(), "bindComponentModel, currentSizePx is " + b28 + ", maxSizePx is " + b27 + ", mTryMaxSizePx is " + this.U);
                            android.widget.TextView R = R();
                            if (R != null) {
                                d84.l0 l0Var11 = this.f227093v;
                                R.setText(l0Var11 != null ? l0Var11.f227106e : null);
                                R.setTextColor(e17);
                                R.setTextSize(i47, this.U);
                            }
                            android.widget.TextView M = M();
                            if (M != null) {
                                d84.l0 l0Var12 = this.f227093v;
                                M.setText(l0Var12 != null ? l0Var12.f227110i : null);
                                M.setTextSize(i47, this.U);
                            }
                            this.V = i65.a.b(this.f227091t, 4);
                            android.widget.TextView R2 = R();
                            int i49 = this.T;
                            J(R2, i49, 0, i49, 0);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRockPaperScissorsBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ((jz5.n) this.B).getValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRockPaperScissorsBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            K(this, linearLayout3, 0, i65.a.b(this.f227091t, 12), 0, 0, 24, null);
                            K(this, M(), 0, this.V, 0, 0, 24, null);
                            L();
                            S(model);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            kotlinx.coroutines.y0 h18 = h();
                            if (h18 != null) {
                                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                                continuation = null;
                                kotlinx.coroutines.l.d(h18, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new d84.h(model, this, null), 2, null);
                            } else {
                                continuation = null;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            X(this.f227091t, model);
                            G();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAtCommentClick", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            kotlinx.coroutines.y0 h19 = h();
                            if (h19 != null) {
                                kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                                kotlinx.coroutines.l.d(h19, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new d84.d(this, continuation), 2, null);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAtCommentClick", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            this.X = true;
                            str = str4;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            str = str4;
                            str3 = str2;
                            ca4.q.c(str3, th);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        str2 = j17;
                        str4 = "bindComponentModel";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                }
                str3 = str2;
                ca4.q.c(str3, th);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void s(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        kotlin.jvm.internal.o.g(model, "model");
        super.s(model);
        if (this.X) {
            com.tencent.mars.xlog.Log.i(j(), "onResume, requestDynamicData");
            S(model);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        T();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
    }
}
