package ls1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f320983a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f320984b;

    public f(java.lang.String path, boolean z17) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f320983a = path;
        this.f320984b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls1.f)) {
            return false;
        }
        ls1.f fVar = (ls1.f) obj;
        return kotlin.jvm.internal.o.b(this.f320983a, fVar.f320983a) && this.f320984b == fVar.f320984b;
    }

    public int hashCode() {
        return (this.f320983a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f320984b);
    }

    public java.lang.String toString() {
        return "InterceptInfo(path=" + this.f320983a + ", isZip=" + this.f320984b + ')';
    }
}
