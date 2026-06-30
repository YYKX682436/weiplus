package fj3;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj3.f f263193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f263194e;

    public b(fj3.f fVar, android.opengl.EGLContext eGLContext) {
        this.f263193d = fVar;
        this.f263194e = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        android.opengl.EGLContext eGLContext = this.f263194e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(rs0.i.f399296a.m(null, null, 1, 1, eGLContext));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        rs0.h hVar = null;
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        rs0.h hVar2 = (rs0.h) m521constructorimpl;
        fj3.f fVar = this.f263193d;
        if (hVar2 != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar2.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar2.f399293b;
            android.opengl.EGLSurface eGLSurface2 = eGLSurface == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, hVar2.f399294c);
            com.tencent.mars.xlog.Log.i(fVar.f263199a, "eglMakeCurrent");
            hVar = hVar2;
        } else {
            ((android.os.Handler) ((jz5.n) fVar.f263202d).getValue()).post(new fj3.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f263201c).getValue()).quitSafely();
            com.tencent.mars.xlog.Log.e(fVar.f263199a, "create gl environment error");
        }
        fVar.f263203e = hVar;
        fVar.f263200b = true;
    }
}
