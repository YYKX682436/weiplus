package t95;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f416591a;

    /* renamed from: b, reason: collision with root package name */
    public final long f416592b;

    public g(long j17, long j18) {
        this.f416591a = j17;
        this.f416592b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95.g)) {
            return false;
        }
        t95.g gVar = (t95.g) obj;
        return this.f416591a == gVar.f416591a && this.f416592b == gVar.f416592b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f416591a) * 31) + java.lang.Long.hashCode(this.f416592b);
    }

    public java.lang.String toString() {
        return "Range(offset=" + this.f416591a + ", length=" + this.f416592b + ')';
    }
}
