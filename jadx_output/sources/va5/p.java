package va5;

/* loaded from: classes11.dex */
public class p extends android.widget.LinearLayout {
    public static final /* synthetic */ int P = 0;
    public android.widget.OverScroller A;
    public oa5.b B;
    public android.widget.OverScroller C;
    public oa5.b D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public va5.b I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f434421J;
    public java.lang.Runnable K;
    public va5.g L;
    public boolean M;
    public float N;

    /* renamed from: d, reason: collision with root package name */
    public int f434422d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f434423e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f434424f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f434425g;

    /* renamed from: h, reason: collision with root package name */
    public final va5.v f434426h;

    /* renamed from: i, reason: collision with root package name */
    public int f434427i;

    /* renamed from: m, reason: collision with root package name */
    public int f434428m;

    /* renamed from: n, reason: collision with root package name */
    public float f434429n;

    /* renamed from: o, reason: collision with root package name */
    public float f434430o;

    /* renamed from: p, reason: collision with root package name */
    public int f434431p;

    /* renamed from: q, reason: collision with root package name */
    public n3.q f434432q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f434433r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f434434s;

    /* renamed from: t, reason: collision with root package name */
    public int f434435t;

    /* renamed from: u, reason: collision with root package name */
    public final int f434436u;

    /* renamed from: v, reason: collision with root package name */
    public final int f434437v;

    /* renamed from: w, reason: collision with root package name */
    public final int f434438w;

    /* renamed from: x, reason: collision with root package name */
    public final int f434439x;

    /* renamed from: y, reason: collision with root package name */
    public final int f434440y;

    /* renamed from: z, reason: collision with root package name */
    public final int f434441z;

