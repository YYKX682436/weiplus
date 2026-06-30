package ht0;

/* loaded from: classes10.dex */
public class c0 implements ht0.b {
    public ei3.k B;
    public final ls0.k F;
    public final android.opengl.EGLContext G;
    public final ms0.c H;
    public final int I;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f284664b;

    /* renamed from: h, reason: collision with root package name */
    public ht0.a f284670h;

    /* renamed from: i, reason: collision with root package name */
    public gs0.w f284671i;

    /* renamed from: j, reason: collision with root package name */
    public long f284672j;

    /* renamed from: k, reason: collision with root package name */
    public int f284673k;

    /* renamed from: l, reason: collision with root package name */
    public int f284674l;

    /* renamed from: q, reason: collision with root package name */
    public int f284679q;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f284686x;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f284663a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f284665c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f284666d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f284667e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f284668f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f284669g = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f284675m = 1600000;

    /* renamed from: n, reason: collision with root package name */
    public int f284676n = 480;

    /* renamed from: o, reason: collision with root package name */
    public int f284677o = 640;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.h f284680r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f284681s = null;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f284682t = null;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f284683u = null;

    /* renamed from: v, reason: collision with root package name */
    public final di3.c f284684v = new di3.c("yuvRecorderWriteData");

    /* renamed from: w, reason: collision with root package name */
    public final di3.c f284685w = new di3.c("frameCountCallback");

    /* renamed from: y, reason: collision with root package name */
    public boolean f284687y = false;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f284688z = "";
    public boolean A = false;
    public java.lang.Runnable C = null;
    public boolean D = false;
    public boolean E = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f284662J = false;
    public di3.o K = new ht0.u(this);

    /* renamed from: p, reason: collision with root package name */
    public final ei3.e1 f284678p = new ei3.e1();

    public c0(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, ms0.c cVar, android.opengl.EGLContext eGLContext, int i17) {
        this.f284673k = 480;
        this.f284674l = 640;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = -1;
        this.f284686x = videoTransPara;
        this.f284673k = videoTransPara.f71191d;
        this.f284674l = videoTransPara.f71192e;
        this.G = eGLContext;
        this.H = cVar;
        this.I = i17;
        this.F = new ls0.k(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 30L, 1L);
    }

