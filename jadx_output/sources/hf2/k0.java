package hf2;

/* loaded from: classes5.dex */
public final class k0 extends qz5.l implements yz5.p {
    public k0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.k0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hf2.k0 k0Var = new hf2.k0((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(pp0.q0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pp0.q0.od((pp0.q0) c17, false, 1, null);
        return jz5.f0.f302826a;
    }
}
