package com.tencent.mm.plugin.scanner.util;

/* loaded from: classes13.dex */
public class ScanCameraLightDetector {

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector f159829l = new com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f159831b;

    /* renamed from: c, reason: collision with root package name */
    public int f159832c;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f159834e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f159835f;

    /* renamed from: a, reason: collision with root package name */
    public int f159830a = 50;

    /* renamed from: d, reason: collision with root package name */
    public long f159833d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f159836g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f159837h = 72;

    /* renamed from: i, reason: collision with root package name */
    public int f159838i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f159839j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f159840k = false;

    public static boolean a(com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector, byte[] bArr, int i17, int i18) {
        int i19;
        boolean z17;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        scanCameraLightDetector.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr) || bArr.length <= (i19 = i17 * i18)) {
            return false;
        }
        int calcLumNative = calcLumNative(bArr, i17, i18);
        boolean z18 = calcLumNative < scanCameraLightDetector.f159830a;
        if (scanCameraLightDetector.f159836g) {
            if (bArr.length < i19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanCameraLightDetector", "YUV data too small");
                z17 = false;
                i27 = 0;
            } else {
                double[] dArr = new double[4];
                int i39 = 0;
                for (int i47 = 4; i39 < i47; i47 = 4) {
                    if (i39 < 2) {
                        i29 = (i39 * i17) / 2;
                        i37 = ((i39 + 1) * i17) / 2;
                        i38 = i18 / 2;
                        i28 = 0;
                    } else {
                        i28 = i18 / 2;
                        i29 = ((i39 - 2) * i17) / 2;
                        i37 = ((i39 - 1) * i17) / 2;
                        i38 = i18;
                    }
                    long j17 = 0;
                    int i48 = 0;
                    while (i28 < i38) {
                        int i49 = i29;
                        while (i49 < i37) {
                            j17 += bArr[(i28 * i17) + i49] & 255;
                            i48++;
                            i49++;
                            i29 = i29;
                            i37 = i37;
                        }
                        i28++;
                    }
                    dArr[i39] = java.lang.Math.round((i48 > 0 ? j17 / i48 : 0.0d) * 100.0d) / 100.0d;
                    i39++;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraLightDetector", "lum light chunking: " + java.util.Arrays.toString(dArr));
                z17 = false;
                double d17 = dArr[0];
                for (int i57 = 1; i57 < 4; i57++) {
                    double d18 = dArr[i57];
                    if (d18 < d17) {
                        d17 = d18;
                    }
                }
                i27 = (int) d17;
            }
            if (i27 < scanCameraLightDetector.f159830a) {
                z18 = true;
            }
        } else {
            z17 = false;
            i27 = 0;
        }
        if (calcLumNative < scanCameraLightDetector.f159837h) {
            z17 = true;
        }
        long j18 = scanCameraLightDetector.f159839j;
        int i58 = scanCameraLightDetector.f159838i;
        long j19 = (j18 * i58) + calcLumNative;
        int i59 = i58 + 1;
        scanCameraLightDetector.f159838i = i59;
        long j27 = j19 / i59;
        scanCameraLightDetector.f159839j = j27;
        int i66 = (int) j27;
        if (scanCameraLightDetector.f159840k) {
            com.tencent.wechat.aff.iam_scan.h0.f217048b.g(true, i66);
        } else {
            com.tencent.wechat.aff.iam_scan.h0.f217048b.g(z17, i66);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraLightDetector", "lum light: %s, lum new light: %s(%s), darkMode: %s, lum avg: %s", java.lang.Integer.valueOf(calcLumNative), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(scanCameraLightDetector.f159836g), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i66));
        return z18;
    }

    private static native int calcLumNative(byte[] bArr, int i17, int i18);

    public void b(byte[] bArr, int i17, int i18) {
        android.os.HandlerThread handlerThread;
        long j17 = this.f159833d;
        if (j17 >= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 1000) {
                return;
            }
        }
        if (this.f159835f == null || (handlerThread = this.f159834e) == null || !handlerThread.isAlive()) {
            return;
        }
        e04.e1 e1Var = new e04.e1(this, null);
        e1Var.f245892a = bArr;
        e1Var.f245893b = i17;
        e1Var.f245894c = i18;
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
        obtain.obj = e1Var;
        this.f159835f.sendMessage(obtain);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f159833d = android.os.SystemClock.elapsedRealtime();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraLightDetector", "initDetectThread");
        d();
        this.f159838i = 0;
        this.f159839j = 0L;
        this.f159840k = false;
        this.f159836g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_torch_chunking_opt, false);
        this.f159830a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_service_yuv_dark_threshold_v1, 60);
        this.f159837h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_service_dark_mode_threshold_v1, 72);
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("ScanCameraLightDetector_detectThread", 5);
        this.f159834e = a17;
        a17.start();
        this.f159835f = new e04.d1(this, this.f159834e.getLooper());
    }

    public void d() {
        try {
            this.f159833d = -1L;
            android.os.HandlerThread handlerThread = this.f159834e;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCameraLightDetector", e17, "stop error: %s", e17.getMessage());
        }
    }
}
