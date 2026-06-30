package df2;

/* loaded from: classes3.dex */
public final class bi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.fi f229813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(df2.fi fiVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229813e = fiVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.bi(this.f229813e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.bi) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229812d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.fi fiVar = this.f229813e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) fiVar.business(mm2.g1.class)).f329071i;
            df2.ai aiVar = new df2.ai(fiVar);
            this.f229812d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(aiVar, this) == aVar) {
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
