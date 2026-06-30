package vd2;

/* loaded from: classes3.dex */
public final class e4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435718d;

    public e4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        this.f435718d = finderLiveViewCallback;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxltest onScrollStateChanged:");
        sb6.append(i17);
        sb6.append("，curPos=");
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435718d;
        sb6.append(finderLiveViewCallback.f111495t.f436055f);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
        if (finderLiveViewCallback.L && i17 == 0) {
            finderLiveViewCallback.L = false;
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
            if (finderLiveLayoutManager != null) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.Y(finderLiveLayoutManager, true, false, null, 6, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$2$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
