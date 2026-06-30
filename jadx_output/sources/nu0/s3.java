package nu0;

/* loaded from: classes5.dex */
public final class s3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340094d = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.s3(this.f340094d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.s3 s3Var = (nu0.s3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f340094d.T.b(false);
        return jz5.f0.f302826a;
    }
}
