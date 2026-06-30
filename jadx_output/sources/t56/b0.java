package t56;

/* loaded from: classes16.dex */
public final class b0 extends java.util.concurrent.atomic.AtomicBoolean implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final t56.c0 f415854d;

    /* renamed from: e, reason: collision with root package name */
    public final a66.c f415855e;

    public b0(t56.c0 c0Var, a66.c cVar) {
        this.f415854d = c0Var;
        this.f415855e = cVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415854d.f415862d.f424839e;
    }

    @Override // p56.s
    public void c() {
        if (compareAndSet(false, true)) {
            this.f415855e.e(this.f415854d);
        }
    }
}
