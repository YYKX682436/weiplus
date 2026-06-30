package ut;

/* loaded from: classes9.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final ut.b a() {
        ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
        kotlin.jvm.internal.o.d(gVar);
        if (!jm0.g.class.isAssignableFrom(ut.b.class)) {
            throw new java.lang.IllegalArgumentException(gVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gVar.getViewModel(), new jm0.e(gVar)).a(ut.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (ut.b) ((jm0.g) a17);
    }
}
