package x0;

/* loaded from: classes14.dex */
public final class e1 extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final x0.m f450882f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f450883g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f450884h;

    public e1(x0.m mVar, yz5.l lVar, boolean z17) {
        super(0, x0.s.f450939h, null);
        yz5.l f17;
        this.f450882f = mVar;
        this.f450883g = z17;
        this.f450884h = x0.z.j(lVar, (mVar == null || (f17 = mVar.f()) == null) ? ((x0.d) x0.z.f450969h.get()).f450875f : f17, z17);
    }

    @Override // x0.m
    public void c() {
        this.f450910c = true;
    }

    @Override // x0.m
    public int d() {
        return s().d();
    }

    @Override // x0.m
    public x0.s e() {
        return s().e();
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f450884h;
    }

    @Override // x0.m
    public boolean g() {
        return s().g();
    }

    @Override // x0.m
    public yz5.l h() {
        return null;
    }

    @Override // x0.m
    public void j(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void k(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void l() {
        s().l();
    }

    @Override // x0.m
    public void m(x0.z0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        s().m(state);
    }

    @Override // x0.m
    public x0.m r(yz5.l lVar) {
        return !this.f450883g ? x0.z.g(s().r(null), lVar) : s().r(x0.z.j(lVar, this.f450884h, true));
    }

    public final x0.m s() {
        x0.m mVar = this.f450882f;
        if (mVar != null) {
            return mVar;
        }
        java.lang.Object obj = x0.z.f450969h.get();
        kotlin.jvm.internal.o.f(obj, "currentGlobalSnapshot.get()");
        return (x0.m) obj;
    }
}
