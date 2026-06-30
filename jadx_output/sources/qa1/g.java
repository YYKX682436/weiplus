package qa1;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.h f360993d;

    public g(qa1.h hVar) {
        this.f360993d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f360993d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "hy: onSurfaceTextureDestroyed in thread! can preview: %b", java.lang.Boolean.valueOf(hVar.f361000p.get()));
        try {
            if (hVar.f361000p.get()) {
                qa1.h.a(hVar, hVar.f360999o.b());
                hVar.f361000p.getAndSet(false);
                ms0.c cVar = hVar.f360998n;
                if (cVar != null) {
                    cVar.n(false);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CameraPreviewGLTextureView", "hy: no renderer!");
                }
                rs0.h hVar2 = hVar.f360995h;
                if (hVar2 != null) {
                    android.opengl.EGL14.eglDestroyContext(hVar2.f399292a, hVar2.f399294c);
                    rs0.h hVar3 = hVar.f360995h;
                    android.opengl.EGL14.eglDestroySurface(hVar3.f399292a, hVar3.f399293b);
                    hVar.f360994g.release();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraPreviewGLTextureView", th6, "hy: error in surface destroy!!", new java.lang.Object[0]);
        }
    }
}
