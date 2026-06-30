package t56;

/* loaded from: classes16.dex */
public class m0 implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final r56.a f415907d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.p f415908e;

    /* renamed from: f, reason: collision with root package name */
    public final long f415909f;

    public m0(r56.a aVar, p56.p pVar, long j17) {
        this.f415907d = aVar;
        this.f415908e = pVar;
        this.f415909f = j17;
    }

    @Override // r56.a
    public void call() {
        p56.p pVar = this.f415908e;
        if (pVar.b()) {
            return;
        }
        long a17 = this.f415909f - pVar.a();
        if (a17 > 0) {
            try {
                java.lang.Thread.sleep(a17);
            } catch (java.lang.InterruptedException e17) {
                java.lang.Thread.currentThread().interrupt();
                if (e17 instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) e17);
                }
                if (!(e17 instanceof java.lang.Error)) {
                    throw new java.lang.RuntimeException(e17);
                }
                throw ((java.lang.Error) e17);
            }
        }
        if (pVar.b()) {
            return;
        }
        this.f415907d.call();
    }
}
