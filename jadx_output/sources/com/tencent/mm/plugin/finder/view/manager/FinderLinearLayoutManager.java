package com.tencent.mm.plugin.finder.view.manager;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lym5/o2;", "Lrx2/x;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager implements ym5.o2, rx2.x {
    public final jz5.g A;
    public int B;
    public boolean C;
    public boolean D;
    public yz5.p E;
    public androidx.recyclerview.widget.RecyclerView F;
    public int G;

    /* renamed from: v, reason: collision with root package name */
    public android.content.Context f132637v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f132638w;

    /* renamed from: x, reason: collision with root package name */
    public float f132639x;

    /* renamed from: y, reason: collision with root package name */
    public float f132640y;

    /* renamed from: z, reason: collision with root package name */
    public int f132641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLinearLayoutManager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.h.b(new rx2.s(this));
        setItemPrefetchEnabled(false);
        this.f132639x = 5.0f;
        this.f132641z = 100;
        this.A = jz5.h.b(new rx2.r(this));
        this.C = true;
        this.D = true;
        this.G = -1;
        this.f132637v = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int G(androidx.recyclerview.widget.h3 h3Var) {
        int i17 = this.f132641z;
        return i17 == -1 ? super.G(h3Var) : i17;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P(int i17, int i18) {
        super.P(i17, i18);
        com.tencent.mars.xlog.Log.i("Finder.FinderLayoutManager", "[scrollToPositionWithOffset] position=" + i17 + " offset=" + i18);
    }

    public final void W(int i17) {
        if (i17 < 0 || i17 == this.G || this.f132641z > 1) {
            return;
        }
        this.f132641z = 100;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.D && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return this.C && super.getF123307r();
    }

    @Override // rx2.x
    public void k(yz5.p pVar) {
        this.E = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        if (!this.f132638w) {
            super.measureChildWithMargins(child, i17, i18);
            return;
        }
        try {
            super.measureChildWithMargins(child, i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLayoutManager", "measureChildWithMargins error", e17);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onAttachedToWindow(view);
        this.F = view;
        this.G = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView view, androidx.recyclerview.widget.z2 recycler) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(recycler, "recycler");
        this.F = null;
        this.G = -1;
        super.onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i17) {
        super.onScrollStateChanged(i17);
        this.B = i17;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, z2Var, h3Var);
        if (scrollHorizontallyBy == 0 && i17 != 0 && this.B == 2) {
            android.view.View childAt = getChildAt(0);
            android.view.ViewParent parent = childAt != null ? childAt.getParent() : null;
            androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
            com.tencent.mars.xlog.Log.i("Finder.FinderLayoutManager", "horizontal fling to end, " + i17 + ' ' + scrollHorizontallyBy + ", " + recyclerView);
            if (recyclerView != null) {
                recyclerView.f1();
            }
        }
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        super.scrollToPosition(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLayoutManager", "[scrollToPosition] position=" + i17);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        long currentTimeMillis = this.E == null ? 0L : java.lang.System.currentTimeMillis();
        try {
            int scrollVerticallyBy = super.scrollVerticallyBy(i17, z2Var, h3Var);
            if (scrollVerticallyBy == 0 && i17 != 0 && this.B == 2) {
                android.view.View childAt = getChildAt(0);
                android.view.ViewParent parent = childAt != null ? childAt.getParent() : null;
                androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
                com.tencent.mars.xlog.Log.i("Finder.FinderLayoutManager", "vertical fling to end, " + i17 + ' ' + scrollVerticallyBy + ", " + recyclerView);
                if (recyclerView != null) {
                    recyclerView.f1();
                }
            }
            return scrollVerticallyBy;
        } finally {
            yz5.p pVar = this.E;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.invoke(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), h3Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLayoutManager", "[smoothScrollToPosition] position=" + i17);
        jz5.g gVar = this.A;
        ((rx2.q) ((jz5.n) gVar).getValue()).f12049a = i17;
        startSmoothScroll((rx2.q) ((jz5.n) gVar).getValue());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return !((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.n1().r()).booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLinearLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.h.b(new rx2.s(this));
        setItemPrefetchEnabled(false);
        this.f132639x = 5.0f;
        this.f132641z = 100;
        this.A = jz5.h.b(new rx2.r(this));
        this.C = true;
        this.D = true;
        this.G = -1;
        this.f132637v = context;
    }
}
