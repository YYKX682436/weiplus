package m0;

/* loaded from: classes13.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.r f322486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(m0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322486e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m0.m(this.f322486e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322485d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f322486e.f322502h;
            java.lang.Float f17 = new java.lang.Float(1.0f);
            z.v2 d17 = z.q.d(225, 0, z.j0.f468704a, 2, null);
            this.f322485d = 1;
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
