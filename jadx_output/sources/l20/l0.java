package l20;

/* loaded from: classes14.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f315169a;

    /* renamed from: b, reason: collision with root package name */
    public final long f315170b;

    public l0(long j17, long j18) {
        this.f315169a = j17;
        this.f315170b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20.l0)) {
            return false;
        }
        l20.l0 l0Var = (l20.l0) obj;
        return this.f315169a == l0Var.f315169a && this.f315170b == l0Var.f315170b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f315169a) * 31) + java.lang.Long.hashCode(this.f315170b);
    }

    public java.lang.String toString() {
        return "TimePeriod(startTime=" + this.f315169a + ", endTime=" + this.f315170b + ')';
    }

    public /* synthetic */ l0(long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? 0L : j18);
    }
}
