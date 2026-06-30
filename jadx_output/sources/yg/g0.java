package yg;

/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f462061a;

    /* renamed from: b, reason: collision with root package name */
    public final long f462062b;

    /* renamed from: c, reason: collision with root package name */
    public final long f462063c;

    public g0(long j17, long j18, long j19) {
        this.f462061a = j17;
        this.f462062b = j18;
        this.f462063c = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg.g0)) {
            return false;
        }
        yg.g0 g0Var = (yg.g0) obj;
        return this.f462061a == g0Var.f462061a && this.f462062b == g0Var.f462062b && this.f462063c == g0Var.f462063c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f462061a) * 31) + java.lang.Long.hashCode(this.f462062b)) * 31) + java.lang.Long.hashCode(this.f462063c);
    }

    public java.lang.String toString() {
        return "V8RawPointer(isolatePtr=" + this.f462061a + ", contextPtr=" + this.f462062b + ", uvLoopPtr=" + this.f462063c + ')';
    }
}
