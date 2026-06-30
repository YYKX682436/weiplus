package xn2;

/* loaded from: classes2.dex */
public final class o0 extends qz5.l implements yz5.p {
    public o0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xn2.o0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new xn2.o0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (Vi) {
            return f0Var;
        }
        ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Zi();
        return f0Var;
    }
}
