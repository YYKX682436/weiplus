package yx;

/* loaded from: classes14.dex */
public abstract class q0 {
    public static final void a(n0.o oVar, int i17) {
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(846835738);
        if (i17 == 0 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            android.content.Context context = (android.content.Context) y0Var2.i(androidx.compose.ui.platform.a1.f10503b);
            n0.v2 v2Var = (n0.v2) w0.g.a(new java.lang.Object[0], null, null, yx.r.f467073d, y0Var2, 3080, 6);
            y0Var2.U(773894976);
            y0Var2.U(-492369756);
            java.lang.Object y17 = y0Var2.y();
            int i18 = n0.o.f333629a;
            if (y17 == n0.n.f333620a) {
                n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var2));
                y0Var2.g0(o1Var);
                y17 = o1Var;
            }
            y0Var2.o(false);
            kotlinx.coroutines.y0 y0Var3 = ((n0.o1) y17).f333631d;
            y0Var2.o(false);
            jz5.f0 f0Var = jz5.f0.f302826a;
            n0.d2.f(f0Var, new yx.n(y0Var3, context, v2Var, null), y0Var2, 70);
            int i19 = z0.t.f468922q1;
            l0.e5.c((java.lang.String) v2Var.getValue(), d0.a3.j(z0.p.f468921d, 100), x1.b.a(com.tencent.mm.R.color.adg, y0Var2, 0), p2.u.b(17), null, null, null, 0L, null, new l2.f(5), 0L, 0, false, 0, null, null, y0Var2, com.tencent.mm.boot.BuildConfig.VERSION_CODE, 0, 65008);
            y0Var = y0Var2;
            n0.d2.c(f0Var, new yx.p(y0Var3), y0Var, 6);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new yx.q(i17);
        }
    }

    public static final void b(z0.t modifier, yz5.l lVar, n0.o oVar, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1258292783);
        if ((i18 & 1) != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        int i27 = i18 & 2;
        if (i27 != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.e(lVar) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                lVar = yx.s.f467075d;
            }
            java.lang.Object obj = n0.e1.f333492a;
            ky.r0.a(modifier, (((android.content.res.Configuration) y0Var.i(androidx.compose.ui.platform.a1.f10502a)).uiMode & 48) == 32 ? com.tencent.mm.R.drawable.bu7 : com.tencent.mm.R.drawable.bub, null, 0.0f, false, lVar, y0Var, (i19 & 14) | ((i19 << 12) & 458752), 28);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new yx.t(modifier, lVar, i17, i18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a3, code lost:
    
        if (r10 == r9) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(z0.t r44, float r45, yz5.a r46, yz5.a r47, boolean r48, n0.o r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.q0.c(z0.t, float, yz5.a, yz5.a, boolean, n0.o, int, int):void");
    }

    public static final void d(jy.m screenInfo, xx.y yVar, ay.v vVar, n0.o oVar, int i17, int i18) {
        ay.v vVar2;
        kotlin.jvm.internal.o.g(screenInfo, "screenInfo");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1525806371);
        xx.y yVar2 = (i18 & 2) != 0 ? null : yVar;
        if ((i18 & 4) != 0) {
            yx.z zVar = new yx.z(screenInfo, yVar2);
            y0Var.U(564614654);
            androidx.lifecycle.m1 a17 = z3.b.f469858a.a(y0Var, 0);
            if (a17 == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.c1 a18 = z3.c.a(ay.v.class, a17, null, zVar, y0Var, 4168, 0);
            y0Var.o(false);
            vVar2 = (ay.v) a18;
        } else {
            vVar2 = vVar;
        }
        java.lang.Object obj = n0.e1.f333492a;
        android.content.Context context = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
        int i19 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        z0.t d17 = a0.i3.d(a0.b.c(d0.a3.e(pVar, 0.0f, 1, null), x1.b.a(com.tencent.mm.R.color.f478491c, y0Var, 0), null, 2, null), a0.i3.c(0, y0Var, 0, 1), false, null, false, 14, null);
        y0Var.U(733328855);
        int i27 = z0.d.f468903a;
        z0.d dVar = z0.a.f468889a;
        s1.t0 c17 = d0.y.c(dVar, false, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.f fVar2 = u1.g.f423594i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a19 = s1.g0.a(d17);
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
        ((u0.i) a19).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-2137368960);
        d0.a0 a0Var = d0.a0.f225063a;
        z0.t a27 = d0.v1.a(a0Var.a(pVar, dVar), 12, 57);
        y0Var.U(770602356);
        java.lang.Object y17 = y0Var.y();
        int i28 = n0.o.f333629a;
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            y17 = new yx.b0(yVar2, context);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        b(a27, (yz5.l) y17, y0Var, 48, 0);
        z0.t b17 = d0.v1.b(a0Var.a(pVar, z0.a.f468890b), 0.0f, 171, 1, null);
        java.lang.String str = ((ay.e) vVar2.N6()).f15139a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = ((ay.e) vVar2.N6()).f15140b;
        java.lang.String str3 = str2 != null ? str2 : "";
        boolean z17 = ((ay.e) vVar2.N6()).f15141c;
        boolean z18 = ((ay.e) vVar2.N6()).f15143e;
        boolean z19 = ((ay.e) vVar2.N6()).f15145g;
        boolean z27 = ((ay.e) vVar2.N6()).f15142d;
        y0Var.U(770603238);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj2) {
            y18 = new yx.c0(vVar2);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        xx.y yVar3 = yVar2;
        ay.v vVar3 = vVar2;
        f(b17, str, str3, z17, z18, z19, z27, (yz5.a) y18, y0Var, 12582912, 0);
        z0.t b18 = d0.v1.b(a0Var.a(d0.a3.h(pVar, 200), z0.a.f468896h), 0.0f, -30, 1, null);
        float f17 = ((ay.e) vVar3.N6()).f15144f;
        y0Var.U(770603667);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj2) {
            y19 = new yx.d0(context, vVar3);
            y0Var.g0(y19);
        }
        yz5.a aVar2 = (yz5.a) y19;
        y0Var.o(false);
        y0Var.U(770603898);
        java.lang.Object y27 = y0Var.y();
        if (y27 == obj2) {
            y27 = new yx.e0(vVar3);
            y0Var.g0(y27);
        }
        y0Var.o(false);
        c(b18, f17, aVar2, (yz5.a) y27, ((ay.e) vVar3.N6()).f15142d, y0Var, 3456, 0);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new yx.f0(screenInfo, yVar3, vVar3, i17, i18);
        }
    }

    public static final void e(z0.t modifier, boolean z17, yz5.a disMissCallBack, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(disMissCallBack, "disMissCallBack");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-403952938);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.f(z17) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var2.e(disMissCallBack) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            n0.v2 v2Var = (n0.v2) w0.g.a(new java.lang.Object[0], null, null, yx.l0.f467047d, y0Var2, 3080, 6);
            n0.v2 v2Var2 = (n0.v2) w0.g.a(new java.lang.Object[0], null, null, yx.k0.f467044d, y0Var2, 3080, 6);
            y0Var2.U(773894976);
            y0Var2.U(-492369756);
            java.lang.Object y17 = y0Var2.y();
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var2));
                y0Var2.g0(o1Var);
                y17 = o1Var;
            }
            y0Var2.o(false);
            kotlinx.coroutines.y0 y0Var3 = ((n0.o1) y17).f333631d;
            y0Var2.o(false);
            y0Var2.U(-2119985903);
            java.lang.Object y18 = y0Var2.y();
            if (y18 == obj2) {
                y18 = kotlinx.coroutines.l.d(y0Var3, null, kotlinx.coroutines.a1.LAZY, new yx.j0(v2Var2, null), 1, null);
                y0Var2.g0(y18);
            }
            y0Var2.o(false);
            n0.d2.f(java.lang.Boolean.valueOf(z17), new yx.h0(z17, (kotlinx.coroutines.r2) y18, y0Var3, disMissCallBack, v2Var, null), y0Var2, ((i19 >> 3) & 14) | 64);
            z0.t k17 = d0.a3.k(d0.a3.f(modifier, 0.0f, 1, null), null, false, 3, null);
            z0.d dVar = z0.a.f468893e;
            y0Var2.U(733328855);
            s1.t0 c17 = d0.y.c(dVar, false, y0Var2, 6);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(k17);
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
            n0.i5.a(y0Var2, c17, u1.f.f423590e);
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            y0Var = y0Var2;
            y.q.c(z17 && ((java.lang.Boolean) v2Var.getValue()).booleanValue(), null, y.x0.b(null, 0.0f, 3, null), y.x0.c(null, 0.0f, 3, null), null, yx.t0.f467081a, y0Var, 200064, 18);
            y.q.c((z17 || ((java.lang.Boolean) v2Var2.getValue()).booleanValue()) ? false : true, null, y.x0.b(null, 0.0f, 3, null), y.x0.c(null, 0.0f, 3, null), null, yx.t0.f467082b, y0Var, 200064, 18);
            y0Var.U(-2119984750);
            if (((java.lang.Boolean) v2Var2.getValue()).booleanValue()) {
                l0.e5.c(x1.g.a(com.tencent.mm.R.string.ngt, y0Var, 0), null, x1.b.a(com.tencent.mm.R.color.adg, y0Var, 0), p2.u.b(17), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var, 3072, 0, com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_COMMON);
            }
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new yx.i0(modifier, z17, disMissCallBack, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(z0.t r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, boolean r48, yz5.a r49, n0.o r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.q0.f(z0.t, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, yz5.a, n0.o, int, int):void");
    }
}
