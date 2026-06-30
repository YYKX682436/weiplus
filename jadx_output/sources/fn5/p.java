package fn5;

/* loaded from: classes14.dex */
public abstract class p {
    public static final void a(fn5.n0 viewModel, yz5.l onPeopleDetailClick, yz5.l onDetailClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        kotlin.jvm.internal.o.g(onPeopleDetailClick, "onPeopleDetailClick");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1573990129);
        java.lang.Object obj = n0.e1.f333492a;
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l0.a2.a(a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.f478491c, context), null, 2, null), null, 0L, 0L, null, 0.0f, u0.j.b(y0Var, 315683923, true, new fn5.e(onPeopleDetailClick, viewModel, onDetailClick)), y0Var, 1572864, 62);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.f(viewModel, onPeopleDetailClick, onDetailClick, i17);
        }
    }

    public static final void b(fn5.n0 viewModel, yz5.a onBackClick, yz5.l onPeopleDetailClick, yz5.l onDetailClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        kotlin.jvm.internal.o.g(onBackClick, "onBackClick");
        kotlin.jvm.internal.o.g(onPeopleDetailClick, "onPeopleDetailClick");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1271529961);
        java.lang.Object obj = n0.e1.f333492a;
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l0.a2.a(a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.f478512u, context), null, 2, null), null, 0L, 0L, null, 0.0f, u0.j.b(y0Var, 519859749, true, new fn5.g(viewModel, onBackClick, onPeopleDetailClick, onDetailClick)), y0Var, 1572864, 62);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.h(viewModel, onBackClick, onPeopleDetailClick, onDetailClick, i17);
        }
    }

    public static final void c(z0.t modifier, java.lang.String loadingText, n0.o oVar, int i17) {
        int i18;
        java.lang.String str;
        boolean z17;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(loadingText, "loadingText");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(917792994);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(loadingText) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
            str = loadingText;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i19 = i18 & 14;
            y0Var.U(-483455358);
            d0.p pVar = d0.p.f225183a;
            d0.l lVar = d0.p.f225186d;
            int i27 = z0.d.f468903a;
            int i28 = i19 >> 3;
            s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var, (i28 & 112) | (i28 & 14));
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
            yz5.q a18 = s1.g0.a(modifier);
            int i29 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
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
            yz5.p pVar2 = u1.f.f423590e;
            n0.i5.a(y0Var, a17, pVar2);
            fVar2.getClass();
            yz5.p pVar3 = u1.f.f423589d;
            n0.i5.a(y0Var, fVar, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f423591f;
            n0.i5.a(y0Var, sVar, pVar4);
            fVar2.getClass();
            yz5.p pVar5 = u1.f.f423592g;
            n0.i5.a(y0Var, k4Var, pVar5);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i29 >> 3) & 112));
            y0Var.U(2058660585);
            y0Var.U(-1163856341);
            if (((i29 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                y0Var.O();
                str = loadingText;
                z17 = false;
            } else {
                int i37 = z0.t.f468922q1;
                z0.p pVar6 = z0.p.f468921d;
                z0.t f17 = d0.a3.f(pVar6, 0.0f, 1, null);
                y0Var.U(733328855);
                s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
                y0Var.U(-1323940314);
                p2.f fVar3 = (p2.f) y0Var.i(h3Var);
                p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
                androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
                fVar2.getClass();
                yz5.q a19 = s1.g0.a(f17);
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
                n0.i5.a(y0Var, c17, pVar2);
                fVar2.getClass();
                n0.i5.a(y0Var, fVar3, pVar3);
                fVar2.getClass();
                n0.i5.a(y0Var, sVar2, pVar4);
                fVar2.getClass();
                n0.i5.a(y0Var, k4Var2, pVar5);
                y0Var.n();
                ((u0.i) a19).invoke(new n0.i4(y0Var), y0Var, 0);
                y0Var.U(2058660585);
                y0Var.U(-2137368960);
                z0.d dVar = z0.a.f468890b;
                boolean z18 = androidx.compose.ui.platform.f3.f10562a;
                d0.q qVar = new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d);
                pVar6.k(qVar);
                str = loadingText;
                en5.n0.d(d0.a2.j(qVar, 0.0f, 25 * 8, 0.0f, 0.0f, 13, null), str, y0Var, i18 & 112);
                z17 = false;
                y0Var.o(false);
                y0Var.o(false);
                y0Var.o(true);
                y0Var.o(false);
                y0Var.o(false);
            }
            y0Var.o(z17);
            y0Var.o(z17);
            y0Var.o(true);
            y0Var.o(z17);
            y0Var.o(z17);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.i(modifier, str, i17);
        }
    }

    public static final void d(z0.t modifier, yz5.l onPeopleDetailClick, fn5.n0 viewModel, yz5.l onDetailClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(onPeopleDetailClick, "onPeopleDetailClick");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1013693);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 T6 = viewModel.T6(y0Var, 8);
        n0.e5 R6 = viewModel.R6(y0Var, 8);
        n0.e5 W6 = viewModel.W6(y0Var, 8);
        n0.e5 S6 = viewModel.S6(y0Var, 8);
        y0Var.U(190570221);
        if (!kotlin.jvm.internal.o.b(((fn5.o0) T6.getValue()).name(), "NO_START")) {
            kotlin.jvm.internal.o.f(R6.getValue(), "<get-value>(...)");
            if ((!((java.util.Collection) r5).isEmpty()) || (!viewModel.f264731q.isEmpty())) {
                en5.p1.b(viewModel, y0Var, 8);
            }
        }
        y0Var.o(false);
        y0Var.U(190570421);
        if (kotlin.jvm.internal.o.b(((fn5.o0) T6.getValue()).name(), "START") && ((java.util.ArrayList) R6.getValue()).isEmpty()) {
            java.lang.Object value = S6.getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            c(modifier, (java.lang.String) value, y0Var, i17 & 14);
        }
        y0Var.o(false);
        y0Var.U(190570592);
        if (kotlin.jvm.internal.o.b(((fn5.p0) W6.getValue()).name(), "NORMAL")) {
            g(modifier, viewModel, onDetailClick, y0Var, (i17 & 14) | 64 | ((i17 >> 3) & ce1.h.CTRL_INDEX));
        }
        y0Var.o(false);
        y0Var.U(190570727);
        if (kotlin.jvm.internal.o.b(((fn5.p0) W6.getValue()).name(), "PERSON")) {
            h(modifier, onPeopleDetailClick, onDetailClick, viewModel, y0Var, (i17 & 14) | 4096 | (i17 & 112) | ((i17 >> 3) & ce1.h.CTRL_INDEX));
        }
        y0Var.o(false);
        f(modifier, viewModel, 27 * 8, y0Var, (i17 & 14) | com.tencent.wcdb.FileUtils.S_IRWXU);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.j(modifier, onPeopleDetailClick, viewModel, onDetailClick, i17);
        }
    }

    public static final void e(z0.t modifier, yz5.l onPeopleDetailClick, fn5.n0 viewModel, yz5.l onDetailClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(onPeopleDetailClick, "onPeopleDetailClick");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(408473838);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 T6 = viewModel.T6(y0Var, 8);
        viewModel.V6(y0Var, 8);
        n0.e5 R6 = viewModel.R6(y0Var, 8);
        n0.e5 W6 = viewModel.W6(y0Var, 8);
        n0.e5 S6 = viewModel.S6(y0Var, 8);
        y0Var.U(-1495458354);
        if (!kotlin.jvm.internal.o.b(((fn5.o0) T6.getValue()).name(), "NO_START")) {
            en5.p1.b(viewModel, y0Var, 8);
        }
        y0Var.o(false);
        y0Var.U(-1495458238);
        if (kotlin.jvm.internal.o.b(((fn5.o0) T6.getValue()).name(), "START") && ((java.util.ArrayList) R6.getValue()).isEmpty()) {
            java.lang.Object value = S6.getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            c(modifier, (java.lang.String) value, y0Var, i17 & 14);
        }
        y0Var.o(false);
        y0Var.U(-1495458067);
        if (kotlin.jvm.internal.o.b(((fn5.p0) W6.getValue()).name(), "NORMAL")) {
            g(modifier, viewModel, onDetailClick, y0Var, (i17 & 14) | 64 | ((i17 >> 3) & ce1.h.CTRL_INDEX));
        }
        y0Var.o(false);
        y0Var.U(-1495457932);
        if (kotlin.jvm.internal.o.b(((fn5.p0) W6.getValue()).name(), "PERSON")) {
            h(modifier, onPeopleDetailClick, onDetailClick, viewModel, y0Var, (i17 & 14) | 4096 | (i17 & 112) | ((i17 >> 3) & ce1.h.CTRL_INDEX));
        }
        y0Var.o(false);
        f(modifier, viewModel, 25 * 8, y0Var, (i17 & 14) | com.tencent.wcdb.FileUtils.S_IRWXU);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.k(modifier, onPeopleDetailClick, viewModel, onDetailClick, i17);
        }
    }

    public static final void f(z0.t modifier, fn5.n0 viewModel, float f17, n0.o oVar, int i17) {
        jz5.l lVar;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1388826100);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 T6 = viewModel.T6(y0Var, 8);
        n0.e5 V6 = viewModel.V6(y0Var, 8);
        n0.e5 R6 = viewModel.R6(y0Var, 8);
        if (kotlin.jvm.internal.o.b(((fn5.o0) T6.getValue()).name(), "STOP") && ((java.util.ArrayList) R6.getValue()).isEmpty()) {
            java.lang.Object value = V6.getValue();
            kotlin.jvm.internal.o.d(value);
            int ordinal = ((en5.d) value).ordinal();
            if (ordinal == 0) {
                lVar = new jz5.l(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzh), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzi));
            } else if (ordinal == 1) {
                lVar = new jz5.l(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzl), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzm));
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                lVar = new jz5.l(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzj), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzk));
            }
            java.lang.String str = (java.lang.String) lVar.f302833d;
            java.lang.String str2 = (java.lang.String) lVar.f302834e;
            int i18 = i17 & 14;
            y0Var.U(733328855);
            int i19 = z0.d.f468903a;
            int i27 = i18 >> 3;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, (i27 & 112) | (i27 & 14));
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(modifier);
            int i28 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
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
            ((u0.i) a17).invoke(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i28 >> 3) & 112));
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            if (((i28 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                y0Var.O();
            } else {
                kotlin.jvm.internal.o.d(str);
                java.lang.Object value2 = viewModel.U6(y0Var, 8).getValue();
                kotlin.jvm.internal.o.f(value2, "<get-value>(...)");
                java.lang.String str3 = (java.lang.String) value2;
                kotlin.jvm.internal.o.d(str2);
                int i29 = z0.t.f468922q1;
                z0.t j17 = d0.a2.j(z0.p.f468921d, 0.0f, f17, 0.0f, 0.0f, 13, null);
                z0.d dVar = z0.a.f468890b;
                kotlin.jvm.internal.o.g(j17, "<this>");
                boolean z17 = androidx.compose.ui.platform.f3.f10562a;
                en5.n0.g(str, str3, str2, j17.k(new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d)), y0Var, 0);
            }
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.l(modifier, viewModel, f17, i17);
        }
    }

    public static final void g(z0.t modifier, fn5.n0 viewModel, yz5.l onDetailClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1588648199);
        java.lang.Object obj = n0.e1.f333492a;
        if (!kotlin.jvm.internal.o.b(((fn5.o0) viewModel.T6(y0Var, 8).getValue()).name(), "NO_START")) {
            kotlin.jvm.internal.o.f(viewModel.R6(y0Var, 8).getValue(), "<get-value>(...)");
            if (!((java.util.Collection) r1).isEmpty()) {
                int i18 = i17 & 14;
                y0Var.U(-483455358);
                d0.p pVar = d0.p.f225183a;
                d0.l lVar = d0.p.f225186d;
                int i19 = z0.d.f468903a;
                int i27 = i18 >> 3;
                s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var, (i27 & 112) | (i27 & 14));
                y0Var.U(-1323940314);
                p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
                p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
                androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
                u1.f fVar2 = u1.g.f423594i1;
                fVar2.getClass();
                yz5.a aVar = u1.f.f423587b;
                yz5.q a18 = s1.g0.a(modifier);
                int i28 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
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
                ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i28 >> 3) & 112));
                y0Var.U(2058660585);
                y0Var.U(-1163856341);
                if (((i28 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                    y0Var.O();
                } else {
                    en5.n0.b(viewModel, null, 0, onDetailClick, null, y0Var, ((i17 << 3) & 7168) | 8, 22);
                }
                y0Var.o(false);
                y0Var.o(false);
                y0Var.o(true);
                y0Var.o(false);
                y0Var.o(false);
            }
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.m(modifier, viewModel, onDetailClick, i17);
        }
    }

    public static final void h(z0.t modifier, yz5.l onPeopleDetailClick, yz5.l onDetailClick, fn5.n0 viewModel, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(onPeopleDetailClick, "onPeopleDetailClick");
        kotlin.jvm.internal.o.g(onDetailClick, "onDetailClick");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1306111506);
        java.lang.Object obj = n0.e1.f333492a;
        if (!kotlin.jvm.internal.o.b(((fn5.o0) viewModel.T6(y0Var, 8).getValue()).name(), "NO_START")) {
            kotlin.jvm.internal.o.f(viewModel.R6(y0Var, 8).getValue(), "<get-value>(...)");
            if (!((java.util.Collection) r1).isEmpty()) {
                int i18 = i17 & 14;
                y0Var.U(-483455358);
                d0.p pVar = d0.p.f225183a;
                d0.l lVar = d0.p.f225186d;
                int i19 = z0.d.f468903a;
                int i27 = i18 >> 3;
                s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var, (i27 & 112) | (i27 & 14));
                y0Var.U(-1323940314);
                p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
                p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
                androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
                u1.f fVar2 = u1.g.f423594i1;
                fVar2.getClass();
                yz5.a aVar = u1.f.f423587b;
                yz5.q a18 = s1.g0.a(modifier);
                int i28 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
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
                ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i28 >> 3) & 112));
                y0Var.U(2058660585);
                y0Var.U(-1163856341);
                if (((i28 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                    y0Var.O();
                } else {
                    en5.n0.b(viewModel, null, 0, onDetailClick, onPeopleDetailClick, y0Var, 8 | ((i17 << 3) & 7168) | ((i17 << 9) & 57344), 6);
                }
                y0Var.o(false);
                y0Var.o(false);
                y0Var.o(true);
                y0Var.o(false);
                y0Var.o(false);
            }
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.n(modifier, onPeopleDetailClick, onDetailClick, viewModel, i17);
        }
    }

    public static final void i(fn5.n0 viewModel, n0.o oVar, int i17) {
        jz5.l lVar;
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(888542173);
        java.lang.Object obj = n0.e1.f333492a;
        n0.e5 V6 = viewModel.V6(y0Var, 8);
        y0Var.U(-758744979);
        n0.e5 a17 = v0.c.a(viewModel.f264727m, 0, y0Var, 56);
        y0Var.o(false);
        n0.e5 U6 = viewModel.U6(y0Var, 8);
        java.lang.Object value = V6.getValue();
        kotlin.jvm.internal.o.d(value);
        int ordinal = ((en5.d) value).ordinal();
        if (ordinal == 0) {
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzc);
            kotlin.jvm.internal.o.f(g17, "<get-str>(...)");
            java.lang.String format = java.lang.String.format(g17, java.util.Arrays.copyOf(new java.lang.Object[]{a17.getValue()}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            lVar = new jz5.l(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzb), format);
        } else if (ordinal == 1) {
            java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzg);
            kotlin.jvm.internal.o.f(g18, "<get-str>(...)");
            java.lang.String format2 = java.lang.String.format(g18, java.util.Arrays.copyOf(new java.lang.Object[]{a17.getValue()}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            lVar = new jz5.l(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzf), format2);
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            java.lang.String g19 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fze);
            kotlin.jvm.internal.o.f(g19, "<get-str>(...)");
            java.lang.String format3 = java.lang.String.format(g19, java.util.Arrays.copyOf(new java.lang.Object[]{a17.getValue()}, 1));
            kotlin.jvm.internal.o.f(format3, "format(...)");
            lVar = new jz5.l(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzd), format3);
        }
        java.lang.String str = (java.lang.String) lVar.f302833d;
        java.lang.String str2 = (java.lang.String) lVar.f302834e;
        kotlin.jvm.internal.o.d(str);
        java.lang.Object value2 = U6.getValue();
        kotlin.jvm.internal.o.f(value2, "<get-value>(...)");
        int i18 = z0.t.f468922q1;
        float f17 = 8;
        float f18 = 2 * f17;
        en5.n0.g(str, (java.lang.String) value2, str2, d0.a2.j(z0.p.f468921d, ((float) 1.5d) * f17, f18, 0.0f, f18, 4, null), y0Var, 0);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new fn5.o(viewModel, i17);
        }
    }
}
