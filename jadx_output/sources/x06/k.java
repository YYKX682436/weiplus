package x06;

/* loaded from: classes15.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f451266a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f451267b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f451268c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f451269d;

    static {
        n16.e eVar = l06.w.f314930k;
        jz5.l lVar = new jz5.l(x06.l.a(eVar, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), l06.x.f314949d);
        jz5.l lVar2 = new jz5.l(x06.l.a(eVar, "ordinal"), n16.g.k("ordinal"));
        jz5.l lVar3 = new jz5.l(l06.w.C.c(n16.g.k("size")), n16.g.k("size"));
        n16.c cVar = l06.w.G;
        java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, new jz5.l(cVar.c(n16.g.k("size")), n16.g.k("size")), new jz5.l(x06.l.a(l06.w.f314925f, "length"), n16.g.k("length")), new jz5.l(cVar.c(n16.g.k("keys")), n16.g.k("keySet")), new jz5.l(cVar.c(n16.g.k("values")), n16.g.k("values")), new jz5.l(cVar.c(n16.g.k("entries")), n16.g.k("entrySet")));
        f451266a = k17;
        java.util.Set<java.util.Map.Entry> entrySet = k17.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(entrySet, 10));
        for (java.util.Map.Entry entry : entrySet) {
            arrayList.add(new jz5.l(((n16.c) entry.getKey()).f(), entry.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jz5.l lVar4 = (jz5.l) it.next();
            n16.g gVar = (n16.g) lVar4.f302834e;
            java.lang.Object obj = linkedHashMap.get(gVar);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(gVar, obj);
            }
            ((java.util.List) obj).add((n16.g) lVar4.f302833d);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), kz5.n0.Q((java.lang.Iterable) entry2.getValue()));
        }
        f451267b = linkedHashMap2;
        java.util.Map map = f451266a;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry3 : map.entrySet()) {
            n06.d dVar = n06.d.f333953a;
            n16.e i17 = ((n16.c) entry3.getKey()).e().i();
            kotlin.jvm.internal.o.f(i17, "toUnsafe(...)");
            n16.b g17 = dVar.g(i17);
            kotlin.jvm.internal.o.d(g17);
            linkedHashSet.add(g17.b().c((n16.g) entry3.getValue()));
        }
        java.util.Set keySet = f451266a.keySet();
        f451268c = keySet;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(keySet, 10));
        java.util.Iterator it6 = keySet.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((n16.c) it6.next()).f());
        }
        f451269d = kz5.n0.X0(arrayList2);
    }
}
