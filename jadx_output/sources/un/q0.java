package un;

/* loaded from: classes.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.s0 f429322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(un.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429322d = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new un.q0(this.f429322d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        un.q0 q0Var = (un.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f429322d.T6().n().setVisibility(0);
        return jz5.f0.f302826a;
    }
}
