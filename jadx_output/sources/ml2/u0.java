package ml2;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public long f328029a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f328030b;

    public u0(long j17, boolean z17) {
        this.f328029a = j17;
        this.f328030b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.u0)) {
            return false;
        }
        ml2.u0 u0Var = (ml2.u0) obj;
        return this.f328029a == u0Var.f328029a && this.f328030b == u0Var.f328030b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f328029a) * 31) + java.lang.Boolean.hashCode(this.f328030b);
    }

    public java.lang.String toString() {
        return "HellPair(time=" + this.f328029a + ", state=" + this.f328030b + ')';
    }
}
