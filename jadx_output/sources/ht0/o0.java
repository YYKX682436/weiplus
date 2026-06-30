package ht0;

/* loaded from: classes10.dex */
public class o0 implements ht0.b {
    public final com.tencent.mm.modelcontrol.VideoTransPara B;
    public boolean C;
    public ei3.k I;
    public final boolean N;

    /* renamed from: a, reason: collision with root package name */
    public ht0.a f284723a;

    /* renamed from: b, reason: collision with root package name */
    public ei3.y0 f284724b;

    /* renamed from: c, reason: collision with root package name */
    public final ei3.e1 f284725c;

    /* renamed from: e, reason: collision with root package name */
    public ei3.n f284727e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f284728f;

    /* renamed from: l, reason: collision with root package name */
    public final int f284734l;

    /* renamed from: m, reason: collision with root package name */
    public final int f284735m;

    /* renamed from: n, reason: collision with root package name */
    public final int f284736n;

    /* renamed from: d, reason: collision with root package name */
    public ht0.n0 f284726d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f284729g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f284730h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f284731i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f284732j = -1;

    /* renamed from: k, reason: collision with root package name */
    public float f284733k = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f284737o = 480;

    /* renamed from: p, reason: collision with root package name */
    public int f284738p = 640;

    /* renamed from: q, reason: collision with root package name */
    public int f284739q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f284740r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.os.HandlerThread f284741s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f284742t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f284743u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f284744v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f284745w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f284746x = false;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f284747y = null;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f284748z = null;
    public boolean A = false;
    public com.tencent.mm.plugin.sight.base.h D = null;
    public boolean E = false;
    public java.lang.String F = "";
    public boolean G = false;
    public int H = 0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f284722J = false;
    public long K = 0;
    public long L = 0;
    public boolean M = false;
    public final di3.o O = new ht0.d0(this);

