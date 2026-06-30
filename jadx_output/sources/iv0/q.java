package iv0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mv0.a f295083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iv0.c f295084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(iv0.w wVar, mv0.a aVar, iv0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295082e = wVar;
        this.f295083f = aVar;
        this.f295084g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iv0.q(this.f295082e, this.f295083f, this.f295084g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iv0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f295081d;
        iv0.w wVar = this.f295082e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            iv0.w.l7(wVar).setScaleX(0.0f);
            iv0.w.l7(wVar).setScaleY(0.0f);
            wVar.A++;
            gx0.bf n76 = wVar.n7();
            this.f295081d = 1;
            if (n76.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        iv0.w.l7(wVar).post(new iv0.p(wVar, this.f295083f, this.f295084g));
        return jz5.f0.f302826a;
    }
}
