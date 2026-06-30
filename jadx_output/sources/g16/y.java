package g16;

/* loaded from: classes15.dex */
public final class y implements b26.j {

    /* renamed from: a, reason: collision with root package name */
    public final g16.k0 f267675a;

    /* renamed from: b, reason: collision with root package name */
    public final g16.x f267676b;

    public y(g16.k0 kotlinClassFinder, g16.x deserializedDescriptorResolver) {
        kotlin.jvm.internal.o.g(kotlinClassFinder, "kotlinClassFinder");
        kotlin.jvm.internal.o.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f267675a = kotlinClassFinder;
        this.f267676b = deserializedDescriptorResolver;
    }

    @Override // b26.j
    public b26.i a(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        g16.x xVar = this.f267676b;
        kotlin.jvm.internal.o.g(xVar.c().f17485c, "<this>");
        g16.q0 a17 = g16.l0.a(this.f267675a, classId, m16.g.f322892g);
        if (a17 == null) {
            return null;
        }
        kotlin.jvm.internal.o.b(((t06.g) a17).a(), classId);
        return xVar.g(a17);
    }
}
