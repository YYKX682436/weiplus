package wq4;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f448657a;

    /* renamed from: b, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f448658b;

    /* renamed from: c, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f448659c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f448660d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f448661e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f448662f;

    public l(java.lang.ref.WeakReference weakReference) {
        this.f448657a = weakReference;
    }

    public static java.lang.String c(java.lang.String str, int i17) {
        return str + " failed: " + i17;
    }

    public boolean a() {
        java.lang.Thread.currentThread().getId();
        if (this.f448658b == null) {
            throw new java.lang.RuntimeException("egl not initialized");
        }
        if (this.f448659c == null) {
            throw new java.lang.RuntimeException("eglDisplay not initialized");
        }
        if (this.f448661e == null) {
            throw new java.lang.RuntimeException("eglConfig not initialized");
        }
        b();
        com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView = (com.tencent.mm.plugin.voip.video.GLTextureView) this.f448657a.get();
        javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
        if (gLTextureView == null || gLTextureView.getSurfaceTexture() == null) {
            this.f448660d = null;
        } else {
            wq4.k kVar = gLTextureView.f177036m;
            javax.microedition.khronos.egl.EGL10 egl10 = this.f448658b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f448659c;
            javax.microedition.khronos.egl.EGLConfig eGLConfig = this.f448661e;
            android.graphics.SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
            ((wq4.h) kVar).getClass();
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
            } catch (java.lang.IllegalArgumentException unused) {
                wq4.n nVar = com.tencent.mm.plugin.voip.video.GLTextureView.f177029r;
            }
            this.f448660d = eGLSurface;
        }
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f448660d;
        if (eGLSurface2 == null || eGLSurface2 == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.f448658b.eglGetError();
            return false;
        }
        if (this.f448658b.eglMakeCurrent(this.f448659c, eGLSurface2, eGLSurface2, this.f448662f)) {
            return true;
        }
        c("eglMakeCurrent", this.f448658b.eglGetError());
        return false;
    }

    public final void b() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f448660d;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.f448658b.eglMakeCurrent(this.f448659c, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView = (com.tencent.mm.plugin.voip.video.GLTextureView) this.f448657a.get();
        if (gLTextureView != null) {
            wq4.k kVar = gLTextureView.f177036m;
            javax.microedition.khronos.egl.EGL10 egl10 = this.f448658b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f448659c;
            javax.microedition.khronos.egl.EGLSurface eGLSurface3 = this.f448660d;
            ((wq4.h) kVar).getClass();
            egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
        }
        this.f448660d = null;
    }

    public void d() {
        java.lang.Thread.currentThread().getId();
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f448658b = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f448659c = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("eglGetDisplay failed");
        }
        if (!this.f448658b.eglInitialize(eglGetDisplay, new int[2])) {
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView = (com.tencent.mm.plugin.voip.video.GLTextureView) this.f448657a.get();
        if (gLTextureView == null) {
            this.f448661e = null;
            this.f448662f = null;
        } else {
            javax.microedition.khronos.egl.EGLConfig chooseConfig = gLTextureView.f177034h.chooseConfig(this.f448658b, this.f448659c);
            this.f448661e = chooseConfig;
            this.f448662f = gLTextureView.f177035i.createContext(this.f448658b, this.f448659c, chooseConfig);
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f448662f;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            this.f448662f = null;
            java.lang.String c17 = c("createContext", this.f448658b.eglGetError());
            java.lang.Thread.currentThread().getId();
            throw new java.lang.RuntimeException(c17);
        }
        java.util.Objects.toString(eGLContext);
        java.lang.Thread.currentThread().getId();
        this.f448660d = null;
    }
}
