package ft0;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final et0.r f266460a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f266461b;

    /* renamed from: c, reason: collision with root package name */
    public ms0.c f266462c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLContext f266463d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f266464e;

    /* renamed from: f, reason: collision with root package name */
    public final int f266465f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f266466g;

    public d(et0.r view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f266460a = view;
        this.f266461b = "MicroMsg.AbsPreviewController";
        this.f266465f = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        this.f266466g = new java.lang.Object();
    }

    public static /* synthetic */ void h(ft0.d dVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        dVar.g(z17, z18);
    }

    public di3.o a() {
        return null;
    }

    public final android.graphics.SurfaceTexture b() {
        android.graphics.SurfaceTexture surfaceTexture;
        ms0.c cVar = this.f266462c;
        if (cVar == null) {
            return null;
        }
        synchronized (cVar) {
            surfaceTexture = cVar.f330953i;
        }
        return surfaceTexture;
    }

    public final is0.c c() {
        ms0.c cVar = this.f266462c;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public final void d(javax.microedition.khronos.opengles.GL10 gl10) {
        ms0.c cVar = this.f266462c;
        if (cVar != null) {
            cVar.onDrawFrame(gl10);
        }
    }

    public final void e(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        ms0.c cVar = this.f266462c;
        if (cVar != null) {
            cVar.onSurfaceChanged(gl10, i17, i18);
        }
    }

    public final void f(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        this.f266463d = android.opengl.EGL14.eglGetCurrentContext();
        android.opengl.EGL14.eglGetCurrentSurface(12377);
        ms0.c cVar = this.f266462c;
        if (cVar != null) {
            cVar.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    public final void g(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i(this.f266461b, "release, needPostRenderThread:" + z17 + ", block:" + z18);
        ft0.b bVar = new ft0.b(this, z17, z18);
        if (!z17) {
            bVar.invoke();
            return;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i(this.f266461b, "start post release");
        this.f266460a.l(bVar);
        if (z18) {
            synchronized (this.f266466g) {
                try {
                    this.f266466g.wait(100L);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(this.f266461b, e17, "wait release error", new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.i(this.f266461b, "wait release finished cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    public void i(ms0.c renderer) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        this.f266462c = renderer;
        renderer.f330962r = new ft0.c(this, renderer);
    }

    public void j(ts0.c cameraConfig) {
        kotlin.jvm.internal.o.g(cameraConfig, "cameraConfig");
        int i17 = 0;
        com.tencent.mm.sdk.platformtools.Log.c(this.f266461b, "updateCameraConfig: " + cameraConfig, new java.lang.Object[0]);
        android.graphics.Point point = new android.graphics.Point(ts0.c.f421543c, ts0.c.f421542b);
        ms0.c cVar = this.f266462c;
        if (cVar != null) {
            cVar.u(point.x, point.y);
        }
        ms0.c cVar2 = this.f266462c;
        if (cVar2 != null) {
            int i18 = ts0.c.f421545e;
            if (i18 == -1) {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                i18 = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
            }
            if (i18 != 0) {
                if (i18 == 1) {
                    i17 = 90;
                } else if (i18 == 2) {
                    i17 = 180;
                } else if (i18 == 3) {
                    i17 = 270;
                }
            }
            int i19 = ts0.c.f421544d - i17;
            int i27 = this.f266465f;
            cVar2.r((i19 + i27) % i27);
        }
        ms0.c cVar3 = this.f266462c;
        if (cVar3 != null) {
            cVar3.m(ts0.c.f421548h);
        }
    }
}
