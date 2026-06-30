package h06;

/* loaded from: classes15.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final f06.d a(f06.e eVar) {
        o06.g gVar;
        kotlin.jvm.internal.o.g(eVar, "<this>");
        if (eVar instanceof f06.d) {
            return (f06.d) eVar;
        }
        if (!(eVar instanceof f06.x)) {
            throw new i06.a4("Cannot calculate JVM erasure for type: " + eVar);
        }
        f06.v vVar = i06.y3.f286801g[0];
        java.lang.Object invoke = ((i06.y3) ((f06.x) eVar)).f286803e.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        java.util.List list = (java.util.List) invoke;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            f06.w wVar = (f06.w) next;
            kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            o06.j i17 = ((i06.w3) wVar).f286780d.w0().i();
            gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
            if ((gVar == null || gVar.j() == o06.h.f341961e || gVar.j() == o06.h.f341964h) ? false : true) {
                gVar = next;
                break;
            }
        }
        f06.w wVar2 = (f06.w) gVar;
        if (wVar2 == null) {
            wVar2 = (f06.w) kz5.n0.Z(list);
        }
        return wVar2 != null ? b(wVar2) : kotlin.jvm.internal.i0.a(java.lang.Object.class);
    }

    public static final f06.d b(f06.w wVar) {
        f06.d a17;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        f06.e i17 = ((i06.w3) wVar).i();
        if (i17 != null && (a17 = a(i17)) != null) {
            return a17;
        }
        throw new i06.a4("Cannot calculate JVM erasure for type: " + wVar);
    }
}
