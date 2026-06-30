package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class l2 implements kotlinx.coroutines.flow.f3, kotlinx.coroutines.flow.j, v26.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.f3 f310316d;

    public l2(kotlinx.coroutines.flow.f3 f3Var, kotlinx.coroutines.r2 r2Var) {
        this.f310316d = f3Var;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        return this.f310316d.a(kVar, continuation);
    }

    @Override // v26.h0
    public kotlinx.coroutines.flow.j b(oz5.l lVar, int i17, u26.u uVar) {
        return ((((i17 >= 0 && i17 < 2) || i17 == -2) && uVar == u26.u.DROP_OLDEST) || ((i17 == 0 || i17 == -3) && uVar == u26.u.SUSPEND)) ? this : new v26.o(this, lVar, i17, uVar);
    }

    @Override // kotlinx.coroutines.flow.f3
    public java.lang.Object getValue() {
        return this.f310316d.getValue();
    }
}
