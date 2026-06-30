package com.tencent.mm.plugin.finder.megavideo.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class OverScrollVerticalBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.tencent.mm.view.recyclerview.WxRecyclerView> {

    /* renamed from: d, reason: collision with root package name */
    public int f121065d;

    /* renamed from: e, reason: collision with root package name */
    public int f121066e;

    /* renamed from: f, reason: collision with root package name */
    public int f121067f;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mm.view.recyclerview.WxRecyclerView child = (com.tencent.mm.view.recyclerview.WxRecyclerView) view;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (child != target) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = child.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y() != (child.getAdapter() != null ? r3.getItemCount() : -1) - 1) {
            return;
        }
        if (i27 > 0 && i28 == 0) {
            com.tencent.mars.xlog.Log.i("OverScrollVerticalBehavior", "onNestedScroll: start nested scroll dyUnconsumed = " + i27 + ", currTranslateY = " + child.getTranslationY());
            child.animate().cancel();
            child.setTranslationY(child.getTranslationY() - ((float) (i27 / 2)));
            this.f121067f = 0;
        }
        this.f121066e += i19;
        this.f121067f += i27;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View directTargetChild, android.view.View target, int i17, int i18) {
        com.tencent.mm.view.recyclerview.WxRecyclerView child = (com.tencent.mm.view.recyclerview.WxRecyclerView) view;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(directTargetChild, "directTargetChild");
        kotlin.jvm.internal.o.g(target, "target");
        this.f121066e = 0;
        this.f121067f = 0;
        return child == target && (i17 & 2) != 0 && i18 == 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View target, int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView child = (com.tencent.mm.view.recyclerview.WxRecyclerView) view;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (i17 != 0) {
            return;
        }
        if (this.f121065d == 0) {
            this.f121065d = android.view.ViewConfiguration.get(target.getContext()).getScaledTouchSlop() * 10;
        }
        if (child.getTranslationY() < 0.0f) {
            com.tencent.mars.xlog.Log.i("OverScrollVerticalBehavior", "onStopNestedScroll: start anim translateY = " + child.getTranslationY());
            child.animate().translationY(0.0f).start();
            if (java.lang.Math.abs(child.getTranslationY()) > this.f121065d) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = child.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    androidx.recyclerview.widget.k3 q07 = child.q0(linearLayoutManager.y(), false);
                    if ((q07 instanceof in5.s0 ? (in5.s0) q07 : null) != null) {
                        db5.t7.makeText(child.getContext(), com.tencent.mm.R.string.f491896el3, 0).show();
                    }
                }
            }
        }
        int i18 = this.f121067f;
        if (i18 < 0 && java.lang.Math.abs(i18) > java.lang.Math.abs(this.f121066e)) {
            java.lang.Math.abs(this.f121067f);
        }
        this.f121067f = 0;
        this.f121066e = 0;
    }
}
