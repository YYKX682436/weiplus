package vz3;

/* loaded from: classes15.dex */
public final class q implements tz3.a {

    /* renamed from: a, reason: collision with root package name */
    public long f441696a;

    /* renamed from: b, reason: collision with root package name */
    public int f441697b;

    /* renamed from: c, reason: collision with root package name */
    public vz3.a f441698c;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.h f441700e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441701f;

    /* renamed from: g, reason: collision with root package name */
    public tz3.c f441702g;

    /* renamed from: h, reason: collision with root package name */
    public long f441703h;

    /* renamed from: i, reason: collision with root package name */
    public sz3.a1 f441704i;

    /* renamed from: j, reason: collision with root package name */
    public sz3.x0 f441705j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.m0 f441706k;

    /* renamed from: d, reason: collision with root package name */
    public vz3.b f441699d = vz3.b.f441669d;

    /* renamed from: l, reason: collision with root package name */
    public final vz3.p f441707l = new vz3.p(this);

    public static final void n(vz3.q qVar) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        qVar.getClass();
        com.tencent.wechat.aff.iam_scan.h hVar = new com.tencent.wechat.aff.iam_scan.h();
        wz3.e.a();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
        sz3.y a17 = sz3.y.f414155e.a();
        hVar.f217038d = a17.f414156a;
        boolean[] zArr = hVar.f217047p;
        zArr[1] = true;
        hVar.f217039e = a17.f414157b;
        zArr[2] = true;
        hVar.f217040f = !bz3.h.f36780g;
        zArr[3] = true;
        e04.j2 j2Var = e04.j2.f245987a;
        com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
        int i17 = bz3.h.f36781h;
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
        if (o4Var2 != null) {
            i17 = o4Var2.getInt("scan_config_server_detect_frame_count", i17);
        }
        if (e04.j2.f245989c && (o4Var = e04.j2.f245988b) != null) {
            i17 = o4Var.getInt("scan_product_server_detect_frame_count", i17);
        }
        hVar.f217041g = i17;
        zArr[4] = true;
        hVar.f217042h = com.tencent.mm.plugin.scanner.model.d1.f(true);
        zArr[5] = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInitFFE modelPath: ");
        sb6.append(zArr[1] ? hVar.f217038d : "");
        sb6.append(", scanClsModelPath: ");
        sb6.append(zArr[2] ? hVar.f217039e : "");
        sb6.append(", enableServerDetect: ");
        sb6.append(hVar.f217040f);
        sb6.append(", serverDetectFrameCount: ");
        sb6.append(hVar.f217041g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", sb6.toString());
        qVar.f441700e = hVar;
        com.tencent.wechat.aff.iam_scan.t0.f217133b.b(qVar.f441700e, new vz3.f(java.lang.System.currentTimeMillis(), qVar));
    }

    @Override // tz3.a
    public void a() {
    }

    @Override // tz3.a
    public void b(int i17) {
    }

