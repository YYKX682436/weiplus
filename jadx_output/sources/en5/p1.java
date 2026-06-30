package en5;

/* loaded from: classes14.dex */
public abstract class p1 {
    public static final void a(en5.d selectType, en5.d type, yz5.l onClick, n0.o oVar, int i17) {
        int i18;
        java.lang.String g17;
        f2.r rVar;
        long b17;
        n0.y0 y0Var;
        kotlin.jvm.internal.o.g(selectType, "selectType");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-779191347);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(selectType) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.e(type) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var2.e(onClick) ? 256 : 128;
        }
        if ((i18 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzx);
            } else if (ordinal == 1) {
                g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzz);
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzy);
            }
            int i19 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            y0Var2.U(-341085522);
            java.lang.Object y17 = y0Var2.y();
            int i27 = n0.o.f333629a;
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = new c0.p();
                y0Var2.g0(y17);
            }
            c0.o oVar2 = (c0.o) y17;
            y0Var2.o(false);
            y0Var2.U(-341085481);
            boolean e17 = y0Var2.e(onClick) | y0Var2.e(type);
            java.lang.Object y18 = y0Var2.y();
            if (e17 || y18 == obj2) {
                y18 = new en5.j1(onClick, type);
                y0Var2.g0(y18);
            }
            y0Var2.o(false);
            z0.t c17 = a0.d0.c(pVar, oVar2, null, false, null, null, (yz5.a) y18, 28, null);
            int i28 = aq.o.f12920a ? com.tencent.mm.R.color.BW_0_Alpha_0_0_5 : com.tencent.mm.R.color.f478514w;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            float f17 = 8;
            z0.t b18 = a0.b.b(c17, rz0.a.b(i28, context), i0.h.a(2 * f17));
            y0Var2.U(733328855);
            int i29 = z0.d.f468903a;
            s1.t0 c18 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(b18);
            if (!(y0Var2.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f333784y = false;
            fVar2.getClass();
            n0.i5.a(y0Var2, c18, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            float f18 = ((float) 1.5d) * f17;
            float f19 = ((float) 0.5d) * f17;
            z0.t i37 = d0.a2.i(pVar, f18, f19, f18, f19);
            long z17 = ((p2.f) y0Var2.i(h3Var)).z(((float) 1.88d) * f17);
            if (selectType == type) {
                f2.r rVar2 = f2.r.f258818e;
                rVar = f2.r.f258823m;
            } else {
                rVar = null;
            }
            if (selectType == type) {
                y0Var2.U(1962776744);
                int i38 = aq.o.f12920a ? com.tencent.mm.R.color.FG_0 : com.tencent.mm.R.color.BW_100_Alpha_0_8;
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                b17 = rz0.a.b(i38, context2);
                y0Var2.o(false);
            } else {
                y0Var2.U(1962776793);
                int i39 = aq.o.f12920a ? com.tencent.mm.R.color.FG_1 : com.tencent.mm.R.color.BW_100_Alpha_0_5;
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                b17 = rz0.a.b(i39, context3);
                y0Var2.o(false);
            }
            kotlin.jvm.internal.o.d(g17);
            tz0.x.b(g17, i37, b17, z17, null, rVar, null, 0L, null, new l2.f(3), 0L, 0, false, 0, null, null, y0Var2, 3072, 0, 64976);
            y0Var = y0Var2;
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new en5.k1(selectType, type, onClick, i17);
        }
    }

    public static final void b(fn5.n0 viewModel, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(610569425);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 V6 = viewModel.V6(y0Var, 8);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        float f17 = 8;
        float f18 = ((float) 1.5d) * f17;
        z0.t j17 = d0.a2.j(pVar, f18, f18, 0.0f, f18, 4, null);
        y0Var.U(693286680);
        d0.p pVar2 = d0.p.f225183a;
        d0.d dVar = d0.p.f225184b;
        int i19 = z0.d.f468903a;
        s1.t0 a17 = d0.n2.a(dVar, z0.a.f468898j, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.f fVar2 = u1.g.f423594i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(j17);
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
        n0.i5.a(y0Var, a17, u1.f.f423590e);
        fVar2.getClass();
        n0.i5.a(y0Var, fVar, u1.f.f423589d);
        fVar2.getClass();
        n0.i5.a(y0Var, sVar, u1.f.f423591f);
        fVar2.getClass();
        n0.i5.a(y0Var, k4Var, u1.f.f423592g);
        y0Var.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-678309503);
        java.lang.Object value = V6.getValue();
        kotlin.jvm.internal.o.f(value, "<get-value>(...)");
        a((en5.d) value, en5.d.f255371d, new en5.l1(viewModel), y0Var, 48);
        float f19 = 1 * f17;
        d0.e3.a(d0.a3.h(pVar, f19), y0Var, 6);
        java.lang.Object value2 = V6.getValue();
        kotlin.jvm.internal.o.f(value2, "<get-value>(...)");
        a((en5.d) value2, en5.d.f255372e, new en5.m1(viewModel), y0Var, 48);
        d0.e3.a(d0.a3.h(pVar, f19), y0Var, 6);
        java.lang.Object value3 = V6.getValue();
        kotlin.jvm.internal.o.f(value3, "<get-value>(...)");
        a((en5.d) value3, en5.d.f255373f, new en5.n1(viewModel), y0Var, 48);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new en5.o1(viewModel, i17);
        }
    }
}
