package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class r0 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader f121273d;

    public r0(com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader) {
        this.f121273d = finderPreviewFeedListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.v) || !(fVar instanceof r45.nr0)) {
            return null;
        }
        boolean z17 = true;
        if (i17 == 0 && i18 == 0 && ((r45.nr0) fVar).f381613f == 0) {
            z17 = false;
        }
        com.tencent.mm.plugin.finder.member.preview.p0 p0Var = new com.tencent.mm.plugin.finder.member.preview.p0(i17, i18, str);
        java.util.LinkedList<r45.t50> collection_feed_list = ((r45.nr0) fVar).f381611d;
        kotlin.jvm.internal.o.f(collection_feed_list, "collection_feed_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection_feed_list, 10));
        for (r45.t50 t50Var : collection_feed_list) {
            kotlin.jvm.internal.o.d(t50Var);
            arrayList.add(new jo2.a(t50Var, false, this.f121273d.f121161e));
        }
        p0Var.setIncrementList(kz5.n0.V0(arrayList));
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = p0Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        p0Var.setPullType(((bq.v) iVar).f23534o);
        p0Var.setLastBuffer(p0Var.getLastBuffer());
        p0Var.setHasMore(z17);
        return p0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121273d;
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
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121273d;
        return new bq.v(finderPreviewFeedListLoader.getContextObj(), finderPreviewFeedListLoader.f121161e, finderPreviewFeedListLoader.f121160d, finderPreviewFeedListLoader.f121163g, finderPreviewFeedListLoader.getLastBuffer(), 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121273d;
        return new bq.v(finderPreviewFeedListLoader.getContextObj(), finderPreviewFeedListLoader.f121161e, finderPreviewFeedListLoader.f121160d, finderPreviewFeedListLoader.f121163g, finderPreviewFeedListLoader.getLastBuffer(), 0);
    }
}
