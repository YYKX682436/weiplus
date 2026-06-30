package v26;

/* loaded from: classes14.dex */
public final class v extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Iterable f433069g;

    public v(java.lang.Iterable iterable, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f433069g = iterable;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        v26.q0 q0Var = new v26.q0(r0Var);
        java.util.Iterator it = this.f433069g.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.l.d(r0Var, null, null, new v26.u((kotlinx.coroutines.flow.j) it.next(), q0Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new v26.v(this.f433069g, lVar, i17, uVar);
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
