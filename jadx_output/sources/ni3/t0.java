package ni3;

/* loaded from: classes9.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public long f337736a;

    /* renamed from: b, reason: collision with root package name */
    public int f337737b;

    public t0(long j17, int i17) {
        this.f337736a = j17;
        this.f337737b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.t0)) {
            return false;
        }
        ni3.t0 t0Var = (ni3.t0) obj;
        return this.f337736a == t0Var.f337736a && this.f337737b == t0Var.f337737b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f337736a) * 31) + java.lang.Integer.hashCode(this.f337737b);
    }

    public java.lang.String toString() {
        return "LoadParams(loadSize=" + this.f337736a + ", loadPercent=" + this.f337737b + ')';
    }
}
