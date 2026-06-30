package mz0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz0.l f332947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(mz0.b2 b2Var, dz0.l lVar) {
        super(2);
        this.f332946d = b2Var;
        this.f332947e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(279461270);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var2.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var2.o(false);
        mz0.b2 b2Var = this.f332946d;
        tz0.a0.a(u0.j.b(y0Var2, -1793948430, true, new mz0.c0(b2Var, v2Var, this.f332947e)), y0Var2, 6);
        n0.d2.f(v2Var.getValue(), new mz0.d0(v2Var, b2Var, null), y0Var2, 64);
        n0.d2.f(java.lang.Integer.valueOf(mz0.b2.O6(b2Var)), new mz0.e0(b2Var, null), y0Var2, 64);
        return jz5.f0.f302826a;
    }
}
