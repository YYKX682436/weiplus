package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor f148181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f148182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor mBAppBrandAdaptor, java.util.HashSet hashSet) {
        super(0);
        this.f148181d = mBAppBrandAdaptor;
        this.f148182e = hashSet;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor mBAppBrandAdaptor = this.f148181d;
        str = mBAppBrandAdaptor.f147811h;
        boolean b17 = kotlin.jvm.internal.o.b(str, "MagicPlayable");
        java.util.HashSet hashSet = this.f148182e;
        if (b17) {
            int d17 = kz5.b1.d(kz5.d0.q(hashSet, 10));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 >= 16 ? d17 : 16);
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) it.next()).newInstance();
                kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandJsApi");
                com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) newInstance;
                linkedHashMap.put(k0Var.k(), k0Var);
            }
            return kz5.c1.m(linkedHashMap, com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor.b0(mBAppBrandAdaptor));
        }
        int d18 = kz5.b1.d(kz5.d0.q(hashSet, 10));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d18 >= 16 ? d18 : 16);
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            java.lang.Object newInstance2 = java.lang.Class.forName((java.lang.String) it6.next()).newInstance();
            kotlin.jvm.internal.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandJsApi");
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var2 = (com.tencent.mm.plugin.appbrand.jsapi.k0) newInstance2;
            linkedHashMap2.put(k0Var2.k(), k0Var2);
        }
        return kz5.c1.m(linkedHashMap2, com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor.a0(mBAppBrandAdaptor));
    }
}
