package t56;

/* loaded from: classes16.dex */
public final class q extends p56.q {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f415930e;

    public q(java.util.concurrent.Executor executor) {
        this.f415930e = executor;
    }

    @Override // p56.q
    public p56.p createWorker() {
        return new t56.p(this.f415930e);
    }
}
