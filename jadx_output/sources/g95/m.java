package g95;

/* loaded from: classes9.dex */
public final class m implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269811a;

    public m(int i17) {
        this.f269811a = i17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return it.k() == this.f269811a;
    }
}
