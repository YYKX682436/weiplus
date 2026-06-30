package fg0;

/* loaded from: classes5.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final fg0.g a() {
        ig0.o oVar = (ig0.o) i95.n0.c(ig0.o.class);
        kotlin.jvm.internal.o.d(oVar);
        if (!jm0.g.class.isAssignableFrom(fg0.g.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(fg0.g.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (fg0.g) ((jm0.g) a17);
    }
}
