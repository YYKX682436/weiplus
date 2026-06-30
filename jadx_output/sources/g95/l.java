package g95;

/* loaded from: classes9.dex */
public final class l implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f269809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f269810b;

    public l(long j17, int i17) {
        this.f269809a = j17;
        this.f269810b = i17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return it.l() == this.f269809a && it.k() == this.f269810b;
    }
}
