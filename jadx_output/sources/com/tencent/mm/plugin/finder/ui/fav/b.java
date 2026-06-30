package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader f129152d;

    public b(com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader) {
        this.f129152d = finderGlobalFavLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit initCount ");
        com.tencent.mm.plugin.finder.ui.fav.c cVar = new com.tencent.mm.plugin.finder.ui.fav.c(0, 0, "");
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader = this.f129152d;
        if (finderGlobalFavLoader.f129135d) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderGlobalFavLoader.getCache();
            cVar.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderGlobalFavLoader.getCache();
            cVar.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        }
        return cVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof db2.v0) || !(fVar instanceof r45.r61)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.r61) fVar).getInteger(3) == 0) ? false : true;
        com.tencent.mm.plugin.finder.ui.fav.d[] dVarArr = com.tencent.mm.plugin.finder.ui.fav.d.f129155d;
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader = this.f129152d;
        finderGlobalFavLoader.getClass();
        com.tencent.mm.plugin.finder.ui.fav.c cVar = new com.tencent.mm.plugin.finder.ui.fav.c(i17, i18, str);
        r45.r61 r61Var = (r45.r61) fVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = r61Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 1048576)));
        }
        cVar.setIncrementList(arrayList);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list2 = r61Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        tVar.j(list2, 1048576, finderGlobalFavLoader.getContextObj());
        java.util.List incrementList = cVar.getIncrementList();
        kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
        tVar.m(incrementList, 1048576, "", true);
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = cVar.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        cVar.setLastBuffer(r61Var.getByteString(2));
        cVar.setHasMore(z17);
        return cVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        com.tencent.mm.plugin.finder.ui.fav.d[] dVarArr = com.tencent.mm.plugin.finder.ui.fav.d.f129155d;
        this.f129152d.getClass();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader = this.f129152d;
        return new db2.v0(finderGlobalFavLoader.getLastBuffer(), finderGlobalFavLoader.getContextObj(), 0, false, 12, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader = this.f129152d;
        return new db2.v0(finderGlobalFavLoader.getLastBuffer(), finderGlobalFavLoader.getContextObj(), 0, false, 12, null);
    }
}
