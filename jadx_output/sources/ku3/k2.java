package ku3;

/* loaded from: classes3.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(ku3.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312293e = n2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.k2(this.f312293e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312292d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f312292d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
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
        ku3.j2 j2Var = new ku3.j2(this.f312293e, null);
        this.f312292d = 2;
        if (kotlinx.coroutines.l.g(g3Var, j2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
