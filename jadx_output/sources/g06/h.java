package g06;

/* loaded from: classes15.dex */
public abstract class h {
    public static final f06.w a(f06.e eVar, java.util.List arguments, boolean z17, java.util.List annotations) {
        o06.j h17;
        f26.r1 r1Var;
        f26.m2 g1Var;
        kotlin.jvm.internal.o.g(eVar, "<this>");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        i06.l1 l1Var = eVar instanceof i06.l1 ? (i06.l1) eVar : null;
        if (l1Var == null || (h17 = l1Var.h()) == null) {
            throw new i06.a4("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        f26.c2 g17 = h17.g();
        kotlin.jvm.internal.o.f(g17, "getTypeConstructor(...)");
        java.util.List parameters = g17.getParameters();
        kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
        if (parameters.size() != arguments.size()) {
            throw new java.lang.IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            f26.r1.f259214e.getClass();
            r1Var = f26.r1.f259215f;
        } else {
            f26.r1.f259214e.getClass();
            r1Var = f26.r1.f259215f;
        }
        java.util.List parameters2 = g17.getParameters();
        kotlin.jvm.internal.o.f(parameters2, "getParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(arguments, 10));
        int i17 = 0;
        for (java.lang.Object obj : arguments) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f06.z zVar = (f06.z) obj;
            i06.w3 w3Var = (i06.w3) zVar.f258461b;
            f26.o0 o0Var = w3Var != null ? w3Var.f286780d : null;
            f06.a0 a0Var = zVar.f258460a;
            int i19 = a0Var == null ? -1 : g06.g.f267499a[a0Var.ordinal()];
            if (i19 == -1) {
                java.lang.Object obj2 = parameters2.get(i17);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                g1Var = new f26.g1((o06.e2) obj2);
            } else if (i19 == 1) {
                f26.d3 d3Var = f26.d3.f259143f;
                kotlin.jvm.internal.o.d(o0Var);
                g1Var = new f26.n2(d3Var, o0Var);
            } else if (i19 == 2) {
                f26.d3 d3Var2 = f26.d3.f259144g;
                kotlin.jvm.internal.o.d(o0Var);
                g1Var = new f26.n2(d3Var2, o0Var);
            } else {
                if (i19 != 3) {
                    throw new jz5.j();
                }
                f26.d3 d3Var3 = f26.d3.f259145h;
                kotlin.jvm.internal.o.d(o0Var);
                g1Var = new f26.n2(d3Var3, o0Var);
            }
            arrayList.add(g1Var);
            i17 = i18;
        }
        return new i06.w3(f26.r0.d(r1Var, g17, arrayList, z17, null), null);
    }
}