    static {
        new va5.d(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View contentView, va5.v menuView, java.lang.Integer num, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2) {
        super(contentView.getContext());
        kotlin.jvm.internal.o.g(contentView, "contentView");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        this.f434422d = 1;
        this.f434423e = "MicroMsg.SwipeMenuLayout";
        this.f434436u = ym5.x.a(getContext(), 15.0f);
        this.f434437v = ym5.x.a(getContext(), 15.0f);
        this.f434438w = ym5.x.a(getContext(), 30.0f);
        this.f434439x = -ym5.x.a(getContext(), 500.0f);
        this.f434440y = ym5.x.a(getContext(), 32.0f);
        this.f434441z = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        this.N = 0.8f;
        this.f434424f = contentView;
        this.f434426h = menuView;
        menuView.setLayout(this);
        this.f434425g = contentView.findViewById(com.tencent.mm.R.id.d0v);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f434435t = viewConfiguration.getScaledPagingTouchSlop();
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        this.f434432q = new n3.q(getContext(), new va5.h(this));
        this.C = interpolator != null ? new android.widget.OverScroller(getContext(), interpolator) : new android.widget.OverScroller(getContext(), new va5.e());
        this.A = interpolator2 != null ? new android.widget.OverScroller(getContext(), interpolator2) : new android.widget.OverScroller(getContext(), new va5.f(1.0f, 0.3f));
        contentView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        int mTotalMenuWidth = menuView.getMTotalMenuWidth();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(mTotalMenuWidth <= 0 ? -2 : mTotalMenuWidth, -2);
        if (num != null) {
            layoutParams.height = num.intValue();
        }
        addView(contentView);
        addView(menuView, layoutParams);
    }

    public static void a(va5.p pVar, int i17, android.graphics.drawable.Drawable newIcon, long j17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateMenuIconSwitch");
        }
        if ((i18 & 4) != 0) {
            j17 = 200;
        }
        pVar.getClass();
        kotlin.jvm.internal.o.g(newIcon, "newIcon");
        va5.v vVar = pVar.f434426h;
        vVar.getClass();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) vVar.findViewById(i17);
        android.widget.ImageView imageView = linearLayout != null ? (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.vb_) : null;
        if (imageView == null) {
            return;
        }
        imageView.post(new va5.t(imageView, j17, newIcon));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ca, code lost:
    
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cd, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.p.b(android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00fb, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r20) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.p.c(int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f434431p != 1) {
            android.widget.OverScroller overScroller = this.C;
            if (overScroller != null && overScroller.computeScrollOffset()) {
                int i17 = this.E;
                android.widget.OverScroller overScroller2 = this.C;
                c((i17 - (overScroller2 != null ? overScroller2.getCurrX() : 0)) * this.f434422d);
                invalidate();
                return;
            }
            return;
        }
        android.widget.OverScroller overScroller3 = this.A;
        if (overScroller3 != null && overScroller3.computeScrollOffset()) {
            android.widget.OverScroller overScroller4 = this.A;
            c((overScroller4 != null ? overScroller4.getCurrX() : 0) * this.f434422d);
            invalidate();
            return;
        }
        if (this.f434421J) {
            android.widget.OverScroller overScroller5 = this.A;
            if (overScroller5 != null && overScroller5.isFinished()) {
                r1 = 1;
            }
            if (r1 == 0 || !this.f434421J) {
                return;
            }
            java.lang.Runnable runnable = this.K;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.K = null;
            }
            va5.o oVar = new va5.o(this);
            this.K = oVar;
            postDelayed(oVar, 150L);
        }
    }

    public final android.view.View getContentView() {
        return this.f434424f;
    }

    public final int getExpandIndex() {
        return this.f434426h.getExpandIndex();
    }

    public final va5.v getMenuView() {
        return this.f434426h;
    }

    public final int getPosition() {
        return this.F;
    }

    public final boolean getSwipeEnable() {
        return this.f434434s;
    }

    public final float getSwipeThresholdRatio() {
        return this.N;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        android.widget.OverScroller overScroller;
        android.widget.OverScroller overScroller2;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (!this.f434434s) {
            return super.onInterceptTouchEvent(ev6);
        }
        int action = ev6.getAction();
        boolean z17 = false;
        if (action == 0) {
            this.f434427i = (int) ev6.getX();
            this.f434428m = (int) ev6.getY();
            this.f434429n = ev6.getX();
            this.f434430o = 0.0f;
            this.G = false;
            this.H = false;
            this.f434433r = false;
            this.M = false;
            java.lang.Runnable runnable = this.K;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.K = null;
            }
        } else if (action == 2) {
            float abs = java.lang.Math.abs(ev6.getX() - this.f434427i);
            float abs2 = java.lang.Math.abs(ev6.getY() - this.f434428m);
            if (abs > this.f434435t && abs > abs2 * 2.19f) {
                android.widget.OverScroller overScroller3 = this.A;
                if ((overScroller3 != null && overScroller3.computeScrollOffset()) && (overScroller2 = this.A) != null) {
                    overScroller2.abortAnimation();
                }
                android.widget.OverScroller overScroller4 = this.C;
                if (overScroller4 != null && overScroller4.computeScrollOffset()) {
                    z17 = true;
                }
                if (z17 && (overScroller = this.C) != null) {
                    overScroller.abortAnimation();
                }
                oa5.b bVar = this.D;
                if (bVar != null) {
                    bVar.c();
                }
                this.D = null;
                oa5.b bVar2 = this.B;
                if (bVar2 != null) {
                    bVar2.c();
                }
                this.B = null;
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f434429n = ev6.getX();
                this.f434430o = 0.0f;
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r0 != 3) goto L95;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.p.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAutoCloseMode(boolean z17) {
        this.f434421J = z17;
    }

    public final void setOnMenuStateChangeListener(va5.b onMenuStateChangeListener) {
        kotlin.jvm.internal.o.g(onMenuStateChangeListener, "onMenuStateChangeListener");
        this.I = onMenuStateChangeListener;
    }

    public final void setOnSwipeThresholdListener(va5.g gVar) {
        this.L = gVar;
    }

    public final void setPosition(int i17) {
        this.F = i17;
        this.f434426h.setPosition(i17);
    }

    public final void setSwipeDirection(int i17) {
        this.f434422d = i17;
    }

    public final void setSwipeEnable(boolean z17) {
        this.f434434s = z17;
    }

    public final void setSwipeThresholdRatio(float f17) {
        this.N = e06.p.e(f17, 0.0f, 1.0f);
    }
}
