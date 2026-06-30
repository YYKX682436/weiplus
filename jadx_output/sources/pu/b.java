package pu;

/* loaded from: classes5.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final pu.k a() {
        ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
        kotlin.jvm.internal.o.d(gVar);
        if (!jm0.g.class.isAssignableFrom(pu.k.class)) {
            throw new java.lang.IllegalArgumentException(gVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gVar.getViewModel(), new jm0.e(gVar)).a(pu.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (pu.k) ((jm0.g) a17);
    }
}
