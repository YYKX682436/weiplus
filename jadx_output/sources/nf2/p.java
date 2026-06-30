package nf2;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nf2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336788e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nf2.p(this.f336788e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nf2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336787d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nf2.w wVar = this.f336788e;
            kotlinx.coroutines.flow.f2 f2Var = new kotlinx.coroutines.flow.f2(wVar.Z6().f329256x, wVar.Z6().f329251s, new nf2.n(null));
            nf2.o oVar = new nf2.o(wVar);
            this.f336787d = 1;
            if (f2Var.a(oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
