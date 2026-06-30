package l20;

/* loaded from: classes14.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f315161a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f315162b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f315163c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f315164d;

    /* renamed from: e, reason: collision with root package name */
    public final l20.l0 f315165e;

    /* renamed from: f, reason: collision with root package name */
    public final l20.l0 f315166f;

    public k0(long j17, java.lang.Long l17, java.util.List bufferingPeriods, java.util.List pausePeriods, l20.l0 l0Var, l20.l0 l0Var2) {
        kotlin.jvm.internal.o.g(bufferingPeriods, "bufferingPeriods");
        kotlin.jvm.internal.o.g(pausePeriods, "pausePeriods");
        this.f315161a = j17;
        this.f315162b = l17;
        this.f315163c = bufferingPeriods;
        this.f315164d = pausePeriods;
        this.f315165e = l0Var;
        this.f315166f = l0Var2;
    }

    public static l20.k0 a(l20.k0 k0Var, long j17, java.lang.Long l17, java.util.List list, java.util.List list2, l20.l0 l0Var, l20.l0 l0Var2, int i17, java.lang.Object obj) {
        long j18 = (i17 & 1) != 0 ? k0Var.f315161a : j17;
        java.lang.Long l18 = (i17 & 2) != 0 ? k0Var.f315162b : l17;
        java.util.List bufferingPeriods = (i17 & 4) != 0 ? k0Var.f315163c : list;
        java.util.List pausePeriods = (i17 & 8) != 0 ? k0Var.f315164d : list2;
        l20.l0 l0Var3 = (i17 & 16) != 0 ? k0Var.f315165e : l0Var;
        l20.l0 l0Var4 = (i17 & 32) != 0 ? k0Var.f315166f : l0Var2;
        k0Var.getClass();
        kotlin.jvm.internal.o.g(bufferingPeriods, "bufferingPeriods");
        kotlin.jvm.internal.o.g(pausePeriods, "pausePeriods");
        return new l20.k0(j18, l18, bufferingPeriods, pausePeriods, l0Var3, l0Var4);
    }

    public final long b() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f315161a;
        long c17 = (uptimeMillis - j17) - c();
        long j18 = 0;
        for (l20.l0 l0Var : this.f315164d) {
            long j19 = l0Var.f315170b;
            j18 += j19 > 0 ? j19 - l0Var.f315169a : 0L;
        }
        l20.l0 l0Var2 = this.f315166f;
        long uptimeMillis2 = c17 - (j18 + (l0Var2 != null ? android.os.SystemClock.uptimeMillis() - l0Var2.f315169a : 0L));
        java.lang.Long l17 = this.f315162b;
        return uptimeMillis2 - (l17 != null ? l17.longValue() : android.os.SystemClock.uptimeMillis() - j17);
    }

    public final long c() {
        long j17 = 0;
        for (l20.l0 l0Var : this.f315163c) {
            long j18 = l0Var.f315170b;
            j17 += j18 > 0 ? j18 - l0Var.f315169a : 0L;
        }
        l20.l0 l0Var2 = this.f315165e;
        return j17 + (l0Var2 != null ? android.os.SystemClock.uptimeMillis() - l0Var2.f315169a : 0L);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20.k0)) {
            return false;
        }
        l20.k0 k0Var = (l20.k0) obj;
        return this.f315161a == k0Var.f315161a && kotlin.jvm.internal.o.b(this.f315162b, k0Var.f315162b) && kotlin.jvm.internal.o.b(this.f315163c, k0Var.f315163c) && kotlin.jvm.internal.o.b(this.f315164d, k0Var.f315164d) && kotlin.jvm.internal.o.b(this.f315165e, k0Var.f315165e) && kotlin.jvm.internal.o.b(this.f315166f, k0Var.f315166f);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f315161a) * 31;
        java.lang.Long l17 = this.f315162b;
        int hashCode2 = (((((hashCode + (l17 == null ? 0 : l17.hashCode())) * 31) + this.f315163c.hashCode()) * 31) + this.f315164d.hashCode()) * 31;
        l20.l0 l0Var = this.f315165e;
        int hashCode3 = (hashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        l20.l0 l0Var2 = this.f315166f;
        return hashCode3 + (l0Var2 != null ? l0Var2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PlaySession(startTime=" + this.f315161a + ", firstFrameLoadTime=" + this.f315162b + ", bufferingPeriods=" + this.f315163c + ", pausePeriods=" + this.f315164d + ", currentBuffering=" + this.f315165e + ", currentPause=" + this.f315166f + ')';
    }
}
