package cw2;

/* loaded from: classes15.dex */
public final class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f223971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f223972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f223973f;

    public r5(android.view.Surface surface, cw2.z5 z5Var, cw2.d6 d6Var) {
        this.f223971d = surface;
        this.f223972e = z5Var;
        this.f223973f = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Surface surface = this.f223971d;
        java.util.Objects.toString(surface);
        cw2.z5 z5Var = this.f223972e;
        java.util.Objects.toString(z5Var);
        long j17 = z5Var.f224136d;
        cw2.d6 d6Var = this.f223973f;
        if (j17 != 0) {
            if (kotlin.jvm.internal.o.b(z5Var.f224138f, surface)) {
                return;
            } else {
                d6Var.f223649c.releaseSwapChain(z5Var.f224136d);
            }
        }
        z5Var.f224136d = d6Var.f223649c.createSwapChain(surface, 0, 0);
        if (z5Var.f224136d == 0) {
            com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Create swap chain failed. " + z5Var);
        } else {
            z5Var.f224138f = surface;
            z5Var.f224141i = null;
            java.util.Objects.toString(surface);
            java.util.Objects.toString(z5Var);
        }
    }
}
