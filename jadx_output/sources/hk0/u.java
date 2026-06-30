package hk0;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.v f281811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk0.b1 f281812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hk0.v vVar, hk0.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281811e = vVar;
        this.f281812f = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk0.u(this.f281811e, this.f281812f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281810d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f281810d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
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
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        hk0.t tVar = new hk0.t(this.f281811e, this.f281812f, null);
        this.f281810d = 2;
        if (kotlinx.coroutines.l.g(g3Var, tVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
