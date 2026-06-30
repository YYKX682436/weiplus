package kotlinx.coroutines.selects;

/* loaded from: classes14.dex */
public final class c extends kotlinx.coroutines.internal.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.internal.q f310631a;

    public c(kotlinx.coroutines.internal.q qVar) {
        this.f310631a = qVar;
    }

    @Override // kotlinx.coroutines.internal.e0
    public kotlinx.coroutines.internal.d a() {
        return this.f310631a.a();
    }

    @Override // kotlinx.coroutines.internal.e0
    public java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
        kotlinx.coroutines.selects.f fVar = (kotlinx.coroutines.selects.f) obj;
        kotlinx.coroutines.internal.q qVar = this.f310631a;
        qVar.d();
        java.lang.Object e17 = qVar.a().e(null);
        java.lang.Object obj2 = e17 == null ? qVar.f310518c : kotlinx.coroutines.selects.i.f310638a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.selects.f.f310635h;
        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, this, obj2) && atomicReferenceFieldUpdater.get(fVar) == this) {
        }
        return e17;
    }
}
