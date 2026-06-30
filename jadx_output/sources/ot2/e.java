package ot2;

/* loaded from: classes2.dex */
public final class e extends com.tencent.mm.plugin.finder.feed.model.internal.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader f348859a;

    public e(com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader) {
        this.f348859a = finderActivitySearchLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public androidx.recyclerview.widget.r1 getListUpdateCallback() {
        return new ot2.c();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        return new com.tencent.mm.plugin.finder.feed.model.internal.u0(-1, 0, new java.util.LinkedList(), false, false, 24, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInit(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInsert(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInsertSpecifiedLocation(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, com.tencent.mm.plugin.finder.feed.model.internal.t0 objectId, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(objectId, "objectId");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        java.util.List incrementList;
        java.util.AbstractCollection dataList;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.f348859a;
        int size = finderActivitySearchLoader.getDataList().size();
        ot2.a aVar = response instanceof ot2.a ? (ot2.a) response : null;
        if (aVar != null && (incrementList = aVar.getIncrementList()) != null && (dataList = finderActivitySearchLoader.getDataList()) != null) {
            dataList.addAll(incrementList);
        }
        yz5.l lVar2 = finderActivitySearchLoader.f125678f;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Integer.valueOf(size));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        java.util.List incrementList;
        java.util.AbstractCollection dataList;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.f348859a;
        int size = finderActivitySearchLoader.getDataList().size();
        ot2.a aVar = response instanceof ot2.a ? (ot2.a) response : null;
        if (aVar != null && (incrementList = aVar.getIncrementList()) != null && (dataList = finderActivitySearchLoader.getDataList()) != null) {
            dataList.addAll(incrementList);
        }
        pm0.v.X(new ot2.d(finderActivitySearchLoader, size));
    }
}
