package kz5;

/* loaded from: classes14.dex */
public abstract class o1 {
    public static final java.util.Set a(java.util.Set builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        lz5.q qVar = (lz5.q) builder;
        lz5.m mVar = qVar.f322422d;
        mVar.c();
        mVar.f322417s = true;
        if (mVar.f322413o <= 0) {
            kotlin.jvm.internal.o.e(lz5.m.f322404t, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return qVar.f322422d.f322413o > 0 ? qVar : lz5.q.f322421e;
    }

    public static final java.util.Set b() {
        return new lz5.q();
    }

    public static final java.util.Set c(java.lang.Object obj) {
        java.util.Set singleton = java.util.Collections.singleton(obj);
        kotlin.jvm.internal.o.f(singleton, "singleton(...)");
        return singleton;
    }
}
