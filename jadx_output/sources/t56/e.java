package t56;

/* loaded from: classes16.dex */
public final class e extends p56.p {

    /* renamed from: e, reason: collision with root package name */
    public final t56.c f415867e;

    /* renamed from: f, reason: collision with root package name */
    public final t56.f f415868f;

    /* renamed from: d, reason: collision with root package name */
    public final a66.c f415866d = new a66.c();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f415869g = new java.util.concurrent.atomic.AtomicBoolean();

    public e(t56.c cVar) {
        t56.f fVar;
        t56.f fVar2;
        this.f415867e = cVar;
        if (cVar.f415859d.f1797e) {
            fVar2 = t56.g.f415875h;
            this.f415868f = fVar2;
        }
        while (true) {
            if (cVar.f415858c.isEmpty()) {
                fVar = new t56.f(cVar.f415856a);
                cVar.f415859d.a(fVar);
                break;
            } else {
                fVar = (t56.f) cVar.f415858c.poll();
                if (fVar != null) {
                    break;
                }
            }
        }
        fVar2 = fVar;
        this.f415868f = fVar2;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415866d.f1797e;
    }

    @Override // p56.s
    public void c() {
        if (this.f415869g.compareAndSet(false, true)) {
            t56.c cVar = this.f415867e;
            cVar.getClass();
            long nanoTime = java.lang.System.nanoTime() + cVar.f415857b;
            t56.f fVar = this.f415868f;
            fVar.f415872o = nanoTime;
            cVar.f415858c.offer(fVar);
        }
        this.f415866d.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        return e(aVar, 0L, null);
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f415866d.f1797e) {
            return a66.g.f1801a;
        }
        t56.c0 h17 = this.f415868f.h(new t56.d(this, aVar), j17, timeUnit);
        this.f415866d.a(h17);
        h17.f415862d.a(new t56.b0(h17, this.f415866d));
        return h17;
    }
}
