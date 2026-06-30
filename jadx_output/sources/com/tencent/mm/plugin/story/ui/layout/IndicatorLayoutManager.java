package com.tencent.mm.plugin.story.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/IndicatorLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class IndicatorLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        super.onLayoutChildren(recycler, state);
        com.tencent.mars.xlog.Log.i("MicroMsg.IndicatorLayoutManager", "onLayoutChildren: " + getItemCount() + ' ' + getChildCount());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, z2Var, h3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.IndicatorLayoutManager", "scrollHorizontallyBy: " + getItemCount() + ' ' + getChildCount());
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        int t17 = t();
        int x17 = x();
        if (i17 - t17 < 2) {
            super.scrollToPosition(i17 - 2);
        } else if (x17 - i17 < 2) {
            super.scrollToPosition(i17 + 2);
        }
    }
}
