package z51;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.p f470198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z51.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470198e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z51.o(this.f470198e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f470197d;
        z51.p pVar = this.f470198e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = ((z51.w) pVar.a(z51.w.class)).f470229g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("first play no wait parse to check loadBitmapJob: ");
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
            pVar.f(sb6.toString());
            if (r2Var != null) {
                this.f470197d = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
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
        z51.n nVar = new z51.n(pVar, null);
        this.f470197d = 2;
        if (kotlinx.coroutines.l.g(g3Var, nVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
