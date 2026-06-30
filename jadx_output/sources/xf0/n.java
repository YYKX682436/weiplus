package xf0;

/* loaded from: classes12.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final xf0.s a() {
        xf0.u uVar = (xf0.u) i95.n0.c(xf0.u.class);
        kotlin.jvm.internal.o.d(uVar);
        if (!jm0.g.class.isAssignableFrom(xf0.s.class)) {
            throw new java.lang.IllegalArgumentException(uVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(uVar.getViewModel(), new jm0.e(uVar)).a(xf0.s.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (xf0.s) ((jm0.g) a17);
    }
}
