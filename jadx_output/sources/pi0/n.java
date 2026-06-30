package pi0;

/* loaded from: classes11.dex */
public final class n extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f354674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f354676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pi0.q qVar, pi0.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f354675e = qVar;
        this.f354676f = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new pi0.n(this.f354675e, this.f354676f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((pi0.n) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354674d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            pi0.m mVar = new pi0.m(this.f354675e, this.f354676f, null);
            this.f354674d = 1;
            if (kotlinx.coroutines.l.g(g3Var, mVar, this) == aVar) {
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
