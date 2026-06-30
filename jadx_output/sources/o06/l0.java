package o06;

/* loaded from: classes15.dex */
public abstract class l0 {
    public static final o06.g a(o06.v0 v0Var, n16.b classId) {
        kotlin.jvm.internal.o.g(v0Var, "<this>");
        kotlin.jvm.internal.o.g(classId, "classId");
        o06.j b17 = b(v0Var, classId);
        if (b17 instanceof o06.g) {
            return (o06.g) b17;
        }
        return null;
    }

    public static final o06.j b(o06.v0 v0Var, n16.b classId) {
        kotlin.jvm.internal.o.g(v0Var, "<this>");
        kotlin.jvm.internal.o.g(classId, "classId");
        android.support.v4.media.f.a(v0Var.I(r16.c0.f368652a));
        n16.c h17 = classId.h();
        kotlin.jvm.internal.o.f(h17, "getPackageFqName(...)");
        o06.k1 Q = v0Var.Q(h17);
        java.util.List f17 = classId.i().f334160a.f();
        if (f17 == null) {
            n16.c.a(11);
            throw null;
        }
        y16.s sVar = ((r06.o0) Q).f368499m;
        java.lang.Object X = kz5.n0.X(f17);
        kotlin.jvm.internal.o.f(X, "first(...)");
        o06.j e17 = ((y16.a) sVar).e((n16.g) X, w06.d.f441952m);
        if (e17 == null) {
            return null;
        }
        for (n16.g gVar : f17.subList(1, f17.size())) {
            if (!(e17 instanceof o06.g)) {
                return null;
            }
            y16.s z17 = ((o06.g) e17).z();
            kotlin.jvm.internal.o.d(gVar);
            o06.j e18 = z17.e(gVar, w06.d.f441952m);
            e17 = e18 instanceof o06.g ? (o06.g) e18 : null;
            if (e17 == null) {
                return null;
            }
        }
        return e17;
    }

    public static final o06.g c(o06.v0 v0Var, n16.b classId, o06.c1 notFoundClasses) {
        kotlin.jvm.internal.o.g(v0Var, "<this>");
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(notFoundClasses, "notFoundClasses");
        o06.g a17 = a(v0Var, classId);
        return a17 != null ? a17 : notFoundClasses.a(classId, q26.h0.y(q26.h0.o(q26.y.d(classId, o06.j0.f341970d), o06.k0.f341971d)));
    }
}
