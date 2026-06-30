package f26;

/* loaded from: classes16.dex */
public abstract class r2 {
    public static final f26.z0 a(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        f26.c3 z07 = o0Var.z0();
        f26.z0 z0Var = z07 instanceof f26.z0 ? (f26.z0) z07 : null;
        if (z0Var != null) {
            return z0Var;
        }
        throw new java.lang.IllegalStateException(("This is should be simple type: " + o0Var).toString());
    }

    public static final f26.z0 b(f26.z0 z0Var, java.util.List newArguments, f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(z0Var, "<this>");
        kotlin.jvm.internal.o.g(newArguments, "newArguments");
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == z0Var.v0()) {
            return z0Var;
        }
        if (newArguments.isEmpty()) {
            return z0Var.C0(newAttributes);
        }
        if (!(z0Var instanceof h26.j)) {
            return f26.r0.d(newAttributes, z0Var.w0(), newArguments, z0Var.x0(), null);
        }
        h26.j jVar = (h26.j) z0Var;
        f26.c2 c2Var = jVar.f278343e;
        y16.s sVar = jVar.f278344f;
        h26.l lVar = jVar.f278345g;
        boolean z17 = jVar.f278347i;
        java.lang.String[] strArr = jVar.f278348m;
        return new h26.j(c2Var, sVar, lVar, newArguments, z17, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static f26.o0 c(f26.o0 o0Var, java.util.List newArguments, p06.k newAnnotations, java.util.List newArgumentsForUpperBound, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            newArguments = o0Var.u0();
        }
        if ((i17 & 2) != 0) {
            newAnnotations = o0Var.getAnnotations();
        }
        if ((i17 & 4) != 0) {
            newArgumentsForUpperBound = newArguments;
        }
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        kotlin.jvm.internal.o.g(newArguments, "newArguments");
        kotlin.jvm.internal.o.g(newAnnotations, "newAnnotations");
        kotlin.jvm.internal.o.g(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == o0Var.u0()) && newAnnotations == o0Var.getAnnotations()) {
            return o0Var;
        }
        f26.r1 v07 = o0Var.v0();
        if ((newAnnotations instanceof p06.s) && newAnnotations.isEmpty()) {
            int i18 = p06.k.Z0;
            newAnnotations = p06.i.f350765a;
        }
        f26.r1 a17 = f26.s1.a(v07, newAnnotations);
        f26.c3 z07 = o0Var.z0();
        if (z07 instanceof f26.e0) {
            f26.e0 e0Var = (f26.e0) z07;
            return f26.r0.a(b(e0Var.f259153e, newArguments, a17), b(e0Var.f259154f, newArgumentsForUpperBound, a17));
        }
        if (z07 instanceof f26.z0) {
            return b((f26.z0) z07, newArguments, a17);
        }
        throw new jz5.j();
    }

    public static /* synthetic */ f26.z0 d(f26.z0 z0Var, java.util.List list, f26.r1 r1Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = z0Var.u0();
        }
        if ((i17 & 2) != 0) {
            r1Var = z0Var.v0();
        }
        return b(z0Var, list, r1Var);
    }
}
