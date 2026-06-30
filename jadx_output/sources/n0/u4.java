package n0;

/* loaded from: classes14.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333717d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f333719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f333720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(yz5.p pVar, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333719f = pVar;
        this.f333720g = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n0.u4 u4Var = new n0.u4(this.f333719f, this.f333720g, continuation);
        u4Var.f333718e = obj;
        return u4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.u4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333717d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n0.g3 g3Var = new n0.g3(this.f333720g, ((kotlinx.coroutines.y0) this.f333718e).getF11582e());
            this.f333717d = 1;
            if (this.f333719f.invoke(g3Var, this) == aVar) {
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
