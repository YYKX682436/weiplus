package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310233d;

    public d3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.d3 d3Var = new kotlinx.coroutines.flow.d3(continuation);
        d3Var.f310233d = obj;
        return d3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.flow.d3) create((kotlinx.coroutines.flow.t2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return java.lang.Boolean.valueOf(((kotlinx.coroutines.flow.t2) this.f310233d) != kotlinx.coroutines.flow.t2.START);
    }
}
