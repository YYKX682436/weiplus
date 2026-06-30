package yx0;

/* loaded from: classes5.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(yx0.b8 b8Var, pp0.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467482e = b8Var;
        this.f467483f = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.n6(this.f467482e, this.f467483f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467481d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yx0.n nVar = yx0.n.f467465g;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            yx0.b8 b8Var = this.f467482e;
            b8Var.g0(nVar);
            b8Var.f467188p0 = nVar;
            this.f467481d = 1;
            obj = this.f467483f.x0(this);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchFaceEffect >> clearFaceEffect error");
        }
        return jz5.f0.f302826a;
    }
}
