package ky;

/* loaded from: classes13.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.e f313377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z.e eVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313377e = eVar;
        this.f313378f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ky.k(this.f313377e, this.f313378f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ky.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f313376d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f313377e;
            java.lang.Float f17 = new java.lang.Float(1.0f);
            z.h0 h0Var = z.j0.f468704a;
            z.v2 d17 = z.q.d(this.f313378f, 0, z.i0.f468696a, 2, null);
            this.f313376d = 1;
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
