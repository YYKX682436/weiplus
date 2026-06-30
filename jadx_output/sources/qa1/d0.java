package qa1;

/* loaded from: classes14.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f360978d;

    public d0(qa1.f0 f0Var) {
        this.f360978d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.f0 f0Var = this.f360978d;
        try {
            if (f0Var.f360988i.f330963s) {
                android.graphics.SurfaceTexture b17 = f0Var.f360989m.b();
                java.util.Objects.requireNonNull(b17);
                b17.updateTexImage();
                f0Var.f360988i.onDrawFrame(null);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: renderer already released!");
            }
            if (!f0Var.f360990n.get()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: can not render because already destroyed");
                return;
            }
            rs0.h hVar = f0Var.f360987h;
            if (hVar != null) {
                android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f399292a, hVar.f399293b, java.lang.System.nanoTime());
                rs0.h hVar2 = f0Var.f360987h;
                android.opengl.EGL14.eglSwapBuffers(hVar2.f399292a, hVar2.f399293b);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRecordableSurfaceView.RecordableImp", th6, "hy: encounter exception! gl get error: %d", java.lang.Integer.valueOf(android.opengl.EGL14.eglGetError()));
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(808L, 2L, 1L, true);
        }
    }
}
