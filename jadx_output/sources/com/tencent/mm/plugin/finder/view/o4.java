package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f132763e;

    public o4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer) {
        this.f132762d = finderColumnFrameLayout;
        this.f132763e = dataBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.y1 y1Var;
        android.view.View f17;
        int[] c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDataSetChanged position:");
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132762d;
        sb6.append(finderColumnFrameLayout.f130915s);
        sb6.append(", lastPosition:");
        sb6.append(finderColumnFrameLayout.getLastSnappedPosition());
        sb6.append(" newList.size:");
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.f132763e;
        sb6.append(dataBuffer.size());
        sb6.append(' ');
        so2.j5 j5Var = (so2.j5) kz5.n0.Z(dataBuffer);
        sb6.append(j5Var != null ? hc2.b0.f(j5Var, true) : null);
        com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", sb6.toString());
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderColumnFrameLayout.getRecyclerView().getLayoutManager();
        if (layoutManager != null && (f17 = (y1Var = finderColumnFrameLayout.f130906g).f(layoutManager)) != null && (c17 = y1Var.c(layoutManager, f17)) != null && (c17[0] != 0 || c17[1] != 0)) {
            finderColumnFrameLayout.getRecyclerView().scrollBy(c17[0], c17[1]);
        }
        finderColumnFrameLayout.getColumnFeedSelectorAdapter().d(false);
    }
}
