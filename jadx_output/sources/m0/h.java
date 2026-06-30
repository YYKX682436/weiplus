package m0;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322468d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.n f322470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0.w f322471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c0.n nVar, m0.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322470f = nVar;
        this.f322471g = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        m0.h hVar = new m0.h(this.f322470f, this.f322471g, continuation);
        hVar.f322469e = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322468d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f322469e;
            kotlinx.coroutines.flow.i2 i2Var = ((c0.p) this.f322470f).f36941a;
            m0.g gVar = new m0.g(this.f322471g, y0Var);
            this.f322468d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, gVar, this) == aVar) {
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
