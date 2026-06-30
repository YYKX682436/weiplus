package wq4;

/* loaded from: classes13.dex */
public class g implements wq4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.GLTextureView f448638a;

    public g(com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView, wq4.d dVar) {
        this.f448638a = gLTextureView;
    }

    @Override // wq4.j
    public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        int i17 = this.f448638a.f177038o;
        int[] iArr = {12440, i17, 12344};
        javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        if (i17 == 0) {
            iArr = null;
        }
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
    }

    @Override // wq4.j
    public void destroyContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        java.util.Objects.toString(eGLDisplay);
        java.util.Objects.toString(eGLContext);
        java.lang.Thread.currentThread().getId();
    }
}
