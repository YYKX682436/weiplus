package t06;

/* loaded from: classes15.dex */
public final class h implements g16.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f414538a;

    /* renamed from: b, reason: collision with root package name */
    public final c26.f f414539b;

    public h(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.o.g(classLoader, "classLoader");
        this.f414538a = classLoader;
        this.f414539b = new c26.f();
    }

    public g16.j0 a(n16.b classId, m16.g jvmMetadataVersion) {
        t06.g a17;
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(jvmMetadataVersion, "jvmMetadataVersion");
        java.lang.String u17 = r26.i0.u(classId.i().b(), '.', '$', false, 4, null);
        if (!classId.h().d()) {
            u17 = classId.h() + '.' + u17;
        }
        java.lang.Class a18 = t06.e.a(this.f414538a, u17);
        if (a18 == null || (a17 = t06.g.f414535c.a(a18)) == null) {
            return null;
        }
        return new g16.i0(a17, null, 2, null);
    }
}
