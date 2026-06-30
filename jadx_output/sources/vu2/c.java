package vu2;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader f440207d;

    public c(com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader) {
        this.f440207d = finderLocalFeedLoader;
    }

    public com.tencent.mm.modelbase.i b() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof db2.v) || !(fVar instanceof r45.sv0)) {
            return null;
        }
        vu2.d dVar = (i17 == 0 && i18 == 0) ? vu2.d.f440210f : vu2.d.f440211g;
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440207d;
        finderLocalFeedLoader.getClass();
        finderLocalFeedLoader.f129214o = dVar;
        if (finderLocalFeedLoader.f129214o == vu2.d.f440210f) {
            db2.v vVar = (db2.v) iVar;
            int i19 = vVar.f228193t;
            if (i19 == 0) {
                int i27 = vVar.f228194u;
                finderLocalFeedLoader.f129209g = i27;
                r4 = i27 > 0;
                finderLocalFeedLoader.f129211i = r4;
            } else if (i19 == 2) {
                int i28 = vVar.f228195v;
                finderLocalFeedLoader.f129210h = i28;
                r4 = i28 < kz5.c0.h(finderLocalFeedLoader.f129206d) || finderLocalFeedLoader.f129213n;
                finderLocalFeedLoader.f129212m = r4;
            } else if (i19 == 1000) {
                finderLocalFeedLoader.f129211i = finderLocalFeedLoader.f129209g > 0;
                finderLocalFeedLoader.f129212m = finderLocalFeedLoader.f129210h < kz5.c0.h(finderLocalFeedLoader.f129206d) || finderLocalFeedLoader.f129213n;
                if (finderLocalFeedLoader.f129211i || finderLocalFeedLoader.f129212m) {
                    r4 = true;
                }
            }
        }
        vu2.b bVar = new vu2.b(i17, i18, str);
        r45.sv0 sv0Var = (r45.sv0) fVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = sv0Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 256)));
        }
        bVar.setIncrementList(arrayList);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list2 = sv0Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getObjects(...)");
        tVar.j(list2, 256, finderLocalFeedLoader.getContextObj());
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = bVar.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        bVar.setLastBuffer(null);
        bVar.setHasMore(r4);
        bVar.setPullType(((db2.v) iVar).f228193t);
        return bVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        vu2.d dVar = vu2.d.f440209e;
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440207d;
        finderLocalFeedLoader.getClass();
        finderLocalFeedLoader.f129214o = dVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genInitCgi() {
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440207d;
        java.util.List subList = finderLocalFeedLoader.f129206d.subList(finderLocalFeedLoader.f129209g, finderLocalFeedLoader.f129210h + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(0, java.lang.Long.valueOf(longValue));
            arrayList.add(rv0Var);
        }
        db2.v vVar = new db2.v(1000, new java.util.LinkedList(arrayList), finderLocalFeedLoader.getContextObj(), 0);
        vVar.f228194u = finderLocalFeedLoader.f129209g;
        vVar.f228195v = finderLocalFeedLoader.f129210h;
        return vVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440207d;
        if (finderLocalFeedLoader.f129210h >= kz5.c0.h(finderLocalFeedLoader.f129206d)) {
            return b();
        }
        int i17 = finderLocalFeedLoader.f129210h + 1;
        if (i17 < 0) {
            i17 = 0;
        }
        int h17 = kz5.c0.h(finderLocalFeedLoader.f129206d);
        if (i17 > h17) {
            i17 = h17;
        }
        int i18 = finderLocalFeedLoader.f129210h + finderLocalFeedLoader.f129208f;
        if (i18 < 0) {
            i18 = 0;
        }
        int h18 = kz5.c0.h(finderLocalFeedLoader.f129206d);
        if (i18 > h18) {
            i18 = h18;
        }
        java.util.List subList = finderLocalFeedLoader.f129206d.subList(i17, i18 + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(0, java.lang.Long.valueOf(longValue));
            arrayList.add(rv0Var);
        }
        db2.v vVar = new db2.v(2, new java.util.LinkedList(arrayList), finderLocalFeedLoader.getContextObj(), 0);
        vVar.f228194u = i17;
        vVar.f228195v = i18;
        return vVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440207d;
        int i17 = finderLocalFeedLoader.f129209g - finderLocalFeedLoader.f129208f;
        if (i17 < 0) {
            i17 = 0;
        }
        int h17 = kz5.c0.h(finderLocalFeedLoader.f129206d);
        if (i17 > h17) {
            i17 = h17;
        }
        int i18 = finderLocalFeedLoader.f129209g - 1;
        if (i18 < 0) {
            i18 = 0;
        }
        int h18 = kz5.c0.h(finderLocalFeedLoader.f129206d);
        if (i18 > h18) {
            i18 = h18;
        }
        java.util.List subList = finderLocalFeedLoader.f129206d.subList(i17, i18 + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(0, java.lang.Long.valueOf(longValue));
            arrayList.add(rv0Var);
        }
        db2.v vVar = new db2.v(0, new java.util.LinkedList(arrayList), finderLocalFeedLoader.getContextObj(), 0);
        vVar.f228194u = i17;
        vVar.f228195v = i18;
        return vVar;
    }
}
