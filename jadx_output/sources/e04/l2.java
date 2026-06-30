package e04;

/* loaded from: classes15.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f246007a;

    /* renamed from: b, reason: collision with root package name */
    public long f246008b;

    /* renamed from: c, reason: collision with root package name */
    public long f246009c;

    /* renamed from: d, reason: collision with root package name */
    public long f246010d;

    /* renamed from: e, reason: collision with root package name */
    public float f246011e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f246012f;

    /* renamed from: g, reason: collision with root package name */
    public int f246013g;

    /* renamed from: h, reason: collision with root package name */
    public e04.k2 f246014h = e04.k2.f246000e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f246015i;

    /* renamed from: j, reason: collision with root package name */
    public long f246016j;

    /* renamed from: k, reason: collision with root package name */
    public long f246017k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f246018l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f246019m;

    public l2() {
        this.f246009c = 3000L;
        this.f246010d = 1000L;
        this.f246011e = 2.0f;
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R(gm0.j1.b().j() + "_scan_code_retry");
        this.f246007a = R;
        long j17 = R != null ? R.getLong("scan_code_retry_timeout", 3000L) : 3000L;
        this.f246008b = j17;
        this.f246013g = 1;
        this.f246009c = 3000L;
        this.f246010d = 1000L;
        this.f246011e = 200 / 100.0f;
        long max = java.lang.Math.max(1000L, j17);
        this.f246008b = max;
        this.f246008b = java.lang.Math.min(this.f246009c, max);
        int i17 = this.f246013g;
        if (i17 == 1) {
            this.f246015i = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanRetryManager", "init retryType: %d, maxTimeout: %d, minTimeout: %d, timeout: %d, timeoutFactor config: %d, factor: %f, canRetryReopenCamera: %b", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f246009c), java.lang.Long.valueOf(this.f246010d), java.lang.Long.valueOf(this.f246008b), 200, java.lang.Float.valueOf(this.f246011e), java.lang.Boolean.valueOf(this.f246015i));
    }
}
