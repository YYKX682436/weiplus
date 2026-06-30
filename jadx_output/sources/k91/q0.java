package k91;

/* loaded from: classes7.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f305729a;

    /* renamed from: b, reason: collision with root package name */
    public long f305730b;

    public q0(boolean z17, long j17) {
        this.f305729a = z17;
        this.f305730b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k91.q0)) {
            return false;
        }
        k91.q0 q0Var = (k91.q0) obj;
        return this.f305729a == q0Var.f305729a && this.f305730b == q0Var.f305730b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f305729a) * 31) + java.lang.Long.hashCode(this.f305730b);
    }

    public java.lang.String toString() {
        return "AppBrandOptimizationInfo(needDownload=" + this.f305729a + ", startTime=" + this.f305730b + ')';
    }

    public /* synthetic */ q0(boolean z17, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? 0L : j17);
    }
}
