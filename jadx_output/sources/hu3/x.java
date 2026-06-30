package hu3;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285218e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.x(this.f285218e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285217d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f285217d = 1;
            if (this.f285218e.g(this) == aVar) {
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
