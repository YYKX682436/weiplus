package nu0;

/* loaded from: classes5.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340101e = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.t2(this.f340101e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340100d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nu0.b4 b4Var = this.f340101e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nu0.b1 b1Var = (nu0.b1) ((jz5.n) b4Var.f339917n).getValue();
            this.f340100d = 1;
            if (!b1Var.q() || (obj2 = b1Var.X6().q(false, this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jx0.k kVar = b4Var.T.f285615b;
        if (!kVar.isShowing()) {
            kVar.show();
        }
        return f0Var;
    }
}
