package xj1;

/* loaded from: classes7.dex */
public final class q implements vl5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList f454813a;

    public q(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
        this.f454813a = appBrandCollectionVerticalSortList;
    }

    @Override // vl5.s
    public final void remove(int i17) {
        xj1.x xVar = this.f454813a.f89651i;
        if (xVar != null) {
            xVar.remove((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) xVar.getItem(i17));
        }
    }
}
