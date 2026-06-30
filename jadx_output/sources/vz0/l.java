package vz0;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f441612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vz0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441612e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vz0.l(this.f441612e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vz0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441611d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vz0.d0 d0Var = this.f441612e;
            kotlinx.coroutines.flow.j j17 = kotlinx.coroutines.flow.l.j(new vz0.k(n0.s4.f(new vz0.g(d0Var))), 1);
            vz0.h hVar = new vz0.h(d0Var);
            this.f441611d = 1;
            if (((kotlinx.coroutines.flow.p0) j17).a(hVar, this) == aVar) {
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
