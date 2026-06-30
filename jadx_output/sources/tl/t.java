package tl;

/* loaded from: classes12.dex */
public class t implements tl.b {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.Object f420119x = new java.lang.Object();

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.Object f420120y = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public tl.a f420125e;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f420131k;

    /* renamed from: o, reason: collision with root package name */
    public android.media.MediaRecorder f420135o;

    /* renamed from: q, reason: collision with root package name */
    public final to.c f420137q;

    /* renamed from: r, reason: collision with root package name */
    public tl.s f420138r;

    /* renamed from: s, reason: collision with root package name */
    public long f420139s;

    /* renamed from: a, reason: collision with root package name */
    public int f420121a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f420122b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f420123c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public yl.g f420124d = null;

    /* renamed from: f, reason: collision with root package name */
    public n21.f f420126f = null;

    /* renamed from: g, reason: collision with root package name */
    public n21.g f420127g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f420128h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f420129i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f420130j = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f420132l = 8000;

    /* renamed from: m, reason: collision with root package name */
    public int f420133m = 16000;

    /* renamed from: n, reason: collision with root package name */
    public boolean f420134n = false;

    /* renamed from: p, reason: collision with root package name */
    public tl.w f420136p = null;

    /* renamed from: t, reason: collision with root package name */
    public final tl.r f420140t = new tl.r(this, 1500);

    /* renamed from: u, reason: collision with root package name */
    public final fp.j f420141u = new fp.j();

    /* renamed from: v, reason: collision with root package name */
    public final tl.v f420142v = new tl.n(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f420143w = false;

    public t(to.c cVar) {
        this.f420131k = false;
        this.f420139s = -1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "MMAudioRecorder recMode: " + cVar);
        this.f420137q = cVar;
        boolean z17 = tl.w0.f420175b;
        to.c cVar2 = to.c.AMR;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "can't use silk encode, force to use amr mode now");
            this.f420137q = cVar2;
        }
        if (this.f420137q == cVar2) {
            this.f420135o = new gp.e();
        } else {
            b();
        }
        this.f420139s = -1L;
        this.f420131k = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r2) > 500) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a() {
        /*
            r6 = this;
            to.c r0 = to.c.AMR
            r1 = 0
            to.c r2 = r6.f420137q
            if (r2 != r0) goto L11
            android.media.MediaRecorder r0 = r6.f420135o
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int r0 = r0.getMaxAmplitude()
            return r0
        L11:
            tl.s r0 = r6.f420138r
            tl.s r2 = tl.s.RECORDING
            if (r0 != r2) goto L4a
            int r0 = r6.f420121a
            long r2 = r6.f420139s
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2e
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            r2 = 500(0x1f4, double:2.47E-321)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L47
        L2e:
            int r2 = r6.f420121a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "MicroMsg.MMAudioRecorder"
            java.lang.String r4 = "mCurAmplitude:%s"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r6.f420139s = r2
        L47:
            r6.f420121a = r1
            return r0
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.t.a():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r0.f334263k.nextInt(r4) != (r4 / 2)) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.t.b():void");
    }

    public void c() {
        if (this.f420137q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f420135o;
            if (mediaRecorder != null) {
                mediaRecorder.prepare();
                return;
            }
            return;
        }
        if (this.f420138r == tl.s.INITIALIZING && this.f420122b != null) {
            this.f420138r = tl.s.READY;
        } else {
            this.f420138r = tl.s.ERROR;
            d();
        }
    }

    public void d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "release curState:%s, pcmRecorder:%s", this.f420138r, this.f420136p);
        if (this.f420137q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f420135o;
            if (mediaRecorder != null) {
                mediaRecorder.release();
                return;
            }
            return;
        }
        if (this.f420138r == tl.s.RECORDING) {
            h();
        }
        synchronized (f420120y) {
            this.f420131k = false;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new tl.j(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "release finished cost:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void e(tl.a aVar) {
        if (this.f420137q != to.c.AMR) {
            if (this.f420138r == tl.s.INITIALIZING) {
                this.f420125e = aVar;
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioRecorder", "setOnErrorListener on wrong state");
                return;
            }
        }
        android.media.MediaRecorder mediaRecorder = this.f420135o;
        if (mediaRecorder == null) {
            return;
        }
        this.f420125e = aVar;
        mediaRecorder.setOnErrorListener(new tl.i(this));
    }

    public void f(java.lang.String str) {
        if (this.f420137q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f420135o;
            if (mediaRecorder == null) {
                return;
            }
            mediaRecorder.setOutputFile(str);
            this.f420122b = str;
            return;
        }
        if (this.f420138r != tl.s.INITIALIZING) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioRecorder", "set output path on wrong state");
            this.f420138r = tl.s.ERROR;
            return;
        }
        this.f420122b = str;
        tl.w wVar = this.f420136p;
        if (wVar != null) {
            wVar.F = str;
        }
    }

    public void g() {
        if (this.f420137q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f420135o;
            if (mediaRecorder != null) {
                mediaRecorder.start();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "Start record now state: " + this.f420138r + " recMode: " + this.f420137q);
        if (this.f420138r == tl.s.READY) {
            this.f420129i = java.lang.System.currentTimeMillis();
            this.f420130j = 0;
            this.f420138r = tl.s.RECORDING;
            if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
                this.f420140t.c(0L, 300L);
            }
            synchronized (f420119x) {
                this.f420136p.k();
            }
        } else {
            gm0.j1.i();
            gm0.j1.u().f273148a.f(27, 1);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioRecorder", "start() called on illegal state");
            this.f420138r = tl.s.ERROR;
        }
        this.f420131k = false;
    }

    public boolean h() {
        boolean z17;
        if (this.f420137q == to.c.AMR) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "stop sysMediaRecorder: %s", this.f420135o);
            android.media.MediaRecorder mediaRecorder = this.f420135o;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.f420135o.release();
                this.f420135o = null;
            }
            return true;
        }
        fp.j jVar = new fp.j();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "stop now state: " + this.f420138r);
        if (this.f420138r == tl.s.INITIALIZING) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(357L, 53L, 1L, true);
            if (!this.f420143w) {
                g0Var.idkeyStat(357L, 54L, 1L, true);
            }
            this.f420143w = true;
        }
        if (this.f420138r != tl.s.RECORDING) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioRecorder", "stop() called on illegal state");
            this.f420138r = tl.s.ERROR;
            return true;
        }
        synchronized (f420119x) {
            if (this.f420136p != null) {
                this.f420131k = true;
            } else {
                this.f420131k = false;
            }
        }
        long a17 = jVar.a();
        this.f420138r = tl.s.STOPPED;
        long a18 = jVar.a();
        synchronized (f420120y) {
            z17 = this.f420131k;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).g(new tl.o(this));
        }
        synchronized (this.f420123c) {
            yl.g gVar = this.f420124d;
            if (gVar != null) {
                gVar.d();
            }
            n21.f fVar = this.f420126f;
            if (fVar != null) {
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SpeexEncoderWorker", "stop ");
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new n21.e(fVar));
            }
        }
        long j17 = this.f420129i;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "toNow " + currentTimeMillis + " startTickCnt: " + this.f420129i + " pcmDataReadedCnt: " + this.f420130j);
        if (currentTimeMillis > 2000 && this.f420130j == 0) {
            gm0.j1.i();
            gm0.j1.u().f273148a.f(27, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "16k not suppourt");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "Wait Stop Time Media:" + a17 + " Read:" + a18 + " Thr:" + jVar.a());
        return false;
    }
}
