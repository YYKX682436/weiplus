package ew2;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew2.f f257034d;

    public c(ew2.f fVar) {
        this.f257034d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ew2.f fVar = this.f257034d;
        ew2.h hVar = fVar.f257047g;
        if (hVar != null) {
            hVar.f257062f.release();
            hVar.f257061e.release();
        }
        int i17 = fVar.f257046f;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[i17], 0);
            fVar.f257046f = 0;
        }
        if (!kotlin.jvm.internal.o.b(fVar.f257043c, android.opengl.EGL14.eglGetCurrentContext())) {
            ot5.g.d("FinderGLRender", "detachCurrent return for eglContext:" + fVar.f257043c + " current:" + android.opengl.EGL14.eglGetCurrentContext());
        } else if (kotlin.jvm.internal.o.b(fVar.f257045e, android.opengl.EGL14.EGL_NO_SURFACE)) {
            ot5.g.d("FinderGLRender", "detachCurrent return for eglSurface");
        } else {
            android.opengl.EGLDisplay eGLDisplay = fVar.f257044d;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                throw new android.opengl.GLException(android.opengl.EGL14.eglGetError(), "eglDetachCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
            }
        }
        if (!kotlin.jvm.internal.o.b(fVar.f257045e, android.opengl.EGL14.EGL_NO_SURFACE)) {
            android.opengl.EGL14.eglDestroySurface(fVar.f257044d, fVar.f257045e);
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            kotlin.jvm.internal.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            fVar.f257045e = EGL_NO_SURFACE;
        }
        if (!kotlin.jvm.internal.o.b(fVar.f257043c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            android.opengl.EGL14.eglDestroyContext(fVar.f257044d, fVar.f257043c);
        }
        android.opengl.EGL14.eglReleaseThread();
        android.opengl.EGL14.eglTerminate(fVar.f257044d);
    }
}
