package sr2;

/* loaded from: classes10.dex */
public final class d2 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411537a;

    public d2(sr2.y2 y2Var) {
        this.f411537a = y2Var;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        sr2.y2 y2Var = this.f411537a;
        if (booleanValue) {
            y2Var.getClass();
            java.lang.Object a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ya2.o1.t4((ya2.o1) a17, false, null, 2, null);
            return;
        }
        ya2.p1 p1Var = y2Var.f411800d;
        if (p1Var != null) {
            ((yv2.b) p1Var).e();
        } else {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
    }
}
