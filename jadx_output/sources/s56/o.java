package s56;

/* loaded from: classes16.dex */
public final class o implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final long f403226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f403227e;

    /* renamed from: f, reason: collision with root package name */
    public final p56.q f403228f;

    public o(long j17, java.util.concurrent.TimeUnit timeUnit, p56.q qVar) {
        this.f403226d = j17;
        this.f403227e = timeUnit;
        this.f403228f = qVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.p createWorker = this.f403228f.createWorker();
        rVar.d(createWorker);
        createWorker.e(new s56.n(this, rVar), this.f403226d, this.f403227e);
    }
}
