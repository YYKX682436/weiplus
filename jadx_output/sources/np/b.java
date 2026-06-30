package np;

/* loaded from: classes11.dex */
public abstract class b {
    public static void a(com.tencent.mm.storage.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.E2();
        d(z3Var);
    }

    public static void b(com.tencent.mm.storage.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.r3();
        d(z3Var);
    }

    public static c01.g8 c(com.tencent.mm.storage.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            return null;
        }
        op.c cVar = new op.c(false);
        cVar.a(new xg3.p0(2, c01.e2.n(z3Var)));
        return cVar;
    }

    public static void d(com.tencent.mm.storage.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        if (((int) z3Var.E2) == 0) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(z3Var);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(z3Var.d1());
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
    }
}
