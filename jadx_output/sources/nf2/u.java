package nf2;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nf2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336801e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nf2.u(this.f336801e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((nf2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336800d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nf2.w wVar = this.f336801e;
            kotlinx.coroutines.flow.f3 f3Var = wVar.Z6().f329240J;
            nf2.t tVar = new nf2.t(wVar);
            this.f336800d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(tVar, this) == aVar) {
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
