package rh;

/* loaded from: classes12.dex */
public class d0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395358a;

    public d0(rh.c1 c1Var) {
        this.f395358a = c1Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.c1 c1Var = this.f395358a;
        if (wh.m.w(c1Var.f395329k.d())) {
            return rh.c3.f395339o;
        }
        long h17 = wh.m.h(c1Var.f395329k.d());
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + h17, new java.lang.Object[0]);
        return h17 == -1 ? rh.c3.f395339o : java.lang.Long.valueOf(h17);
    }
}
