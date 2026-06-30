package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120647e;

    public q(com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView, com.tencent.mm.plugin.finder.live.wish.view.x xVar) {
        this.f120646d = maxHeightWxRecyclerView;
        this.f120647e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f120646d.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f120647e.f120665b;
            int a07 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 0) - 1;
            if (a07 < 0) {
                a07 = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(a07));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$refreshData$1$1$1$2$5$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$refreshData$1$1$1$2$5$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
