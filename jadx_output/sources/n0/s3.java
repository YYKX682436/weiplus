package n0;

/* loaded from: classes10.dex */
public final class s3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333699d;

    public s3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n0.s3 s3Var = new n0.s3(continuation);
        s3Var.f333699d = obj;
        return s3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.s3) create((n0.o3) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return java.lang.Boolean.valueOf(((n0.o3) this.f333699d) == n0.o3.ShutDown);
    }
}
