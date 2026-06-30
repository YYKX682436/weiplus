package u5;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f424722d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u5.s f424724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u5.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424724f = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        u5.q qVar = new u5.q(this.f424724f, continuation);
        qVar.f424723e = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u5.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f424722d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f424723e;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            u5.s sVar = this.f424724f;
            kotlinx.coroutines.flow.f2 f2Var = new kotlinx.coroutines.flow.f2(n0.s4.f(new u5.m(sVar)), n0.s4.f(new u5.n(sVar)), u5.o.f424718n);
            u5.p pVar = new u5.p(h0Var, sVar, y0Var);
            this.f424722d = 1;
            if (f2Var.a(pVar, this) == aVar) {
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
