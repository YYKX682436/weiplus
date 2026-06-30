package ze5;

/* loaded from: classes9.dex */
public final class u3 {
    public u3(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(ze5.u3 u3Var, com.tencent.mm.storage.f9 f9Var, v05.b bVar) {
        u3Var.getClass();
        if (!ez.v0.f257777a.k(java.lang.Integer.valueOf(bVar.getInteger(bVar.f368365d + 6))) || ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, null) == 2) {
            return;
        }
        long a17 = c01.id.a() - f9Var.getCreateTime();
        te5.h hVar = te5.h.f418649a;
        if (a17 > ((java.lang.Number) ((jz5.n) te5.h.f418650b).getValue()).longValue()) {
            i95.m c17 = i95.n0.c(pt.g0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pt.g0.Xb((pt.g0) c17, f9Var, null, 2, false, 8, null);
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
            ut.b.f430592f.a().V6(f9Var, 7, false);
            ((ku5.t0) ku5.t0.f312615d).g(new ze5.r3(f9Var));
        }
    }
}
