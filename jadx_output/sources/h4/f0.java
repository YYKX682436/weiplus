package h4;

/* loaded from: classes14.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f278650d;

    /* renamed from: e, reason: collision with root package name */
    public int f278651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.g0 f278652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h4.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278652f = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new h4.f0(this.f278652f, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.f0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278651e;
        h4.g0 g0Var = this.f278652f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.r2 r2Var = g0Var.f278656a;
                this.f278651e = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return jz5.f0.f302826a;
                    }
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th6 = (java.lang.Throwable) this.f278650d;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th6;
                    } catch (u26.g0 unused) {
                        throw th6;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            yz5.p pVar = g0Var.f278659d;
            h4.m mVar = new h4.m(g0Var);
            this.f278651e = 2;
            if (pVar.invoke(mVar, this) == aVar) {
                return aVar;
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th7) {
            try {
                yz5.p pVar2 = g0Var.f278659d;
                h4.m mVar2 = new h4.m(g0Var);
                this.f278650d = th7;
                this.f278651e = 3;
                if (pVar2.invoke(mVar2, this) == aVar) {
                    return aVar;
                }
            } catch (u26.g0 unused2) {
            }
            throw th7;
        }
    }
}
