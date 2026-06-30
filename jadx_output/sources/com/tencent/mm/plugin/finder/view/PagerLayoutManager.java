package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/PagerLayoutManager;", "Lcom/tencent/mm/plugin/finder/view/manager/FinderLinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class PagerLayoutManager extends com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.tencent.mars.xlog.Log.e("PagerLayoutManager", "measureChildWithMargins: lp is null");
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        calculateItemDecorationsForChild(child, rect);
        child.measure(androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i17 + rect.left + rect.right, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, getF98486n()), androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18 + rect.top + rect.bottom, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, getF123307r()));
    }
}
