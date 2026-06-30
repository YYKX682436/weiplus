package of3;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final of3.a f345095a;

    /* renamed from: b, reason: collision with root package name */
    public final of3.a f345096b;

    public c(of3.a loader, of3.a manager) {
        kotlin.jvm.internal.o.g(loader, "loader");
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f345095a = loader;
        this.f345096b = manager;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3.c)) {
            return false;
        }
        of3.c cVar = (of3.c) obj;
        return kotlin.jvm.internal.o.b(this.f345095a, cVar.f345095a) && kotlin.jvm.internal.o.b(this.f345096b, cVar.f345096b);
    }

    public int hashCode() {
        return (this.f345095a.hashCode() * 31) + this.f345096b.hashCode();
    }

    public java.lang.String toString() {
        return "ImageKitBuilder(loader=" + this.f345095a + ", manager=" + this.f345096b + ')';
    }
}
