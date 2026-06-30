package q16;

/* loaded from: classes15.dex */
public final class c implements q16.e {

    /* renamed from: a, reason: collision with root package name */
    public static final q16.c f359722a = new q16.c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o06.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o06.x0, o06.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o06.m] */
    @Override // q16.e
    public java.lang.String a(o06.j classifier, q16.s renderer) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        kotlin.jvm.internal.o.g(renderer, "renderer");
        if (classifier instanceof o06.e2) {
            n16.g name = ((o06.e2) classifier).getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            return renderer.u(name, false);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            arrayList.add(classifier.getName());
            classifier = classifier.e();
        } while (classifier instanceof o06.g);
        return q16.p0.b(new kz5.j1(arrayList));
    }
}
