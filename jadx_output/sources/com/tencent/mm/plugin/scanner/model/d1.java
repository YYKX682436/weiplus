package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.d1 f158843a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f158844b = true;

    /* renamed from: c, reason: collision with root package name */
    public static int f158845c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f158846d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static int f158847e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static transient boolean f158848f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f158849g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f158850h;

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f158851i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative f158852j;

    /* renamed from: k, reason: collision with root package name */
    public static com.tencent.mm.plugin.scanner.model.y0 f158853k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f158854l;

    /* renamed from: m, reason: collision with root package name */
    public static int f158855m;

    /* renamed from: n, reason: collision with root package name */
    public static int f158856n;

    /* renamed from: o, reason: collision with root package name */
    public static int f158857o;

    /* renamed from: p, reason: collision with root package name */
    public static int f158858p;

    /* renamed from: q, reason: collision with root package name */
    public static int f158859q;

    /* renamed from: r, reason: collision with root package name */
    public static long f158860r;

    /* renamed from: s, reason: collision with root package name */
    public static uz3.b f158861s;

    /* renamed from: t, reason: collision with root package name */
    public static long f158862t;

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f158863u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f158864v;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f158865w;

    static {
        com.tencent.mm.plugin.scanner.model.d1 d1Var = new com.tencent.mm.plugin.scanner.model.d1();
        f158843a = d1Var;
        f158852j = new com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative();
        f158853k = com.tencent.mm.plugin.scanner.model.y0.f159102d;
        f158862t = -1L;
        f158863u = jz5.h.b(com.tencent.mm.plugin.scanner.model.z0.f159109d);
        d1Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r0 == true) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer a(com.tencent.mm.plugin.scanner.model.d1 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6.getClass()
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r8)
            java.util.regex.Matcher r6 = r6.matcher(r7)
        Lb:
            boolean r7 = r6.find()
            if (r7 == 0) goto La7
            int r7 = r6.groupCount()
            if (r7 <= 0) goto Lb
            java.lang.String r0 = r6.group()
            java.lang.String r7 = "group(...)"
            kotlin.jvm.internal.o.f(r0, r7)
            java.lang.String r7 = "="
            java.lang.String[] r1 = new java.lang.String[]{r7}
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r7 = r26.n0.f0(r0, r1, r2, r3, r4, r5)
            int r8 = r7.size()
            r0 = 2
            if (r8 < r0) goto Lb
            r8 = 0
            java.lang.Object r0 = kz5.n0.a0(r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            java.lang.Object r7 = kz5.n0.a0(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r0 == 0) goto L80
            if (r9 == 0) goto L4c
            boolean r0 = r0.contentEquals(r9)
            goto L7d
        L4c:
            boolean r2 = r9 instanceof java.lang.String
            if (r2 == 0) goto L55
            boolean r0 = kotlin.jvm.internal.o.b(r0, r9)
            goto L7d
        L55:
            if (r0 != r9) goto L58
            goto L7a
        L58:
            if (r9 == 0) goto L7c
            int r2 = r0.length()
            int r3 = r9.length()
            if (r2 == r3) goto L65
            goto L7c
        L65:
            int r2 = r0.length()
            r3 = r8
        L6a:
            if (r3 >= r2) goto L7a
            char r4 = r0.charAt(r3)
            char r5 = r9.charAt(r3)
            if (r4 == r5) goto L77
            goto L7c
        L77:
            int r3 = r3 + 1
            goto L6a
        L7a:
            r0 = r1
            goto L7d
        L7c:
            r0 = r8
        L7d:
            if (r0 != r1) goto L80
            goto L81
        L80:
            r1 = r8
        L81:
            if (r1 == 0) goto Lb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "getScanProductServerConfigByKey key: "
            r6.<init>(r0)
            r6.append(r9)
            java.lang.String r9 = ", value: "
            r6.append(r9)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "MicroMsg.ScanFastFocusEngineManager"
            com.tencent.mars.xlog.Log.i(r9, r6)
            int r6 = com.tencent.mm.sdk.platformtools.t8.D1(r7, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto La8
        La7:
            r6 = 0
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.d1.a(com.tencent.mm.plugin.scanner.model.d1, java.lang.String, java.lang.String, java.lang.String):java.lang.Integer");
    }

    public static final com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo d(byte[] imageData, int i17, int i18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(imageData, "imageData");
        if (!com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative.isSoLoaded()) {
            return null;
        }
        com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative scanFastFocusEngineNative = f158852j;
        if (f158854l == null) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = f158851i;
            if (o4Var == null || (str = o4Var.getString("scan_config_phash_config", "")) == null) {
                str = "";
            }
            f158854l = str;
        }
        com.tencent.mm.plugin.scanner.model.d1 d1Var = f158843a;
        if (d1Var.k(4)) {
            d1Var.p(4);
        }
        java.lang.String str2 = f158854l;
        scanFastFocusEngineNative.setPHashConfig(str2 != null ? str2 : "");
        return scanFastFocusEngineNative.computeImagePHash(imageData, i17, i18, z17);
    }

    public static final com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative e(int i17, float f17, float f18, float f19, float f27) {
        if (f158853k != com.tencent.mm.plugin.scanner.model.y0.f159103e) {
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative scanFastFocusEngineNative = f158852j;
        scanFastFocusEngineNative.resetStatus();
        float f28 = (f19 - f17) * 0.100000024f;
        float f29 = (f27 - f18) * 0.100000024f;
        android.graphics.RectF rectF = new android.graphics.RectF(java.lang.Math.max(0.0f, f17 - f28), java.lang.Math.max(0.0f, f18 - f29), java.lang.Math.min(1.0f, f19 + f28), java.lang.Math.min(1.0f, f27 + f29));
        com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative cropYUVByTrackId = scanFastFocusEngineNative.getCropYUVByTrackId(i17, rectF.left, rectF.top, rectF.right, rectF.bottom);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        byte[] bArr = cropYUVByTrackId.bestImageData;
        objArr[1] = bArr;
        objArr[2] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis);
        objArr[4] = java.lang.Integer.valueOf(scanFastFocusEngineNative.width);
        objArr[5] = java.lang.Integer.valueOf(scanFastFocusEngineNative.height);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getCropYUVByTrackId trackId: %s, result image: %s, yuv size: %d, cost: %d, width: %d, height: %d", objArr);
        return cropYUVByTrackId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r4 == 13) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(boolean r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.d1.f(boolean):java.lang.String");
    }

    public static final android.graphics.Point g(int i17, int i18, int i19) {
        int i27;
        int i28;
        if (i19 == 90 || i19 == 270) {
            i27 = i17;
            i28 = i18;
        } else {
            i28 = i17;
            i27 = i18;
        }
        if (i28 <= 512) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getResizeImageSize not need resize");
            return new android.graphics.Point(i28, i27);
        }
        int i29 = (i27 * 512) / i28;
        if (i29 % 2 != 0) {
            i29 = java.lang.Math.max(0, i29 - 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getResizeImageSize width: " + i17 + ", height: " + i18 + ", rotation: " + i19 + ", resize: (512, " + i29 + ')');
        return new android.graphics.Point(512, i29);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sz3.c1 h(byte[] r21, int r22, int r23, int r24, int r25, dz3.g r26) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.d1.h(byte[], int, int, int, int, dz3.g):sz3.c1");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sz3.c1 i(int r22, android.graphics.RectF r23, byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.d1.i(int, android.graphics.RectF, byte[], int, int):sz3.c1");
    }

    public static final boolean j() {
        if (f158853k == com.tencent.mm.plugin.scanner.model.y0.f159103e) {
            return f158844b && !f158848f;
        }
        if (f158853k != com.tencent.mm.plugin.scanner.model.y0.f159104f) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needDetectByServer:");
        sb6.append(f158845c);
        sb6.append('/');
        int i17 = f158847e;
        if (i17 <= 0) {
            i17 = f158846d;
        }
        sb6.append(i17);
        sb6.append('/');
        sb6.append(f158848f);
        sb6.append('/');
        sb6.append(f158849g);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", sb6.toString());
        if (f158848f) {
            return false;
        }
        int i18 = f158845c;
        int i19 = f158847e;
        if (i18 < (i19 > 0 ? i19 : f158846d)) {
            return false;
        }
        if ((i19 > 0 ? i19 : f158846d) == i19) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 215);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 216);
        }
        if (f158849g) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 217);
            return false;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1259, 218);
        if (f158850h) {
            g0Var.A(1259, 219);
        }
        return true;
    }

    public static final void l() {
        if (f158853k == com.tencent.mm.plugin.scanner.model.y0.f159103e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "release");
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative scanFastFocusEngineNative = f158852j;
            scanFastFocusEngineNative.resetStatus();
            scanFastFocusEngineNative.nativeRelease();
        }
        f158853k = com.tencent.mm.plugin.scanner.model.y0.f159102d;
        f158845c = 0;
        f158848f = false;
        uz3.b bVar = f158861s;
        if (bVar != null) {
            int i17 = 0;
            long j17 = 0;
            for (java.util.Map.Entry entry : bVar.f432162b.entrySet()) {
                if (((uz3.a) entry.getValue()).f432159a != 0 && ((uz3.a) entry.getValue()).f432160b != 0) {
                    j17 += ((uz3.a) entry.getValue()).f432160b - ((uz3.a) entry.getValue()).f432159a;
                    i17++;
                }
            }
            java.util.Iterator it = ((java.util.ArrayList) bVar.f432163c).iterator();
            int i18 = 0;
            int i19 = 0;
            while (it.hasNext()) {
                i18 += ((java.lang.Number) it.next()).intValue();
                i19++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductPerformanceHelper", "dumpPerformance costTotal: %s, count: %s, average: %s, frameCost: %s, ave: %s, frameCount: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Float.valueOf((((float) j17) * 1.0f) / i17), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf((i18 * 1.0f) / i19), java.lang.Integer.valueOf(i19));
        }
        uz3.b bVar2 = f158861s;
        if (bVar2 != null && f158860r == bVar2.f432161a) {
            bVar2.f432162b.clear();
        }
        f158860r = 0L;
        f158849g = false;
        f158864v = null;
        f158865w = null;
        f158855m = 0;
        f158856n = 0;
        f158857o = 0;
        f158858p = 0;
        f158859q = 0;
    }

    public static final jz5.l m(byte[] bArr, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        if (f158853k != com.tencent.mm.plugin.scanner.model.y0.f159103e && f158853k != com.tencent.mm.plugin.scanner.model.y0.f159104f) {
            return null;
        }
        com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative scanFastFocusEngineNative = f158852j;
        scanFastFocusEngineNative.fullImageData = null;
        int intValue = num3 != null ? num3.intValue() : f158859q;
        int intValue2 = num != null ? num.intValue() : f158857o;
        int intValue3 = num2 != null ? num2.intValue() : f158858p;
        android.graphics.Point g17 = g(intValue2, intValue3, intValue);
        com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative rotateYUVImage = scanFastFocusEngineNative.rotateYUVImage(bArr, intValue2, intValue3, intValue, g17.x, g17.y);
        byte[] bArr2 = scanFastFocusEngineNative.fullImageData;
        return new jz5.l(rotateYUVImage != null ? rotateYUVImage.fullImageData : null, g17);
    }

    public static final void o(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "setDetectingByServer isDetecting: " + z17);
        f158848f = z17;
    }

    public final int[] b(byte[] byteArray) {
        kotlin.jvm.internal.o.g(byteArray, "byteArray");
        java.util.ArrayList arrayList = new java.util.ArrayList(byteArray.length);
        for (byte b17 : byteArray) {
            arrayList.add(java.lang.Integer.valueOf(b17));
        }
        return kz5.n0.R0(arrayList);
    }

    public final void c() {
        try {
            boolean a17 = gm0.j1.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f158851i);
            if (a17 && f158851i == null) {
                f158851i = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_scan_config_mmkv");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanFastFocusEngineManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    public final boolean k(int i17) {
        long j17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f158851i;
        if (o4Var != null) {
            j17 = o4Var.getLong("scan_config_last_update_" + i17, 0L);
        } else {
            j17 = 0;
        }
        return j17 == 0 || (j17 > 0 && java.lang.System.currentTimeMillis() - j17 >= 86400000);
    }

    public final void n(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "saveUpdateScanConfigTime type: %d, timestamp: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        com.tencent.mm.sdk.platformtools.o4 o4Var = f158851i;
        if (o4Var != null) {
            o4Var.putLong("scan_config_last_update_" + i17, j17);
        }
    }

    public final void p(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateScanConfig type: %d", java.lang.Integer.valueOf(i17));
        n(i17, java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.scanner.model.b1 b1Var = new com.tencent.mm.plugin.scanner.model.b1(i17);
        bz3.l lVar = bz3.l.f36802d;
        ((ku5.t0) ku5.t0.f312615d).h(new bz3.k(i17, b1Var), "ScanConfigSync");
    }
}
