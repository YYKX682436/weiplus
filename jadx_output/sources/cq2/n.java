package cq2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {
    public n(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cq2.n(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cq2.n nVar = new cq2.n((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cq2.q qVar = cq2.q.f221428a;
        java.util.HashMap hashMap = cq2.q.f221430c;
        java.lang.String str = cq2.q.f221435h;
        hashMap.put(str, str);
        cq2.q.f221443p = false;
        return jz5.f0.f302826a;
    }
}
