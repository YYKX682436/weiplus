package d0;

/* loaded from: classes14.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final s1.t0 f225241a = new d0.x(false, z0.a.f468889a);

    /* renamed from: b, reason: collision with root package name */
    public static final s1.t0 f225242b = d0.t.f225207a;

    public static final void a(z0.t modifier, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-211209833);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            s1.t0 t0Var = f225242b;
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(modifier);
            int i19 = (((((i18 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(y0Var.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            fVar2.getClass();
            n0.i5.a(y0Var, t0Var, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i19 >> 3) & 112));
            y0Var.U(2058660585);
            y0Var.U(1021196736);
            if (((i19 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                y0Var.O();
            }
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new d0.r(modifier, i17);
    }

    public static final void b(s1.n1 n1Var, s1.o1 o1Var, s1.r0 r0Var, p2.s sVar, int i17, int i18, z0.d dVar) {
        z0.d dVar2;
        java.lang.Object g17 = r0Var.g();
        d0.q qVar = g17 instanceof d0.q ? (d0.q) g17 : null;
        if (qVar == null || (dVar2 = qVar.f225191d) == null) {
            dVar2 = dVar;
        }
        s1.n1.d(n1Var, o1Var, ((z0.g) dVar2).a(p2.r.a(o1Var.f402050d, o1Var.f402051e), p2.r.a(i17, i18), sVar), 0.0f, 2, null);
    }

    public static final s1.t0 c(z0.d alignment, boolean z17, n0.o oVar, int i17) {
        s1.t0 t0Var;
        kotlin.jvm.internal.o.g(alignment, "alignment");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(56522820);
        if (!kotlin.jvm.internal.o.b(alignment, z0.a.f468889a) || z17) {
            y0Var.U(1157296644);
            boolean e17 = y0Var.e(alignment);
            java.lang.Object y17 = y0Var.y();
            if (e17 || y17 == n0.n.f333620a) {
                y17 = new d0.x(z17, alignment);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            t0Var = (s1.t0) y17;
        } else {
            t0Var = f225241a;
        }
        y0Var.o(false);
        return t0Var;
    }
}
