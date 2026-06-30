package df2;

/* loaded from: classes3.dex */
public final class ig extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(df2.ug ugVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230398e = ugVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ig(this.f230398e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.ig) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230397d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.ug ugVar = this.f230398e;
            kotlinx.coroutines.flow.i2 i2Var = ((mm2.j2) ugVar.business(mm2.j2.class)).f329164i;
            df2.hg hgVar = new df2.hg(ugVar);
            this.f230397d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, hgVar, this) == aVar) {
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
