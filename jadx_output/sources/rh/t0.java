package rh;

/* loaded from: classes12.dex */
public class t0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395507a;

    public t0(rh.c1 c1Var) {
        this.f395507a = c1Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        android.content.Context context = this.f395507a.f395329k.d();
        java.lang.Integer num = wh.m.f445830a;
        kotlin.jvm.internal.o.g(context, "context");
        int n17 = wh.m.n(context);
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + n17, new java.lang.Object[0]);
        return n17 == -1 ? rh.c3.f395339o : java.lang.Integer.valueOf(n17);
    }
}
