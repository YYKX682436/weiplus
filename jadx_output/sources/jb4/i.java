package jb4;

/* loaded from: classes14.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f298803a;

    /* renamed from: b, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f298804b;

    /* renamed from: c, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f298805c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f298806d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f298807e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f298808f;

    public i(java.lang.ref.WeakReference weakReference) {
        this.f298803a = weakReference;
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatEglError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        java.lang.String str2 = str + " failed: " + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatEglError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        return str2;
    }

    public javax.microedition.khronos.opengles.GL a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createGL", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        javax.microedition.khronos.opengles.GL gl6 = this.f298808f.getGL();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) this.f298803a.get();
        if (gLTextureView != null) {
            jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int i17 = gLTextureView.f165898n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            if ((i17 & 3) != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i18 = gLTextureView.f165898n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i19 = (i18 & 1) == 0 ? 0 : 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i27 = gLTextureView.f165898n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                gl6 = android.opengl.GLDebugHelper.wrap(gl6, i19, (i27 & 2) != 0 ? new jb4.m() : null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createGL", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        return gl6;
    }

    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        if (this.f298804b == null) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("egl not initialized");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException;
        }
        if (this.f298805c == null) {
            java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("eglDisplay not initialized");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException2;
        }
        if (this.f298807e == null) {
            java.lang.RuntimeException runtimeException3 = new java.lang.RuntimeException("eglConfig not initialized");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException3;
        }
        c();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) this.f298803a.get();
        javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
        if (gLTextureView != null) {
            jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            jb4.h hVar = gLTextureView.f165897m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            javax.microedition.khronos.egl.EGL10 egl10 = this.f298804b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f298805c;
            javax.microedition.khronos.egl.EGLConfig eGLConfig = this.f298807e;
            android.graphics.SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
            ((jb4.e) hVar).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createWindowSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
            } catch (java.lang.IllegalArgumentException unused) {
                jb4.k kVar2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createWindowSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
            this.f298806d = eGLSurface;
        } else {
            this.f298806d = null;
        }
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f298806d;
        if (eGLSurface2 == null || eGLSurface2 == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.f298804b.eglGetError();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            return false;
        }
        if (this.f298804b.eglMakeCurrent(this.f298805c, eGLSurface2, eGLSurface2, this.f298808f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            return true;
        }
        int eglGetError = this.f298804b.eglGetError();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        d("eglMakeCurrent", eglGetError);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        return false;
    }

    public final void c() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroySurfaceImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f298806d;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            this.f298804b.eglMakeCurrent(this.f298805c, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) this.f298803a.get();
            if (gLTextureView != null) {
                jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                jb4.h hVar = gLTextureView.f165897m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                javax.microedition.khronos.egl.EGL10 egl10 = this.f298804b;
                javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f298805c;
                javax.microedition.khronos.egl.EGLSurface eGLSurface3 = this.f298806d;
                ((jb4.e) hVar).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
            }
            this.f298806d = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroySurfaceImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
    }

    public void e() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        java.lang.String str4;
        javax.microedition.khronos.egl.EGL10 egl10;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        javax.microedition.khronos.egl.EGL10 egl102 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f298804b = egl102;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl102.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f298805c = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("eglGetDisplay failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException;
        }
        if (!this.f298804b.eglInitialize(eglGetDisplay, new int[2])) {
            java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("eglInitialize failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException2;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) this.f298803a.get();
        java.lang.String str5 = "createContext";
        if (gLTextureView == null) {
            this.f298807e = null;
            this.f298808f = null;
            str = "start";
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper";
            str4 = "createContext";
        } else {
            jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            jb4.f fVar = gLTextureView.f165895h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            javax.microedition.khronos.egl.EGL10 egl103 = this.f298804b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f298805c;
            jb4.b bVar = (jb4.b) fVar;
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
            int[] iArr = new int[1];
            str = "start";
            if (!egl103.eglChooseConfig(eGLDisplay, bVar.f298771a, null, 0, iArr)) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("eglChooseConfig failed");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException;
            }
            int i17 = iArr[0];
            if (i17 <= 0) {
                java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("No configs match configSpec");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException2;
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i17];
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper";
            int i18 = i17;
            if (!egl103.eglChooseConfig(eGLDisplay, bVar.f298771a, eGLConfigArr, i17, iArr)) {
                java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException3;
            }
            jb4.c cVar = (jb4.c) bVar;
            java.lang.String str6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    str3 = str5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", str6);
                    eGLConfig = null;
                    break;
                }
                javax.microedition.khronos.egl.EGLConfig eGLConfig2 = eGLConfigArr[i19];
                javax.microedition.khronos.egl.EGL10 egl104 = egl103;
                int i27 = i19;
                int i28 = i18;
                java.lang.String str7 = str6;
                int a17 = cVar.a(egl104, eGLDisplay, eGLConfig2, 12325, 0);
                str3 = str5;
                int a18 = cVar.a(egl104, eGLDisplay, eGLConfig2, 12326, 0);
                if (a17 >= cVar.f298780h && a18 >= cVar.f298781i) {
                    javax.microedition.khronos.egl.EGL10 egl105 = egl103;
                    int a19 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12324, 0);
                    int a27 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12323, 0);
                    int a28 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12322, 0);
                    egl10 = egl103;
                    int a29 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12321, 0);
                    if (a19 == cVar.f298776d && a27 == cVar.f298777e && a28 == cVar.f298778f && a29 == cVar.f298779g) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", str7);
                        eGLConfig = eGLConfig2;
                        break;
                    }
                } else {
                    egl10 = egl103;
                }
                i19 = i27 + 1;
                str6 = str7;
                i18 = i28;
                egl103 = egl10;
                str5 = str3;
            }
            if (eGLConfig == null) {
                java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("No config chosen");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
            this.f298807e = eGLConfig;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            jb4.g gVar = gLTextureView.f165896i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            javax.microedition.khronos.egl.EGL10 egl106 = this.f298804b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f298805c;
            javax.microedition.khronos.egl.EGLConfig eGLConfig3 = this.f298807e;
            jb4.d dVar = (jb4.d) gVar;
            dVar.getClass();
            str4 = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView2 = dVar.f298783a;
            int i29 = gLTextureView2.f165899o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int[] iArr2 = {12440, i29, 12344};
            javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int i37 = gLTextureView2.f165899o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            if (i37 == 0) {
                iArr2 = null;
            }
            javax.microedition.khronos.egl.EGLContext eglCreateContext = egl106.eglCreateContext(eGLDisplay2, eGLConfig3, eGLContext, iArr2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
            this.f298808f = eglCreateContext;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext2 = this.f298808f;
        if (eGLContext2 != null && eGLContext2 != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            this.f298806d = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
            return;
        }
        java.lang.String str8 = str2;
        this.f298808f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("throwEglException", str8);
        int eglGetError = this.f298804b.eglGetError();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("throwEglException", str8);
        java.lang.RuntimeException runtimeException3 = new java.lang.RuntimeException(d(str4, eglGetError));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("throwEglException", str8);
        throw runtimeException3;
    }
}
