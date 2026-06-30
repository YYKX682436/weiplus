package com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/LiveVerticalStaggeredGridLayoutManager;", "Lcom/tencent/mm/plugin/finder/view/manager/FinderStaggeredGridLayoutManager;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LiveVerticalStaggeredGridLayoutManager extends com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager {
    public final com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView F;
    public boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVerticalStaggeredGridLayoutManager(int i17, int i18, com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView parent) {
        super(i17, i18);
        kotlin.jvm.internal.o.g(parent, "parent");
        this.F = parent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void addDisappearingView(android.view.View view) {
        try {
            super.addDisappearingView(view);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiveVerticalStaggeredGridLayoutManager", "addDisappearingView e", e17);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        if (!this.G) {
            return super.getF123307r();
        }
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = this.F;
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = finderParentRecyclerView.g1();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = finderParentRecyclerView.f122239o2;
        atomicBoolean.get();
        if (g17 != null) {
            g17.g1();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return atomicBoolean.get() || g17 == null || g17.g1();
    }

    @Override // com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiveVerticalStaggeredGridLayoutManager", "onLayoutChildren e", e17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiveVerticalStaggeredGridLayoutManager", "scrollVerticallyBy e", e17);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.G) {
            return false;
        }
        return super.supportsPredictiveItemAnimations();
    }
}
