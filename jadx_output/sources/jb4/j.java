package jb4;

/* loaded from: classes14.dex */
public class j extends java.lang.Thread {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f298809x = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f298810d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298811e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298812f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298813g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f298814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f298815i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f298816m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f298817n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f298822s;

    /* renamed from: v, reason: collision with root package name */
    public jb4.i f298825v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.ref.WeakReference f298826w;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f298823t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f298824u = true;

    /* renamed from: o, reason: collision with root package name */
    public int f298818o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f298819p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f298821r = true;

    /* renamed from: q, reason: collision with root package name */
    public int f298820q = 1;

    public j(java.lang.ref.WeakReference weakReference) {
        this.f298826w = weakReference;
    }

    public int a() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
        synchronized (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r) {
            try {
                i17 = this.f298820q;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb4.j.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r4.f298820q != 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r4 = this;
            java.lang.String r0 = "readyToDraw"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r4.f298812f
            if (r2 == 0) goto L22
            boolean r2 = r4.f298813g
            if (r2 != 0) goto L22
            int r2 = r4.f298818o
            if (r2 <= 0) goto L22
            int r2 = r4.f298819p
            if (r2 <= 0) goto L22
            boolean r2 = r4.f298821r
            r3 = 1
            if (r2 != 0) goto L23
            int r2 = r4.f298820q
            if (r2 != r3) goto L22
            goto L23
        L22:
            r3 = 0
        L23:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jb4.j.c():boolean");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestExitAndWait", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
        jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
        synchronized (kVar) {
            try {
                this.f298810d = true;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
                kVar.notifyAll();
                while (!this.f298811e) {
                    try {
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestExitAndWait", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestExitAndWait", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
    }

    public void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        if (i17 < 0 || i17 > 1) {
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("renderMode");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            throw illegalArgumentException;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
        jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
        synchronized (kVar) {
            try {
                this.f298820q = i17;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
                kVar.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        if (this.f298815i) {
            jb4.i iVar = this.f298825v;
            iVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            if (iVar.f298808f != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView gLTextureView = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) iVar.f298803a.get();
                if (gLTextureView != null) {
                    jb4.k kVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    jb4.g gVar = gLTextureView.f165896i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    javax.microedition.khronos.egl.EGL10 egl10 = iVar.f298804b;
                    javax.microedition.khronos.egl.EGLDisplay eGLDisplay = iVar.f298805c;
                    javax.microedition.khronos.egl.EGLContext eGLContext = iVar.f298808f;
                    ((jb4.d) gVar).getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        java.util.Objects.toString(eGLDisplay);
                        java.util.Objects.toString(eGLContext);
                        int eglGetError = egl10.eglGetError();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("throwEglException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(jb4.i.d("eglDestroyContex", eglGetError));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("throwEglException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                        throw runtimeException;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
                }
                iVar.f298808f = null;
            }
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = iVar.f298805c;
            if (eGLDisplay2 != null) {
                iVar.f298804b.eglTerminate(eGLDisplay2);
                iVar.f298805c = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            this.f298815i = false;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
            jb4.k kVar2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            if (kVar2.f298830d == this) {
                kVar2.f298830d = null;
            }
            kVar2.notifyAll();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopEglSurfaceLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        if (this.f298816m) {
            this.f298816m = false;
            jb4.i iVar = this.f298825v;
            iVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            iVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopEglSurfaceLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        setName("GLThread " + getId());
        try {
            b();
        } catch (java.lang.InterruptedException unused) {
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r.c(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            throw th6;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.a();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f165890r.c(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
    }
}
