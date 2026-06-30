package g4;

/* loaded from: classes5.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(g4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268590e = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.v2(this.f268590e, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.v2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268589d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.u2 u2Var = new g4.u2(this.f268590e.f268630a, this);
            g4.r2 r2Var = new g4.r2(this, null);
            this.f268589d = 1;
            if (kotlinx.coroutines.flow.l.f(u2Var, r2Var, this) == aVar) {
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
