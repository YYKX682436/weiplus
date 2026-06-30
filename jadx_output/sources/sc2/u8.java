package sc2;

/* loaded from: classes2.dex */
public final class u8 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f406290d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f406291e;

    public u8(java.lang.String tag, yz5.a loadMore) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(loadMore, "loadMore");
        this.f406290d = tag;
        this.f406291e = loadMore;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderStaggeredGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0 || i17 == 2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager : null;
            if (finderStaggeredGridLayoutManager == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderStaggeredGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i18 = finderStaggeredGridLayoutManager.f11920d;
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            finderStaggeredGridLayoutManager.u(iArr);
            finderStaggeredGridLayoutManager.v(iArr2);
            int i19 = iArr2[finderStaggeredGridLayoutManager.f11920d - 1];
            int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.V0().r()).intValue();
            boolean z17 = i19 != -1 && itemCount - i19 <= intValue && itemCount > 0;
            com.tencent.mars.xlog.Log.i(this.f406290d, "checkPreload: preloadSuccess = " + (z17 ? ((java.lang.Boolean) this.f406291e.invoke()).booleanValue() : false) + ", enablePreload = " + z17 + ", newState = " + i17 + ", firstPos = " + iArr[0] + ", endPos = " + i19 + ", preloadThreshold = " + intValue + ", itemCount = " + itemCount);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderStaggeredGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderStaggeredGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderStaggeredGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
