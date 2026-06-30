package zc5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f471444a;

    /* renamed from: b, reason: collision with root package name */
    public final long f471445b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f471446c;

    public g(long j17, long j18, boolean z17) {
        this.f471444a = j17;
        this.f471445b = j18;
        this.f471446c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc5.g)) {
            return false;
        }
        zc5.g gVar = (zc5.g) obj;
        return this.f471444a == gVar.f471444a && this.f471445b == gVar.f471445b && this.f471446c == gVar.f471446c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f471444a) * 31) + java.lang.Long.hashCode(this.f471445b)) * 31) + java.lang.Boolean.hashCode(this.f471446c);
    }

    public java.lang.String toString() {
        return "MediaSizes(compressedSize=" + this.f471444a + ", originSize=" + this.f471445b + ", hasExpired=" + this.f471446c + ')';
    }
}
