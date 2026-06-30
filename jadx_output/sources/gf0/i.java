package gf0;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final double f271204a;

    /* renamed from: b, reason: collision with root package name */
    public final double f271205b;

    /* renamed from: c, reason: collision with root package name */
    public long f271206c;

    /* renamed from: d, reason: collision with root package name */
    public long f271207d;

    /* renamed from: e, reason: collision with root package name */
    public gf0.e f271208e;

    /* renamed from: g, reason: collision with root package name */
    public kf1.h f271210g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f271211h;

    /* renamed from: i, reason: collision with root package name */
    public f25.m0 f271212i;

    /* renamed from: j, reason: collision with root package name */
    public int f271213j;

    /* renamed from: k, reason: collision with root package name */
    public double f271214k;

    /* renamed from: l, reason: collision with root package name */
    public double f271215l;

    /* renamed from: n, reason: collision with root package name */
    public int f271217n;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f271209f = "";

    /* renamed from: m, reason: collision with root package name */
    public double f271216m = Double.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f271218o = "";

    public i(double d17, double d18, com.tencent.pigeon.ting.TingRecordFormat tingRecordFormat) {
        this.f271204a = d17;
        this.f271205b = d18;
    }

    public final void a() {
        f25.m0 m0Var = this.f271212i;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            this.f271212i = null;
        }
    }

    public final double b() {
        long j17 = this.f271206c;
        if (j17 <= 0) {
            return 0.0d;
        }
        long j18 = this.f271207d;
        if (j18 <= 0 || j18 <= j17) {
            return 0.0d;
        }
        return (j18 - j17) / 1000.0d;
    }

    public final java.lang.String c(int i17, boolean z17) {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("TingAudioCache");
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String concat = c17.concat("/TingAudioRecord/UploadTemp/");
        if (!com.tencent.mm.vfs.w6.j(concat)) {
            com.tencent.mm.vfs.w6.u(concat);
        }
        if (!z17) {
            return concat + i17 + ".mp3";
        }
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(concat + i17 + ".mp3", true);
        return i18 == null ? "" : i18;
    }
}
