package s56;

/* loaded from: classes16.dex */
public final class d0 implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final p56.q f403199d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.l f403200e;

    public d0(p56.l lVar, p56.q qVar) {
        this.f403199d = qVar;
        this.f403200e = lVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.p createWorker = this.f403199d.createWorker();
        rVar.d(createWorker);
        createWorker.d(new s56.c0(this, rVar, createWorker));
    }
}
