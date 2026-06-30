package r16;

/* loaded from: classes16.dex */
public class g extends r06.r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o06.g gVar, o06.x1 x1Var, boolean z17) {
        super(gVar, null, p06.i.f350765a, true, o06.c.DECLARATION, x1Var);
        o06.g0 g0Var;
        if (gVar == null) {
            G(0);
            throw null;
        }
        if (x1Var == null) {
            G(1);
            throw null;
        }
        int i17 = p06.k.Z0;
        java.util.List emptyList = java.util.Collections.emptyList();
        int i18 = r16.i.f368658a;
        o06.h j17 = gVar.j();
        if (j17 == o06.h.f341962f || j17.h()) {
            g0Var = o06.f0.f341941a;
            if (g0Var == null) {
                r16.i.a(49);
                throw null;
            }
        } else if (r16.i.r(gVar)) {
            if (z17) {
                g0Var = o06.f0.f341943c;
                if (g0Var == null) {
                    r16.i.a(50);
                    throw null;
                }
            } else {
                g0Var = o06.f0.f341941a;
                if (g0Var == null) {
                    r16.i.a(51);
                    throw null;
                }
            }
        } else if (r16.i.l(gVar)) {
            g0Var = o06.f0.f341950j;
            if (g0Var == null) {
                r16.i.a(52);
                throw null;
            }
        } else {
            g0Var = o06.f0.f341945e;
            if (g0Var == null) {
                r16.i.a(53);
                throw null;
            }
        }
        G0(emptyList, g0Var);
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = ya.b.SOURCE;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
