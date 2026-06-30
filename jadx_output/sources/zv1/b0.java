package zv1;

/* loaded from: classes15.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zv1.a0 f476269a;

    /* renamed from: b, reason: collision with root package name */
    public final zv1.p f476270b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476271c;

    /* renamed from: d, reason: collision with root package name */
    public final long f476272d;

    /* renamed from: e, reason: collision with root package name */
    public final long f476273e;

    /* renamed from: f, reason: collision with root package name */
    public final long f476274f;

    /* renamed from: g, reason: collision with root package name */
    public final long f476275g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f476276h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f476277i;

    public b0(zv1.a0 cleanParams, zv1.p result, long j17, long j18, long j19, long j27, long j28, java.util.Map allocation, java.util.List cleanerResults) {
        kotlin.jvm.internal.o.g(cleanParams, "cleanParams");
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(allocation, "allocation");
        kotlin.jvm.internal.o.g(cleanerResults, "cleanerResults");
        this.f476269a = cleanParams;
        this.f476270b = result;
        this.f476271c = j17;
        this.f476272d = j18;
        this.f476273e = j19;
        this.f476274f = j27;
        this.f476275g = j28;
        this.f476276h = allocation;
        this.f476277i = cleanerResults;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.b0)) {
            return false;
        }
        zv1.b0 b0Var = (zv1.b0) obj;
        return kotlin.jvm.internal.o.b(this.f476269a, b0Var.f476269a) && this.f476270b == b0Var.f476270b && this.f476271c == b0Var.f476271c && this.f476272d == b0Var.f476272d && this.f476273e == b0Var.f476273e && this.f476274f == b0Var.f476274f && this.f476275g == b0Var.f476275g && kotlin.jvm.internal.o.b(this.f476276h, b0Var.f476276h) && kotlin.jvm.internal.o.b(this.f476277i, b0Var.f476277i);
    }

    public int hashCode() {
        return (((((((((((((((this.f476269a.hashCode() * 31) + this.f476270b.hashCode()) * 31) + java.lang.Long.hashCode(this.f476271c)) * 31) + java.lang.Long.hashCode(this.f476272d)) * 31) + java.lang.Long.hashCode(this.f476273e)) * 31) + java.lang.Long.hashCode(this.f476274f)) * 31) + java.lang.Long.hashCode(this.f476275g)) * 31) + this.f476276h.hashCode()) * 31) + this.f476277i.hashCode();
    }

    public java.lang.String toString() {
        return "CleanTaskReportData(cleanParams=" + this.f476269a + ", result=" + this.f476270b + ", cacheTotalSize=" + this.f476271c + ", expectCleanSize=" + this.f476272d + ", actualCleanSize=" + this.f476273e + ", exemptCleanSize=" + this.f476274f + ", duration=" + this.f476275g + ", allocation=" + this.f476276h + ", cleanerResults=" + this.f476277i + ')';
    }

    public /* synthetic */ b0(zv1.a0 a0Var, zv1.p pVar, long j17, long j18, long j19, long j27, long j28, java.util.Map map, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this(a0Var, pVar, (i17 & 4) != 0 ? 0L : j17, (i17 & 8) != 0 ? 0L : j18, (i17 & 16) != 0 ? 0L : j19, (i17 & 32) != 0 ? 0L : j27, (i17 & 64) != 0 ? 0L : j28, (i17 & 128) != 0 ? kz5.q0.f314001d : map, (i17 & 256) != 0 ? kz5.p0.f313996d : list);
    }
}
