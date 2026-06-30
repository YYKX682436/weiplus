package t56;

/* loaded from: classes16.dex */
public final class g extends p56.q implements t56.d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.TimeUnit f415874g = java.util.concurrent.TimeUnit.SECONDS;

    /* renamed from: h, reason: collision with root package name */
    public static final t56.f f415875h;

    /* renamed from: i, reason: collision with root package name */
    public static final t56.c f415876i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f415877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f415878f = new java.util.concurrent.atomic.AtomicReference(f415876i);

    static {
        t56.f fVar = new t56.f(u56.n.f424836e);
        f415875h = fVar;
        fVar.c();
        t56.c cVar = new t56.c(null, 0L, null);
        f415876i = cVar;
        cVar.a();
    }

    public g(java.util.concurrent.ThreadFactory threadFactory) {
        this.f415877e = threadFactory;
        start();
    }

    @Override // p56.q
    public p56.p createWorker() {
        return new t56.e((t56.c) this.f415878f.get());
    }

    @Override // t56.d0
    public void shutdown() {
        t56.c cVar;
        boolean z17;
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f415878f;
            cVar = (t56.c) atomicReference.get();
            t56.c cVar2 = f415876i;
            if (cVar == cVar2) {
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(cVar, cVar2)) {
                    z17 = true;
                    break;
                } else if (atomicReference.get() != cVar) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        cVar.a();
    }

    @Override // t56.d0
    public void start() {
        boolean z17;
        t56.c cVar = new t56.c(this.f415877e, 60L, f415874g);
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f415878f;
            t56.c cVar2 = f415876i;
            if (atomicReference.compareAndSet(cVar2, cVar)) {
                z17 = true;
                break;
            } else if (atomicReference.get() != cVar2) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            return;
        }
        cVar.a();
    }
}
