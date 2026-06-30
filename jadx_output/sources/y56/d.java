package y56;

/* loaded from: classes16.dex */
public final class d extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final a66.b f459581d = new a66.b();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx.schedulers.TestScheduler f459582e;

    public d(rx.schedulers.TestScheduler testScheduler) {
        this.f459582e = testScheduler;
    }

    @Override // p56.p
    public long a() {
        return this.f459582e.now();
    }

    @Override // p56.s
    public boolean b() {
        return this.f459581d.b();
    }

    @Override // p56.s
    public void c() {
        this.f459581d.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        y56.e eVar = new y56.e(this, 0L, aVar);
        ((java.util.PriorityQueue) this.f459582e.f400896e).add(eVar);
        return new a66.b(new y56.c(this, eVar));
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        rx.schedulers.TestScheduler testScheduler = this.f459582e;
        y56.e eVar = new y56.e(this, testScheduler.f400897f + timeUnit.toNanos(j17), aVar);
        ((java.util.PriorityQueue) testScheduler.f400896e).add(eVar);
        return new a66.b(new y56.b(this, eVar));
    }
}
