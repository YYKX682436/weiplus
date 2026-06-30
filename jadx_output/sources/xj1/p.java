package xj1;

/* loaded from: classes7.dex */
public final class p implements vl5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList f454812a;

    public p(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
        this.f454812a = appBrandCollectionVerticalSortList;
    }

    @Override // vl5.o
    public final void a(int i17, int i18) {
        xj1.x xVar;
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList = this.f454812a;
        xj1.x xVar2 = appBrandCollectionVerticalSortList.f89651i;
        if (xVar2 != null) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) xVar2.getItem(i17);
            xVar2.remove(localUsageInfo);
            if (localUsageInfo == null || (xVar = appBrandCollectionVerticalSortList.f89651i) == null) {
                return;
            }
            xVar.insert(localUsageInfo, i18);
        }
    }
}