    @Override // tz3.a
    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "addProduct trackId: " + i17);
        com.tencent.wechat.aff.iam_scan.t0.f217133b.a(i17, vz3.c.f441674a);
    }

    @Override // tz3.a
    public void d(int i17, int i18, int i19, int i27) {
        this.f441698c = new vz3.a(i17, i18, i19, i27);
    }

    @Override // tz3.a
    public void e(int i17, sz3.a1 requestInfo, sz3.x0 serverRecognizeResult, android.graphics.RectF rectF, byte[] bArr, int i18, int i19, tz3.c cVar) {
        kotlin.jvm.internal.o.g(requestInfo, "requestInfo");
        kotlin.jvm.internal.o.g(serverRecognizeResult, "serverRecognizeResult");
        if (bArr == null) {
            if (cVar != null) {
                cVar.b(null);
                return;
            }
            return;
        }
        sz3.d0 d0Var = sz3.d0.f413991a;
        if (sz3.d0.f413999i) {
            if (sz3.d0.f414000j) {
                d0Var.c(new sz3.a0(bArr, rectF, i17, i18, i19, serverRecognizeResult, cVar, requestInfo));
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "decodeFullImage is not working");
                return;
            }
        }
        if (this.f441703h != 0) {
            this.f441704i = requestInfo;
            this.f441705j = serverRecognizeResult;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            com.tencent.wechat.aff.iam_scan.t0 t0Var = com.tencent.wechat.aff.iam_scan.t0.f217133b;
            com.tencent.wechat.aff.iam_scan.p pVar = new com.tencent.wechat.aff.iam_scan.p();
            pVar.f217114d = rectF != null ? rectF.left : 0.0f;
            boolean[] zArr = pVar.f217118h;
            zArr[1] = true;
            pVar.f217115e = rectF != null ? rectF.top : 0.0f;
            zArr[2] = true;
            pVar.f217116f = rectF != null ? rectF.width() : 0.0f;
            pVar.f217118h[3] = true;
            pVar.f217117g = rectF != null ? rectF.height() : 0.0f;
            pVar.f217118h[4] = true;
            t0Var.c(allocateDirect, i18, i19, pVar, new vz3.d(cVar));
        }
    }

    @Override // tz3.a
    public void f(com.tencent.wechat.aff.iam_scan.n data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (this.f441703h != 0) {
            com.tencent.wechat.aff.iam_scan.t0.f217133b.g(data);
        }
    }

    @Override // tz3.a
    public void g(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "startGoodsSession sessionId: " + j17 + ", initStatus: " + this.f441699d);
        this.f441696a = 0L;
        this.f441697b = 0;
        this.f441703h = j17;
        vz3.b bVar = this.f441699d;
        if (bVar == vz3.b.f441669d) {
            init();
            this.f441701f = true;
            return;
        }
        if (bVar == vz3.b.f441670e) {
            this.f441701f = true;
            return;
        }
        this.f441701f = false;
        this.f441706k = new com.tencent.wechat.aff.iam_scan.m0(this.f441707l);
        com.tencent.wechat.aff.iam_scan.t0 t0Var = com.tencent.wechat.aff.iam_scan.t0.f217133b;
        com.tencent.wechat.aff.iam_scan.q qVar = new com.tencent.wechat.aff.iam_scan.q();
        qVar.f217119d = j17;
        qVar.f217121f[1] = true;
        com.tencent.wechat.aff.iam_scan.i iVar = new com.tencent.wechat.aff.iam_scan.i();
        iVar.f217050d = bz3.h.f36779f;
        boolean[] zArr = iVar.f217053g;
        zArr[1] = true;
        iVar.f217051e = false;
        zArr[2] = true;
        iVar.f217052f = false;
        zArr[3] = true;
        qVar.f217120e = iVar;
        qVar.f217121f[2] = true;
        t0Var.f(qVar, this.f441706k);
        sz3.k0 k0Var = sz3.k0.f414039a;
        ((ku5.t0) ku5.t0.f312615d).h(sz3.i0.f414028d, "MicroMsg.ScanGoodsSensorDetectManager");
    }

    @Override // tz3.a
    public void h(tz3.c callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f441702g = callback;
    }

    @Override // tz3.a
    public void i(byte[] yuvData, tz3.b callback) {
        kotlin.jvm.internal.o.g(yuvData, "yuvData");
        kotlin.jvm.internal.o.g(callback, "callback");
        vz3.a aVar = this.f441698c;
        if (aVar == null) {
            ((sz3.p0) callback).a(false, null, 0, 0);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(yuvData.length);
        allocateDirect.put(yuvData);
        com.tencent.wechat.aff.iam_scan.t0 t0Var = com.tencent.wechat.aff.iam_scan.t0.f217133b;
        com.tencent.wechat.aff.iam_scan.m mVar = new com.tencent.wechat.aff.iam_scan.m();
        mVar.f217100d = aVar.f441665a;
        boolean[] zArr = mVar.f217103g;
        zArr[1] = true;
        mVar.f217101e = aVar.f441666b;
        zArr[2] = true;
        mVar.f217102f = et5.h.g(aVar.f441667c);
        zArr[3] = true;
        t0Var.e(allocateDirect, mVar, aVar.f441668d, new vz3.l(currentTimeMillis, callback));
    }

    @Override // tz3.a
    public void init() {
        vz3.b bVar = this.f441699d;
        vz3.b bVar2 = vz3.b.f441670e;
        if (bVar == bVar2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AffScanGoodsQueue", "initing and ignore");
            return;
        }
        this.f441699d = bVar2;
        vz3.k kVar = new vz3.k(this);
        java.lang.Boolean bool = et5.a.f256671b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "init soLoaded: " + bool + ", initStatus: " + this.f441699d);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool, bool2)) {
            kVar.invoke(bool2);
            return;
        }
        if (bool == null || kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            ((ku5.t0) ku5.t0.f312615d).h(new vz3.m(new vz3.i(kVar, this)), "MicroMsg.AffScanGoodsQueue");
        }
    }

    @Override // tz3.a
    public void j() {
    }

    @Override // tz3.a
    public void k(com.tencent.wechat.aff.iam_scan.y yVar, tz3.d dVar) {
        if (yVar == null || dVar == null) {
            return;
        }
        sz3.d0 d0Var = sz3.d0.f413991a;
        if (sz3.d0.f413999i) {
            if (!sz3.d0.f414000j) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask is not working");
                return;
            }
            if (sz3.d0.f413998h == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask sessionId invalid");
                return;
            }
            byte[] bArr = dVar.f423330a;
            if (!(bArr != null && bArr.length > 0)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask previewData is empty");
                return;
            }
            int i17 = sz3.d0.f414002l;
            if (i17 < sz3.d0.f413992b) {
                sz3.d0.f414002l = i17 + 1;
                return;
            }
            sz3.d0.f414002l = 0;
            sz3.d0.f413994d++;
            if (!sz3.k0.f414039a.a()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "addDecodeTask is not stable");
                return;
            }
            byte[] previewData = dVar.f423330a;
            kotlin.jvm.internal.o.f(previewData, "previewData");
            dz3.f fVar = new dz3.f();
            fVar.f245111b = previewData;
            fVar.f245110a = java.lang.System.currentTimeMillis();
            sz3.d0.f414004n = fVar;
            d0Var.a(yVar, dVar, true);
        }
    }

    @Override // tz3.a
    public void l(long j17) {
        if (this.f441703h == j17) {
            sz3.k0 k0Var = sz3.k0.f414039a;
            ((ku5.t0) ku5.t0.f312615d).h(sz3.j0.f414036d, "MicroMsg.ScanGoodsSensorDetectManager");
            sz3.d0 d0Var = sz3.d0.f413991a;
            long j18 = this.f441703h;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "stopGoodsSession sessionId: " + j18);
            if (sz3.d0.f413998h == j18) {
                sz3.d0.f414002l = 0;
            }
            com.tencent.mm.plugin.scanner.model.d1.o(false);
            this.f441703h = 0L;
            if (this.f441697b > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "stopGoodsSession totalCost: " + this.f441696a + ", avg: " + (this.f441696a / this.f441697b));
            }
            this.f441706k = null;
        }
    }

    @Override // tz3.a
    public void m() {
    }

    @Override // tz3.a
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "releaseFFE initStatus: " + this.f441699d);
        this.f441699d = vz3.b.f441669d;
        this.f441704i = null;
        this.f441705j = null;
        this.f441702g = null;
        com.tencent.wechat.aff.iam_scan.t0.f217133b.d();
        sz3.d0 d0Var = sz3.d0.f413991a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "release");
        d0Var.c(sz3.c0.f413973d);
        sz3.d0.f414000j = false;
        sz3.d0.f414002l = 0;
        sz3.d0.f414003m = null;
        if (sz3.d0.f413994d == 0 || sz3.d0.f413995e == 0) {
            return;
        }
        com.tencent.mm.plugin.scanner.model.c cVar = new com.tencent.mm.plugin.scanner.model.c(0);
        cVar.f158832i = ((int) ((sz3.d0.f413996f * 100.0f) / sz3.d0.f413995e)) + "_" + ((int) ((sz3.d0.f413995e * 100.0f) / sz3.d0.f413994d)) + "_" + sz3.d0.f413994d + "_" + sz3.d0.f413995e + "_" + sz3.d0.f413996f;
        com.tencent.mm.plugin.scanner.model.d.a(140, cVar);
        sz3.d0.f413994d = 0;
        sz3.d0.f413995e = 0;
        sz3.d0.f413996f = 0;
    }
}
