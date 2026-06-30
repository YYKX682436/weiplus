package cz2;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f224983a;

    /* renamed from: b, reason: collision with root package name */
    public long f224984b;

    public b(int i17, long j17) {
        this.f224983a = i17;
        this.f224984b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz2.b)) {
            return false;
        }
        cz2.b bVar = (cz2.b) obj;
        return this.f224983a == bVar.f224983a && this.f224984b == bVar.f224984b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f224983a) * 31) + java.lang.Long.hashCode(this.f224984b);
    }

    public java.lang.String toString() {
        return "TimeLimit(count=" + this.f224983a + ", lastTryTime=" + this.f224984b + ')';
    }
}
