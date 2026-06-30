package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMSlideDelView extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public float f197555d;

    /* renamed from: e, reason: collision with root package name */
    public float f197556e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.Scroller f197557f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.VelocityTracker f197558g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f197559h;

    /* renamed from: i, reason: collision with root package name */
    public int f197560i;

    /* renamed from: m, reason: collision with root package name */
    public db5.f6 f197561m;

    /* renamed from: n, reason: collision with root package name */
    public db5.b6 f197562n;

    /* renamed from: o, reason: collision with root package name */
    public db5.c6 f197563o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197564p;

    /* renamed from: q, reason: collision with root package name */
    public db5.a6 f197565q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197566r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f197567s;

    /* renamed from: t, reason: collision with root package name */
    public final int f197568t;

    /* renamed from: u, reason: collision with root package name */
    public final long f197569u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197570v;

    /* renamed from: w, reason: collision with root package name */
    public db5.z5 f197571w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f197572x;

    /* renamed from: y, reason: collision with root package name */
    public long f197573y;

    public MMSlideDelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197559h = false;
        this.f197564p = false;
        this.f197566r = true;
        this.f197570v = false;
        this.f197571w = null;
        this.f197572x = new com.tencent.mm.sdk.platformtools.n3();
        this.f197557f = new android.widget.Scroller(context, new android.view.animation.LinearInterpolator());
        this.f197568t = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f197569u = android.view.ViewConfiguration.getLongPressTimeout();
    }

    public static db5.c6 getItemStatusCallBack() {
        return new db5.x5();
    }

    public void b() {
        setPressed(false);
        if (this.f197564p) {
            d();
            return;
        }
        android.view.VelocityTracker velocityTracker = this.f197558g;
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        android.widget.Scroller scroller = this.f197557f;
        if (xVelocity < -600) {
            int scrollX = getScrollX();
            int width = getChildAt(1).getWidth() - scrollX;
            this.f197563o.d(this, true);
            this.f197564p = true;
            scroller.startScroll(scrollX, 0, width, 0, 100);
            invalidate();
        } else if (xVelocity > 600) {
            d();
        } else {
            int scrollX2 = getScrollX();
            int width2 = getChildAt(1).getWidth();
            int i17 = width2 - scrollX2;
            if (scrollX2 > width2 / 2) {
                this.f197563o.d(this, true);
                this.f197564p = true;
                scroller.startScroll(scrollX2, 0, i17, 0, 100);
            } else {
                this.f197564p = false;
                this.f197563o.d(this, false);
                scroller.startScroll(scrollX2, 0, -scrollX2, 0, 100);
            }
            invalidate();
        }
        android.view.VelocityTracker velocityTracker2 = this.f197558g;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f197558g = null;
        }
        this.f197559h = false;
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.view.View
    public void buildDrawingCache() {
    }

    public void c() {
        this.f197563o.d(this, false);
        this.f197564p = false;
        scrollTo(0, 0);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f197557f;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    public void d() {
        int scrollX = getScrollX();
        this.f197563o.d(this, false);
        this.f197564p = false;
        this.f197557f.startScroll(scrollX, 0, -scrollX, 0, 100);
        invalidate();
    }

    @Override // android.view.View
    public android.graphics.Bitmap getDrawingCache() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (getChildCount() < 2) {
            return;
        }
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth() + i28;
                childAt.layout(i28, 0, measuredWidth, i27 - i18);
                i28 = measuredWidth;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (getChildCount() < 2) {
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        try {
            getChildAt(0).measure(i17, i18);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
        }
        int max = java.lang.Math.max(0, getChildAt(0).getMeasuredHeight());
        android.view.ViewGroup.LayoutParams layoutParams = getChildAt(1).getLayoutParams();
        android.view.View childAt = getChildAt(1);
        if (childAt != null && childAt.getVisibility() != 8) {
            try {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            } catch (java.lang.ArrayIndexOutOfBoundsException unused2) {
            }
            max = java.lang.Math.max(max, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(android.view.View.resolveSize(size, i17), android.view.View.resolveSize(max, i18));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMSlideDelView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        this.f197570v = false;
        super.onWindowFocusChanged(z17);
    }

    public void setEnable(boolean z17) {
        this.f197566r = z17;
    }

    public void setGetViewPositionCallback(db5.b6 b6Var) {
        this.f197562n = b6Var;
    }

    public void setItemStatusCallBack(db5.c6 c6Var) {
        this.f197563o = c6Var;
    }

    public void setOnDelViewShowCallback(db5.d6 d6Var) {
    }

    public void setPerformItemClickListener(db5.f6 f6Var) {
        this.f197561m = f6Var;
    }

    public void setView(android.view.View view) {
        if (getChildCount() == 2) {
            removeViewAt(0);
        }
        addView(view, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z17) {
    }

    @Override // android.view.View
    public android.graphics.Bitmap getDrawingCache(boolean z17) {
        return null;
    }
}
