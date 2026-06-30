package iq2;

/* loaded from: classes2.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f293767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(iq2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f293768e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iq2.u(this.f293768e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iq2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f293767d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f293767d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f293768e.d("loadDataWithCgi");
        return jz5.f0.f302826a;
    }
}
