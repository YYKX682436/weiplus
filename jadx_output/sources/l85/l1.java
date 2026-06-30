package l85;

/* loaded from: classes12.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f317191a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f317192b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Runnable f317193c = new l85.k1();

    public static void a(long j17, long j18, boolean z17) {
        if (z17) {
            jx3.f.INSTANCE.idkeyStat(963L, j17, j18, true);
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f317192b;
        java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (atomicLong == null) {
            concurrentHashMap.putIfAbsent(java.lang.Long.valueOf(j17), new java.util.concurrent.atomic.AtomicLong(0L));
            atomicLong = (java.util.concurrent.atomic.AtomicLong) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        }
        atomicLong.addAndGet(j18);
        if (f317191a.compareAndSet(false, true)) {
            ((ku5.t0) ku5.t0.f312615d).k(f317193c, 1500L);
        }
    }
}
