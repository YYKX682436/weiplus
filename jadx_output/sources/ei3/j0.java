package ei3;

/* loaded from: classes10.dex */
public class j0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public int f253059e;

    /* renamed from: g, reason: collision with root package name */
    public float f253061g;

    /* renamed from: h, reason: collision with root package name */
    public int f253062h;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f253067p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f253068q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f253069r;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f253060f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f253063i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f253064m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f253065n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f253066o = false;

    public j0(ei3.k0 k0Var) {
        this.f253069r = k0Var;
        java.lang.Object obj = new java.lang.Object();
        this.f253067p = obj;
        this.f253068q = null;
        synchronized (obj) {
            try {
                java.lang.String r17 = com.tencent.mm.vfs.w6.r(k0Var.f253077g);
                k0Var.f253088r = (r17.endsWith("/") ? r17 : r17.concat("/")) + "tempRotate.mp4";
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "retrieve file name error: %s", e17.getMessage());
            }
        }
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.MMSightFFMpegRecorder";
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.k0 k0Var = this.f253069r;
        if (k0Var.f253092v == -1) {
            k0Var.f253092v = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "encodeTid: %s", java.lang.Integer.valueOf(this.f253069r.f253092v));
        }
        synchronized (this.f253067p) {
            while (!this.f253064m) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                int triggerEncode = com.tencent.mm.plugin.sight.base.SightVideoJNI.triggerEncode(this.f253059e, java.lang.Math.max(0, this.f253060f), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f253060f), java.lang.Integer.valueOf(triggerEncode), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (java.lang.Math.abs(triggerEncode - this.f253060f) <= 5) {
                    try {
                        java.lang.Thread.sleep(100L);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "thread sleep error");
                    }
                }
                this.f253060f = triggerEncode;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            if (!this.f253065n) {
                this.f253060f = com.tencent.mm.plugin.sight.base.SightVideoJNI.triggerEncode(this.f253059e, this.f253060f, true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f253060f), java.lang.Boolean.valueOf(this.f253065n), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (!this.f253065n) {
                int max = java.lang.Math.max(1000, this.f253062h);
                ei3.k0 k0Var2 = this.f253069r;
                int i17 = k0Var2.f253080j;
                int i18 = i17 > 0 ? i17 : max;
                float f17 = this.f253061g;
                float f18 = k0Var2.f253081k;
                float f19 = f18 > 0.0f ? f18 : f17;
                com.tencent.mm.plugin.sight.base.h hVar = new com.tencent.mm.plugin.sight.base.h(this.f253059e);
                ei3.k0 k0Var3 = this.f253069r;
                k0Var2.f253075e = new ei3.l0(hVar, k0Var3.f253077g, f19, k0Var3.f253084n, i18, k0Var3.A.f71199o, false, true, false);
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                ei3.k0 k0Var4 = this.f253069r;
                ei3.n nVar = k0Var4.f253075e;
                k0Var4.getClass();
                boolean a17 = ((ei3.l0) nVar).a(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Boolean.valueOf(a17));
                if (!a17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "mux failed!");
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253059e);
                    com.tencent.mm.sdk.platformtools.u3.h(new ei3.g0(this));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCaptureMuxError");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 30L, 1L, false);
                    return;
                }
                ei3.k0 k0Var5 = this.f253069r;
                boolean z19 = k0Var5.F;
                if ((z19 && k0Var5.f253093w) || ((!k0Var5.f253093w && !z19) || ((z19 && java.lang.Math.abs(k0Var5.f253087q - k0Var5.G) == 0) || this.f253069r.G == 180))) {
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    ei3.k0 k0Var6 = this.f253069r;
                    boolean z27 = k0Var6.f253093w;
                    int i19 = (z27 || k0Var6.F) ? z27 ? k0Var6.G : 180 : k0Var6.f253087q;
                    if (k0Var6.G == 180 && !z27 && (i19 = i19 + 180) > 360) {
                        i19 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
                    }
                    if (i19 > 0) {
                        com.tencent.mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(k0Var6.f253077g, k0Var6.f253088r, i19);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4), java.lang.Integer.valueOf(this.f253069r.f253087q), java.lang.Boolean.valueOf(this.f253069r.F), java.lang.Integer.valueOf(this.f253069r.G), java.lang.Integer.valueOf(i19));
                        ei3.k0 k0Var7 = this.f253069r;
                        java.lang.String str = k0Var7.f253088r;
                        try {
                            com.tencent.mm.vfs.w6.c(str, k0Var7.f253077g);
                            s75.d.b(new ei3.i0(this, str), "BigSightFFMpegRecorder_tagRotate_after_process");
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "tag rotate used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
                        } catch (java.lang.Exception unused2) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegRecorder", "stop, copy file error");
                            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253059e);
                            com.tencent.mm.sdk.platformtools.u3.h(new ei3.h0(this));
                            return;
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253059e);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "all finish, callback: %s", this.f253068q);
            this.f253069r.reset();
            com.tencent.mm.sdk.platformtools.u3.h(this.f253068q);
            this.f253066o = true;
            ei3.k0 k0Var8 = this.f253069r;
            k0Var8.f253092v = -1;
            k0Var8.f253091u = -1;
        }
    }
}
