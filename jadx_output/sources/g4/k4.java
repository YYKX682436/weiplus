package g4;

/* loaded from: classes5.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268407d;

    /* renamed from: e, reason: collision with root package name */
    public int f268408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f268409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268409f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.k4 k4Var = new g4.k4(this.f268409f, completion);
        k4Var.f268407d = obj;
        return k4Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.k4) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268408e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.j4 j4Var = new g4.j4(this, (kotlinx.coroutines.flow.k) this.f268407d, null);
            this.f268408e = 1;
            if (kotlinx.coroutines.z0.f(j4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
