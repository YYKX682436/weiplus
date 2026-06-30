package dy4;

/* loaded from: classes15.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f244691e;

    public n0(dy4.f1 f1Var, android.view.Surface surface) {
        this.f244690d = f1Var;
        this.f244691e = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f244690d;
        com.tencent.mars.xlog.Log.i(f1Var.x(), "handler(%s) handlePluginReady", f1Var.q());
        f1Var.f244629p = false;
        f1Var.f244631q = false;
        f1Var.f244632r = false;
        f1Var.f244636v = false;
        android.view.Surface surface = this.f244691e;
        f1Var.f244626m = surface;
        if (f1Var.f244627n != null) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "handlePluginReady, setSurface:%s", surface);
            try {
                ye1.e eVar = f1Var.f244627n;
                if (eVar != null) {
                    eVar.setSurface(f1Var.f244626m);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(f1Var.x(), "handlePluginReady, setSurface:ex " + e17.getMessage());
            }
        }
    }
}
