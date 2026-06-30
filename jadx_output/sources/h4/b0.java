package h4;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278623d;

    /* renamed from: e, reason: collision with root package name */
    public int f278624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.e0 f278625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h4.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f278625f = e0Var;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        java.lang.Throwable it = (java.lang.Throwable) obj2;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        h4.b0 b0Var = new h4.b0(this.f278625f, continuation);
        b0Var.f278623d = it;
        return b0Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278624e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Throwable th6 = (java.lang.Throwable) this.f278623d;
            yz5.p pVar = this.f278625f.f278646e.f278659d;
            h4.l lVar = new h4.l(th6);
            this.f278624e = 1;
            if (pVar.invoke(lVar, this) == aVar) {
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
