package ht0;

/* loaded from: classes10.dex */
public class s implements ht0.b {

    /* renamed from: a0, reason: collision with root package name */
    public static final java.lang.Object f284751a0 = new java.lang.Object();
    public java.lang.String A;
    public boolean B;
    public int C;
    public ei3.k D;
    public java.lang.Runnable E;
    public boolean F;
    public boolean G;
    public final h90.z H;
    public final ls0.k I;

    /* renamed from: J, reason: collision with root package name */
    public final android.opengl.EGLContext f284752J;
    public int K;
    public long L;
    public long M;
    public boolean N;
    public double O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public yz5.a X;
    public final java.lang.Runnable Y;
    public final di3.o Z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f284753a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f284754b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f284755c;

    /* renamed from: d, reason: collision with root package name */
    public int f284756d;

    /* renamed from: e, reason: collision with root package name */
    public float f284757e;

    /* renamed from: f, reason: collision with root package name */
    public int f284758f;

    /* renamed from: g, reason: collision with root package name */
    public float f284759g;

    /* renamed from: h, reason: collision with root package name */
    public ht0.a f284760h;

    /* renamed from: i, reason: collision with root package name */
    public gs0.b f284761i;

    /* renamed from: j, reason: collision with root package name */
    public int f284762j;

    /* renamed from: k, reason: collision with root package name */
    public int f284763k;

    /* renamed from: l, reason: collision with root package name */
    public int f284764l;

    /* renamed from: m, reason: collision with root package name */
    public int f284765m;

    /* renamed from: n, reason: collision with root package name */
    public int f284766n;

    /* renamed from: o, reason: collision with root package name */
    public ei3.e1 f284767o;

    /* renamed from: p, reason: collision with root package name */
    public int f284768p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.h f284769q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f284770r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f284771s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f284772t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f284773u;

    /* renamed from: v, reason: collision with root package name */
    public final di3.c f284774v;

    /* renamed from: w, reason: collision with root package name */
    public final di3.c f284775w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f284776x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f284777y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f284778z;

