package s85;

/* loaded from: classes4.dex */
public abstract class i extends s85.a implements s85.b {

    /* renamed from: h, reason: collision with root package name */
    public final s85.c f404912h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f404913i;

    public i(java.lang.String str, s85.c cVar, java.lang.Object obj) {
        super(str, obj);
        this.f404913i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f404912h = cVar;
    }

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        f(java.lang.Boolean.valueOf(!((java.lang.Boolean) obj).booleanValue()));
    }

    @Override // s85.a
    public void c(s85.b bVar) {
        if (this.f404913i.getAndIncrement() == 0) {
            ((s85.a) this.f404912h).b(this);
        }
    }

    @Override // s85.a
    public void d(s85.b bVar) {
        if (this.f404913i.decrementAndGet() == 0) {
            ((s85.a) this.f404912h).e(this);
        }
    }
}
