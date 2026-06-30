package rh;

/* loaded from: classes12.dex */
public class q0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f395496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395497b;

    public q0(rh.c1 c1Var, rh.d2 d2Var) {
        this.f395497b = c1Var;
        this.f395496a = d2Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        java.lang.Integer num = (java.lang.Integer) this.f395496a.k(this.f395497b.f395329k.d()).f395508d.f395552a;
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + num, new java.lang.Object[0]);
        return num.intValue() == -1 ? rh.c3.f395339o : num;
    }
}
