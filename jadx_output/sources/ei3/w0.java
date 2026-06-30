package ei3;

/* loaded from: classes10.dex */
public class w0 implements ei3.m {
    public final com.tencent.mm.modelcontrol.VideoTransPara B;
    public ei3.k H;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f253162b;

    /* renamed from: h, reason: collision with root package name */
    public ei3.j f253168h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ei3.z0 f253169i;

    /* renamed from: j, reason: collision with root package name */
    public ei3.l0 f253170j;

    /* renamed from: k, reason: collision with root package name */
    public int f253171k;

    /* renamed from: l, reason: collision with root package name */
    public int f253172l;

    /* renamed from: m, reason: collision with root package name */
    public final int f253173m;

    /* renamed from: p, reason: collision with root package name */
    public final ei3.e1 f253176p;

    /* renamed from: q, reason: collision with root package name */
    public int f253177q;

    /* renamed from: r, reason: collision with root package name */
    public int f253178r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.HandlerThread f253179s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f253180t;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f253161a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f253163c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f253164d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f253165e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f253166f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f253167g = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f253174n = 480;

    /* renamed from: o, reason: collision with root package name */
    public int f253175o = 640;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f253181u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f253182v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f253183w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f253184x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f253185y = null;

    /* renamed from: z, reason: collision with root package name */
    public final di3.c f253186z = new di3.c("yuvRecorderWriteData");
    public final di3.c A = new di3.c("frameCountCallback");
    public boolean C = false;
    public boolean D = false;
    public java.lang.String E = "";
    public boolean F = false;
    public int G = 0;
    public java.lang.Runnable I = null;

    /* renamed from: J, reason: collision with root package name */
    public boolean f253160J = false;
    public final boolean K = true;
    public boolean L = false;
    public di3.o M = new ei3.m0(this);

    public w0(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        this.f253171k = 480;
        this.f253172l = 640;
        this.f253173m = 1600000;
        this.B = videoTransPara;
        this.f253171k = videoTransPara.f71191d;
        this.f253172l = videoTransPara.f71192e;
        int i17 = videoTransPara.f71194g;
        this.f253173m = i17;
        int i18 = di3.w.f232770d.f232703d;
        if (i18 == -1) {
            this.f253173m = i17;
        } else {
            this.f253173m = i18;
        }
        this.f253176p = new ei3.e1();
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f253162b;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f253184x;
    }

    @Override // ei3.m
    public float c() {
        return this.f253165e;
    }

