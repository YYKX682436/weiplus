package yx0;

/* loaded from: classes5.dex */
public final class y6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(yx0.b8 b8Var, pp0.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467791e = b8Var;
        this.f467792f = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.y6(this.f467791e, this.f467792f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.y6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467790d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yx0.n nVar = yx0.n.f467464f;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            yx0.b8 b8Var = this.f467791e;
            b8Var.g0(nVar);
            b8Var.f467188p0 = nVar;
            this.f467790d = 1;
            obj = this.f467792f.x0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> clearMakeup error");
        }
        return jz5.f0.f302826a;
    }
}
