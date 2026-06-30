package tp5;

/* loaded from: classes12.dex */
public class c implements java.lang.Iterable, java.lang.AutoCloseable {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f421163p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f421164q = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: r, reason: collision with root package name */
    public static volatile java.util.concurrent.ScheduledExecutorService f421165r = null;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f421166d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.core.Handle f421167e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.core.PreparedStatement f421168f;

    /* renamed from: g, reason: collision with root package name */
    public final tp5.f f421169g;

    /* renamed from: h, reason: collision with root package name */
    public final long f421170h;

    /* renamed from: i, reason: collision with root package name */
    public final long f421171i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f421172m;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Throwable f421173o;

    public c(com.tencent.wcdb.core.Handle handle, com.tencent.wcdb.core.PreparedStatement preparedStatement, tp5.f fVar) {
        this.f421167e = handle;
        this.f421168f = preparedStatement;
        this.f421169g = fVar;
        if (!qi3.y.r9()) {
            this.f421170h = -1L;
            this.f421171i = 0L;
            this.f421172m = "";
            this.f421173o = null;
            return;
        }
        if (f421165r == null) {
            synchronized (tp5.c.class) {
                if (f421165r == null) {
                    java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new tp5.c$$a());
                    newSingleThreadScheduledExecutor.scheduleAtFixedRate(new tp5.c$$b(), 30000L, 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    f421165r = newSingleThreadScheduledExecutor;
                }
            }
        }
        long andIncrement = f421164q.getAndIncrement();
        this.f421170h = andIncrement;
        this.f421171i = java.lang.System.currentTimeMillis();
        this.f421172m = java.lang.Thread.currentThread().getName();
        java.lang.Thread.currentThread().getId();
        this.f421173o = new java.lang.Throwable("LazyResult create site");
        f421163p.put(java.lang.Long.valueOf(andIncrement), new java.lang.ref.WeakReference(this));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f421166d >= 2) {
            return;
        }
        java.lang.System.currentTimeMillis();
        try {
            this.f421167e.finalizeAndReturnPreparedStatement(this.f421168f);
            this.f421167e.invalidate();
        } finally {
            this.f421166d = 2;
            if (qi3.y.r9()) {
                f421163p.remove(java.lang.Long.valueOf(this.f421170h));
                java.lang.Thread.currentThread().getId();
            }
        }
    }

    public void finalize() {
        if (this.f421166d < 2) {
            if (qi3.y.r9()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f421171i;
                com.tencent.mars.xlog.Log.e("MicroMsg.WCDBLazyResult", "LEAK_BY_GC lazyId=" + this.f421170h + " ageMs=" + currentTimeMillis + " status=" + this.f421166d + " threadCreate=" + this.f421172m, this.f421173o);
                try {
                    try {
                        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).cj(this.f421170h, currentTimeMillis, this.f421166d, this.f421172m, this.f421173o);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IMsgSendService", th6, "reportWCDBLazyCursorLeak failed", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WCDBLazyResult", th7, "report leak via IMsgSendService failed", new java.lang.Object[0]);
                }
            }
            try {
                close();
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WCDBLazyResult", th8, "close in finalize failed", new java.lang.Object[0]);
            }
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        if (this.f421166d >= 1) {
            throw new java.lang.IllegalStateException("WCDBLazyResult is reentrant or closed");
        }
        this.f421166d = 1;
        return new tp5.e(this, null);
    }
}
