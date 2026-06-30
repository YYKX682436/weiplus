package g80;

/* loaded from: classes5.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final g80.o a() {
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        kotlin.jvm.internal.o.d(wVar);
        if (!jm0.g.class.isAssignableFrom(g80.o.class)) {
            throw new java.lang.IllegalArgumentException(wVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(wVar.getViewModel(), new jm0.e(wVar)).a(g80.o.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (g80.o) ((jm0.g) a17);
    }
}
