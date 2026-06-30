package ro5;

/* loaded from: classes14.dex */
public final class h1 implements xo5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp5.g f398205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp5.d f398206b;

    public h1(bp5.g gVar, dp5.d dVar) {
        this.f398205a = gVar;
        this.f398206b = dVar;
    }

    public boolean a() {
        android.opengl.EGLSurface eGLSurface = this.f398205a.f23464c;
        if (eGLSurface == null) {
            eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        dp5.d dVar = this.f398206b;
        if (android.opengl.EGL14.eglMakeCurrent(dVar.f242280a, eGLSurface, eGLSurface, dVar.f242282c)) {
            if (kotlin.jvm.internal.o.b(android.opengl.EGL14.eglGetCurrentContext(), dVar.f242282c)) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "Context binding verification failed");
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "eglMakeCurrent failed: " + android.opengl.EGL14.eglGetError());
        return false;
    }

    public boolean b(java.lang.String tag) {
        boolean z17;
        kotlin.jvm.internal.o.g(tag, "tag");
        dp5.d dVar = this.f398206b;
        android.opengl.EGLDisplay eGLDisplay = dVar.f242280a;
        bp5.g gVar = this.f398205a;
        android.opengl.EGLSurface eGLSurface = gVar.f23464c;
        if (eGLSurface == null) {
            eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        android.opengl.EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, java.lang.System.nanoTime());
        dp5.c cVar = dp5.c.f242278a;
        android.opengl.EGLSurface eGLSurface2 = gVar.f23464c;
        if (eGLSurface2 == null) {
            eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        dp5.b bVar = (dp5.b) dp5.c.f242279b;
        bVar.getClass();
        android.opengl.EGLDisplay eGLDisplay2 = dVar.f242280a;
        if (eGLDisplay2 == null || eGLSurface2 == null) {
            z17 = false;
        } else {
            z17 = android.opengl.EGL14.eglSwapBuffers(eGLDisplay2, eGLSurface2);
            dp5.b.a(bVar, "eglSwapBuffers", null, 2, null);
        }
        if (z17) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "swapBufferWithCheck: " + tag + " error");
        return false;
    }
}
