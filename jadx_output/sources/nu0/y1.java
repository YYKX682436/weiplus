package nu0;

/* loaded from: classes5.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340148d = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.y1(this.f340148d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.y1 y1Var = (nu0.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nu0.b4 b4Var = this.f340148d;
        b4Var.t7().getViewTreeObserver().addOnGlobalLayoutListener(new nu0.x1(b4Var));
        return jz5.f0.f302826a;
    }
}
