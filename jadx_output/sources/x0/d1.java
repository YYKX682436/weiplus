package x0;

/* loaded from: classes14.dex */
public final class d1 extends x0.e {

    /* renamed from: m, reason: collision with root package name */
    public final x0.e f450873m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f450874n;

    public d1(x0.e eVar, yz5.l lVar, yz5.l lVar2, boolean z17) {
        super(0, x0.s.f450939h, x0.z.j(lVar, (eVar == null || (r1 = eVar.f450875f) == null) ? ((x0.d) x0.z.f450969h.get()).f450875f : r1, z17), x0.z.b(lVar2, (eVar == null || (r1 = eVar.f450876g) == null) ? ((x0.d) x0.z.f450969h.get()).f450876g : r1));
        yz5.l lVar3;
        yz5.l lVar4;
        this.f450873m = eVar;
        this.f450874n = z17;
    }

    public final x0.e A() {
        x0.e eVar = this.f450873m;
        if (eVar != null) {
            return eVar;
        }
        java.lang.Object obj = x0.z.f450969h.get();
        kotlin.jvm.internal.o.f(obj, "currentGlobalSnapshot.get()");
        return (x0.e) obj;
    }

    @Override // x0.e, x0.m
    public void c() {
        this.f450910c = true;
    }

    @Override // x0.m
    public int d() {
        return A().d();
    }

    @Override // x0.m
    public x0.s e() {
        return A().e();
    }

    @Override // x0.e, x0.m
    public boolean g() {
        return A().g();
    }

    @Override // x0.e, x0.m
    public void j(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public void k(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public void l() {
        A().l();
    }

    @Override // x0.e, x0.m
    public void m(x0.z0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        A().m(state);
    }

    @Override // x0.m
    public void p(int i17) {
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void q(x0.s value) {
        kotlin.jvm.internal.o.g(value, "value");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public x0.m r(yz5.l lVar) {
        return !this.f450874n ? x0.z.g(A().r(null), lVar) : A().r(x0.z.j(lVar, this.f450875f, true));
    }

    @Override // x0.e
    public x0.p t() {
        return A().t();
    }

    @Override // x0.e
    public java.util.Set u() {
        return A().u();
    }

    @Override // x0.e
    public void x(java.util.Set set) {
        x0.m0.a();
        throw null;
    }

    @Override // x0.e
    public x0.e y(yz5.l lVar, yz5.l lVar2) {
        yz5.l j17 = x0.z.j(lVar, this.f450875f, true);
        yz5.l b17 = x0.z.b(lVar2, this.f450876g);
        return !this.f450874n ? new x0.d1(A().y(null, b17), j17, b17, false) : A().y(j17, b17);
    }
}
