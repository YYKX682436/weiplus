package kotlinx.coroutines.flow;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310417e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kotlinx.coroutines.flow.u(this.f310417e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.flow.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310416d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f310416d = 1;
            java.lang.Object a17 = this.f310417e.a(v26.j0.f433015d, this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
