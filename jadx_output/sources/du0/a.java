package du0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243320d;

    /* renamed from: e, reason: collision with root package name */
    public int f243321e;

    public a(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.a(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new du0.a((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        i95.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243321e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(pp0.q0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pp0.q0 q0Var = (pp0.q0) c17;
            this.f243320d = q0Var;
            this.f243321e = 1;
            yy0.k8 k8Var = (yy0.k8) q0Var;
            java.lang.Object wi6 = k8Var.wi(this);
            mVar = k8Var;
            if (wi6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            i95.m mVar2 = (pp0.q0) this.f243320d;
            kotlin.ResultKt.throwOnFailure(obj);
            mVar = mVar2;
        }
        this.f243320d = null;
        this.f243321e = 2;
        if (((yy0.k8) mVar).Ai(this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
