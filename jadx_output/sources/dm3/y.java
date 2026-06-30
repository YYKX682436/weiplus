package dm3;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f241750d;

    public y(dm3.e0 e0Var) {
        this.f241750d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm3.e0 e0Var = this.f241750d;
        b66.n nVar = e0Var.f241681m;
        if (nVar != null) {
            dm3.e0.m(e0Var, e0Var.q(), nVar);
        }
        e0Var.i();
        e0Var.g();
    }
}
