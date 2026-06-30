package hm;

/* loaded from: classes12.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final hm.f a() {
        i95.m c17 = i95.n0.c(jm.y.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.kernel.mvvm.MvvmFeatureService");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(hm.f.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(hm.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hm.f) ((jm0.g) a17);
    }
}
