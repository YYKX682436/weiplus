package go0;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.opengl.EGLContext f273874a;

    /* renamed from: b, reason: collision with root package name */
    public int f273875b;

    /* renamed from: c, reason: collision with root package name */
    public int f273876c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f273877d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f273878e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f273879f;

    /* renamed from: g, reason: collision with root package name */
    public go0.b1 f273880g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.SurfaceTexture f273881h;

    /* renamed from: i, reason: collision with root package name */
    public go0.q0 f273882i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.q f273883j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.Surface f273884k;

    /* renamed from: l, reason: collision with root package name */
    public rs0.h f273885l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f273886m;

    public v0(android.opengl.EGLContext eGLContext, int i17, int i18, yz5.l init) {
        kotlin.jvm.internal.o.g(init, "init");
        this.f273874a = eGLContext;
        this.f273875b = i17;
        this.f273876c = i18;
        this.f273877d = init;
        java.lang.String str = "LiveScreenShareRender" + hashCode();
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, 10);
        this.f273879f = a17;
        this.f273882i = go0.q0.f273818e;
        com.tencent.mars.xlog.Log.i("LiveScreenShareRender", "eglContext:" + eGLContext + ", device size is " + this.f273875b + " and " + this.f273876c);
        a17.start();
        this.f273878e = new android.os.Handler(a17.getLooper());
        c(new go0.p0(this));
    }

    public static final void a(go0.v0 v0Var) {
        is0.c cVar;
        yz5.q qVar;
        v0Var.f273886m = true;
        synchronized (v0Var) {
            try {
                if (v0Var.f273886m) {
                    v0Var.f273886m = false;
                    try {
                        android.graphics.SurfaceTexture surfaceTexture = v0Var.f273881h;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                        }
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.i("LiveScreenShareRender", "render Image update");
                    }
                }
                v0Var.b();
                go0.b1 b1Var = v0Var.f273880g;
                if (b1Var != null) {
                    b1Var.o();
                }
                rs0.h hVar = v0Var.f273885l;
                if (hVar != null) {
                    android.opengl.EGL14.eglSwapBuffers(hVar.f399292a, hVar.f399293b);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("LiveScreenShareRender", "render error in " + e17);
            }
        }
        go0.b1 b1Var2 = v0Var.f273880g;
        if (b1Var2 == null || (cVar = b1Var2.f348000i) == null || (qVar = v0Var.f273883j) == null) {
            return;
        }
        qVar.invoke(java.lang.Integer.valueOf(cVar.f294395e), java.lang.Integer.valueOf(v0Var.f273875b), java.lang.Integer.valueOf(v0Var.f273876c));
    }

    public final void b() {
        rs0.h hVar = this.f273885l;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar.f399293b;
            if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f399294c)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("LiveScreenShareRender", "makeEGLCurrent failed ");
        }
    }

    public final void c(final yz5.a aVar) {
        if (!this.f273879f.isAlive()) {
            com.tencent.mars.xlog.Log.e("LiveScreenShareRender", "queue in error");
        } else {
            this.f273878e.post(new java.lang.Runnable(aVar) { // from class: go0.r0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f273833d;

                {
                    kotlin.jvm.internal.o.g(aVar, "function");
                    this.f273833d = aVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f273833d.invoke();
                }
            });
        }
    }

    public final void d(int i17, int i18) {
        go0.b1 b1Var = this.f273880g;
        if (b1Var != null) {
            b1Var.w(i17, i18);
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f273881h;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
        if (i17 > i18) {
            go0.b1 b1Var2 = this.f273880g;
            if (b1Var2 != null) {
                b1Var2.f348005n = 0;
            }
            if (b1Var2 != null) {
                b1Var2.f348007p = true;
            }
            if (b1Var2 != null) {
                b1Var2.u(i17, i18);
            }
            go0.b1 b1Var3 = this.f273880g;
            if (b1Var3 != null) {
                b1Var3.t(i17, i18);
            }
        } else {
            go0.b1 b1Var4 = this.f273880g;
            if (b1Var4 != null) {
                b1Var4.f348005n = 0;
            }
            if (b1Var4 != null) {
                b1Var4.f348007p = true;
            }
            if (b1Var4 != null) {
                b1Var4.u(i17, i18);
            }
            go0.b1 b1Var5 = this.f273880g;
            if (b1Var5 != null) {
                b1Var5.t(i17, i18);
            }
        }
        this.f273875b = i17;
        this.f273876c = i18;
    }

    public final void e(int i17, android.util.Size drawSize, android.util.Size textureSize, android.graphics.Point point) {
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        kotlin.jvm.internal.o.g(textureSize, "textureSize");
        kotlin.jvm.internal.o.g(point, "point");
        if (this.f273880g != null) {
            c(new go0.s0(this, i17, textureSize, point, drawSize));
        }
    }

    public final void f(go0.q0 original) {
        kotlin.jvm.internal.o.g(original, "original");
        if (this.f273882i != original) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateRenderOriginal ");
            sb6.append(original);
            sb6.append(",Renderer info:");
            go0.b1 b1Var = this.f273880g;
            sb6.append(b1Var != null ? b1Var.C() : null);
            com.tencent.mars.xlog.Log.i("LiveScreenShareRender", sb6.toString());
            this.f273882i = original;
            go0.b1 b1Var2 = this.f273880g;
            if (b1Var2 != null) {
                b1Var2.P++;
            }
        }
    }
}
