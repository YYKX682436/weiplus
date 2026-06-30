package u56;

/* loaded from: classes16.dex */
public abstract class g implements t56.d0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Queue f424825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f424826e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f424827f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final long f424828g = 67;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f424829h = new java.util.concurrent.atomic.AtomicReference();

    public g() {
        if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
            this.f424825d = new rx.internal.util.unsafe.MpmcArrayQueue(java.lang.Math.max(0, 1024));
        } else {
            this.f424825d = new java.util.concurrent.ConcurrentLinkedQueue();
        }
        start();
    }

    public abstract java.lang.Object a();

    @Override // t56.d0
    public void shutdown() {
        java.util.concurrent.Future future = (java.util.concurrent.Future) this.f424829h.getAndSet(null);
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // t56.d0
    public void start() {
        boolean z17;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f424829h;
            if (atomicReference.get() != null) {
                return;
            }
            java.util.concurrent.ScheduledExecutorService a17 = t56.r.a();
            try {
                u56.f fVar = new u56.f(this);
                long j17 = this.f424828g;
                java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate = a17.scheduleAtFixedRate(fVar, j17, j17, java.util.concurrent.TimeUnit.SECONDS);
                while (true) {
                    if (atomicReference.compareAndSet(null, scheduleAtFixedRate)) {
                        z17 = true;
                        break;
                    } else if (atomicReference.get() != null) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                } else {
                    scheduleAtFixedRate.cancel(false);
                }
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                x56.m.a(e17);
                return;
            }
        }
    }
}
