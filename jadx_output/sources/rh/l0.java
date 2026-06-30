package rh;

/* loaded from: classes12.dex */
public class l0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f395441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.o0 f395442b;

    public l0(rh.o0 o0Var, wh.n1 n1Var) {
        this.f395442b = o0Var;
        this.f395441a = n1Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o0 o0Var = this.f395442b;
        boolean z17 = o0Var.f395479a;
        rh.c1 c1Var = o0Var.f395482d;
        if (z17) {
            c1Var.u(uh.g.class, new rh.i0(this));
        }
        c1Var.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class, new rh.k0(this));
    }
}
