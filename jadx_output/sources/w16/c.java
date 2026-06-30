package w16;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a16.k f442251a;

    public c(a16.k packageFragmentProvider, y06.n javaResolverCache) {
        kotlin.jvm.internal.o.g(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.o.g(javaResolverCache, "javaResolverCache");
        this.f442251a = packageFragmentProvider;
    }

    public final o06.g a(e16.g javaClass) {
        kotlin.jvm.internal.o.g(javaClass, "javaClass");
        u06.x xVar = (u06.x) javaClass;
        n16.c d17 = xVar.d();
        e16.z[] zVarArr = e16.z.f246452d;
        java.lang.Class<?> declaringClass = xVar.f423533a.getDeclaringClass();
        u06.x xVar2 = declaringClass != null ? new u06.x(declaringClass) : null;
        if (xVar2 != null) {
            o06.g a17 = a(xVar2);
            y16.s z17 = a17 != null ? a17.z() : null;
            o06.j e17 = z17 != null ? z17.e(xVar.f(), w06.d.f441953n) : null;
            if (e17 instanceof o06.g) {
                return (o06.g) e17;
            }
            return null;
        }
        n16.c e18 = d17.e();
        kotlin.jvm.internal.o.f(e18, "parent(...)");
        b16.i0 i0Var = (b16.i0) kz5.n0.Z(this.f442251a.b(e18));
        if (i0Var == null) {
            return null;
        }
        b16.q0 q0Var = i0Var.f17189p.f17177d;
        q0Var.getClass();
        return q0Var.v(xVar.f(), javaClass);
    }
}
