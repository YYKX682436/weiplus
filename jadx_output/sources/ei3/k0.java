package ei3;

/* loaded from: classes10.dex */
public class k0 implements ei3.m {
    public final com.tencent.mm.modelcontrol.VideoTransPara A;
    public boolean B;
    public ei3.k H;

    /* renamed from: a, reason: collision with root package name */
    public ei3.j f253071a;

    /* renamed from: b, reason: collision with root package name */
    public ei3.y0 f253072b;

    /* renamed from: c, reason: collision with root package name */
    public final ei3.e1 f253073c;

    /* renamed from: e, reason: collision with root package name */
    public ei3.n f253075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f253076f;

    /* renamed from: l, reason: collision with root package name */
    public int f253082l;

    /* renamed from: m, reason: collision with root package name */
    public int f253083m;

    /* renamed from: n, reason: collision with root package name */
    public final int f253084n;

    /* renamed from: d, reason: collision with root package name */
    public ei3.j0 f253074d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f253077g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f253078h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f253079i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f253080j = -1;

    /* renamed from: k, reason: collision with root package name */
    public float f253081k = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f253085o = 480;

    /* renamed from: p, reason: collision with root package name */
    public int f253086p = 640;

    /* renamed from: q, reason: collision with root package name */
    public int f253087q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f253088r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.os.HandlerThread f253089s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f253090t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f253091u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f253092v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f253093w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f253094x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f253095y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f253096z = false;
    public int C = -1;
    public boolean D = false;
    public java.lang.String E = "";
    public boolean F = false;
    public int G = 0;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f253070J = false;
    public final di3.o K = new ei3.z(this);

    public k0(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        this.f253082l = 480;
        this.f253083m = 640;
        this.f253084n = 1600000;
        this.B = false;
        this.A = videoTransPara;
        this.f253082l = videoTransPara.f71191d;
        this.f253083m = videoTransPara.f71192e;
        int i17 = videoTransPara.f71194g;
        this.f253084n = i17;
        int i18 = di3.w.f232770d.f232703d;
        if (i18 == -1) {
            this.f253084n = i17;
        } else {
            this.f253084n = i18;
        }
        this.f253073c = new ei3.e1();
        this.B = false;
    }

