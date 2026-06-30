package vz0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f441621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vz0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441621e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vz0.q(this.f441621e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vz0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441620d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vz0.d0 d0Var = this.f441621e;
            kotlinx.coroutines.flow.j f17 = n0.s4.f(new vz0.m(d0Var));
            vz0.n nVar = new vz0.n(d0Var);
            this.f441620d = 1;
            java.lang.Object a17 = f17.a(new vz0.p(nVar, d0Var), this);
            if (a17 != pz5.a.f359186d) {
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
