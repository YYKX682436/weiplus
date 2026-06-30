package p05;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f350477a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350478b;

    public d0(long j17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f350477a = j17;
        this.f350478b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.d0)) {
            return false;
        }
        p05.d0 d0Var = (p05.d0) obj;
        return this.f350477a == d0Var.f350477a && kotlin.jvm.internal.o.b(this.f350478b, d0Var.f350478b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f350477a) * 31) + this.f350478b.hashCode();
    }

    public java.lang.String toString() {
        return "RunningAnimationInfo(glPtr=" + this.f350477a + ", path=" + this.f350478b + ')';
    }
}
