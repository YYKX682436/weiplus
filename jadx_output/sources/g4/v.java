package g4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.q {
    public v(g4.a aVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.v vVar = new g4.v(null, continuation);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
