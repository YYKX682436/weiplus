package com.tencent.mm.plugin.multitask.ui.minusscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/minusscreen/MinusScreenGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class MinusScreenGridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    public androidx.recyclerview.widget.RecyclerView D;
    public float E;

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P(int i17, int i18) {
        super.P(i17, i18);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTask.MinusScreenGridLayoutManager", e17, "", new java.lang.Object[0]);
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
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenGridLayoutManager", "markItemDecorInsetsDirty");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTask.MinusScreenGridLayoutManager", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        super.scrollToPosition(i17);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.D;
        float translationY = recyclerView != null ? recyclerView.getTranslationY() : 0.0f;
        if (!(translationY == 0.0f) && this.E * translationY >= 0.0f) {
            this.E = translationY;
            return 0;
        }
        if (translationY == 0.0f) {
            this.E = 0.0f;
        } else if (this.E * translationY < 0.0f) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.D;
            if (recyclerView2 != null) {
                recyclerView2.setTranslationY(0.0f);
            }
            this.E = translationY;
        }
        return super.scrollVerticallyBy(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        super.smoothScrollToPosition(recyclerView, h3Var, i17);
    }
}
