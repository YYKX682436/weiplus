package ha3;

/* loaded from: classes15.dex */
public final class d0 implements ha3.a, io.flutter.view.TextureRegistry.SurfaceProducer.Callback {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f279809s = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: t, reason: collision with root package name */
    public static android.os.HandlerThread f279810t;

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f279811a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f279812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f279813c;

    /* renamed from: d, reason: collision with root package name */
    public int f279814d;

    /* renamed from: e, reason: collision with root package name */
    public kk4.c f279815e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279816f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279817g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f279818h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f279819i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceProducer f279820j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f279821k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f279822l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f279823m;

    /* renamed from: n, reason: collision with root package name */
    public final long f279824n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f279825o;

    /* renamed from: p, reason: collision with root package name */
    public final um5.p f279826p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f279827q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279828r;

    public d0(android.content.Context context, java.lang.String dataSource, java.lang.String cacheKey, boolean z17, java.lang.String referer, int i17, int i18, io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer, io.flutter.plugin.common.EventChannel eventChannel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        kotlin.jvm.internal.o.g(referer, "referer");
        kotlin.jvm.internal.o.g(surfaceProducer, "surfaceProducer");
        kotlin.jvm.internal.o.g(eventChannel, "eventChannel");
        this.f279816f = "";
        this.f279817g = "";
        this.f279819i = "";
        this.f279823m = new com.tencent.mm.sdk.platformtools.n3("liteAppVideoPlayerPrepare");
        um5.p pVar = new um5.p();
        this.f279826p = pVar;
        this.f279816f = dataSource;
        this.f279817g = cacheKey;
        this.f279818h = z17;
        this.f279819i = referer;
        this.f279820j = surfaceProducer;
        if (i17 != 0 && i18 != 0) {
            surfaceProducer.setSize(i17, i18);
            ha3.x xVar = new ha3.x(this);
            pVar.e(surfaceProducer.getSurface(), i17, i18);
            pVar.n(xVar);
            this.f279828r = true;
        }
        this.f279824n = surfaceProducer.id();
        this.f279822l = eventChannel;
        eventChannel.setStreamHandler(new ha3.w(this));
    }

