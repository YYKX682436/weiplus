package fn;

/* loaded from: classes11.dex */
public class a implements n65.f {
    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a a(java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.x(str, list, i17, obj);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a b(java.lang.String str, java.util.List list, int i17) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.p(str, list, i17);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a c(java.lang.String str, java.lang.String str2) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.y(str, str2, 0);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a d(java.lang.String str, java.lang.String str2, boolean z17) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(true);
        r45.pn4 pn4Var = new r45.pn4();
        pn4Var.f383228d = str;
        pn4Var.f383229e = str2;
        pn4Var.f383230f = 1;
        pn4Var.f383231g = z17 ? 1 : 2;
        fVar.d(new xg3.p0(49, pn4Var));
        return fVar;
    }

    @Override // n65.f
    public l65.a e(int i17) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        return new com.tencent.mm.roomsdk.model.factory.j(i17);
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a f(java.lang.String str, boolean z17) {
        if (z17) {
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.l(str, true));
        }
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.h hVar = new com.tencent.mm.roomsdk.model.factory.h(true);
        mn.b bVar = new mn.b((java.lang.String) gm0.j1.u().c().l(2, null), str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(bVar);
        hVar.f192266f = new e21.k(linkedList);
        return hVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a g(java.lang.String str, int i17) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.w(str, i17);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a h(java.lang.String str, int i17, int i18) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(true);
        fVar.d(new mn.a(str, i17, i18));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a i(java.lang.String str, java.lang.String str2) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(true);
        r45.sn4 sn4Var = new r45.sn4();
        r45.du5 du5Var = new r45.du5();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        sn4Var.f385865d = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        if (str2 == null) {
            str2 = "";
        }
        du5Var2.f372756d = str2;
        du5Var2.f372757e = true;
        sn4Var.f385866e = du5Var2;
        fVar.d(new xg3.p0(27, sn4Var));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a j(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.Object obj) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.m(str, list, str2, obj);
        return cVar;
    }

    @Override // n65.f
    public void k(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        if (z17) {
            c01.e2.d0(z3Var);
        } else {
            c01.e2.g0(z3Var, true);
        }
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a l(java.lang.String str, java.util.List list) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.o(str, list, null, null);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a m(java.lang.String str) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.s(str);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a n(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(true);
        r45.on4 on4Var = new r45.on4();
        on4Var.f382378d = str;
        on4Var.f382379e = str2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        on4Var.f382380f = str3;
        fVar.d(new xg3.p0(48, on4Var));
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a o(java.lang.String str, java.util.List list, int i17, java.lang.String str2, com.tencent.mm.storage.f9 f9Var) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.x(str, list, i17, str2, f9Var);
        return cVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a p(java.lang.String str, java.lang.String str2) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.f fVar = new com.tencent.mm.roomsdk.model.factory.f(true);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null && ((int) n17.E2) > 0) {
            n17.n1(str2);
            fVar.d(new xg3.p0(2, c01.e2.n(n17)));
        }
        return fVar;
    }

    @Override // n65.f
    public com.tencent.mm.roomsdk.model.factory.a q(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3) {
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.tencent.mm.roomsdk.model.factory.c cVar = new com.tencent.mm.roomsdk.model.factory.c(true);
        cVar.f192251f = new kn.o(str, list, str2, str3);
        return cVar;
    }
}
