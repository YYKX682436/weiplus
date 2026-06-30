package pu;

/* loaded from: classes5.dex */
public final class t {
    public t(kotlin.jvm.internal.i iVar) {
    }

    public final pu.f0 a() {
        ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
        kotlin.jvm.internal.o.d(gVar);
        if (!jm0.g.class.isAssignableFrom(pu.f0.class)) {
            throw new java.lang.IllegalArgumentException(gVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gVar.getViewModel(), new jm0.e(gVar)).a(pu.f0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (pu.f0) ((jm0.g) a17);
    }
}
