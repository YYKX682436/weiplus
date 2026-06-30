package h10;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final h10.j f278050a = new h10.j();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.i f278051b;

    static {
        com.google.gson.j jVar = new com.google.gson.j();
        jVar.f44838k = true;
        jVar.f44834g = true;
        f278051b = jVar.a();
    }

    public final java.util.List a(java.lang.String jsonString) {
        kotlin.jvm.internal.o.g(jsonString, "jsonString");
        try {
            java.util.List list = (java.util.List) f278051b.b(jsonString, java.util.List.class);
            kotlin.jvm.internal.o.d(list);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.lang.Object obj : list) {
                h10.f fVar = h10.g.L;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                arrayList.add(fVar.a((java.util.Map) obj));
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SemanticsUtils", "jsonToSemanticsNodes", e17);
            return kz5.p0.f313996d;
        }
    }
}
