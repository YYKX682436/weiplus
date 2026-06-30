package t06;

/* loaded from: classes15.dex */
public final class d implements x06.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f414534a;

    public d(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.o.g(classLoader, "classLoader");
        this.f414534a = classLoader;
    }

    public e16.g a(x06.v request) {
        kotlin.jvm.internal.o.g(request, "request");
        n16.b bVar = request.f451327a;
        n16.c h17 = bVar.h();
        kotlin.jvm.internal.o.f(h17, "getPackageFqName(...)");
        java.lang.String b17 = bVar.i().b();
        kotlin.jvm.internal.o.f(b17, "asString(...)");
        java.lang.String u17 = r26.i0.u(b17, '.', '$', false, 4, null);
        if (!h17.d()) {
            u17 = h17.b() + '.' + u17;
        }
        java.lang.Class a17 = t06.e.a(this.f414534a, u17);
        if (a17 != null) {
            return new u06.x(a17);
        }
        return null;
    }
}
