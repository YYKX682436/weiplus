package gf;

/* loaded from: classes7.dex */
public final class b implements com.tencent.skyline.jni.INativeHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.f0 f271021a;

    public b(com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var) {
        this.f271021a = f0Var;
    }

    @Override // com.tencent.skyline.jni.INativeHandler
    public final void checkAndPost(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = this.f271021a;
        if (f0Var.g()) {
            runnable.run();
        } else {
            f0Var.post(runnable);
        }
    }
}
