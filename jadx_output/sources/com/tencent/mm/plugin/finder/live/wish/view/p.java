package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120645g;

    public p(com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView, int i17, com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView2) {
        this.f120642d = maxHeightWxRecyclerView;
        this.f120643e = i17;
        this.f120644f = xVar;
        this.f120645g = maxHeightWxRecyclerView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f120642d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = maxHeightWxRecyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f120644f.f120665b;
            int a07 = this.f120643e + (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 0);
            int maxHeight = (maxHeightWxRecyclerView.getMaxHeight() / 2) - i65.a.h(this.f120645g.getContext(), com.tencent.mm.R.dimen.f479731dn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(maxHeight));
            arrayList.add(java.lang.Integer.valueOf(a07));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$refreshData$1$1$1$2$4$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$refreshData$1$1$1$2$4$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
