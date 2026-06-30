package jm0;

/* loaded from: classes5.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final jm0.g a(jm0.o service, java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        if (!jm0.g.class.isAssignableFrom(modelClass)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (jm0.g) a17;
    }
}
