package yx0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467648e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.t0(this.f467648e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467647d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ux0.d dVar = this.f467648e.f467183l1;
            if (dVar != null) {
                dVar.onPause();
            }
            pp0.p0 p0Var = this.f467648e.K;
            if (p0Var != null) {
                this.f467647d = 1;
                obj = pp0.p0.w(p0Var, false, this, 1, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            yx0.b8 b8Var = this.f467648e;
            yx0.v vVar = yx0.v.f467697h;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            b8Var.q0(vVar);
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.b8 b8Var2 = this.f467648e;
        yx0.v vVar2 = yx0.v.f467697h;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = yx0.b8.f467171c2;
        b8Var2.q0(vVar2);
        return jz5.f0.f302826a;
    }
}
