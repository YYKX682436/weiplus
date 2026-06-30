package ij3;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij3.k f291698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij3.f f291699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f291700f;

    public a(ij3.k kVar, ij3.f fVar, java.lang.Runnable runnable) {
        this.f291698d = kVar;
        this.f291699e = fVar;
        this.f291700f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        rs0.h hVar2;
        android.opengl.EGLSurface eGLSurface;
        if (!((ij3.i) this.f291698d).f291710a.f300008e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "surface not inUse " + ((ij3.i) this.f291698d).f291710a);
            return;
        }
        ij3.f fVar = this.f291699e;
        fj3.f fVar2 = fVar.f291704e;
        jj3.c cVar = ((ij3.i) this.f291698d).f291710a;
        fVar.getClass();
        if (fVar2 != null && (hVar2 = fVar2.f263203e) != null) {
            if (cVar.f300008e && ((eGLSurface = cVar.f300006c) == null || kotlin.jvm.internal.o.b(eGLSurface, android.opengl.EGL14.EGL_NO_SURFACE))) {
                jj3.d a17 = cVar.a();
                if ((a17 != null ? a17.getRenderTarget() : null) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "eglCreateSurface for " + cVar);
                    jj3.d a18 = cVar.a();
                    java.lang.Object renderTarget = a18 != null ? a18.getRenderTarget() : null;
                    if (renderTarget != null) {
                        cVar.f300006c = rs0.i.f399296a.k(hVar2.f399292a, renderTarget);
                        android.opengl.EGLDisplay eGLDisplay = hVar2.f399292a;
                        kotlin.jvm.internal.o.g(eGLDisplay, "<set-?>");
                        cVar.f300007d = eGLDisplay;
                    }
                }
            }
            android.opengl.EGLDisplay eGLDisplay2 = hVar2.f399292a;
            android.opengl.EGLSurface eGLSurface2 = cVar.f300006c;
            android.opengl.EGLSurface eGLSurface3 = eGLSurface2 == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface2;
            if (eGLSurface2 == null) {
                eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface2, hVar2.f399294c);
        }
        this.f291700f.run();
        ij3.f fVar3 = this.f291699e;
        fj3.f fVar4 = fVar3.f291704e;
        jj3.c cVar2 = ((ij3.i) this.f291698d).f291710a;
        fVar3.getClass();
        if (fVar4 != null && (hVar = fVar4.f263203e) != null) {
            rs0.g gVar = rs0.i.f399296a;
            android.opengl.EGLDisplay eGLDisplay3 = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface4 = cVar2.f300006c;
            if (eGLSurface4 == null) {
                eGLSurface4 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            gVar.x(eGLDisplay3, eGLSurface4);
        }
        jj3.d a19 = ((ij3.i) this.f291698d).f291710a.a();
        if (a19 != null) {
            a19.a();
        }
    }
}
