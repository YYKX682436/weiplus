package f26;

/* loaded from: classes16.dex */
public abstract class i1 {
    public static final f26.o0 a(java.util.List list, java.util.List list2, l06.o oVar) {
        f26.o0 k17 = f26.v2.e(new f26.h1(list)).k((f26.o0) kz5.n0.X(list2), f26.d3.f259145h);
        if (k17 == null) {
            k17 = oVar.n();
        }
        kotlin.jvm.internal.o.d(k17);
        return k17;
    }

    public static final f26.o0 b(o06.e2 e2Var) {
        kotlin.jvm.internal.o.g(e2Var, "<this>");
        o06.m e17 = e2Var.e();
        kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
        if (e17 instanceof o06.k) {
            java.util.List parameters = ((o06.k) e17).g().getParameters();
            kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(parameters, 10));
            java.util.Iterator it = parameters.iterator();
            while (it.hasNext()) {
                f26.c2 g17 = ((o06.e2) it.next()).g();
                kotlin.jvm.internal.o.f(g17, "getTypeConstructor(...)");
                arrayList.add(g17);
            }
            java.util.List upperBounds = e2Var.getUpperBounds();
            kotlin.jvm.internal.o.f(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, v16.f.e(e2Var));
        }
        if (!(e17 instanceof o06.n0)) {
            throw new java.lang.IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        java.util.List typeParameters = ((o06.n0) e17).getTypeParameters();
        kotlin.jvm.internal.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(typeParameters, 10));
        java.util.Iterator it6 = typeParameters.iterator();
        while (it6.hasNext()) {
            f26.c2 g18 = ((o06.e2) it6.next()).g();
            kotlin.jvm.internal.o.f(g18, "getTypeConstructor(...)");
            arrayList2.add(g18);
        }
        java.util.List upperBounds2 = e2Var.getUpperBounds();
        kotlin.jvm.internal.o.f(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, v16.f.e(e2Var));
    }
}
