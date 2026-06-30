package xw0;

/* loaded from: classes5.dex */
public final class q implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f457636a;

    public q(yz5.l lVar) {
        this.f457636a = lVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        return ((java.lang.Boolean) this.f457636a.invoke(obj)).booleanValue();
    }
}
