package nr2;

/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f339246a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f339247b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f339248c;

    /* renamed from: d, reason: collision with root package name */
    public final int f339249d;

    public k0(boolean z17, java.lang.String failReason, java.lang.String errMsg, int i17) {
        kotlin.jvm.internal.o.g(failReason, "failReason");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f339246a = z17;
        this.f339247b = failReason;
        this.f339248c = errMsg;
        this.f339249d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr2.k0)) {
            return false;
        }
        nr2.k0 k0Var = (nr2.k0) obj;
        return this.f339246a == k0Var.f339246a && kotlin.jvm.internal.o.b(this.f339247b, k0Var.f339247b) && kotlin.jvm.internal.o.b(this.f339248c, k0Var.f339248c) && this.f339249d == k0Var.f339249d;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f339246a) * 31) + this.f339247b.hashCode()) * 31) + this.f339248c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f339249d);
    }

    public java.lang.String toString() {
        return "PayResult(success=" + this.f339246a + ", failReason=" + this.f339247b + ", errMsg=" + this.f339248c + ", errorCode=" + this.f339249d + ')';
    }
}
