package ze5;

/* loaded from: classes5.dex */
public final class b2 {
    public b2(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(ze5.b2 b2Var, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, com.tencent.mm.pluginsdk.model.app.d dVar) {
        b2Var.getClass();
        if (!ez.v0.f257777a.k(java.lang.Integer.valueOf(qVar != null ? qVar.f348666i : 0)) || ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, dVar) == 2 || c01.id.a() - f9Var.getCreateTime() <= 432000000) {
            return;
        }
        i95.m c17 = i95.n0.c(pt.g0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pt.g0.Xb((pt.g0) c17, f9Var, null, 2, false, 8, null);
        ((ku5.t0) ku5.t0.f312615d).g(new ze5.z1(f9Var));
    }
}
