package ro5;

/* loaded from: classes14.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ro5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398190d = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.e1(this.f398190d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ro5.e1 e1Var = (ro5.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ro5.m1 m1Var = this.f398190d;
        if (m1Var.f398256r.isInitialized()) {
            ((zo5.i) m1Var.f398256r.getValue()).a();
        }
        return jz5.f0.f302826a;
    }
}
