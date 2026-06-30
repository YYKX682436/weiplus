package com.tencent.mm.ui.widget.listview;

/* loaded from: classes11.dex */
public class PullDownListView extends android.widget.ListView implements android.widget.AdapterView.OnItemLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemSelectedListener, xn5.a0 {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f212146y1 = 0;
    public int A;
    public int B;
    public boolean C;
    public float D;
    public float E;
    public android.view.View F;
    public android.view.View G;
    public float H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f212147J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public int P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public ql5.m f212148d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f212149e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f212150f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f212151g;

    /* renamed from: h, reason: collision with root package name */
    public final float f212152h;

    /* renamed from: i, reason: collision with root package name */
    public final float f212153i;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f212154l1;

    /* renamed from: m, reason: collision with root package name */
    public int f212155m;

    /* renamed from: n, reason: collision with root package name */
    public int f212156n;

    /* renamed from: o, reason: collision with root package name */
    public int f212157o;

    /* renamed from: p, reason: collision with root package name */
    public float f212158p;

    /* renamed from: p0, reason: collision with root package name */
    public long f212159p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f212160p1;

    /* renamed from: q, reason: collision with root package name */
    public float f212161q;

    /* renamed from: r, reason: collision with root package name */
    public android.os.Vibrator f212162r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f212163s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f212164t;

    /* renamed from: u, reason: collision with root package name */
    public float f212165u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f212166v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f212167w;

    /* renamed from: x, reason: collision with root package name */
    public int f212168x;

    /* renamed from: x0, reason: collision with root package name */
    public long f212169x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f212170x1;

    /* renamed from: y, reason: collision with root package name */
    public int f212171y;

    /* renamed from: y0, reason: collision with root package name */
    public ql5.n f212172y0;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback f212173z;

    /* loaded from: classes11.dex */
    public interface IPullDownCallback {
        void b(int i17);

        void e();

        void j(int i17);

        void onPostClose();

        void onPostOpen(boolean z17);

        void onPreClose();

        void onPreOpen();

        void p();

        void q(int i17);
    }

