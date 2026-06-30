package qq2;

/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq2.b f365929d;

    public a(qq2.b bVar) {
        this.f365929d = bVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        qq2.b bVar = this.f365929d;
        bVar.getClass();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int[] iArr = new int[2];
        finderStaggeredGridLayoutManager.u(new int[2]);
        finderStaggeredGridLayoutManager.v(iArr);
        int i19 = iArr[1];
        if (i19 != -1 && itemCount - i19 <= bVar.f365935f && i18 > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreload tabId:");
            r45.dd2 dd2Var = bVar.f365931b;
            sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : null);
            sb6.append('-');
            sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = bVar.f365933d;
            com.tencent.mars.xlog.Log.i(str, sb7);
            boolean z17 = bVar.f365934e;
            if (!z17) {
                com.tencent.mars.xlog.Log.i(str, "startPreload return for open:" + z17);
            } else if (!bVar.f365936g) {
                com.tencent.mars.xlog.Log.i(str, "startPreload return for hasInitDone:" + bVar.f365936g);
            } else if (bVar.f365937h) {
                com.tencent.mars.xlog.Log.i(str, "startPreload return for isPreloading:" + bVar.f365937h);
            } else if (!bVar.f365938i) {
                com.tencent.mars.xlog.Log.i(str, "startPreload return for hasMore:" + bVar.f365938i);
            } else if (bVar.f365939j) {
                com.tencent.mars.xlog.Log.i(str, "startPreload return for isRefreshing:" + bVar.f365939j);
            } else if (dp2.a.f242183a.a("startPreload next page", dd2Var, bVar.f365932c)) {
                bVar.f365930a.requestLoadMore(dd2Var);
                bVar.f365937h = true;
                bVar.f365940k = java.lang.System.currentTimeMillis();
            } else {
                com.tencent.mars.xlog.Log.i(str, "startPreload return for canStartPreload");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
