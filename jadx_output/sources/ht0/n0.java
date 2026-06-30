package ht0;

/* loaded from: classes10.dex */
public class n0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public int f284710e;

    /* renamed from: g, reason: collision with root package name */
    public float f284712g;

    /* renamed from: h, reason: collision with root package name */
    public int f284713h;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f284718p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f284719q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f284720r;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f284711f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f284714i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f284715m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f284716n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f284717o = false;

    public n0(ht0.o0 o0Var) {
        this.f284720r = o0Var;
        java.lang.Object obj = new java.lang.Object();
        this.f284718p = obj;
        this.f284719q = null;
        synchronized (obj) {
            try {
                java.lang.String r17 = com.tencent.mm.vfs.w6.r(o0Var.f284729g);
                o0Var.f284740r = (r17.endsWith("/") ? r17 : r17.concat("/")) + "tempRotate.mp4";
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "retrieve file name error: %s", e17.getMessage());
            }
        }
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "SightCustomAsyncMediaRecorder_encode";
    }

    @Override // java.lang.Runnable
    public void run() {
        ht0.o0 o0Var = this.f284720r;
        if (o0Var.f284744v == -1) {
            o0Var.f284744v = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "encodeTid: %s", java.lang.Integer.valueOf(this.f284720r.f284744v));
        }
        synchronized (this.f284718p) {
            while (!this.f284715m) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                int triggerEncode = com.tencent.mm.plugin.sight.base.SightVideoJNI.triggerEncode(this.f284710e, java.lang.Math.max(0, this.f284711f), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f284711f), java.lang.Integer.valueOf(triggerEncode), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (java.lang.Math.abs(triggerEncode - this.f284711f) <= 5) {
                    try {
                        java.lang.Thread.sleep(100L);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "thread sleep error");
                    }
                }
                this.f284711f = triggerEncode;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            if (!this.f284716n) {
                this.f284711f = com.tencent.mm.plugin.sight.base.SightVideoJNI.triggerEncode(this.f284710e, this.f284711f, true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f284711f), java.lang.Boolean.valueOf(this.f284716n), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (!this.f284716n) {
                int max = java.lang.Math.max(1000, this.f284713h);
                ht0.o0 o0Var2 = this.f284720r;
                int i17 = o0Var2.f284732j;
                int i18 = i17 > 0 ? i17 : max;
                float f17 = this.f284712g;
                float f18 = o0Var2.f284733k;
                float f19 = f18 > 0.0f ? f18 : f17;
                com.tencent.mm.plugin.sight.base.h hVar = o0Var2.D;
                java.lang.String str = o0Var2.f284729g;
                int i19 = o0Var2.f284736n;
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = o0Var2.B;
                o0Var2.f284727e = new ei3.l0(hVar, str, f19, i19, i18, videoTransPara.f71199o, o0Var2.M, true, videoTransPara.K == 1);
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                ht0.o0 o0Var3 = this.f284720r;
                boolean a17 = ((ei3.l0) o0Var3.f284727e).a(o0Var3.N);
                com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Boolean.valueOf(a17));
                if (!a17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "mux failed!");
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f284710e);
                    com.tencent.mm.sdk.platformtools.u3.h(new ht0.k0(this));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 37L, 1L);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureSuccess");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 39L, 1L);
                ht0.o0 o0Var4 = this.f284720r;
                boolean z19 = o0Var4.G;
                if ((z19 && o0Var4.f284745w) || ((!o0Var4.f284745w && !z19) || ((z19 && java.lang.Math.abs(o0Var4.f284739q - o0Var4.H) == 0) || this.f284720r.H == 180))) {
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    ht0.o0 o0Var5 = this.f284720r;
                    boolean z27 = o0Var5.f284745w;
                    int i27 = (z27 || o0Var5.G) ? z27 ? o0Var5.H : 180 : o0Var5.f284739q;
                    if (o0Var5.H == 180 && !z27 && (i27 = i27 + 180) > 360) {
                        i27 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
                    }
                    if (i27 > 0) {
                        com.tencent.mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(o0Var5.f284729g, o0Var5.f284740r, i27);
                        com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4), java.lang.Integer.valueOf(this.f284720r.f284739q), java.lang.Boolean.valueOf(this.f284720r.G), java.lang.Integer.valueOf(this.f284720r.H), java.lang.Integer.valueOf(i27));
                        ht0.o0 o0Var6 = this.f284720r;
                        java.lang.String str2 = o0Var6.f284740r;
                        try {
                            com.tencent.mm.vfs.w6.c(str2, o0Var6.f284729g);
                            ((ku5.t0) ku5.t0.f312615d).g(new ht0.m0(this, str2));
                            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "tag rotate used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
                            try {
                                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(this.f284720r.f284729g, true);
                                if (d17 != null) {
                                    int i28 = d17.f162383b;
                                    int i29 = d17.f162386e;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureResult, bitrate:" + i28 + ", fps:" + i29);
                                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                    g0Var.C(985L, 38L, (long) i28);
                                    g0Var.C(985L, 41L, (long) i29);
                                }
                            } catch (java.lang.Exception unused2) {
                            }
                        } catch (java.lang.Exception unused3) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "stop, copy file error");
                            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f284710e);
                            com.tencent.mm.sdk.platformtools.u3.h(new ht0.l0(this));
                            return;
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f284710e);
            com.tencent.mars.xlog.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "all finish, callback: %s", this.f284719q);
            this.f284720r.reset();
            com.tencent.mm.sdk.platformtools.u3.h(this.f284719q);
            this.f284717o = true;
            ht0.o0 o0Var7 = this.f284720r;
            o0Var7.f284744v = -1;
            o0Var7.f284743u = -1;
        }
    }
}
