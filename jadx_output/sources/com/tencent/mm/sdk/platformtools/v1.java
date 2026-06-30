package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public int f193033a = 2048;

    /* renamed from: b, reason: collision with root package name */
    public android.opengl.EGLDisplay f193034b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f193035c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLContext f193036d;

    public v1(com.tencent.mm.sdk.platformtools.t1 t1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GPU_TAG", "pennqin, init Help30Impl.");
    }

    public final void a() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.f193034b = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GPU_TAG", "EGL_NO_DISPLAY");
            return;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GPU_TAG", "eglInitialize");
            return;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGLDisplay eGLDisplay = this.f193034b;
        android.opengl.EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        this.f193036d = android.opengl.EGL14.eglCreateContext(this.f193034b, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.f193034b, eGLConfigArr[0], new int[]{12344}, 0);
        this.f193035c = eglCreatePbufferSurface;
        android.opengl.EGL14.eglMakeCurrent(this.f193034b, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f193036d);
    }

    public final void b() {
        android.opengl.EGLDisplay eGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        android.opengl.EGLDisplay eGLDisplay2 = this.f193034b;
        if (eGLDisplay != eGLDisplay2) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGL14.eglDestroySurface(this.f193034b, this.f193035c);
            android.opengl.EGL14.eglDestroyContext(this.f193034b, this.f193036d);
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.f193034b);
        }
        this.f193034b = android.opengl.EGL14.EGL_NO_DISPLAY;
        this.f193036d = android.opengl.EGL14.EGL_NO_CONTEXT;
        this.f193035c = android.opengl.EGL14.EGL_NO_SURFACE;
    }
}
