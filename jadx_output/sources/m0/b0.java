package m0;

/* loaded from: classes13.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.d0 f322440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f322441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.p f322442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(m0.d0 d0Var, float f17, z.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322440e = d0Var;
        this.f322441f = f17;
        this.f322442g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m0.b0(this.f322440e, this.f322441f, this.f322442g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322439d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f322440e.f322457c;
            java.lang.Float f17 = new java.lang.Float(this.f322441f);
            z.p pVar = this.f322442g;
            this.f322439d = 1;
            if (z.e.c(eVar, f17, pVar, null, null, this, 12, null) == aVar) {
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
