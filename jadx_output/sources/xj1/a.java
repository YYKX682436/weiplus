package xj1;

/* loaded from: classes7.dex */
public final class a implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454775d;

    public a(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f454775d = appBrandCollectionDisplayVerticalList;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        boolean z17 = kotlin.jvm.internal.o.b("batch", str) && 3 == w0Var.f316974b && (w0Var.f316976d instanceof java.lang.Long);
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f454775d;
        if (!z17) {
            com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.p0(appBrandCollectionDisplayVerticalList);
        } else {
            int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.f89638t;
            appBrandCollectionDisplayVerticalList.r0(true, xj1.g.f454788d);
        }
    }
}
