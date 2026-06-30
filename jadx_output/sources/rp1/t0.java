package rp1;

/* loaded from: classes14.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f398525d;

    public t0(rp1.v0 v0Var) {
        this.f398525d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rp1.v0 v0Var = this.f398525d;
        v0Var.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(v0Var.f398537a, "checkIdleInner taskId: " + currentTimeMillis);
        ku5.u0 u0Var = ku5.t0.f312615d;
        rp1.r0 r0Var = new rp1.r0(v0Var, currentTimeMillis);
        long intValue = ((java.lang.Number) ((jz5.n) rp1.v0.f398536f).getValue()).intValue();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z17 = t0Var.z(r0Var, intValue, false);
        kotlin.jvm.internal.o.d(z17);
        v0Var.f398538b = new rp1.n0(currentTimeMillis, z17);
    }
}
