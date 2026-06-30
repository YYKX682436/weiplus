package g4;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.f f268219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g4.f fVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f268219d = fVar;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.c cVar = new g4.c(this.f268219d, continuation);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        u26.x0.a(this.f268219d.f268276g.f268602a, null, 1, null);
        return jz5.f0.f302826a;
    }
}
