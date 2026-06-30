package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class q extends kotlinx.coroutines.internal.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.internal.t f310516a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.internal.t f310517b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.internal.o f310518c;

    public q(kotlinx.coroutines.internal.t tVar, kotlinx.coroutines.internal.t tVar2, kotlinx.coroutines.internal.o oVar) {
        this.f310516a = tVar;
        this.f310517b = tVar2;
        this.f310518c = oVar;
    }

    @Override // kotlinx.coroutines.internal.e0
    public kotlinx.coroutines.internal.d a() {
        kotlinx.coroutines.internal.d dVar = this.f310518c.f310483a;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("atomicOp");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.coroutines.internal.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.internal.f0] */
    @Override // kotlinx.coroutines.internal.e0
    public java.lang.Object c(java.lang.Object obj) {
        boolean z17;
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }
        kotlinx.coroutines.internal.t tVar = (kotlinx.coroutines.internal.t) obj;
        kotlinx.coroutines.internal.o oVar = this.f310518c;
        java.lang.Object f17 = oVar.f(this);
        java.lang.Object obj2 = kotlinx.coroutines.internal.u.f310528a;
        ?? r47 = this.f310517b;
        if (f17 != obj2) {
            java.lang.Object e17 = f17 != null ? a().e(f17) : a().f();
            kotlinx.coroutines.internal.d dVar = r47;
            if (e17 == kotlinx.coroutines.internal.c.f310485a) {
                dVar = a();
            } else if (e17 == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.t.f310525d;
                dVar = r47.s();
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.t.f310525d;
            while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, this, dVar) && atomicReferenceFieldUpdater2.get(tVar) == this) {
            }
            return null;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = kotlinx.coroutines.internal.t.f310525d;
        kotlinx.coroutines.internal.f0 s17 = r47.s();
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = kotlinx.coroutines.internal.t.f310525d;
        while (true) {
            if (atomicReferenceFieldUpdater4.compareAndSet(tVar, this, s17)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater4.get(tVar) != this) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            oVar.g(tVar);
            r47.j(null);
        }
        return obj2;
    }

    public final void d() {
        this.f310518c.c(this);
    }

    @Override // kotlinx.coroutines.internal.e0
    public java.lang.String toString() {
        return "PrepareOp(op=" + a() + ')';
    }
}
