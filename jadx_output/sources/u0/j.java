package u0;

/* loaded from: classes14.dex */
public abstract class j {
    public static final int a(int i17, int i18) {
        return i17 << (((i18 % 10) * 3) + 1);
    }

    public static final u0.a b(n0.o composer, int i17, boolean z17, java.lang.Object block) {
        u0.i iVar;
        kotlin.jvm.internal.o.g(composer, "composer");
        kotlin.jvm.internal.o.g(block, "block");
        n0.y0 y0Var = (n0.y0) composer;
        y0Var.U(i17);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            iVar = new u0.i(i17, z17);
            y0Var.g0(iVar);
        } else {
            if (y17 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            }
            iVar = (u0.i) y17;
        }
        iVar.k(block);
        y0Var.o(false);
        return iVar;
    }

    public static final u0.a c(int i17, boolean z17, java.lang.Object block) {
        kotlin.jvm.internal.o.g(block, "block");
        u0.i iVar = new u0.i(i17, z17);
        iVar.k(block);
        return iVar;
    }

    public static final boolean d(n0.j3 j3Var, n0.j3 other) {
        boolean z17;
        kotlin.jvm.internal.o.g(other, "other");
        if (j3Var == null) {
            return true;
        }
        if ((j3Var instanceof n0.l3) && (other instanceof n0.l3)) {
            n0.l3 l3Var = (n0.l3) j3Var;
            if (l3Var.f333605a != null) {
                n0.d dVar = l3Var.f333607c;
                if (dVar != null ? dVar.a() : false) {
                    z17 = true;
                    if (z17 || kotlin.jvm.internal.o.b(j3Var, other) || kotlin.jvm.internal.o.b(l3Var.f333607c, ((n0.l3) other).f333607c)) {
                        return true;
                    }
                }
            }
            z17 = false;
            return z17 ? true : true;
        }
        return false;
    }
}
