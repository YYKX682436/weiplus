package dz0;

/* loaded from: classes.dex */
public final class n1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244950d;

    public n1(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.n1 n1Var = new dz0.n1((kotlin.coroutines.Continuation) obj3);
        n1Var.f244950d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MaasMultiTemplate.MaasSdkUIC", (java.lang.Throwable) this.f244950d, "creation error after collect", new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
