package v26;

/* loaded from: classes14.dex */
public final class o extends v26.n {
    public o(kotlinx.coroutines.flow.j jVar, oz5.l lVar, int i17, u26.u uVar, int i18, kotlin.jvm.internal.i iVar) {
        super(jVar, (i18 & 2) != 0 ? oz5.m.f350329d : lVar, (i18 & 4) != 0 ? -3 : i17, (i18 & 8) != 0 ? u26.u.SUSPEND : uVar);
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new v26.o(this.f433034g, lVar, i17, uVar);
    }

    @Override // v26.g
    public kotlinx.coroutines.flow.j h() {
        return this.f433034g;
    }

    @Override // v26.n
    public java.lang.Object j(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f433034g.a(kVar, continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
