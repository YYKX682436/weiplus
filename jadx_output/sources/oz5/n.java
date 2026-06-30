package oz5;

/* loaded from: classes14.dex */
public final class n implements kotlin.coroutines.Continuation, qz5.e {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f350330e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(oz5.n.class, java.lang.Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f350331d;
    private volatile java.lang.Object result;

    public n(kotlin.coroutines.Continuation delegate, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f350331d = delegate;
        this.result = obj;
    }

    public final java.lang.Object a() {
        boolean z17;
        java.lang.Object obj = this.result;
        pz5.a aVar = pz5.a.f359187e;
        if (obj == aVar) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f350330e;
            pz5.a aVar2 = pz5.a.f359186d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                return pz5.a.f359186d;
            }
            obj = this.result;
        }
        if (obj == pz5.a.f359188f) {
            return pz5.a.f359186d;
        }
        if (obj instanceof kotlin.Result.Failure) {
            throw ((kotlin.Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation continuation = this.f350331d;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return this.f350331d.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            pz5.a aVar = pz5.a.f359187e;
            boolean z17 = false;
            if (obj2 == aVar) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f350330e;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                pz5.a aVar2 = pz5.a.f359186d;
                if (obj2 != aVar2) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f350330e;
                pz5.a aVar3 = pz5.a.f359188f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                if (z17) {
                    this.f350331d.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public java.lang.String toString() {
        return "SafeContinuation for " + this.f350331d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(kotlin.coroutines.Continuation delegate) {
        this(delegate, pz5.a.f359187e);
        kotlin.jvm.internal.o.g(delegate, "delegate");
    }
}
