package v02;

/* loaded from: classes8.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v02.f0 f0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432276e = f0Var;
        this.f432277f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v02.q(this.f432276e, this.f432277f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432275d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f432275d = 1;
            if (v02.f0.fj(this.f432276e, this.f432277f, this) == aVar) {
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
