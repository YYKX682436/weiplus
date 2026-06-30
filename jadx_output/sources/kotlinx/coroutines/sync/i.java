package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class i extends kotlinx.coroutines.internal.d {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.sync.h f310653b;

    public i(kotlinx.coroutines.sync.h hVar) {
        this.f310653b = hVar;
    }

    @Override // kotlinx.coroutines.internal.d
    public void d(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) obj;
        java.lang.Object obj3 = obj2 == null ? kotlinx.coroutines.sync.l.f310661e : this.f310653b;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.sync.k.f310656a;
        while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3) && atomicReferenceFieldUpdater.get(kVar) == this) {
        }
    }

    @Override // kotlinx.coroutines.internal.d
    public java.lang.Object i(java.lang.Object obj) {
        kotlinx.coroutines.sync.h hVar = this.f310653b;
        if (hVar.l() == hVar) {
            return null;
        }
        return kotlinx.coroutines.sync.l.f310657a;
    }
}
