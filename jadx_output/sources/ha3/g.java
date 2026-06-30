package ha3;

/* loaded from: classes15.dex */
public final class g implements ha3.a, io.flutter.view.TextureRegistry.SurfaceProducer.Callback {

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f279850a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f279851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f279852c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f279853d;

    /* renamed from: e, reason: collision with root package name */
    public float f279854e;

    /* renamed from: f, reason: collision with root package name */
    public int f279855f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f279856g;

    /* renamed from: h, reason: collision with root package name */
    public m8.i0 f279857h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f279858i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f279859j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceProducer f279860k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f279861l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f279862m;

    /* renamed from: n, reason: collision with root package name */
    public final long f279863n;

    /* renamed from: o, reason: collision with root package name */
    public final um5.p f279864o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f279865p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f279866q;

    public g(android.content.Context context, java.lang.String dataSource, java.lang.String cacheKey, boolean z17, java.lang.String referer, int i17, int i18, io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer, io.flutter.plugin.common.EventChannel eventChannel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        kotlin.jvm.internal.o.g(referer, "referer");
        kotlin.jvm.internal.o.g(surfaceProducer, "surfaceProducer");
        kotlin.jvm.internal.o.g(eventChannel, "eventChannel");
        this.f279858i = "";
        this.f279859j = "";
        um5.p pVar = new um5.p();
        this.f279864o = pVar;
        this.f279856g = context;
        this.f279858i = dataSource;
        this.f279859j = cacheKey;
        this.f279860k = surfaceProducer;
        if (i17 != 0 && i18 != 0) {
            surfaceProducer.setSize(i17, i18);
            ha3.c cVar = new ha3.c(this);
            pVar.e(surfaceProducer.getSurface(), i17, i18);
            pVar.n(cVar);
            this.f279866q = true;
        }
        this.f279863n = surfaceProducer.id();
        this.f279862m = eventChannel;
        eventChannel.setStreamHandler(new ha3.b(this));
    }

