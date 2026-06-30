package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader f129156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.g0 f129157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader, com.tencent.mm.plugin.finder.ui.fav.g0 g0Var) {
        super(1);
        this.f129156d = finderMixAllFeedLoader;
        this.f129157e = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse resp = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f129156d;
        java.lang.String f123427d = finderMixAllFeedLoader.getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GlobalMixFavPresenter fetch End,resp incrementList size=");
        java.util.List incrementList = resp.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        sb6.append(" id=");
        java.util.List incrementList2 = resp.getIncrementList();
        if (incrementList2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(incrementList2, 10));
            java.util.Iterator it = incrementList2.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((so2.j5) it.next()).getItemId()));
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(";loader dataList=");
        sb6.append(finderMixAllFeedLoader.getDataList().hashCode());
        sb6.append(",size=");
        sb6.append(finderMixAllFeedLoader.getDataList().size());
        sb6.append(";presenter dataList(");
        com.tencent.mm.plugin.finder.ui.fav.g0 g0Var = this.f129157e;
        sb6.append(g0Var.c().hashCode());
        sb6.append(") size=");
        sb6.append(g0Var.c().size());
        sb6.append(",dataList=");
        java.util.ArrayList c17 = g0Var.c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it6 = c17.iterator();
        while (it6.hasNext()) {
            arrayList2.add(pm0.v.u(((so2.j5) it6.next()).getItemId()));
        }
        sb6.append(arrayList2);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        if ((resp instanceof com.tencent.mm.plugin.finder.feed.model.a5 ? (com.tencent.mm.plugin.finder.feed.model.a5) resp : null) != null) {
            g0Var.f().e().E(!resp.getHasMore());
            g0Var.f().f();
            if (g0Var.c().isEmpty()) {
                g0Var.f().k();
            }
        }
        return jz5.f0.f302826a;
    }
}
