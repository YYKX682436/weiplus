package rh;

/* loaded from: classes12.dex */
public class v0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o3 f395523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395524b;

    public v0(rh.c1 c1Var, rh.o3 o3Var) {
        this.f395524b = c1Var;
        this.f395523a = o3Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.n3 k17 = this.f395523a.k(this.f395524b.f395329k.d());
        if (k17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSampling ");
            sb6.append(c3Var.f395346g);
            sb6.append(" ");
            java.lang.String str = c3Var.f395340a;
            sb6.append(str);
            sb6.append(" wifiRx, val = ");
            sb6.append(k17.f395470d);
            oj.j.c("Matrix.battery.CompositeMonitors", sb6.toString(), new java.lang.Object[0]);
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + str + " wifiTx, val = " + k17.f395471e, new java.lang.Object[0]);
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + str + " mobileRx, val = " + k17.f395474h, new java.lang.Object[0]);
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + str + " mobileTx, val = " + k17.f395475i, new java.lang.Object[0]);
        }
        return 0;
    }
}
