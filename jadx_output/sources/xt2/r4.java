package xt2;

/* loaded from: classes3.dex */
public final class r4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.nt2 f456990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456991b;

    public r4(r45.nt2 nt2Var, xt2.b5 b5Var) {
        this.f456990a = nt2Var;
        this.f456991b = b5Var;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        int i17;
        r45.nt2 nt2Var = this.f456990a;
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Qj((ml2.j0) c17, 1, nt2Var.getInteger(1), 0L, 0, 12, null);
            i17 = 1;
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.j0.Qj((ml2.j0) c18, 2, nt2Var.getInteger(1), 0L, 0, 12, null);
            i17 = 2;
        }
        int integer = nt2Var.getInteger(1);
        xt2.b5 b5Var = this.f456991b;
        xt2.b5.A(b5Var, i17, integer, new xt2.q4(b5Var, nt2Var, this));
    }
}