    public PullDownListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212149e = false;
        this.f212150f = false;
        this.f212151g = true;
        this.f212152h = 0.05f;
        this.f212153i = 0.05f;
        this.f212155m = 0;
        this.f212156n = 0;
        this.f212157o = 0;
        this.f212158p = 0.0f;
        this.f212161q = 0.0f;
        this.f212163s = true;
        this.f212167w = new android.graphics.Rect();
        this.f212168x = 0;
        this.f212171y = 0;
        this.C = false;
        this.H = 0.0f;
        this.I = false;
        this.f212147J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = 0.0f;
        this.P = 0;
        this.Q = 0;
        this.R = false;
        this.S = 0.0f;
        this.T = -1;
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.f212159p0 = 0L;
        this.f212169x0 = 0L;
        this.f212172y0 = null;
        super.setOnItemClickListener(this);
        super.setOnItemLongClickListener(this);
        super.setOnItemSelectedListener(this);
        com.tencent.mm.ui.bl.b(context);
        this.f212157o = com.tencent.mm.ui.bl.b(context).y;
        this.f212162r = (android.os.Vibrator) getContext().getSystemService("vibrator");
        post(new ql5.j(this));
    }

    public final boolean b(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (this.f212166v == null) {
            return false;
        }
        if (motionEvent.getActionMasked() == 1 && this.f212169x0 < 200) {
            return false;
        }
        if (this.E < this.f212166v.getRight()) {
            if (rawX <= this.f212166v.getLeft() || rawX >= this.f212166v.getRight() || rawY <= this.f212166v.getTop() - (this.f212166v.getHeight() / 2) || rawY >= this.f212166v.getBottom() + this.f212171y) {
                return false;
            }
        } else if (rawX <= this.f212166v.getLeft() || rawX >= this.f212166v.getRight() || rawY <= this.f212166v.getTop() || rawY >= this.f212166v.getBottom() + this.f212171y) {
            return false;
        }
        return true;
    }

    public final int c() {
        if (this.f212156n == 0) {
            this.f212156n = (int) ((this.f212157o - this.Q) * (1.0f - this.f212153i));
        }
        return this.f212156n;
    }

    public final android.animation.ValueAnimator d(int i17, int i18) {
        com.tencent.mm.ui.yk.a("MicroMsg.PullDownListView", "startStoryGalleryOpenAnim start:%s, end:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.addUpdateListener(new ql5.l(this));
        return ofInt;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f() {
        android.view.View view = this.f212166v;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/listview/PullDownListView", "hideMuteViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/listview/PullDownListView", "hideMuteViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final int g() {
        if (this.f212155m == 0) {
            this.f212155m = (int) (this.f212157o * this.f212152h);
        }
        return this.f212155m;
    }

    public void h() {
        this.f212168x = 0;
        com.tencent.mm.ui.yk.a("MicroMsg.PullDownListView", "startAnimation %s %s %s %s", java.lang.Integer.valueOf(this.f212164t.getLeft()), java.lang.Integer.valueOf(this.f212164t.getTop()), java.lang.Integer.valueOf(this.f212164t.getRight()), java.lang.Integer.valueOf(this.f212164t.getBottom()));
    }

    public final void i() {
        android.view.View view = this.f212166v;
        if (view != null) {
            view.setTranslationX(this.f212158p);
            this.f212166v.setTranslationY(this.f212161q);
            android.view.View view2 = this.f212166v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/listview/PullDownListView", "resetMuteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/widget/listview/PullDownListView", "resetMuteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final int j(int i17) {
        float f17 = i17;
        int abs = (int) java.lang.Math.abs((f17 / this.f212157o) * this.P);
        com.tencent.mm.ui.yk.a("MicroMsg.PullDownListView", "offset:%s,  ((float) offset / screenHeight):%s,  Math.abs(mCoordinationAnimThreshold):%s,  result:%s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17 / this.f212157o), java.lang.Integer.valueOf(java.lang.Math.abs(this.P)), java.lang.Integer.valueOf(abs));
        return abs;
    }

    public final void k(int i17, int i18, boolean z17) {
        android.graphics.Rect rect = this.f212167w;
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "story_cat animation: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom), java.lang.Integer.valueOf(getLeft()), java.lang.Integer.valueOf(getTop()), java.lang.Integer.valueOf(getRight()), java.lang.Integer.valueOf(getBottom()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()), java.lang.Boolean.valueOf(z17));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.animation.ObjectAnimator.ofFloat(this, "translationY", i17, i18));
        if (this.F != null && i17 > g() && i17 < c()) {
            int height = this.F.getHeight();
            android.animation.ObjectAnimator ofFloat = i18 != 0 ? android.animation.ObjectAnimator.ofFloat(this.F, "translationY", 0.0f, height) : android.animation.ObjectAnimator.ofFloat(this.F, "translationY", height, 0.0f);
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: ql5.h$$a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    int i19 = com.tencent.mm.ui.widget.listview.PullDownListView.f212146y1;
                    com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = com.tencent.mm.ui.widget.listview.PullDownListView.this;
                    pullDownListView.getClass();
                    float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    ql5.m mVar = pullDownListView.f212148d;
                    if (mVar != null) {
                        mVar.a(floatValue);
                    }
                }
            });
            arrayList.add(ofFloat);
        }
        if (this.G != null) {
            if (i18 >= getBottom()) {
                arrayList.add(d(((android.view.ViewGroup.MarginLayoutParams) this.G.getLayoutParams()).topMargin, 0));
            } else {
                arrayList.add(d(((android.view.ViewGroup.MarginLayoutParams) this.G.getLayoutParams()).topMargin, this.P));
            }
        }
        animatorSet.addListener(new com.tencent.mm.ui.widget.listview.a(this, i17, i18, z17));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.start();
        h();
    }

    public final void l(int i17, int i18, boolean z17) {
        android.graphics.Rect rect = this.f212167w;
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "story_cat startAnimationImmediately: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom), java.lang.Integer.valueOf(getLeft()), java.lang.Integer.valueOf(getTop()), java.lang.Integer.valueOf(getRight()), java.lang.Integer.valueOf(getBottom()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()), java.lang.Boolean.valueOf(z17));
        float f17 = i18;
        setTranslationY(f17);
        if (this.F != null && i17 > g() && i17 < c()) {
            if (i18 != 0) {
                this.F.setTranslationY(f17);
            } else {
                this.F.setTranslationY(i18 - this.f212171y);
            }
        }
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onImmeStart start:%s, openLimitPx():%s, closeLimitPx():%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()));
        this.K = true;
        if (i18 == 0) {
            this.f212147J = true;
        } else {
            this.f212147J = false;
        }
        if (this.f212173z != null && i17 > g() && i17 < c()) {
            if (this.f212147J) {
                this.f212173z.onPreClose();
            } else {
                this.f212173z.onPreOpen();
            }
        }
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onImmeEnd start:%s, openLimitPx():%s, closeLimitPx():%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()));
        this.I = false;
        this.K = false;
        this.L = false;
        this.M = false;
        if (this.f212173z != null && i17 > g() && i17 < c()) {
            if (this.f212147J) {
                this.f212173z.onPostClose();
            } else {
                this.f212173z.onPostOpen(z17);
            }
        }
        h();
    }

    public final void m() {
        android.view.View view = this.f212166v;
        if (view != null) {
            float translationX = view.getTranslationX();
            float translationY = this.f212166v.getTranslationY();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f212166v, "translationX", translationX, this.f212158p);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f212166v, "translationY", translationY, this.f212161q);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new ql5.k(this));
            animatorSet.start();
        }
    }

    public void n() {
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "switchNormalStatus", new java.lang.Object[0]);
        if (this.f212147J) {
            return;
        }
        if (this.f212150f) {
            k((int) (this.A * (1.0f - this.f212153i)), 0, false);
        } else {
            k(c() - 1, 0, false);
        }
    }

    public void o() {
        setSelectionFromTop(0, 0);
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "switchPullDownStatus", new java.lang.Object[0]);
        if (this.f212147J) {
            if (!this.f212150f) {
                k(g() + 1, this.f212164t.getBottom() + this.f212171y, false);
            } else {
                k(g() + 1, this.A, false);
            }
        }
    }

    @Override // android.widget.ListView, android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f212164t = this;
        getTranslationY();
        com.tencent.mm.ui.yk.a("MicroMsg.PullDownListView", "onFinishInflate %s %s %s %s", java.lang.Integer.valueOf(this.f212164t.getLeft()), java.lang.Integer.valueOf(this.f212164t.getTop()), java.lang.Integer.valueOf(this.f212164t.getRight()), java.lang.Integer.valueOf(this.f212164t.getBottom()));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f212147J || !this.f212150f || motionEvent.getRawY() <= this.B) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onItemClick isMove:%s isVisible:%s mIsNeedHover:%s position:%s mItemClickListener:%s isAnima:%s", java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(this.f212147J), java.lang.Boolean.valueOf(this.f212150f), java.lang.Integer.valueOf(i17), this.f212154l1, java.lang.Boolean.valueOf(this.K));
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f212154l1;
        if (onItemClickListener == null || this.I || !this.f212147J || this.K) {
            return;
        }
        this.C = true;
        onItemClickListener.onItemClick(adapterView, view, i17, j17);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = this.f212160p1;
        if (onItemLongClickListener == null) {
            return false;
        }
        if (!this.f212147J && !this.f212150f) {
            return false;
        }
        this.C = true;
        return onItemLongClickListener.onItemLongClick(adapterView, view, i17, j17);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/listview/PullDownListView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f212170x1;
        if (onItemSelectedListener != null && !this.I && this.f212147J && !this.K) {
            this.C = true;
            onItemSelectedListener.onItemSelected(adapterView, view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/listview/PullDownListView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f212170x1;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0622 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0623 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.listview.PullDownListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMuteView(android.view.View view) {
        if (view != null) {
            post(new ql5.i(this, view));
        } else {
            this.f212158p = 0.0f;
            this.f212161q = 0.0f;
        }
        this.f212166v = view;
    }

    public void setNavigationBarHeight(int i17) {
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "setNavigationBarHeight=%s", java.lang.Integer.valueOf(i17));
        this.f212171y = i17;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f212154l1 = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f212160p1 = onItemLongClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f212170x1 = onItemSelectedListener;
    }

    public void setOnTabViewTranslationListener(ql5.m mVar) {
        this.f212148d = mVar;
    }

    public void setSupportOverscroll(boolean z17) {
        this.f212149e = z17;
    }

    public void setTabView(android.view.View view) {
        this.F = view;
    }

    public void setTranslationListener(ql5.n nVar) {
        this.f212172y0 = nVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f17) {
        super.setTranslationY(f17);
        ql5.n nVar = this.f212172y0;
        if (nVar != null) {
            nVar.a(f17);
        }
    }
}