    @Override // ei3.m
    public void cancel() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "cancel record");
        if (this.f253169i == null || (this.f253168h == null && !this.L)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            return;
        }
        this.f253176p.a(ei3.l.WaitStop);
        this.f253169i.f(null);
        ei3.j jVar = this.f253168h;
        if (jVar != null) {
            jVar.f(new ei3.u0(this));
        }
        if (this.f253179s != null && (n3Var = this.f253180t) != null) {
            n3Var.removeMessages(0);
            this.f253179s.quit();
            this.f253180t = null;
        }
        com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253178r);
        this.f253176p.a(ei3.l.Stop);
        reset();
    }

    @Override // ei3.m
    public void clear() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "clear");
            ei3.j jVar = this.f253168h;
            if (jVar != null) {
                jVar.clear();
            }
            if (this.f253169i != null) {
                ei3.z0 z0Var = this.f253169i;
                z0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
                z0Var.b();
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(z0Var.D);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightMediaCodecMP4MuxRecorder", e17, "clear error: %s", e17.getMessage());
        }
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f253164d / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f253167g = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f253163c = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        this.I = runnable;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", runnable);
        if (this.f253169i == null || (this.f253168h == null && !this.L)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return;
            }
            return;
        }
        ei3.e1 e1Var = this.f253176p;
        if (e1Var != null && e1Var.f253039a == ei3.l.Stop) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, already in stop status");
            ei3.j jVar = this.f253168h;
            if (jVar != null) {
                jVar.clear();
            }
            if (this.f253169i != null) {
                ei3.z0 z0Var = this.f253169i;
                z0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
                z0Var.b();
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(z0Var.D);
            }
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return;
            }
            return;
        }
        this.M = null;
        ei3.z0 z0Var2 = this.f253169i;
        long j17 = 0;
        if (z0Var2.f253006h <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
        } else {
            j17 = (java.lang.System.nanoTime() - z0Var2.f253006h) / 1000000;
        }
        this.f253164d = (int) j17;
        ei3.e1 e1Var2 = this.f253176p;
        if (e1Var2 != null) {
            e1Var2.a(ei3.l.PrepareStop);
        }
        if (this.f253169i != null) {
            this.f253169i.f(new ei3.p0(this));
        }
        ei3.j jVar2 = this.f253168h;
        if (jVar2 != null) {
            jVar2.f(new ei3.q0(this));
        }
    }

    @Override // ei3.m
    public java.lang.String getFilePath() {
        return this.f253163c;
    }

    @Override // ei3.m
    public di3.o getFrameDataCallback() {
        return this.M;
    }

    @Override // ei3.m
    public java.lang.String getMd5() {
        java.lang.String str = this.E;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.F;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f253166f = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return this.D;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.C) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preInit, cameraOrientation");
        boolean z17 = z(i17);
        this.C = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        ei3.e1 e1Var = this.f253176p;
        if (e1Var == null || e1Var.f253039a != ei3.l.Pause) {
            return;
        }
        if (this.f253169i != null) {
            ei3.z0 z0Var = this.f253169i;
            z0Var.f253017s = i17;
            z0Var.f253018t = i18;
            z0Var.f253019u = i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "resume, newRotation: %s, newFrameWidth: %s, newFrameHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f253176p.a(ei3.l.Start);
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f253174n, this.f253175o);
    }

    @Override // ei3.m
    public long n() {
        if (this.f253169i == null) {
            return 0L;
        }
        ei3.z0 z0Var = this.f253169i;
        if (z0Var.f253006h > 0) {
            return (java.lang.System.nanoTime() - z0Var.f253006h) / 1000000;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
        return 0L;
    }

    @Override // ei3.m
    public tl.c p() {
        ei3.j jVar = this.f253168h;
        if (jVar != null) {
            return jVar.e();
        }
        return null;
    }

    @Override // ei3.m
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "pause");
        ei3.e1 e1Var = this.f253176p;
        if (e1Var == null || e1Var.f253039a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f253185y;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f253171k = i19;
        this.f253172l = i27;
        this.f253174n = i17;
        this.f253175o = i18;
        ei3.x.f253187d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", this.f253169i, this.f253168h, this.f253170j);
        synchronized (this.f253161a) {
            this.f253169i = null;
        }
        this.f253168h = null;
        this.f253170j = null;
        this.C = false;
        this.D = false;
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f253185y = str;
    }

    @Override // ei3.m
    public void setMute(boolean z17) {
        this.L = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f253176p.f253039a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.H = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.f253160J = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f253184x = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f253177q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.f253186z.d();
        this.f253164d = 0;
        this.A.d();
        this.f253183w = false;
        this.F = z17;
        this.G = i18;
        this.f253176p.a(ei3.l.WaitStart);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f253163c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f253162b = com.tencent.mm.vfs.w6.q(this.f253163c);
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(this.f253163c);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            this.f253181u = r17 + "tempRotate.mp4";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "retrieve file name error: %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", this.f253163c, this.f253181u);
        this.f253177q = i17;
        java.lang.String str = "BigSightMediaCodecMP4MuxRecorder_writeYuvData_" + hashCode();
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, -1);
        this.f253179s = a17;
        a17.start();
        this.f253180t = new ei3.n0(this, this.f253179s.getLooper());
        if (!this.C) {
            z(i17);
            this.C = true;
        }
        if (this.L || this.f253160J) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start yuvRecorder with mute");
            this.f253169i.e();
            this.f253176p.a(ei3.l.Start);
            this.D = false;
            di3.x.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 2L, 1L, false);
            return 0;
        }
        int b17 = this.f253168h.b(new ei3.o0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", java.lang.Integer.valueOf(b17));
        this.D = false;
        ei3.e1 e1Var = this.f253176p;
        if (b17 != 0) {
            e1Var.a(ei3.l.Error);
        } else {
            e1Var.a(ei3.l.Initialized);
        }
        di3.x.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 2L, 1L, false);
        return b17;
    }

    public final boolean z(int i17) {
        int i18;
        int i19;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f253182v = di3.w.f232770d.f232704e;
        int i27 = this.f253173m;
        int i28 = this.f253174n;
        int i29 = this.f253175o;
        int i37 = this.f253171k;
        int i38 = this.f253172l;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.B;
        int initDataBufferForMMSightLock = com.tencent.mm.plugin.sight.base.SightVideoJNI.initDataBufferForMMSightLock(i28, i29, i17, i37, i38, videoTransPara.f71193f, i27, videoTransPara.f71202r, 8, videoTransPara.f71201q, 23.0f, videoTransPara.N, 0, false, false, videoTransPara.f71195h, false, false, false);
        this.f253178r = initDataBufferForMMSightLock;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init, bufId: %s", java.lang.Integer.valueOf(initDataBufferForMMSightLock));
        if (this.f253178r < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init failed!");
            di3.x.d();
            return false;
        }
        this.f253177q = i17;
        int i39 = this.f253174n;
        int i47 = this.f253175o;
        int i48 = this.f253171k;
        int i49 = this.f253172l;
        int i57 = this.f253173m;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = this.B;
        this.f253169i = new ei3.z0(i39, i47, i48, i49, i57, videoTransPara2.f71197m, videoTransPara2.f71193f, this.f253182v);
        ei3.z0 z0Var = this.f253169i;
        z0Var.D = this.f253178r;
        try {
            z0Var.f253016r = i17;
            i18 = z0Var.d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "init error: %s, try to re-init again", e17.getMessage());
            try {
                if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null) {
                    com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().set(com.tencent.mm.storage.u3.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, -1);
                }
                i18 = z0Var.d();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "re-init again error: %s", e18.getMessage());
                di3.x.f();
                i18 = -1;
            }
        }
        if (!this.L) {
            int i58 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null ? com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1) : -1;
            if (i58 < 0) {
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara3 = this.B;
                ei3.p pVar = new ei3.p(videoTransPara3.f71199o, videoTransPara3.f71198n, videoTransPara3.f71200p, com.tencent.mm.plugin.sight.base.c.a(false, videoTransPara3.K == 1));
                this.f253168h = pVar;
                pVar.a(this.f253160J);
                int c17 = this.f253168h.c(this.f253178r, com.tencent.mm.plugin.sight.base.e.a(this.f253163c));
                if (i18 < 0 || c17 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(c17));
                    if (c17 < 0 && i18 >= 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac init error, try mediarecorder now");
                        this.f253168h.clear();
                        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara4 = this.B;
                        ei3.w wVar = new ei3.w(videoTransPara4.f71199o, videoTransPara4.f71198n, videoTransPara4.f71200p);
                        this.f253168h = wVar;
                        wVar.a(this.f253160J);
                        int c18 = this.f253168h.c(this.f253178r, com.tencent.mm.plugin.sight.base.e.a(this.f253163c));
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "MMSightAACMediaRecorder init ret: %s", java.lang.Integer.valueOf(c18));
                        if (c18 >= 0) {
                            return true;
                        }
                    }
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253178r);
                    di3.x.d();
                    return false;
                }
            } else {
                if (i58 == 1) {
                    com.tencent.mm.modelcontrol.VideoTransPara videoTransPara5 = this.B;
                    ei3.p pVar2 = new ei3.p(videoTransPara5.f71199o, videoTransPara5.f71198n, videoTransPara5.f71200p, com.tencent.mm.plugin.sight.base.c.a(false, videoTransPara5.K == 1));
                    this.f253168h = pVar2;
                    pVar2.a(this.f253160J);
                    i19 = this.f253168h.c(this.f253178r, com.tencent.mm.plugin.sight.base.e.a(this.f253163c));
                } else if (i58 == 2) {
                    com.tencent.mm.modelcontrol.VideoTransPara videoTransPara6 = this.B;
                    ei3.w wVar2 = new ei3.w(videoTransPara6.f71199o, videoTransPara6.f71198n, videoTransPara6.f71200p);
                    this.f253168h = wVar2;
                    wVar2.a(this.f253160J);
                    i19 = this.f253168h.c(this.f253178r, com.tencent.mm.plugin.sight.base.e.a(this.f253163c));
                } else {
                    i19 = 0;
                }
                if (i18 < 0 || i19 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253178r);
                    di3.x.d();
                    return false;
                }
            }
        } else if (i18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mute init yuv recorder error!! %d %d", java.lang.Integer.valueOf(i18), 0);
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253178r);
            di3.x.d();
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return true;
    }
}
