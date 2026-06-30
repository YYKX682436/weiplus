package t06;

/* loaded from: classes15.dex */
public final class g implements g16.q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t06.f f414535c = new t06.f(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f414536a;

    /* renamed from: b, reason: collision with root package name */
    public final h16.c f414537b;

    public g(java.lang.Class cls, h16.c cVar, kotlin.jvm.internal.i iVar) {
        this.f414536a = cls;
        this.f414537b = cVar;
    }

    public n16.b a() {
        return u06.i.a(this.f414536a);
    }

    public java.lang.String b() {
        return r26.i0.u(this.f414536a.getName(), '.', '/', false, 4, null).concat(".class");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof t06.g) {
            if (kotlin.jvm.internal.o.b(this.f414536a, ((t06.g) obj).f414536a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f414536a.hashCode();
    }

    public java.lang.String toString() {
        return t06.g.class.getName() + ": " + this.f414536a;
    }
}
