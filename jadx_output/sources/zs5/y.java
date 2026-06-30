package zs5;

/* loaded from: classes15.dex */
public final class y implements at5.a {
    public static final zs5.a A = new zs5.a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f475500a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f475502c;

    /* renamed from: d, reason: collision with root package name */
    public int f475503d;

    /* renamed from: e, reason: collision with root package name */
    public int f475504e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f475505f;

    /* renamed from: h, reason: collision with root package name */
    public long f475507h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.d1 f475508i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.qbar.ScanIdentifyReportInfo f475509j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f475510k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f475511l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f475512m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f475513n;

    /* renamed from: o, reason: collision with root package name */
    public long f475514o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f475515p;

    /* renamed from: q, reason: collision with root package name */
    public volatile zs5.c f475516q;

    /* renamed from: r, reason: collision with root package name */
    public et5.e f475517r;

    /* renamed from: u, reason: collision with root package name */
    public jz5.l f475520u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f475521v;

    /* renamed from: w, reason: collision with root package name */
    public long f475522w;

    /* renamed from: x, reason: collision with root package name */
    public at5.b f475523x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.c0 f475524y;

    /* renamed from: b, reason: collision with root package name */
    public zs5.e0 f475501b = new zs5.e0();

    /* renamed from: g, reason: collision with root package name */
    public zs5.b f475506g = zs5.b.f475319d;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f475518s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f475519t = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final zs5.u f475525z = new zs5.u(this);

    @Override // at5.a
    public void a(long j17, com.tencent.wechat.aff.iam_scan.d1 d1Var) {
        com.tencent.wechat.aff.iam_scan.f1 f1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopSession reason: ");
        sb6.append(d1Var != null ? d1Var.f216993o : null);
        sb6.append(", session: ");
        sb6.append(j17);
        sb6.append(", currentSession: ");
        com.tencent.wechat.aff.iam_scan.d1 d1Var2 = this.f475508i;
        sb6.append(d1Var2 != null ? java.lang.Long.valueOf(d1Var2.f216985d) : null);
        sb6.append(", isSessionStarted: ");
        sb6.append(this.f475511l);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        com.tencent.wechat.aff.iam_scan.d1 d1Var3 = this.f475508i;
        if (d1Var3 != null && j17 == d1Var3.f216985d) {
            et5.e eVar = this.f475517r;
            if (eVar != null) {
                eVar.a(com.tencent.wechat.aff.iam_scan.a0.StopSessionFromNative);
            }
            com.tencent.wechat.aff.iam_scan.d1 d1Var4 = this.f475508i;
            if (d1Var4 != null) {
                if (d1Var == null || (f1Var = d1Var.f216993o) == null) {
                    f1Var = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
                }
                d1Var4.f216993o = f1Var;
                if ((d1Var != null ? d1Var.f216994p : null) != null) {
                    com.tencent.wechat.aff.iam_scan.a1 a1Var = d1Var.f216994p;
                    d1Var4.f216994p = a1Var;
                    int i17 = a1Var.f216948e;
                    int i18 = a1Var.f216949f;
                    int i19 = a1Var.f216947d;
                }
                if (this.f475511l) {
                    this.f475510k = true;
                }
                com.tencent.wechat.aff.iam_scan.h0.f217048b.j(d1Var4, new zs5.x(j17, this));
            }
            this.f475500a = 0;
            this.f475514o = 0L;
            this.f475508i = null;
            this.f475523x = null;
            this.f475516q = null;
            this.f475502c = null;
            this.f475503d = 0;
            this.f475504e = 0;
        }
    }

    @Override // at5.a
    public void b(rz3.b bVar) {
    }

