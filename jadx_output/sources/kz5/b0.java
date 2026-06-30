package kz5;

/* loaded from: classes16.dex */
public abstract class b0 {
    public static final java.util.List a(java.util.List builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        lz5.e eVar = (lz5.e) builder;
        eVar.k();
        eVar.f322397f = true;
        return eVar.f322396e > 0 ? eVar : lz5.e.f322394g;
    }

    public static final java.util.List b() {
        return new lz5.e(10);
    }

    public static final java.util.List c(java.lang.Object obj) {
        java.util.List singletonList = java.util.Collections.singletonList(obj);
        kotlin.jvm.internal.o.f(singletonList, "singletonList(...)");
        return singletonList;
    }
}
