package dr0;

/* loaded from: classes12.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.j0 f242425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242426e;

    public g0(dr0.j0 j0Var, java.lang.String str) {
        this.f242425d = j0Var;
        this.f242426e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.j0 j0Var = this.f242425d;
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        ph.c c17 = tVar.c();
        java.lang.String it = this.f242426e;
        kotlin.jvm.internal.o.f(it, "$it");
        j0Var.j(c17, it);
    }
}
