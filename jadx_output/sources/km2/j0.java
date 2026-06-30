package km2;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f309112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f309113b;

    public j0(boolean z17, long j17) {
        this.f309112a = z17;
        this.f309113b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.j0)) {
            return false;
        }
        km2.j0 j0Var = (km2.j0) obj;
        return this.f309112a == j0Var.f309112a && this.f309113b == j0Var.f309113b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f309112a) * 31) + java.lang.Long.hashCode(this.f309113b);
    }

    public java.lang.String toString() {
        return "NextConfig(continuePolling=" + this.f309112a + ", delayTimeMs=" + this.f309113b + ')';
    }
}
