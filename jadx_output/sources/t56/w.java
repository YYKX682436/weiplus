package t56;

/* loaded from: classes16.dex */
public final class w extends p56.q {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f415942e;

    public w(java.util.concurrent.ThreadFactory threadFactory) {
        this.f415942e = threadFactory;
    }

    @Override // p56.q
    public p56.p createWorker() {
        return new t56.y(this.f415942e);
    }
}
