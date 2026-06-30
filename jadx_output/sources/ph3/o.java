package ph3;

/* loaded from: classes14.dex */
public class o implements ph3.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f354438a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f354439b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f354440c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f354441d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f354442e;

    /* renamed from: f, reason: collision with root package name */
    public long f354443f;

    /* renamed from: g, reason: collision with root package name */
    public long f354444g;

    /* renamed from: h, reason: collision with root package name */
    public long f354445h;

    /* renamed from: i, reason: collision with root package name */
    public final ph3.h f354446i;

    /* renamed from: j, reason: collision with root package name */
    public int f354447j;

    /* renamed from: l, reason: collision with root package name */
    public final ph3.p f354449l;

    /* renamed from: n, reason: collision with root package name */
    public ph3.a f354451n;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f354453p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f354454q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f354455r;

    /* renamed from: k, reason: collision with root package name */
    public boolean f354448k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f354450m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f354452o = -1;

    public o(com.tencent.mm.sdk.platformtools.n3 n3Var, xu5.b bVar, android.os.Looper looper, android.os.Looper looper2, boolean z17, int i17) {
        ph3.l lVar = new ph3.l(this);
        this.f354453p = lVar;
        ph3.m mVar = new ph3.m(this);
        this.f354454q = mVar;
        ph3.n nVar = new ph3.n(this);
        this.f354455r = nVar;
        this.f354438a = n3Var;
        this.f354442e = z17;
        ph3.h hVar = new ph3.h(z17, i17);
        this.f354446i = hVar;
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = new com.tencent.mm.sdk.platformtools.n3(bVar, lVar);
        this.f354441d = n3Var2;
        n3Var2.setLogging(false);
        this.f354449l = new ph3.p(hVar, n3Var);
        this.f354439b = new com.tencent.mm.sdk.platformtools.n3(looper, mVar);
        if (looper2 != null) {
            this.f354451n = new ph3.a(hVar, n3Var);
            com.tencent.mm.sdk.platformtools.n3 n3Var3 = new com.tencent.mm.sdk.platformtools.n3(looper2, nVar);
            this.f354440c = n3Var3;
            n3Var3.setLogging(false);
        }
    }

    @Override // ph3.c
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s seek to mSeekSec %d", j(), java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.VideoPlayerImpl", "seek stack", new java.lang.Object[0]);
        if (this.f354447j < 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayerImpl", "%s player is not ready[%d], how to seek[%d]?", j(), java.lang.Integer.valueOf(this.f354447j), java.lang.Integer.valueOf(i17));
            return;
        }
        ph3.p pVar = this.f354449l;
        pVar.l();
        ph3.a aVar = this.f354451n;
        if (aVar != null) {
            aVar.l();
        }
        m(5);
        if (i17 >= this.f354443f) {
            this.f354441d.obtainMessage(9).sendToTarget();
            return;
        }
        pVar.f();
        this.f354446i.f354388c = pVar.s(i17);
        pVar.t(5);
        n(5);
        l();
    }

    @Override // ph3.c
    public void c(float f17) {
        ph3.p pVar = this.f354449l;
        if (pVar != null) {
            if (f17 > 0.0f) {
                pVar.C = f17;
            } else {
                pVar.getClass();
            }
        }
    }

    @Override // ph3.c
    public long getDurationMs() {
        return this.f354443f;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s set path %s", j(), str);
        this.f354449l.f354404d = str;
        ph3.a aVar = this.f354451n;
        if (aVar != null) {
            aVar.f354404d = str;
        }
    }

    public java.lang.String j() {
        return this.f354446i.c() + "_" + android.os.Process.myTid();
    }

    public final void k(com.tencent.mm.sdk.platformtools.n3 n3Var, long j17, long j18) {
        if (ph3.e.a(this.f354447j)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayerImpl", "isEnd state=%s", java.lang.Integer.valueOf(this.f354447j));
            return;
        }
        if (n3Var.isQuit()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayerImpl", "handler has quit");
            return;
        }
        n3Var.removeMessages(2);
        long elapsedRealtime = (j17 + j18) - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            n3Var.sendEmptyMessage(2);
        } else {
            n3Var.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s seek done", j());
        this.f354449l.t(5);
        ph3.a aVar = this.f354451n;
        ph3.h hVar = this.f354446i;
        if (aVar != null) {
            aVar.f();
            hVar.f354391f = this.f354451n.s((int) hVar.f354388c);
            this.f354451n.t(5);
        }
        n(7);
        m(4);
        this.f354438a.obtainMessage(3, 0, 0).sendToTarget();
        hVar.f354390e = hVar.f354388c * 1000;
        hVar.f354388c = -1L;
    }

    public void m(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s set state old %d new %d", j(), java.lang.Integer.valueOf(this.f354447j), java.lang.Integer.valueOf(i17));
        this.f354447j = i17;
        this.f354446i.f354392g = 0L;
    }

    public final void n(int i17) {
        java.lang.String j17 = j();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ph3.h hVar = this.f354446i;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s update positions state %d timeline[%d %d %d]", j17, valueOf, java.lang.Long.valueOf(hVar.f354386a), java.lang.Long.valueOf(hVar.f354387b), java.lang.Long.valueOf(hVar.f354389d));
        if (i17 == 3) {
            long j18 = hVar.f354387b;
            if (j18 > 0) {
                hVar.f354389d += j18 - hVar.f354386a;
                hVar.f354387b = 0L;
            }
            hVar.f354386a = android.os.SystemClock.elapsedRealtime();
        } else if (i17 != 4) {
            if (i17 == 5) {
                hVar.f354389d = hVar.f354388c;
                hVar.f354386a = android.os.SystemClock.elapsedRealtime();
                hVar.f354387b = 0L;
                hVar.f354391f = 0L;
                hVar.f354390e = 0L;
            } else if (i17 == 6) {
                hVar.f354389d = hVar.f354388c;
                hVar.f354387b = 0L;
                hVar.f354386a = 0L;
                hVar.f354391f = 0L;
                hVar.f354390e = 0L;
            } else if (i17 == 7) {
                hVar.f354389d = hVar.f354388c;
                hVar.f354387b = 0L;
                hVar.f354386a = 0L;
            }
        } else if (hVar.f354386a <= 0) {
            hVar.f354387b = 0L;
        } else {
            hVar.f354387b = android.os.SystemClock.elapsedRealtime();
        }
        this.f354444g = hVar.f354386a;
        this.f354445h = hVar.f354389d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s update positions end state[%d] ms[%d, %d]", j(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f354444g), java.lang.Long.valueOf(this.f354445h));
    }

    @Override // ph3.c
    public void pause() {
        m(4);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f354439b;
        n3Var.removeMessages(4);
        n3Var.obtainMessage(4).sendToTarget();
        if (this.f354451n != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f354440c;
            n3Var2.removeMessages(4);
            n3Var2.obtainMessage(4).sendToTarget();
        }
    }

    @Override // ph3.c
    public boolean prepare() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s player start to prepare ", j());
        this.f354439b.obtainMessage(1).sendToTarget();
        if (this.f354451n != null) {
            this.f354440c.obtainMessage(1).sendToTarget();
        }
        return true;
    }

    @Override // ph3.c
    public void release() {
        m(9);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f354441d;
        n3Var.removeMessages(2);
        n3Var.removeMessages(9);
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f354439b;
        n3Var2.removeMessages(1);
        n3Var2.removeMessages(2);
        n3Var2.removeMessages(3);
        n3Var2.removeMessages(4);
        n3Var2.removeMessages(6);
        n3Var2.removeCallbacksAndMessages(null);
        int i17 = j62.e.g().i("clicfg_video_player_release_direct_releasedecoder", 0, true, true);
        ph3.p pVar = this.f354449l;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s release directly release videoTrack decoder", j());
            try {
                pVar.t(9);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s isConfigureSurface [%b]", pVar.i(), java.lang.Boolean.valueOf(pVar.f354457x));
                if (pVar.f354457x && fp.h.b(19)) {
                    pVar.p();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoPlayerImpl", e17, "%s release error %s", j(), e17.toString());
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s release post to handler thread release videoTrack decoder", j());
            pVar.t(9);
        }
        n3Var2.removeMessages(7);
        n3Var2.obtainMessage(7).sendToTarget();
        com.tencent.mm.sdk.platformtools.n3 n3Var3 = this.f354440c;
        if (n3Var3 != null) {
            n3Var3.removeMessages(1);
            n3Var3.removeMessages(2);
            n3Var3.removeMessages(3);
            n3Var3.removeMessages(4);
            n3Var3.removeMessages(6);
            n3Var3.removeMessages(7);
            n3Var3.obtainMessage(7).sendToTarget();
        }
        ph3.h hVar = this.f354446i;
        hVar.f354386a = 0L;
        hVar.f354387b = 0L;
        hVar.f354388c = -1L;
        hVar.f354389d = 0L;
        hVar.f354390e = 0L;
        hVar.f354391f = 0L;
    }

    @Override // ph3.c
    public void setMute(boolean z17) {
        if (this.f354451n != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s play set mute[%b]", j(), java.lang.Boolean.valueOf(z17));
            this.f354451n.x(z17);
        }
    }

    @Override // ph3.c
    public void setSurface(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", j(), java.lang.Integer.valueOf(surface.hashCode()));
        this.f354449l.f354456w = surface;
    }

    @Override // ph3.c
    public void start() {
        m(3);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f354439b;
        n3Var.removeMessages(3);
        n3Var.obtainMessage(3).sendToTarget();
        if (this.f354451n != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f354440c;
            n3Var2.removeMessages(3);
            n3Var2.obtainMessage(3).sendToTarget();
        }
    }

    @Override // ph3.c
    public void stop() {
        m(8);
    }
}
