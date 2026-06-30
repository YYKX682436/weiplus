package qf2;

/* loaded from: classes10.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.pf f362547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(qf2.c3 c3Var, dk2.pf pfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362546d = c3Var;
        this.f362547e = pfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.q2(this.f362546d, this.f362547e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.q2 q2Var = (qf2.q2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.pf pfVar = this.f362547e;
        this.f362546d.e7(pfVar.f233926a, pfVar.f233930e, "createVisitorBattle");
        return jz5.f0.f302826a;
    }
}
