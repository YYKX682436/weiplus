package rx.schedulers;

/* loaded from: classes16.dex */
public class TestScheduler extends p56.q {

    /* renamed from: g, reason: collision with root package name */
    public static long f400895g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f400896e = new java.util.PriorityQueue(11, new y56.a());

    /* renamed from: f, reason: collision with root package name */
    public long f400897f;

    public final void a(long j17) {
        while (true) {
            java.util.Queue queue = this.f400896e;
            if (queue.isEmpty()) {
                break;
            }
            y56.e eVar = (y56.e) ((java.util.PriorityQueue) queue).peek();
            long j18 = eVar.f459583a;
            if (j18 > j17) {
                break;
            }
            if (j18 == 0) {
                j18 = this.f400897f;
            }
            this.f400897f = j18;
            queue.remove();
            if (!eVar.f459585c.b()) {
                eVar.f459584b.call();
            }
        }
        this.f400897f = j17;
    }

    public void advanceTimeBy(long j17, java.util.concurrent.TimeUnit timeUnit) {
        advanceTimeTo(this.f400897f + timeUnit.toNanos(j17), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j17, java.util.concurrent.TimeUnit timeUnit) {
        a(timeUnit.toNanos(j17));
    }

    @Override // p56.q
    public p56.p createWorker() {
        return new y56.d(this);
    }

    @Override // p56.q
    public long now() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f400897f);
    }

    public void triggerActions() {
        a(this.f400897f);
    }
}
