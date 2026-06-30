package wc5;

/* loaded from: classes10.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(wc5.y0 y0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444632d = y0Var;
        this.f444633e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.q0(this.f444632d, this.f444633e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.q0 q0Var = (wc5.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wc5.y0 y0Var = this.f444632d;
        y0Var.f444659g = true;
        java.lang.String str = this.f444633e;
        y0Var.T6(str, false);
        y0Var.V6(str, true);
        return jz5.f0.f302826a;
    }
}
