package e31;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final e31.n f247087a = new e31.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f247088b = new java.util.LinkedHashMap();

    public final e31.k a(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object obj = ((java.util.LinkedHashMap) f247088b).get(name);
        h0Var.f310123d = obj;
        if (obj == null) {
            fs.g.c(e31.e.class, name, new e31.m(h0Var));
        }
        return (e31.k) h0Var.f310123d;
    }
}
