package sc2;

/* loaded from: classes2.dex */
public final class d8 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f405843d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f405844e;

    public d8(java.lang.String tag, yz5.a loadMore) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(loadMore, "loadMore");
        this.f405843d = tag;
        this.f405844e = loadMore;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0 || i17 == 2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            if (gridLayoutManager == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int w17 = gridLayoutManager.w();
            int y17 = gridLayoutManager.y();
            int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.V0().r()).intValue();
            boolean z17 = y17 != -1 && itemCount - y17 <= intValue && itemCount > 0;
            com.tencent.mars.xlog.Log.i(this.f405843d, "checkPreload: preloadSuccess = " + (z17 ? ((java.lang.Boolean) this.f405844e.invoke()).booleanValue() : false) + ", enablePreload = " + z17 + ", newState = " + i17 + ", firstPos = " + w17 + ", endPos = " + y17 + ", preloadThreshold = " + intValue + ", itemCount = " + itemCount);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
