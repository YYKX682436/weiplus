package ym5;

/* loaded from: classes15.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f463363a;

    /* renamed from: b, reason: collision with root package name */
    public int f463364b;

    /* renamed from: c, reason: collision with root package name */
    public int f463365c;

    /* renamed from: d, reason: collision with root package name */
    public double f463366d;

    /* renamed from: e, reason: collision with root package name */
    public double f463367e;

    /* renamed from: f, reason: collision with root package name */
    public int f463368f;

    /* renamed from: g, reason: collision with root package name */
    public int f463369g;

    /* renamed from: h, reason: collision with root package name */
    public double f463370h;

    /* renamed from: i, reason: collision with root package name */
    public double f463371i;

    public h2(long j17, int i17, int i18, double d17, double d18, int i19, int i27, double d19, double d27, int i28, kotlin.jvm.internal.i iVar) {
        long j18 = (i28 & 1) != 0 ? 0L : j17;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        int i37 = (i28 & 4) != 0 ? 0 : i18;
        double d28 = (i28 & 8) != 0 ? 0.0d : d17;
        double d29 = (i28 & 16) != 0 ? 0.0d : d18;
        int i38 = (i28 & 32) != 0 ? 0 : i19;
        int i39 = (i28 & 64) == 0 ? i27 : 0;
        double d37 = (i28 & 128) != 0 ? 0.0d : d19;
        double d38 = (i28 & 256) == 0 ? d27 : 0.0d;
        this.f463363a = j18;
        this.f463364b = i29;
        this.f463365c = i37;
        this.f463366d = d28;
        this.f463367e = d29;
        this.f463368f = i38;
        this.f463369g = i39;
        this.f463370h = d37;
        this.f463371i = d38;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.h2)) {
            return false;
        }
        ym5.h2 h2Var = (ym5.h2) obj;
        return this.f463363a == h2Var.f463363a && this.f463364b == h2Var.f463364b && this.f463365c == h2Var.f463365c && java.lang.Double.compare(this.f463366d, h2Var.f463366d) == 0 && java.lang.Double.compare(this.f463367e, h2Var.f463367e) == 0 && this.f463368f == h2Var.f463368f && this.f463369g == h2Var.f463369g && java.lang.Double.compare(this.f463370h, h2Var.f463370h) == 0 && java.lang.Double.compare(this.f463371i, h2Var.f463371i) == 0;
    }

    public int hashCode() {
        return (((((((((((((((java.lang.Long.hashCode(this.f463363a) * 31) + java.lang.Integer.hashCode(this.f463364b)) * 31) + java.lang.Integer.hashCode(this.f463365c)) * 31) + java.lang.Double.hashCode(this.f463366d)) * 31) + java.lang.Double.hashCode(this.f463367e)) * 31) + java.lang.Integer.hashCode(this.f463368f)) * 31) + java.lang.Integer.hashCode(this.f463369g)) * 31) + java.lang.Double.hashCode(this.f463370h)) * 31) + java.lang.Double.hashCode(this.f463371i);
    }

    public java.lang.String toString() {
        return "ReportContent(curLiveId=" + this.f463363a + ", rfxPlayCnt=" + this.f463364b + ", rfxFrameCnt=" + this.f463365c + ", rfxMax=" + this.f463366d + ", rfxTotal=" + this.f463367e + ", pagPlayCnt=" + this.f463368f + ", pagFrameCnt=" + this.f463369g + ", pagMax=" + this.f463370h + ", pagTotal=" + this.f463371i + ')';
    }
}
