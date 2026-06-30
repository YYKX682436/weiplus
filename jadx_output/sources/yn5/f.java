package yn5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f464021a;

    /* renamed from: b, reason: collision with root package name */
    public final long f464022b;

    /* renamed from: c, reason: collision with root package name */
    public final long f464023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f464024d;

    /* renamed from: e, reason: collision with root package name */
    public final int f464025e;

    /* renamed from: f, reason: collision with root package name */
    public final int f464026f;

    /* renamed from: g, reason: collision with root package name */
    public final float f464027g;

    /* renamed from: h, reason: collision with root package name */
    public final float f464028h;

    public f(long j17, long j18, long j19, int i17, int i18, int i19, float f17, float f18) {
        this.f464021a = j17;
        this.f464022b = j18;
        this.f464023c = j19;
        this.f464024d = i17;
        this.f464025e = i18;
        this.f464026f = i19;
        this.f464027g = f17;
        this.f464028h = f18;
    }

    public java.lang.String toString() {
        float f17 = 100;
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(this.f464027g * f17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(this.f464028h * f17)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        return "totalInflateCost:" + this.f464021a + "  asyncInflateCost:" + this.f464022b + " mainThreadInflateCost:" + this.f464023c + " asyncCostRatio:" + format + "% \n totalInflateCount:" + this.f464024d + " asyncInflateCount:" + this.f464025e + " mainThreadInflateCount:" + this.f464026f + " asyncCountRatio:" + format2 + '%';
    }
}
