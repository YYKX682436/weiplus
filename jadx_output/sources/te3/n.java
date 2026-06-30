package te3;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI f418591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI) {
        super(2);
        this.f418591d = magicSnsTimelineDemoUI;
    }

    public static final int a(n0.v2 v2Var) {
        return ((java.lang.Number) v2Var.getValue()).intValue();
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI;
        androidx.compose.ui.platform.e3 e3Var;
        z0.d dVar;
        z0.p pVar;
        boolean z17;
        com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI2;
        n0.o oVar = (n0.o) obj;
        int intValue = ((java.lang.Number) obj2).intValue() & 11;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (intValue == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return f0Var;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(378251007);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f333629a;
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var2.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var2.o(false);
        y0Var2.U(378251074);
        java.lang.Object y18 = y0Var2.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(1, null, 2, null);
            y0Var2.g0(y18);
        }
        n0.v2 v2Var2 = (n0.v2) y18;
        y0Var2.o(false);
        int i18 = z0.t.f468922q1;
        z0.p pVar2 = z0.p.f468921d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t e17 = d0.a3.e(a0.b.c(pVar2, rz0.a.b(com.tencent.mm.R.color.f478489a, context), null, 2, null), 0.0f, 1, null);
        int i19 = z0.d.f468903a;
        z0.d dVar2 = z0.a.f468893e;
        z0.t l17 = d0.a3.l(e17, dVar2, false, 2, null);
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(l17);
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
        boolean booleanValue = ((java.lang.Boolean) v2Var.getValue()).booleanValue();
        com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI3 = this.f418591d;
        y.q.c(booleanValue, null, null, null, null, u0.j.b(y0Var2, 111206970, true, new te3.j(magicSnsTimelineDemoUI3, v2Var2)), y0Var2, 196608, 30);
        y0Var2.U(-692300994);
        int a18 = a(v2Var2);
        androidx.compose.ui.platform.e3 e3Var2 = androidx.compose.ui.platform.e3.f10553d;
        if (a18 == 1) {
            r2.f0.a(new te3.k(magicSnsTimelineDemoUI3), d0.a3.e(pVar2, 0.0f, 1, null), null, y0Var2, 48, 4);
            boolean z18 = androidx.compose.ui.platform.f3.f10562a;
            d0.q qVar = new d0.q(dVar2, false, e3Var2);
            pVar2.k(qVar);
            dVar = dVar2;
            pVar = pVar2;
            magicSnsTimelineDemoUI = magicSnsTimelineDemoUI3;
            z17 = false;
            e3Var = e3Var2;
            l0.e5.c("Scene 1", qVar, e1.y.f246316g, p2.u.b(40), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 3462, 0, 65520);
        } else {
            magicSnsTimelineDemoUI = magicSnsTimelineDemoUI3;
            e3Var = e3Var2;
            dVar = dVar2;
            pVar = pVar2;
            z17 = false;
        }
        y0Var2.o(z17);
        y0Var2.U(378253396);
        if (a(v2Var2) == 2) {
            com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI4 = magicSnsTimelineDemoUI;
            z0.p pVar3 = pVar;
            r2.f0.a(new te3.l(magicSnsTimelineDemoUI4), d0.a3.e(pVar3, 0.0f, 1, null), null, y0Var2, 48, 4);
            boolean z19 = androidx.compose.ui.platform.f3.f10562a;
            d0.q qVar2 = new d0.q(dVar, z17, e3Var);
            pVar3.k(qVar2);
            magicSnsTimelineDemoUI2 = magicSnsTimelineDemoUI4;
            l0.e5.c("Scene 2", qVar2, e1.y.f246316g, p2.u.b(40), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 3462, 0, 65520);
        } else {
            magicSnsTimelineDemoUI2 = magicSnsTimelineDemoUI;
        }
        y0Var2.o(z17);
        y0Var2.o(z17);
        y0Var2.o(z17);
        y0Var2.o(true);
        y0Var2.o(z17);
        y0Var2.o(z17);
        n0.d2.f(f0Var, new te3.m(magicSnsTimelineDemoUI2, v2Var, null), y0Var2, 70);
        return f0Var;
    }
}
