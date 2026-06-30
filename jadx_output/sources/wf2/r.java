package wf2;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wf2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445615e = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wf2.r(this.f445615e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f445614d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f445614d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        wf2.a0 a0Var = this.f445615e;
        a0Var.d7(true, new wf2.q(a0Var));
        return jz5.f0.f302826a;
    }
}
