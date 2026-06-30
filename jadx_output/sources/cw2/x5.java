package cw2;

/* loaded from: classes15.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f224106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f224107e;

    public x5(cw2.z5 z5Var, cw2.d6 d6Var) {
        this.f224106d = z5Var;
        this.f224107e = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.z5 z5Var = this.f224106d;
        java.util.Objects.toString(z5Var);
        long j17 = z5Var.f224136d;
        if (j17 == 0) {
            return;
        }
        this.f224107e.f223649c.releaseSwapChain(j17);
        z5Var.f224136d = 0L;
        z5Var.f224141i = null;
        java.util.Objects.toString(z5Var);
    }
}
