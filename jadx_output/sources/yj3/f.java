package yj3;

/* loaded from: classes14.dex */
public final class f implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f462674d;

    public f(yj3.g gVar) {
        this.f462674d = gVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f462674d.f462685k = true;
        yj3.g gVar = this.f462674d;
        synchronized (gVar) {
            try {
                if (gVar.f462685k) {
                    gVar.f462685k = false;
                    try {
                        android.graphics.SurfaceTexture surfaceTexture2 = gVar.f462681g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectCanvasRendererMgr", "render Image update");
                    }
                }
                os0.c cVar = gVar.f462680f;
                if (cVar != null) {
                    cVar.o();
                }
                rs0.h hVar = gVar.f462684j;
                if (hVar != null) {
                    android.opengl.EGL14.eglSwapBuffers(hVar.f399292a, hVar.f399293b);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectCanvasRendererMgr", "render error in " + e17);
            }
        }
    }
}
