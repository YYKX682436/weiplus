package x03;

/* loaded from: classes15.dex */
public final class u0 implements x03.r1 {

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f451132n = java.lang.Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f451133a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayer f451134b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f451135c;

    /* renamed from: d, reason: collision with root package name */
    public x03.s1 f451136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451137e;

    /* renamed from: f, reason: collision with root package name */
    public long f451138f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f451139g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451140h;

    /* renamed from: i, reason: collision with root package name */
    public int f451141i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f451142j;

    /* renamed from: k, reason: collision with root package name */
    public long f451143k;

    /* renamed from: l, reason: collision with root package name */
    public long f451144l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f451145m;

    public u0(android.content.Context _context, java.lang.String _path) {
        kotlin.jvm.internal.o.g(_context, "_context");
        kotlin.jvm.internal.o.g(_path, "_path");
        this.f451133a = "MicroMsg.FlutterVideoPlayer";
        this.f451137e = "";
        this.f451139g = _path;
        ((ku5.t0) ku5.t0.f312615d).B(new x03.l0(this));
        java.lang.Boolean bool = f451132n;
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue()) {
            f451132n = java.lang.Boolean.TRUE;
            com.tencent.thumbplayer.api.TPPlayerMgr.initSdk(_context, "60303", 1);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyEnable(true);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyServiceType(100);
        }
        com.tencent.thumbplayer.api.ITPPlayer createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(_context);
        this.f451134b = createTPPlayer;
        if (createTPPlayer != null) {
            createTPPlayer.setOnPreparedListener(new x03.o0(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnErrorListener(new x03.p0(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setOnCompletionListener(new x03.q0(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = this.f451134b;
        if (iTPPlayer3 != null) {
            iTPPlayer3.setOnSeekCompleteListener(new x03.r0(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer4 = this.f451134b;
        if (iTPPlayer4 != null) {
            iTPPlayer4.setOnPlayerStateChangeListener(new x03.s0(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer5 = this.f451134b;
        if (iTPPlayer5 != null) {
            iTPPlayer5.setOnInfoListener(new x03.t0(this));
        }
    }

    @Override // ph3.c
    public void a(int i17) {
        java.lang.String str = "video_status seek " + this.f451134b + ", state: " + this.f451141i;
        java.lang.String str2 = this.f451133a;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (this.f451141i < 4) {
            com.tencent.mars.xlog.Log.e(str2, "video_status wrong seek");
            return;
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.seekTo(i17, 3);
        }
    }

    @Override // x03.r1
    public void b(boolean z17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setLoopback(z17);
        }
    }

    @Override // ph3.c
    public void c(float f17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setPlaySpeedRatio(f17);
        }
    }

    @Override // x03.r1
    public void d(java.lang.String str) {
        if (str != null) {
            this.f451137e = str;
        }
    }

    @Override // x03.r1
    public void e(double d17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setAudioGainRatio((float) d17);
        }
    }

    @Override // x03.r1
    public void f(x03.s1 s1Var) {
        this.f451136d = s1Var;
    }

    @Override // x03.r1
    public double g() {
        x03.f b17 = x03.x0.f451161d.a().f451164b.b(this.f451140h);
        java.lang.Long valueOf = java.lang.Long.valueOf(b17.f451012a);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(b17.f451014c);
        kotlin.jvm.internal.o.d(valueOf);
        if (valueOf.longValue() > 0) {
            kotlin.jvm.internal.o.d(valueOf2);
            if (valueOf2.longValue() > 0) {
                return ((valueOf.longValue() * 100.0d) / valueOf2.longValue()) * 1.0d;
            }
        }
        return 0.0d;
    }

    @Override // x03.r1
    public long getCurrentPosition() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        long currentPositionMs = iTPPlayer != null ? iTPPlayer.getCurrentPositionMs() : 0L;
        if (((int) currentPositionMs) != 0) {
            return currentPositionMs;
        }
        long j17 = this.f451138f;
        this.f451138f = 500 + j17;
        return j17;
    }

    @Override // ph3.c
    public long getDurationMs() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.getDurationMs();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            return iTPPlayer2.getDurationMs();
        }
        return 0L;
    }

    @Override // x03.r1
    public int getHeight() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            return iTPPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // x03.r1
    public java.lang.String getVideoPath() {
        return this.f451135c;
    }

    @Override // x03.r1
    public int getWidth() {
        java.util.Objects.toString(this.f451134b);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.getVideoWidth();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            return iTPPlayer2.getVideoWidth();
        }
        return 0;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        byte[] bArr;
        this.f451135c = str;
        if (str != null) {
            bArr = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        this.f451140h = kk.k.g(bArr);
    }

    @Override // x03.r1
    public void i() {
    }

    @Override // ph3.c
    public void pause() {
        java.util.Objects.toString(this.f451134b);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.pause();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.pauseDownload();
        }
    }

    @Override // ph3.c
    public boolean prepare() {
        java.lang.String str = this.f451140h;
        kotlin.jvm.internal.o.d(str);
        java.lang.String str2 = this.f451139g;
        kotlin.jvm.internal.o.d(str2);
        x03.n0 n0Var = new x03.n0(this, str, str2);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.enableTPAssetResourceLoader(n0Var);
        }
        if (this.f451141i >= 3) {
            return true;
        }
        x03.x0 a17 = x03.x0.f451161d.a();
        x03.f b17 = a17.f451164b.b(this.f451140h);
        com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
        builder.fileId(this.f451140h);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setVideoInfo(builder.build());
        }
        if (b17.f451015d) {
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = this.f451134b;
            if (iTPPlayer3 != null) {
                iTPPlayer3.setDataSource(b17.f451016e);
            }
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("referer", this.f451137e);
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer4 = this.f451134b;
            if (iTPPlayer4 != null) {
                iTPPlayer4.setDataSource(this.f451135c, hashMap);
            }
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer5 = this.f451134b;
        if (iTPPlayer5 == null) {
            return true;
        }
        iTPPlayer5.prepareAsync();
        return true;
    }

    @Override // ph3.c
    public void release() {
        java.util.Objects.toString(this.f451134b);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(null);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.release();
        }
    }

    @Override // ph3.c
    public void setMute(boolean z17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setOutputMute(z17);
        }
    }

    @Override // ph3.c
    public void setSurface(android.view.Surface surface) {
        if (surface != null) {
            surface.hashCode();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(surface);
        }
    }

    @Override // ph3.c
    public void start() {
        java.util.Objects.toString(this.f451134b);
        if (this.f451141i == 5) {
            java.util.Objects.toString(this.f451134b);
            return;
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451134b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.start();
        }
    }

    @Override // ph3.c
    public void stop() {
        java.util.Objects.toString(this.f451134b);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f451145m;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451134b;
        if (iTPPlayer != null) {
            iTPPlayer.stop();
        }
    }
}
