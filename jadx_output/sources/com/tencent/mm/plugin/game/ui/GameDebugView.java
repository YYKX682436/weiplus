package com.tencent.mm.plugin.game.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/GameDebugView;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/tencent/mm/plugin/game/ui/v0", "com/tencent/mm/plugin/game/ui/e1", "com/tencent/mm/plugin/game/ui/l1", "", "kotlin.jvm.PlatformType", "url", "content", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class GameDebugView extends androidx.activity.ComponentActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f140728d = 0;

    public final void N6(android.content.Context context, java.lang.String text, yz5.a onBtnClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(onBtnClick, "onBtnClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1798208702);
        java.lang.Object obj = n0.e1.f333492a;
        com.tencent.mm.plugin.game.ui.s0 s0Var = new com.tencent.mm.plugin.game.ui.s0(onBtnClick, context);
        int i18 = z0.t.f468922q1;
        float f17 = 5;
        l0.h.a(s0Var, d0.a3.g(d0.a3.f(d0.a2.g(z0.p.f468921d, f17, f17), 0.0f, 1, null), 50), false, null, null, null, null, null, null, u0.j.b(y0Var, -506656594, true, new com.tencent.mm.plugin.game.ui.t0(text)), y0Var, 805306416, 508);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.u0(this, context, text, onBtnClick, i17);
        }
    }

    public final void O6(yz5.l onItemClick, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1675878424);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(onItemClick) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            java.util.List i19 = kz5.c0.i(new com.tencent.mm.plugin.game.ui.v0("reddot_switch", "红点配置开关"), new com.tencent.mm.plugin.game.ui.v0("reddot_mock", "红点内容Mock"), new com.tencent.mm.plugin.game.ui.v0("reddot_control", "红点控制中心"));
            int i27 = z0.t.f468922q1;
            z0.t e17 = d0.a3.e(z0.p.f468921d, 0.0f, 1, null);
            int i28 = e1.y.f246321l;
            e0.f.a(a0.b.c(e17, e1.y.f246315f, null, 2, null), null, null, false, null, null, null, false, new com.tencent.mm.plugin.game.ui.b1(i19, onItemClick), y0Var, 0, 254);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.c1(this, onItemClick, i17);
        }
    }

    public final void P6(java.lang.String title, boolean z17, yz5.a onBack, n0.o oVar, int i17) {
        int i18;
        boolean z18;
        z0.p pVar;
        n0.y0 y0Var;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(onBack, "onBack");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-832097380);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(title) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.f(z17) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var2.e(onBack) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i27 = z0.t.f468922q1;
            z0.p pVar2 = z0.p.f468921d;
            z0.t h17 = d0.a2.h(a0.b.c(d0.a3.g(d0.a3.f(pVar2, 0.0f, 1, null), 56), e1.a0.b(1535619839), null, 2, null), 16, 0.0f, 2, null);
            int i28 = z0.d.f468903a;
            z0.c cVar = z0.a.f468899k;
            y0Var2.U(693286680);
            d0.p pVar3 = d0.p.f225183a;
            s1.t0 a17 = d0.n2.a(d0.p.f225184b, cVar, y0Var2, 48);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(h17);
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
            n0.i5.a(y0Var2, a17, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-678309503);
            d0.q2 q2Var = d0.q2.f225198a;
            y0Var2.U(679325774);
            if (z17) {
                z0.t j17 = d0.a2.j(a0.d0.d(pVar2, false, null, null, onBack, 7, null), 0.0f, 0.0f, 8, 0.0f, 11, null);
                long b17 = p2.u.b(24);
                f2.r rVar = f2.r.f258818e;
                f2.r rVar2 = f2.r.f258824n;
                int i29 = e1.y.f246321l;
                z18 = false;
                pVar = pVar2;
                l0.e5.c("< ", j17, e1.y.f246311b, b17, null, rVar2, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 200070, 0, 65488);
            } else {
                z18 = false;
                pVar = pVar2;
            }
            y0Var2.o(z18);
            long b18 = p2.u.b(18);
            f2.r rVar3 = f2.r.f258818e;
            f2.r rVar4 = f2.r.f258824n;
            int i37 = e1.y.f246321l;
            l0.e5.c(title, d0.o2.a(q2Var, pVar, 1.0f, false, 2, null), e1.y.f246311b, b18, null, rVar4, null, 0L, null, new l2.f(z17 ? 5 : 3), 0L, 0, false, 0, null, null, y0Var2, (i19 & 14) | 200064, 0, 64976);
            y0Var = y0Var2;
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.d1(this, title, z17, onBack, i17);
        }
    }

    public final void Q6(com.tencent.mm.plugin.game.ui.e1 navController, yz5.p content, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(navController, "navController");
        kotlin.jvm.internal.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-420185492);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(navController) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(content) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var.e(this) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            z0.p pVar = z0.p.f468921d;
            z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
            y0Var.U(-483455358);
            s1.t0 a17 = d0.j0.a(d0.p.f225186d, z0.a.f468900l, y0Var, 0);
            y0Var.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(e17);
            boolean z17 = y0Var.f333761b instanceof n0.e;
            if (!z17) {
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
            yz5.p pVar2 = u1.f.f423590e;
            n0.i5.a(y0Var, a17, pVar2);
            yz5.p pVar3 = u1.f.f423589d;
            n0.i5.a(y0Var, fVar, pVar3);
            yz5.p pVar4 = u1.f.f423591f;
            n0.i5.a(y0Var, sVar, pVar4);
            yz5.p pVar5 = u1.f.f423592g;
            n0.i5.a(y0Var, k4Var, pVar5);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-1163856341);
            d0.m0 m0Var = d0.m0.f225171a;
            x0.i0 i0Var = navController.f141371a;
            java.lang.String str = ((com.tencent.mm.plugin.game.ui.l1) kz5.n0.i0(i0Var)).f141455a;
            boolean z18 = !kotlin.jvm.internal.o.b((com.tencent.mm.plugin.game.ui.l1) kz5.n0.i0(i0Var), com.tencent.mm.plugin.game.ui.h1.f141403b);
            y0Var.U(-865002006);
            boolean e18 = y0Var.e(navController);
            java.lang.Object y17 = y0Var.y();
            if (e18 || y17 == n0.n.f333620a) {
                y17 = new com.tencent.mm.plugin.game.ui.f1(navController);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            P6(str, z18, (yz5.a) y17, y0Var, (i19 << 3) & 7168);
            z0.t a19 = d0.k0.a(m0Var, pVar, 1.0f, false, 2, null);
            y0Var.U(733328855);
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar2 = (p2.f) y0Var.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            yz5.q a27 = s1.g0.a(a19);
            if (!z17) {
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
            n0.i5.a(y0Var, c17, pVar2);
            n0.i5.a(y0Var, fVar2, pVar3);
            n0.i5.a(y0Var, sVar2, pVar4);
            n0.i5.a(y0Var, k4Var2, pVar5);
            y0Var.n();
            ((u0.i) a27).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            content.invoke(y0Var, java.lang.Integer.valueOf((i19 >> 3) & 14));
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
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.g1(this, navController, content, i17);
        }
    }

    public final void R6(yz5.l onClick, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(676216731);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(onClick) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(this) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            O6(onClick, y0Var, (i18 & 112) | (i18 & 14));
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.m1(this, onClick, i17);
        }
    }

    public final void S6(n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-492373598);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(this) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
            gameDebugView = this;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i19 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
            y0Var2.U(-483455358);
            d0.p pVar2 = d0.p.f225183a;
            d0.l lVar = d0.p.f225186d;
            int i27 = z0.d.f468903a;
            s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var2, 0);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var2.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(e17);
            n0.e eVar = y0Var2.f333761b;
            if (!(eVar instanceof n0.e)) {
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
            yz5.p pVar3 = u1.f.f423590e;
            n0.i5.a(y0Var2, a17, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f423589d;
            n0.i5.a(y0Var2, fVar, pVar4);
            fVar2.getClass();
            yz5.p pVar5 = u1.f.f423591f;
            n0.i5.a(y0Var2, sVar, pVar5);
            fVar2.getClass();
            yz5.p pVar6 = u1.f.f423592g;
            n0.i5.a(y0Var2, k4Var, pVar6);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            android.content.Context context = (android.content.Context) y0Var2.i(androidx.compose.ui.platform.a1.f10503b);
            y0Var2.U(-412300447);
            java.lang.Object y17 = y0Var2.y();
            int i28 = n0.o.f333629a;
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = n0.s4.c(V6(), null, 2, null);
                y0Var2.g0(y17);
            }
            n0.v2 v2Var = (n0.v2) y17;
            y0Var2.o(false);
            z0.t g17 = d0.a3.g(pVar, 100);
            y0Var2.U(733328855);
            int i29 = i18;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
            y0Var2.U(-1323940314);
            p2.f fVar3 = (p2.f) y0Var2.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var2.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
            fVar2.getClass();
            yz5.q a19 = s1.g0.a(g17);
            if (!(eVar instanceof n0.e)) {
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
            n0.i5.a(y0Var2, c17, pVar3);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar3, pVar4);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar2, pVar5);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var2, pVar6);
            y0Var2.n();
            ((u0.i) a19).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            java.lang.String str = (java.lang.String) v2Var.getValue();
            y0Var2.U(-348136195);
            boolean e18 = y0Var2.e(v2Var);
            java.lang.Object y18 = y0Var2.y();
            if (e18 || y18 == obj2) {
                y18 = new com.tencent.mm.plugin.game.ui.n1(v2Var);
                y0Var2.g0(y18);
            }
            yz5.l lVar2 = (yz5.l) y18;
            y0Var2.o(false);
            float f17 = 8;
            l0.c1.a(str, lVar2, a0.b.b(d0.a3.f(d0.a2.g(pVar, f17, f17), 0.0f, 1, null), e1.a0.c(4292934069L), i0.h.a(10)), false, false, null, null, null, null, null, false, null, null, null, false, 0, null, null, null, y0Var2, 48, 0, 524280);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(true);
            y0Var2.o(false);
            y0Var2.o(false);
            int i37 = (i29 << 9) & 7168;
            y0Var = y0Var2;
            N6(context, "触发数据库清理", com.tencent.mm.plugin.game.ui.o1.f141690d, y0Var2, i37 | com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.CTRL_INDEX);
            y0Var.U(-412299716);
            gameDebugView = this;
            boolean e19 = y0Var.e(v2Var) | y0Var.e(gameDebugView);
            java.lang.Object y19 = y0Var.y();
            if (e19 || y19 == obj2) {
                y19 = new com.tencent.mm.plugin.game.ui.p1(gameDebugView, v2Var);
                y0Var.g0(y19);
            }
            y0Var.o(false);
            int i38 = i37 | 56;
            N6(context, "清除红点签名算法缓存", (yz5.a) y19, y0Var, i38);
            y0Var.U(-412299392);
            boolean e27 = y0Var.e(v2Var) | y0Var.e(gameDebugView);
            java.lang.Object y27 = y0Var.y();
            if (e27 || y27 == obj2) {
                y27 = new com.tencent.mm.plugin.game.ui.q1(gameDebugView, v2Var);
                y0Var.g0(y27);
            }
            y0Var.o(false);
            N6(context, "设置红点验证模式None", (yz5.a) y27, y0Var, i38);
            y0Var.U(-412299108);
            boolean e28 = y0Var.e(v2Var) | y0Var.e(gameDebugView);
            java.lang.Object y28 = y0Var.y();
            if (e28 || y28 == obj2) {
                y28 = new com.tencent.mm.plugin.game.ui.r1(gameDebugView, v2Var);
                y0Var.g0(y28);
            }
            y0Var.o(false);
            N6(context, "设置红点验证模式Test", (yz5.a) y28, y0Var, i38);
            y0Var.U(-412298825);
            boolean e29 = y0Var.e(v2Var) | y0Var.e(gameDebugView);
            java.lang.Object y29 = y0Var.y();
            if (e29 || y29 == obj2) {
                y29 = new com.tencent.mm.plugin.game.ui.s1(gameDebugView, v2Var);
                y0Var.g0(y29);
            }
            y0Var.o(false);
            N6(context, "设置红点验证模式Full", (yz5.a) y29, y0Var, i38);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            java.lang.Object obj3 = n0.e1.f333492a;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.t1(gameDebugView, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01f8, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x030b, code lost:
    
        if (r5 == r10) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(n0.o r66, int r67) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.GameDebugView.T6(n0.o, int):void");
    }

    public final void U6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-427031971);
        if ((i17 & 1) == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            y0Var.U(-910470019);
            java.lang.Object y17 = y0Var.y();
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                com.tencent.mm.plugin.game.ui.i2[] i2VarArr = {new com.tencent.mm.plugin.game.ui.i2("GameDebugID.DeleteDuplicatedID", "删除重复的消息ID", "可反复发送同一个红点", com.tencent.mm.plugin.game.model.w.b("GameDebugID.DeleteDuplicatedID")), new com.tencent.mm.plugin.game.ui.i2("GameDebugID.UnrestrictedExposure", "红点曝光时间不受限制", "不受时间间隔限制", com.tencent.mm.plugin.game.model.w.b("GameDebugID.UnrestrictedExposure")), new com.tencent.mm.plugin.game.ui.i2("GameDebugID.NoTimeExpired", "红点不会过期", null, com.tencent.mm.plugin.game.model.w.b("GameDebugID.NoTimeExpired")), new com.tencent.mm.plugin.game.ui.i2("GameDebugID.NoExposureDayLimit", "红点曝光每天次数不受限制", null, com.tencent.mm.plugin.game.model.w.b("GameDebugID.NoExposureDayLimit")), new com.tencent.mm.plugin.game.ui.i2("GameDebugID.EnableReddotMock", "启用红点Mock", null, com.tencent.mm.plugin.game.model.w.b("GameDebugID.EnableReddotMock")), new com.tencent.mm.plugin.game.ui.i2("GameDebugID.ForceSinatureRequestFail", "强制红点签名请求失败", null, com.tencent.mm.plugin.game.model.w.b("GameDebugID.ForceSinatureRequestFail")), new com.tencent.mm.plugin.game.ui.i2("GameDebugID.ForceSignatureVerifyFail", "强制红点签名校验失败", null, com.tencent.mm.plugin.game.model.w.b("GameDebugID.ForceSignatureVerifyFail"))};
                x0.i0 i0Var = new x0.i0();
                i0Var.addAll(kz5.z.z0(i2VarArr));
                y0Var.g0(i0Var);
                y17 = i0Var;
            }
            x0.i0 i0Var2 = (x0.i0) y17;
            y0Var.o(false);
            z0.t c17 = a0.b.c(d0.a3.e(z0.p.f468921d, 0.0f, 1, null), e1.y.f246315f, null, 2, null);
            y0Var.U(-910467971);
            boolean e17 = y0Var.e(i0Var2);
            java.lang.Object y18 = y0Var.y();
            if (e17 || y18 == obj2) {
                y18 = new com.tencent.mm.plugin.game.ui.g2(i0Var2);
                y0Var.g0(y18);
            }
            y0Var.o(false);
            e0.f.a(c17, null, null, false, null, null, null, false, (yz5.l) y18, y0Var, 100663296, 254);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.plugin.game.ui.h2(this, i17);
        }
    }

    public final java.lang.String V6() {
        m53.c4 n17 = com.tencent.mm.plugin.game.commlib.i.n();
        int i17 = n17 != null ? n17.f323603d : 0;
        int n18 = com.tencent.mm.sdk.platformtools.o4.M("game_redot").n("gamecenter.reddot.signatureConfigCount");
        return (i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "红点验证模式: 完全校验" : "红点验证模式: 仅上报" : "红点验证模式: 关闭").concat("\n") + "算法配置记录数: " + n18;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.egv);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.cg7);
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(this, null, 0, 6, null);
        composeView.setContent(u0.j.c(-1318579466, true, new com.tencent.mm.plugin.game.ui.l2(this)));
        viewGroup.addView(composeView);
    }
}
