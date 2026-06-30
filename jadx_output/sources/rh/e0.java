package rh;

/* loaded from: classes12.dex */
public class e0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh.h f395369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395370b;

    public e0(rh.c1 c1Var, uh.h hVar) {
        this.f395370b = c1Var;
        this.f395369a = hVar;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.d3 d3Var = (rh.d3) ((java.util.HashMap) this.f395370b.f395320b).get(uh.g.class);
        if (d3Var instanceof uh.g) {
            oj.j.c("Matrix.battery.CompositeMonitors", "onAcc " + c3Var.f395346g + " " + c3Var.f395340a, new java.lang.Object[0]);
            ((uh.g) d3Var).b(this.f395369a.k());
        }
        return rh.c3.f395339o;
    }
}
