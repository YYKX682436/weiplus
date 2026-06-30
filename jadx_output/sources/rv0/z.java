package rv0;

/* loaded from: classes5.dex */
public final class z implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400346d;

    public z(rv0.n1 n1Var) {
        this.f400346d = n1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.a0 s76;
        zv0.h0 h0Var = (zv0.h0) obj;
        rv0.n1 n1Var = this.f400346d;
        zv0.f0 f0Var = n1Var.f400137y;
        if (f0Var != null) {
            kotlin.jvm.internal.o.d(h0Var);
            f0Var.setTransitionUiState(h0Var);
        }
        kotlin.jvm.internal.o.d(h0Var);
        zv0.n0 n0Var = h0Var.f476183c;
        if (((n0Var instanceof zv0.m0) || (n0Var instanceof zv0.l0)) && (s76 = n1Var.s7()) != null) {
            zv0.r rVar = (zv0.r) kz5.n0.a0(h0Var.f476181a, h0Var.f476182b.f476178b);
            if (zu0.i.f475676f == (rVar != null ? rVar.f476222b : null)) {
                ex0.r n76 = n1Var.n7();
                ex0.j0 j0Var = n76 instanceof ex0.j0 ? (ex0.j0) n76 : null;
                if (j0Var == null) {
                    return;
                }
                if (kotlin.jvm.internal.o.b(j0Var.r(), rVar.f476221a.f48224b)) {
                    com.tencent.maas.model.time.MJTimeRange u17 = s76.u(j0Var);
                    n1Var.p7().o7(u17, true);
                    n1Var.p7().D = 1;
                    kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new zv0.n(n1Var, u17, null), 3, null);
                    return;
                }
                com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = rVar.f476221a;
                java.lang.String str = mJMaterialInfo.f48224b;
                kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
                if (s76.d(j0Var, str)) {
                    zv0.f0 f0Var2 = n1Var.f400137y;
                    if (f0Var2 != null) {
                        f0Var2.setSelectedTransitionInfo(rVar);
                    }
                    java.lang.String str2 = mJMaterialInfo.f48224b;
                    kotlin.jvm.internal.o.f(str2, "getMaterialID(...)");
                    ex0.r n17 = s76.n();
                    ex0.j0 j0Var2 = n17 instanceof ex0.j0 ? (ex0.j0) n17 : null;
                    if (j0Var2 != null) {
                        s76.x(j0Var2, str2);
                        s76.J(cx0.d.f224510f.a(cx0.d.f224509e), null);
                    }
                    com.tencent.maas.model.time.MJTimeRange u18 = s76.u(j0Var);
                    n1Var.p7().o7(u18, true);
                    n1Var.p7().D = 1;
                    kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new zv0.o(n1Var, u18, null), 3, null);
                }
            }
        }
    }
}
