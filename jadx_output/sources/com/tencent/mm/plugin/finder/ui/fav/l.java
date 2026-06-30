package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129186e;

    public l(com.tencent.mm.plugin.finder.ui.fav.p pVar, int i17) {
        this.f129185d = pVar;
        this.f129186e = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.ui.fav.p pVar = this.f129185d;
        if (itemId != pVar.f129200n || (i18 = this.f129186e) < 0 || i18 >= pVar.c().size()) {
            return;
        }
        java.lang.Object obj = pVar.c().get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        long itemId2 = j5Var.getItemId();
        r45.ug7 ug7Var = j5Var instanceof so2.a0 ? r45.ug7.emFinderDelGlobalFavType_Collection : r45.ug7.emFinderDelGlobalFavType_Feed;
        com.tencent.mars.xlog.Log.i("FinderGlobalFavPresenter", "[handleDelete] positiveClick remove id: " + itemId2);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pm0.v.T(new bq.o(java.lang.Long.valueOf(itemId2), ug7Var, java.lang.Long.valueOf(itemId2)).l(), new cq.y(new com.tencent.mm.plugin.finder.ui.fav.k(pVar, j5Var, itemId2), null));
        pVar.f().i(kz5.b0.c(java.lang.Integer.valueOf(i18)));
    }
}
