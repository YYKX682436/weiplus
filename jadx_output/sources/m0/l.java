package m0;

/* loaded from: classes13.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.r f322484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322484e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m0.l(this.f322484e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322483d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f322484e.f322501g;
            java.lang.Float f17 = new java.lang.Float(1.0f);
            z.h0 h0Var = z.j0.f468704a;
            z.v2 d17 = z.q.d(75, 0, z.i0.f468696a, 2, null);
            this.f322483d = 1;
            if (z.e.c(eVar, f17, d17, null, null, this, 12, null) == aVar) {
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
