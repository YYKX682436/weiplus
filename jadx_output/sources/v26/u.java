package v26;

/* loaded from: classes3.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f433063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f433064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v26.q0 f433065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlinx.coroutines.flow.j jVar, v26.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f433064e = jVar;
        this.f433065f = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v26.u(this.f433064e, this.f433065f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f433063d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f433063d = 1;
            if (this.f433064e.a(this.f433065f, this) == aVar) {
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
