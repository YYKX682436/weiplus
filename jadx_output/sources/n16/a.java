package n16;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f334154a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.g f334155b;

    static {
        n16.c.j(n16.i.f334178f);
    }

    public a(n16.c packageName, n16.g callableName) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(callableName, "callableName");
        this.f334154a = packageName;
        this.f334155b = callableName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n16.a)) {
            return false;
        }
        n16.a aVar = (n16.a) obj;
        return kotlin.jvm.internal.o.b(this.f334154a, aVar.f334154a) && kotlin.jvm.internal.o.b(null, null) && kotlin.jvm.internal.o.b(this.f334155b, aVar.f334155b) && kotlin.jvm.internal.o.b(null, null);
    }

    public int hashCode() {
        return (((((this.f334154a.hashCode() * 31) + 0) * 31) + this.f334155b.hashCode()) * 31) + 0;
    }

    public java.lang.String toString() {
        java.lang.String str = r26.i0.u(this.f334154a.b(), '.', '/', false, 4, null) + "/" + this.f334155b;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        return str;
    }
}
