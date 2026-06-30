package q85;

/* loaded from: classes14.dex */
public abstract class m {
    public static final void a(java.lang.String str, long j17, long j18, n0.o oVar, int i17, int i18) {
        java.lang.String str2;
        int i19;
        long j19;
        long j27;
        java.lang.String str3;
        java.lang.String str4;
        long j28;
        long j29;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-2023128502);
        int i27 = i18 & 1;
        if (i27 != 0) {
            i19 = i17 | 6;
            str2 = str;
        } else if ((i17 & 14) == 0) {
            str2 = str;
            i19 = (y0Var.e(str2) ? 4 : 2) | i17;
        } else {
            str2 = str;
            i19 = i17;
        }
        if ((i17 & 112) == 0) {
            j19 = j17;
            i19 |= ((i18 & 2) == 0 && y0Var.d(j19)) ? 32 : 16;
        } else {
            j19 = j17;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            j27 = j18;
            i19 |= ((i18 & 4) == 0 && y0Var.d(j27)) ? 256 : 128;
        } else {
            j27 = j18;
        }
        if ((i19 & 731) == 146 && y0Var.v()) {
            y0Var.O();
            str4 = str2;
            j29 = j19;
            j28 = j27;
        } else {
            y0Var.Q();
            if ((i17 & 1) == 0 || y0Var.u()) {
                str3 = i27 != 0 ? "•" : str2;
                if ((i18 & 2) != 0) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    j19 = rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_3, context);
                    i19 &= -113;
                }
                if ((i18 & 4) != 0) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    j27 = rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_1_5, context2);
                    i19 &= -897;
                }
            } else {
                y0Var.O();
                if ((i18 & 2) != 0) {
                    i19 &= -113;
                }
                if ((i18 & 4) != 0) {
                    i19 &= -897;
                }
                str3 = str2;
            }
            int i28 = i19;
            long j37 = j19;
            long j38 = j27;
            y0Var.p();
            java.lang.Object obj = n0.e1.f333492a;
            int i29 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            z0.t f17 = d0.a3.f(pVar, 0.0f, 1, null);
            y0Var.U(-483455358);
            d0.p pVar2 = d0.p.f225183a;
            d0.l lVar = d0.p.f225186d;
            int i37 = z0.d.f468903a;
            s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var, 0);
            y0Var.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(f17);
            n0.e eVar = y0Var.f333761b;
            if (!(eVar instanceof n0.e)) {
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
            yz5.p pVar3 = u1.f.f423590e;
            n0.i5.a(y0Var, a17, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f423589d;
            n0.i5.a(y0Var, fVar, pVar4);
            fVar2.getClass();
            yz5.p pVar5 = u1.f.f423591f;
            n0.i5.a(y0Var, sVar, pVar5);
            fVar2.getClass();
            yz5.p pVar6 = u1.f.f423592g;
            n0.i5.a(y0Var, k4Var, pVar6);
            y0Var.n();
            java.lang.String str5 = str3;
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-1163856341);
            z0.b bVar = z0.a.f468901m;
            boolean z17 = androidx.compose.ui.platform.f3.f10562a;
            d0.t0 t0Var = new d0.t0(bVar, androidx.compose.ui.platform.e3.f10553d);
            pVar.k(t0Var);
            float f18 = 8;
            z0.t g17 = d0.a3.g(d0.a2.j(t0Var, 0.0f, 6 * f18, 0.0f, 4 * f18, 5, null), ((float) 8.5d) * f18);
            y0Var.U(693286680);
            s1.t0 a19 = d0.n2.a(d0.p.f225184b, z0.a.f468898j, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar3 = (p2.f) y0Var.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            fVar2.getClass();
            yz5.q a27 = s1.g0.a(g17);
            if (!(eVar instanceof n0.e)) {
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
            n0.i5.a(y0Var, a19, pVar3);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar3, pVar4);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar2, pVar5);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var2, pVar6);
            y0Var.n();
            ((u0.i) a27).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-678309503);
            d0.q2 q2Var = d0.q2.f225198a;
            float f19 = ((float) 6.88d) * f18;
            d0.e3.a(d0.a3.j(pVar, f19), y0Var, 6);
            float f27 = 3 * f18;
            float f28 = 1;
            z0.t g18 = d0.a3.g(d0.a3.j(pVar, f27), f28);
            z0.c cVar = z0.a.f468899k;
            int i38 = (i28 >> 3) & 112;
            l0.a0.a(q2Var.a(g18, cVar), j38, 0.0f, 0.0f, y0Var, i38, 12);
            float f29 = f28 * f18;
            l0.e5.c(str5, d0.a2.j(q2Var.a(pVar, cVar), f29, 0.0f, f29, 0.0f, 10, null), j37, ((p2.f) y0Var.i(h3Var)).z(((float) 1.75d) * f18), null, null, null, 0L, null, new l2.f(3), 0L, 0, false, 0, null, null, y0Var, (i28 & 14) | 3072 | ((i28 << 3) & ce1.h.CTRL_INDEX), 0, 65008);
            int i39 = z0.t.f468922q1;
            l0.a0.a(q2Var.a(d0.a3.g(d0.a3.j(pVar, f27), f28), cVar), j38, 0.0f, 0.0f, y0Var, i38, 12);
            d0.e3.a(d0.a3.j(pVar, f19), y0Var, 6);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            java.lang.Object obj2 = n0.e1.f333492a;
            str4 = str5;
            j28 = j38;
            j29 = j37;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new q85.l(str4, j29, j28, i17, i18);
        }
    }
}
