package mv;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f331484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331485b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331486c;

    public c0(int i17, int i18, java.lang.String tempPath) {
        kotlin.jvm.internal.o.g(tempPath, "tempPath");
        this.f331484a = i17;
        this.f331485b = i18;
        this.f331486c = tempPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv.c0)) {
            return false;
        }
        mv.c0 c0Var = (mv.c0) obj;
        return this.f331484a == c0Var.f331484a && this.f331485b == c0Var.f331485b && kotlin.jvm.internal.o.b(this.f331486c, c0Var.f331486c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f331484a) * 31) + java.lang.Integer.hashCode(this.f331485b)) * 31) + this.f331486c.hashCode();
    }

    public java.lang.String toString() {
        return "MediaLoadResultInfo(error=" + this.f331484a + ", deviceType=" + this.f331485b + ", tempPath=" + this.f331486c + ')';
    }
}
