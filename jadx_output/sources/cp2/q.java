package cp2;

/* loaded from: classes2.dex */
public final class q extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader) {
        super(nearbyLiveFeedLoader, false);
        this.f220879a = nearbyLiveFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h
    public int calculateIndex(com.tencent.mm.plugin.finder.feed.model.internal.t0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220879a;
        java.lang.String f123427d = nearbyLiveFeedLoader.getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateIndex : ");
        boolean z17 = data.f108047b;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        if (!z17) {
            return super.calculateIndex(data);
        }
        java.util.Iterator it = nearbyLiveFeedLoader.getDataList().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof so2.h4) && kotlin.jvm.internal.o.b(((so2.h4) j5Var).f410400d.getString(1), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.h6n))) {
                break;
            }
            i17++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        return (valueOf != null ? valueOf.intValue() : 0) + 1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        java.util.LinkedList linkedList;
        int i17;
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.Object request = response.getRequest();
        kotlin.jvm.internal.o.e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.FinderLiveFriendsRequest");
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220879a;
        int i18 = ((cp2.l) request).f220841h;
        if (i18 == 0) {
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.c(nearbyLiveFeedLoader, false, response.getHasMore(), "mergeLoadMore0");
            super.mergeLoadMore(response, lVar);
            pm0.v.X(new cp2.n(nearbyLiveFeedLoader));
            return;
        }
        if (i18 == 1) {
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.c(nearbyLiveFeedLoader, true, response.getHasMore(), "mergeLoadMore1");
            ym5.s3 s3Var = new ym5.s3(1);
            java.util.List incrementList = response.getIncrementList();
            s3Var.f463522g = incrementList != null ? incrementList.isEmpty() : true;
            s3Var.f463521f = true;
            s3Var.f463517b = 1;
            java.util.List incrementList2 = response.getIncrementList();
            if (incrementList2 == null) {
                incrementList2 = new java.util.LinkedList();
            }
            java.util.Iterator it = nearbyLiveFeedLoader.getDataList().iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                so2.j5 j5Var = (so2.j5) it.next();
                if ((j5Var instanceof com.tencent.mm.plugin.finder.feed.ys) && ((com.tencent.mm.plugin.finder.feed.ys) j5Var).f111193e == 4) {
                    break;
                } else {
                    i19++;
                }
            }
            java.util.LinkedList linkedList2 = i19 > 0 ? new java.util.LinkedList(nearbyLiveFeedLoader.getDataList().subList(0, i19)) : new java.util.LinkedList(nearbyLiveFeedLoader.getDataList());
            if (i19 <= 0 || (i17 = i19 + 1) >= nearbyLiveFeedLoader.getDataList().size()) {
                boolean hasMore = response.getHasMore();
                java.lang.String f123427d = nearbyLiveFeedLoader.getF123427d();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfAddOldRecommendList isFetchFollowMoreResp:true hasMoreFollowList:");
                sb6.append(hasMore);
                sb6.append(" recommendFeedList:");
                java.util.LinkedList linkedList3 = nearbyLiveFeedLoader.f121477u;
                sb6.append(linkedList3.size());
                com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
                linkedList = !hasMore ? linkedList3 : new java.util.LinkedList();
            } else {
                boolean hasMore2 = response.getHasMore();
                java.util.LinkedList linkedList4 = new java.util.LinkedList(nearbyLiveFeedLoader.getDataList().subList(i17, nearbyLiveFeedLoader.getDataList().size()));
                com.tencent.mars.xlog.Log.i(nearbyLiveFeedLoader.getF123427d(), "checkIfSaveRecommendList isFetchFollowMoreResp:true hasMoreFollowList:" + hasMore2 + " recommendList:" + linkedList4.size());
                linkedList = nearbyLiveFeedLoader.f121477u;
                linkedList.clear();
                linkedList.addAll(linkedList4);
            }
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.f0 f0Var3 = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.f0 f0Var4 = new kotlin.jvm.internal.f0();
            java.util.LinkedList linkedList5 = new java.util.LinkedList(nearbyLiveFeedLoader.getDataList());
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            linkedList6.addAll(linkedList2);
            linkedList6.addAll(incrementList2);
            if (!response.getHasMore()) {
                linkedList6.addAll(linkedList);
                if (i19 > 0) {
                    f0Var3.f310116d = i19;
                    f0Var4.f310116d = 1;
                    f0Var.f310116d = i19;
                    f0Var2.f310116d = incrementList2.size() + linkedList.size();
                } else {
                    f0Var3.f310116d = -1;
                    f0Var4.f310116d = 0;
                    f0Var.f310116d = linkedList5.size();
                    f0Var2.f310116d = incrementList2.size() + linkedList.size();
                }
            } else if (i19 > 0) {
                f0Var3.f310116d = i19;
                f0Var4.f310116d = linkedList.size() + 1;
                f0Var.f310116d = i19;
                f0Var2.f310116d = incrementList2.size();
            } else {
                f0Var3.f310116d = -1;
                f0Var4.f310116d = 0;
                f0Var.f310116d = linkedList5.size();
                f0Var2.f310116d = incrementList2.size();
            }
            java.lang.String p17 = hc2.o0.p(linkedList6);
            java.lang.String p18 = hc2.o0.p(linkedList5);
            java.lang.String p19 = hc2.o0.p(linkedList);
            com.tencent.mars.xlog.Log.i(nearbyLiveFeedLoader.getF123427d(), "mergeLoadMore() hasMore:" + response.getHasMore() + " moreFollowCardIndex:" + i19 + " removeIndex:" + f0Var3.f310116d + "  removeSize:" + f0Var4.f310116d + " insertIndex:" + f0Var.f310116d + "  insertSize:" + f0Var2.f310116d + " newList:" + p17 + " oldList:" + p18 + " oldRecommendList:" + p19);
            pm0.v.X(new cp2.o(this.f220879a, linkedList6, f0Var3, f0Var4, f0Var, f0Var2, s3Var, lVar, response));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if ((r13 != null && r13.getInteger(2) == 1) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9 A[LOOP:1: B:15:0x00b2->B:29:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse r19, yz5.l r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.q.mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse, yz5.l):void");
    }
}
