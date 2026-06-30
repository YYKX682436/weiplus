package qa1;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.h f360982d;

    public f(qa1.h hVar) {
        this.f360982d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f360982d;
        try {
            if (hVar.f360998n.f330963s) {
                android.graphics.SurfaceTexture b17 = hVar.f360999o.b();
                java.util.Objects.requireNonNull(b17);
                b17.updateTexImage();
                hVar.f360998n.onDrawFrame(null);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraPreviewGLTextureView", "hy: renderer already released!");
            }
            if (!hVar.f361000p.get()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraPreviewGLTextureView", "hy: can not render because already destroyed");
                return;
            }
            rs0.h hVar2 = hVar.f360995h;
            if (hVar2 != null) {
                android.opengl.EGLExt.eglPresentationTimeANDROID(hVar2.f399292a, hVar2.f399293b, java.lang.System.nanoTime());
                rs0.h hVar3 = hVar.f360995h;
                android.opengl.EGL14.eglSwapBuffers(hVar3.f399292a, hVar3.f399293b);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraPreviewGLTextureView", th6, "hy: encounter exception! gl get error: %d", java.lang.Integer.valueOf(android.opengl.EGL14.eglGetError()));
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(808L, 2L, 1L, true);
        }
    }
}
