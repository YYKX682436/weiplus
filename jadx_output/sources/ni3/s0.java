package ni3;

/* loaded from: classes9.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f337731a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f337732b;

    /* renamed from: c, reason: collision with root package name */
    public int f337733c;

    /* renamed from: d, reason: collision with root package name */
    public final ni3.t0 f337734d;

    public s0(boolean z17, boolean z18, int i17, ni3.t0 loadParams) {
        kotlin.jvm.internal.o.g(loadParams, "loadParams");
        this.f337731a = z17;
        this.f337732b = z18;
        this.f337733c = i17;
        this.f337734d = loadParams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.s0)) {
            return false;
        }
        ni3.s0 s0Var = (ni3.s0) obj;
        return this.f337731a == s0Var.f337731a && this.f337732b == s0Var.f337732b && this.f337733c == s0Var.f337733c && kotlin.jvm.internal.o.b(this.f337734d, s0Var.f337734d);
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f337731a) * 31) + java.lang.Boolean.hashCode(this.f337732b)) * 31) + java.lang.Integer.hashCode(this.f337733c)) * 31) + this.f337734d.hashCode();
    }

    public java.lang.String toString() {
        return "LoadLife(hitPreloadStart=" + this.f337731a + ", hitPreloadComplete=" + this.f337732b + ", loadFailReason=" + this.f337733c + ", loadParams=" + this.f337734d + ')';
    }
}
