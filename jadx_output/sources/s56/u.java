package s56;

/* loaded from: classes16.dex */
public final class u extends p56.r implements r56.a {

    /* renamed from: h, reason: collision with root package name */
    public final p56.r f403241h;

    /* renamed from: i, reason: collision with root package name */
    public final p56.p f403242i;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f403244n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Queue f403245o;

    /* renamed from: p, reason: collision with root package name */
    public final int f403246p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f403247q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Throwable f403250t;

    /* renamed from: u, reason: collision with root package name */
    public long f403251u;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f403248r = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f403249s = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: m, reason: collision with root package name */
    public final s56.j f403243m = s56.j.f403215a;

    public u(p56.q qVar, p56.r rVar, boolean z17, int i17) {
        this.f403241h = rVar;
        this.f403242i = qVar.createWorker();
        this.f403244n = z17;
        i17 = i17 <= 0 ? u56.l.f424833e : i17;
        this.f403246p = i17 - (i17 >> 2);
        if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
            this.f403245o = new rx.internal.util.unsafe.SpscArrayQueue(i17);
        } else {
            this.f403245o = new v56.c(i17);
        }
        f(i17);
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        if (this.f352103d.f424839e || this.f403247q) {
            return;
        }
        java.util.Queue queue = this.f403245o;
        this.f403243m.getClass();
        if (obj == null) {
            obj = s56.j.f403217c;
        }
        if (queue.offer(obj)) {
            i();
        } else {
            onError(new q56.g());
        }
    }

    @Override // r56.a
    public void call() {
        long j17;
        long j18;
        long j19 = this.f403251u;
        java.util.Queue queue = this.f403245o;
        p56.r rVar = this.f403241h;
        s56.j jVar = this.f403243m;
        long j27 = 1;
        do {
            long j28 = this.f403248r.get();
            while (j28 != j19) {
                boolean z17 = this.f403247q;
                java.lang.Object poll = queue.poll();
                boolean z18 = poll == null;
                if (h(z17, z18, rVar, queue)) {
                    return;
                }
                if (z18) {
                    break;
                }
                jVar.getClass();
                if (poll == s56.j.f403217c) {
                    poll = null;
                }
                rVar.a(poll);
                j19++;
                if (j19 == this.f403246p) {
                    java.util.concurrent.atomic.AtomicLong atomicLong = this.f403248r;
                    do {
                        j17 = atomicLong.get();
                        j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                        if (j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                            break;
                        }
                        j18 = j17 - j19;
                        if (j18 < 0) {
                            throw new java.lang.IllegalStateException("More produced than requested: " + j18);
                        }
                    } while (!atomicLong.compareAndSet(j17, j18));
                    f(j19);
                    j28 = j18;
                    j19 = 0;
                }
            }
            if (j28 == j19 && h(this.f403247q, queue.isEmpty(), rVar, queue)) {
                return;
            }
            this.f403251u = j19;
            j27 = this.f403249s.addAndGet(-j27);
        } while (j27 != 0);
    }

    public boolean h(boolean z17, boolean z18, p56.r rVar, java.util.Queue queue) {
        if (rVar.f352103d.f424839e) {
            queue.clear();
            return true;
        }
        if (!z17) {
            return false;
        }
        if (this.f403244n) {
            if (!z18) {
                return false;
            }
            java.lang.Throwable th6 = this.f403250t;
            try {
                if (th6 != null) {
                    rVar.onError(th6);
                } else {
                    rVar.onCompleted();
                }
                return false;
            } finally {
            }
        }
        java.lang.Throwable th7 = this.f403250t;
        if (th7 != null) {
            queue.clear();
            try {
                rVar.onError(th7);
                return true;
            } finally {
            }
        }
        if (!z18) {
            return false;
        }
        try {
            rVar.onCompleted();
            return true;
        } finally {
        }
    }

    public void i() {
        if (this.f403249s.getAndIncrement() == 0) {
            this.f403242i.d(this);
        }
    }

    @Override // p56.m
    public void onCompleted() {
        if (this.f352103d.f424839e || this.f403247q) {
            return;
        }
        this.f403247q = true;
        i();
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        if (this.f352103d.f424839e || this.f403247q) {
            x56.m.a(th6);
            return;
        }
        this.f403250t = th6;
        this.f403247q = true;
        i();
    }
}
