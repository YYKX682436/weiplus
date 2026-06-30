package m06;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m06.m f322609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f322610b;

    public n(m06.m kind, int i17) {
        kotlin.jvm.internal.o.g(kind, "kind");
        this.f322609a = kind;
        this.f322610b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m06.n)) {
            return false;
        }
        m06.n nVar = (m06.n) obj;
        return kotlin.jvm.internal.o.b(this.f322609a, nVar.f322609a) && this.f322610b == nVar.f322610b;
    }

    public int hashCode() {
        return (this.f322609a.hashCode() * 31) + java.lang.Integer.hashCode(this.f322610b);
    }

    public java.lang.String toString() {
        return "KindWithArity(kind=" + this.f322609a + ", arity=" + this.f322610b + ')';
    }
}
