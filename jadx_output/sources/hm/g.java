package hm;

/* loaded from: classes12.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final hm.j a() {
        jm.y yVar = (jm.y) i95.n0.c(jm.y.class);
        kotlin.jvm.internal.o.d(yVar);
        if (!jm0.g.class.isAssignableFrom(hm.j.class)) {
            throw new java.lang.IllegalArgumentException(yVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(yVar.getViewModel(), new jm0.e(yVar)).a(hm.j.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hm.j) ((jm0.g) a17);
    }
}
