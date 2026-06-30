package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/SpringBackLayout;", "Landroid/widget/LinearLayout;", "Ln3/i0;", "", "getNestedScrollAxes", "i", "I", "getMaxWidth", "()I", "maxWidth", "Lkotlin/Function0;", "Ljz5/f0;", "m", "Lyz5/a;", "getMoveToEdgeCallback", "()Lyz5/a;", "setMoveToEdgeCallback", "(Lyz5/a;)V", "moveToEdgeCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/view/qs", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SpringBackLayout extends android.widget.LinearLayout implements n3.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f131595d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f131596e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f131597f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f131598g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f131599h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int maxWidth;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.a moveToEdgeCallback;

    /* renamed from: n, reason: collision with root package name */
    public final int f131602n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f131603o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringBackLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f131595d = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127682ef).getValue()).r()).booleanValue();
        setOrientation(0);
        this.f131596e = new android.view.View(context);
        this.f131597f = new android.view.View(context);
        this.maxWidth = i65.a.h(context, com.tencent.mm.R.dimen.f479723df);
        this.f131602n = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f131603o = true;
        } else {
            if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                z17 = false;
            }
            if (z17) {
                this.f131603o = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final yz5.a getMoveToEdgeCallback() {
        return this.moveToEdgeCallback;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f131598g = getChildAt(0);
        int i17 = this.maxWidth;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, 0);
        addView(this.f131596e, 0, layoutParams);
        addView(this.f131597f, getChildCount(), layoutParams);
        scrollBy(i17, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.view.View view = this.f131598g;
        kotlin.jvm.internal.o.d(view);
        view.getLayoutParams().width = getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(target, "target");
        return getScrollX() != this.maxWidth;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        getParent().requestDisallowInterceptTouchEvent(true);
        int i19 = this.maxWidth;
        boolean z17 = i17 < 0 && getScrollX() > i19 && !target.canScrollHorizontally(1);
        boolean z18 = i17 > 0 && !target.canScrollHorizontally(1);
        if (z17 || z18) {
            scrollBy(i17 / 2, 0);
            consumed[0] = i17;
        }
        if (i17 > 0 && getScrollX() > i19 && !target.canScrollHorizontally(-1)) {
            scrollTo(i19, 0);
        }
        if (i17 >= 0 || getScrollX() >= i19 || target.canScrollHorizontally(1)) {
            return;
        }
        scrollTo(i19, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View target, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return (target instanceof androidx.recyclerview.widget.RecyclerView) && !this.f131599h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View target) {
        kotlin.jvm.internal.o.g(target, "target");
        if (!this.f131603o || !this.f131595d) {
            startAnimation(new com.tencent.mm.plugin.finder.view.qs(this));
        }
        int i17 = this.maxWidth;
        int scrollX = (i17 * 2) - getScrollX();
        int i18 = this.f131602n;
        if (scrollX < i18) {
            com.tencent.mars.xlog.Log.i("SpringBackLayout", "moveToEdgeCallback scrollX " + getScrollX() + " maxWidth " + i17);
            yz5.a aVar = this.moveToEdgeCallback;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        com.tencent.mars.xlog.Log.i("SpringBackLayout", "scrollX " + getScrollX() + " maxWidth " + i17 + ' ' + i18);
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        if (i17 < 0) {
            i17 = 0;
        } else {
            int i19 = this.maxWidth;
            if (i17 > i19 * 2) {
                i17 = i19 * 2;
            }
        }
        super.scrollTo(i17, i18);
    }

    public final void setMoveToEdgeCallback(yz5.a aVar) {
        this.moveToEdgeCallback = aVar;
    }
}
