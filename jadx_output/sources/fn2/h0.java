package fn2;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f264266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(fn2.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264266e = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn2.h0(this.f264266e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((fn2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264265d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fn2.m0 m0Var = this.f264266e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.k5) m0Var.f264313d.business(mm2.k5.class)).f329198g;
            fn2.g0 g0Var = new fn2.g0(m0Var);
            this.f264265d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(g0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
