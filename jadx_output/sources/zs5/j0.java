package zs5;

/* loaded from: classes15.dex */
public final class j0 {
    public static final zs5.j0 P = new zs5.j0(new zs5.i0("scan"));
    public static final zs5.j0 Q = new zs5.j0(new zs5.i0("file"));
    public int A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f475416J;
    public int K;
    public int L;
    public java.lang.String M;
    public java.lang.Boolean N;
    public java.lang.Boolean O;

    /* renamed from: a, reason: collision with root package name */
    public final zs5.i0 f475417a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f475418b;

    /* renamed from: c, reason: collision with root package name */
    public long f475419c;

    /* renamed from: d, reason: collision with root package name */
    public long f475420d;

    /* renamed from: e, reason: collision with root package name */
    public int f475421e;

    /* renamed from: f, reason: collision with root package name */
    public long f475422f;

    /* renamed from: g, reason: collision with root package name */
    public int f475423g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f475424h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Point f475425i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f475426j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f475427k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f475428l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelscan.ScanCodeInfo f475429m;

    /* renamed from: n, reason: collision with root package name */
    public int f475430n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f475431o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f475432p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f475433q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f475434r;

    /* renamed from: s, reason: collision with root package name */
    public int f475435s;

    /* renamed from: t, reason: collision with root package name */
    public int f475436t;

    /* renamed from: u, reason: collision with root package name */
    public int f475437u;

    /* renamed from: v, reason: collision with root package name */
    public long f475438v;

    /* renamed from: w, reason: collision with root package name */
    public long f475439w;

    /* renamed from: x, reason: collision with root package name */
    public int f475440x;

    /* renamed from: y, reason: collision with root package name */
    public int f475441y;

    /* renamed from: z, reason: collision with root package name */
    public int f475442z;

    public j0(zs5.i0 scanStats) {
        kotlin.jvm.internal.o.g(scanStats, "scanStats");
        this.f475417a = scanStats;
        this.f475418b = "decodeCost-" + scanStats.f475406a;
        this.f475419c = -1L;
        this.f475427k = "";
        this.f475431o = "";
        this.f475432p = "";
        this.f475433q = "";
        this.M = "";
    }

    public final void a(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeReporter", "[" + this.f475418b + "] addScanTime: " + j17 + ", scanFrameCount: " + this.f475421e + ", tryHarder:" + z17);
        this.f475420d = this.f475420d + j17;
        this.f475421e = this.f475421e + 1;
        if (z17) {
            this.f475437u++;
            this.f475439w += j17;
        } else {
            this.f475436t++;
            this.f475438v += j17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0500, code lost:
    
        if (r0 == 2) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0525  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [int] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r31) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs5.j0.b(long):void");
    }

    public final java.lang.String c() {
        zs5.i0 i0Var = this.f475417a;
        i0Var.f475409d = (((float) i0Var.f475407b) * 1.0f) / i0Var.f475408c;
        i0Var.f475412g = (i0Var.f475410e * 1.0f) / i0Var.f475411f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeReporter", "scanStats(" + i0Var.f475406a + ") success: (total: %s, count: %s, avg: %s), all: (total: %s, count: %s, avg: %s)", java.lang.Long.valueOf(i0Var.f475407b), java.lang.Integer.valueOf(i0Var.f475408c), java.lang.Float.valueOf(i0Var.f475409d), java.lang.Float.valueOf(i0Var.f475410e), java.lang.Integer.valueOf(i0Var.f475411f), java.lang.Float.valueOf(i0Var.f475412g));
        java.lang.String format = java.lang.String.format("成功耗时：" + i0Var.f475409d + ", 次数：" + i0Var.f475408c + "\n单帧耗时：" + i0Var.f475412g + ", 次数：" + i0Var.f475411f, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        i0Var.f475407b = 0L;
        i0Var.f475408c = 0;
        i0Var.f475410e = 0.0f;
        i0Var.f475411f = 0;
        return format;
    }

    public final void d() {
        this.f475434r = false;
        this.f475419c = -1L;
        this.f475420d = 0L;
        this.f475421e = 0;
        this.f475423g = 0;
        this.f475424h = null;
        this.f475425i = null;
        this.f475428l = null;
        this.f475422f = 0L;
        this.f475426j = false;
        this.f475431o = "";
        this.f475432p = "";
        this.f475435s = 0;
        this.f475440x = 0;
        this.G = 0;
        this.H = false;
        this.f475441y = 0;
        this.f475442z = 0;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.f475436t = 0;
        this.f475437u = 0;
        this.f475438v = 0L;
        this.f475439w = 0L;
        this.f475416J = 0;
        this.K = 0;
        this.L = 0;
        this.I = false;
        this.f475429m = null;
        this.f475430n = 0;
        this.M = "";
        this.N = null;
        this.O = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeReporter", "reset");
    }

    public final void e(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeReporter", "[" + this.f475418b + "] setDecodeImageSize (" + i17 + ", " + i18 + ')');
        this.f475425i = new android.graphics.Point(i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r21, java.util.List r22, com.tencent.mm.modelscan.ScanCodeInfo r23) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs5.j0.f(java.util.List, java.util.List, com.tencent.mm.modelscan.ScanCodeInfo):void");
    }
}
