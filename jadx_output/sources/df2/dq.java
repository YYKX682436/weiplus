package df2;

/* loaded from: classes3.dex */
public final class dq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f229996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(df2.gq gqVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229996e = gqVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.dq(this.f229996e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.dq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229995d;
        df2.gq gqVar = this.f229996e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f229995d = 1;
            if (df2.gq.Z6(gqVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        df2.cq cqVar = new df2.cq(gqVar, null);
        this.f229995d = 2;
        if (kotlinx.coroutines.l.g(g3Var, cqVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
