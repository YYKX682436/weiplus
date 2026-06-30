package vd2;

/* loaded from: classes3.dex */
public final class s4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435914e;

    public s4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, boolean z17) {
        this.f435913d = finderLiveViewCallback;
        this.f435914e = z17;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435913d;
            finderLiveViewCallback.t();
            recyclerView.V0(this);
            int i18 = com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.N;
            boolean z17 = this.f435914e;
            if (i18 != 0) {
                if (z17) {
                    int i19 = finderLiveViewCallback.f111495t.f436055f;
                    if (i19 != 0) {
                        finderLiveViewCallback.u(i19 - 1);
                    }
                } else {
                    finderLiveViewCallback.u(finderLiveViewCallback.f111495t.f436055f + 1);
                }
            }
            finderLiveViewCallback.y(z17);
            finderLiveViewCallback.x(!z17, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$tryShowScrollGuide$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
