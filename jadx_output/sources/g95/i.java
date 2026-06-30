package g95;

/* loaded from: classes9.dex */
public final class i implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public static final g95.i f269806a = new g95.i();

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return it.j() == 0 || it.j() == 1 || g95.u.a(g95.u.f269821a, it);
    }
}
