package ut;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f430744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f430745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlinx.coroutines.flow.n2 n2Var, kotlinx.coroutines.flow.n2 n2Var2, ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430744e = n2Var;
        this.f430745f = n2Var2;
        this.f430746g = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut.t(this.f430744e, this.f430745f, this.f430746g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430743d;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            throw new jz5.d();
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ut.q0 q0Var = this.f430746g;
        kotlinx.coroutines.flow.n2 n2Var = this.f430744e;
        if (n2Var != null) {
            ut.r rVar = new ut.r(q0Var);
            this.f430743d = 1;
            if (n2Var.a(rVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        kotlinx.coroutines.flow.n2 n2Var2 = this.f430745f;
        if (n2Var2 == null) {
            return jz5.f0.f302826a;
        }
        ut.s sVar = new ut.s(q0Var);
        this.f430743d = 2;
        if (n2Var2.a(sVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
