package g26;

/* loaded from: classes16.dex */
public abstract class e {
    public static final f26.c3 a(java.util.List types) {
        f26.z0 z0Var;
        kotlin.jvm.internal.o.g(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (f26.c3) kz5.n0.z0(types);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(types, 10));
        java.util.Iterator it = types.iterator();
        boolean z17 = false;
        boolean z18 = false;
        while (it.hasNext()) {
            f26.c3 c3Var = (f26.c3) it.next();
            z17 = z17 || f26.s0.a(c3Var);
            if (c3Var instanceof f26.z0) {
                z0Var = (f26.z0) c3Var;
            } else {
                if (!(c3Var instanceof f26.e0)) {
                    throw new jz5.j();
                }
                kotlin.jvm.internal.o.g(c3Var, "<this>");
                z0Var = ((f26.e0) c3Var).f259153e;
                z18 = true;
            }
            arrayList.add(z0Var);
        }
        if (z17) {
            return h26.m.c(h26.l.D, types.toString());
        }
        g26.g0 g0Var = g26.g0.f267992a;
        if (!z18) {
            return g0Var.b(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(types, 10));
        java.util.Iterator it6 = types.iterator();
        while (it6.hasNext()) {
            arrayList2.add(f26.h0.d((f26.c3) it6.next()));
        }
        return f26.r0.a(g0Var.b(arrayList), g0Var.b(arrayList2));
    }
}
