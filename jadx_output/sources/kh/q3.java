package kh;

/* loaded from: classes12.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.q3 f307897a = new kh.q3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f307898b = jz5.h.a(jz5.i.f302829d, kh.p3.f307888d);

    public final java.util.Map a() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.matrix.batterycanary.monitor.feature.c cVar = (com.tencent.matrix.batterycanary.monitor.feature.c) ph.a.a(com.tencent.matrix.batterycanary.monitor.feature.c.class);
        if (cVar == null) {
            return kz5.q0.f314001d;
        }
        java.util.List<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot> list = cVar.k(true).f52562h.f395560a;
        kotlin.jvm.internal.o.f(list, "getList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot : list) {
            kh.q3 q3Var = f307897a;
            java.lang.String name = threadJiffiesSnapshot.f52566c;
            kotlin.jvm.internal.o.f(name, "name");
            int i17 = threadJiffiesSnapshot.f52565b;
            java.lang.String b17 = q3Var.b(name, i17);
            arrayList.add(b17 != null ? new kh.f3(b17, i17) : new kh.f3(name, i17));
        }
        kh.e3 e3Var = kh.e3.f307787a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            java.lang.String str3 = "Miss";
            if (!it.hasNext()) {
                break;
            }
            kh.f3 f3Var = (kh.f3) it.next();
            jz5.o a17 = kh.e3.f307787a.a(f3Var);
            if (a17 != null && (str2 = (java.lang.String) a17.f302841d) != null) {
                str3 = str2;
            }
            if (a17 == null || (str = (java.lang.String) a17.f302842e) == null) {
                str = "";
            }
            arrayList2.add(new jz5.l(str3, new jz5.l(f3Var, str)));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            java.lang.String str4 = (java.lang.String) ((jz5.l) next).f302833d;
            java.lang.Object obj = linkedHashMap.get(str4);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(str4, obj);
            }
            ((java.util.List) obj).add(next);
        }
        java.util.Set<java.util.Map.Entry> entrySet = linkedHashMap.entrySet();
        int d17 = kz5.b1.d(kz5.d0.q(entrySet, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it7 = iterable.iterator();
            while (it7.hasNext()) {
                arrayList3.add((jz5.l) ((jz5.l) it7.next()).f302834e);
            }
            linkedHashMap2.put(key, arrayList3);
        }
        java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap2.entrySet(), new kh.d3(new kh.c3("Bad", "Miss")));
        int d18 = kz5.b1.d(kz5.d0.q(F0, 10));
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(d18 >= 16 ? d18 : 16);
        for (java.util.Map.Entry entry2 : F0) {
            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
        }
        int i18 = com.tencent.mm.feature.performance.api.a.f67523m0;
        return linkedHashMap3;
    }

    public final java.lang.String b(java.lang.String name, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(name, "name");
        jz5.g gVar = f307898b;
        java.util.Iterator it = ((java.util.List) gVar.getValue()).iterator();
        java.lang.String str = null;
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            kh.o3 o3Var = (kh.o3) it.next();
            java.lang.String a17 = o3Var.a(name, i17);
            if (a17 != null) {
                z17 = o3Var instanceof kh.n3;
                str = a17;
                break;
            }
            str = a17;
        }
        if (str == null || !z17) {
            return str;
        }
        java.util.Iterator it6 = ((java.util.List) gVar.getValue()).iterator();
        while (it6.hasNext()) {
            java.lang.String a18 = ((kh.o3) it6.next()).a(str, i17);
            if (a18 != null) {
                return a18;
            }
        }
        return str;
    }
}
