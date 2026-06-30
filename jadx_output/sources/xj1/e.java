package xj1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454784d;

    public e(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f454784d = appBrandCollectionDisplayVerticalList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.f89638t;
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f454784d;
        appBrandCollectionDisplayVerticalList.getClass();
        if (appBrandCollectionDisplayVerticalList.isAdded()) {
            appBrandCollectionDisplayVerticalList.getClass();
            com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
            com.tencent.mm.sdk.platformtools.n3 n3Var = appBrandCollectionDisplayVerticalList.f89642n;
            kotlin.jvm.internal.o.d(n3Var);
            w2Var.add(n3Var.getSerial(), appBrandCollectionDisplayVerticalList.f89646r);
            k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = appBrandCollectionDisplayVerticalList.f89642n;
            kotlin.jvm.internal.o.d(n3Var2);
            ij6.add(n3Var2.getSerial(), appBrandCollectionDisplayVerticalList.f89647s);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        xj1.b0 b0Var = appBrandCollectionDisplayVerticalList.f89640i;
        kotlin.jvm.internal.o.d(b0Var);
        java.util.Iterator it = b0Var.f454780d.iterator();
        while (it.hasNext()) {
            hashSet.add(((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) it.next()).f76361d);
        }
        com.tencent.mm.plugin.appbrand.config.q.c(kz5.n0.S0(hashSet), k91.h1.STAR_LIST, null);
    }
}
