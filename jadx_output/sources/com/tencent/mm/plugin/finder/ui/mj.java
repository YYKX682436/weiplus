package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class mj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(1);
        this.f129526d = finderShareFeedRelUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129526d;
        com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
        if (qmVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        boolean z17 = qmVar.C1;
        if (!z17) {
            java.lang.String str = qmVar.f129749x0;
            if (z17) {
                com.tencent.mars.xlog.Log.w(str, "checkAutoRemoveBackupFeed return forenterPullRequestDone");
            } else {
                com.tencent.mm.plugin.finder.feed.i0 i0Var2 = qmVar.f106424g;
                if (i0Var2 != null && (recyclerView = i0Var2.getRecyclerView()) != null) {
                    androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                    if (wxRecyclerAdapter != null) {
                        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
                        if (finderLinearLayoutManager != null && (baseFeedLoader = qmVar.f106570t) != null && (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) != 0 && (i0Var = qmVar.f106424g) != null && (o17 = i0Var.o()) != null) {
                            int w17 = finderLinearLayoutManager.w();
                            int y17 = finderLinearLayoutManager.y();
                            if (w17 < 0 || w17 != y17) {
                                com.tencent.mars.xlog.Log.i(str, "checkAutoRemoveBackupFeed  return [" + w17 + ' ' + y17 + ']');
                            } else {
                                com.tencent.mars.xlog.Log.i(str, "checkAutoRemoveBackupFeed ");
                                androidx.recyclerview.widget.k3 q07 = recyclerView.q0(w17, false);
                                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                                if (s0Var != null) {
                                    java.lang.Object obj2 = s0Var.f293125i;
                                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
                                    if (baseFinderFeed != null) {
                                        java.util.Iterator it6 = dataListJustForAdapter.iterator();
                                        int i17 = 0;
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                i17 = -1;
                                                break;
                                            }
                                            so2.j5 j5Var = (so2.j5) it6.next();
                                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                                            if (baseFinderFeed2 != null && baseFinderFeed2.getItemId() == baseFinderFeed.getItemId()) {
                                                break;
                                            }
                                            i17++;
                                        }
                                        int i18 = i17 + 1;
                                        so2.j5 j5Var2 = (i18 < 0 || i18 >= dataListJustForAdapter.size()) ? null : (so2.j5) dataListJustForAdapter.get(i18);
                                        if (j5Var2 != null) {
                                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
                                            if (!((baseFinderFeed3 == null || baseFinderFeed3.getIsBackupFeed()) ? false : true)) {
                                                int itemCount = wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.a0();
                                                int a07 = y17 - wxRecyclerAdapter.a0();
                                                boolean z18 = i17 >= 0 && i18 >= 0 && i18 > i17 && a07 >= 0 && a07 != i18;
                                                if (z18) {
                                                    dataListJustForAdapter.remove(i18);
                                                    o17.onItemRangeRemoved(i18, 1);
                                                }
                                                com.tencent.mars.xlog.Log.i(str, "checkAutoRemoveBackupFeed " + hc2.b0.h(baseFinderFeed, false, 1, null) + " isAutoRemove:" + z18 + " curIndex:" + i17 + " backupIndex:" + i18 + " lastVisibleItem:" + a07 + " itemCount:" + itemCount + " backupFeed:" + hc2.b0.h(j5Var2, false, 1, null));
                                            }
                                        }
                                        com.tencent.mars.xlog.Log.i(str, "checkAutoRemoveBackupFeed return for " + hc2.b0.h(j5Var2, false, 1, null));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.tencent.mm.plugin.finder.ui.qm qmVar2 = finderShareFeedRelUI.D;
            if (qmVar2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            qmVar2.C1 = true;
        }
        if (it.getPullType() != 2 && (it instanceof com.tencent.mm.plugin.finder.feed.model.y1)) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(finderShareFeedRelUI).a(qt2.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.feed.model.y1 y1Var = (com.tencent.mm.plugin.finder.feed.model.y1) it;
            qt2.u.T6((qt2.u) a17, y1Var.f108473c, y1Var.f108471a, 0L, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
