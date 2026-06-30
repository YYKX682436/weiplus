package zv1;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f476265a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476266b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476267c;

    /* renamed from: d, reason: collision with root package name */
    public final long f476268d;

    public b(int i17, long j17, long j18, long j19) {
        this.f476265a = i17;
        this.f476266b = j17;
        this.f476267c = j18;
        this.f476268d = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.b)) {
            return false;
        }
        zv1.b bVar = (zv1.b) obj;
        return this.f476265a == bVar.f476265a && this.f476266b == bVar.f476266b && this.f476267c == bVar.f476267c && this.f476268d == bVar.f476268d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f476265a) * 31) + java.lang.Long.hashCode(this.f476266b)) * 31) + java.lang.Long.hashCode(this.f476267c)) * 31) + java.lang.Long.hashCode(this.f476268d);
    }

    public java.lang.String toString() {
        return "AllocationResult(allocType=" + this.f476265a + ", allocSize1=" + this.f476266b + ", allocSize2=" + this.f476267c + ", cacheSize=" + this.f476268d + ')';
    }
}
