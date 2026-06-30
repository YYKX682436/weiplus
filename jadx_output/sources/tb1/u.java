package tb1;

/* loaded from: classes13.dex */
public class u implements tb1.m, ub1.f {

    /* renamed from: a, reason: collision with root package name */
    public ub1.g f416936a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f416937b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public int f416938c = 200;

    /* renamed from: d, reason: collision with root package name */
    public final float f416939d;

    /* renamed from: e, reason: collision with root package name */
    public int f416940e;

    /* renamed from: f, reason: collision with root package name */
    public int f416941f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f416942g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f416943h;

    /* renamed from: i, reason: collision with root package name */
    public int f416944i;

    /* renamed from: j, reason: collision with root package name */
    public int f416945j;

    /* renamed from: k, reason: collision with root package name */
    public int f416946k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416947l;

    public u(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416947l = appBrandCameraView;
        this.f416939d = (appBrandCameraView.f80183u * 1.0f) / appBrandCameraView.f80184v;
        this.f416945j = appBrandCameraView.f80179q ? 1 : 0;
    }

    @Override // tb1.m
    public void a(byte[] bArr, int i17, int i18) {
        android.graphics.Point point;
        ub1.g gVar;
        int i19 = this.f416940e;
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416947l;
        if (i19 != appBrandCameraView.f80183u || this.f416941f != appBrandCameraView.f80184v) {
            int rotation = appBrandCameraView.N.getDefaultDisplay().getRotation();
            int i27 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
            int cameraRotation = appBrandCameraView.F.getCameraRotation();
            if ("front".equals(appBrandCameraView.f80174m)) {
                int i28 = cameraRotation % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                this.f416944i = i28;
                this.f416944i = (360 - i28) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            } else {
                this.f416944i = ((cameraRotation - i27) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            }
            if (appBrandCameraView.F != null) {
                this.f416940e = appBrandCameraView.f80183u;
                this.f416941f = appBrandCameraView.f80184v;
            }
            int i29 = this.f416944i;
            android.graphics.Rect rect = null;
            if (i17 <= 0 || i18 <= 0) {
                point = null;
            } else {
                float f17 = this.f416939d;
                if (i29 == 90 || i29 == 270) {
                    f17 = 1.0f / f17;
                }
                boolean z17 = ((float) i18) * f17 < ((float) i17);
                float f18 = 1.0f / f17;
                if (z17) {
                    int min = java.lang.Math.min(i18, i17);
                    int i37 = (int) (min / f18);
                    point = (i29 == 90 || i29 == 270) ? new android.graphics.Point(min, i37) : new android.graphics.Point(i37, min);
                } else {
                    this.f416945j = 1;
                    int max = java.lang.Math.max(i18, i17);
                    int i38 = (int) (max * f18);
                    point = (i29 == 90 || i29 == 270) ? new android.graphics.Point(i38, max) : new android.graphics.Point(max, i38);
                }
            }
            this.f416942g = point;
            if (point != null) {
                android.graphics.Rect rect2 = appBrandCameraView.f80187y;
                int i39 = appBrandCameraView.f80183u;
                int i47 = point.x;
                if (rect2 != null) {
                    float f19 = (i39 * 1.0f) / i47;
                    rect = new android.graphics.Rect(java.lang.Math.round(rect2.left / f19), java.lang.Math.round(rect2.top / f19), java.lang.Math.round(rect2.right / f19), java.lang.Math.round(rect2.bottom / f19));
                }
                this.f416943h = rect;
            }
        }
        if (this.f416937b.get() || (gVar = this.f416936a) == null || appBrandCameraView.F == null) {
            return;
        }
        int i48 = appBrandCameraView.f80183u;
        int i49 = appBrandCameraView.f80184v;
        android.graphics.Point point2 = this.f416942g;
        android.graphics.Rect rect3 = this.f416943h;
        int i57 = this.f416944i;
        int i58 = this.f416945j;
        gVar.getClass();
        ub1.a aVar = ((ub1.h) gVar).f426037b;
        if (bArr == null) {
            aVar.getClass();
        } else {
            aVar.f426017c.postToWorker(new ub1.c(aVar, bArr, i57, i17, i18, i48, i49, point2, rect3, i58));
        }
    }

    @Override // tb1.m
    public void b() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, safeStopRecord err");
    }

    @Override // tb1.m
    public void c(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, startRecord err");
    }

    @Override // tb1.m
    public void d(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, takePicture err");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: all -> 0x0103, TryCatch #1 {, blocks: (B:7:0x002c, B:9:0x0030, B:10:0x0038, B:18:0x003b, B:20:0x0047, B:22:0x0069, B:24:0x0070, B:26:0x0096, B:29:0x00b0, B:30:0x00cb, B:33:0x00cd, B:34:0x00d6, B:43:0x00ea, B:47:0x0102, B:36:0x00d7, B:38:0x00db, B:40:0x00df, B:41:0x00e4, B:42:0x00e9), top: B:6:0x002c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd A[Catch: all -> 0x0103, TryCatch #1 {, blocks: (B:7:0x002c, B:9:0x0030, B:10:0x0038, B:18:0x003b, B:20:0x0047, B:22:0x0069, B:24:0x0070, B:26:0x0096, B:29:0x00b0, B:30:0x00cb, B:33:0x00cd, B:34:0x00d6, B:43:0x00ea, B:47:0x0102, B:36:0x00d7, B:38:0x00db, B:40:0x00df, B:41:0x00e4, B:42:0x00e9), top: B:6:0x002c, inners: #0 }] */
    @Override // tb1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb1.u.init():void");
    }

    @Override // tb1.m
    public void release() {
        ub1.g gVar = this.f416936a;
        if (gVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            ub1.a aVar = ((ub1.h) gVar).f426037b;
            kd0.d3 d3Var = aVar.f426010e;
            objArr[0] = d3Var != null ? java.lang.Integer.valueOf(d3Var.hashCode()) : "null";
            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "release %s", objArr);
            synchronized (aVar.f426011f) {
                if (aVar.f426012g) {
                    kd0.d3 d3Var2 = aVar.f426010e;
                    if (d3Var2 != null) {
                        ((zs5.z) d3Var2).release();
                    }
                    aVar.f426010e = null;
                    aVar.f426012g = false;
                }
            }
        }
        this.f416942g = null;
        this.f416946k = 0;
    }
}
