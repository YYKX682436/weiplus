package gx0;

/* loaded from: classes5.dex */
public final class p8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276831d;

    /* renamed from: e, reason: collision with root package name */
    public int f276832e;

    public p8(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.p8(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new gx0.p8((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276832e;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i95.m mVar = (i95.m) this.f276831d;
            kotlin.ResultKt.throwOnFailure(obj);
            return mVar;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(pp0.q0.class);
        pp0.q0 q0Var = (pp0.q0) c17;
        kotlin.jvm.internal.o.d(q0Var);
        pp0.q0.od(q0Var, false, 1, null);
        this.f276831d = c17;
        this.f276832e = 1;
        java.lang.Object g17 = az0.i5.f15557a.g(this);
        if (g17 != aVar) {
            g17 = jz5.f0.f302826a;
        }
        return g17 == aVar ? aVar : c17;
    }
}
