package dv2;

/* loaded from: classes2.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.v f243930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(dv2.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243930d = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dv2.q(this.f243930d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dv2.q qVar = (dv2.q) create(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()), (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dv2.v.w7(this.f243930d);
        return jz5.f0.f302826a;
    }
}
