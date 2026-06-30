package g4;

/* loaded from: classes5.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.c3 f268204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(g4.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268204d = c3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.a3(this.f268204d, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g4.a3 a3Var = (g4.a3) create(obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g4.c3 c3Var = this.f268204d;
        ((u26.o) c3Var.f268237i).offer(new java.lang.Integer(c3Var.f268235g));
        return jz5.f0.f302826a;
    }
}
