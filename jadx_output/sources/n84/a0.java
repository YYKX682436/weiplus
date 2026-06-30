package n84;

/* loaded from: classes14.dex */
public abstract class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f335660d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f335661e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f335662f;

    /* renamed from: g, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f335663g;

    /* renamed from: h, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f335664h;

    /* renamed from: i, reason: collision with root package name */
    public int f335665i;

    /* renamed from: m, reason: collision with root package name */
    public int f335666m;

    /* renamed from: q, reason: collision with root package name */
    public n84.z f335670q;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f335668o = false;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f335669p = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f335667n = true;

    public a0(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f335660d = surfaceTexture;
        this.f335665i = i17;
        this.f335666m = i18;
    }

    public abstract boolean a();

    public abstract void b();

    public final void c() {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f335661e = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f335662f = eglGetDisplay;
        this.f335661e.eglInitialize(eglGetDisplay, new int[2]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        int[] iArr = new int[1];
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenGLConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenGLConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        if (!this.f335661e.eglChooseConfig(this.f335662f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("Failed to choose config: " + android.opengl.GLUtils.getEGLErrorString(this.f335661e.eglGetError()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            throw illegalArgumentException;
        }
        if (iArr[0] > 0) {
            eGLConfig = eGLConfigArr[0];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseEglConfig", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            eGLConfig = null;
        }
        javax.microedition.khronos.egl.EGL10 egl102 = this.f335661e;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f335662f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f335663g = eglCreateContext;
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f335661e.eglCreateWindowSurface(this.f335662f, eGLConfig, this.f335660d, null);
        this.f335664h = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null || eglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("GL Error: " + android.opengl.GLUtils.getEGLErrorString(this.f335661e.eglGetError()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            throw runtimeException;
        }
        if (this.f335661e.eglMakeCurrent(this.f335662f, eglCreateWindowSurface, eglCreateWindowSurface, this.f335663g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("GL Make current error: " + android.opengl.GLUtils.getEGLErrorString(this.f335661e.eglGetError()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        throw runtimeException2;
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f335667n = false;
        this.f335668o = false;
        synchronized (this.f335669p) {
            try {
                this.f335669p.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        this.f335668o = false;
        synchronized (this.f335669p) {
            try {
                this.f335669p.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        try {
            c();
            if (this.f335670q != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                n84.w.e("AdAlphaPlayerView", "onOpenGLInit");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z17 = false;
        } catch (java.lang.Throwable th6) {
            n84.w.c("TextureSurfaceRenderer", "initGL failed", th6);
            if (this.f335670q != null) {
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView) this.f335670q;
                adAlphaPlayerView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                n84.w.b("AdAlphaPlayerView", "onOpenGLInitFailed");
                n84.x.a().b(new n84.s(adAlphaPlayerView));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryInitOpenGL", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        try {
            b();
            n84.z zVar = this.f335670q;
            if (zVar != null) {
                ((com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView) zVar).c();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z18 = false;
        } catch (java.lang.Throwable th7) {
            n84.w.c("TextureSurfaceRenderer", "initGLComponents failed", th7);
            if (this.f335670q != null) {
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView2 = (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView) this.f335670q;
                adAlphaPlayerView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLComponentsInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                n84.w.b("AdAlphaPlayerView", "onOpenGLComponentsInitFailed");
                n84.x.a().b(new n84.d(adAlphaPlayerView2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsInitFailed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryInitOpenGLComponent", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            z18 = true;
        }
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            return;
        }
        n84.w.a("TextureSurfaceRenderer", "OpenGL init OK.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        synchronized (this.f335669p) {
            while (this.f335667n) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (a()) {
                        this.f335661e.eglSwapBuffers(this.f335662f, this.f335664h);
                    }
                    long currentTimeMillis2 = 32 - (java.lang.System.currentTimeMillis() - currentTimeMillis);
                    if (currentTimeMillis2 > 0) {
                        try {
                            if (this.f335668o) {
                                this.f335669p.wait(300L);
                            } else {
                                this.f335669p.wait(currentTimeMillis2);
                            }
                        } catch (java.lang.InterruptedException e17) {
                            n84.w.d("TextureSurfaceRenderer", e17);
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                    throw th8;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loopDraw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        n84.v vVar = (n84.v) this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        android.opengl.GLES20.glDeleteTextures(1, vVar.f335693t, 0);
        android.opengl.GLES20.glDeleteProgram(vVar.f335694u);
        vVar.f335697x.release();
        vVar.f335697x.setOnFrameAvailableListener(null);
        n84.w.a("AlphaTextureRenderer", "releaseGLComponents");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        n84.z zVar2 = this.f335670q;
        if (zVar2 != null) {
            ((com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView) zVar2).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLComponentsRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.w.e("AdAlphaPlayerView", "onOpenGLComponentsRelease");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        javax.microedition.khronos.egl.EGL10 egl10 = this.f335661e;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f335662f;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        this.f335661e.eglDestroySurface(this.f335662f, this.f335664h);
        this.f335661e.eglDestroyContext(this.f335662f, this.f335663g);
        this.f335661e.eglTerminate(this.f335662f);
        n84.w.a("TextureSurfaceRenderer", "OpenGL deinit OK.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseGLContext", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
        n84.z zVar3 = this.f335670q;
        if (zVar3 != null) {
            ((com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView) zVar3).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.w.e("AdAlphaPlayerView", "onOpenGLRelease");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLRelease", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        n84.w.a("TextureSurfaceRenderer", "OpenGL loop end.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
    }
}
