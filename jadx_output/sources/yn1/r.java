package yn1;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.s f463807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yn1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463807e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.r(this.f463807e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463806d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f463806d = 1;
            if (yn1.s.wi(this.f463807e, this) == aVar) {
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
