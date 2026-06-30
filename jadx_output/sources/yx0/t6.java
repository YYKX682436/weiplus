package yx0;

/* loaded from: classes5.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nx0.i2 f467663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(yx0.b8 b8Var, pp0.p0 p0Var, nx0.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467661e = b8Var;
        this.f467662f = p0Var;
        this.f467663g = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.t6(this.f467661e, this.f467662f, this.f467663g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.t6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467660d;
        yx0.b8 b8Var = this.f467661e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f467660d = 1;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            if (b8Var.D(this.f467662f, this.f467663g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yx0.v vVar = yx0.v.f467695f;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = yx0.b8.f467171c2;
        b8Var.q0(vVar);
        return jz5.f0.f302826a;
    }
}
