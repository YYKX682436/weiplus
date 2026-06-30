package fm3;

/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f264082a;

    /* renamed from: b, reason: collision with root package name */
    public final long f264083b;

    /* renamed from: c, reason: collision with root package name */
    public final long f264084c;

    public k0(long j17, long j18, long j19) {
        this.f264082a = j17;
        this.f264083b = j18;
        this.f264084c = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.k0)) {
            return false;
        }
        fm3.k0 k0Var = (fm3.k0) obj;
        return this.f264082a == k0Var.f264082a && this.f264083b == k0Var.f264083b && this.f264084c == k0Var.f264084c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f264082a) * 31) + java.lang.Long.hashCode(this.f264083b)) * 31) + java.lang.Long.hashCode(this.f264084c);
    }

    public java.lang.String toString() {
        return "OnlineUserObj(pcu=" + this.f264082a + ", fcu=" + this.f264083b + ", mcu=" + this.f264084c + ')';
    }
}
