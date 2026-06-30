package r2;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f368724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r2.o f368725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f368726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r2.o oVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f368725e = oVar;
        this.f368726f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new r2.k(this.f368725e, this.f368726f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((r2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f368724d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            o1.e eVar = this.f368725e.f368731d;
            this.f368724d = 1;
            if (eVar.c(this.f368726f, this) == aVar) {
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
