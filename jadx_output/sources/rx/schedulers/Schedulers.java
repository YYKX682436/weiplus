package rx.schedulers;

/* loaded from: classes16.dex */
public final class Schedulers {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f400891d = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final p56.q f400892a;

    /* renamed from: b, reason: collision with root package name */
    public final p56.q f400893b;

    /* renamed from: c, reason: collision with root package name */
    public final p56.q f400894c;

    public Schedulers() {
        x56.r.f452140e.e().getClass();
        this.f400892a = new t56.m(new u56.n("RxComputationScheduler-"));
        this.f400893b = new t56.g(new u56.n("RxIoScheduler-"));
        this.f400894c = new t56.w(new u56.n("RxNewThreadScheduler-"));
    }

    public static rx.schedulers.Schedulers a() {
        boolean z17;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = f400891d;
            rx.schedulers.Schedulers schedulers = (rx.schedulers.Schedulers) atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            rx.schedulers.Schedulers schedulers2 = new rx.schedulers.Schedulers();
            while (true) {
                if (atomicReference.compareAndSet(null, schedulers2)) {
                    z17 = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                return schedulers2;
            }
            schedulers2.b();
        }
    }

    public static p56.q computation() {
        return a().f400892a;
    }

    public static p56.q from(java.util.concurrent.Executor executor) {
        return new t56.q(executor);
    }

    public static p56.q immediate() {
        return t56.v.f415941e;
    }

    public static p56.q io() {
        p56.q qVar = a().f400893b;
        r56.e eVar = x56.m.f452133f;
        return eVar != null ? (p56.q) eVar.call(qVar) : qVar;
    }

    public static p56.q newThread() {
        return a().f400894c;
    }

    public static void reset() {
        rx.schedulers.Schedulers schedulers = (rx.schedulers.Schedulers) f400891d.getAndSet(null);
        if (schedulers != null) {
            schedulers.b();
        }
    }

    public static void shutdown() {
        rx.schedulers.Schedulers a17 = a();
        a17.b();
        synchronized (a17) {
            t56.r.f415934g.shutdown();
            u56.l.f424834f.shutdown();
            u56.l.f424835g.shutdown();
        }
    }

    public static void start() {
        rx.schedulers.Schedulers a17 = a();
        synchronized (a17) {
            java.lang.Object obj = a17.f400892a;
            if (obj instanceof t56.d0) {
                ((t56.d0) obj).start();
            }
            java.lang.Object obj2 = a17.f400893b;
            if (obj2 instanceof t56.d0) {
                ((t56.d0) obj2).start();
            }
            java.lang.Object obj3 = a17.f400894c;
            if (obj3 instanceof t56.d0) {
                ((t56.d0) obj3).start();
            }
        }
        synchronized (a17) {
            t56.r.f415934g.start();
            u56.l.f424834f.start();
            u56.l.f424835g.start();
        }
    }

    public static rx.schedulers.TestScheduler test() {
        return new rx.schedulers.TestScheduler();
    }

    public static p56.q trampoline() {
        return t56.q0.f415931e;
    }

    public synchronized void b() {
        java.lang.Object obj = this.f400892a;
        if (obj instanceof t56.d0) {
            ((t56.d0) obj).shutdown();
        }
        java.lang.Object obj2 = this.f400893b;
        if (obj2 instanceof t56.d0) {
            ((t56.d0) obj2).shutdown();
        }
        java.lang.Object obj3 = this.f400894c;
        if (obj3 instanceof t56.d0) {
            ((t56.d0) obj3).shutdown();
        }
    }
}
