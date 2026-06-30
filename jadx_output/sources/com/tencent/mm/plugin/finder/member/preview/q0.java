package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class q0 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader f121271d;

    public q0(com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader) {
        this.f121271d = finderPreviewFeedListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.a1) || !(fVar instanceof r45.d51)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.d51) fVar).getInteger(3) == 0) ? false : true;
        com.tencent.mm.plugin.finder.member.preview.p0 p0Var = new com.tencent.mm.plugin.finder.member.preview.p0(i17, i18, str);
        r45.d51 d51Var = (r45.d51) fVar;
        java.util.LinkedList<r45.vx0> list = d51Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getCollection_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.vx0 vx0Var : list) {
            kotlin.jvm.internal.o.d(vx0Var);
            arrayList.add(new com.tencent.mm.plugin.finder.playlist.e(vx0Var));
        }
        p0Var.setIncrementList(kz5.n0.V0(arrayList));
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = p0Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        p0Var.setPullType(((bq.a1) iVar).f23475o);
        p0Var.setLastBuffer(d51Var.getByteString(4));
        p0Var.setHasMore(z17);
        return p0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121271d;
        if (!(finderPreviewFeedListLoader.getLastBuffer() != null)) {
            super.fetchInit(callback);
            return;
        }
        com.tencent.mm.protobuf.g lastBuffer = finderPreviewFeedListLoader.getLastBuffer();
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = new com.tencent.mm.plugin.finder.feed.model.internal.IResponse(0, 0, "");
        iResponse.setLastBuffer(lastBuffer);
        iResponse.setIncrementList(null);
        iResponse.setPullType(1000);
        callback.onFetchDone(iResponse);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121271d;
        return new bq.a1(finderPreviewFeedListLoader.f121161e, finderPreviewFeedListLoader.getLastBuffer(), finderPreviewFeedListLoader.getContextObj(), 0, 1, 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121271d;
        return new bq.a1(finderPreviewFeedListLoader.f121161e, finderPreviewFeedListLoader.getLastBuffer(), finderPreviewFeedListLoader.getContextObj(), 0, 1, 0);
    }
}
