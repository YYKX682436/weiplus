package ro5;

/* loaded from: classes14.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ro5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398193d = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.f1(this.f398193d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ro5.f1 f1Var = (ro5.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f398193d.f398254p.a();
        return jz5.f0.f302826a;
    }
}
