package g4;

/* loaded from: classes.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268466d;

    /* renamed from: e, reason: collision with root package name */
    public int f268467e;

    public o1(g4.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.o1 o1Var = new g4.o1(null, completion);
        o1Var.f268466d = obj;
        return o1Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.o1) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        g4.d4 d4Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268467e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f268466d;
            d4Var = null;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kVar = (kotlinx.coroutines.flow.k) this.f268466d;
            kotlin.ResultKt.throwOnFailure(obj);
            d4Var = (g4.d4) obj;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d4Var == g4.d4.LAUNCH_INITIAL_REFRESH);
        this.f268466d = null;
        this.f268467e = 2;
        if (kVar.emit(valueOf, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