    public final void a(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Object details) {
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
        kotlin.jvm.internal.o.g(details, "details");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ha3.b0(this, errorCode, errorMessage, details));
        } else {
            io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279821k;
            if (eventSink != null) {
                eventSink.error(errorCode, errorMessage, details);
            }
        }
    }

    public final void b(java.lang.Object event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ha3.c0(this, event));
        } else {
            io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279821k;
            if (eventSink != null) {
                eventSink.success(event);
            }
        }
    }

    @Override // ha3.a
    public void e(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "setVolume textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", volume: " + d17);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).setAudioGainRatio((float) d17);
        }
    }

    @Override // ha3.a
    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "updateSize texture: " + this.f279824n + ", mediaId:" + this.f279825o + ", state: " + this.f279814d + ", width: " + i17 + ", height: " + i18);
        if (i17 == 0 || i18 == 0 || this.f279828r) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "updateSize: delayed init renderController with width=" + i17 + ", height=" + i18);
        ha3.x xVar = new ha3.x(this);
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279820j;
        if (surfaceProducer != null) {
            surfaceProducer.setSize(i17, i18);
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = this.f279820j;
        kotlin.jvm.internal.o.d(surfaceProducer2);
        android.view.Surface surface = surfaceProducer2.getSurface();
        um5.p pVar = this.f279826p;
        pVar.e(surface, i17, i18);
        pVar.n(xVar);
        this.f279828r = true;
    }

    @Override // ha3.a
    public void g(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "setPlayerPlayBackRate textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", playBackRate: " + d17);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            cVar.setPlaySpeedRatio((float) d17);
        }
    }

    @Override // ha3.a
    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "setPlayerLoop textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", loop: " + z17);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).setLoopback(z17);
        }
        this.f279813c = z17;
    }

    @Override // ha3.a
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "pauseVideo textureId: " + this.f279824n + ", mediaId:" + this.f279825o + ", state: " + this.f279814d);
        if (this.f279814d == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "pauseVideo already pausing");
            return;
        }
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.j0.f279887b.i(this.f279816f, this.f279818h);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).pause();
        }
        kk4.c cVar2 = this.f279815e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).pauseDownload();
        }
    }

    @Override // ha3.a
    public void j() {
        kk4.c cVar;
        if (f279810t == null) {
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("LiteAppTPCreateWorkThread", 0);
            f279810t = a17;
            a17.start();
        }
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = f279809s;
        concurrentSkipListSet.add(java.lang.String.valueOf(hashCode()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startHandlerThread proxy:");
        sb6.append(hashCode());
        sb6.append(" threadId:");
        android.os.HandlerThread handlerThread = f279810t;
        sb6.append(handlerThread != null ? java.lang.Integer.valueOf(handlerThread.getThreadId()) : null);
        sb6.append(" count：");
        sb6.append(concurrentSkipListSet.size());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.lang.String str = this.f279817g;
        if (str.length() == 0) {
            str = this.f279816f;
        }
        this.f279816f = str;
        ha3.h0 h0Var = ha3.j0.f279887b;
        h0Var.h(str);
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(this.f279816f);
        this.f279825o = a18;
        java.util.HashMap hashMap = ha3.j0.f279888c;
        kotlin.jvm.internal.o.d(a18);
        hashMap.put(a18, this);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.os.HandlerThread handlerThread2 = f279810t;
        kotlin.jvm.internal.o.d(handlerThread2);
        android.os.Looper looper = handlerThread2.getLooper();
        kotlin.jvm.internal.o.f(looper, "getLooper(...)");
        ((cf0.q) qVar).getClass();
        this.f279815e = new kk4.f0(context, looper);
        java.lang.String str2 = this.f279825o;
        kotlin.jvm.internal.o.d(str2);
        ha3.z zVar = new ha3.z(this, str2);
        kk4.c cVar2 = this.f279815e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).enableTPAssetResourceLoader(zVar);
        }
        ha3.y yVar = new ha3.y(this);
        kk4.c cVar3 = this.f279815e;
        if (cVar3 != null) {
            ((kk4.f0) cVar3).setOnErrorListener(yVar);
        }
        kk4.c cVar4 = this.f279815e;
        if (cVar4 != null) {
            ((kk4.f0) cVar4).setOnPreparedListener(yVar);
        }
        kk4.c cVar5 = this.f279815e;
        if (cVar5 != null) {
            ((kk4.f0) cVar5).setOnVideoSizeChangedListener(yVar);
        }
        kk4.c cVar6 = this.f279815e;
        if (cVar6 != null) {
            ((kk4.f0) cVar6).f308541q = yVar;
        }
        if (cVar6 != null) {
            ((kk4.f0) cVar6).setOnInfoListener(yVar);
        }
        kk4.c cVar7 = this.f279815e;
        if (cVar7 != null) {
            ((kk4.f0) cVar7).setOnCompletionListener(yVar);
        }
        kk4.c cVar8 = this.f279815e;
        if (cVar8 != null) {
            ((kk4.f0) cVar8).setOnSeekCompleteListener(yVar);
        }
        kk4.c cVar9 = this.f279815e;
        if (cVar9 != null) {
            java.lang.String str3 = this.f279825o;
            kotlin.jvm.internal.o.d(str3);
            ((kk4.f0) cVar9).f308533i = str3;
        }
        kk4.c cVar10 = this.f279815e;
        if (cVar10 != null) {
            ((kk4.f0) cVar10).setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(123, false));
        }
        com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
        java.lang.String str4 = this.f279825o;
        kotlin.jvm.internal.o.d(str4);
        builder.fileId(str4);
        kk4.c cVar11 = this.f279815e;
        if (cVar11 != null) {
            ((kk4.f0) cVar11).setVideoInfo(builder.build());
        }
        ha3.e0 b17 = h0Var.b(this.f279816f);
        if (b17 != null && b17.f279836d && com.tencent.mm.vfs.w6.j(b17.f279837e)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("createPlayer taskInfo completed, setDataSource ");
            sb7.append(b17 != null ? b17.f279837e : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb7.toString());
            kk4.c cVar12 = this.f279815e;
            if (cVar12 != null) {
                ((kk4.f0) cVar12).setDataSource(b17 != null ? b17.f279837e : null);
            }
        } else {
            if (b17 != null && b17.f279836d) {
                java.lang.String str5 = this.f279816f;
                if (str5 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "removeTask url is null.");
                } else {
                    java.lang.String b18 = com.tencent.mm.sdk.platformtools.w2.b(str5.getBytes());
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "removeTask url: " + str5 + ", mediaId: " + b18);
                    h0Var.f279870e.remove(b18);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "createPlayer taskInfo is not complete, setDataSource " + this.f279816f);
            java.lang.String str6 = this.f279819i;
            if (str6.length() > 0) {
                kk4.c cVar13 = this.f279815e;
                if (cVar13 != null) {
                    ((kk4.f0) cVar13).setDataSource(this.f279816f, kz5.b1.e(new jz5.l("referer", str6)));
                }
            } else {
                kk4.c cVar14 = this.f279815e;
                if (cVar14 != null) {
                    ((kk4.f0) cVar14).setDataSource(this.f279816f);
                }
            }
        }
        android.view.Surface surface = this.f279827q;
        if (surface != null && (cVar = this.f279815e) != null) {
            ((kk4.f0) cVar).setSurface(surface);
        }
        this.f279823m.post(new ha3.a0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "createPlayer textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", url: " + this.f279816f);
    }

    @Override // ha3.a
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "disposePlayer textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", url: " + this.f279816f);
        ha3.i0 i0Var = ha3.j0.f279886a;
        java.util.HashMap hashMap = ha3.j0.f279888c;
        java.lang.String str = this.f279825o;
        kotlin.jvm.internal.o.d(str);
        hashMap.remove(str);
        ha3.j0.f279887b.i(this.f279816f, this.f279818h);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            cVar.stop();
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279820j;
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f279820j = null;
        io.flutter.plugin.common.EventChannel eventChannel = this.f279822l;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f279822l = null;
        android.view.Surface surface = this.f279827q;
        if (surface != null) {
            surface.release();
        }
        this.f279827q = null;
        um5.p pVar = this.f279826p;
        pVar.g();
        pVar.b();
        kk4.c cVar2 = this.f279815e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).setSurface(null);
        }
        kk4.c cVar3 = this.f279815e;
        if (cVar3 != null) {
            cVar3.release();
        }
        this.f279815e = null;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = f279809s;
        concurrentSkipListSet.remove(java.lang.String.valueOf(hashCode()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryQuitHandlerThread proxy:");
        sb6.append(hashCode());
        sb6.append(" threadId:");
        android.os.HandlerThread handlerThread = f279810t;
        sb6.append(handlerThread != null ? java.lang.Integer.valueOf(handlerThread.getThreadId()) : null);
        sb6.append(" count：");
        sb6.append(concurrentSkipListSet.size());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (concurrentSkipListSet.isEmpty()) {
            android.os.HandlerThread handlerThread2 = f279810t;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            f279810t = null;
        }
    }

    @Override // ha3.a
    public void l(java.lang.Double d17) {
        double d18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        if (d17 != null) {
            d18 = d17.doubleValue();
        } else {
            ha3.e0 b17 = ha3.j0.f279887b.b(this.f279816f);
            if (b17 != null) {
                long j17 = b17.f279833a;
                long j18 = b17.f279835c;
                if (j17 > 0 && j18 > 0) {
                    d18 = ((j17 * 100.0d) / j18) * 1.0d;
                }
            }
            d18 = 0.0d;
        }
        hashMap.put("values", kz5.b0.c(kz5.c0.i(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(d18))));
        b(hashMap);
    }

    @Override // ha3.a
    public void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "setPlayerToMuted textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", outputMute: " + z17);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).setOutputMute(z17);
        }
    }

    @Override // ha3.a
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "resetPosition textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d);
        if (this.f279814d < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", "resetPosition wrong state");
            return;
        }
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).resumeDownload();
        }
        kk4.c cVar2 = this.f279815e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).seekTo(0, 3);
        }
    }

    @Override // ha3.a
    public boolean o() {
        return this.f279813c;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
    }

    @Override // ha3.a
    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "playVideo textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d);
        int i17 = this.f279814d;
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "playVideo already playing");
            return;
        }
        if (i17 < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", "playVideo wrong state");
            return;
        }
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.j0.f279887b.h(this.f279816f);
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).resumeDownload();
        }
        kk4.c cVar2 = this.f279815e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).start();
        }
    }

    @Override // ha3.a
    public long q() {
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            return ((kk4.f0) cVar).getCurrentPositionMs();
        }
        return 0L;
    }

    @Override // ha3.a
    public void seekTo(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "seekTo textureId: " + this.f279824n + ", mediaId: " + this.f279825o + ", state: " + this.f279814d + ", location: " + i17);
        if (this.f279814d < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayer", "seekTo wrong state");
            return;
        }
        kk4.c cVar = this.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).resumeDownload();
        }
        kk4.c cVar2 = this.f279815e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).seekTo(i17, 3);
        }
    }
}
