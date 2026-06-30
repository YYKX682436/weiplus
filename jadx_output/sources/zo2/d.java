package zo2;

/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo2.e f474848d;

    public d(zo2.e eVar) {
        this.f474848d = eVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int w17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        zo2.e eVar = this.f474848d;
        eVar.getClass();
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("NearbyRVPositionHelper", "handleOnScrollStateChanged return for newState:" + i17);
        } else {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
            int i18 = eVar.f474849a;
            finderStaggeredGridLayoutManager.u(new int[i18]);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                int[] iArr = new int[i18];
                ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager2).u(iArr);
                w17 = iArr[0];
            } else {
                w17 = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).w() : 0;
            }
            eVar.f474850b = w17;
            android.view.View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(w17);
            eVar.f474851c = findViewByPosition != null ? findViewByPosition.getTop() : 0;
            com.tencent.mars.xlog.Log.i("NearbyRVPositionHelper", "computeRecyclerViewPosAndOffset position:" + eVar.f474850b + " offset:" + eVar.f474851c);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
