package eq1;

/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f255846a;

    /* renamed from: b, reason: collision with root package name */
    public final long f255847b;

    /* renamed from: c, reason: collision with root package name */
    public final long f255848c;

    public o0(long j17, long j18, long j19) {
        this.f255846a = j17;
        this.f255847b = j18;
        this.f255848c = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq1.o0)) {
            return false;
        }
        eq1.o0 o0Var = (eq1.o0) obj;
        return this.f255846a == o0Var.f255846a && this.f255847b == o0Var.f255847b && this.f255848c == o0Var.f255848c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f255846a) * 31) + java.lang.Long.hashCode(this.f255847b)) * 31) + java.lang.Long.hashCode(this.f255848c);
    }

    public java.lang.String toString() {
        return "TripletInfo(mid=" + this.f255846a + ", idx=" + this.f255847b + ", bizUin=" + this.f255848c + ')';
    }
}
