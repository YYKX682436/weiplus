package u1;

/* loaded from: classes14.dex */
public final class i1 implements yz5.a, u1.s1, t1.e {

    /* renamed from: h, reason: collision with root package name */
    public static final t1.e f423601h = new u1.f1();

    /* renamed from: d, reason: collision with root package name */
    public u1.j1 f423602d;

    /* renamed from: e, reason: collision with root package name */
    public final t1.b f423603e;

    /* renamed from: f, reason: collision with root package name */
    public final o0.i f423604f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f423605g;

    public i1(u1.j1 provider, t1.b modifier) {
        kotlin.jvm.internal.o.g(provider, "provider");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        this.f423602d = provider;
        this.f423603e = modifier;
        this.f423604f = new o0.i(new t1.a[16], 0);
    }

    @Override // t1.e
    public java.lang.Object a(t1.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        this.f423604f.b(aVar);
        t1.d d17 = this.f423602d.d(aVar);
        return d17 == null ? aVar.f414546a.invoke() : d17.getValue();
    }

    public final void d() {
        if (this.f423605g) {
            this.f423604f.e();
            u1.q0.a(this.f423602d.f423608d).getSnapshotObserver().a(this, u1.g1.f423596d, new u1.h1(this));
        }
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d();
        return jz5.f0.f302826a;
    }

    @Override // u1.s1
    public boolean isValid() {
        return this.f423605g;
    }
}
