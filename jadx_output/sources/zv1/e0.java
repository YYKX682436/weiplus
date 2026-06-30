package zv1;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f476290a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476291b;

    public e0(long j17, long j18) {
        this.f476290a = j17;
        this.f476291b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.e0)) {
            return false;
        }
        zv1.e0 e0Var = (zv1.e0) obj;
        return this.f476290a == e0Var.f476290a && this.f476291b == e0Var.f476291b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f476290a) * 31) + java.lang.Long.hashCode(this.f476291b);
    }

    public java.lang.String toString() {
        return "CleanCacheThreshold(bizThreshold=" + this.f476290a + ", totalThreshold=" + this.f476291b + ')';
    }
}
