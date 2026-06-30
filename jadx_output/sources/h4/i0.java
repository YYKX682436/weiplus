package h4;

/* loaded from: classes14.dex */
public final class i0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.k0 f278669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h4.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f278669d = k0Var;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        h4.i0 i0Var = new h4.i0(this.f278669d, continuation);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h4.k0.a(this.f278669d);
        return jz5.f0.f302826a;
    }
}
