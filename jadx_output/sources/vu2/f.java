package vu2;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader f440219a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader) {
        super(finderLocalFeedLoader, false, 1, null);
        this.f440219a = finderLocalFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h
    public boolean filterSameFeed() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(response.getPullType());
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8a);
            s3Var.f463517b = 1;
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8x);
            s3Var.f463517b = -1;
        }
        java.util.List incrementList = response.getIncrementList();
        int size = incrementList != null ? incrementList.size() : 0;
        s3Var.f463522g = size > 0;
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440219a;
        s3Var.f463521f = finderLocalFeedLoader.f129211i;
        com.tencent.mars.xlog.Log.i(finderLocalFeedLoader.getB(), "[onFetchRefreshDone] reason=" + s3Var);
        pm0.v.X(new vu2.e(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 12 : (finderLocalFeedLoader.getDataList().size() == 0 || size == 0 || finderLocalFeedLoader.getDataList().size() <= size) ? 6 : 4, response.getIncrementList(), response.getIsNeedClear(), null, 8, null), s3Var, this.f440219a, lVar, response));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public boolean needCleanWhenRefresh(java.util.List newList) {
        kotlin.jvm.internal.o.g(newList, "newList");
        return false;
    }
}
