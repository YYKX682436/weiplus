package g16;

/* loaded from: classes15.dex */
public final class t extends g16.g {

    /* renamed from: d, reason: collision with root package name */
    public final o06.v0 f267662d;

    /* renamed from: e, reason: collision with root package name */
    public final o06.c1 f267663e;

    /* renamed from: f, reason: collision with root package name */
    public final b26.g f267664f;

    /* renamed from: g, reason: collision with root package name */
    public m16.g f267665g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o06.v0 module, o06.c1 notFoundClasses, e26.c0 storageManager, g16.k0 kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(kotlinClassFinder, "kotlinClassFinder");
        this.f267662d = module;
        this.f267663e = notFoundClasses;
        this.f267664f = new b26.g(module, notFoundClasses);
        this.f267665g = m16.g.f322892g;
    }

    public static final t16.g u(g16.t tVar, n16.g gVar, java.lang.Object obj) {
        t16.g b17 = t16.i.f414615a.b(obj, tVar.f267662d);
        if (b17 != null) {
            return b17;
        }
        java.lang.String message = "Unsupported annotation argument: " + gVar;
        kotlin.jvm.internal.o.g(message, "message");
        return new t16.l(message);
    }

    @Override // g16.l
    public g16.m0 q(n16.b annotationClassId, o06.x1 source, java.util.List result) {
        kotlin.jvm.internal.o.g(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(result, "result");
        return new g16.s(this, o06.l0.c(this.f267662d, annotationClassId, this.f267663e), annotationClassId, result, source);
    }
}
