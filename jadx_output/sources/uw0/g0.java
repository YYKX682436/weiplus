package uw0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(uw0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431562e = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.g0(this.f431562e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f431561d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xw0.r u76 = this.f431562e.u7();
            this.f431561d = 1;
            if (u76.k(null, this) == aVar) {
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
