package ot2;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader f348856d;

    public b(com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader) {
        this.f348856d = finderActivitySearchLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        ot2.a aVar = new ot2.a(i17, i18, str);
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.f348856d;
        aVar.setLastBuffer(finderActivitySearchLoader.getLastBuffer());
        if ((fVar instanceof r45.du2) && i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.du2 du2Var = (r45.du2) fVar;
            java.util.LinkedList<r45.e21> list = du2Var.getList(2);
            if (list != null) {
                for (r45.e21 e21Var : list) {
                    kotlin.jvm.internal.o.d(e21Var);
                    arrayList.add(new so2.x(e21Var));
                }
            }
            aVar.setIncrementList(arrayList);
            aVar.setLastBuffer(du2Var.getByteString(1));
            aVar.setHasMore(du2Var.getInteger(3) == 1);
            finderActivitySearchLoader.f125677e = du2Var.getInteger(3);
            db2.w2 w2Var = iVar instanceof db2.w2 ? (db2.w2) iVar : null;
            aVar.setPullType(w2Var != null ? w2Var.f228214u : 0);
        }
        return aVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.f348856d;
        db2.w2 w2Var = new db2.w2("", "", finderActivitySearchLoader.f125676d, finderActivitySearchLoader.getLastBuffer(), finderActivitySearchLoader.f125680h, finderActivitySearchLoader.f125679g);
        w2Var.f228214u = 2;
        return w2Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.f348856d;
        db2.w2 w2Var = new db2.w2("", "", finderActivitySearchLoader.f125676d, null, finderActivitySearchLoader.f125680h, finderActivitySearchLoader.f125679g);
        w2Var.f228214u = 4;
        return w2Var;
    }
}
