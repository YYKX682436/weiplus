package s56;

/* loaded from: classes16.dex */
public final class q implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final long f403232d;

    /* renamed from: e, reason: collision with root package name */
    public final long f403233e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f403234f;

    /* renamed from: g, reason: collision with root package name */
    public final p56.q f403235g;

    public q(long j17, long j18, java.util.concurrent.TimeUnit timeUnit, p56.q qVar) {
        this.f403232d = j17;
        this.f403233e = j18;
        this.f403234f = timeUnit;
        this.f403235g = qVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.p createWorker = this.f403235g.createWorker();
        rVar.d(createWorker);
        s56.p pVar = new s56.p(this, rVar, createWorker);
        createWorker.getClass();
        long j17 = this.f403233e;
        java.util.concurrent.TimeUnit timeUnit = this.f403234f;
        long nanos = timeUnit.toNanos(j17);
        long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(createWorker.a());
        long j18 = this.f403232d;
        long nanos3 = nanos2 + timeUnit.toNanos(j18);
        a66.e eVar = new a66.e();
        p56.o oVar = new p56.o(createWorker, nanos2, nanos3, pVar, eVar, nanos);
        a66.e eVar2 = new a66.e();
        eVar.a(eVar2);
        eVar2.a(createWorker.e(oVar, j18, timeUnit));
    }
}
