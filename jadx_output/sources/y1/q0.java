package y1;

/* loaded from: classes14.dex */
public abstract class q0 {
    public static final u1.w a(u1.w wVar, yz5.l predicate) {
        kotlin.jvm.internal.o.g(wVar, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        if (((java.lang.Boolean) predicate.invoke(wVar)).booleanValue()) {
            return wVar;
        }
        java.util.List n17 = wVar.n();
        int size = n17.size();
        for (int i17 = 0; i17 < size; i17++) {
            u1.w a17 = a((u1.w) n17.get(i17), predicate);
            if (a17 != null) {
                return a17;
            }
        }
        return null;
    }

    public static final java.util.List b(u1.w wVar, java.util.List list) {
        java.util.List V0;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        kotlin.jvm.internal.o.g(list, "list");
        if (!wVar.x()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List n17 = wVar.n();
        int size = n17.size();
        for (int i17 = 0; i17 < size; i17++) {
            u1.w wVar2 = (u1.w) n17.get(i17);
            if (wVar2.x()) {
                arrayList.add(new y1.g(wVar, wVar2));
            }
        }
        try {
            y1.g.f458707h = y1.d.Stripe;
            V0 = kz5.n0.V0(arrayList);
            kz5.g0.s(V0);
        } catch (java.lang.IllegalArgumentException unused) {
            y1.g.f458707h = y1.d.Location;
            V0 = kz5.n0.V0(arrayList);
            kz5.g0.s(V0);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(V0.size());
        int size2 = V0.size();
        for (int i18 = 0; i18 < size2; i18++) {
            arrayList2.add(((y1.g) V0.get(i18)).f458709e);
        }
        int size3 = arrayList2.size();
        for (int i19 = 0; i19 < size3; i19++) {
            u1.w wVar3 = (u1.w) arrayList2.get(i19);
            y1.n d17 = y1.z.d(wVar3);
            if (d17 != null) {
                list.add(d17);
            } else {
                b(wVar3, list);
            }
        }
        return list;
    }

    public static final u1.c1 c(u1.w wVar) {
        u1.c1 c1Var;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        y1.n c17 = y1.z.c(wVar);
        if (c17 == null) {
            c17 = y1.z.d(wVar);
        }
        return (c17 == null || (c1Var = c17.f423654d) == null) ? wVar.I : c1Var;
    }
}
