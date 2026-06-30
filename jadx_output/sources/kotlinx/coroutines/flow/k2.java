package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class k2 implements kotlinx.coroutines.flow.n2, kotlinx.coroutines.flow.j, v26.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f310310d;

    public k2(kotlinx.coroutines.flow.n2 n2Var, kotlinx.coroutines.r2 r2Var) {
        this.f310310d = n2Var;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        return this.f310310d.a(kVar, continuation);
    }

    @Override // v26.h0
    public kotlinx.coroutines.flow.j b(oz5.l lVar, int i17, u26.u uVar) {
        return ((i17 == 0 || i17 == -3) && uVar == u26.u.SUSPEND) ? this : new v26.o(this, lVar, i17, uVar);
    }
}
