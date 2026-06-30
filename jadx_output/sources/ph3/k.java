package ph3;

/* loaded from: classes14.dex */
public class k implements ph3.c {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Looper f354423a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f354424b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.HandlerThread f354425c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f354426d;

    /* renamed from: e, reason: collision with root package name */
    public final xu5.b f354427e;

    /* renamed from: f, reason: collision with root package name */
    public ph3.o f354428f;

    /* renamed from: g, reason: collision with root package name */
    public ph3.d f354429g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f354430h;

    public k(android.os.Looper looper, boolean z17, int i17) {
        ph3.j jVar = new ph3.j(this);
        this.f354430h = jVar;
        xu5.b a17 = xu5.b.a("VideoPlayer:inner");
        this.f354427e = a17;
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a18 = pu5.f.a("VideoPlayer:video", 10);
        this.f354425c = a18;
        a18.start();
        if (!z17) {
            android.os.HandlerThread a19 = pu5.f.a("VideoPlayer:audio", 10);
            this.f354426d = a19;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "VideoPlayer init 4");
            a19.start();
        }
        this.f354423a = looper;
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(this.f354423a, jVar);
        this.f354424b = n3Var;
        this.f354428f = new ph3.o(n3Var, a17, this.f354425c.getLooper(), this.f354426d.getLooper(), z17, i17);
    }

    public static void j(ph3.k kVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "%s clear now.", kVar.m());
        kVar.f354427e.f457303b.g();
        kVar.f354425c.quitSafely();
        android.os.HandlerThread handlerThread = kVar.f354426d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        kVar.f354424b.removeMessages(1);
        kVar.f354424b.removeMessages(2);
        kVar.f354424b.removeMessages(3);
        kVar.f354424b.removeMessages(4);
        kVar.f354424b.removeMessages(5);
        kVar.f354425c = null;
        kVar.f354424b = null;
        kVar.f354423a = null;
        kVar.f354429g = null;
        kVar.f354428f = null;
    }

    @Override // ph3.c
    public void a(int i17) {
        this.f354428f.a(i17);
    }

    @Override // ph3.c
    public void c(float f17) {
        ph3.o oVar = this.f354428f;
        if (oVar != null) {
            oVar.c(f17);
        }
    }

    @Override // ph3.c
    public long getDurationMs() {
        return this.f354428f.f354443f;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "%s video player set path %s", m(), str);
        this.f354428f.h(str);
    }

    public void k(android.view.Surface surface) {
        if (surface != null) {
            ph3.o oVar = this.f354428f;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s change surface[%d] ", oVar.j(), java.lang.Integer.valueOf(surface.hashCode()));
            ph3.p pVar = oVar.f354449l;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s set out put surface", pVar.i());
            pVar.f354456w = surface;
            if (!fp.h.c(23)) {
                pVar.v();
                return;
            }
            try {
                wo.i1 i1Var = pVar.f354415o;
                if (i1Var != null) {
                    android.view.Surface surface2 = pVar.f354456w;
                    try {
                        wo.k1.a(81);
                        i1Var.f447719a.setOutputSurface(surface2);
                        wo.k1.a(82);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy setOutputSurface", new java.lang.Object[0]);
                        wo.i1.u(34, e17, i1Var.f447720b);
                        throw e17;
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTrackDataSource", e18, "%s change surface23 error [%s]", pVar.i(), e18.toString());
                pVar.v();
            }
        }
    }

    public int l() {
        ph3.h hVar;
        ph3.o oVar = this.f354428f;
        int i17 = 0;
        if (oVar != null && (hVar = oVar.f354446i) != null) {
            i17 = (int) (hVar.f354390e / 1000);
            int i18 = (int) hVar.f354388c;
            if (i18 != -1) {
                i17 = java.lang.Math.max(i17, i18);
            }
            long j17 = i17;
            long j18 = hVar.f354391f / 1000;
            if (j17 < j18) {
                i17 = (int) j18;
            }
            if (i17 != oVar.f354452o) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s get curr play ms %d time[%d %d]", oVar.j(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(hVar.f354390e), java.lang.Long.valueOf(hVar.f354391f));
            }
            oVar.f354452o = i17;
        }
        return i17;
    }

    public java.lang.String m() {
        ph3.o oVar = this.f354428f;
        return oVar != null ? oVar.j() : "has no player!";
    }

    public boolean n() {
        ph3.o oVar = this.f354428f;
        if (oVar == null) {
            return false;
        }
        int i17 = oVar.f354447j;
        return i17 == 3 || i17 == 5 || i17 == 6;
    }

    public void o(int i17, boolean z17) {
        ph3.o oVar = this.f354428f;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s seek to [%d] is precision[%b]", oVar.j(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.VideoPlayerImpl", "seek stack", new java.lang.Object[0]);
        if (oVar.f354447j < 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayerImpl", "%s player is not ready[%d], how to seek[%d]?", oVar.j(), java.lang.Integer.valueOf(oVar.f354447j), java.lang.Integer.valueOf(i17));
            return;
        }
        oVar.f354449l.l();
        com.tencent.mm.sdk.platformtools.n3 n3Var = oVar.f354439b;
        n3Var.removeMessages(4);
        ph3.a aVar = oVar.f354451n;
        if (aVar != null) {
            aVar.l();
            oVar.f354440c.removeMessages(4);
        }
        if (i17 < oVar.f354443f) {
            n3Var.obtainMessage(8).sendToTarget();
            n3Var.obtainMessage(5, new int[]{i17, z17 ? 1 : 0}).sendToTarget();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "seekTo %d, duration %d ", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(oVar.f354443f));
            oVar.m(6);
            oVar.f354441d.obtainMessage(9).sendToTarget();
        }
    }

    public void p(boolean z17) {
        ph3.h hVar;
        ph3.o oVar = this.f354428f;
        if (oVar == null || (hVar = oVar.f354446i) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s set is online video type [%b]", oVar.j(), java.lang.Boolean.valueOf(z17));
        hVar.f354395j = z17;
    }

    @Override // ph3.c
    public void pause() {
        if (com.tencent.mars.xlog.Log.getLogLevel() >= 1) {
            m();
            int i17 = this.f354428f.f354447j;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        }
        ph3.o oVar = this.f354428f;
        int i18 = oVar.f354447j;
        if (!(i18 == 6)) {
            if (!(i18 == 5)) {
                oVar.pause();
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayer", "%s it seek now, do not response pause event.", m());
    }

    @Override // ph3.c
    public boolean prepare() {
        this.f354428f.prepare();
        return true;
    }

    public void q(boolean z17) {
        ph3.o oVar = this.f354428f;
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s setNeedResetExtractor [%b]", oVar.j(), java.lang.Boolean.valueOf(z17));
            ph3.h hVar = oVar.f354446i;
            if (hVar != null) {
                hVar.f354394i = z17;
            }
        }
    }

    @Override // ph3.c
    public void release() {
        try {
            this.f354428f.release();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // ph3.c
    public void setMute(boolean z17) {
        try {
            ph3.o oVar = this.f354428f;
            if (oVar != null) {
                oVar.setMute(z17);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // ph3.c
    public void setSurface(android.view.Surface surface) {
        if (surface != null) {
            this.f354428f.setSurface(surface);
        }
    }

    @Override // ph3.c
    public void start() {
        if (com.tencent.mars.xlog.Log.getLogLevel() >= 1) {
            m();
            int i17 = this.f354428f.f354447j;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        }
        ph3.o oVar = this.f354428f;
        int i18 = oVar.f354447j;
        if (!(i18 == 6)) {
            if (!(i18 == 5)) {
                oVar.start();
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayer", "%s it seek now, do not response start event.", m());
    }

    @Override // ph3.c
    public void stop() {
        this.f354428f.stop();
    }
}
