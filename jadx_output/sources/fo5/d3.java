package fo5;

/* loaded from: classes14.dex */
public final class d3 extends qz5.l implements yz5.p {
    public d3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.d3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.d3 d3Var = new fo5.d3((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.a aVar2 = fo5.f3.f264986c;
        if (aVar2 != null) {
            ro5.b bVar = ((fo5.r0) aVar2).f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.B();
        }
        return jz5.f0.f302826a;
    }
}
