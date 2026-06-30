package qi2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f363619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(qi2.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363619d = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi2.r0(this.f363619d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qi2.r0 r0Var = (qi2.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qi2.w0.y(this.f363619d);
        return jz5.f0.f302826a;
    }
}
