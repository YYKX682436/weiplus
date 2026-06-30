package lf2;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f318283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lf2.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318284e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lf2.f(this.f318284e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((lf2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f318283d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lf2.s sVar = this.f318284e;
            kotlinx.coroutines.flow.j2 j2Var = ((om2.e) sVar.H.a(om2.e.class)).f346298q;
            lf2.e eVar = new lf2.e(sVar);
            this.f318283d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(eVar, this) == aVar) {
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
