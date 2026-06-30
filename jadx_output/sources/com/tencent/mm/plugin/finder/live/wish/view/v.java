package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120661e;

    public v(com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView) {
        this.f120660d = xVar;
        this.f120661e = maxHeightWxRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f120660d.f120665b;
        int itemCount = wxRecyclerAdapter != null ? wxRecyclerAdapter.getItemCount() : 0;
        if (itemCount > 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f120661e.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(itemCount - 1));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$scrollToBottom$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$scrollToBottom$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }
}
