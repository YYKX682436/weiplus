package y;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.l2 f458379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f458380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z.l2 l2Var, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458379e = l2Var;
        this.f458380f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y.k(this.f458379e, this.f458380f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458378d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j f17 = n0.s4.f(new y.i(this.f458379e));
            y.j jVar = new y.j(this.f458380f);
            this.f458378d = 1;
            if (((kotlinx.coroutines.flow.b) f17).a(jVar, this) == aVar) {
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
