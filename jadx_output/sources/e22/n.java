package e22;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f246688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(3);
        this.f246688d = finderObject;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.y0 y0Var;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        d0.f0 BoxWithConstraints = (d0.f0) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            if (y0Var2.v()) {
                y0Var2.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        z0.t f17 = d0.a3.f(pVar, 0.0f, 1, null);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        n0.y0 y0Var3 = (n0.y0) oVar;
        z0.t g17 = d0.a3.g(f17, ((int) ((p2.c.h(((d0.g0) BoxWithConstraints).f225120b) * 4.0d) / 3.0d)) / ((p2.f) y0Var3.i(h3Var)).getDensity());
        y0Var3.U(733328855);
        int i18 = z0.d.f468903a;
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, oVar, 0);
        y0Var3.U(-1323940314);
        p2.f fVar = (p2.f) y0Var3.i(h3Var);
        p2.s sVar = (p2.s) y0Var3.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var3.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(g17);
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
        n0.i5.a(oVar, c17, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var3.n();
        ((u0.i) a17).invoke(new n0.i4(oVar), oVar, 0);
        y0Var3.U(2058660585);
        y0Var3.U(-2137368960);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f246688d.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        y0Var3.U(-952586362);
        if (finderMedia != null) {
            java.lang.String str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
            java.util.LinkedList<r45.vf2> spec = finderMedia.getSpec();
            kotlin.jvm.internal.o.f(spec, "getSpec(...)");
            r45.vf2 vf2Var = (r45.vf2) kz5.n0.Z(spec);
            y0Var3.U(604400049);
            int i19 = u5.e.f424702a;
            u5.d dVar = u5.d.f424701b;
            r5.j a18 = u5.c.a(u5.y.f424754a, oVar, 6);
            y0Var3.U(604401818);
            c6.h hVar = new c6.h((android.content.Context) y0Var3.i(androidx.compose.ui.platform.a1.f10503b));
            hVar.f38805c = str;
            u5.s a19 = u5.x.a(hVar.a(), a18, dVar, oVar, nd1.k2.CTRL_INDEX, 0);
            y0Var3.o(false);
            y0Var3.o(false);
            int i27 = s1.p.f402054a;
            a0.q1.a(a19, null, d0.a3.e(pVar, 0.0f, 1, null), null, s1.o.f402044a, 0.0f, null, oVar, 25008, 104);
            if (vf2Var != null) {
                java.lang.String a27 = y46.b.a(vf2Var.getInteger(8), vf2Var.getInteger(8) >= 3600000 ? "H:mm:ss" : "mm:ss", true);
                a2.o1 o1Var = new a2.o1(e1.y.f246315f, ((p2.f) y0Var3.i(h3Var)).z(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
                z0.d dVar2 = z0.a.f468895g;
                boolean z17 = androidx.compose.ui.platform.f3.f10562a;
                d0.q qVar = new d0.q(dVar2, false, androidx.compose.ui.platform.e3.f10553d);
                pVar.k(qVar);
                y0Var = y0Var3;
                l0.e5.c(a27, d0.a2.f(qVar, 4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o1Var, oVar, 0, 0, 32764);
            } else {
                y0Var = y0Var3;
            }
        } else {
            y0Var = y0Var3;
        }
        n0.y0 y0Var4 = y0Var;
        y0Var4.o(false);
        y0Var4.o(false);
        y0Var4.o(false);
        y0Var4.o(true);
        y0Var4.o(false);
        y0Var4.o(false);
        return jz5.f0.f302826a;
    }
}
