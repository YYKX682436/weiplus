package hr5;

/* loaded from: classes11.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f284344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(hr5.a1 a1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284345e = a1Var;
        this.f284346f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr5.g0(this.f284345e, this.f284346f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284344d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f284344d = 1;
            if (this.f284345e.g(this.f284346f, this) == aVar) {
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
