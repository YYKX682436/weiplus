package go2;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f273960a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f273961b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f273962c;

    public d0(boolean z17, java.lang.String failReason, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(failReason, "failReason");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f273960a = z17;
        this.f273961b = failReason;
        this.f273962c = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go2.d0)) {
            return false;
        }
        go2.d0 d0Var = (go2.d0) obj;
        return this.f273960a == d0Var.f273960a && kotlin.jvm.internal.o.b(this.f273961b, d0Var.f273961b) && kotlin.jvm.internal.o.b(this.f273962c, d0Var.f273962c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f273960a) * 31) + this.f273961b.hashCode()) * 31) + this.f273962c.hashCode();
    }

    public java.lang.String toString() {
        return "PayResult(success=" + this.f273960a + ", failReason=" + this.f273961b + ", errMsg=" + this.f273962c + ')';
    }
}
