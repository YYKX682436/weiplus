package t56;

/* loaded from: classes16.dex */
public class u extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final a66.b f415939d = new a66.b();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t56.v f415940e;

    public u(t56.v vVar, t56.t tVar) {
        this.f415940e = vVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415939d.b();
    }

    @Override // p56.s
    public void c() {
        this.f415939d.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        aVar.call();
        return a66.g.f1801a;
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        long now = this.f415940e.now() + timeUnit.toMillis(j17);
        if (!b()) {
            long a17 = now - a();
            if (a17 > 0) {
                try {
                    java.lang.Thread.sleep(a17);
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    if (e17 instanceof java.lang.RuntimeException) {
                        throw ((java.lang.RuntimeException) e17);
                    }
                    if (e17 instanceof java.lang.Error) {
                        throw ((java.lang.Error) e17);
                    }
                    throw new java.lang.RuntimeException(e17);
                }
            }
            if (!b()) {
                aVar.call();
            }
        }
        return a66.g.f1801a;
    }
}
