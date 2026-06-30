package gx0;

/* loaded from: classes5.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277209d = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.y5(this.f277209d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.y5 y5Var = (gx0.y5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f277209d.s7().setDoneBtnEnabled(true);
        return jz5.f0.f302826a;
    }
}
