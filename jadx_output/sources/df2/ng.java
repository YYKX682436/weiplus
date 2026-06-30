package df2;

/* loaded from: classes3.dex */
public final class ng extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(df2.ug ugVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230856e = ugVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ng(this.f230856e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.ng) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230855d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.ug ugVar = this.f230856e;
            kotlinx.coroutines.flow.i2 i2Var = ((mm2.j2) ugVar.business(mm2.j2.class)).f329178z;
            df2.mg mgVar = new df2.mg(ugVar);
            this.f230855d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, mgVar, this) == aVar) {
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
