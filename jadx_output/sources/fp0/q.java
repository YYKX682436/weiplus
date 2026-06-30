package fp0;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f265275a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f265276b;

    public q(java.lang.Object obj, java.util.Queue second) {
        kotlin.jvm.internal.o.g(second, "second");
        this.f265275a = obj;
        this.f265276b = second;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0.q)) {
            return false;
        }
        fp0.q qVar = (fp0.q) obj;
        return kotlin.jvm.internal.o.b(this.f265275a, qVar.f265275a) && kotlin.jvm.internal.o.b(this.f265276b, qVar.f265276b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f265275a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f265276b.hashCode();
    }

    public java.lang.String toString() {
        return "LoaderPair(first=" + this.f265275a + ", second=" + this.f265276b + ')';
    }
}
