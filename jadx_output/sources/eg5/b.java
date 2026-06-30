package eg5;

/* loaded from: classes9.dex */
public final class b implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f252838a;

    public b(long j17) {
        this.f252838a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return it.l() == this.f252838a;
    }
}
