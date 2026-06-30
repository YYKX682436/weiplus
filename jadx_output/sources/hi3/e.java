package hi3;

/* loaded from: classes13.dex */
public class e implements android.opengl.GLSurfaceView.EGLContextFactory {
    public e(com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView) {
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCameraGLSurfaceView", "creating OpenGL ES 2.0 context");
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
