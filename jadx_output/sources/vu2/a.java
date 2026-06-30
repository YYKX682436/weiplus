package vu2;

/* loaded from: classes2.dex */
public final class a extends vu2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader f440206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader) {
        super(finderLocalFeedLoader);
        this.f440206e = finderLocalFeedLoader;
    }

    @Override // vu2.c
    public com.tencent.mm.modelbase.i b() {
        o72.f4 f4Var = (o72.f4) i95.n0.c(o72.f4.class);
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f440206e;
        int h17 = kz5.c0.h(finderLocalFeedLoader.f129206d);
        ((com.tencent.mm.plugin.fav.ui.d3) f4Var).getClass();
        jz5.l c17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a().c(h17, finderLocalFeedLoader.f129208f);
        boolean booleanValue = ((java.lang.Boolean) c17.f302833d).booleanValue();
        java.util.List list = (java.util.List) c17.f302834e;
        if (list.isEmpty() && !booleanValue) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.q0(((r45.kv2) it.next()).getString(0), 0L)));
        }
        finderLocalFeedLoader.f129206d.addAll(arrayList);
        finderLocalFeedLoader.f129213n = booleanValue;
        return genLoadMoreCgi();
    }
}
