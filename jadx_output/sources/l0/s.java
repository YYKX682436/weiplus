package l0;

/* loaded from: classes14.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.n f314504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f314505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c0.n nVar, x0.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314504e = nVar;
        this.f314505f = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l0.s(this.f314504e, this.f314505f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f314503d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = ((c0.p) this.f314504e).f36941a;
            l0.r rVar = new l0.r(this.f314505f);
            this.f314503d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, rVar, this) == aVar) {
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
