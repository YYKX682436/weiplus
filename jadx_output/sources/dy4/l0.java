package dy4;

/* loaded from: classes15.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244685d;

    public l0(dy4.f1 f1Var) {
        this.f244685d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f244685d;
        if (!f1Var.N) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f1Var.Y;
            if (!(atomicBoolean != null ? atomicBoolean.get() : false)) {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "handleWebViewBackground, video not auto pause, ignore resume, type:%s", f1Var.f252498e);
                return;
            } else {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "handleWebViewBackground, video not auto pause, try resume, type:%s", f1Var.f252498e);
                f1Var.A(false, true);
                return;
            }
        }
        ye1.e eVar = f1Var.f244627n;
        if (eVar != null && f1Var.f244635u && f1Var.Y == null) {
            boolean z17 = eVar.isPlaying();
            f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(z17);
            com.tencent.mars.xlog.Log.i(f1Var.x(), "handleWebViewBackground runnable, video playing state when enter background:%s", java.lang.Boolean.valueOf(z17));
            f1Var.z();
        }
    }
}
