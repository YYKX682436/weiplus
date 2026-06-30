package xj1;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f454802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454803f;

    public i(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList, boolean z17, yz5.a aVar) {
        this.f454801d = appBrandCollectionDisplayVerticalList;
        this.f454802e = z17;
        this.f454803f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.f89638t;
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f454801d;
        appBrandCollectionDisplayVerticalList.n0(new xj1.h(appBrandCollectionDisplayVerticalList.q0(), appBrandCollectionDisplayVerticalList, this.f454802e, this.f454803f));
    }
}
