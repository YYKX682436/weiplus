package io2;

/* loaded from: classes2.dex */
public final class e extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader f293472a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader) {
        super(finderMemberCardListContract$FinderMemberCardListLoader, false, 1, null);
        this.f293472a = finderMemberCardListContract$FinderMemberCardListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        int pullType = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(pullType);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8a);
            s3Var.f463517b = 1;
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8x);
            s3Var.f463517b = -1;
        }
        s3Var.f463522g = response.getPullType() != 0;
        s3Var.f463521f = response.getHasMore();
        int i17 = 4;
        if ((pullType == 0 || pullType == 4) && s3Var.f463523h > 0) {
            s3Var.f463518c = null;
        }
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader = this.f293472a;
        com.tencent.mars.xlog.Log.i(finderMemberCardListContract$FinderMemberCardListLoader.getB(), "[onFetchRefreshDone]  reason=" + s3Var);
        java.util.List incrementList = response.getIncrementList();
        int size = incrementList != null ? incrementList.size() : 0;
        if (response.getHasMore()) {
            if (size <= finderMemberCardListContract$FinderMemberCardListLoader.getDataList().size()) {
                i17 = 2;
            }
        } else if (finderMemberCardListContract$FinderMemberCardListLoader.getDataList().size() == 0 || size == 0 || finderMemberCardListContract$FinderMemberCardListLoader.getDataList().size() <= size) {
            java.util.List incrementList2 = response.getIncrementList();
            if (incrementList2 != null && incrementList2.isEmpty()) {
                i17 = 7;
            } else {
                java.util.List incrementList3 = response.getIncrementList();
                if (incrementList3 != null && incrementList3.containsAll(kz5.n0.S0(finderMemberCardListContract$FinderMemberCardListLoader.getDataList()))) {
                    i17 = 6;
                }
            }
        }
        pm0.v.X(new io2.d(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(i17, response.getIncrementList(), response.getIsNeedClear(), null, 8, null), s3Var, this.f293472a, lVar, response));
    }
}
