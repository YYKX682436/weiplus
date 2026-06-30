package l5;

/* loaded from: classes14.dex */
public final class g extends l5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f316520a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f316521b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f316522c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f316523d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f316524e;

    public g(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f316520a = atomicReferenceFieldUpdater;
        this.f316521b = atomicReferenceFieldUpdater2;
        this.f316522c = atomicReferenceFieldUpdater3;
        this.f316523d = atomicReferenceFieldUpdater4;
        this.f316524e = atomicReferenceFieldUpdater5;
    }

    @Override // l5.b
    public boolean a(l5.k kVar, l5.f fVar, l5.f fVar2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f316523d;
            if (atomicReferenceFieldUpdater.compareAndSet(kVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(kVar) == fVar);
        return false;
    }

    @Override // l5.b
    public boolean b(l5.k kVar, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f316524e;
            if (atomicReferenceFieldUpdater.compareAndSet(kVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(kVar) == obj);
        return false;
    }

    @Override // l5.b
    public boolean c(l5.k kVar, l5.j jVar, l5.j jVar2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f316522c;
            if (atomicReferenceFieldUpdater.compareAndSet(kVar, jVar, jVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(kVar) == jVar);
        return false;
    }

    @Override // l5.b
    public void d(l5.j jVar, l5.j jVar2) {
        this.f316521b.lazySet(jVar, jVar2);
    }

    @Override // l5.b
    public void e(l5.j jVar, java.lang.Thread thread) {
        this.f316520a.lazySet(jVar, thread);
    }
}
