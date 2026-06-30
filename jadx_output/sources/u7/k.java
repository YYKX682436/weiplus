package u7;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f425057a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f425058b;

    /* renamed from: c, reason: collision with root package name */
    public volatile u7.e f425059c;

    /* renamed from: d, reason: collision with root package name */
    public final u7.b f425060d;

    /* renamed from: e, reason: collision with root package name */
    public final u7.c f425061e;

    public k(java.lang.String str, u7.c cVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        str.getClass();
        this.f425058b = str;
        cVar.getClass();
        this.f425061e = cVar;
        this.f425060d = new u7.j(str, copyOnWriteArrayList);
    }

    public final u7.e a() {
        u7.c cVar = this.f425061e;
        x7.b bVar = cVar.f425036d;
        w7.b bVar2 = cVar.f425037e;
        java.lang.String str = this.f425058b;
        u7.e eVar = new u7.e(new u7.l(str, bVar, bVar2), new v7.b(new java.io.File(cVar.f425033a, ((v7.i) cVar.f425034b).a(str)), cVar.f425035c));
        eVar.f425045k = this.f425060d;
        return eVar;
    }

    public void b(u7.d dVar, java.net.Socket socket) {
        synchronized (this) {
            this.f425059c = this.f425059c == null ? a() : this.f425059c;
        }
        try {
            this.f425057a.incrementAndGet();
            this.f425059c.f(dVar, socket);
            synchronized (this) {
                if (this.f425057a.decrementAndGet() <= 0) {
                    this.f425059c.d();
                    this.f425059c = null;
                }
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                if (this.f425057a.decrementAndGet() <= 0) {
                    this.f425059c.d();
                    this.f425059c = null;
                }
                throw th6;
            }
        }
    }
}
