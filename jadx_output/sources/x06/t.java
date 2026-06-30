package x06;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f451322a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f451323b;

    static {
        x06.t tVar = new x06.t();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f451322a = linkedHashMap;
        tVar.b(n16.j.f334197r, tVar.a("java.util.ArrayList", "java.util.LinkedList"));
        tVar.b(n16.j.f334198s, tVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        tVar.b(n16.j.f334199t, tVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        tVar.b(n16.b.l(new n16.c("java.util.function.Function")), tVar.a("java.util.function.UnaryOperator"));
        tVar.b(n16.b.l(new n16.c("java.util.function.BiFunction")), tVar.a("java.util.function.BinaryOperator"));
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new jz5.l(((n16.b) entry.getKey()).b(), ((n16.b) entry.getValue()).b()));
        }
        f451323b = kz5.c1.q(arrayList);
    }

    public final java.util.List a(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(n16.b.l(new n16.c(str)));
        }
        return arrayList;
    }

    public final void b(n16.b bVar, java.util.List list) {
        for (java.lang.Object obj : list) {
            f451322a.put(obj, bVar);
        }
    }
}
