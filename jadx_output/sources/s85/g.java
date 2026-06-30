package s85;

/* loaded from: classes4.dex */
public abstract class g extends s85.a implements s85.b {

    /* renamed from: h, reason: collision with root package name */
    public final s85.c f404908h;

    /* renamed from: i, reason: collision with root package name */
    public final s85.c f404909i;

    /* renamed from: m, reason: collision with root package name */
    public final s85.b f404910m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f404911n;

    public g(java.lang.String str, s85.c cVar, s85.c cVar2, java.lang.Object obj) {
        super(str, obj);
        this.f404910m = new s85.f(this);
        this.f404911n = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f404908h = cVar;
        this.f404909i = cVar2;
    }

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        f(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) ((s85.a) this.f404909i).f404903e).booleanValue()));
    }

    @Override // s85.a
    public void c(s85.b bVar) {
        if (this.f404911n.getAndIncrement() == 0) {
            ((s85.a) this.f404908h).b(this);
            ((s85.a) this.f404909i).b(this.f404910m);
        }
    }

    @Override // s85.a
    public void d(s85.b bVar) {
        e(bVar);
        if (this.f404911n.decrementAndGet() == 0) {
            ((s85.a) this.f404908h).e(this);
            ((s85.a) this.f404909i).e(this.f404910m);
        }
    }
}
