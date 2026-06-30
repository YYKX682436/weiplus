package k0;

/* loaded from: classes14.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.e f302895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f302896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(z.e eVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302895e = eVar;
        this.f302896f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k0.e0(this.f302895e, this.f302896f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f302894d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f302895e;
            d1.e eVar2 = new d1.e(this.f302896f);
            z.p1 p1Var = k0.h0.f302923d;
            this.f302894d = 1;
            if (z.e.c(eVar, eVar2, p1Var, null, null, this, 12, null) == aVar) {
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
