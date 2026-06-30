package uw0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(uw0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431591d = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.o0(this.f431591d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uw0.o0 o0Var = (uw0.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        uw0.t0 t0Var = this.f431591d;
        by0.t.a(t0Var.getContext(), com.tencent.mm.R.string.f492496mu3, t0Var.E);
        return jz5.f0.f302826a;
    }
}
