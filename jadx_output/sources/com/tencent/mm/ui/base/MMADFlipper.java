package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMADFlipper extends android.view.ViewGroup implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f197296d;

    /* renamed from: e, reason: collision with root package name */
    public int f197297e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f197298f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Scroller f197299g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Interpolator f197300h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.VelocityTracker f197301i;

    /* renamed from: m, reason: collision with root package name */
    public int f197302m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f197303n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f197304o;

    /* renamed from: p, reason: collision with root package name */
    public float f197305p;

    /* renamed from: q, reason: collision with root package name */
    public float f197306q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197307r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f197308s;

    public MMADFlipper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private android.view.animation.Interpolator getInterpolator() {
        return new android.view.animation.LinearInterpolator();
    }

    public void a(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        if (getScrollX() != getWidth() * max) {
            int width = (max * getWidth()) - getScrollX();
            this.f197299g.startScroll(getScrollX(), 0, width, 0, i65.a.c(getContext(), java.lang.Math.abs(width) * 2));
            invalidate();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f197299g.computeScrollOffset()) {
            scrollTo(this.f197299g.getCurrX(), this.f197299g.getCurrY());
            postInvalidate();
            return;
        }
        if (this.f197307r) {
            this.f197307r = false;
            int i17 = this.f197302m;
            if (i17 <= 0) {
                int realChildCount = getRealChildCount();
                this.f197302m = realChildCount;
                setScrollXOffest(realChildCount * getWidth());
            } else if (i17 >= getChildCount() - 1) {
                this.f197302m = 1;
                setScrollXOffest(1 * getWidth());
            }
        }
    }

    public int getCurScreen() {
        return this.f197302m;
    }

    public int getRealChildCount() {
        return getChildCount() > 1 ? getChildCount() - 2 : getChildCount();
    }

    public int getRealCurScreen() {
        return getChildCount() > 1 ? this.f197302m - 1 : this.f197302m;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
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
            boolean r0 = r5.f197308s
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
            int r3 = r5.f197296d
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
            float r0 = r5.f197305p
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            float r2 = r5.f197306q
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            int r6 = (int) r6
            int r2 = r5.f197297e
            if (r0 <= r2) goto L4c
            if (r6 >= r2) goto L4c
            r6 = r1
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 == 0) goto L52
            r5.f197296d = r1
            goto L65
        L52:
            r5.f197296d = r4
            goto L65
        L55:
            r5.f197296d = r4
            goto L65
        L58:
            r5.f197305p = r3
            r5.f197306q = r6
            android.widget.Scroller r6 = r5.f197299g
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r1
            r5.f197296d = r6
        L65:
            int r6 = r5.f197296d
            if (r6 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r4
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMADFlipper.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
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
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getSize(i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            getChildAt(i19).measure(i17, i18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 != 3) goto L46;
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
            android.view.VelocityTracker r0 = r4.f197301i
            if (r0 != 0) goto L16
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.f197301i = r0
        L16:
            android.view.VelocityTracker r0 = r4.f197301i
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r5 = r5.getX()
            if (r0 == 0) goto L9c
            r2 = 0
            if (r0 == r1) goto L3b
            r3 = 2
            if (r0 == r3) goto L30
            r5 = 3
            if (r0 == r5) goto L3b
            goto Lab
        L30:
            float r0 = r4.f197305p
            float r0 = r0 - r5
            int r0 = (int) r0
            r4.f197305p = r5
            r4.scrollBy(r0, r2)
            goto Lab
        L3b:
            android.view.VelocityTracker r5 = r4.f197301i
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r0)
            float r5 = r5.getXVelocity()
            int r5 = (int) r5
            r0 = 600(0x258, float:8.41E-43)
            if (r5 <= r0) goto L61
            int r5 = r4.getChildCount()
            if (r5 <= r1) goto L53
            r5 = r1
            goto L54
        L53:
            r5 = r2
        L54:
            if (r5 == 0) goto L5e
            int r5 = r4.f197302m
            int r5 = r5 - r1
            r4.f197302m = r5
            r4.a(r5)
        L5e:
            r4.f197307r = r1
            goto L8a
        L61:
            r0 = -600(0xfffffffffffffda8, float:NaN)
            if (r5 >= r0) goto L7b
            int r5 = r4.getChildCount()
            if (r5 <= r1) goto L6d
            r5 = r1
            goto L6e
        L6d:
            r5 = r2
        L6e:
            if (r5 == 0) goto L78
            int r5 = r4.f197302m
            int r5 = r5 + r1
            r4.f197302m = r5
            r4.a(r5)
        L78:
            r4.f197307r = r1
            goto L8a
        L7b:
            int r5 = r4.getWidth()
            int r0 = r4.getScrollX()
            int r3 = r5 / 2
            int r0 = r0 + r3
            int r0 = r0 / r5
            r4.a(r0)
        L8a:
            android.view.VelocityTracker r5 = r4.f197301i
            if (r5 == 0) goto L94
            r5.recycle()
            r5 = 0
            r4.f197301i = r5
        L94:
            r4.f197296d = r2
            r5 = 0
            r4.f197305p = r5
            r4.f197306q = r5
            goto Lab
        L9c:
            android.widget.Scroller r0 = r4.f197299g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto La9
            android.widget.Scroller r0 = r4.f197299g
            r0.abortAnimation()
        La9:
            r4.f197305p = r5
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMADFlipper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setFooterView(android.view.View view) {
        this.f197304o = view;
    }

    public void setHeaderView(android.view.View view) {
        this.f197303n = view;
    }

    public void setOnScreenChangedListener(db5.i0 i0Var) {
    }

    public void setScrollEnable(boolean z17) {
        this.f197308s = z17;
    }

    public void setScrollXOffest(int i17) {
        setScrollX(i17);
    }

    public MMADFlipper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197296d = 0;
        this.f197307r = false;
        this.f197308s = true;
        this.f197298f = context;
        this.f197300h = getInterpolator();
        this.f197299g = new android.widget.Scroller(this.f197298f, this.f197300h);
        this.f197297e = android.view.ViewConfiguration.get(this.f197298f).getScaledDoubleTapSlop();
    }
}
