package q16;

/* loaded from: classes15.dex */
public final class b implements q16.e {

    /* renamed from: a, reason: collision with root package name */
    public static final q16.b f359703a = new q16.b();

    @Override // q16.e
    public java.lang.String a(o06.j classifier, q16.s renderer) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        kotlin.jvm.internal.o.g(renderer, "renderer");
        if (classifier instanceof o06.e2) {
            n16.g name = ((o06.e2) classifier).getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            return renderer.u(name, false);
        }
        n16.e g17 = r16.i.g(classifier);
        kotlin.jvm.internal.o.f(g17, "getFqName(...)");
        return renderer.t(g17);
    }
}
