package wd0;

/* loaded from: classes14.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final du5.c f444697a;

    /* renamed from: b, reason: collision with root package name */
    public final du5.d f444698b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f444699c;

    public b2(du5.c canceller, du5.d stateCallback, java.lang.String ticket) {
        kotlin.jvm.internal.o.g(canceller, "canceller");
        kotlin.jvm.internal.o.g(stateCallback, "stateCallback");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        this.f444697a = canceller;
        this.f444698b = stateCallback;
        this.f444699c = ticket;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.b2)) {
            return false;
        }
        wd0.b2 b2Var = (wd0.b2) obj;
        return kotlin.jvm.internal.o.b(this.f444697a, b2Var.f444697a) && kotlin.jvm.internal.o.b(this.f444698b, b2Var.f444698b) && kotlin.jvm.internal.o.b(this.f444699c, b2Var.f444699c);
    }

    public int hashCode() {
        return (((this.f444697a.hashCode() * 31) + this.f444698b.hashCode()) * 31) + this.f444699c.hashCode();
    }

    public java.lang.String toString() {
        return "LaunchFingerprintParam(canceller=" + this.f444697a + ", stateCallback=" + this.f444698b + ", ticket=" + this.f444699c + ')';
    }
}
