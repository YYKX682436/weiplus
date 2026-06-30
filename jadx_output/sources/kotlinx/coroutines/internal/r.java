package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public class r extends kotlinx.coroutines.internal.o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310520c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.r.class, java.lang.Object.class, "_affectedNode");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310521d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.r.class, java.lang.Object.class, "_originalNext");
    private volatile /* synthetic */ java.lang.Object _affectedNode = null;
    private volatile /* synthetic */ java.lang.Object _originalNext = null;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.internal.t f310522b;

    public r(kotlinx.coroutines.internal.t tVar) {
        this.f310522b = tVar;
    }

    @Override // kotlinx.coroutines.internal.o
    public java.lang.Object b(kotlinx.coroutines.internal.t tVar) {
        if (tVar == this.f310522b) {
            return kotlinx.coroutines.internal.n.f310510b;
        }
        return null;
    }

    @Override // kotlinx.coroutines.internal.o
    public void c(kotlinx.coroutines.internal.q qVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        kotlinx.coroutines.internal.t tVar = qVar.f310516a;
        do {
            atomicReferenceFieldUpdater = f310520c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        do {
            atomicReferenceFieldUpdater2 = f310521d;
            if (atomicReferenceFieldUpdater2.compareAndSet(this, null, qVar.f310517b)) {
                return;
            }
        } while (atomicReferenceFieldUpdater2.get(this) == null);
    }

    @Override // kotlinx.coroutines.internal.o
    public final kotlinx.coroutines.internal.t d() {
        return (kotlinx.coroutines.internal.t) this._affectedNode;
    }

    @Override // kotlinx.coroutines.internal.o
    public final kotlinx.coroutines.internal.t e() {
        return (kotlinx.coroutines.internal.t) this._originalNext;
    }

    public final java.lang.Object h() {
        kotlinx.coroutines.internal.t tVar = (kotlinx.coroutines.internal.t) this._affectedNode;
        kotlin.jvm.internal.o.d(tVar);
        return tVar;
    }
}
