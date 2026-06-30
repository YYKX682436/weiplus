package of3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final of3.a f345101a;

    /* renamed from: b, reason: collision with root package name */
    public final of3.a f345102b;

    public f(of3.a factory, of3.a manager) {
        kotlin.jvm.internal.o.g(factory, "factory");
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f345101a = factory;
        this.f345102b = manager;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3.f)) {
            return false;
        }
        of3.f fVar = (of3.f) obj;
        return kotlin.jvm.internal.o.b(this.f345101a, fVar.f345101a) && kotlin.jvm.internal.o.b(this.f345102b, fVar.f345102b);
    }

    public int hashCode() {
        return (this.f345101a.hashCode() * 31) + this.f345102b.hashCode();
    }

    public java.lang.String toString() {
        return "VideoKitBuilder(factory=" + this.f345101a + ", manager=" + this.f345102b + ')';
    }
}
