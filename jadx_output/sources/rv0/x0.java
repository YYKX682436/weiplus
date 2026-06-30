package rv0;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ex0.a0 a0Var, rv0.n1 n1Var) {
        super(1);
        this.f400320d = a0Var;
        this.f400321e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.base.MJID segmentID = (com.tencent.maas.base.MJID) obj;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f400320d;
        ex0.r K = a0Var.K(segmentID);
        if (K != null) {
            ex0.i0.m(a0Var);
            ex0.i0.k(a0Var, K);
            rv0.n1 n1Var = this.f400321e;
            kotlin.jvm.internal.o.g(n1Var, "<this>");
            ex0.a0 s76 = n1Var.s7();
            if (s76 != null) {
                ex0.a0 s77 = n1Var.s7();
                ex0.r n17 = s77 != null ? s77.n() : null;
                ex0.j0 j0Var = n17 instanceof ex0.j0 ? (ex0.j0) n17 : null;
                if (j0Var != null && n1Var.f400137y == null) {
                    zv0.f0 f0Var = new zv0.f0(n1Var.getContext(), j0Var);
                    n1Var.f400137y = f0Var;
                    n1Var.p7().o7(s76.u(j0Var), true);
                    n1Var.p7().D = 1;
                    f0Var.setOnAttached(zv0.b.f476155d);
                    f0Var.setOnTransitionSelected(new zv0.d(f0Var, n1Var, s76, j0Var));
                    f0Var.setOnApplyToAllButtonClicked(new zv0.f(f0Var, n1Var));
                    f0Var.setOnClosed(new zv0.h(n1Var, s76));
                    f0Var.setResult(java.lang.Boolean.TRUE);
                    f0Var.H();
                    kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new zv0.i(n1Var, j0Var.r(), j0Var, f0Var, null), 3, null);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    java.util.Iterator it = ((java.util.ArrayList) s76.f257097g.f257181i).iterator();
                    while (it.hasNext()) {
                        ex0.j0 j0Var2 = (ex0.j0) it.next();
                        com.tencent.maas.base.MJID mjid = j0Var2.f257168b;
                        java.lang.String r17 = j0Var2.r();
                        if (r17 == null) {
                            r17 = "Blank";
                        }
                        concurrentHashMap.put(mjid, r17);
                    }
                    f0Var.I(new zv0.j(f0Var, n1Var), new zv0.l(f0Var, concurrentHashMap, n1Var, s76));
                    f0Var.setPanelResultListener(new zv0.m(f0Var, n1Var));
                    n1Var.g7(f0Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
