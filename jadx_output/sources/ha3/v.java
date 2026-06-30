package ha3;

/* loaded from: classes15.dex */
public final class v implements ha3.a, io.flutter.view.TextureRegistry.SurfaceProducer.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f279938t;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f279939a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayer f279940b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f279941c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f279942d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f279943e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f279944f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279945g;

    /* renamed from: h, reason: collision with root package name */
    public int f279946h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f279947i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f279948j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f279949k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceProducer f279950l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f279951m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279952n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f279953o;

    /* renamed from: p, reason: collision with root package name */
    public ha3.j f279954p;

    /* renamed from: q, reason: collision with root package name */
    public final long f279955q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f279956r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f279957s;

    public v(android.content.Context context, java.lang.String dataSource, java.lang.String cacheKey, boolean z17, java.lang.String referer, int i17, int i18, io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer, io.flutter.plugin.common.EventChannel eventChannel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        kotlin.jvm.internal.o.g(referer, "referer");
        kotlin.jvm.internal.o.g(surfaceProducer, "surfaceProducer");
        kotlin.jvm.internal.o.g(eventChannel, "eventChannel");
        this.f279941c = "";
        this.f279942d = "";
        this.f279948j = "";
        this.f279952n = true;
        this.f279957s = kotlinx.coroutines.z0.b();
        if (!f279938t) {
            f279938t = true;
            com.tencent.thumbplayer.api.TPPlayerMgr.initSdk(context, "60303", 1);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyEnable(true);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyServiceType(100);
        }
        this.f279947i = context;
        this.f279939a = dataSource;
        this.f279948j = cacheKey;
        this.f279949k = z17;
        this.f279950l = surfaceProducer;
        if (i17 != 0 && i18 != 0) {
            surfaceProducer.setSize(i17, i18);
        }
        this.f279955q = surfaceProducer.id();
        this.f279953o = eventChannel;
        eventChannel.setStreamHandler(new ha3.h(this));
    }

    public final void a(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Object details) {
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
        kotlin.jvm.internal.o.g(details, "details");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ha3.p(this, errorCode, errorMessage, details));
        } else {
            io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279951m;
            if (eventSink != null) {
                eventSink.error(errorCode, errorMessage, details);
            }
        }
    }

    public final void b(java.lang.Object event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ha3.q(this, event));
        } else {
            io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279951m;
            if (eventSink != null) {
                eventSink.success(event);
            }
        }
    }

    @Override // ha3.a
    public void e(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setVolume textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", volume: " + d17);
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.u(this, d17, null), 3, null);
    }

    @Override // ha3.a
    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "updateSize texture: " + this.f279955q + ", state: " + this.f279946h);
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279950l;
        if (surfaceProducer != null) {
            surfaceProducer.setSize(i17, i18);
        }
    }

    @Override // ha3.a
    public void g(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setPlayerPlayBackRate textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", playBackRate: " + d17);
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.s(this, d17, null), 3, null);
    }

    @Override // ha3.a
    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setPlayerLoop textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", loop: " + z17);
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.r(this, z17, null), 3, null);
    }

    @Override // ha3.a
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "pauseVideo textureId: " + this.f279955q + ", mediaId:" + this.f279956r + ", state: " + this.f279946h);
        if (this.f279946h == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "pauseVideo already pausing");
            return;
        }
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.j0.f279887b.i(this.f279939a, this.f279949k);
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.l(this, null), 3, null);
    }

    @Override // ha3.a
    public void j() {
        java.lang.String str = this.f279948j;
        if (str.length() == 0) {
            str = this.f279939a;
        }
        this.f279939a = str;
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.j0.f279887b.h(str);
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(this.f279939a);
        this.f279956r = a17;
        java.util.HashMap hashMap = ha3.j0.f279888c;
        kotlin.jvm.internal.o.d(a17);
        hashMap.put(a17, this);
        this.f279940b = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(this.f279947i);
        java.lang.String str2 = this.f279956r;
        kotlin.jvm.internal.o.d(str2);
        java.lang.String str3 = this.f279939a;
        kotlin.jvm.internal.o.d(str3);
        ha3.j jVar = new ha3.j(this, str2, str3);
        this.f279954p = jVar;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.enableTPAssetResourceLoader(jVar);
        }
        ha3.i iVar = new ha3.i(this);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f279940b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setOnErrorListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = this.f279940b;
        if (iTPPlayer3 != null) {
            iTPPlayer3.setOnPreparedListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer4 = this.f279940b;
        if (iTPPlayer4 != null) {
            iTPPlayer4.setOnVideoSizeChangedListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer5 = this.f279940b;
        if (iTPPlayer5 != null) {
            iTPPlayer5.setOnPlayerStateChangeListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer6 = this.f279940b;
        if (iTPPlayer6 != null) {
            iTPPlayer6.setOnInfoListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer7 = this.f279940b;
        if (iTPPlayer7 != null) {
            iTPPlayer7.setOnCompletionListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer8 = this.f279940b;
        if (iTPPlayer8 != null) {
            iTPPlayer8.setOnSeekCompleteListener(iVar);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer9 = this.f279940b;
        if (iTPPlayer9 != null) {
            iTPPlayer9.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(123, false));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer10 = this.f279940b;
        if (iTPPlayer10 != null) {
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279950l;
            iTPPlayer10.setSurface(surfaceProducer != null ? surfaceProducer.getSurface() : null);
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = this.f279950l;
        this.f279952n = (surfaceProducer2 != null ? surfaceProducer2.getSurface() : null) == null;
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.k(this, null), 3, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "createPlayer textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", url: " + this.f279939a);
    }

    @Override // ha3.a
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "disposePlayer textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", url: " + this.f279939a);
        ha3.i0 i0Var = ha3.j0.f279886a;
        java.util.HashMap hashMap = ha3.j0.f279888c;
        java.lang.String str = this.f279956r;
        kotlin.jvm.internal.o.d(str);
        hashMap.remove(str);
        ha3.h0 h0Var = ha3.j0.f279887b;
        h0Var.i(this.f279939a, this.f279949k);
        java.lang.String str2 = this.f279956r;
        java.util.Map map = h0Var.f279870e;
        ha3.e0 e0Var = (ha3.e0) map.get(str2);
        if (e0Var != null && e0Var.f279838f) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                ha3.e0 e0Var2 = (ha3.e0) entry.getValue();
                kotlin.jvm.internal.o.d(str3);
                if (r26.i0.y(str3, str2 + '@', false)) {
                    ha3.j0.f279886a.b(str3);
                    e0Var2.f279839g = false;
                }
            }
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.stop();
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279950l;
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f279950l = null;
        io.flutter.plugin.common.EventChannel eventChannel = this.f279953o;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f279953o = null;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f279940b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setSurface(null);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = this.f279940b;
        if (iTPPlayer3 != null) {
            iTPPlayer3.release();
        }
        this.f279940b = null;
        kotlinx.coroutines.z0.e(this.f279957s, null, 1, null);
    }

    @Override // ha3.a
    public void l(java.lang.Double d17) {
        double d18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        if (d17 != null) {
            d18 = d17.doubleValue();
        } else {
            ha3.e0 b17 = ha3.j0.f279887b.b(this.f279939a);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setPlayerToMuted textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", outputMute: " + z17);
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.t(this, z17, null), 3, null);
    }

    @Override // ha3.a
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "resetPosition textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h);
        if (this.f279946h < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHLSPlayer", "resetPosition wrong state");
            return;
        }
        ha3.j jVar = this.f279954p;
        if (jVar != null) {
            jVar.a();
        }
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.n(this, null), 3, null);
    }

    @Override // ha3.a
    public boolean o() {
        return this.f279945g;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
        if (this.f279952n) {
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f279940b;
            if (iTPPlayer != null) {
                io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f279950l;
                iTPPlayer.setSurface(surfaceProducer != null ? surfaceProducer.getSurface() : null);
            }
            this.f279952n = false;
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(null);
        }
        this.f279952n = true;
    }

    @Override // ha3.a
    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "playVideo textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h);
        int i17 = this.f279946h;
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "playVideo already playing");
        } else if (i17 < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHLSPlayer", "playVideo wrong state");
        } else {
            kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.m(this, null), 3, null);
        }
    }

    @Override // ha3.a
    public long q() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f279940b;
        if (iTPPlayer != null) {
            return iTPPlayer.getCurrentPositionMs();
        }
        return 0L;
    }

    @Override // ha3.a
    public void seekTo(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "seekTo textureId: " + this.f279955q + ", mediaId: " + this.f279956r + ", state: " + this.f279946h + ", location: " + i17);
        if (this.f279946h < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHLSPlayer", "seekTo wrong state");
            return;
        }
        ha3.j jVar = this.f279954p;
        if (jVar != null) {
            jVar.a();
        }
        kotlinx.coroutines.l.d(this.f279957s, null, null, new ha3.o(this, i17, null), 3, null);
    }
}
