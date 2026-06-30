package rh;

/* loaded from: classes12.dex */
public class u0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.k1 f395514a;

    public u0(rh.c1 c1Var, rh.k1 k1Var) {
        this.f395514a = k1Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.f1 w17 = this.f395514a.w();
        for (int i17 = 0; i17 < w17.f395385d.size(); i17++) {
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + " cpuCore" + i17 + ", val = " + ((rh.y2) w17.f395385d.get(i17)).f395560a, new java.lang.Object[0]);
        }
        for (int i18 = 0; i18 < w17.f395386e.size(); i18++) {
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + " procCpuCluster" + i18 + ", val = " + ((rh.y2) w17.f395386e.get(i18)).f395560a, new java.lang.Object[0]);
        }
        return 0;
    }
}
