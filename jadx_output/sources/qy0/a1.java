package qy0;

/* loaded from: classes14.dex */
public abstract class a1 {
    public static final void a(yz5.a onNextClick, yz5.a onBackClick, float f17, float f18, com.tencent.mm.mj_template.sns.compose.widget.m7 templateState, ty0.b1 musicState, boolean z17, kotlinx.coroutines.y0 scope, boolean z18, java.util.List imagePathList, qy0.h0 reporter, n0.o oVar, int i17, int i18) {
        z0.p pVar;
        androidx.compose.ui.platform.b4 b4Var;
        n0.v2 v2Var;
        java.lang.Object obj;
        boolean z19;
        float f19;
        kotlin.jvm.internal.o.g(onNextClick, "onNextClick");
        kotlin.jvm.internal.o.g(onBackClick, "onBackClick");
        kotlin.jvm.internal.o.g(templateState, "templateState");
        kotlin.jvm.internal.o.g(musicState, "musicState");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(imagePathList, "imagePathList");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1870850690);
        java.lang.Object obj2 = n0.e1.f333492a;
        y0Var.U(2003826476);
        java.lang.Object y17 = y0Var.y();
        int i19 = n0.o.f333629a;
        java.lang.Object obj3 = n0.n.f333620a;
        if (y17 == obj3) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var2 = (n0.v2) y17;
        y0Var.o(false);
        y0Var.U(2003826548);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj3) {
            y18 = n0.s4.c(0, null, 2, null);
            y0Var.g0(y18);
        }
        n0.v2 v2Var3 = (n0.v2) y18;
        y0Var.o(false);
        y0Var.U(2003826619);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj3) {
            y19 = n0.s4.c(qy0.a.f367552d, null, 2, null);
            y0Var.g0(y19);
        }
        n0.v2 v2Var4 = (n0.v2) y19;
        y0Var.o(false);
        e0.f1 a17 = e0.h1.a(0, 0, y0Var, 0, 3);
        androidx.compose.ui.platform.b4 a18 = androidx.compose.ui.platform.n3.f10666a.a(y0Var, 0);
        y0Var.U(2003826817);
        z0.p pVar2 = z0.p.f468921d;
        if (z17) {
            pVar = pVar2;
            b4Var = a18;
            v2Var = v2Var4;
            obj = obj3;
            z19 = false;
            f19 = 0.0f;
        } else {
            int i27 = z0.t.f468922q1;
            obj = obj3;
            z0.t e17 = d0.a3.e(pVar2, 0.0f, 1, null);
            int i28 = e1.y.f246321l;
            pVar = pVar2;
            b4Var = a18;
            v2Var = v2Var4;
            z19 = false;
            f19 = 0.0f;
            wy0.m.a(imagePathList, a0.b.c(e17, e1.y.f246311b, null, 2, null), ((java.lang.Number) v2Var3.getValue()).intValue(), y0Var, 8, 0);
        }
        y0Var.o(z19);
        java.lang.Object obj4 = obj;
        y.q.c((z18 || !((java.lang.Boolean) v2Var2.getValue()).booleanValue()) ? true : z19, null, y.x0.b(null, f19, 3, null), y.x0.c(null, f19, 3, null), null, u0.j.b(y0Var, -1755169446, true, new qy0.n0(f18, templateState, a17, v2Var3, f17, onNextClick, onBackClick, musicState, v2Var2, z18, reporter, v2Var)), y0Var, 200064, 18);
        y0Var.U(2003828378);
        n0.v2 v2Var5 = v2Var;
        boolean e18 = y0Var.e(v2Var2) | y0Var.e(v2Var5);
        java.lang.Object y27 = y0Var.y();
        if (e18 || y27 == obj4) {
            y27 = new qy0.z0(v2Var2, v2Var5);
            y0Var.g0(y27);
        }
        yz5.a aVar = (yz5.a) y27;
        y0Var.o(false);
        boolean z27 = ((java.lang.Boolean) v2Var2.getValue()).booleanValue() && !z18;
        y.y0 e19 = y.x0.e(z.q.d(300, 0, null, 6, null), qy0.o0.f367631d);
        y.a1 f27 = y.x0.f(z.q.d(300, 0, null, 6, null), qy0.p0.f367636d);
        int i29 = z0.t.f468922q1;
        y0Var.U(2003828805);
        java.lang.Object y28 = y0Var.y();
        if (y28 == obj4) {
            y28 = new c0.p();
            y0Var.g0(y28);
        }
        c0.o oVar2 = (c0.o) y28;
        y0Var.o(false);
        y0Var.U(2003828899);
        androidx.compose.ui.platform.b4 b4Var2 = b4Var;
        boolean e27 = y0Var.e(v2Var5) | y0Var.e(aVar) | y0Var.e(b4Var2);
        java.lang.Object y29 = y0Var.y();
        if (e27 || y29 == obj4) {
            y29 = new qy0.q0(aVar, b4Var2, v2Var5);
            y0Var.g0(y29);
        }
        y0Var.o(false);
        y.q.c(z27, a0.d0.c(pVar, oVar2, null, false, null, null, (yz5.a) y29, 28, null), e19, f27, null, u0.j.b(y0Var, 2001350097, true, new qy0.x0(f17, z17, scope, aVar, v2Var5, v2Var2, musicState)), y0Var, 200064, 16);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new qy0.y0(onNextClick, onBackClick, f17, f18, templateState, musicState, z17, scope, z18, imagePathList, reporter, i17, i18);
        }
    }

    public static final void b(d0.z zVar, ty0.b1 b1Var, boolean z17, yz5.a aVar, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1559169851);
        java.lang.Object obj = n0.e1.f333492a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!z17);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        int i19 = z0.d.f468903a;
        y.f0.a(valueOf, zVar.a(pVar, z0.a.f468893e), null, u0.j.b(y0Var, 340111525, true, new qy0.i0(b1Var, aVar)), y0Var, 3072, 4);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new qy0.j0(zVar, b1Var, z17, aVar, i17);
        }
    }

    public static final void c(yz5.a aVar, yz5.a aVar2, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1981627299);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(aVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(aVar2) ? 32 : 16;
        }
        int i19 = i18;
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i27 = z0.d.f468903a;
            z0.c cVar = z0.a.f468899k;
            int i28 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            float f17 = 8;
            z0.t h17 = d0.a2.h(d0.a3.f(pVar, 0.0f, 1, null), 2 * f17, 0.0f, 2, null);
            y0Var.U(693286680);
            s1.t0 a17 = d0.n2.a(d0.p.f225184b, cVar, y0Var, 48);
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar3 = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(h17);
            if (!(y0Var.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar3);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            n0.i5.a(y0Var, a17, u1.f.f423590e);
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-678309503);
            d0.q2 q2Var = d0.q2.f225198a;
            float f18 = 3 * f17;
            a0.q1.a(rz0.a.a(com.tencent.mm.R.raw.icons_filled_close, e1.y.f246315f, y0Var, 48), "close_icon", a0.d0.d(d0.a3.i(d0.a2.f(pVar, 1 * f17), f18, f18), false, null, null, aVar2, 7, null), null, null, 0.0f, null, y0Var, 56, 120);
            d0.e3.a(d0.o2.a(q2Var, pVar, 1.0f, false, 2, null), y0Var, 0);
            tz0.f fVar2 = tz0.f.f423181e;
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490502ww);
            kotlin.jvm.internal.o.f(g17, "<get-str>(...)");
            tz0.c.a(aVar, null, fVar2, null, false, g17, null, y0Var, (i19 & 14) | 0, 90);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new qy0.k0(aVar, aVar2, i17);
        }
    }
}
