package wk2;

/* loaded from: classes3.dex */
public final class h extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.j f446943d;

    public h(wk2.j jVar) {
        this.f446943d = jVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "onScrollStateChanged newState:" + i17);
        if (i17 == 0) {
            wk2.j jVar = this.f446943d;
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "checkAutoPlay");
            com.tencent.mm.sdk.platformtools.n3 n3Var = jVar.f446953i;
            java.lang.Runnable runnable = jVar.f446954j;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, 0L);
        } else if (i17 == 2) {
            pm0.v.V(100L, new wk2.g(recyclerView));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        wk2.j jVar = this.f446943d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = jVar.f446947c.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        finderStaggeredGridLayoutManager.u(iArr);
        finderStaggeredGridLayoutManager.v(iArr2);
        for (int i19 = 0; i19 < 2; i19++) {
            jVar.b(iArr[i19]);
        }
        for (int i27 = 0; i27 < 2; i27++) {
            jVar.b(iArr2[i27]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
