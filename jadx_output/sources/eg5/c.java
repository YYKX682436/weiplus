package eg5;

/* loaded from: classes9.dex */
public final class c implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f252839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg5.d f252840b;

    public c(long j17, eg5.d dVar) {
        this.f252839a = j17;
        this.f252840b = dVar;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.l() == this.f252839a;
        if (z17) {
            this.f252840b.f252845e.remove(it);
        }
        return z17;
    }
}
