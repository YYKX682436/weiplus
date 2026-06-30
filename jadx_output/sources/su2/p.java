package su2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final su2.p f412767a = new su2.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f412768b;

    static {
        su2.e eVar = su2.f.f412738b;
        java.util.List i17 = kz5.c0.i(eVar.a(su2.h.f412742e), eVar.a(su2.h.f412743f), eVar.a(su2.h.f412744g), eVar.a(su2.h.f412745h), eVar.a(su2.h.f412746i), eVar.a(su2.h.f412747m));
        int d17 = kz5.b1.d(kz5.d0.q(i17, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : i17) {
            linkedHashMap.put(((su2.f) obj).f412739a, obj);
        }
        f412768b = linkedHashMap;
    }

    public final java.lang.String a(su2.h resourceName) {
        kotlin.jvm.internal.o.g(resourceName, "resourceName");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f412768b;
        java.lang.String str = resourceName.f412749d;
        su2.f fVar = (su2.f) linkedHashMap.get(str);
        if (fVar != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.udr.e0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) c17)).Ui("ilinkres_6c359432", fVar.f412739a);
            if (Ui != null && fVar.a(Ui)) {
                com.tencent.mars.xlog.Log.i("FinderUdrResourceLoader", "getResourceOrAsyncCheck exist, " + str + " : " + Ui.getPath());
                return Ui.getPath();
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new su2.k(fVar, null), 2, null);
        }
        com.tencent.mars.xlog.Log.i("FinderUdrResourceLoader", "getResourceOrAsyncCheck no match, " + str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(su2.h r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su2.p.b(su2.h, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
