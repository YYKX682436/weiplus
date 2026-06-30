package fi2;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f262889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi2.w f262890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f262890e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fi2.o(this.f262890e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((fi2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f262889d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fi2.w wVar = this.f262890e;
            kotlinx.coroutines.flow.f3 f3Var = ((om2.g) wVar.f262915a.S0().a(om2.g.class)).F;
            fi2.n nVar = new fi2.n(wVar);
            this.f262889d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(nVar, this) == aVar) {
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
