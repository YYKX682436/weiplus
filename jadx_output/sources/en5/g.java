package en5;

/* loaded from: classes14.dex */
public abstract class g {
    public static final void a(h1.c painter, z0.t modifier, java.lang.String str, n0.o oVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(painter, "painter");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1959201981);
        java.lang.String str2 = (i18 & 4) != 0 ? null : str;
        java.lang.Object obj = n0.e1.f333492a;
        int i19 = s1.p.f402054a;
        s1.p pVar = s1.o.f402044a;
        int i27 = z0.d.f468903a;
        a0.q1.a(painter, str2, modifier, z0.a.f468893e, pVar, 0.0f, null, y0Var, ((i17 >> 3) & 112) | 27656 | ((i17 << 3) & ce1.h.CTRL_INDEX), 96);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new en5.e(painter, modifier, str2, i17, i18);
        }
    }

    public static final void b(h1.c painter, float f17, float f18, java.lang.String str, n0.o oVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(painter, "painter");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1010960939);
        if ((i18 & 8) != 0) {
            str = null;
        }
        java.lang.Object obj = n0.e1.f333492a;
        int i19 = z0.t.f468922q1;
        a(painter, d0.a3.i(z0.p.f468921d, f17, f18), str, y0Var, ((i17 >> 3) & ce1.h.CTRL_INDEX) | 8, 0);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new en5.f(painter, f17, f18, str, i17, i18);
        }
    }
}
