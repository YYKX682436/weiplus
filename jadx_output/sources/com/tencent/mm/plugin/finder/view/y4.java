package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f133376d;

    public y4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f133376d = finderColumnFrameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList;
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f133376d;
        finderColumnFrameLayout.getColumnFeedSelectorAdapter().d(false);
        ey2.u uVar = finderColumnFrameLayout.f130914r;
        if (uVar != null) {
            int lastSnappedPosition = finderColumnFrameLayout.getLastSnappedPosition();
            jz5.l lVar = (jz5.l) uVar.f257542x.getValue();
            java.lang.String str = uVar.f257529h;
            if (lVar == null || (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) == null) {
                com.tencent.mars.xlog.Log.w(str, "Current feed list is null");
                return;
            }
            if (lastSnappedPosition < 0 || lastSnappedPosition >= dataBuffer.size()) {
                com.tencent.mars.xlog.Log.e(str, "Invalid index: " + lastSnappedPosition + ", list size: " + dataBuffer.size());
                return;
            }
            java.lang.Object obj = dataBuffer.get(lastSnappedPosition);
            jz5.f0 f0Var = null;
            f0Var = null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed == null) {
                com.tencent.mars.xlog.Log.w(str, "Feed at index " + lastSnappedPosition + " is not a BaseFinderFeed");
                return;
            }
            ((ey2.i2) ((jz5.n) uVar.f257534p).getValue()).N6(20, kz5.b0.c(baseFinderFeed));
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = uVar.f257528g;
            if (finderTimelineFeedLoader != null && (dataList = finderTimelineFeedLoader.getDataList()) != 0) {
                java.util.Iterator it = dataList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if (((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && j5Var.d(baseFinderFeed) == 0) == true) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    dataList.remove(i17);
                    java.lang.ref.WeakReference weakReference = finderTimelineFeedLoader.f107654m;
                    com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = weakReference instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) weakReference : null;
                    if (finderRecyclerView != null) {
                        androidx.recyclerview.widget.f2 adapter = finderRecyclerView.getAdapter();
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                        if (wxRecyclerAdapter != null) {
                            wxRecyclerAdapter.notifyItemRangeRemoved(i17, 1);
                        }
                    }
                    com.tencent.mars.xlog.Log.i(str, "Removed duplicate feed at index " + i17 + ": " + baseFinderFeed);
                } else {
                    com.tencent.mars.xlog.Log.w(str, "No duplicate found for feed at index " + lastSnappedPosition + ": " + baseFinderFeed);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(str, "FeedLoader dataList is null");
            }
        }
    }
}