    public final void a(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Object details) {
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
        kotlin.jvm.internal.o.g(details, "details");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ha3.e(this, errorCode, errorMessage, details));
        } else {
            io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279861l;
            if (eventSink != null) {
                eventSink.error(errorCode, errorMessage, details);
            }
        }
    }

    public final void b(java.lang.Object event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ha3.f(this, event));
        } else {
            io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279861l;
            if (eventSink != null) {
                eventSink.success(event);
            }
        }
    }

    @Override // ha3.a
    public void e(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setVolume textureId: " + this.f279863n + ", state: " + this.f279855f + ", volume: " + d17);
        m8.i0 i0Var = this.f279857h;
        if (i0Var == null) {
            return;
        }
        i0Var.m((float) d17);
    }

    @Override // ha3.a
    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "updateSize texture: " + this.f279863n + ", state: " + this.f279855f);
        if (i17 == 0 || i18 == 0 || this.f279866q) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "updateSize: delayed init renderController with width=" + i17 + ", height=" + i18);
        ha3.c cVar = new ha3.c(this);
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279860k;
        if (surfaceProducer != null) {
            surfaceProducer.setSize(i17, i18);
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = this.f279860k;
        kotlin.jvm.internal.o.d(surfaceProducer2);
        android.view.Surface surface = surfaceProducer2.getSurface();
        um5.p pVar = this.f279864o;
        pVar.e(surface, i17, i18);
        pVar.n(cVar);
        this.f279866q = true;
    }

    @Override // ha3.a
    public void g(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setPlayerPlayBackRate textureId: " + this.f279863n + ", state: " + this.f279855f + ", playBackRate: " + d17);
        m8.y yVar = new m8.y((float) d17, 1.0f);
        m8.i0 i0Var = this.f279857h;
        if (i0Var == null) {
            return;
        }
        i0Var.a(yVar);
    }

    @Override // ha3.a
    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setPlayerLoop textureId: " + this.f279863n + ", state: " + this.f279855f + ", loop: " + z17);
        if (z17) {
            m8.i0 i0Var = this.f279857h;
            if (i0Var != null) {
                i0Var.k(1);
            }
        } else {
            m8.i0 i0Var2 = this.f279857h;
            if (i0Var2 != null) {
                i0Var2.k(0);
            }
        }
        this.f279852c = z17;
    }

    @Override // ha3.a
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "pauseVideo textureId: " + this.f279863n + ", state: " + this.f279855f);
        m8.i0 i0Var = this.f279857h;
        if (i0Var == null) {
            return;
        }
        i0Var.e(false);
    }

    @Override // ha3.a
    public void j() {
        m8.i0 i0Var;
        m8.i0 i0Var2 = new m8.i0(new m8.d(this.f279856g, null, 0), new q9.h(new q9.a(new r9.p())), new m8.c(new r9.o(true, 65536), 15000, 30000, 2500L, 5000L));
        this.f279857h = i0Var2;
        ha3.d dVar = new ha3.d(this);
        i0Var2.g(dVar);
        m8.i0 i0Var3 = this.f279857h;
        if (i0Var3 != null) {
            i0Var3.f324562c.add(dVar);
        }
        m8.i0 i0Var4 = this.f279857h;
        if (i0Var4 != null) {
            i0Var4.f324564e.add(dVar);
        }
        java.lang.String str = this.f279859j;
        if (str.length() == 0) {
            str = this.f279858i;
        }
        this.f279858i = str;
        d9.v vVar = new d9.v(com.tencent.mm.vfs.z7.a(str).h(), new r9.v(), new q8.c(), null, null);
        android.view.Surface surface = this.f279865p;
        if (surface != null && (i0Var = this.f279857h) != null) {
            i0Var.l(surface, false);
        }
        m8.i0 i0Var5 = this.f279857h;
        if (i0Var5 != null) {
            ((m8.k) i0Var5.f324561b).j(vVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "createPlayer textureId: " + this.f279863n + ", state: " + this.f279855f + ", url: " + this.f279858i);
    }

    @Override // ha3.a
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "disposePlayer textureId: " + this.f279863n + ", state: " + this.f279855f + ", url: " + this.f279858i);
        m8.i0 i0Var = this.f279857h;
        if (i0Var != null) {
            i0Var.n();
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279860k;
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f279860k = null;
        io.flutter.plugin.common.EventChannel eventChannel = this.f279862m;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f279862m = null;
        android.view.Surface surface = this.f279865p;
        if (surface != null) {
            surface.release();
        }
        this.f279865p = null;
        um5.p pVar = this.f279864o;
        pVar.g();
        pVar.b();
        m8.i0 i0Var2 = this.f279857h;
        if (i0Var2 != null) {
            i0Var2.l(null, false);
        }
        m8.i0 i0Var3 = this.f279857h;
        if (i0Var3 != null) {
            i0Var3.release();
        }
        this.f279857h = null;
    }

    @Override // ha3.a
    public void l(java.lang.Double d17) {
        double d18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        if (d17 != null) {
            d18 = d17.doubleValue();
        } else {
            d18 = this.f279857h != null ? r7.h() : 0.0d;
        }
        hashMap.put("values", kz5.b0.c(kz5.c0.i(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(d18))));
        b(hashMap);
    }

    @Override // ha3.a
    public void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setPlayerToMuted textureId: " + this.f279863n + ", state: " + this.f279855f + ", muted: " + z17);
        if (z17 == this.f279853d) {
            return;
        }
        if (z17) {
            m8.i0 i0Var = this.f279857h;
            this.f279854e = i0Var != null ? i0Var.f324571l : 0.0f;
            if (i0Var != null) {
                i0Var.m(0.0f);
            }
        } else {
            m8.i0 i0Var2 = this.f279857h;
            if (i0Var2 != null) {
                i0Var2.m(this.f279854e);
            }
            this.f279854e = 0.0f;
        }
        this.f279853d = z17;
    }

    @Override // ha3.a
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "resetPosition textureId: " + this.f279863n + ", state: " + this.f279855f);
        m8.i0 i0Var = this.f279857h;
        if (i0Var != null) {
            i0Var.seekTo(0L);
        }
    }

    @Override // ha3.a
    public boolean o() {
        return this.f279852c;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
    }

    @Override // ha3.a
    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "playVideo textureId: " + this.f279863n + ", state: " + this.f279855f);
        m8.i0 i0Var = this.f279857h;
        if (i0Var == null) {
            return;
        }
        i0Var.e(true);
    }

    @Override // ha3.a
    public long q() {
        m8.i0 i0Var = this.f279857h;
        if (i0Var != null) {
            return i0Var.getCurrentPosition();
        }
        return 0L;
    }

    @Override // ha3.a
    public void seekTo(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "seekTo textureId: " + this.f279863n + ", state: " + this.f279855f + ", location: " + i17);
        m8.i0 i0Var = this.f279857h;
        if (i0Var != null) {
            i0Var.seekTo(i17);
        }
    }
}
