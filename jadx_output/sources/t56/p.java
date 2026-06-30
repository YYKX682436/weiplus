package t56;

/* loaded from: classes16.dex */
public final class p extends p56.p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Executor f415922d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f415924f = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f415925g = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final a66.c f415923e = new a66.c();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f415926h = t56.r.a();

    public p(java.util.concurrent.Executor executor) {
        this.f415922d = executor;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415923e.f1797e;
    }

    @Override // p56.s
    public void c() {
        this.f415923e.c();
        this.f415924f.clear();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        if (this.f415923e.f1797e) {
            return a66.g.f1801a;
        }
        t56.c0 c0Var = new t56.c0(aVar, this.f415923e);
        this.f415923e.a(c0Var);
        this.f415924f.offer(c0Var);
        if (this.f415925g.getAndIncrement() == 0) {
            try {
                this.f415922d.execute(this);
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                this.f415923e.e(c0Var);
                this.f415925g.decrementAndGet();
                x56.m.a(e17);
                throw e17;
            }
        }
        return c0Var;
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (j17 <= 0) {
            return d(aVar);
        }
        if (this.f415923e.f1797e) {
            return a66.g.f1801a;
        }
        a66.e eVar = new a66.e();
        a66.e eVar2 = new a66.e();
        eVar2.a(eVar);
        this.f415923e.a(eVar2);
        a66.b bVar = new a66.b(new t56.n(this, eVar2));
        t56.c0 c0Var = new t56.c0(new t56.o(this, eVar2, aVar, bVar));
        eVar.a(c0Var);
        try {
            c0Var.f415862d.a(new t56.z(c0Var, this.f415926h.schedule(c0Var, j17, timeUnit)));
            return bVar;
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            x56.m.a(e17);
            throw e17;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f415923e.f1797e) {
            t56.c0 c0Var = (t56.c0) this.f415924f.poll();
            if (c0Var == null) {
                return;
            }
            if (!c0Var.f415862d.f424839e) {
                if (this.f415923e.f1797e) {
                    this.f415924f.clear();
                    return;
                }
                c0Var.run();
            }
            if (this.f415925g.decrementAndGet() == 0) {
                return;
            }
        }
        this.f415924f.clear();
    }
}
