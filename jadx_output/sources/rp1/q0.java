package rp1;

/* loaded from: classes14.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f398514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f398515e;

    public q0(rp1.v0 v0Var, long j17) {
        this.f398514d = v0Var;
        this.f398515e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rp1.n0 n0Var = this.f398514d.f398538b;
        boolean z17 = false;
        if (n0Var != null && n0Var.f398485a == this.f398515e) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f398514d.f398537a, "checkIdleInner task done.");
            this.f398514d.f398538b = null;
        }
    }
}
