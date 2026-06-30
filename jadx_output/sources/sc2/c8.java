package sc2;

/* loaded from: classes2.dex */
public final class c8 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f405816d;

    /* renamed from: e, reason: collision with root package name */
    public final sc2.b8 f405817e;

    /* renamed from: f, reason: collision with root package name */
    public int f405818f;

    public c8(java.lang.String tag, sc2.b8 callback) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f405816d = tag;
        this.f405817e = callback;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0 || i17 == 2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager : null;
            if (finderStaggeredGridLayoutManager == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i18 = finderStaggeredGridLayoutManager.f11920d;
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            finderStaggeredGridLayoutManager.u(iArr);
            finderStaggeredGridLayoutManager.v(iArr2);
            int i19 = iArr2[1];
            int i27 = this.f405818f;
            if (i27 <= 0) {
                i27 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.V0().r()).intValue() - 1;
            }
            sc2.b8 b8Var = this.f405817e;
            boolean a17 = b8Var.a();
            boolean z17 = i19 != -1 && (itemCount + (-1)) - i19 <= i27 && itemCount > 0 && a17;
            com.tencent.mars.xlog.Log.i(this.f405816d, "checkPreload: preloadSuccess = " + (z17 ? b8Var.b(true) : false) + ", enablePreload = " + z17 + ", newState = " + i17 + ", firstPos = " + iArr[0] + ", endPos = " + i19 + ", preloadThreshold = " + i27 + ", customPreloadThreshold=" + this.f405818f + ", itemCount = " + itemCount + ", refreshProgressIsGone=" + a17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
