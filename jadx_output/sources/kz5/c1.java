package kz5;

/* loaded from: classes12.dex */
public abstract class c1 extends kz5.b1 {
    public static final java.lang.Object h(java.util.Map map, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(map, "<this>");
        if (map instanceof kz5.z0) {
            kz5.h1 h1Var = (kz5.h1) ((kz5.z0) map);
            java.util.Map map2 = h1Var.f313974d;
            java.lang.Object obj2 = map2.get(obj);
            return (obj2 != null || map2.containsKey(obj)) ? obj2 : h1Var.f313975e.invoke(obj);
        }
        java.lang.Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        throw new java.util.NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final java.util.HashMap i(jz5.l... pairs) {
        kotlin.jvm.internal.o.g(pairs, "pairs");
        java.util.HashMap hashMap = new java.util.HashMap(kz5.b1.d(pairs.length));
        p(hashMap, pairs);
        return hashMap;
    }

    public static final java.util.LinkedHashMap j(jz5.l... pairs) {
        kotlin.jvm.internal.o.g(pairs, "pairs");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(pairs.length));
        p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final java.util.Map k(jz5.l... pairs) {
        kotlin.jvm.internal.o.g(pairs, "pairs");
        if (pairs.length <= 0) {
            return kz5.q0.f314001d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(pairs.length));
        p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final java.util.Map l(jz5.l... pairs) {
        kotlin.jvm.internal.o.g(pairs, "pairs");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(pairs.length));
        p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final java.util.Map m(java.util.Map map, java.util.Map map2) {
        kotlin.jvm.internal.o.g(map, "<this>");
        kotlin.jvm.internal.o.g(map2, "map");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final java.util.Map n(java.util.Map map, jz5.l pair) {
        kotlin.jvm.internal.o.g(map, "<this>");
        kotlin.jvm.internal.o.g(pair, "pair");
        if (map.isEmpty()) {
            return kz5.b1.e(pair);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.put(pair.f302833d, pair.f302834e);
        return linkedHashMap;
    }

    public static final void o(java.util.Map map, java.lang.Iterable pairs) {
        kotlin.jvm.internal.o.g(map, "<this>");
        kotlin.jvm.internal.o.g(pairs, "pairs");
        java.util.Iterator it = pairs.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            map.put(lVar.f302833d, lVar.f302834e);
        }
    }

    public static final void p(java.util.Map map, jz5.l[] pairs) {
        kotlin.jvm.internal.o.g(map, "<this>");
        kotlin.jvm.internal.o.g(pairs, "pairs");
        for (jz5.l lVar : pairs) {
            map.put(lVar.f302833d, lVar.f302834e);
        }
    }

    public static final java.util.Map q(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        boolean z17 = iterable instanceof java.util.Collection;
        kz5.q0 q0Var = kz5.q0.f314001d;
        if (!z17) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            r(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : kz5.b1.f(linkedHashMap) : q0Var;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return q0Var;
        }
        if (size2 == 1) {
            return kz5.b1.e((jz5.l) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : iterable.iterator().next()));
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(collection.size()));
        r(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static final java.util.Map r(java.lang.Iterable iterable, java.util.Map destination) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        o(destination, iterable);
        return destination;
    }

    public static final java.util.Map s(java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? t(map) : kz5.b1.f(map) : kz5.q0.f314001d;
    }

    public static final java.util.Map t(java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        return new java.util.LinkedHashMap(map);
    }
}
