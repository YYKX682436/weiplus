package vu1;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f440189a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f440191c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f440192d;

    /* renamed from: e, reason: collision with root package name */
    public vu1.c f440193e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f440194f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f440195g;

    /* renamed from: h, reason: collision with root package name */
    public vu1.b f440196h;

    /* renamed from: i, reason: collision with root package name */
    public os0.c f440197i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.SurfaceTexture f440198j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.Surface f440199k;

    /* renamed from: l, reason: collision with root package name */
    public rs0.h f440200l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f440201m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f440202n;

    /* renamed from: o, reason: collision with root package name */
    public long f440203o;

    /* renamed from: p, reason: collision with root package name */
    public long f440204p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f440205q;

    public h(int i17, int i18, int i19) {
        boolean fj6;
        this.f440189a = i17;
        this.f440190b = i18;
        this.f440191c = i19;
        java.lang.String str = "MicroMsg.ScreenCastRenderMgr" + hashCode();
        int i27 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, 10);
        this.f440195g = a17;
        int i28 = wo.v1.f447833m.f447766x;
        if (i28 == -1) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true);
        } else if (i28 == 1) {
            fj6 = true;
        } else if (i28 != 2) {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true);
        } else {
            fj6 = false;
        }
        this.f440201m = fj6;
        a17.start();
        this.f440194f = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        this.f440203o = -1L;
        this.f440204p = -1L;
        this.f440205q = new com.tencent.mm.sdk.platformtools.b4("ScreenCastRenderTimer", (com.tencent.mm.sdk.platformtools.a4) new vu1.e(this), true);
    }

    public final void a() {
        rs0.h hVar = this.f440200l;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar.f399293b;
            if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f399294c)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastRenderMgr", "makeEGLCurrent faild ");
        }
    }

    public final void b(final yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f440195g.isAlive()) {
            this.f440194f.post(new java.lang.Runnable(callback) { // from class: vu1.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f440187d;

                {
                    kotlin.jvm.internal.o.g(callback, "function");
                    this.f440187d = callback;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f440187d.invoke();
                }
            });
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastRenderMgr", "queue in error");
        }
    }

    public final void c() {
        android.hardware.display.VirtualDisplay virtualDisplay;
        boolean z17 = this.f440201m;
        int i17 = this.f440190b;
        int i18 = this.f440189a;
        if (z17) {
            this.f440197i = new os0.c(this.f440189a, this.f440190b, 0, 0, 0, 0, 60, null);
            is0.c cVar = new is0.c(false, 20L);
            os0.c cVar2 = this.f440197i;
            if (cVar2 != null) {
                cVar2.H = cVar.f294395e;
            }
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f294395e);
            this.f440198j = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(i18, i17);
            android.graphics.SurfaceTexture surfaceTexture2 = this.f440198j;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new vu1.g(this));
            }
            this.f440199k = new android.view.Surface(this.f440198j);
        } else {
            vu1.b bVar = new vu1.b(i18, i17);
            this.f440196h = bVar;
            android.os.Looper looper = this.f440194f.getLooper();
            kotlin.jvm.internal.o.f(looper, "getLooper(...)");
            android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i18, i17, 1, 1);
            bVar.f440179c = newInstance;
            if (newInstance != null) {
                newInstance.setOnImageAvailableListener(new vu1.a(bVar), new android.os.Handler(looper));
            }
            android.media.ImageReader imageReader = bVar.f440179c;
            bVar.f440180d = imageReader != null ? imageReader.getSurface() : null;
            vu1.b bVar2 = this.f440196h;
            this.f440199k = bVar2 != null ? bVar2.f440180d : null;
        }
        android.view.Surface surface = this.f440199k;
        if (surface != null) {
            vu1.c cVar3 = this.f440193e;
            if (cVar3 != null && (virtualDisplay = ((tu1.c) cVar3).f422090a.f422112c) != null) {
                virtualDisplay.setSurface(surface);
            }
            long j17 = 1000 / this.f440191c;
            this.f440205q.c(j17, j17);
        }
    }
}
