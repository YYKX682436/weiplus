package uw0;

/* loaded from: classes5.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f431632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(uw0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431632d = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.z0(this.f431632d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uw0.z0 z0Var = (uw0.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ow0.a0.K7((ow0.a0) ((jz5.n) this.f431632d.f431550v).getValue(), null, null, null, 7, null);
        return jz5.f0.f302826a;
    }
}
