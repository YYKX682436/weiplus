package y06;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final y06.f f458671a = new y06.f();

    /* renamed from: b, reason: collision with root package name */
    public static final n16.g f458672b = n16.g.k(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);

    /* renamed from: c, reason: collision with root package name */
    public static final n16.g f458673c = n16.g.k("allowedTargets");

    /* renamed from: d, reason: collision with root package name */
    public static final n16.g f458674d = n16.g.k("value");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f458675e = kz5.c1.k(new jz5.l(l06.w.f314940u, x06.p0.f451286c), new jz5.l(l06.w.f314943x, x06.p0.f451287d), new jz5.l(l06.w.f314944y, x06.p0.f451289f));

    public final p06.c a(n16.c kotlinName, e16.d annotationOwner, a16.l c17) {
        e16.a a17;
        kotlin.jvm.internal.o.g(kotlinName, "kotlinName");
        kotlin.jvm.internal.o.g(annotationOwner, "annotationOwner");
        kotlin.jvm.internal.o.g(c17, "c");
        if (kotlin.jvm.internal.o.b(kotlinName, l06.w.f314933n)) {
            n16.c DEPRECATED_ANNOTATION = x06.p0.f451288e;
            kotlin.jvm.internal.o.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            e16.a a18 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (a18 != null || annotationOwner.b()) {
                return new y06.j(a18, c17);
            }
        }
        n16.c cVar = (n16.c) f458675e.get(kotlinName);
        if (cVar == null || (a17 = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return f458671a.b(a17, c17, false);
    }

    public final p06.c b(e16.a annotation, a16.l c17, boolean z17) {
        kotlin.jvm.internal.o.g(annotation, "annotation");
        kotlin.jvm.internal.o.g(c17, "c");
        n16.b a17 = u06.i.a(xz5.a.b(xz5.a.a(((u06.j) annotation).f423510a)));
        if (kotlin.jvm.internal.o.b(a17, n16.b.l(x06.p0.f451286c))) {
            return new y06.r(annotation, c17);
        }
        if (kotlin.jvm.internal.o.b(a17, n16.b.l(x06.p0.f451287d))) {
            return new y06.p(annotation, c17);
        }
        if (kotlin.jvm.internal.o.b(a17, n16.b.l(x06.p0.f451289f))) {
            return new y06.e(c17, annotation, l06.w.f314944y);
        }
        if (kotlin.jvm.internal.o.b(a17, n16.b.l(x06.p0.f451288e))) {
            return null;
        }
        return new b16.k(c17, annotation, z17);
    }
}
