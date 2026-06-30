package ns0;

/* loaded from: classes13.dex */
public final class b implements android.opengl.GLSurfaceView.EGLContextFactory {
    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig eglConfig) {
        kotlin.jvm.internal.o.g(egl, "egl");
        kotlin.jvm.internal.o.g(display, "display");
        kotlin.jvm.internal.o.g(eglConfig, "eglConfig");
        com.tencent.mars.xlog.Log.w("MicroMsg.RenderContextFactory", "creating OpenGL ES 2.0 context");
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl.eglCreateContext(display, eglConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, com.tencent.mm.sdk.platformtools.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3), 12344});
        kotlin.jvm.internal.o.f(eglCreateContext, "eglCreateContext(...)");
        return eglCreateContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLContext context) {
        kotlin.jvm.internal.o.g(egl, "egl");
        kotlin.jvm.internal.o.g(display, "display");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.w("MicroMsg.RenderContextFactory", "destroyContext OpenGL ES 2.0 Context");
        egl.eglDestroyContext(display, context);
    }
}
