package fh0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static fh0.a f262531b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f262532c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f262533d;

    /* renamed from: a, reason: collision with root package name */
    public static final fh0.k f262530a = new fh0.k();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f262534e = new java.util.concurrent.ConcurrentHashMap();

    public final void a() {
        java.lang.String g07;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f262534e;
        if (concurrentHashMap.isEmpty()) {
            g07 = "";
        } else {
            java.util.Collection values = concurrentHashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            g07 = kz5.n0.g0(values, "\n", null, null, 0, null, fh0.c.f262523d, 30, null);
        }
        d75.b.g(new fh0.j(g07));
    }
}
