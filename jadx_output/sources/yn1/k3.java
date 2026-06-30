package yn1;

/* loaded from: classes11.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.o0 f463737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(bw5.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463737d = o0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.k3(this.f463737d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.k3 k3Var = (yn1.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yn1.z0 z0Var = yn1.z0.f463933a;
        bw5.o0 progressModel = this.f463737d;
        kotlin.jvm.internal.o.g(progressModel, "progressModel");
        yn1.z0.f463939g = progressModel;
        z0Var.p();
        return jz5.f0.f302826a;
    }
}
