package rp1;

/* loaded from: classes14.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f398518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f398519e;

    public r0(rp1.v0 v0Var, long j17) {
        this.f398518d = v0Var;
        this.f398519e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f398518d.f398537a, "checkIdleInner run taskId: " + this.f398519e);
        this.f398518d.d(true);
        ku5.u0 u0Var = ku5.t0.f312615d;
        rp1.v0 v0Var = this.f398518d;
        ((ku5.t0) u0Var).h(new rp1.q0(v0Var, this.f398519e), v0Var.f398537a);
    }
}
