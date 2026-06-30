package iw1;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw1.f f295198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f295199e;

    public b(iw1.f fVar, android.opengl.EGLContext eGLContext) {
        this.f295198d = fVar;
        this.f295199e = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        android.opengl.EGLContext eGLContext = this.f295199e;
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
        iw1.f fVar = this.f295198d;
        if (hVar2 != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar2.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar2.f399293b;
            android.opengl.EGLSurface eGLSurface2 = eGLSurface == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, hVar2.f399294c);
            com.tencent.mars.xlog.Log.i(fVar.f295204a, "eglMakeCurrent");
            hVar = hVar2;
        } else {
            ((android.os.Handler) ((jz5.n) fVar.f295207d).getValue()).post(new iw1.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f295206c).getValue()).quitSafely();
            com.tencent.mars.xlog.Log.e(fVar.f295204a, "create gl environment error");
        }
        fVar.f295208e = hVar;
        fVar.f295205b = true;
    }
}
