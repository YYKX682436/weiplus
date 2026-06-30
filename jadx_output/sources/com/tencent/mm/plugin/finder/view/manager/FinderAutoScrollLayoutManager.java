package com.tencent.mm.plugin.finder.view.manager;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderAutoScrollLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderAutoScrollLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        rx2.e eVar = new rx2.e(recyclerView != null ? recyclerView.getContext() : null);
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("Finder.AutoScrollLayoutManager", "Invalid target position");
        } else {
            eVar.f12049a = i17;
            startSmoothScroll(eVar);
        }
    }
}
