package f26;

/* loaded from: classes16.dex */
public abstract class d1 {
    public static final f26.c3 a(f26.c3 c3Var, boolean z17) {
        kotlin.jvm.internal.o.g(c3Var, "<this>");
        f26.v a17 = f26.u.a(f26.v.f259227g, c3Var, z17, false, 4, null);
        if (a17 != null) {
            return a17;
        }
        f26.z0 b17 = b(c3Var);
        return b17 != null ? b17 : c3Var.A0(false);
    }

    public static final f26.z0 b(f26.o0 o0Var) {
        f26.n0 n0Var;
        f26.c2 w07 = o0Var.w0();
        f26.n0 n0Var2 = w07 instanceof f26.n0 ? (f26.n0) w07 : null;
        if (n0Var2 == null) {
            return null;
        }
        java.util.LinkedHashSet<f26.o0> linkedHashSet = n0Var2.f259198b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedHashSet, 10));
        boolean z17 = false;
        for (f26.o0 o0Var2 : linkedHashSet) {
            if (f26.z2.f(o0Var2)) {
                o0Var2 = a(o0Var2.z0(), false);
                z17 = true;
            }
            arrayList.add(o0Var2);
        }
        if (z17) {
            f26.o0 o0Var3 = n0Var2.f259197a;
            if (o0Var3 == null) {
                o0Var3 = null;
            } else if (f26.z2.f(o0Var3)) {
                o0Var3 = a(o0Var3.z0(), false);
            }
            arrayList.isEmpty();
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            n0Var = new f26.n0(linkedHashSet2, o0Var3);
        } else {
            n0Var = null;
        }
        if (n0Var == null) {
            return null;
        }
        return n0Var.b();
    }

    public static final f26.z0 c(f26.z0 z0Var, f26.z0 abbreviatedType) {
        kotlin.jvm.internal.o.g(z0Var, "<this>");
        kotlin.jvm.internal.o.g(abbreviatedType, "abbreviatedType");
        return f26.s0.a(z0Var) ? z0Var : new f26.a(z0Var, abbreviatedType);
    }
}
