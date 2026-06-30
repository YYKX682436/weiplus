package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.th f135797d;

    public rh(com.tencent.mm.plugin.finder.viewmodel.component.th thVar) {
        this.f135797d = thVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.viewmodel.component.th thVar = this.f135797d;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = thVar.f136025d;
        int itemCount = (recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null) ? 0 : adapter.getItemCount();
        com.tencent.mars.xlog.Log.i("Finder.FullFeedGuideUIC", "[videoComplete] count=" + itemCount);
        if (itemCount < 1 || (recyclerView = thVar.f136025d) == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int t17 = linearLayoutManager.t();
            androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
            if (t17 < 0 || !(adapter2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) || thVar.f136031m == null) {
                return;
            }
            in5.c cVar = (in5.c) kz5.n0.a0(((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter2).getData(), t17 + 1);
            java.lang.Long valueOf = cVar != null ? java.lang.Long.valueOf(cVar.getItemId()) : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = thVar.f136031m;
            if (kotlin.jvm.internal.o.b(valueOf, baseFinderFeed != null ? java.lang.Long.valueOf(baseFinderFeed.getItemId()) : null)) {
                recyclerView.smoothScrollBy(0, (int) recyclerView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479662c0));
            }
        }
    }
}
