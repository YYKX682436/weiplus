package zd1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final long f471581a;

    /* renamed from: b, reason: collision with root package name */
    public final int f471582b;

    public x(long j17, int i17) {
        this.f471581a = j17;
        this.f471582b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.x)) {
            return false;
        }
        zd1.x xVar = (zd1.x) obj;
        return this.f471581a == xVar.f471581a && this.f471582b == xVar.f471582b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f471581a) * 31) + java.lang.Integer.hashCode(this.f471582b);
    }

    public java.lang.String toString() {
        return "StartArgs(intervalMillis=" + this.f471581a + ", shortEdge=" + this.f471582b + ')';
    }
}
