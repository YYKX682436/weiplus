package pu;

/* loaded from: classes5.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final pu.t0 a() {
        ig0.o oVar = (ig0.o) i95.n0.c(ig0.o.class);
        kotlin.jvm.internal.o.d(oVar);
        if (!jm0.g.class.isAssignableFrom(pu.t0.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(pu.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (pu.t0) ((jm0.g) a17);
    }
}
