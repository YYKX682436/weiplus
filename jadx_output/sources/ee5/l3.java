package ee5;

/* loaded from: classes4.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.q3 f251961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(ee5.q3 q3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251961e = q3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.l3(this.f251961e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251960d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f251960d = 1;
            if (kotlinx.coroutines.k1.b(1500L, this) == aVar) {
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
        ee5.k3 k3Var = new ee5.k3(this.f251961e, null);
        this.f251960d = 2;
        if (kotlinx.coroutines.l.g(g3Var, k3Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
