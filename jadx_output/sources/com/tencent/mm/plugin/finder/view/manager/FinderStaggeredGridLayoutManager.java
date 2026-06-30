package com.tencent.mm.plugin.finder.view.manager;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderStaggeredGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lrx2/x;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderStaggeredGridLayoutManager extends androidx.recyclerview.widget.StaggeredGridLayoutManager implements rx2.x {
    public yz5.p E;

    public FinderStaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void O(int i17, int i18) {
        com.tencent.mars.xlog.Log.getLogLevel();
        super.O(i17, i18);
    }

    @Override // rx2.x
    public void k(yz5.p pVar) {
        this.E = pVar;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            G(z2Var, h3Var, true);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.StaggeredGridLayoutManager", e17, "", new java.lang.Object[0]);
            pm0.z.b(xy2.b.f458155b, "onLayoutChildren_error", false, null, null, false, false, rx2.t.f400994d, 60, null);
        } catch (java.lang.IndexOutOfBoundsException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.StaggeredGridLayoutManager", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void requestSimpleAnimationsInNextLayout() {
        super.requestSimpleAnimationsInNextLayout();
        try {
            java.lang.reflect.Method declaredMethod = androidx.recyclerview.widget.RecyclerView.class.getDeclaredMethod("G0", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.reflect.Field declaredField = androidx.recyclerview.widget.RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            if (obj != null) {
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("Finder.StaggeredGridLayoutManager", "markItemDecorInsetsDirty");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.StaggeredGridLayoutManager", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        com.tencent.mars.xlog.Log.getLogLevel();
        super.scrollToPosition(i17);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        long currentTimeMillis = this.E == null ? 0L : java.lang.System.currentTimeMillis();
        try {
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                java.util.Objects.toString(h3Var);
            }
            return N(i17, z2Var, h3Var);
        } finally {
            yz5.p pVar = this.E;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.invoke(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), h3Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            java.util.Objects.toString(h3Var);
        }
        super.smoothScrollToPosition(recyclerView, h3Var, i17);
    }
}
