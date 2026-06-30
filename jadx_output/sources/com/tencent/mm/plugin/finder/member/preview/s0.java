package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class s0 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader f121276d;

    public s0(com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader) {
        this.f121276d = finderPreviewFeedListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof ho2.a) || !(fVar instanceof r45.rr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.rr0) fVar).f385133f == 0) ? false : true;
        com.tencent.mm.plugin.finder.member.preview.p0 p0Var = new com.tencent.mm.plugin.finder.member.preview.p0(i17, i18, str);
        r45.rr0 rr0Var = (r45.rr0) fVar;
        java.util.LinkedList<r45.dr0> object = rr0Var.f385131d;
        kotlin.jvm.internal.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        for (r45.dr0 dr0Var : object) {
            kotlin.jvm.internal.o.d(dr0Var);
            arrayList.add(new jo2.b(dr0Var, false, ((ho2.a) iVar).f282862o == 1, this.f121276d.f121161e));
        }
        p0Var.setIncrementList(kz5.n0.V0(arrayList));
        ho2.a aVar = (ho2.a) iVar;
        if (aVar.f282863p != 2) {
            java.util.List incrementList = p0Var.getIncrementList();
            if (!(incrementList instanceof java.util.List)) {
                incrementList = null;
            }
            if (incrementList != null) {
                cu2.u.f222441a.m(incrementList, 33040, "", true);
            }
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = p0Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        p0Var.setPullType(aVar.f282863p);
        p0Var.setLastBuffer(rr0Var.f385132e);
        p0Var.setHasMore(z17);
        return p0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121276d;
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
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121276d;
        return new ho2.a(finderPreviewFeedListLoader.getContextObj(), finderPreviewFeedListLoader.f121161e, finderPreviewFeedListLoader.f121160d, finderPreviewFeedListLoader.f121162f, finderPreviewFeedListLoader.getLastBuffer(), 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = this.f121276d;
        return new ho2.a(finderPreviewFeedListLoader.getContextObj(), finderPreviewFeedListLoader.f121161e, finderPreviewFeedListLoader.f121160d, finderPreviewFeedListLoader.f121162f, finderPreviewFeedListLoader.getLastBuffer(), 0);
    }
}
