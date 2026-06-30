package yf2;

/* loaded from: classes10.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.s0 f461760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yf2.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461760e = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.o0(this.f461760e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461759d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yf2.s0 s0Var = this.f461760e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) s0Var.getStore().business(mm2.g1.class)).f329071i;
            yf2.n0 n0Var = new yf2.n0(s0Var);
            this.f461759d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(n0Var, this) == aVar) {
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
