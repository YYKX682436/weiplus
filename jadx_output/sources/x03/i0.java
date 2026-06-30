package x03;

/* loaded from: classes15.dex */
public final class i0 implements x03.r1 {

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f451043p = java.lang.Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f451044a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayer f451045b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f451046c;

    /* renamed from: d, reason: collision with root package name */
    public x03.s1 f451047d;

    /* renamed from: e, reason: collision with root package name */
    public long f451048e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f451049f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451050g;

    /* renamed from: h, reason: collision with root package name */
    public int f451051h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f451052i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f451053j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f451054k;

    /* renamed from: l, reason: collision with root package name */
    public x03.s f451055l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f451056m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f451057n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f451058o;

    public i0(android.content.Context _context, java.lang.String _url) {
        kotlin.jvm.internal.o.g(_context, "_context");
        kotlin.jvm.internal.o.g(_url, "_url");
        this.f451044a = "MicroMsg.FlutterVideoHLSPlayer";
        this.f451049f = _url;
        this.f451050g = "";
        this.f451053j = "";
        this.f451054k = "";
        this.f451058o = kotlinx.coroutines.z0.b();
        ((ku5.t0) ku5.t0.f312615d).B(new x03.o(this));
        ((ku5.t0) ku5.t0.f312615d).B(new x03.q(this));
        java.lang.Boolean bool = f451043p;
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue()) {
            f451043p = java.lang.Boolean.TRUE;
            com.tencent.thumbplayer.api.TPPlayerMgr.initSdk(_context, "60303", 1);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyEnable(true);
            com.tencent.thumbplayer.api.TPPlayerMgr.setProxyServiceType(100);
        }
        com.tencent.thumbplayer.api.ITPPlayer createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(_context);
        this.f451045b = createTPPlayer;
        if (createTPPlayer != null) {
            createTPPlayer.setOnPreparedListener(new x03.t(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnErrorListener(new x03.u(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451045b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setOnCompletionListener(new x03.v(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = this.f451045b;
        if (iTPPlayer3 != null) {
            iTPPlayer3.setOnSeekCompleteListener(new x03.w(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer4 = this.f451045b;
        if (iTPPlayer4 != null) {
            iTPPlayer4.setOnPlayerStateChangeListener(new x03.x(this));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer5 = this.f451045b;
        if (iTPPlayer5 != null) {
            iTPPlayer5.setOnInfoListener(new x03.y(this));
        }
    }

    @Override // ph3.c
    public void a(int i17) {
        java.lang.String str = "video_status seek " + this.f451045b + ", state: " + this.f451051h + " mSec: " + i17;
        java.lang.String str2 = this.f451044a;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (this.f451051h < 4) {
            com.tencent.mars.xlog.Log.e(str2, "video_status wrong seek");
            return;
        }
        x03.s sVar = this.f451055l;
        if (sVar != null) {
            java.util.Objects.toString(sVar.f451123s.f451045b);
            x03.v0 v0Var = x03.x0.f451161d;
            x03.i iVar = v0Var.a().f451164b;
            iVar.getClass();
            java.lang.String mainMediaId = sVar.f451111d;
            kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
            java.util.Map map = iVar.f451041g;
            kotlin.jvm.internal.o.d(map);
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                x03.f fVar = (x03.f) entry.getValue();
                if (!fVar.f451017f) {
                    kotlin.jvm.internal.o.d(str3);
                    if (r26.i0.y(str3, mainMediaId.concat("@"), false) && fVar.f451018g) {
                        v0Var.a().f451165c.b(str3);
                        fVar.f451018g = false;
                    }
                }
            }
        }
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.b0(this, i17, null), 3, null);
    }

    @Override // x03.r1
    public void b(boolean z17) {
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.c0(this, z17, null), 3, null);
    }

    @Override // ph3.c
    public void c(float f17) {
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.e0(this, f17, null), 3, null);
    }

    @Override // x03.r1
    public void d(java.lang.String str) {
    }

    @Override // x03.r1
    public void e(double d17) {
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.f0(this, d17, null), 3, null);
    }

    @Override // x03.r1
    public void f(x03.s1 s1Var) {
        this.f451047d = s1Var;
    }

    @Override // x03.r1
    public double g() {
        x03.f b17;
        x03.s sVar = this.f451055l;
        java.lang.String str = sVar != null ? sVar.f451116i : null;
        x03.v0 v0Var = x03.x0.f451161d;
        if (str != null) {
            x03.x0 a17 = v0Var.a();
            x03.s sVar2 = this.f451055l;
            b17 = a17.f451164b.b(sVar2 != null ? sVar2.f451116i : null);
        } else {
            b17 = v0Var.a().f451164b.b(this.f451050g);
        }
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
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        long currentPositionMs = iTPPlayer != null ? iTPPlayer.getCurrentPositionMs() : 0L;
        if (((int) currentPositionMs) != 0) {
            return currentPositionMs;
        }
        long j17 = this.f451048e;
        this.f451048e = 500 + j17;
        return j17;
    }

    @Override // ph3.c
    public long getDurationMs() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.getDurationMs();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451045b;
        if (iTPPlayer2 != null) {
            return iTPPlayer2.getDurationMs();
        }
        return 0L;
    }

    @Override // x03.r1
    public int getHeight() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            return iTPPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // x03.r1
    public java.lang.String getVideoPath() {
        return this.f451046c;
    }

    @Override // x03.r1
    public int getWidth() {
        java.util.Objects.toString(this.f451045b);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.getVideoWidth();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451045b;
        if (iTPPlayer2 != null) {
            return iTPPlayer2.getVideoWidth();
        }
        return 0;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        byte[] bArr;
        this.f451046c = str;
        if (str != null) {
            bArr = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        java.lang.String g17 = kk.k.g(bArr);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        this.f451050g = g17;
    }

    @Override // x03.r1
    public void i() {
    }

    @Override // ph3.c
    public void pause() {
        java.util.Objects.toString(this.f451045b);
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.z(this, null), 3, null);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f451057n;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // ph3.c
    public boolean prepare() {
        if (this.f451055l == null) {
            this.f451055l = new x03.s(this, this.f451050g, this.f451049f);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.enableTPAssetResourceLoader(this.f451055l);
        }
        if (!(this.f451050g.length() == 0)) {
            kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.a0(this, null), 3, null);
            return true;
        }
        com.tencent.mars.xlog.Log.e(this.f451044a, "video_status prepare failed, url: " + this.f451046c + ", media:" + this.f451050g);
        return false;
    }

    @Override // ph3.c
    public void release() {
        java.util.Objects.toString(this.f451045b);
        kotlinx.coroutines.z0.e(this.f451058o, null, 1, null);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(null);
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.f451045b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.release();
        }
    }

    @Override // ph3.c
    public void setMute(boolean z17) {
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.d0(this, z17, null), 3, null);
    }

    @Override // ph3.c
    public void setSurface(android.view.Surface surface) {
        if (surface != null) {
            surface.hashCode();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(surface);
        }
    }

    @Override // ph3.c
    public void start() {
        java.util.Objects.toString(this.f451045b);
        if (this.f451051h == 5) {
            java.util.Objects.toString(this.f451045b);
            return;
        }
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.g0(this, null), 3, null);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f451057n;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f451057n;
        if (b4Var2 != null) {
            b4Var2.c(500L, 500L);
        }
    }

    @Override // ph3.c
    public void stop() {
        java.util.Objects.toString(this.f451045b);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f451056m;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f451057n;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        kotlinx.coroutines.l.d(this.f451058o, null, null, new x03.h0(this, null), 3, null);
    }
}
