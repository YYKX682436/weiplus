package f26;

/* loaded from: classes16.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public static f26.v a(f26.u uVar, f26.c3 type, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        uVar.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        if (type instanceof f26.v) {
            return (f26.v) type;
        }
        if (!z18) {
            type.w0();
            boolean z19 = true;
            if ((type.w0().i() instanceof o06.e2) || (type instanceof g26.n)) {
                o06.j i18 = type.w0().i();
                r06.p1 p1Var = i18 instanceof r06.p1 ? (r06.p1) i18 : null;
                if (!((p1Var == null || p1Var.f368503r) ? false : true)) {
                    z19 = (z17 && (type.w0().i() instanceof o06.e2)) ? f26.z2.f(type) : true ^ f26.c.f259137a.a(g26.a.a(false, true, g26.w.f268018a, null, null, 24, null), f26.h0.c(type), f26.x1.f259234a);
                }
            } else {
                z19 = false;
            }
            if (!z19) {
                return null;
            }
        }
        if (type instanceof f26.e0) {
            f26.e0 e0Var = (f26.e0) type;
            kotlin.jvm.internal.o.b(e0Var.f259153e.w0(), e0Var.f259154f.w0());
        }
        return new f26.v(f26.h0.c(type).A0(false), z17);
    }
}
