package qg5;

@j95.b
/* loaded from: classes3.dex */
public final class j2 extends i95.w implements ct.y2 {
    public final java.lang.Object Ai(java.lang.Object obj) {
        if (obj instanceof java.util.Map) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            return wi(kotlin.jvm.internal.m0.c(obj));
        }
        if (obj instanceof java.util.List) {
            java.lang.Iterable iterable = (java.lang.Iterable) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(Ai(it.next()));
            }
            return kz5.n0.V0(arrayList);
        }
        if (!(obj instanceof java.util.Set)) {
            return obj;
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
        java.util.Iterator it6 = iterable2.iterator();
        while (it6.hasNext()) {
            arrayList2.add(Ai(it6.next()));
        }
        return kz5.n0.X0(arrayList2);
    }

    public final java.util.Map wi(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.util.Map) {
                    kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    value = wi(kotlin.jvm.internal.m0.c(value));
                } else if (value instanceof java.util.List) {
                    java.lang.Iterable iterable = (java.lang.Iterable) value;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                    java.util.Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Ai(it.next()));
                    }
                    value = kz5.n0.V0(arrayList);
                } else if (value instanceof java.util.Set) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) value;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
                    java.util.Iterator it6 = iterable2.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(Ai(it6.next()));
                    }
                    value = kz5.n0.X0(arrayList2);
                }
                linkedHashMap.put(str, value);
            }
        } catch (java.lang.Exception e17) {
            linkedHashMap.put("copyParamsErr", e17.toString());
        }
        return linkedHashMap;
    }
}
