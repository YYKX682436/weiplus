package xs;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f456246a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f456247b;

    public e1(java.lang.String midReadOnlyPath, boolean z17) {
        kotlin.jvm.internal.o.g(midReadOnlyPath, "midReadOnlyPath");
        this.f456246a = midReadOnlyPath;
        this.f456247b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs.e1)) {
            return false;
        }
        xs.e1 e1Var = (xs.e1) obj;
        return kotlin.jvm.internal.o.b(this.f456246a, e1Var.f456246a) && this.f456247b == e1Var.f456247b;
    }

    public int hashCode() {
        return (this.f456246a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f456247b);
    }

    public java.lang.String toString() {
        return "MediaGroupImgAttachResult(midReadOnlyPath=" + this.f456246a + ", isMidShown=" + this.f456247b + ')';
    }
}
