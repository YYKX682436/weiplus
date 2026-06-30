package ln1;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    public boolean f319792g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319793h;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f319786a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f319787b = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f319788c = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public volatile java.util.concurrent.locks.Lock f319789d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b3 f319790e = new com.tencent.mm.sdk.platformtools.b3(true);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b3 f319791f = new com.tencent.mm.sdk.platformtools.b3(true);

    /* renamed from: i, reason: collision with root package name */
    public final int f319794i = j62.e.g().i("clicfg_backup_cache_size", 41943040, false, true);

    /* renamed from: j, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f319795j = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f319796k = new java.util.concurrent.atomic.AtomicLong(0);

    public r() {
        ((ku5.t0) ku5.t0.f312615d).q(new ln1.p(this));
    }

    public final void a(ln1.z task, long j17) {
        kotlin.jvm.internal.o.g(task, "task");
        ((java.util.concurrent.locks.ReentrantLock) this.f319789d).lock();
        this.f319795j.addAndGet(j17);
        while (this.f319795j.get() > this.f319794i && !this.f319792g) {
            this.f319791f.b();
            this.f319791f.a(500L);
        }
        if (!this.f319792g) {
            long j18 = this.f319787b.get();
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupFlowQueue", "execute index:%d, cacheSize:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f319795j.get()));
            ((ku5.t0) ku5.t0.f312615d).a(new ln1.o(task, j17, this, j18));
            this.f319787b.addAndGet(1L);
        }
        ((java.util.concurrent.locks.ReentrantLock) this.f319789d).unlock();
    }

    public final void b() {
        this.f319787b.set(0L);
        this.f319788c.set(0L);
        this.f319790e.c();
        this.f319791f.c();
        this.f319786a.clear();
        this.f319795j.set(0L);
        this.f319796k.set(0L);
    }
}
