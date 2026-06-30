package y80;

/* loaded from: classes11.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f459886d;

    public n0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        y80.n0 n0Var = new y80.n0(continuation);
        n0Var.f459886d = obj;
        return n0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y80.n0) create((qi3.e0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qi3.g0 g0Var = ((qi3.e0) this.f459886d).f363691a;
        return java.lang.Boolean.valueOf(g0Var == qi3.g0.f363712n || g0Var == qi3.g0.f363713o);
    }
}
