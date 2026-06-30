package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class p4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132815d;

    public p4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f132815d = finderColumnFrameLayout;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d;
        ey2.m mVar = (ey2.m) lVar.f302834e;
        ey2.n nVar = mVar.f257429b;
        ey2.n nVar2 = ey2.n.f257432d;
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132815d;
        if (nVar == nVar2) {
            com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "notifyDataSetChanged change.type is None, dataList.size:" + dataBuffer.size() + ", change:" + mVar);
        } else {
            e06.k kVar = mVar.f257428a;
            if (kVar.isEmpty()) {
                com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "notifyDataSetChanged change.range.isEmpty(), dataList.size:" + dataBuffer.size() + ", change:" + mVar);
                androidx.recyclerview.widget.f2 adapter = finderColumnFrameLayout.getRecyclerView().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            } else {
                int ordinal = mVar.f257429b.ordinal();
                int i17 = kVar.f246209d;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            if (hc2.q0.a(kz5.c0.g(dataBuffer), kVar)) {
                                androidx.recyclerview.widget.f2 adapter2 = finderColumnFrameLayout.getRecyclerView().getAdapter();
                                if (adapter2 != null) {
                                    adapter2.notifyItemRangeChanged(i17, hc2.q0.b(kVar));
                                }
                            } else {
                                com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "载入数据 change.range !in dataList.indices, dataList.size:" + dataBuffer.size() + ", change:" + mVar);
                                androidx.recyclerview.widget.f2 adapter3 = finderColumnFrameLayout.getRecyclerView().getAdapter();
                                if (adapter3 != null) {
                                    adapter3.notifyDataSetChanged();
                                }
                            }
                        }
                    } else if (!kz5.n0.d0(kVar, kz5.c0.g(dataBuffer)).isEmpty()) {
                        com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "载入数据 change.range.intersect(dataList.indices).isNotEmpty(), dataList.size:" + dataBuffer.size() + ", change:" + mVar);
                        androidx.recyclerview.widget.f2 adapter4 = finderColumnFrameLayout.getRecyclerView().getAdapter();
                        if (adapter4 != null) {
                            adapter4.notifyDataSetChanged();
                        }
                    } else {
                        androidx.recyclerview.widget.f2 adapter5 = finderColumnFrameLayout.getRecyclerView().getAdapter();
                        if (adapter5 != null) {
                            adapter5.notifyItemRangeRemoved(i17, hc2.q0.b(kVar));
                        }
                    }
                } else if (hc2.q0.a(kz5.c0.g(dataBuffer), kVar)) {
                    androidx.recyclerview.widget.f2 adapter6 = finderColumnFrameLayout.getRecyclerView().getAdapter();
                    if (adapter6 != null) {
                        adapter6.notifyItemRangeInserted(i17, hc2.q0.b(kVar));
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "载入数据 change.range !in dataList.indices, dataList.size:" + dataBuffer.size() + ", change:" + mVar);
                    androidx.recyclerview.widget.f2 adapter7 = finderColumnFrameLayout.getRecyclerView().getAdapter();
                    if (adapter7 != null) {
                        adapter7.notifyDataSetChanged();
                    }
                }
            }
        }
        ey2.u uVar = finderColumnFrameLayout.f130914r;
        if (!(uVar != null && uVar.f257536r == finderColumnFrameLayout.getLastSnappedPosition())) {
            finderColumnFrameLayout.d(finderColumnFrameLayout.getLastSnappedPosition());
        }
        finderColumnFrameLayout.getRecyclerView().post(new com.tencent.mm.plugin.finder.view.o4(finderColumnFrameLayout, dataBuffer));
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = finderColumnFrameLayout.f130911o;
        if (pageIndicatorView != null) {
            pageIndicatorView.setPageCount(dataBuffer.size());
        }
    }
}
