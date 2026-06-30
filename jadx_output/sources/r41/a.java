package r41;

/* loaded from: classes11.dex */
public class a implements n65.f {
    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a a(java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.b0(str, t41.d.a(list));
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a b(java.lang.String str, java.util.List list, int i17) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.r(str, t41.d.a(list));
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.d0(str2, str);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a d(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(false);
        fVar.d(new p41.m(str, z17 ? 1 : 2));
        return fVar;
    }

    @Override // n65.f
    public l65.a e(int i17) {
        return new com.tencent.mm.roomsdk.model.factory.j(i17);
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a f(java.lang.String str, boolean z17) {
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(false);
        fVar.d(new p41.s(str));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a g(java.lang.String str, int i17) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.v(str, i17);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a h(java.lang.String str, int i17, int i18) {
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(false);
        fVar.d(new p41.k(str, i17 == 0 ? 1 : 2));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(false);
        fVar.d(new p41.o(str, str2));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a j(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.Object obj) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.n(str, t41.d.a(list), str2);
        return cVar;
    }

    @Override // n65.f
    public void k(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        if (!z17) {
            vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
            java.lang.String d17 = z3Var.d1();
            ((np.h) e4Var).getClass();
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.u(d17, 2));
            return;
        }
        z3Var.N2();
        java.util.Set set = c01.e2.f37117a;
        boolean z18 = false;
        if (com.tencent.mm.storage.z3.R4(z3Var.d1()) && z3Var.r2()) {
            z18 = true;
        }
        if (z18) {
            z3Var.T1(43);
            z3Var.R1(x51.k.b(z3Var.f2()));
            z3Var.S1(x51.k.a(z3Var.f2()));
            z3Var.o1(x51.k.a(z3Var.g2()));
            z3Var.p1(z3Var.g2());
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
        vg3.e4 e4Var2 = (vg3.e4) i95.n0.c(vg3.e4.class);
        java.lang.String d18 = z3Var.d1();
        ((np.h) e4Var2).getClass();
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.u(d18, 1));
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a l(java.lang.String str, java.util.List list) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.q(t41.d.a(list));
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a m(java.lang.String str) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.u(str);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a n(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(false);
        fVar.d(new p41.l(str, str3));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a o(java.lang.String str, java.util.List list, int i17, java.lang.String str2, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.b0(str, t41.d.a(list));
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a p(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a q(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(false);
        cVar.f192251f = new l41.q(t41.d.a(list));
        return cVar;
    }
}
