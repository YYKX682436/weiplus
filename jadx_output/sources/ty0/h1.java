package ty0;

/* loaded from: classes14.dex */
public abstract class h1 {
    public static final void a(java.lang.String path, ty0.i1 i1Var, n0.o oVar, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(path, "path");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1740681195);
        if ((i18 & 1) != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(path) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        int i27 = i18 & 2;
        if (i27 != 0) {
            i19 |= 16;
        }
        if (i27 == 2 && (i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            y0Var.Q();
            if ((i17 & 1) != 0 && !y0Var.u()) {
                y0Var.O();
            } else if (i27 != 0) {
                y0Var.U(1058318404);
                java.lang.Object obj = n0.e1.f333492a;
                y0Var.U(-1054234619);
                java.lang.Object y17 = y0Var.y();
                int i28 = n0.o.f333629a;
                if (y17 == n0.n.f333620a) {
                    y17 = new ty0.i1();
                    y0Var.g0(y17);
                }
                i1Var = (ty0.i1) y17;
                y0Var.o(false);
                y0Var.o(false);
            }
            y0Var.p();
            java.lang.Object obj2 = n0.e1.f333492a;
            r2.f0.a(ty0.e1.f422827d, null, new ty0.f1(new kotlin.jvm.internal.c0(), path, i1Var), y0Var, 0, 2);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new ty0.g1(path, i1Var, i17, i18);
        }
    }
}
