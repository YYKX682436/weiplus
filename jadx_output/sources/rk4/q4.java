package rk4;

/* loaded from: classes8.dex */
public final class q4 implements gp1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.r4 f396934a;

    public q4(rk4.r4 r4Var) {
        this.f396934a = r4Var;
    }

    @Override // gp1.m
    public void onEnter() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        rk4.p4 p4Var = new rk4.p4(this.f396934a);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(p4Var, 1000L, false);
    }
}
