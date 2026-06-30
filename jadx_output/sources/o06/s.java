package o06;

/* loaded from: classes15.dex */
public abstract class s {
    public static final o06.j a(o06.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<this>");
        o06.m e17 = mVar.e();
        if (e17 == null || (mVar instanceof o06.d1)) {
            return null;
        }
        if (!(e17.e() instanceof o06.d1)) {
            return a(e17);
        }
        if (e17 instanceof o06.j) {
            return (o06.j) e17;
        }
        return null;
    }

    public static final o06.g b(o06.v0 v0Var, n16.c fqName, w06.a lookupLocation) {
        o06.j jVar;
        y16.s z17;
        kotlin.jvm.internal.o.g(v0Var, "<this>");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        n16.c e17 = fqName.e();
        kotlin.jvm.internal.o.f(e17, "parent(...)");
        y16.s sVar = ((r06.o0) v0Var.Q(e17)).f368499m;
        n16.g f17 = fqName.f();
        kotlin.jvm.internal.o.f(f17, "shortName(...)");
        o06.j e18 = ((y16.a) sVar).e(f17, lookupLocation);
        o06.g gVar = e18 instanceof o06.g ? (o06.g) e18 : null;
        if (gVar != null) {
            return gVar;
        }
        n16.c e19 = fqName.e();
        kotlin.jvm.internal.o.f(e19, "parent(...)");
        o06.g b17 = b(v0Var, e19, lookupLocation);
        if (b17 == null || (z17 = b17.z()) == null) {
            jVar = null;
        } else {
            n16.g f18 = fqName.f();
            kotlin.jvm.internal.o.f(f18, "shortName(...)");
            jVar = z17.e(f18, lookupLocation);
        }
        if (jVar instanceof o06.g) {
            return (o06.g) jVar;
        }
        return null;
    }
}