    public static void z(ei3.k0 k0Var, java.lang.Runnable runnable) {
        ei3.j0 j0Var;
        k0Var.f253073c.a(ei3.l.WaitStop);
        ei3.y0 y0Var = k0Var.f253072b;
        if (y0Var != null) {
            int i17 = y0Var.f253191a;
            float a17 = (y0Var.f253192b * 1000.0f) / ((float) k0Var.f253072b.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k0Var.f253072b.f253192b), java.lang.Long.valueOf(k0Var.f253072b.a()), java.lang.Float.valueOf(a17));
            k0Var.f253078h = (int) k0Var.f253072b.a();
            k0Var.f253079i = a17;
            k0Var.f253072b.b();
            ei3.j0 j0Var2 = k0Var.f253074d;
            if (j0Var2 != null) {
                j0Var2.f253061g = a17;
                j0Var2.f253062h = k0Var.f253078h;
                j0Var2.f253068q = runnable;
                j0Var2.f253063i = true;
                j0Var2.b();
            }
        }
        ei3.j jVar = k0Var.f253071a;
        if (jVar != null && !k0Var.I) {
            jVar.f(new ei3.c0(k0Var));
        }
        k0Var.f253073c.a(ei3.l.Stop);
        k0Var.E = com.tencent.mm.vfs.w6.p(k0Var.f253077g);
        if (k0Var.f253074d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "encodeRunnable is null!, directly call stopcallback");
            k0Var.reset();
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
        if (!k0Var.I || (j0Var = k0Var.f253074d) == null) {
            return;
        }
        j0Var.f253064m = true;
    }

    public final boolean A(int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = di3.w.f232770d.f232704e;
        this.f253093w = z18;
        this.f253087q = i17;
        if (z18) {
            int i38 = (i17 == 0 || i17 == 180) ? this.f253085o : this.f253086p;
            int i39 = (i17 == 0 || i17 == 180) ? this.f253086p : this.f253085o;
            int i47 = (i17 == 0 || i17 == 180) ? this.f253082l : this.f253083m;
            i18 = (i17 == 0 || i17 == 180) ? this.f253083m : this.f253082l;
            i19 = i38;
            i27 = i39;
            i28 = i47;
        } else {
            int i48 = (i17 == 0 || i17 == 180) ? this.f253085o : this.f253086p;
            int i49 = (i17 == 0 || i17 == 180) ? this.f253086p : this.f253085o;
            i28 = this.f253082l;
            i18 = this.f253083m;
            int i57 = i48;
            i27 = i49;
            i19 = i57;
        }
        int i58 = this.f253084n;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.A;
        int initDataBufferForMMSightLock = com.tencent.mm.plugin.sight.base.SightVideoJNI.initDataBufferForMMSightLock(i19, i27, i17, i28, i18, videoTransPara.f71193f, i58, videoTransPara.f71202r, 8, videoTransPara.f71201q, 23.0f, videoTransPara.N, 0, z18, true, videoTransPara.f71195h, false, false, false);
        if (initDataBufferForMMSightLock < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "init failed!");
            di3.x.c();
            return false;
        }
        this.C = initDataBufferForMMSightLock;
        ei3.y0 y0Var = new ei3.y0(this.f253093w, i17, i28, i18, false);
        this.f253072b = y0Var;
        if (initDataBufferForMMSightLock < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
            i29 = -1;
        } else {
            y0Var.f253191a = initDataBufferForMMSightLock;
            synchronized (ei3.y0.class) {
                y0Var.f253192b = 0;
            }
            y0Var.f253193c = 0L;
            i29 = 0;
        }
        int i59 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null ? com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1) : -1;
        if (i59 < 0) {
            ei3.p pVar = new ei3.p(videoTransPara.f71199o, videoTransPara.f71198n, videoTransPara.f71200p, com.tencent.mm.plugin.sight.base.c.a(true, videoTransPara.K == 1));
            this.f253071a = pVar;
            pVar.f253134k = this.I;
            int c17 = pVar.c(initDataBufferForMMSightLock, com.tencent.mm.plugin.sight.base.e.a(this.f253077g));
            if (i29 < 0 || c17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(c17));
                if (c17 < 0 && i29 >= 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMSightFFMpegRecorder", "aac init error, try mediarecorder now");
                    this.f253071a.clear();
                    ei3.w wVar = new ei3.w(videoTransPara.f71199o, videoTransPara.f71198n, videoTransPara.f71200p);
                    this.f253071a = wVar;
                    wVar.f253155c = this.I;
                    int c18 = wVar.c(initDataBufferForMMSightLock, com.tencent.mm.plugin.sight.base.e.a(this.f253077g));
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMSightFFMpegRecorder", "MMSightAACMediaRecorder init ret: %s", java.lang.Integer.valueOf(c18));
                    if (c18 >= 0) {
                        return true;
                    }
                }
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(initDataBufferForMMSightLock);
                di3.x.c();
                return false;
            }
        } else {
            if (i59 == 1) {
                ei3.p pVar2 = new ei3.p(videoTransPara.f71199o, videoTransPara.f71198n, videoTransPara.f71200p, com.tencent.mm.plugin.sight.base.c.a(true, videoTransPara.K == 1));
                this.f253071a = pVar2;
                pVar2.f253134k = this.I;
                i37 = pVar2.c(initDataBufferForMMSightLock, com.tencent.mm.plugin.sight.base.e.a(this.f253077g));
            } else if (i59 == 2) {
                ei3.w wVar2 = new ei3.w(videoTransPara.f71199o, videoTransPara.f71198n, videoTransPara.f71200p);
                this.f253071a = wVar2;
                wVar2.f253155c = this.I;
                i37 = wVar2.c(initDataBufferForMMSightLock, com.tencent.mm.plugin.sight.base.e.a(this.f253077g));
            } else {
                i37 = 0;
            }
            if (i29 < 0 || i37 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(initDataBufferForMMSightLock);
                di3.x.c();
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "initImpl used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return true;
    }

    public final void B() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "ashutest::pcm ready");
        ei3.j0 j0Var = this.f253074d;
        if (j0Var != null && !j0Var.f253066o) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", j0Var);
            synchronized (this.f253074d.f253067p) {
                C(this.f253074d.f253059e);
            }
        }
        ei3.e1 e1Var = this.f253073c;
        if (e1Var.f253039a != ei3.l.Initialized) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightFFMpegRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
            return;
        }
        e1Var.a(ei3.l.Start);
        ei3.j0 j0Var2 = new ei3.j0(this);
        this.f253074d = j0Var2;
        j0Var2.f253059e = this.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SightCustomAsyncMediaRecorder_encode_");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        s75.d.c(j0Var2, sb6.toString(), 5);
    }

    public final boolean C(int i17) {
        ei3.j0 j0Var = this.f253074d;
        if (j0Var == null || j0Var.f253066o) {
            return false;
        }
        if (!j0Var.f253063i) {
            j0Var.f253068q = null;
            j0Var.f253065n = true;
            j0Var.f253064m = true;
            j0Var.b();
        }
        synchronized (this.f253074d.f253067p) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(i17);
            int i18 = this.f253074d.f253059e;
            if (i18 != i17) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(i18);
            }
        }
        return true;
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f253076f;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f253094x;
    }

    @Override // ei3.m
    public float c() {
        return this.f253079i;
    }

    @Override // ei3.m
    public void cancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "cancel");
        ei3.l lVar = ei3.l.WaitStop;
        ei3.e1 e1Var = this.f253073c;
        e1Var.a(lVar);
        clear();
        e1Var.a(ei3.l.Stop);
    }

    @Override // ei3.m
    public void clear() {
        int i17;
        ei3.y0 y0Var = this.f253072b;
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
        ei3.j jVar = this.f253071a;
        if (jVar != null) {
            jVar.f(null);
        }
        ei3.j0 j0Var = this.f253074d;
        if (j0Var != null) {
            boolean z17 = j0Var.f253065n;
        }
        if (i17 >= 0 && !C(i17)) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseRecorderBufferRef("clear");
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(i17);
        }
        android.os.HandlerThread handlerThread = this.f253089s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f253078h / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f253081k = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f253077g = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f253074d == null);
        ei3.j0 j0Var = this.f253074d;
        objArr[1] = java.lang.Boolean.valueOf(j0Var != null && j0Var.f253063i);
        ei3.j0 j0Var2 = this.f253074d;
        objArr[2] = java.lang.Boolean.valueOf(j0Var2 != null && j0Var2.f253064m);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", objArr);
        ei3.j0 j0Var3 = this.f253074d;
        if (j0Var3 != null && j0Var3.f253063i) {
            synchronized (j0Var3.f253067p) {
                reset();
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", java.lang.Boolean.valueOf(this.f253070J), this.f253090t);
            if (!this.f253070J || (n3Var = this.f253090t) == null) {
                s75.d.b(new ei3.b0(this, runnable), "MMSightFFMpegRecorder_stop");
            } else {
                n3Var.post(new ei3.a0(this, runnable));
            }
        }
    }

    @Override // ei3.m
    public java.lang.String getFilePath() {
        return this.f253077g;
    }

    @Override // ei3.m
    public di3.o getFrameDataCallback() {
        return this.K;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f253080j = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return this.D;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.B) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "preInit, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        boolean A = A(i17);
        this.B = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(A));
        return A;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "resume, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        ei3.e1 e1Var = this.f253073c;
        if (e1Var == null || e1Var.f253039a != ei3.l.Pause) {
            return;
        }
        ei3.y0 y0Var = this.f253072b;
        if (y0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            y0Var.f253199i = i17;
        }
        e1Var.a(ei3.l.Start);
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f253085o, this.f253086p);
    }

    @Override // ei3.m
    public long n() {
        return this.f253072b.a();
    }

    @Override // ei3.m
    public tl.c p() {
        ei3.j jVar = this.f253071a;
        if (jVar != null) {
            return jVar.e();
        }
        return null;
    }

    @Override // ei3.m
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "pause");
        ei3.e1 e1Var = this.f253073c;
        if (e1Var == null || e1Var.f253039a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f253095y;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "setSize, width: %s, height: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f253082l = i19;
        this.f253083m = i27;
        this.f253085o = i17;
        this.f253086p = i18;
        ei3.x.f253187d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "reset");
        this.f253073c.f253039a = ei3.l.Stop;
        this.D = false;
        ei3.j jVar = this.f253071a;
        if (jVar != null) {
            jVar.clear();
        }
        ei3.y0 y0Var = this.f253072b;
        if (y0Var != null) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(y0Var.f253191a);
            y0Var.f253191a = -1;
            synchronized (ei3.y0.class) {
                y0Var.f253192b = 0;
            }
            y0Var.f253193c = 0L;
        }
        clear();
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f253095y = str;
    }

    @Override // ei3.m
    public void setMute(boolean z17) {
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f253073c.f253039a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.H = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.I = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f253094x = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f253087q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        ei3.e1 e1Var = this.f253073c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s", e1Var.f253039a, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.F = z17;
        this.f253078h = 0;
        this.G = i18;
        e1Var.a(ei3.l.WaitStart);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f253077g;
        objArr[1] = java.lang.Boolean.valueOf(this.f253074d == null);
        ei3.j0 j0Var = this.f253074d;
        objArr[2] = java.lang.Boolean.valueOf(j0Var == null || j0Var.f253066o);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", objArr);
        ei3.j0 j0Var2 = this.f253074d;
        if (j0Var2 != null && !j0Var2.f253066o) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightFFMpegRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
            return -1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f253077g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        this.f253076f = com.tencent.mm.vfs.w6.q(this.f253077g);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "mCurRecordPath: %s", this.f253077g);
        this.f253087q = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "start, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        if (!this.B) {
            A(i17);
            this.B = true;
        }
        ei3.y0 y0Var = this.f253072b;
        if (0 == y0Var.f253193c) {
            y0Var.f253193c = java.lang.System.currentTimeMillis();
        }
        int b17 = !this.I ? this.f253071a.b(new ei3.d0(this)) : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "start aac recorder ret: %d", java.lang.Integer.valueOf(b17));
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("BigSightWriteCameraData", 0);
        this.f253089s = a17;
        a17.start();
        this.f253090t = new ei3.e0(this, this.f253089s.getLooper());
        this.D = false;
        if (b17 != 0) {
            e1Var.a(ei3.l.Error);
        } else {
            e1Var.a(ei3.l.Initialized);
        }
        di3.x.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCapture");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 1L, 1L, false);
        if (this.I) {
            B();
        }
        return b17;
    }
}