    public static void A(ht0.c0 c0Var, android.graphics.Bitmap bitmap) {
        c0Var.getClass();
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "saveVideoThumbImpl with null bitmap");
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, c0Var.f284682t, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s %s", c0Var.f284682t, java.lang.Integer.valueOf(c0Var.f284679q), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(c0Var.f284682t)));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.X264MP4MuxRecorder", e17, "", new java.lang.Object[0]);
        }
    }

    public static boolean z(ht0.c0 c0Var) {
        c0Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gs0.w wVar = c0Var.f284671i;
        if (wVar == null) {
            return false;
        }
        int i17 = wVar.f275045o;
        c0Var.f284667e = (i17 * 1000.0f) / c0Var.f284666d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(c0Var.f284667e), java.lang.Integer.valueOf(c0Var.f284666d), c0Var.f284665c, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(c0Var.f284668f), java.lang.Float.valueOf(c0Var.f284669g));
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "frameCountCallback %s", c0Var.f284685w.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "yuvRecorderWriteDataCallback %s", c0Var.f284684v.c());
        java.lang.String accVideoPath = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null ? com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath() : !com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f284665c) ? new com.tencent.mm.vfs.r6(c0Var.f284665c).s().o() : null;
        java.lang.String l17 = !com.tencent.mm.sdk.platformtools.t8.K0(accVideoPath) ? ai3.d.l(accVideoPath) : c0Var.f284665c;
        int i18 = c0Var.f284666d;
        int i19 = c0Var.f284668f;
        int i27 = i19 > 0 ? i19 : i18;
        float f17 = c0Var.f284667e;
        float f18 = c0Var.f284669g;
        float f19 = f18 > 0.0f ? f18 : f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "muxResultPath : " + l17);
        ei3.l0 l0Var = new ei3.l0(c0Var.f284680r, l17, f19, c0Var.f284675m, i27, c0Var.f284686x.f71199o, c0Var.E, true, false);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean a17 = l0Var.a(c0Var.f284662J);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Boolean.valueOf(a17));
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "mux failed!");
            di3.x.e();
            return false;
        }
        c0Var.f284680r.c();
        c0Var.f284678p.a(ei3.l.Stop);
        c0Var.f284688z = com.tencent.mm.vfs.w6.p(l17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17) && !l17.equals(c0Var.f284665c)) {
            com.tencent.mm.vfs.w6.w(l17, c0Var.f284665c);
            com.tencent.mm.vfs.w6.h(l17);
        }
        return true;
    }

    public final boolean B(int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f284686x;
        this.f284675m = videoTransPara.f71194g;
        int i18 = this.f284673k;
        if (i18 % 2 != 0) {
            this.f284673k = i18 + 1;
        }
        int i19 = this.f284674l;
        if (i19 % 2 != 0) {
            this.f284674l = i19 + 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "real width:%d, height:%d", java.lang.Integer.valueOf(this.f284673k), java.lang.Integer.valueOf(this.f284674l));
        boolean a17 = com.tencent.mm.plugin.sight.base.c.a(true, videoTransPara.K == 1);
        this.f284662J = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "init useFFmpeg muxer:%s", java.lang.Boolean.valueOf(a17));
        com.tencent.mm.plugin.sight.base.h a18 = com.tencent.mm.plugin.sight.base.h.a(this.f284673k, this.f284674l, this.f284675m, videoTransPara.f71193f, videoTransPara.K == 1, this.f284662J);
        this.f284680r = a18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "init, bufId: %s", a18);
        com.tencent.mm.plugin.sight.base.h hVar = this.f284680r;
        if (hVar == null || hVar.f162415a < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "init failed!");
            return false;
        }
        this.f284679q = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "mTargetRate " + this.f284675m + "  videoParams.fps: " + videoTransPara.f71193f + " mTargetHeight:" + this.f284674l + " mTargetWidth:" + this.f284673k);
        this.f284671i = new gs0.w(this.f284680r, this.f284673k, this.f284674l);
        android.opengl.EGLContext eGLContext = this.G;
        int i27 = this.f284673k;
        int i28 = this.f284674l;
        ht0.v vVar = new ht0.v(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ls0.k kVar = this.F;
        sb6.append(kVar.hashCode());
        sb6.append(" initWithSize, eglContext: ");
        sb6.append(eGLContext);
        sb6.append(", callback: ");
        sb6.append(false);
        sb6.append(", width:");
        sb6.append(i27);
        sb6.append(", height:");
        sb6.append(i28);
        com.tencent.mars.xlog.Log.i(kVar.f320848b, sb6.toString());
        kVar.d(new ls0.b(eGLContext, kVar, i27, i28, vVar));
        kVar.f320852f = new ht0.x(this);
        C();
        ht0.a aVar = new ht0.a(videoTransPara.f71199o, videoTransPara.f71198n, videoTransPara.f71200p, com.tencent.mm.plugin.sight.base.c.a(true, videoTransPara.K == 1));
        this.f284670h = aVar;
        aVar.f253134k = this.D;
        int n17 = aVar.n(this.f284680r, com.tencent.mm.plugin.sight.base.e.a(this.f284665c));
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (n17 == 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264AACRecorderInitFailed");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 33L, 1L);
        return false;
    }

    public final void C() {
        int i17 = this.f284673k;
        int i18 = this.f284674l;
        ls0.k kVar = this.F;
        kVar.f320847a.t(i17, i18);
        int i19 = this.f284679q;
        ms0.c cVar = kVar.f320847a;
        cVar.r(i19);
        cVar.u(this.f284676n, this.f284677o);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f284676n), java.lang.Integer.valueOf(this.f284677o), java.lang.Integer.valueOf(this.f284679q));
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f284664b;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f284682t;
    }

    @Override // ei3.m
    public float c() {
        return this.f284667e;
    }

    @Override // ei3.m
    public void cancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "cancel record");
        synchronized (this.f284663a) {
            if (this.f284671i != null && (this.f284670h != null || this.E)) {
                this.f284678p.a(ei3.l.WaitStop);
                this.f284671i.d();
                ht0.a aVar = this.f284670h;
                if (aVar != null) {
                    aVar.f(new ht0.b0(this));
                }
                this.f284680r.c();
                this.f284678p.a(ei3.l.Stop);
                reset();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
        }
    }

    @Override // ei3.m
    public void clear() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "clear");
            ht0.a aVar = this.f284670h;
            if (aVar != null) {
                aVar.clear();
            }
            ls0.k kVar = this.F;
            if (kVar != null) {
                kVar.e();
            }
            this.f284680r.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.X264MP4MuxRecorder", e17, "clear error: %s", e17.getMessage());
        }
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f284666d / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f284669g = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f284665c = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        synchronized (this.f284663a) {
            this.C = runnable;
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", runnable);
            if (this.f284671i != null && (this.f284670h != null || this.E)) {
                ei3.e1 e1Var = this.f284678p;
                if (e1Var != null && e1Var.f253039a == ei3.l.Stop) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "stop, already in stop videoRecordStatus");
                    ht0.a aVar = this.f284670h;
                    if (aVar != null) {
                        aVar.clear();
                    }
                    if (runnable != null) {
                        com.tencent.mm.sdk.platformtools.u3.h(runnable);
                    }
                    return;
                }
                this.K = null;
                long j17 = this.f284672j;
                if (j17 > 0) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    this.f284666d = (int) (android.os.SystemClock.elapsedRealtime() - j17);
                }
                if (this.f284678p != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264StartWait");
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    rs0.p.f399311b = android.os.SystemClock.elapsedRealtime();
                    this.f284678p.a(ei3.l.PrepareStop);
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
            }
        }
    }

    @Override // ei3.m
    public java.lang.String getFilePath() {
        return this.f284665c;
    }

    @Override // ei3.m
    public di3.o getFrameDataCallback() {
        return this.K;
    }

    @Override // ei3.m
    public java.lang.String getMd5() {
        java.lang.String str = this.f284688z;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.A;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f284668f = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return false;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.f284687y) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264InitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 31L, 1L);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "preInit, cameraOrientation");
        boolean B = B(i17);
        this.f284687y = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(B));
        return B;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "resume, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        this.f284679q = i17;
        this.f284676n = i18;
        this.f284677o = i19;
        this.F.f320847a.r(i17);
        C();
        ei3.e1 e1Var = this.f284678p;
        if (e1Var == null || e1Var.f253039a != ei3.l.Pause) {
            return;
        }
        e1Var.a(ei3.l.Start);
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f284676n, this.f284677o);
    }

    @Override // ei3.m
    public long n() {
        synchronized (this.f284663a) {
            long j17 = this.f284672j;
            if (j17 <= 0) {
                return 0L;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return android.os.SystemClock.elapsedRealtime() - j17;
        }
    }

    @Override // ht0.b
    public void o() {
        if (this.I < 0) {
            return;
        }
        ei3.e1 e1Var = this.f284678p;
        ei3.l lVar = e1Var.f253039a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar == lVar2 || lVar == lVar3) {
            if (lVar == lVar3) {
                e1Var.f253039a = ei3.l.WaitStop;
            }
            this.f284685w.a(1L);
            ht0.a aVar = this.f284670h;
            if (aVar != null) {
                aVar.f253133j = true;
            }
            int i17 = this.I;
            long nanoTime = java.lang.System.nanoTime();
            ls0.k kVar = this.F;
            kVar.getClass();
            kVar.d(new ls0.g(kVar, i17, false, 0L, false, nanoTime));
            this.f284684v.a(1L);
        }
    }

    @Override // ei3.m
    public tl.c p() {
        ht0.a aVar = this.f284670h;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    @Override // ei3.m
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "pause");
        ei3.e1 e1Var = this.f284678p;
        if (e1Var == null || e1Var.f253039a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f284683u;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 % 16 != 0) {
            i19 = ai3.d.a(i19);
        }
        if (i27 % 16 != 0) {
            i27 = ai3.d.a(i27);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f284676n = i17;
        this.f284677o = i18;
    }

    @Override // ei3.m
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", this.f284671i, this.f284670h, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s", this.f284671i, this.f284670h);
        synchronized (this.f284663a) {
            this.f284671i = null;
        }
        this.f284670h = null;
        this.f284687y = false;
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f284683u = str;
    }

    @Override // ei3.m
    public void setMirror(boolean z17) {
    }

    @Override // ei3.m
    public void setMute(boolean z17) {
        this.E = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f284678p.f253039a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.B = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.D = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f284682t = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f284679q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.f284684v.d();
        int i19 = 0;
        this.f284666d = 0;
        this.f284685w.d();
        this.A = z17;
        this.f284678p.a(ei3.l.WaitStart);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f284665c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f284664b = com.tencent.mm.vfs.w6.q(this.f284665c);
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(this.f284665c);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            this.f284681s = r17 + "tempRotate.mp4";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "retrieve file name error: %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", this.f284665c, this.f284681s);
        this.f284679q = i17;
        if (!this.f284687y) {
            B(i17);
            this.f284687y = true;
        }
        synchronized (this.f284663a) {
            rs0.h hVar = this.F.f320851e;
            is0.c g17 = this.H.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start videoEncoder, environment:%s, videoTexture:%s", hVar, java.lang.Integer.valueOf(this.I));
            if (hVar != null && g17 != null) {
                this.f284671i.c(hVar, g17.f294395e, this.f284673k, this.f284674l);
            }
            this.f284672j = android.os.SystemClock.elapsedRealtime();
        }
        if (this.E || this.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start yuvRecorder with mute");
            this.f284678p.a(ei3.l.Start);
        } else {
            i19 = this.f284670h.b(new ht0.y(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start aacRecorder ret: %s", java.lang.Integer.valueOf(i19));
            ei3.e1 e1Var = this.f284678p;
            if (i19 != 0) {
                e1Var.a(ei3.l.Error);
            } else {
                e1Var.a(ei3.l.Initialized);
            }
        }
        return i19;
    }
}