    public o0(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        boolean fj6;
        this.f284734l = 480;
        this.f284735m = 640;
        this.f284736n = 1600000;
        this.C = false;
        this.N = false;
        this.B = videoTransPara;
        int i17 = videoTransPara.f71191d;
        this.f284734l = i17;
        int i18 = videoTransPara.f71192e;
        this.f284735m = i18;
        int i19 = videoTransPara.f71194g;
        this.f284736n = i19;
        this.f284725c = new ei3.e1();
        this.C = false;
        if (videoTransPara.K == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "x264YUVMP4MuxRecorderUseFFMpeg hevc");
            fj6 = true;
        } else {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_use_ffmpeg_muxer, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WechatSight.PacketMuxerController", "x264YUVMP4MuxRecorderUseFFMpeg:%s", java.lang.Boolean.valueOf(fj6));
        }
        this.N = fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "create X264YUVMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s, enableHevc:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(videoTransPara.K));
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(985L, 30L, 1L);
        if (videoTransPara.K == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCaptureUseSwHevc");
            g0Var.idkeyStat(985L, 182L, 1L, false);
        }
    }

    public final void A() {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::pcm ready");
        ht0.n0 n0Var = this.f284726d;
        if (n0Var != null && !n0Var.f284717o) {
            com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", n0Var);
            synchronized (this.f284726d.f284718p) {
                C(this.f284726d.f284710e);
            }
        }
        ei3.e1 e1Var = this.f284725c;
        if (e1Var.f253039a != ei3.l.Initialized) {
            com.tencent.mars.xlog.Log.w("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
            return;
        }
        e1Var.a(ei3.l.Start);
        ht0.n0 n0Var2 = new ht0.n0(this);
        this.f284726d = n0Var2;
        n0Var2.f284710e = this.D.f162415a;
        ((ku5.t0) ku5.t0.f312615d).g(this.f284726d);
    }

    public final void B() {
        int i17;
        ei3.y0 y0Var = this.f284724b;
        if (y0Var != null) {
            i17 = y0Var.f253191a;
            if (i17 < 0) {
                return;
            } else {
                y0Var.b();
            }
        } else {
            i17 = -1;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(this.f284726d == null);
        ht0.n0 n0Var = this.f284726d;
        if (n0Var != null && n0Var.f284716n) {
            z17 = true;
        }
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::clear bufID %d, encodeRunnable null ? %B, markCancel %B", objArr);
        if (i17 >= 0 && !C(i17)) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseRecorderBufferRefLock("clear");
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(i17);
        }
        ht0.a aVar = this.f284723a;
        if (aVar != null) {
            aVar.f(null);
        }
        android.os.HandlerThread handlerThread = this.f284741s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public final boolean C(int i17) {
        ht0.n0 n0Var = this.f284726d;
        if (n0Var == null || n0Var.f284717o) {
            return false;
        }
        if (!n0Var.f284714i) {
            n0Var.f284719q = null;
            n0Var.f284716n = true;
            n0Var.f284715m = true;
            n0Var.b();
        }
        synchronized (this.f284726d.f284718p) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(i17);
            int i18 = this.f284726d.f284710e;
            if (i18 != i17) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(i18);
            }
        }
        return true;
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f284728f;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f284747y;
    }

    @Override // ei3.m
    public float c() {
        return this.f284731i;
    }

    @Override // ei3.m
    public void cancel() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.X264YUVMP4MuxRecorder", "cancel", new java.lang.Object[0]);
        ei3.l lVar = ei3.l.WaitStop;
        ei3.e1 e1Var = this.f284725c;
        e1Var.a(lVar);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f284742t;
        if (n3Var != null) {
            n3Var.removeMessages(1);
        }
        clear();
        e1Var.a(ei3.l.Stop);
    }

    @Override // ei3.m
    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "clear, hasWriteCameraData:%s", java.lang.Boolean.valueOf(this.E));
        if (this.E) {
            ((ku5.t0) ku5.t0.f312615d).g(new ht0.e0(this));
        } else {
            B();
        }
        this.K = 0L;
        this.L = 0L;
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f284730h / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f284733k = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f284729g = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f284726d == null);
        ht0.n0 n0Var = this.f284726d;
        objArr[1] = java.lang.Boolean.valueOf(n0Var != null && n0Var.f284714i);
        ht0.n0 n0Var2 = this.f284726d;
        objArr[2] = java.lang.Boolean.valueOf(n0Var2 != null && n0Var2.f284715m);
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", objArr);
        ht0.n0 n0Var3 = this.f284726d;
        if (n0Var3 == null || !n0Var3.f284714i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", java.lang.Boolean.FALSE, this.f284742t);
            ((ku5.t0) ku5.t0.f312615d).g(new ht0.f0(this, runnable));
        } else {
            synchronized (n0Var3.f284718p) {
                reset();
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
            }
        }
    }

    @Override // ei3.m
    public java.lang.String getFilePath() {
        return this.f284729g;
    }

    @Override // ei3.m
    public di3.o getFrameDataCallback() {
        return this.O;
    }

    @Override // ei3.m
    public java.lang.String getMd5() {
        java.lang.String str = this.F;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.G;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f284732j = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return this.E;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.C) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "preInit, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        boolean z17 = z(i17);
        this.C = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "resume, cameraOrientation: %s, lastPauseTimeMs:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.L));
        ei3.e1 e1Var = this.f284725c;
        if (e1Var == null || e1Var.f253039a != ei3.l.Pause) {
            return;
        }
        ei3.y0 y0Var = this.f284724b;
        if (y0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            y0Var.f253199i = i17;
        }
        e1Var.a(ei3.l.Start);
        if (this.L > 0) {
            this.K += java.lang.System.currentTimeMillis() - this.L;
        }
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f284737o, this.f284738p);
    }

    @Override // ei3.m
    public long n() {
        return this.f284724b.a();
    }

    @Override // ht0.b
    public void o() {
    }

    @Override // ei3.m
    public tl.c p() {
        ht0.a aVar = this.f284723a;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    @Override // ei3.m
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "pause");
        ei3.e1 e1Var = this.f284725c;
        if (e1Var == null || e1Var.f253039a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
        this.L = java.lang.System.currentTimeMillis();
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f284748z;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f284737o = i17;
        this.f284738p = i18;
        ei3.x.f253187d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "reset");
        this.f284725c.f253039a = ei3.l.Stop;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f284742t;
        if (n3Var != null) {
            n3Var.removeMessages(1);
        }
        ht0.a aVar = this.f284723a;
        if (aVar != null) {
            aVar.clear();
        }
        ei3.y0 y0Var = this.f284724b;
        if (y0Var != null) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(y0Var.f253191a);
            y0Var.f253191a = -1;
            synchronized (ei3.y0.class) {
                y0Var.f253192b = 0;
            }
            y0Var.f253193c = 0L;
        }
        clear();
        this.E = false;
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f284748z = str;
    }

    @Override // ei3.m
    public void setMirror(boolean z17) {
        this.f284746x = z17;
        ei3.y0 y0Var = this.f284724b;
        if (y0Var != null) {
            y0Var.f253197g = z17;
        }
    }

    @Override // ei3.m
    public void setMute(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "setMute:%s", java.lang.Boolean.valueOf(z17));
        this.M = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f284725c.f253039a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.I = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.f284722J = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f284747y = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f284739q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        ht0.a aVar;
        ei3.e1 e1Var = this.f284725c;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s, bufId:%S", e1Var.f253039a, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), this.D);
        this.G = z17;
        this.K = 0L;
        this.L = 0L;
        this.f284730h = 0;
        this.H = i18;
        e1Var.a(ei3.l.WaitStart);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f284729g;
        objArr[1] = java.lang.Boolean.valueOf(this.f284726d == null);
        ht0.n0 n0Var = this.f284726d;
        objArr[2] = java.lang.Boolean.valueOf(n0Var == null || n0Var.f284717o);
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", objArr);
        ht0.n0 n0Var2 = this.f284726d;
        if (n0Var2 != null && !n0Var2.f284717o) {
            com.tencent.mars.xlog.Log.w("MicroMsg.X264YUVMP4MuxRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
            return -1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f284729g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        this.f284728f = com.tencent.mm.vfs.w6.q(this.f284729g);
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "mCurRecordPath: %s", this.f284729g);
        this.f284739q = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "start, cameraOrientation: %s, mute:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.M));
        if (!this.C) {
            z(i17);
            this.C = true;
        }
        ei3.y0 y0Var = this.f284724b;
        if (0 == y0Var.f253193c) {
            y0Var.f253193c = java.lang.System.currentTimeMillis();
        }
        int b17 = (this.f284722J || (aVar = this.f284723a) == null) ? 0 : aVar.b(new ht0.h0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "start aac recorder ret: %d", java.lang.Integer.valueOf(b17));
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("BigSightWriteCameraData", 5);
        this.f284741s = a17;
        a17.start();
        this.f284742t = new ht0.i0(this, this.f284741s.getLooper());
        this.E = false;
        if (b17 != 0) {
            e1Var.a(ei3.l.Error);
        } else {
            e1Var.a(ei3.l.Initialized);
        }
        if (this.f284722J || this.M) {
            A();
        }
        return b17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r25 != 270) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0037, code lost:
    
        if (r25 != 270) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(int r25) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht0.o0.z(int):boolean");
    }
}
