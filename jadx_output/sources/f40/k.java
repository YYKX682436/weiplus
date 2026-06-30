package f40;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f259434a;

    /* renamed from: b, reason: collision with root package name */
    public final long f259435b;

    /* renamed from: c, reason: collision with root package name */
    public final long f259436c;

    public k(int i17, long j17, long j18) {
        this.f259434a = i17;
        this.f259435b = j17;
        this.f259436c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f40.k)) {
            return false;
        }
        f40.k kVar = (f40.k) obj;
        return this.f259434a == kVar.f259434a && this.f259435b == kVar.f259435b && this.f259436c == kVar.f259436c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f259434a) * 31) + java.lang.Long.hashCode(this.f259435b)) * 31) + java.lang.Long.hashCode(this.f259436c);
    }

    public java.lang.String toString() {
        return "RecordFileState(status=" + this.f259434a + ", offset=" + this.f259435b + ", totalLen=" + this.f259436c + ')';
    }
}
