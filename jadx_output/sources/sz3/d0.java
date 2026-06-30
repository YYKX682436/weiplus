package sz3;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sz3.d0 f413991a = new sz3.d0();

    /* renamed from: b, reason: collision with root package name */
    public static int f413992b = e04.j2.a();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f413993c = bz3.h.a();

    /* renamed from: d, reason: collision with root package name */
    public static int f413994d;

    /* renamed from: e, reason: collision with root package name */
    public static int f413995e;

    /* renamed from: f, reason: collision with root package name */
    public static int f413996f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f413997g;

    /* renamed from: h, reason: collision with root package name */
    public static long f413998h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f413999i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f414000j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f414001k;

    /* renamed from: l, reason: collision with root package name */
    public static int f414002l;

    /* renamed from: m, reason: collision with root package name */
    public static tz3.c f414003m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile dz3.f f414004n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile dz3.f f414005o;

    public final void a(com.tencent.wechat.aff.iam_scan.y yVar, tz3.d dVar, boolean z17) {
        if (f414001k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanGoodsNoModelDetectManager", "dealDecodeImage image is decoding");
            return;
        }
        dz3.f fVar = f414004n;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanGoodsNoModelDetectManager", "dealDecodeImage sPendingImage is null");
            return;
        }
        dz3.f fVar2 = f414005o;
        boolean z18 = false;
        if (fVar2 != null && fVar.f245110a == fVar2.f245110a) {
            z18 = true;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanGoodsNoModelDetectManager", "dealDecodeImage image id is same, do not decode");
            return;
        }
        f414001k = true;
        if (z17) {
            c(new sz3.z(yVar, dVar));
        } else {
            b(yVar, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.wechat.aff.iam_scan.y r10, tz3.d r11) {
        /*
            r9 = this;
            int r0 = r11.f423334e
            int r4 = et5.h.g(r0)
            dz3.f r0 = sz3.d0.f414004n
            r7 = 0
            java.lang.String r1 = "MicroMsg.ScanGoodsNoModelDetectManager"
            if (r0 != 0) goto L15
            java.lang.String r0 = "runDecodeTaskImpl sPendingImage is null"
            com.tencent.mars.xlog.Log.w(r1, r0)
        L12:
            r8 = r7
            goto La6
        L15:
            boolean r0 = sz3.d0.f413997g
            if (r0 != 0) goto L1f
            java.lang.String r0 = "runDecodeTaskImpl ffe init fail"
            com.tencent.mars.xlog.Log.e(r1, r0)
            goto L12
        L1f:
            dz3.f r0 = sz3.d0.f414004n
            sz3.d0.f414005o = r0
            dz3.f r0 = sz3.d0.f414005o
            if (r0 != 0) goto L2d
            java.lang.String r0 = "runDecodeTaskImpl sDecodingImage is null"
            com.tencent.mars.xlog.Log.w(r1, r0)
            goto L12
        L2d:
            int r0 = sz3.d0.f413995e
            r8 = 1
            int r0 = r0 + r8
            sz3.d0.f413995e = r0
            boolean r0 = sz3.d0.f413993c
            if (r0 == 0) goto L48
            if (r10 == 0) goto L48
            int r0 = r10.f217182f
            if (r0 <= 0) goto L48
            int r0 = sz3.d0.f413996f
            int r0 = r0 + r8
            sz3.d0.f413996f = r0
            java.lang.String r0 = "runDecodeTaskImpl filter code frame"
            com.tencent.mars.xlog.Log.w(r1, r0)
            goto L12
        L48:
            int r0 = r11.f423331b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r11.f423332c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            dz3.f r3 = sz3.d0.f414005o
            kotlin.jvm.internal.o.d(r3)
            byte[] r3 = r3.f245111b
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r11.f423333d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r11.f423334e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r3, r5, r6}
            java.lang.String r2 = "runDecodeTaskImpl resolution: (%s, %s), previewData length: %d, cameraRotation: %d, previewFormat: %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            dz3.f r0 = sz3.d0.f414005o
            kotlin.jvm.internal.o.d(r0)
            byte[] r1 = r0.f245111b
            java.lang.String r0 = "imageData"
            kotlin.jvm.internal.o.f(r1, r0)
            int r2 = r11.f423332c
            int r3 = r11.f423331b
            int r5 = r11.f423333d
            r6 = 0
            sz3.c1 r0 = com.tencent.mm.plugin.scanner.model.d1.h(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L9f
            boolean r1 = r0.f413983j
            if (r1 == 0) goto L96
            r0.f413987n = r8
            r0.f413985l = r8
        L96:
            r1 = 3
            r0.f413974a = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f413975b = r1
        L9f:
            tz3.c r1 = sz3.d0.f414003m
            if (r1 == 0) goto La6
            r1.b(r0)
        La6:
            sz3.d0.f414001k = r7
            if (r8 == 0) goto Lad
            r9.a(r10, r11, r7)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.d0.b(com.tencent.wechat.aff.iam_scan.y, tz3.d):void");
    }

    public final void c(com.tencent.mm.plugin.scanner.model.e1 e1Var) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        kotlin.jvm.internal.o.d(e1Var);
        ((ku5.t0) u0Var).h(e1Var, "MicroMsg.ScanGoodsNoModelDetectManager");
    }
}
