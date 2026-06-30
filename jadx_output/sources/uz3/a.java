package uz3;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f432159a;

    /* renamed from: b, reason: collision with root package name */
    public long f432160b;

    public a(long j17, long j18) {
        this.f432159a = j17;
        this.f432160b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz3.a)) {
            return false;
        }
        uz3.a aVar = (uz3.a) obj;
        return this.f432159a == aVar.f432159a && this.f432160b == aVar.f432160b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f432159a) * 31) + java.lang.Long.hashCode(this.f432160b);
    }

    public java.lang.String toString() {
        return "PerformanceRecord(startScanProduct=" + this.f432159a + ", endScanProduct=" + this.f432160b + ')';
    }
}
