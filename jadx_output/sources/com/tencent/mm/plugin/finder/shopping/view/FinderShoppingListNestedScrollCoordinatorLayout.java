package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderShoppingListNestedScrollCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Ln3/d0;", "", "enabled", "Ljz5/f0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FinderShoppingListNestedScrollCoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout implements n3.d0 {
    public final java.lang.String D;
    public final n3.f0 E;
    public com.google.android.material.appbar.AppBarLayout F;
    public boolean G;
    public boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderShoppingListNestedScrollCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.D = "NestedScrollCoordinatorLayout";
        this.E = new n3.f0(this);
        this.G = true;
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, n3.g0
    public boolean B(android.view.View child, android.view.View target, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return startNestedScroll(i17) || super.B(child, target, i17, i18);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.E.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.E.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.E.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.E.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.E.h(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.E.f334334d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, n3.g0
    public void j(android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(target, "target");
        super.j(target, i17);
        stopNestedScroll();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, n3.g0
    public void l(android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(target, "target");
        super.l(target, i17, i18, i19, i27, i28);
        com.tencent.mars.xlog.Log.i(this.D, "onNestedScroll, dyUnconsumed = " + i27);
        if (i27 < 0) {
            if (this.G) {
                dispatchNestedScroll(i17, i18, i19, i27, null);
            }
        } else if (this.H) {
            dispatchNestedScroll(i17, i18, i19, i27, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @Override // android.view.View
    public void onFinishInflate() {
        com.google.android.material.appbar.AppBarLayout appBarLayout;
        super.onFinishInflate();
        com.tencent.mars.xlog.Log.i(this.D, "on set appbarLayout");
        n3.t1 t1Var = new n3.t1(this);
        while (true) {
            if (!t1Var.hasNext()) {
                appBarLayout = 0;
                break;
            } else {
                appBarLayout = t1Var.next();
                if (((android.view.View) appBarLayout) instanceof com.google.android.material.appbar.AppBarLayout) {
                    break;
                }
            }
        }
        com.google.android.material.appbar.AppBarLayout appBarLayout2 = appBarLayout instanceof com.google.android.material.appbar.AppBarLayout ? appBarLayout : null;
        this.F = appBarLayout2;
        if (appBarLayout2 != null) {
            appBarLayout2.a(new xt2.l6(this));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        return dispatchNestedFling(f17, f18, z17) || super.onNestedFling(target, f17, f18, z17);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(target, "target");
        return super.onNestedPreFling(target, f17, f18);
    }

    @Override // n3.d0
    public void p(int i17) {
        this.E.k(i17);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.E.i(z17);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.E.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.E.k(0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, n3.g0
    public void t(android.view.View target, int i17, int i18, int[] consumed, int i19) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        if (dispatchNestedPreScroll(i17, i18, consumed, null)) {
            return;
        }
        super.t(target, i17, i18, consumed, i19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderShoppingListNestedScrollCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.D = "NestedScrollCoordinatorLayout";
        this.E = new n3.f0(this);
        this.G = true;
        setNestedScrollingEnabled(true);
    }
}
