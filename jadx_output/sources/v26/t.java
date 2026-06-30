package v26;

/* loaded from: classes14.dex */
public final class t extends v26.n {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.q f433059h;

    public t(yz5.q qVar, kotlinx.coroutines.flow.j jVar, oz5.l lVar, int i17, u26.u uVar) {
        super(jVar, lVar, i17, uVar);
        this.f433059h = qVar;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new v26.t(this.f433059h, this.f433034g, lVar, i17, uVar);
    }

    @Override // v26.n
    public java.lang.Object j(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new v26.s(this, kVar, null), continuation);
        return f17 == pz5.a.f359186d ? f17 : jz5.f0.f302826a;
    }
}
