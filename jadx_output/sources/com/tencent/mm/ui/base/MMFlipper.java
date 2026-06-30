package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMFlipper extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Scroller f197342d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.VelocityTracker f197343e;

    /* renamed from: f, reason: collision with root package name */
    public int f197344f;

    /* renamed from: g, reason: collision with root package name */
    public int f197345g;

    /* renamed from: h, reason: collision with root package name */
    public int f197346h;

    /* renamed from: i, reason: collision with root package name */
    public int f197347i;

    /* renamed from: m, reason: collision with root package name */
    public int f197348m;

    /* renamed from: n, reason: collision with root package name */
    public float f197349n;

    /* renamed from: o, reason: collision with root package name */
    public float f197350o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197351p;

    /* renamed from: q, reason: collision with root package name */
    public db5.z1 f197352q;

    /* renamed from: r, reason: collision with root package name */
    public db5.x1 f197353r;

    /* renamed from: s, reason: collision with root package name */
    public db5.y1 f197354s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.Interpolator f197355t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f197356u;

    public MMFlipper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        b(context);
    }

    public void a(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        this.f197351p = false;
        if (!this.f197342d.isFinished()) {
            this.f197342d.abortAnimation();
        }
        this.f197345g = this.f197344f;
        this.f197344f = max;
        scrollTo(max * getWidth(), 0);
    }

    public final void b(android.content.Context context) {
        this.f197355t = getInterpolator();
        this.f197342d = new android.widget.Scroller(context, this.f197355t);
        this.f197345g = -1;
        this.f197344f = 0;
        this.f197346h = 0;
        this.f197348m = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public void c(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        if (getScrollX() != getWidth() * max) {
            this.f197342d.startScroll(getScrollX(), 0, (getWidth() * max) - getScrollX(), 0, i65.a.c(getContext(), (int) (java.lang.Math.abs(r6) * 1.3f)));
            int i18 = this.f197344f;
            if (i18 != max) {
                this.f197351p = true;
                this.f197346h += max - i18;
            }
            this.f197345g = i18;
            this.f197344f = max;
            invalidate();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f197342d.getCurrX();
        if (this.f197342d.computeScrollOffset()) {
            scrollTo(this.f197342d.getCurrX(), this.f197342d.getCurrY());
            postInvalidate();
            return;
        }
        if (this.f197351p) {
            this.f197351p = false;
            db5.z1 z1Var = this.f197352q;
            if (z1Var != null) {
                z1Var.a(this.f197345g, this.f197346h, true);
                return;
            }
            return;
        }
        db5.x1 x1Var = this.f197353r;
        if (x1Var == null || this.f197349n != 0.0f || this.f197345g == this.f197344f) {
            return;
        }
        int i17 = this.f197346h;
        com.tencent.mm.pluginsdk.ui.chat.h hVar = (com.tencent.mm.pluginsdk.ui.chat.h) x1Var;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "viewpage reshow %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = hVar.f190337a;
        int s17 = appPanel.s(15);
        if (i17 == s17 && appPanel.C.A.f190766a) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Di(s17 + 1);
        }
    }

    public int getCurScreen() {
        return this.f197344f;
    }

    public android.view.animation.Interpolator getInterpolator() {
        return new db5.a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 != 3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f197356u
            if (r0 != 0) goto L9
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L9:
            int r0 = r5.getChildCount()
            r1 = 1
            if (r0 != r1) goto L15
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L15:
            int r0 = r6.getAction()
            r2 = 2
            if (r0 != r2) goto L21
            int r3 = r5.f197347i
            if (r3 == 0) goto L21
            return r1
        L21:
            float r3 = r6.getX()
            float r6 = r6.getY()
            r4 = 0
            if (r0 == 0) goto L58
            if (r0 == r1) goto L55
            if (r0 == r2) goto L34
            r6 = 3
            if (r0 == r6) goto L55
            goto L65
        L34:
            float r0 = r5.f197349n
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            float r2 = r5.f197350o
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            int r6 = (int) r6
            int r2 = r5.f197348m
            if (r0 <= r2) goto L4c
            if (r6 >= r2) goto L4c
            r6 = r1
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 == 0) goto L52
            r5.f197347i = r1
            goto L65
        L52:
            r5.f197347i = r4
            goto L65
        L55:
            r5.f197347i = r4
            goto L65
        L58:
            r5.f197349n = r3
            r5.f197350o = r6
            android.widget.Scroller r6 = r5.f197342d
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r1
            r5.f197347i = r6
        L65:
            int r6 = r5.f197347i
            if (r6 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r4
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMFlipper.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth() + i28;
                childAt.layout(i28, 0, measuredWidth, childAt.getMeasuredHeight());
                i28 = measuredWidth;
            }
        }
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        db5.y1 y1Var = this.f197354s;
        if (y1Var != null) {
            y1Var.a(size, size2);
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            getChildAt(i19).measure(i17, i18);
        }
        scrollTo(this.f197344f * size, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFlipper", "flipper onMeasure:" + size + "," + android.view.View.MeasureSpec.getSize(i18) + " childCount:" + childCount + ", use " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 != r1) goto Lc
            boolean r5 = super.onTouchEvent(r5)
            return r5
        Lc:
            android.view.VelocityTracker r0 = r4.f197343e
            if (r0 != 0) goto L16
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.f197343e = r0
        L16:
            android.view.VelocityTracker r0 = r4.f197343e
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r2 = r5.getX()
            r5.getY()
            if (r0 == 0) goto L8a
            r5 = 0
            if (r0 == r1) goto L3c
            r3 = 2
            if (r0 == r3) goto L32
            r2 = 3
            if (r0 == r2) goto L3c
            goto L99
        L32:
            float r0 = r4.f197349n
            float r0 = r0 - r2
            int r0 = (int) r0
            r4.f197349n = r2
            r4.scrollBy(r0, r5)
            goto L99
        L3c:
            android.view.VelocityTracker r0 = r4.f197343e
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2)
            float r0 = r0.getXVelocity()
            int r0 = (int) r0
            r2 = 600(0x258, float:8.41E-43)
            if (r0 <= r2) goto L55
            int r2 = r4.f197344f
            if (r2 <= 0) goto L55
            int r2 = r2 - r1
            r4.c(r2)
            goto L78
        L55:
            r2 = -600(0xfffffffffffffda8, float:NaN)
            if (r0 >= r2) goto L69
            int r0 = r4.f197344f
            int r2 = r4.getChildCount()
            int r2 = r2 - r1
            if (r0 >= r2) goto L69
            int r0 = r4.f197344f
            int r0 = r0 + r1
            r4.c(r0)
            goto L78
        L69:
            int r0 = r4.getWidth()
            int r2 = r4.getScrollX()
            int r3 = r0 / 2
            int r2 = r2 + r3
            int r2 = r2 / r0
            r4.c(r2)
        L78:
            android.view.VelocityTracker r0 = r4.f197343e
            if (r0 == 0) goto L82
            r0.recycle()
            r0 = 0
            r4.f197343e = r0
        L82:
            r4.f197347i = r5
            r5 = 0
            r4.f197349n = r5
            r4.f197350o = r5
            goto L99
        L8a:
            android.widget.Scroller r5 = r4.f197342d
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto L97
            android.widget.Scroller r5 = r4.f197342d
            r5.abortAnimation()
        L97:
            r4.f197349n = r2
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMFlipper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnFlipperViewShowedListener(db5.x1 x1Var) {
        this.f197353r = x1Var;
    }

    public void setOnMeasureListener(db5.y1 y1Var) {
        this.f197354s = y1Var;
    }

    public void setOnScreenChangedListener(db5.z1 z1Var) {
        this.f197352q = z1Var;
    }

    public void setScrollEnable(boolean z17) {
        this.f197356u = z17;
    }

    public void setToScreen(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        this.f197351p = false;
        if (!this.f197342d.isFinished()) {
            this.f197342d.abortAnimation();
        }
        db5.z1 z1Var = this.f197352q;
        if (z1Var != null) {
            z1Var.a(this.f197345g, max, false);
        }
        this.f197345g = this.f197344f;
        this.f197344f = max;
        this.f197346h = max;
        scrollTo(max * getWidth(), 0);
    }

    public MMFlipper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197347i = 0;
        this.f197351p = false;
        this.f197356u = true;
        b(context);
    }
}
