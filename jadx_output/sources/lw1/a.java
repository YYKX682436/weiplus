package lw1;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw1.k f321546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lw1.f f321547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f321548f;

    public a(lw1.k kVar, lw1.f fVar, java.lang.Runnable runnable) {
        this.f321546d = kVar;
        this.f321547e = fVar;
        this.f321548f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        rs0.h hVar2;
        android.opengl.EGLSurface eGLSurface;
        if (!((lw1.i) this.f321546d).f321558a.f331694e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "surface not inUse " + ((lw1.i) this.f321546d).f321558a);
            return;
        }
        lw1.f fVar = this.f321547e;
        iw1.f fVar2 = fVar.f321552e;
        mw1.b bVar = ((lw1.i) this.f321546d).f321558a;
        fVar.getClass();
        if (fVar2 != null && (hVar2 = fVar2.f295208e) != null) {
            if (bVar.f331694e && ((eGLSurface = bVar.f331692c) == null || kotlin.jvm.internal.o.b(eGLSurface, android.opengl.EGL14.EGL_NO_SURFACE))) {
                mw1.c a17 = bVar.a();
                if ((a17 != null ? ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a17).getRenderTarget() : null) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "eglCreateSurface for " + bVar);
                    mw1.c a18 = bVar.a();
                    java.lang.Object renderTarget = a18 != null ? ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a18).getRenderTarget() : null;
                    if (renderTarget != null) {
                        bVar.f331692c = rs0.i.f399296a.k(hVar2.f399292a, renderTarget);
                        android.opengl.EGLDisplay eGLDisplay = hVar2.f399292a;
                        kotlin.jvm.internal.o.g(eGLDisplay, "<set-?>");
                        bVar.f331693d = eGLDisplay;
                    }
                }
            }
            android.opengl.EGLDisplay eGLDisplay2 = hVar2.f399292a;
            android.opengl.EGLSurface eGLSurface2 = bVar.f331692c;
            android.opengl.EGLSurface eGLSurface3 = eGLSurface2 == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface2;
            if (eGLSurface2 == null) {
                eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface2, hVar2.f399294c);
        }
        this.f321548f.run();
        lw1.f fVar3 = this.f321547e;
        iw1.f fVar4 = fVar3.f321552e;
        mw1.b bVar2 = ((lw1.i) this.f321546d).f321558a;
        fVar3.getClass();
        if (fVar4 != null && (hVar = fVar4.f295208e) != null) {
            rs0.g gVar = rs0.i.f399296a;
            android.opengl.EGLDisplay eGLDisplay3 = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface4 = bVar2.f331692c;
            if (eGLSurface4 == null) {
                eGLSurface4 = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            gVar.x(eGLDisplay3, eGLSurface4);
        }
        ((lw1.i) this.f321546d).f321558a.a();
    }
}
