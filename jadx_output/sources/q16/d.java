package q16;

/* loaded from: classes15.dex */
public final class d implements q16.e {

    /* renamed from: a, reason: collision with root package name */
    public static final q16.d f359723a = new q16.d();

    @Override // q16.e
    public java.lang.String a(o06.j classifier, q16.s renderer) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        kotlin.jvm.internal.o.g(renderer, "renderer");
        return b(classifier);
    }

    public final java.lang.String b(o06.j jVar) {
        java.lang.String str;
        n16.g name = jVar.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.lang.String a17 = q16.p0.a(name);
        if (jVar instanceof o06.e2) {
            return a17;
        }
        o06.m e17 = jVar.e();
        kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
        if (e17 instanceof o06.g) {
            str = b((o06.j) e17);
        } else if (e17 instanceof o06.d1) {
            n16.e i17 = ((r06.z0) ((o06.d1) e17)).f368566h.i();
            kotlin.jvm.internal.o.f(i17, "toUnsafe(...)");
            java.util.List f17 = i17.f();
            kotlin.jvm.internal.o.f(f17, "pathSegments(...)");
            str = q16.p0.b(f17);
        } else {
            str = null;
        }
        if (str == null || kotlin.jvm.internal.o.b(str, "")) {
            return a17;
        }
        return str + '.' + a17;
    }
}
