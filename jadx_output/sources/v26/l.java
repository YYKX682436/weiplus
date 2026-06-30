package v26;

/* loaded from: classes14.dex */
public final class l extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f433023g;

    /* renamed from: h, reason: collision with root package name */
    public final int f433024h;

    public l(kotlinx.coroutines.flow.j jVar, int i17, oz5.l lVar, int i18, u26.u uVar) {
        super(lVar, i18, uVar);
        this.f433023g = jVar;
        this.f433024h = i17;
    }

    @Override // v26.g
    public java.lang.String c() {
        return "concurrency=" + this.f433024h;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.sync.m a17 = kotlinx.coroutines.sync.p.a(this.f433024h, 0, 2, null);
        v26.q0 q0Var = new v26.q0(r0Var);
        oz5.l context = continuation.getContext();
        int i17 = kotlinx.coroutines.r2.O0;
        java.lang.Object a18 = this.f433023g.a(new v26.k((kotlinx.coroutines.r2) context.get(kotlinx.coroutines.q2.f310571d), a17, r0Var, q0Var), continuation);
        return a18 == pz5.a.f359186d ? a18 : jz5.f0.f302826a;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new v26.l(this.f433023g, this.f433024h, lVar, i17, uVar);
    }

    @Override // v26.g
    public u26.t0 i(kotlinx.coroutines.y0 y0Var) {
        yz5.p fVar = new v26.f(this, null);
        u26.u uVar = u26.u.SUSPEND;
        kotlinx.coroutines.a1 a1Var = kotlinx.coroutines.a1.DEFAULT;
        u26.q0 q0Var = new u26.q0(kotlinx.coroutines.m0.b(y0Var, this.f433002d), u26.z.a(this.f433003e, uVar, null, 4, null));
        q0Var.j0(a1Var, q0Var, fVar);
        return q0Var;
    }
}
