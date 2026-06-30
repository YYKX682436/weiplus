package en5;

/* loaded from: classes14.dex */
public abstract class l {
    public static final void a(z0.t modifier, int i17, java.util.ArrayList data, yz5.l onDetailClick, n0.o oVar, int i18) {
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-405252879);
        java.lang.Object obj = n0.e1.f333492a;
        int i19 = i18 & 14;
        y0Var.U(-483455358);
        d0.p pVar = d0.p.f225183a;
        d0.l lVar = d0.p.f225186d;
        int i27 = z0.d.f468903a;
        int i28 = i19 >> 3;
        s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var, (i28 & 112) | (i28 & 14));
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.f fVar2 = u1.g.f423594i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(modifier);
        int i29 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
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
        ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i29 >> 3) & 112));
        y0Var.U(2058660585);
        y0Var.U(-1163856341);
        if (((i29 >> 9) & 14 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            en5.n0.b(null, data, i17, onDetailClick, null, y0Var, ((i18 << 3) & ce1.h.CTRL_INDEX) | 64 | (i18 & 7168), 17);
        }
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new en5.h(modifier, i17, data, onDetailClick, i18);
        }
    }

    public static final void b(java.lang.String imagePath, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-325852159);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(imagePath) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i19 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            int i27 = aq.o.f12920a ? com.tencent.mm.R.color.f478489a : com.tencent.mm.R.color.f478512u;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            float f17 = 8;
            z0.t j17 = d0.a2.j(d0.a3.g(d0.a3.f(a0.b.c(pVar, rz0.a.b(i27, context), null, 2, null), 0.0f, 1, null), 17 * f17), 0.0f, 3 * f17, 0.0f, 0.0f, 13, null);
            y0Var.U(733328855);
            int i28 = z0.d.f468903a;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(j17);
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
            n0.i5.a(y0Var, c17, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            z0.t a18 = b1.d.a(d0.a3.h(pVar, 10 * f17), i0.h.a(1 * f17));
            z0.d dVar = z0.a.f468890b;
            kotlin.jvm.internal.o.g(a18, "<this>");
            boolean z17 = androidx.compose.ui.platform.f3.f10562a;
            en5.n0.c(a18.k(new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d)), imagePath, null, null, y0Var, (i18 << 3) & 112, 12);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new en5.i(imagePath, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0162, code lost:
    
        if (r4 == n0.n.f333620a) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(yz5.a r29, n0.o r30, int r31) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en5.l.c(yz5.a, n0.o, int):void");
    }
}
