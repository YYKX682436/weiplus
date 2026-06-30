package i55;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f288850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i55.h f288851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i55.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f288851e = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i55.g(this.f288851e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i55.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f288850d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f288850d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        i55.b.d(this.f288851e, "ScrollIdle", java.lang.System.currentTimeMillis(), null, false, 12, null);
        return jz5.f0.f302826a;
    }
}
