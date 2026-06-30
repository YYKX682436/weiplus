package yx0;

/* loaded from: classes5.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nx0.w f467287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(yx0.b8 b8Var, pp0.p0 p0Var, nx0.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467285e = b8Var;
        this.f467286f = p0Var;
        this.f467287g = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.e6(this.f467285e, this.f467286f, this.f467287g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.e6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467284d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f467284d = 1;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            if (this.f467285e.B(this.f467286f, this.f467287g, this) == aVar) {
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
