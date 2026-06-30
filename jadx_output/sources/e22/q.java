package e22;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f246699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f246700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f246701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z18, yz5.a aVar) {
        super(3);
        this.f246699d = z17;
        this.f246700e = finderObject;
        this.f246701f = z18;
        this.f246702g = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        boolean z18;
        boolean z19;
        z0.p pVar;
        androidx.compose.ui.platform.e3 e3Var;
        n0.o oVar;
        n0.y0 y0Var;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        d0.f0 BoxWithConstraints = (d0.f0) obj;
        n0.o oVar2 = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar2).e(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var2 = (n0.y0) oVar2;
            if (y0Var2.v()) {
                y0Var2.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        int h17 = (int) ((p2.c.h(((d0.g0) BoxWithConstraints).f225120b) * 4.0d) / 3.0d);
        int i17 = z0.t.f468922q1;
        z0.p pVar2 = z0.p.f468921d;
        z0.t f17 = d0.a3.f(pVar2, 0.0f, 1, null);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        n0.y0 y0Var3 = (n0.y0) oVar2;
        z0.t a17 = b1.a.a(d0.a3.g(f17, h17 / ((p2.f) y0Var3.i(h3Var)).getDensity()), this.f246699d ? 0.2f : 1.0f);
        boolean z27 = this.f246701f;
        boolean z28 = this.f246699d;
        y0Var3.U(733328855);
        int i18 = z0.d.f468903a;
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, oVar2, 0);
        y0Var3.U(-1323940314);
        p2.f fVar = (p2.f) y0Var3.i(h3Var);
        p2.s sVar = (p2.s) y0Var3.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var3.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(a17);
        if (!(y0Var3.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var3.X();
        if (y0Var3.L) {
            y0Var3.j(aVar);
        } else {
            y0Var3.i0();
        }
        y0Var3.f333784y = false;
        n0.i5.a(oVar2, c17, u1.f.f423590e);
        n0.i5.a(oVar2, fVar, u1.f.f423589d);
        n0.i5.a(oVar2, sVar, u1.f.f423591f);
        n0.i5.a(oVar2, k4Var, u1.f.f423592g);
        y0Var3.n();
        ((u0.i) a18).invoke(new n0.i4(oVar2), oVar2, 0);
        y0Var3.U(2058660585);
        y0Var3.U(-2137368960);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f246700e.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        y0Var3.U(1175260593);
        androidx.compose.ui.platform.e3 e3Var2 = androidx.compose.ui.platform.e3.f10553d;
        if (finderMedia != null) {
            java.lang.String str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
            java.util.LinkedList<r45.vf2> spec = finderMedia.getSpec();
            kotlin.jvm.internal.o.f(spec, "getSpec(...)");
            r45.vf2 vf2Var = (r45.vf2) kz5.n0.Z(spec);
            y0Var3.U(604400049);
            int i19 = u5.e.f424702a;
            u5.d dVar = u5.d.f424701b;
            r5.j a19 = u5.c.a(u5.y.f424754a, oVar2, 6);
            y0Var3.U(604401818);
            c6.h hVar = new c6.h((android.content.Context) y0Var3.i(androidx.compose.ui.platform.a1.f10503b));
            hVar.f38805c = str;
            z18 = z28;
            z19 = z27;
            u5.s a27 = u5.x.a(hVar.a(), a19, dVar, oVar2, nd1.k2.CTRL_INDEX, 0);
            y0Var3.o(false);
            y0Var3.o(false);
            int i27 = s1.p.f402054a;
            y0Var = y0Var3;
            a0.q1.a(a27, null, d0.a3.e(pVar2, 0.0f, 1, null), null, s1.o.f402044a, 0.0f, null, oVar2, 25008, 104);
            if (vf2Var != null) {
                java.lang.String a28 = y46.b.a(vf2Var.getInteger(8), vf2Var.getInteger(8) >= 3600000 ? "H:mm:ss" : "mm:ss", true);
                a2.o1 o1Var = new a2.o1(e1.y.f246315f, ((p2.f) y0Var.i(h3Var)).z(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
                z0.d dVar2 = z0.a.f468895g;
                boolean z29 = androidx.compose.ui.platform.f3.f10562a;
                d0.q qVar = new d0.q(dVar2, false, e3Var2);
                pVar2.k(qVar);
                z17 = false;
                pVar = pVar2;
                e3Var = e3Var2;
                oVar = oVar2;
                l0.e5.c(a28, d0.a2.f(qVar, 4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o1Var, oVar, 0, 0, 32764);
                y0Var = y0Var;
            } else {
                oVar = oVar2;
                pVar = pVar2;
                e3Var = e3Var2;
                z17 = false;
            }
        } else {
            z17 = false;
            z18 = z28;
            z19 = z27;
            pVar = pVar2;
            e3Var = e3Var2;
            oVar = oVar2;
            y0Var = y0Var3;
        }
        y0Var.o(z17);
        z0.d dVar3 = z0.a.f468891c;
        boolean z37 = androidx.compose.ui.platform.f3.f10562a;
        d0.q qVar2 = new d0.q(dVar3, z17, e3Var);
        pVar.k(qVar2);
        z0.t f18 = d0.a2.f(qVar2, 4);
        y0Var.U(1175262004);
        java.lang.Object y17 = y0Var.y();
        int i28 = n0.o.f333629a;
        java.lang.Object obj5 = n0.n.f333620a;
        if (y17 == obj5) {
            y17 = new c0.p();
            y0Var.g0(y17);
        }
        c0.o oVar3 = (c0.o) y17;
        y0Var.o(z17);
        y0Var.U(1175262066);
        yz5.a aVar2 = this.f246702g;
        boolean e17 = y0Var.e(aVar2);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj5) {
            y18 = new e22.p(aVar2);
            y0Var.g0(y18);
        }
        y0Var.o(z17);
        e22.a1.g(z19, z18, a0.d0.c(f18, oVar3, null, false, null, null, (yz5.a) y18, 28, null), oVar, 0, 0);
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(true);
        y0Var.o(z17);
        y0Var.o(z17);
        return jz5.f0.f302826a;
    }
}
