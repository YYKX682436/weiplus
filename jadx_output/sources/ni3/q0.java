package ni3;

/* loaded from: classes10.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f337701a;

    /* renamed from: b, reason: collision with root package name */
    public long f337702b;

    public q0(long j17, long j18, long j19, long j27, long j28) {
        this.f337701a = j17;
        this.f337702b = j28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.q0)) {
            return false;
        }
        ni3.q0 q0Var = (ni3.q0) obj;
        return this.f337701a == q0Var.f337701a && this.f337702b == q0Var.f337702b;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f337701a) * 31) + java.lang.Long.hashCode(-1L)) * 31) + java.lang.Long.hashCode(-1L)) * 31) + java.lang.Long.hashCode(-1L)) * 31) + java.lang.Long.hashCode(this.f337702b);
    }

    public java.lang.String toString() {
        return "FeedLifeTimeMs(toLocalTime=" + this.f337701a + ", toStreamTime=-1, toPreloadTime=-1, toPreRenderTime=-1, toReportTime=" + this.f337702b + ')';
    }
}
