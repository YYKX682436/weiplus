package xj1;

/* loaded from: classes7.dex */
public final class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList f454815d;

    public s(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
        this.f454815d = appBrandCollectionVerticalSortList;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.appbrand.appusage.v) c17).requireAccountInitialized();
        com.tencent.mm.plugin.appbrand.appusage.v vVar = com.tencent.mm.plugin.appbrand.appusage.v.f76583e;
        kotlin.jvm.internal.o.d(vVar);
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList = this.f454815d;
        xj1.x xVar = appBrandCollectionVerticalSortList.f89651i;
        kotlin.jvm.internal.o.d(xVar);
        vVar.Ai(xVar.f454821d, new xj1.r(appBrandCollectionVerticalSortList), false);
        return true;
    }
}
