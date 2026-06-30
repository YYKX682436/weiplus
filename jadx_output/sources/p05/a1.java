package p05;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f350436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350437b;

    public a1(long j17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f350436a = j17;
        this.f350437b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.a1)) {
            return false;
        }
        p05.a1 a1Var = (p05.a1) obj;
        return this.f350436a == a1Var.f350436a && kotlin.jvm.internal.o.b(this.f350437b, a1Var.f350437b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f350436a) * 31) + this.f350437b.hashCode();
    }

    public java.lang.String toString() {
        return "RunningAnimationInfo(glPtr=" + this.f350436a + ", path=" + this.f350437b + ')';
    }
}
