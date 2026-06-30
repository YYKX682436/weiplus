package te2;

/* loaded from: classes3.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418357e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.q6 q6Var = new te2.q6(this.f418357e, continuation);
        q6Var.f418356d = obj;
        return q6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.q6 q6Var = (te2.q6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f418356d;
        te2.p8 p8Var = this.f418357e;
        p8Var.w7(true, new te2.o6(kotlinx.coroutines.l.d(y0Var, null, null, new te2.p6(p8Var, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