    @Override // at5.a
    public void c(long j17, int i17, com.tencent.wechat.aff.iam_scan.d1 sessionInfo, at5.b decodeCallBack) {
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(decodeCallBack, "decodeCallBack");
        this.f475523x = decodeCallBack;
        com.tencent.wechat.aff.iam_scan.d1 d1Var = new com.tencent.wechat.aff.iam_scan.d1();
        d1Var.f216985d = j17;
        d1Var.f216986e = sessionInfo.f216986e;
        d1Var.f216987f = sessionInfo.f216987f;
        d1Var.f216988g = java.lang.System.currentTimeMillis();
        zs5.g0 g0Var = zs5.g0.F;
        d1Var.f216990i = i17 == 4 ? com.tencent.wechat.aff.iam_scan.c1.SCAN_MERGE : com.tencent.wechat.aff.iam_scan.c1.SCAN;
        d1Var.f216993o = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
        this.f475516q = new zs5.c(j17, i17, d1Var, decodeCallBack);
        this.f475508i = d1Var;
        this.f475500a = 0;
        this.f475515p = false;
        this.f475509j = null;
        this.f475514o = 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "startSession inited: " + this.f475505f + ", initStatus: " + this.f475506g + ", session: " + j17 + ", tabType: " + i17 + ", scanUISession: " + sessionInfo.f216986e + ", isSessionStopping: " + this.f475510k);
        zs5.b bVar = this.f475506g;
        if (bVar == zs5.b.f475319d || bVar == zs5.b.f475322g) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e(context, this.f475501b);
            this.f475512m = true;
            return;
        }
        if (bVar == zs5.b.f475320e) {
            this.f475512m = true;
            return;
        }
        if (this.f475510k) {
            this.f475513n = true;
            return;
        }
        this.f475524y = new com.tencent.wechat.aff.iam_scan.c0(this.f475525z);
        et5.e eVar = this.f475517r;
        if (eVar != null) {
            eVar.a(com.tencent.wechat.aff.iam_scan.a0.StartSessionFromNative);
        }
        com.tencent.wechat.aff.iam_scan.h0 h0Var = com.tencent.wechat.aff.iam_scan.h0.f217048b;
        com.tencent.wechat.aff.iam_scan.d1 d1Var2 = this.f475508i;
        com.tencent.wechat.aff.iam_scan.c0 c0Var = this.f475524y;
        kotlin.jvm.internal.o.d(c0Var);
        h0Var.i(d1Var2, c0Var);
        this.f475511l = true;
        com.tencent.wechat.aff.iam_scan.d1 d1Var3 = this.f475508i;
        d75.b.g(new zs5.i(d1Var3 != null ? d1Var3.f216985d : 0L, this, 0L));
    }

    @Override // at5.a
    public void d(long j17, com.tencent.wechat.aff.iam_scan.d1 d1Var) {
        com.tencent.wechat.aff.iam_scan.d1 d1Var2 = this.f475508i;
        boolean z17 = false;
        if (d1Var2 != null && j17 == d1Var2.f216985d) {
            z17 = true;
        }
        if (z17) {
            if ((d1Var != null ? d1Var.f216994p : null) == null || d1Var2 == null) {
                return;
            }
            d1Var2.f216994p = d1Var.f216994p;
        }
    }

    @Override // at5.a
    public void e(android.content.Context context, zs5.e0 decoderConfig) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(decoderConfig, "decoderConfig");
        zs5.b bVar = this.f475506g;
        zs5.b bVar2 = zs5.b.f475320e;
        if (bVar == bVar2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AffScanDecodeQueue", "initing and ignore");
            return;
        }
        this.f475506g = bVar2;
        this.f475507h = java.lang.System.currentTimeMillis();
        this.f475501b = decoderConfig;
        zs5.n nVar = new zs5.n(this);
        java.lang.Boolean bool = et5.a.f256670a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "init soLoaded " + bool + ", inited: " + this.f475505f + ", initStatus: " + this.f475506g + ", decoderConfig: " + decoderConfig);
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            nVar.invoke();
        } else if (bool == null || kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            ((ku5.t0) ku5.t0.f312615d).h(new zs5.l(nVar), "MicroMsg.AffScanDecodeQueue");
        }
    }

    @Override // at5.a
    public int f() {
        return this.f475500a;
    }

    @Override // at5.a
    public void g(et5.e reporter) {
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f475517r = reporter;
    }

    @Override // at5.a
    public void h(byte[] previewData, android.graphics.Point resolution, int i17, int i18, android.graphics.Rect cameraRect, android.graphics.Rect cameraRotateRect) {
        kotlin.jvm.internal.o.g(previewData, "previewData");
        kotlin.jvm.internal.o.g(resolution, "resolution");
        kotlin.jvm.internal.o.g(cameraRect, "cameraRect");
        kotlin.jvm.internal.o.g(cameraRotateRect, "cameraRotateRect");
        i(new zs5.d(this, previewData, resolution, i17, i18, cameraRect, cameraRotateRect, java.lang.System.currentTimeMillis()));
    }

    public final void i(final yz5.a aVar) {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable(aVar) { // from class: zs5.o

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f475453d;

            {
                kotlin.jvm.internal.o.g(aVar, "function");
                this.f475453d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f475453d.invoke();
            }
        }, "AffScanDecodeQueue");
    }

    @Override // at5.a
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "release qbarId: " + this.f475507h);
        et5.e eVar = this.f475517r;
        if (eVar != null) {
            eVar.a(com.tencent.wechat.aff.iam_scan.a0.ReleaseFromNative);
        }
        this.f475517r = null;
        this.f475505f = false;
        this.f475506g = zs5.b.f475319d;
        this.f475511l = false;
        this.f475510k = false;
        com.tencent.wechat.aff.iam_scan.h0.f217048b.e(this.f475507h);
        try {
            zs5.h0.f475402a.clear();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeNotRecognizeHelper", e17, "resetNoRecognizeCodeStringData", new java.lang.Object[0]);
        }
    }
}
