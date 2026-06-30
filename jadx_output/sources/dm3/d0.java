package dm3;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f241675d;

    public d0(dm3.e0 e0Var) {
        this.f241675d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm3.e0 e0Var = this.f241675d;
        if (e0Var.f241692x) {
            com.tencent.mars.xlog.Log.i(e0Var.o(), "startTimerToReplace overTime and replace player");
            b66.n nVar = e0Var.f241681m;
            if (nVar != null) {
                e0Var.f241684p = true;
                ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(true);
                dm3.e0.m(e0Var, e0Var.q(), nVar);
            }
            jm4.n2 q17 = e0Var.q();
            e0Var.f241681m = q17 != null ? ((jm4.p2) q17).f() : null;
            b66.n nVar2 = e0Var.f241681m;
            if (nVar2 != null) {
                ((b66.q) nVar2).a(e0Var.f241686r);
            }
        }
    }
}