    public s(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, ms0.c cVar, android.opengl.EGLContext eGLContext, int i17, h90.z zVar) {
        this.f284753a = new java.lang.Object();
        this.f284755c = "";
        this.f284756d = 0;
        this.f284757e = 0.0f;
        this.f284758f = -1;
        this.f284759g = -1.0f;
        this.f284762j = 480;
        this.f284763k = 640;
        this.f284764l = 1600000;
        this.f284765m = 480;
        this.f284766n = 640;
        this.f284769q = null;
        this.f284770r = false;
        this.f284771s = null;
        this.f284772t = null;
        this.f284773u = null;
        this.f284774v = new di3.c("yuvRecorderWriteData");
        this.f284775w = new di3.c("frameCountCallback");
        this.f284777y = false;
        this.f284778z = false;
        this.A = "";
        this.B = false;
        this.C = 0;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = null;
        this.f284752J = null;
        this.K = -1;
        this.L = 0L;
        this.M = 0L;
        this.N = false;
        this.O = 0.0d;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = false;
        new java.util.LinkedList();
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.Y = new ht0.f(this);
        this.Z = new ht0.g(this);
        z(videoTransPara);
        this.H = zVar;
        this.f284752J = eGLContext;
        this.I = new ls0.k(cVar);
        this.K = i17;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] textureId : " + i17, new java.lang.Object[0]);
    }

    public boolean A() {
        ei3.e1 e1Var = this.f284767o;
        ei3.l lVar = e1Var.f253039a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar != lVar2 && lVar != lVar3) {
            return false;
        }
        if (lVar == lVar3) {
            e1Var.f253039a = ei3.l.WaitStop;
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] forward one more frame", new java.lang.Object[0]);
        }
        ht0.a aVar = this.f284760h;
        if (aVar != null) {
            aVar.f253133j = true;
        }
        this.f284775w.a(1L);
        this.f284774v.a(1L);
        return true;
    }

    public final boolean B(int i17) {
        com.tencent.mm.plugin.sight.base.h hVar;
        this.W = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f284776x;
        this.f284764l = videoTransPara.f71194g;
        es0.d dVar = new es0.d(videoTransPara.f71190J == 1);
        if (dVar.f256319i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] encodeConfig  InitError");
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecYUVInitError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 26L, 1L);
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(dVar.f256324n, "video/hevc");
        this.f284770r = b17;
        if (b17) {
            j62.e g17 = j62.e.g();
            e42.c0 c0Var = e42.c0.clicfg_mb_reward_ad_log_max_length_android;
            java.lang.String a17 = g17.a("clicfg_c2c_capture_hevc_bitrate_ratio", "0.75", true, true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                try {
                    this.f284764l = (int) (this.f284764l * java.lang.Float.parseFloat(a17));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init failed, stringRatio: " + a17 + " error: " + e17.getMessage());
                }
            }
        }
        int i18 = this.f284762j;
        int i19 = this.f284763k;
        int i27 = this.f284764l;
        float f17 = this.f284776x.f71193f;
        boolean a18 = com.tencent.mm.plugin.sight.base.c.a(false, this.f284770r);
        synchronized (com.tencent.mm.plugin.sight.base.h.f162414c) {
            hVar = new com.tencent.mm.plugin.sight.base.h(com.tencent.mm.plugin.sight.base.SightVideoJNI.initDataBufferForCapture(i18, i19, false, i27, f17, -1, -1, -1, -1.0f, -1, 0, false, false, a18, com.tencent.mm.plugin.sight.base.c.b()));
        }
        this.f284769q = hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init, bufId: %s", this.f284769q);
        com.tencent.mm.plugin.sight.base.h hVar2 = this.f284769q;
        if (hVar2 != null) {
            if (hVar2.f162415a >= 0) {
                this.f284768p = i17;
                this.f284763k = ai3.d.a(this.f284763k);
                this.f284762j = ai3.d.a(this.f284762j);
                if (this.f284770r && dVar.f256324n.equals("video/hevc")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCaptureUseHwHevc");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 181L, 1L, false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] mTargetRate " + this.f284764l + "  videoParams.fps: " + this.f284776x.f71193f + " mTargetHeight:" + this.f284763k + " mTargetWidth:" + this.f284762j + ", minQP:" + this.f284776x.D + ", maxQP:" + this.f284776x.E);
                dVar.f256314d = this.f284764l;
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = this.f284776x;
                dVar.f256315e = videoTransPara2.f71193f;
                dVar.f256313c = this.f284763k;
                dVar.f256312b = this.f284762j;
                dVar.f256322l = videoTransPara2.E;
                dVar.f256321k = videoTransPara2.D;
                try {
                    gs0.l lVar = new gs0.l(dVar, new ht0.j(this, 1000 / r9));
                    this.f284761i = lVar;
                    this.V = false;
                    this.I.c(lVar.c(), this.f284752J, false, new ht0.k(this));
                    java.lang.Object obj = f284751a0;
                    synchronized (obj) {
                        try {
                            if (!this.V) {
                                obj.wait(500L);
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e18, "[" + hashCode() + "] initSurfaceLock wait error", new java.lang.Object[0]);
                        }
                    }
                    this.I.f320852f = new ht0.m(this);
                    D();
                    com.tencent.mm.modelcontrol.VideoTransPara videoTransPara3 = this.f284776x;
                    ht0.a aVar = new ht0.a(videoTransPara3.f71199o, videoTransPara3.f71198n, videoTransPara3.f71200p, com.tencent.mm.plugin.sight.base.c.a(false, this.f284770r));
                    this.f284760h = aVar;
                    aVar.f253134k = this.F;
                    int n17 = aVar.n(this.f284769q, com.tencent.mm.plugin.sight.base.e.a(this.f284755c));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] initImpl used %sms, ret:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(n17));
                    if (n17 == 0) {
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecAACRecorderInitFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 16L, 1L);
                    return false;
                } catch (java.lang.Exception e19) {
                    C();
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e19, "[" + hashCode() + "] init encoder error", new java.lang.Object[0]);
                    com.tencent.mm.sdk.platformtools.o4.L().putBoolean("mediacodec_create_error", true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 14L, 1L);
                    return false;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init failed!");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 14L, 1L);
        return false;
    }

    public final void C() {
        if (this.W) {
            return;
        }
        this.W = true;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start release recorder");
            this.E = null;
            this.f284767o.a(ei3.l.WaitStop);
            synchronized (this.f284753a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start release videoEncoder");
                gs0.b bVar = this.f284761i;
                if (bVar != null) {
                    bVar.b();
                    this.f284761i.f();
                    this.f284761i = null;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 160L, 1L, false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] end release videoEncoder");
            }
            ht0.a aVar = this.f284760h;
            if (aVar != null) {
                aVar.f(new ht0.r(this));
                this.f284760h.clear();
                this.f284760h = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] release buf-id ? %s", this.f284769q);
            this.f284769q.c();
            this.f284767o.a(ei3.l.Stop);
            ls0.k kVar = this.I;
            if (kVar != null) {
                kVar.e();
            }
            this.L = 0L;
            this.M = 0L;
            this.O = 0.0d;
            this.P = 0L;
            this.Q = 0L;
            this.R = 0L;
            this.N = false;
            this.f284777y = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", e17, "[" + hashCode() + "] clear error: %s", e17.getMessage());
        }
    }

    public final void D() {
        int i17 = this.f284762j;
        int i18 = this.f284763k;
        ls0.k kVar = this.I;
        kVar.f320847a.t(i17, i18);
        int i19 = this.f284768p;
        ms0.c cVar = kVar.f320847a;
        cVar.r(i19);
        cVar.u(this.f284765m, this.f284766n);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f284765m), java.lang.Integer.valueOf(this.f284766n), java.lang.Integer.valueOf(this.f284768p));
    }

    public final void E(boolean z17, boolean z18, boolean z19, long j17) {
        if (this.K >= 0) {
            if (A() || !z18) {
                android.util.Pair F = F();
                if (((java.lang.Boolean) F.second).booleanValue()) {
                    int i17 = this.K;
                    long longValue = ((java.lang.Long) F.first).longValue();
                    ls0.k kVar = this.I;
                    kVar.getClass();
                    kVar.d(new ls0.g(kVar, i17, z19, j17, z17, longValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair F() {
        /*
            r12 = this;
            long r0 = r12.Q
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            long r0 = java.lang.System.nanoTime()
            long r4 = r12.Q
            long r0 = r0 - r4
            long r4 = r12.P
            long r4 = r4 + r0
            r12.P = r4
            long r4 = r12.R
            float r4 = (float) r4
            float r0 = (float) r0
            r1 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r1
            float r4 = r4 + r0
            long r0 = (long) r4
            r12.R = r0
            r12.Q = r2
        L22:
            long r0 = r12.M
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L38
            long r0 = java.lang.System.nanoTime()
            long r4 = r12.M
            long r0 = r0 - r4
            long r4 = r12.L
            long r0 = r0 + r4
            long r4 = r12.P
            long r0 = r0 - r4
            r12.P = r2
            goto L39
        L38:
            r0 = r2
        L39:
            boolean r4 = r12.N
            r5 = 1
            if (r4 == 0) goto L67
            ei3.e1 r4 = r12.f284767o
            ei3.l r4 = r4.f253039a
            ei3.l r6 = ei3.l.WaitStop
            if (r4 == r6) goto L5e
            long r6 = r12.L
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L5e
            long r6 = r0 - r6
            double r6 = (double) r6
            double r8 = r12.O
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r8 = r8 * r10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L5c
            goto L5e
        L5c:
            r4 = 0
            goto L70
        L5e:
            r12.L = r0
            long r6 = java.lang.System.nanoTime()
            r12.M = r6
            goto L6f
        L67:
            r12.L = r0
            long r6 = java.lang.System.nanoTime()
            r12.M = r6
        L6f:
            r4 = r5
        L70:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r8 = r0 / r6
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L92
            int r2 = r12.T
            int r2 = r2 + r5
            r12.T = r2
            com.tencent.mm.plugin.sight.base.h r2 = r12.f284769q
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r12.f284776x
            int r3 = r3.f71193f
            float r3 = (float) r3
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 / r3
            int r3 = java.lang.Math.round(r10)
            int r3 = r3 * (-1)
            long r10 = (long) r3
            long r10 = r10 * r6
            r2.f(r10)
        L92:
            int r2 = r12.T
            int r2 = r2 + r5
            r12.T = r2
            if (r4 == 0) goto L9e
            com.tencent.mm.plugin.sight.base.h r2 = r12.f284769q
            r2.f(r8)
        L9e:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ht0.s.F():android.util.Pair");
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f284754b;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f284772t;
    }

    @Override // ei3.m
    public float c() {
        return this.f284757e;
    }

    @Override // ei3.m
    public void cancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] cancel");
        C();
    }

    @Override // ei3.m
    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] clear");
        C();
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f284756d / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f284759g = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f284755c = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        this.E = runnable;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] !!!!!stop, stopCallback: %s !!!", runnable);
        if (this.f284761i == null || (this.f284760h == null && !this.G)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return;
            }
            return;
        }
        ei3.e1 e1Var = this.f284767o;
        if (e1Var != null && e1Var.f253039a == ei3.l.Stop) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, already in stop videoRecordStatus");
            ht0.a aVar = this.f284760h;
            if (aVar != null) {
                aVar.clear();
            }
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecStartWait");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        rs0.p.f399311b = android.os.SystemClock.elapsedRealtime();
        if (this.f284767o != null) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable2 = this.Y;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(runnable2);
            t0Var.w(runnable2, 1500L, "record_stop_timeout");
            this.f284767o.a(ei3.l.PrepareStop);
        }
        if (this.Q > 0) {
            this.R = ((float) this.R) + (((float) (java.lang.System.nanoTime() - this.Q)) / 1000000.0f);
        }
        this.f284756d = (int) this.f284761i.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, mDurationMS:%s, accumulatePauseTime:%s", java.lang.Integer.valueOf(this.f284756d), java.lang.Long.valueOf(this.R));
        long j17 = this.R;
        if (j17 > 0) {
            this.f284756d = (int) (this.f284756d - j17);
        }
    }

    @Override // ei3.m
    public java.lang.String getFilePath() {
        return this.f284755c;
    }

    @Override // ei3.m
    public di3.o getFrameDataCallback() {
        return this.Z;
    }

    @Override // ei3.m
    public java.lang.String getMd5() {
        java.lang.String str = this.A;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.B;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f284758f = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return false;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.f284777y) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] preInit, cameraOrientation %d", java.lang.Integer.valueOf(i17));
        boolean B = B(i17);
        this.f284777y = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] initImpl result: %s", java.lang.Boolean.valueOf(B));
        return B;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] resume, cameraOrientation: %s, cameraPreviewWidth:%s, cameraPreviewHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f284768p = i17;
        this.f284765m = i18;
        this.f284766n = i19;
        this.I.f320847a.r(i17);
        D();
        ei3.e1 e1Var = this.f284767o;
        if (e1Var == null || e1Var.f253039a != ei3.l.Pause) {
            return;
        }
        e1Var.a(ei3.l.Start);
        ht0.a aVar = this.f284760h;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "resume, pauseTime:%s", java.lang.Long.valueOf(aVar.D));
            aVar.B = false;
            long j17 = aVar.D;
            if (j17 > 0) {
                long j18 = aVar.C;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                aVar.C = j18 + (android.os.SystemClock.elapsedRealtime() - j17);
            }
            aVar.D = 0L;
            aVar.f253133j = true;
        }
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f284765m, this.f284766n);
    }

    @Override // ei3.m
    public long n() {
        gs0.b bVar = this.f284761i;
        if (bVar != null) {
            return bVar.d();
        }
        return 0L;
    }

    @Override // ht0.b
    public void o() {
        E(true, true, false, 0L);
    }

    @Override // ei3.m
    public tl.c p() {
        ht0.a aVar = this.f284760h;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    @Override // ei3.m
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] pause");
        ei3.e1 e1Var = this.f284767o;
        if (e1Var == null || e1Var.f253039a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
        ht0.a aVar = this.f284760h;
        if (aVar != null) {
            aVar.f253133j = false;
            aVar.B = true;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            aVar.D = elapsedRealtime;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "pause, time:%s", java.lang.Long.valueOf(elapsedRealtime));
        }
        this.Q = java.lang.System.nanoTime();
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f284773u;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 % 16 != 0) {
            i19 = ai3.d.a(i19);
        }
        if (i27 % 16 != 0) {
            i27 = ai3.d.a(i27);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] setSize, after align, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f284765m = i17;
        this.f284766n = i18;
        ei3.x.f253187d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] reset");
        C();
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f284773u = str;
    }

    @Override // ei3.m
    public void setMirror(boolean z17) {
        this.I.f320847a.m(z17);
    }

    @Override // ei3.m
    public void setMute(boolean z17) {
        this.G = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f284767o.f253039a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.D = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.F = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f284772t = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f284768p;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        ht0.a aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start, cameraOrientation: %s, isLandscape: %s, degree: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.f284774v.d();
        int i19 = 0;
        this.f284756d = 0;
        this.L = 0L;
        this.f284778z = true;
        this.f284775w.d();
        this.B = z17;
        this.C = i18;
        this.L = 0L;
        this.M = 0L;
        this.O = 0.0d;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.O = 1000.0f / this.f284776x.f71193f;
        this.f284767o.a(ei3.l.WaitStart);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start, checkDropFrameByPts: %s, perFrmaeDuration:%s", java.lang.Boolean.valueOf(this.N), java.lang.Double.valueOf(this.O));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f284755c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f284754b = com.tencent.mm.vfs.w6.q(this.f284755c);
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(this.f284755c);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            this.f284771s = r17 + hashCode() + "tempRotate.mp4";
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] tempRotateFilePath:" + this.f284771s);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] retrieve file name error: %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] mCurRecordPath: %s, tempRotateFilePath: %s", this.f284755c, this.f284771s);
        this.f284768p = i17;
        D();
        if (!this.f284777y) {
            B(i17);
            this.f284777y = true;
        }
        D();
        if (this.G || this.F || (aVar = this.f284760h) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start yuvRecorder with mute");
            this.f284767o.a(ei3.l.Start);
        } else {
            i19 = aVar.b(new ht0.n(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start aacRecorder ret: %s", java.lang.Integer.valueOf(i19));
            if (i19 != 0) {
                this.f284767o.a(ei3.l.Error);
            } else {
                this.f284767o.a(ei3.l.Initialized);
            }
        }
        return i19;
    }

    public final void z(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        this.f284776x = videoTransPara;
        this.f284762j = videoTransPara.f71191d;
        this.f284763k = videoTransPara.f71192e;
        this.f284767o = new ei3.e1();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCapture");
        rs0.p.f399311b = -1L;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 13L, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] create MediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(this.f284762j), java.lang.Integer.valueOf(this.f284763k));
    }

    public s(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, ms0.c cVar, android.opengl.EGLContext eGLContext, int i17) {
        this.f284753a = new java.lang.Object();
        this.f284755c = "";
        this.f284756d = 0;
        this.f284757e = 0.0f;
        this.f284758f = -1;
        this.f284759g = -1.0f;
        this.f284762j = 480;
        this.f284763k = 640;
        this.f284764l = 1600000;
        this.f284765m = 480;
        this.f284766n = 640;
        this.f284769q = null;
        this.f284770r = false;
        this.f284771s = null;
        this.f284772t = null;
        this.f284773u = null;
        this.f284774v = new di3.c("yuvRecorderWriteData");
        this.f284775w = new di3.c("frameCountCallback");
        this.f284777y = false;
        this.f284778z = false;
        this.A = "";
        this.B = false;
        this.C = 0;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = null;
        this.f284752J = null;
        this.K = -1;
        this.L = 0L;
        this.M = 0L;
        this.N = false;
        this.O = 0.0d;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = false;
        new java.util.LinkedList();
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.Y = new ht0.f(this);
        this.Z = new ht0.g(this);
        z(videoTransPara);
        this.f284752J = eGLContext;
        this.I = new ls0.k(cVar);
        this.K = i17;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] textureId : " + i17, new java.lang.Object[0]);
    }
}
