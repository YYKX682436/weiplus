package ls0;

/* loaded from: classes10.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final ms0.c f320847a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f320848b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.HandlerThread f320849c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f320850d;

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f320851e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f320852f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f320853g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.SurfaceTexture f320854h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f320855i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f320856j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Object f320857k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f320858l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f320859m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f320860n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f320861o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f320862p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f320863q;

    /* renamed from: r, reason: collision with root package name */
    public int f320864r;

    /* renamed from: s, reason: collision with root package name */
    public int f320865s;

    /* renamed from: t, reason: collision with root package name */
    public long f320866t;

    /* renamed from: u, reason: collision with root package name */
    public volatile long f320867u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f320868v;

    /* renamed from: w, reason: collision with root package name */
    public long f320869w;

    /* renamed from: x, reason: collision with root package name */
    public long f320870x;

    public k(ms0.c renderer) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        this.f320847a = renderer;
        this.f320848b = "MicroMsg.CodecInputSurface";
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("CodecInputSurface_renderThread", 5);
        this.f320849c = a17;
        this.f320857k = new java.lang.Object();
        this.f320862p = new java.lang.Object();
        this.f320864r = 33000000;
        a17.start();
        this.f320850d = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
    }

    public static final void a(ls0.k kVar, long j17, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        rs0.h hVar;
        kVar.getClass();
        try {
            if (!kVar.f320868v) {
                com.tencent.mars.xlog.Log.e(kVar.f320848b, "requestDraw not init now");
                return;
            }
            com.tencent.mars.xlog.Log.i(kVar.f320848b, "render pts:" + j17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            ms0.c cVar = kVar.f320847a;
            if (cVar instanceof ms0.d) {
                kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.media.render.MixRenderer");
                ((ms0.d) cVar).v(bitmap, bitmap2);
            }
            android.os.SystemClock.elapsedRealtime();
            android.graphics.SurfaceTexture surfaceTexture = kVar.f320854h;
            if (surfaceTexture != null) {
                surfaceTexture.getTimestamp();
            }
            if (kVar.f320854h != null && kVar.f320855i) {
                long j18 = kVar.f320869w;
                android.graphics.SurfaceTexture surfaceTexture2 = kVar.f320854h;
                java.lang.Long valueOf = surfaceTexture2 != null ? java.lang.Long.valueOf(surfaceTexture2.getTimestamp()) : null;
                kotlin.jvm.internal.o.d(valueOf);
                if (j18 > valueOf.longValue()) {
                    com.tencent.mars.xlog.Log.e(kVar.f320848b, "not stickily monotonic increase timestamp");
                    kVar.f320861o = false;
                    yz5.a aVar = kVar.f320863q;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
            }
            android.graphics.SurfaceTexture surfaceTexture3 = kVar.f320854h;
            kVar.f320867u = surfaceTexture3 != null ? surfaceTexture3.getTimestamp() : 0L;
            android.os.SystemClock.elapsedRealtime();
            android.graphics.SurfaceTexture surfaceTexture4 = kVar.f320854h;
            if (surfaceTexture4 != null) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(surfaceTexture4.getTimestamp());
                kotlin.jvm.internal.o.d(valueOf2);
                long longValue = valueOf2.longValue();
                android.graphics.SurfaceTexture surfaceTexture5 = kVar.f320854h;
                if (surfaceTexture5 != null && kVar.f320869w == surfaceTexture5.getTimestamp()) {
                    com.tencent.mars.xlog.Log.i(kVar.f320848b, "same frame timestamp!!");
                } else {
                    j17 = longValue;
                }
                kVar.f320869w = j17;
                if (kVar.f320853g != null) {
                    long j19 = kVar.f320866t;
                    if (j19 > 0) {
                        j17 -= j19 * 1000000;
                    }
                    kVar.i(j17);
                }
            } else if (kVar.f320853g != null) {
                long j27 = kVar.f320866t;
                if (j27 > 0) {
                    j17 -= j27 * 1000000;
                }
                kVar.i(j17);
            }
            if (kVar.f320853g != null && (hVar = kVar.f320851e) != null) {
                rs0.i.f399296a.x(hVar.f399292a, hVar.f399293b);
            }
            android.os.SystemClock.elapsedRealtime();
            yz5.l lVar = kVar.f320852f;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(kVar.f320848b, e17, "", new java.lang.Object[0]);
            yz5.l lVar2 = kVar.f320852f;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
    }

    public final void b(android.view.Surface surface, boolean z17, int i17, int i18, long j17, yz5.l lVar) {
        this.f320853g = surface;
        java.lang.String str = this.f320848b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" initForRemuxer, surface:");
        sb6.append(surface);
        sb6.append(", callback:");
        sb6.append(lVar == null);
        sb6.append(", drawInOnFrameAvailable:");
        sb6.append(this.f320861o);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f320848b, "default use drawInFrameAvailable");
            h(true);
        } else {
            com.tencent.mars.xlog.Log.i(this.f320848b, "cannot use drawInFrameAvailable!");
            h(false);
        }
        this.f320865s = 0;
        this.f320866t = j17;
        d(new ls0.a(this, surface, i17, i18, lVar));
    }

    public final void c(android.view.Surface surface, android.opengl.EGLContext eGLContext, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f320853g = surface;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" initWithSurface, eglContext:");
        sb6.append(eGLContext);
        sb6.append(", surface:");
        sb6.append(surface);
        sb6.append(", waitNewFrame:");
        sb6.append(z17);
        sb6.append(", callback:");
        sb6.append(lVar == null);
        com.tencent.mars.xlog.Log.i(this.f320848b, sb6.toString());
        d(new ls0.c(eGLContext, this, surface, lVar));
    }

    public final void d(yz5.a aVar) {
        synchronized (this.f320857k) {
            if (!this.f320849c.isAlive() || this.f320856j) {
                com.tencent.mars.xlog.Log.e(this.f320848b, hashCode() + " queue already release");
            } else {
                this.f320850d.post(aVar != null ? new ls0.i(aVar) : null);
            }
        }
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i(this.f320848b, hashCode() + " release resources");
        ls0.d dVar = new ls0.d(this);
        synchronized (this.f320857k) {
            if (!this.f320849c.isAlive() || this.f320856j) {
                com.tencent.mars.xlog.Log.e(this.f320848b, hashCode() + " queueFirst already release");
            } else {
                this.f320850d.removeCallbacksAndMessages(null);
                this.f320850d.post(new ls0.i(dVar));
            }
        }
        synchronized (this.f320857k) {
            this.f320856j = true;
            this.f320868v = false;
        }
    }

    public final void f(yz5.l lVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDrawBlendBitmapProvider:");
        sb6.append(lVar != null ? lVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(this.f320848b, sb6.toString());
        this.f320858l = lVar;
    }

    public final void g(yz5.l lVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDrawBlurBgBitmapProvider:");
        sb6.append(lVar != null ? lVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(this.f320848b, sb6.toString());
        this.f320860n = lVar;
    }

    public final void h(boolean z17) {
        synchronized (this.f320862p) {
            this.f320861o = z17;
            com.tencent.mars.xlog.Log.i(this.f320848b, "setDrawInOnFrameAvailable:" + z17);
        }
    }

    public final void i(long j17) {
        rs0.h hVar = this.f320851e;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f399292a, hVar.f399293b, j17);
        }
        this.f320867u = j17;
        rs0.i.f399296a.d("eglPresentationTimeANDROID", "MicroMsg.GLEnvironmentUtil");
    }

    public final void j(android.media.MediaFormat mediaFormat) {
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        ms0.c cVar = this.f320847a;
        cVar.getClass();
        if (j62.e.g().l("clicfg_handle_media_format_change", true, true, true)) {
            if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                cVar.f330945a = mediaFormat.getInteger("width");
                int integer = mediaFormat.getInteger("height");
                cVar.f330946b = integer;
                os0.a aVar = cVar.f330951g;
                if (aVar != null) {
                    aVar.w(cVar.f330945a, integer);
                }
            }
            int i17 = cVar.f330946b;
            int i18 = cVar.f330945a;
            int integer2 = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
            int integer3 = mediaFormat.containsKey("crop-top") ? mediaFormat.getInteger("crop-top") : 0;
            if (mediaFormat.containsKey("crop-right")) {
                i18 = mediaFormat.getInteger("crop-right") + 1;
            }
            if (mediaFormat.containsKey("crop-bottom")) {
                i17 = mediaFormat.getInteger("crop-bottom") + 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "updateTextureSizeByMediaFormat:textureWidth->" + cVar.f330945a + " textureHeight->" + cVar.f330946b + " validLeft->" + integer2 + " validTop->" + i17 + " validRight->" + i18 + "  validBottom -> " + integer3);
            os0.a aVar2 = cVar.f330951g;
            if (aVar2 != null) {
                android.graphics.Point point = new android.graphics.Point(integer2, i17 + 1);
                android.graphics.Point point2 = new android.graphics.Point(i18 + 1, integer3);
                aVar2.A = point;
                aVar2.B = point2;
            }
        }
    }
}
