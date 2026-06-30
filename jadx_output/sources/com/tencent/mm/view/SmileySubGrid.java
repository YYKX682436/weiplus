package com.tencent.mm.view;

/* loaded from: classes15.dex */
public class SmileySubGrid extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public int f213465d;

    /* renamed from: e, reason: collision with root package name */
    public int f213466e;

    /* renamed from: f, reason: collision with root package name */
    public int f213467f;

    /* renamed from: g, reason: collision with root package name */
    public int f213468g;

    /* renamed from: h, reason: collision with root package name */
    public float f213469h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f213470i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f213471m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.WindowManager f213472n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.popview.AbstractPopView f213473o;

    /* renamed from: p, reason: collision with root package name */
    public ym5.g5 f213474p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f213475q;

    /* renamed from: r, reason: collision with root package name */
    public ym5.h5 f213476r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f213477s;

    /* renamed from: t, reason: collision with root package name */
    public final int f213478t;

    /* renamed from: u, reason: collision with root package name */
    public volatile int f213479u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f213480v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f213481w;

    public SmileySubGrid(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213465d = 6;
        this.f213468g = -1;
        this.f213470i = new android.graphics.Rect();
        this.f213475q = new com.tencent.mm.sdk.platformtools.n3();
        this.f213479u = -1;
        this.f213480v = true;
        this.f213481w = new java.lang.Object();
        this.f213478t = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f213472n = (android.view.WindowManager) context.getSystemService("window");
        getLongTouchTime();
        android.view.ViewConfiguration.getPressedStateDuration();
    }

    public void d(android.view.View view) {
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        android.graphics.Rect rect = this.f213470i;
        rect.set(left, top, right, bottom);
        rect.set(rect.left - getPaddingLeft(), rect.top - getPaddingTop(), rect.right + getPaddingRight(), rect.bottom + getPaddingBottom());
        boolean z17 = this.f213471m;
        if (view.isEnabled() != z17) {
            this.f213471m = !z17;
            refreshDrawableState();
        }
    }

    public void f() {
        com.tencent.mm.view.popview.AbstractPopView abstractPopView = this.f213473o;
        if (abstractPopView != null) {
            this.f213472n.removeView(abstractPopView);
            this.f213473o = null;
        }
        this.f213479u = -1;
    }

    public int getLongTouchTime() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 != 3) goto L62;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.SmileySubGrid.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setFromDetail(boolean z17) {
    }

    public void setIsShowPopWin(boolean z17) {
        this.f213480v = z17;
    }

    public void setScrollEnable(boolean z17) {
        android.view.View view = this.f213477s;
        if (view != null) {
            if (view instanceof com.tencent.mm.ui.base.MMFlipper) {
                ((com.tencent.mm.ui.base.MMFlipper) view).setScrollEnable(z17);
            } else if (view instanceof com.tencent.mm.ui.base.CustomViewPager) {
                ((com.tencent.mm.ui.base.CustomViewPager) view).setCanSlide(z17);
            }
        }
    }

    public void setViewParent(android.view.View view) {
        this.f213477s = view;
    }
}
