package t56;

/* loaded from: classes16.dex */
public final class m extends p56.q implements t56.d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f415902g;

    /* renamed from: h, reason: collision with root package name */
    public static final t56.l f415903h;

    /* renamed from: i, reason: collision with root package name */
    public static final t56.k f415904i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f415905e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f415906f = new java.util.concurrent.atomic.AtomicReference(f415904i);

    static {
        int intValue = java.lang.Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f415902g = intValue;
        t56.l lVar = new t56.l(u56.n.f424836e);
        f415903h = lVar;
        lVar.c();
        f415904i = new t56.k(null, 0);
    }

    public m(java.util.concurrent.ThreadFactory threadFactory) {
        this.f415905e = threadFactory;
        start();
    }

    @Override // p56.q
    public p56.p createWorker() {
        t56.l lVar;
        t56.k kVar = (t56.k) this.f415906f.get();
        int i17 = kVar.f415894a;
        if (i17 == 0) {
            lVar = f415903h;
        } else {
            long j17 = kVar.f415896c;
            kVar.f415896c = 1 + j17;
            lVar = kVar.f415895b[(int) (j17 % i17)];
        }
        return new t56.j(lVar);
    }

    @Override // t56.d0
    public void shutdown() {
        t56.k kVar;
        int i17;
        boolean z17;
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f415906f;
            kVar = (t56.k) atomicReference.get();
            t56.k kVar2 = f415904i;
            if (kVar == kVar2) {
                return;
            }
            while (true) {
                if (!atomicReference.compareAndSet(kVar, kVar2)) {
                    if (atomicReference.get() != kVar) {
                        z17 = false;
                        break;
                    }
                } else {
                    z17 = true;
                    break;
                }
            }
        } while (!z17);
        for (t56.l lVar : kVar.f415895b) {
            lVar.c();
        }
    }

    @Override // t56.d0
    public void start() {
        int i17;
        boolean z17;
        t56.k kVar = new t56.k(this.f415905e, f415902g);
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f415906f;
            t56.k kVar2 = f415904i;
            if (!atomicReference.compareAndSet(kVar2, kVar)) {
                if (atomicReference.get() != kVar2) {
                    z17 = false;
                    break;
                }
            } else {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        for (t56.l lVar : kVar.f415895b) {
            lVar.c();
        }
    }
}
