package f40;

/* loaded from: classes5.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final f40.i a() {
        d40.q qVar = (d40.q) i95.n0.c(d40.q.class);
        kotlin.jvm.internal.o.d(qVar);
        if (!jm0.g.class.isAssignableFrom(f40.i.class)) {
            throw new java.lang.IllegalArgumentException(qVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(qVar.getViewModel(), new jm0.e(qVar)).a(f40.i.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (f40.i) ((jm0.g) a17);
    }
}
