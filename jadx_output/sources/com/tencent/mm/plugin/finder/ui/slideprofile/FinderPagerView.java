package com.tencent.mm.plugin.finder.ui.slideprofile;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderPagerView;", "Landroid/view/ViewGroup;", "Lav2/d;", "onPageScrollListener", "Ljz5/f0;", "setOnPageScrollListener", "Landroid/view/View;", "getTimelineView", "", "g", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "", "h", "Z", "getEnableHorizontallyScroll", "()Z", "setEnableHorizontallyScroll", "(Z)V", "enableHorizontallyScroll", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderPagerView extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f129829d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.GestureDetector f129830e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Scroller f129831f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean enableHorizontallyScroll;

    /* renamed from: i, reason: collision with root package name */
    public final av2.f f129834i;

    /* renamed from: m, reason: collision with root package name */
    public int f129835m;

    /* renamed from: n, reason: collision with root package name */
    public int f129836n;

    /* renamed from: o, reason: collision with root package name */
    public int f129837o;

    /* renamed from: p, reason: collision with root package name */
    public int f129838p;

    /* renamed from: q, reason: collision with root package name */
    public int f129839q;

    /* renamed from: r, reason: collision with root package name */
    public float f129840r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.VelocityTracker f129841s;

    /* renamed from: t, reason: collision with root package name */
    public float f129842t;

    /* renamed from: u, reason: collision with root package name */
    public av2.d f129843u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPagerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = av2.f.f14207a;
        jz5.g gVar = av2.h.f14209a;
        this.f129834i = (av2.f) ((jz5.n) av2.h.f14209a).getValue();
        this.f129829d = context;
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i17, android.view.ViewGroup viewGroup, float f17, float f18) {
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            android.graphics.Rect rect = new android.graphics.Rect();
            if ((childAt instanceof com.tencent.mm.plugin.finder.view.z) && ((com.tencent.mm.plugin.finder.view.z) childAt).canScrollHorizontally(i17, viewGroup, f17, f18) && childAt.getGlobalVisibleRect(rect)) {
                return true;
            }
            if ((childAt instanceof android.view.ViewGroup) && a(i17, (android.view.ViewGroup) childAt, f17, f18)) {
                return true;
            }
        }
        return false;
    }

    public final void b(boolean z17, boolean z18, float f17) {
        if (getWidth() <= 0) {
            return;
        }
        this.f129834i.c(getScrollX(), this.f129838p, getWidth(), z17, this.position, this.f129839q, z18, this.f129840r, f17, d(f17), getChildCount());
    }

    public final void c() {
        this.f129830e = new android.view.GestureDetector(new av2.e(this));
        android.content.Context context = this.f129829d;
        if (context != null) {
            this.f129831f = new android.widget.Scroller(context);
        } else {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f129831f;
        if (scroller == null || !scroller.computeScrollOffset()) {
            return;
        }
        scrollTo(scroller.getCurrX(), 0);
        postInvalidate();
        av2.d dVar = this.f129843u;
        if (dVar == null || dVar == null) {
            return;
        }
        ((av2.a) dVar).a((float) ((scroller.getCurrX() * 1.0d) / (getWidth() * 1)), this.position, true);
    }

    public final int d(float f17) {
        float d17 = this.f129834i.d();
        int i17 = (d17 > 0.0f ? 1 : (d17 == 0.0f ? 0 : -1)) > 0 && (java.lang.Math.abs(f17) > d17 ? 1 : (java.lang.Math.abs(f17) == d17 ? 0 : -1)) >= 0 ? f17 < 0.0f ? this.f129839q + 1 : this.f129839q - 1 : this.position;
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            childCount = 0;
        }
        return e06.p.f(i17, 0, childCount);
    }

    public final void e() {
        android.widget.Scroller scroller = this.f129831f;
        if (scroller != null) {
            int i17 = this.f129835m;
            scroller.startScroll(i17, 0, -i17, 0, this.f129834i.b());
        }
        invalidate();
        av2.d dVar = this.f129843u;
        if (dVar != null) {
            if (dVar != null) {
                ((av2.a) dVar).a(0.0f, 1, false);
            }
            av2.d dVar2 = this.f129843u;
            if (dVar2 != null) {
                ((av2.a) dVar2).b(0);
            }
        }
        this.position = 0;
    }

    public final boolean getEnableHorizontallyScroll() {
        return this.enableHorizontallyScroll;
    }

    public final int getPosition() {
        return this.position;
    }

    public final android.view.View getTimelineView() {
        android.view.View childAt = getChildAt(0);
        kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f129834i.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f129834i.g();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Qb).getValue()).r()).booleanValue() && this.enableHorizontallyScroll) {
            this.f129834i.e(ev6);
            if (ev6.getAction() == 0) {
                android.view.VelocityTracker velocityTracker = this.f129841s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.f129841s = android.view.VelocityTracker.obtain();
            }
            android.view.VelocityTracker velocityTracker2 = this.f129841s;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(ev6);
            }
            if (ev6.getAction() == 0) {
                this.f129842t = ev6.getX();
            } else if (a((int) (this.f129842t - ev6.getX(0)), this, ev6.getX(), ev6.getY())) {
                return false;
            }
            int action = ev6.getAction();
            if (action == 0) {
                this.f129836n = (int) ev6.getX();
                this.f129837o = (int) ev6.getY();
                this.f129840r = ev6.getX();
                this.f129838p = getScrollX();
                this.f129839q = getWidth() > 0 ? this.f129838p / getWidth() : 0;
                android.view.GestureDetector gestureDetector = this.f129830e;
                if (gestureDetector != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(ev6);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/slideprofile/FinderPagerView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                    yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/finder/ui/slideprofile/FinderPagerView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                }
            } else if (action == 2) {
                int x17 = (int) ev6.getX();
                int y17 = (int) ev6.getY();
                double d17 = x17 - this.f129836n;
                if (java.lang.Math.abs(d17) > java.lang.Math.abs(y17 - this.f129837o) && java.lang.Math.abs(d17) > r0.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int i28 = 0;
        while (i28 < childCount) {
            android.view.View childAt = getChildAt(i28);
            int width = getWidth() * i28;
            i28++;
            childAt.layout(width, i18, getWidth() * i28, i27);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            getChildAt(i19).measure(i17, i18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r3 != 3) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEnableHorizontallyScroll(boolean z17) {
        this.enableHorizontallyScroll = z17;
    }

    public final void setOnPageScrollListener(av2.d dVar) {
        this.f129843u = dVar;
    }

    public final void setPosition(int i17) {
        this.position = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPagerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        int i18 = av2.f.f14207a;
        jz5.g gVar = av2.h.f14209a;
        this.f129834i = (av2.f) ((jz5.n) av2.h.f14209a).getValue();
        this.f129829d = context;
        c();
    }
}
